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

package org.apache.dolphinscheduler.common.shell;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

class ShellExecutorTest {

    @Test
    void execCommandReturnsOutput() throws Exception {
        String output = ShellExecutor.execCommand("sh", "-c", "echo hello");
        assertTrue(output.contains("hello"));
    }

    @Test
    void execCommandWithEnv() throws Exception {
        Map<String, String> env = Collections.singletonMap("FOO", "bar");
        String output = ShellExecutor.execCommand(env, "sh", "-c", "echo $FOO");
        assertTrue(output.contains("bar"));
    }

    @Test
    void toStringQuotesArgsWithSpaces() {
        ShellExecutor executor = new ShellExecutor(new String[]{"echo", "a b"});
        assertTrue(executor.toString().contains("\"a b\""));
    }

    @Test
    void intervalPreventsImmediateReexecution() throws Exception {
        CountingShell shell = new CountingShell(60_000L, "sh", "-c", "echo ok");
        shell.execute();
        shell.execute();
        assertEquals(1, shell.getRunCount());
    }

    @Test
    void nonZeroExitThrows() {
        CountingShell shell = new CountingShell(0L, "sh", "-c", "exit 1");
        AbstractShell.ExitCodeException ex =
                assertThrows(AbstractShell.ExitCodeException.class, shell::execute);
        assertEquals(1, ex.getExitCode());
    }

    @Test
    void processContainerTracksProcesses() throws Exception {
        Process process = new ProcessBuilder("sh", "-c", "sleep 1").start();
        AbstractShell.ProcessContainer.putProcess(process);
        assertNotEquals(0, AbstractShell.ProcessContainer.processSize());
        AbstractShell.ProcessContainer.removeProcess(process);
        process.destroy();
    }

    private static class CountingShell extends AbstractShell {

        private final String[] command;
        private final AtomicInteger runCount = new AtomicInteger();

        CountingShell(long interval, String... command) {
            super(interval);
            this.command = command;
        }

        void execute() throws IOException {
            run();
        }

        int getRunCount() {
            return runCount.get();
        }

        @Override
        protected String[] getExecString() {
            return command;
        }

        @Override
        protected void parseExecResult(BufferedReader lines) throws IOException {
            runCount.incrementAndGet();
            while (lines.readLine() != null) {
                // drain
            }
        }
    }
}
