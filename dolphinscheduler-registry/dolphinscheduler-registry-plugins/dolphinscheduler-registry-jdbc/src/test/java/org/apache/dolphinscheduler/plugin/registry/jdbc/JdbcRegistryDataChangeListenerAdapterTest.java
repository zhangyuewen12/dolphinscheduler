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

package org.apache.dolphinscheduler.plugin.registry.jdbc;

import static com.google.common.truth.Truth.assertThat;

import org.apache.dolphinscheduler.registry.api.Event;
import org.apache.dolphinscheduler.registry.api.SubscribeListener;

import java.util.concurrent.atomic.AtomicReference;

import org.junit.jupiter.api.Test;

class JdbcRegistryDataChangeListenerAdapterTest {

    @Test
    void onJdbcRegistryDataDeletedShouldKeepDeletedValueInRemoveEvent() {
        String watchedPath = "/nodes/master";
        String eventPath = "/nodes/master/127.0.0.1:5678";
        String deletedValue = "{\"host\":\"127.0.0.1\",\"port\":5678}";
        AtomicReference<Event> capturedEvent = new AtomicReference<>();

        JdbcRegistryDataChangeListenerAdapter adapter =
                new JdbcRegistryDataChangeListenerAdapter(watchedPath, new SubscribeListener() {

                    @Override
                    public void notify(Event event) {
                        capturedEvent.set(event);
                    }

                    @Override
                    public SubscribeScope getSubscribeScope() {
                        return SubscribeScope.CHILDREN_ONLY;
                    }
                });

        adapter.onJdbcRegistryDataDeleted(eventPath, deletedValue);

        assertThat(capturedEvent.get()).isNotNull();
        assertThat(capturedEvent.get().getType()).isEqualTo(Event.Type.REMOVE);
        assertThat(capturedEvent.get().getEventPath()).isEqualTo(eventPath);
        assertThat(capturedEvent.get().getEventData()).isEqualTo(deletedValue);
    }
}
