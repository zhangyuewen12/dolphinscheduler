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

package org.apache.dolphinscheduler.flink.monitor.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class SlotServiceTest {

    @Test
    void getCurrentSlotShouldUseSortedAliveInstanceList() {
        MonitorInstanceService monitorInstanceService = mock(MonitorInstanceService.class);
        when(monitorInstanceService.getInstanceId()).thenReturn("instance-b");
        when(monitorInstanceService.queryAliveInstanceIds()).thenReturn(Arrays.asList("instance-c", "instance-b",
                "instance-a"));

        Optional<Slot> slot = new SlotService(monitorInstanceService).getCurrentSlot();

        assertTrue(slot.isPresent());
        assertEquals(1, slot.get().getCurrentSlotIndex());
        assertEquals(3, slot.get().getTotalSlot());
    }

    @Test
    void getCurrentSlotShouldReturnEmptyWhenCurrentInstanceIsNotAlive() {
        MonitorInstanceService monitorInstanceService = mock(MonitorInstanceService.class);
        when(monitorInstanceService.getInstanceId()).thenReturn("instance-d");
        when(monitorInstanceService.queryAliveInstanceIds()).thenReturn(Arrays.asList("instance-a", "instance-b"));

        Optional<Slot> slot = new SlotService(monitorInstanceService).getCurrentSlot();

        assertFalse(slot.isPresent());
    }
}
