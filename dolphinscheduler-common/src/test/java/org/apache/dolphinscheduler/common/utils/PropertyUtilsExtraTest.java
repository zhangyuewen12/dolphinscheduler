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

package org.apache.dolphinscheduler.common.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class PropertyUtilsExtraTest {

    @AfterEach
    void cleanup() {
        System.clearProperty("ds.test.value");
        System.clearProperty("ds.test.int");
        System.clearProperty("ds.test.bool");
        System.clearProperty("ds.test.long");
        System.clearProperty("ds.test.double");
        System.clearProperty("ds.test.set");
    }

    @Test
    void getUpperCaseString_readsFromJvm() {
        System.setProperty("ds.test.value", "abc");
        assertEquals("ABC", PropertyUtils.getUpperCaseString("ds.test.value"));
    }

    @Test
    void getPrimitiveDefaultsWork() {
        assertNull(PropertyUtils.getInt("ds.test.int"));
        assertEquals(7, PropertyUtils.getInt("ds.test.int", 7));

        assertNull(PropertyUtils.getBoolean("ds.test.bool"));
        assertTrue(PropertyUtils.getBoolean("ds.test.bool", true));

        assertNull(PropertyUtils.getLong("ds.test.long"));
        assertEquals(5L, PropertyUtils.getLong("ds.test.long", 5L));

        assertNull(PropertyUtils.getDouble("ds.test.double"));
        assertEquals(1.2, PropertyUtils.getDouble("ds.test.double", 1.2));
    }

    @Test
    void getSet_readsWithDefault() {
        System.setProperty("ds.test.set", "1,2");
        Set<Integer> values = PropertyUtils.getSet("ds.test.set", value -> {
            Set<Integer> set = new java.util.HashSet<>();
            set.add(1);
            set.add(2);
            return set;
        }, java.util.Collections.singleton(9));
        Set<Integer> expected = new java.util.HashSet<>();
        expected.add(1);
        expected.add(2);
        assertEquals(expected, values);
    }
}
