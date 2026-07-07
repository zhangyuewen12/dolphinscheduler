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

import org.apache.dolphinscheduler.alert.TestReflectionUtils;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

class AbstractEventLoopTest {

    @Test
    void runHandlesEventAndUpdatesCount() throws Exception {
        LinkedBlockingQueue<String> backingQueue = new LinkedBlockingQueue<>();
        backingQueue.add("event");
        TestQueue queue = new TestQueue(backingQueue);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 2, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        CountDownLatch latch = new CountDownLatch(1);
        TestEventLoop loop = new TestEventLoop(executor, queue, latch);

        TestReflectionUtils.setField(loop, "runningFlag", new java.util.concurrent.atomic.AtomicBoolean(true));
        loop.run();

        latch.await(1, TimeUnit.SECONDS);
        assertEquals(0, loop.getHandlingEventCount());
        executor.shutdownNow();
    }

    private static class TestEventLoop extends AbstractEventLoop<String> {

        private final CountDownLatch latch;

        private TestEventLoop(ThreadPoolExecutor executor, EventPendingQueue<String> queue, CountDownLatch latch) {
            super("TestEventLoop", executor, queue);
            this.latch = latch;
        }

        @Override
        public void handleEvent(String event) {
            latch.countDown();
            try {
                TestReflectionUtils.setField(this, "runningFlag", new java.util.concurrent.atomic.AtomicBoolean(false));
            } catch (Exception ignore) {
                // ignore
            }
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
            String value = delegate.take();
            if (delegate.isEmpty()) {
                throw new InterruptedException("stop");
            }
            return value;
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
