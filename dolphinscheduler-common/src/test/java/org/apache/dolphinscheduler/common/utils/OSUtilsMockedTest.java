/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.common.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

import org.apache.dolphinscheduler.common.constants.Constants;

import java.lang.reflect.Method;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class OSUtilsMockedTest {

    @Test
    void getSudoCmd_respectsToggle() {
        try (MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class)) {
            propertyUtils.when(() -> PropertyUtils.getBoolean(Constants.SUDO_ENABLE, true)).thenReturn(false);
            assertEquals("cmd", OSUtils.getSudoCmd("tenant", "cmd"));

            propertyUtils.when(() -> PropertyUtils.getBoolean(Constants.SUDO_ENABLE, true)).thenReturn(true);
            assertEquals("sudo -u tenant -i cmd", OSUtils.getSudoCmd("tenant", "cmd"));
        }
    }

    @Test
    void exeCmd_delegatesToShellExecutor() throws Exception {
        try (MockedStatic<OSUtils> osUtils = Mockito.mockStatic(OSUtils.class, Mockito.CALLS_REAL_METHODS)) {
            osUtils.when(() -> OSUtils.exeShell(any(String[].class))).thenReturn("ok");

            String result = OSUtils.exeCmd("echo ok");

            assertEquals("ok", result);
        }
    }

    @Test
    void existTenantCodeInLinux_usesExeCmd() {
        try (MockedStatic<OSUtils> osUtils = Mockito.mockStatic(OSUtils.class, Mockito.CALLS_REAL_METHODS)) {
            osUtils.when(() -> OSUtils.exeCmd("id test"))
                    .thenReturn("uid=1000(test) gid=1000(test)");

            assertTrue(OSUtils.existTenantCodeInLinux("test"));

            osUtils.when(() -> OSUtils.exeCmd("id missing")).thenReturn("");
            assertFalse(OSUtils.existTenantCodeInLinux("missing"));

            osUtils.when(() -> OSUtils.exeCmd("id error")).thenThrow(new RuntimeException("fail"));
            assertFalse(OSUtils.existTenantCodeInLinux("error"));
        }
    }

    @Test
    void getGroup_fromNonWindowsUsesGroupsCommand() throws Exception {
        try (MockedStatic<OSUtils> osUtils = Mockito.mockStatic(OSUtils.class, Mockito.CALLS_REAL_METHODS)) {
            osUtils.when(() -> OSUtils.exeCmd("groups")).thenReturn("staff admin");

            assertEquals("staff", OSUtils.getGroup());
        }
    }

    @Test
    void privateUserHelpersUseExeCmd() throws Exception {
        try (MockedStatic<OSUtils> osUtils = Mockito.mockStatic(OSUtils.class, Mockito.CALLS_REAL_METHODS)) {
            osUtils.when(() -> OSUtils.exeCmd(Mockito.anyString())).thenReturn("");

            Method macList = OSUtils.class.getDeclaredMethod("getUserListFromMac");
            macList.setAccessible(true);
            osUtils.when(() -> OSUtils.exeCmd("dscl . list /users"))
                    .thenReturn("user1\nuser2");
            @SuppressWarnings("unchecked")
            List<String> macUsers = (List<String>) macList.invoke(null);
            assertEquals(java.util.Arrays.asList("user1", "user2"), macUsers);

            Method windowsList = OSUtils.class.getDeclaredMethod("getUserListFromWindows");
            windowsList.setAccessible(true);
            String output = "-----\nusera userb\n\nThe command completed successfully.";
            osUtils.when(() -> OSUtils.exeCmd("net user")).thenReturn(output);
            @SuppressWarnings("unchecked")
            List<String> windowsUsers = (List<String>) windowsList.invoke(null);
            assertTrue(windowsUsers.contains("usera"));
        }
    }

    @Test
    void createUserHelpersInvokeCommands() throws Exception {
        try (MockedStatic<OSUtils> osUtils = Mockito.mockStatic(OSUtils.class, Mockito.CALLS_REAL_METHODS)) {
            osUtils.when(() -> OSUtils.exeShell(any(String[].class))).thenReturn("");

            Method linuxCreate = OSUtils.class.getDeclaredMethod("createLinuxUser", String.class, String.class);
            linuxCreate.setAccessible(true);
            linuxCreate.invoke(null, "userA", "groupA");

            Method macCreate = OSUtils.class.getDeclaredMethod("createMacUser", String.class, String.class);
            macCreate.setAccessible(true);
            macCreate.invoke(null, "userB", "groupB");

            Method windowsCreate = OSUtils.class.getDeclaredMethod("createWindowsUser", String.class, String.class);
            windowsCreate.setAccessible(true);
            windowsCreate.invoke(null, "userC", "groupC");

            osUtils.verify(() -> OSUtils.exeShell(any(String[].class)), times(5));
        }
    }

    @Test
    void createUserIfAbsentAndCreateUserErrorHandling() {
        try (MockedStatic<OSUtils> osUtils = Mockito.mockStatic(OSUtils.class, Mockito.CALLS_REAL_METHODS)) {
            osUtils.when(OSUtils::getUserList).thenReturn(java.util.Arrays.asList("existing"));
            OSUtils.createUserIfAbsent("existing");
            osUtils.verify(() -> OSUtils.createUser("existing"), times(0));

            osUtils.when(OSUtils::getGroup).thenReturn("");
            assertThrows(RuntimeException.class, () -> OSUtils.createUser("newUser"));
        }
    }

    @Test
    void linuxUserListParserReadsPasswd() throws Exception {
        Method linuxList = OSUtils.class.getDeclaredMethod("getUserListFromLinux");
        linuxList.setAccessible(true);
        @SuppressWarnings("unchecked")
        List<String> users = (List<String>) linuxList.invoke(null);
        assertFalse(users.isEmpty());
    }
}
