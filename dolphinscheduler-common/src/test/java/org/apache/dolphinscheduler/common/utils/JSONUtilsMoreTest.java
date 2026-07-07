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
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.SerializationFeature;

class JSONUtilsMoreTest {

    @Test
    void parseObjectHandlesEmptyAndInvalid() {
        assertNull(JSONUtils.parseObject("", Map.class));
        assertThrows(IllegalArgumentException.class, () -> JSONUtils.parseObject("bad-json", Map.class));
        assertThrows(IllegalArgumentException.class, () -> JSONUtils.parseObject("{}", (Class<?>) null));
    }

    @Test
    void toListAndCheckJsonValidBehaveAsExpected() {
        assertTrue(JSONUtils.toList("", String.class).isEmpty());
        assertThrows(IllegalArgumentException.class, () -> JSONUtils.toList("[]", null));

        assertTrue(JSONUtils.checkJsonValid("{\"a\":1}"));
        assertTrue(!JSONUtils.checkJsonValid("bad-json", false));
    }

    @Test
    void findValueAndNodeStringAndParseArray() {
        String json = "{\"a\":1,\"b\":{\"c\":\"d\"}}";
        assertEquals("d", JSONUtils.findValue(JSONUtils.toJsonNode(JSONUtils.parseObject(json)), "c"));
        assertEquals("", JSONUtils.getNodeString(json, "missing"));
        assertEquals("1", JSONUtils.getNodeString(json, "a"));

        assertNotNull(JSONUtils.parseArray("[1,2,3]"));
        assertThrows(RuntimeException.class, () -> JSONUtils.parseArray("bad"));
    }

    @Test
    void parseTypeReferenceAndJsonBytes() {
        String json = "{\"k\":\"v\"}";
        Map<String, String> map = JSONUtils.parseObject(json, new TypeReference<Map<String, String>>() {
        });
        assertEquals("v", map.get("k"));

        assertNull(JSONUtils.toJsonByteArray(null));
        assertTrue(JSONUtils.toPrettyJsonString(map).contains("k"));
    }

    @Test
    void parseBytesAndSerializationFeature() {
        byte[] data = "{\"a\":1}".getBytes(StandardCharsets.UTF_8);
        Map<String, Object> parsed = JSONUtils.parseObject(data, Map.class);
        assertEquals(1, parsed.get("a"));

        java.util.Map<String, Integer> payload = new java.util.HashMap<>();
        payload.put("a", 1);
        String json = JSONUtils.toJsonString(payload, SerializationFeature.INDENT_OUTPUT);
        assertTrue(json.contains("a"));
    }

    @Test
    void parseObjectTextAndNullBytes() {
        assertNull(JSONUtils.parseObject("", String.class));
        assertNull(JSONUtils.parseObject((byte[]) null, Map.class));
        assertNull(JSONUtils.parseObject(""));
    }

    @Test
    void toMapAndTypeReferenceErrors() {
        Map<String, String> map = JSONUtils.toMap("{\"k\":\"v\"}");
        assertEquals("v", map.get("k"));

        assertThrows(IllegalArgumentException.class, () -> JSONUtils.parseObject("{\"k\":1}", (TypeReference<?>) null));
    }

    @Test
    void additionalJsonBranches() {
        assertTrue(!JSONUtils.checkJsonValid("bad-json", true));

        assertNotNull(JSONUtils.createArrayNode());
        assertNotNull(JSONUtils.createObjectNode());

        String textJson = "{\"t\":\"text\"}";
        assertEquals("text", JSONUtils.getNodeString(textJson, "t"));

        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        map.put("a", 1);
        assertNull(JSONUtils.findValue(JSONUtils.toJsonNode(map), "missing"));

        assertThrows(IllegalArgumentException.class, () -> JSONUtils.toList("bad", String.class));
    }
}
