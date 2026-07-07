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

package org.apache.dolphinscheduler.common.lifecycle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class ServerLifeCycleManagerTest {

    @AfterEach
    void reset() {
        ServerLifeCycleManager.toRunning();
    }

    @Test
    void transitionsBetweenRunningWaitingAndStopped() throws Exception {
        assertTrue(ServerLifeCycleManager.isRunning());

        ServerLifeCycleManager.toWaiting();
        assertFalse(ServerLifeCycleManager.isRunning());
        assertFalse(ServerLifeCycleManager.isStopped());

        ServerLifeCycleManager.recoverFromWaiting();
        assertTrue(ServerLifeCycleManager.isRunning());

        assertTrue(ServerLifeCycleManager.toStopped());
        assertFalse(ServerLifeCycleManager.toStopped());
        assertTrue(ServerLifeCycleManager.isStopped());
    }

    @Test
    void toWaitingAfterStoppedThrows() {
        ServerLifeCycleManager.toStopped();
        assertThrows(ServerLifeCycleException.class, ServerLifeCycleManager::toWaiting);
    }

    @Test
    void recoverFromRunningIsNoOpAndStoppedThrows() throws Exception {
        ServerLifeCycleManager.toRunning();
        ServerLifeCycleManager.recoverFromWaiting();
        assertTrue(ServerLifeCycleManager.isRunning());
        assertNotNull(ServerLifeCycleManager.getServerStatus());

        ServerLifeCycleManager.toStopped();
        assertThrows(ServerLifeCycleException.class, ServerLifeCycleManager::recoverFromWaiting);
    }
}
