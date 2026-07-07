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

package org.apache.dolphinscheduler.service.command;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.common.constants.CommandKeyConstants;
import org.apache.dolphinscheduler.common.constants.Constants;
import org.apache.dolphinscheduler.common.enums.CommandType;
import org.apache.dolphinscheduler.common.utils.JSONUtils;
import org.apache.dolphinscheduler.dao.entity.Command;
import org.apache.dolphinscheduler.dao.entity.ErrorCommand;
import org.apache.dolphinscheduler.dao.entity.Schedule;
import org.apache.dolphinscheduler.dao.mapper.CommandMapper;
import org.apache.dolphinscheduler.dao.mapper.ErrorCommandMapper;
import org.apache.dolphinscheduler.dao.mapper.ScheduleMapper;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class CommandServiceImplUnitTest {

    @Test
    void moveToErrorCommand_insertsAndDeletes() throws Exception {
        CommandServiceImpl service = new CommandServiceImpl();
        ErrorCommandMapper errorMapper = mock(ErrorCommandMapper.class);
        CommandMapper commandMapper = mock(CommandMapper.class);

        setField(service, "errorCommandMapper", errorMapper);
        setField(service, "commandMapper", commandMapper);

        Command command = new Command();
        command.setId(11);
        service.moveToErrorCommand(command, "boom");

        verify(errorMapper).insert(any(ErrorCommand.class));
        verify(commandMapper).deleteById(11);
    }

    @Test
    void createCommand_enrichesTimezoneAndInserts() throws Exception {
        CommandServiceImpl service = new CommandServiceImpl();
        CommandMapper commandMapper = mock(CommandMapper.class);
        ScheduleMapper scheduleMapper = mock(ScheduleMapper.class);

        setField(service, "commandMapper", commandMapper);
        setField(service, "scheduleMapper", scheduleMapper);

        Schedule schedule = new Schedule();
        schedule.setTimezoneId("UTC");
        when(scheduleMapper.queryByWorkflowDefinitionCode(100L)).thenReturn(schedule);
        when(commandMapper.insert(any(Command.class))).thenReturn(1);

        Command command = new Command();
        command.setId(55);
        command.setWorkflowDefinitionCode(100L);
        command.setCommandParam(JSONUtils.toJsonString(Collections.singletonMap("k", "v")));

        int result = service.createCommand(command);

        assertEquals(1, result);
        Map<String, String> params = JSONUtils.toMap(command.getCommandParam());
        assertEquals("UTC", params.get(Constants.SCHEDULE_TIMEZONE));
    }

    @Test
    void createCommand_handlesNullCommand() throws Exception {
        CommandServiceImpl service = new CommandServiceImpl();
        setField(service, "commandMapper", mock(CommandMapper.class));
        setField(service, "scheduleMapper", mock(ScheduleMapper.class));

        assertEquals(0, service.createCommand(null));
    }

    @Test
    void verifyIsNeedCreateCommand_falseWhenSameRecoverIdExists() throws Exception {
        CommandServiceImpl service = new CommandServiceImpl();
        CommandMapper commandMapper = mock(CommandMapper.class);
        setField(service, "commandMapper", commandMapper);

        Command incoming = new Command();
        incoming.setCommandType(CommandType.REPEAT_RUNNING);
        Map<String, Object> cmdParams = new HashMap<>();
        cmdParams.put(CommandKeyConstants.CMD_PARAM_RECOVER_WORKFLOW_ID_STRING, 10);
        incoming.setCommandParam(JSONUtils.toJsonString(cmdParams));

        Command existing = new Command();
        existing.setCommandType(CommandType.REPEAT_RUNNING);
        existing.setCommandParam(JSONUtils.toJsonString(cmdParams));
        when(commandMapper.selectList(eq(null))).thenReturn(Collections.singletonList(existing));

        assertFalse(service.verifyIsNeedCreateCommand(incoming));
    }

    @Test
    void verifyIsNeedCreateCommand_trueWhenNoMatch() throws Exception {
        CommandServiceImpl service = new CommandServiceImpl();
        CommandMapper commandMapper = mock(CommandMapper.class);
        setField(service, "commandMapper", commandMapper);

        Command incoming = new Command();
        incoming.setCommandType(CommandType.START_FAILURE_TASK_PROCESS);
        Map<String, Object> cmdParams = new HashMap<>();
        cmdParams.put(CommandKeyConstants.CMD_PARAM_RECOVER_WORKFLOW_ID_STRING, 20);
        incoming.setCommandParam(JSONUtils.toJsonString(cmdParams));

        Command existing = new Command();
        existing.setCommandType(CommandType.REPEAT_RUNNING);
        Map<String, Object> otherParams = new HashMap<>();
        otherParams.put(CommandKeyConstants.CMD_PARAM_RECOVER_WORKFLOW_ID_STRING, 10);
        existing.setCommandParam(JSONUtils.toJsonString(otherParams));
        when(commandMapper.selectList(eq(null))).thenReturn(Collections.singletonList(existing));

        assertTrue(service.verifyIsNeedCreateCommand(incoming));
    }

    private static void setField(Object target, String name, Object value) throws Exception {
        Field field = target.getClass().getDeclaredField(name);
        field.setAccessible(true);
        field.set(target, value);
    }
}
