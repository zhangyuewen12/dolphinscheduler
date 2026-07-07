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

package org.apache.dolphinscheduler.common.thread;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BaseDaemonThreadTest {

    @Test
    void createsDaemonThreadWithHandler() {
        BaseDaemonThread thread = new BaseDaemonThread("test-daemon") {

            @Override
            public void run() {
                // no-op
            }
        };

        assertTrue(thread.isDaemon());
        assertEquals("test-daemon", thread.getName());
        assertSame(DefaultUncaughtExceptionHandler.getInstance(), thread.getUncaughtExceptionHandler());
    }

    @Test
    void createsDaemonThreadFromRunnable() {
        BaseDaemonThread thread = new BaseDaemonThread(() -> {
        }) {
        };

        assertTrue(thread.isDaemon());
        assertSame(DefaultUncaughtExceptionHandler.getInstance(), thread.getUncaughtExceptionHandler());
    }
}
