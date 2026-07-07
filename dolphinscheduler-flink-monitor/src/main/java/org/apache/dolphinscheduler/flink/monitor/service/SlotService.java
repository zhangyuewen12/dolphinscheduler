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

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SlotService {

    private final MonitorInstanceService monitorInstanceService;

    public SlotService(MonitorInstanceService monitorInstanceService) {
        this.monitorInstanceService = monitorInstanceService;
    }

    public Optional<Slot> getCurrentSlot() {
        List<String> aliveInstanceIds = monitorInstanceService.queryAliveInstanceIds();
        Collections.sort(aliveInstanceIds);

        String currentInstanceId = monitorInstanceService.getInstanceId();
        int currentSlotIndex = aliveInstanceIds.indexOf(currentInstanceId);
        if (currentSlotIndex < 0) {
            return Optional.empty();
        }
        return Optional.of(new Slot(currentSlotIndex, aliveInstanceIds.size()));
    }
}
