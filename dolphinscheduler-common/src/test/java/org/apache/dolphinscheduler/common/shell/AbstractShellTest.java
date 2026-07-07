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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

class AbstractShellTest {

    @Test
    void run_executesCommandAndCapturesOutput() throws Exception {
        TestShell shell = new TestShell(new String[]{"sh", "-c", "echo hello"});
        shell.run();

        assertEquals(0, shell.getExitCode());
        assertEquals("hello", shell.getLastLine());
    }

    @Test
    void run_timesOutAndSetsFlag() throws Exception {
        TestShell shell = new TestShell(new String[]{"sh", "-c", "sleep 2"});
        shell.timeOutInterval = 10L;
        try {
            shell.run();
        } catch (IOException ignored) {
            // ignore timeout exit
        }

        assertTrue(isTimedOut(shell));
    }

    @Test
    void processContainer_tracksProcesses() throws Exception {
        Process process = new ProcessBuilder("sh", "-c", "sleep 1").start();
        AbstractShell.ProcessContainer.putProcess(process);
        assertTrue(AbstractShell.ProcessContainer.processSize() >= 1);

        AbstractShell.ProcessContainer.destroyAllProcess();
    }

    @Test
    void run_capturesErrorStream() {
        TestShell shell = new TestShell(new String[]{"sh", "-c", "echo err 1>&2"});
        assertThrows(AbstractShell.ExitCodeException.class, shell::run);
    }

    @Test
    void run_handlesParseExecResultException() throws Exception {
        AbstractShell shell = new AbstractShell() {

            @Override
            protected String[] getExecString() {
                return new String[]{"sh", "-c", "echo ok"};
            }

            @Override
            protected void parseExecResult(BufferedReader lines) throws IOException {
                throw new IOException("parse error");
            }
        };

        shell.run();
    }

    private boolean isTimedOut(AbstractShell shell) throws Exception {
        Field field = AbstractShell.class.getDeclaredField("timedOut");
        field.setAccessible(true);
        return ((java.util.concurrent.atomic.AtomicBoolean) field.get(shell)).get();
    }

    private static class TestShell extends AbstractShell {

        private final String[] exec;
        private String lastLine;

        private TestShell(String[] exec) {
            this.exec = exec;
        }

        @Override
        protected String[] getExecString() {
            return exec;
        }

        @Override
        protected void parseExecResult(BufferedReader lines) throws IOException {
            String line = lines.readLine();
            if (line != null) {
                lastLine = line.trim();
            }
        }

        private String getLastLine() {
            return lastLine;
        }
    }
}
