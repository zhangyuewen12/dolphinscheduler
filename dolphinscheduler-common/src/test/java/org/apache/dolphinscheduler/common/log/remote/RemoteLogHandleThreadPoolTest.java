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

package org.apache.dolphinscheduler.common.log.remote;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.dolphinscheduler.common.constants.Constants;

import java.util.concurrent.Executor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

class RemoteLogHandleThreadPoolTest {

    @AfterEach
    void cleanup() {
        System.clearProperty(Constants.REMOTE_LOGGING_THREAD_POOL_SIZE);
    }

    @Test
    void remoteLogHandleExecutor_usesProperty() {
        System.setProperty(Constants.REMOTE_LOGGING_THREAD_POOL_SIZE, "3");

        RemoteLogHandleThreadPool pool = new RemoteLogHandleThreadPool();
        Executor executor = pool.remoteLogHandleExecutor();

        assertTrue(executor instanceof ThreadPoolTaskExecutor);
        ThreadPoolTaskExecutor taskExecutor = (ThreadPoolTaskExecutor) executor;
        assertEquals(3, taskExecutor.getCorePoolSize());
        assertEquals(3, taskExecutor.getMaxPoolSize());
    }
}
