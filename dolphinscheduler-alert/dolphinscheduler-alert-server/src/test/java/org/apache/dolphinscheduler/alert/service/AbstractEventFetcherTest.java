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

package org.apache.dolphinscheduler.alert.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.alert.TestReflectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

import org.junit.jupiter.api.Test;

class AbstractEventFetcherTest {

    @Test
    void runFetchesAndQueuesEvents() throws Exception {
        AlertHAServer haServer = mock(AlertHAServer.class);
        when(haServer.isActive()).thenReturn(true);

        LinkedBlockingQueue<String> delegate = new LinkedBlockingQueue<>();
        TestQueue queue = new TestQueue(delegate);
        TestFetcher fetcher = new TestFetcher(haServer, queue);

        TestReflectionUtils.setField(fetcher, "runningFlag", new java.util.concurrent.atomic.AtomicBoolean(true));
        fetcher.run();

        assertEquals(1, queue.size());
        assertEquals("event", delegate.poll());
    }

    private static class TestFetcher extends AbstractEventFetcher<String> {

        private TestFetcher(AlertHAServer alertHAServer, EventPendingQueue<String> queue) {
            super("TestFetcher", alertHAServer, queue);
        }

        @Override
        protected int getEventOffset(String event) {
            return 1;
        }

        @Override
        public List<String> fetchPendingEvent(int eventOffset) {
            shutdown();
            return Arrays.asList("event");
        }
    }

    private static class TestQueue implements EventPendingQueue<String> {

        private final LinkedBlockingQueue<String> delegate;

        private TestQueue(LinkedBlockingQueue<String> delegate) {
            this.delegate = delegate;
        }

        @Override
        public void put(String alert) throws InterruptedException {
            delegate.put(alert);
        }

        @Override
        public String take() throws InterruptedException {
            return delegate.take();
        }

        @Override
        public int size() {
            return delegate.size();
        }

        @Override
        public int capacity() {
            return 1;
        }
    }
}
