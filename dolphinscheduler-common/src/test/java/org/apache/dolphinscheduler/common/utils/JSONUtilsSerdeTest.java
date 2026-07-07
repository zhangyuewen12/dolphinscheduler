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

import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

class JSONUtilsSerdeTest {

    @Test
    void jsonDataSerializer_writesRawJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        JsonGenerator generator = mapper.getFactory().createGenerator(writer);

        new JSONUtils.JsonDataSerializer().serialize("{\"a\":1}", generator, null);
        generator.close();

        assertEquals("{\"a\":1}", writer.toString());
    }

    @Test
    void jsonDataDeserializer_readsTextOrJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        JsonParser textParser = mapper.getFactory().createParser("\"hello\"");
        textParser.nextToken();
        String text = new JSONUtils.JsonDataDeserializer().deserialize(textParser, mapper.getDeserializationContext());
        assertEquals("hello", text);

        JsonParser objectParser = mapper.getFactory().createParser("{\"k\":\"v\"}");
        objectParser.nextToken();
        String json =
                new JSONUtils.JsonDataDeserializer().deserialize(objectParser, mapper.getDeserializationContext());
        assertEquals("{\"k\":\"v\"}", json);
    }
}
