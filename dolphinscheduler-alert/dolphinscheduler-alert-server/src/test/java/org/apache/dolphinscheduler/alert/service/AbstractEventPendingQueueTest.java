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

import org.junit.jupiter.api.Test;

class AbstractEventPendingQueueTest {

    @Test
    void putTakeAndCapacityWork() throws Exception {
        TestQueue queue = new TestQueue(2);
        queue.put("a");
        queue.put("b");

        assertEquals(2, queue.size());
        assertEquals(2, queue.capacity());
        assertEquals("a", queue.take());
    }

    private static class TestQueue extends AbstractEventPendingQueue<String> {

        private TestQueue(int capacity) {
            super(capacity);
        }
    }
}
