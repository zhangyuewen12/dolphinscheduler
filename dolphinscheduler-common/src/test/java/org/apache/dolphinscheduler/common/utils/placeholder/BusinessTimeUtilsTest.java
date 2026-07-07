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

package org.apache.dolphinscheduler.common.utils.placeholder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.dolphinscheduler.common.constants.DateConstants;
import org.apache.dolphinscheduler.common.enums.CommandType;

import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.Map;

import org.junit.jupiter.api.Test;

class BusinessTimeUtilsTest {

    @Test
    void getBusinessTime_returnsEmptyForComplementDataWithoutRunTime() {
        Map<String, String> result = BusinessTimeUtils.getBusinessTime(CommandType.COMPLEMENT_DATA, null, "UTC");
        assertTrue(result.isEmpty());
    }

    @Test
    void getBusinessTime_usesRunTimeWhenProvided() {
        Date runTime = new Date(0L);
        Map<String, String> result = BusinessTimeUtils.getBusinessTime(CommandType.START_PROCESS, runTime, "UTC");
        assertEquals("19691231", result.get(DateConstants.PARAMETER_BUSINESS_DATE));
        assertEquals("19700101", result.get(DateConstants.PARAMETER_CURRENT_DATE));
        assertTrue(result.get(DateConstants.PARAMETER_DATETIME).startsWith("19700101"));
    }

    @Test
    void getBusinessTime_complementDataUsesRunTime() {
        Date runTime = new Date(24L * 60L * 60L * 1000L);
        Map<String, String> result = BusinessTimeUtils.getBusinessTime(CommandType.COMPLEMENT_DATA, runTime, "UTC");
        assertEquals("19700101", result.get(DateConstants.PARAMETER_BUSINESS_DATE));
        assertEquals("19700102", result.get(DateConstants.PARAMETER_CURRENT_DATE));
        assertTrue(result.get(DateConstants.PARAMETER_DATETIME).startsWith("19700102"));
    }

    @Test
    void getBusinessTime_startCurrentTaskProcessUsesRunTime() {
        Date runTime = new Date(24L * 60L * 60L * 1000L);
        Map<String, String> result =
                BusinessTimeUtils.getBusinessTime(CommandType.START_CURRENT_TASK_PROCESS, runTime, "UTC");
        assertEquals("19700101", result.get(DateConstants.PARAMETER_BUSINESS_DATE));
        assertEquals("19700102", result.get(DateConstants.PARAMETER_CURRENT_DATE));
    }

    @Test
    void getBusinessTime_withNullRunTimeReturnsFormattedValues() {
        Map<String, String> result = BusinessTimeUtils.getBusinessTime(CommandType.SCHEDULER, null, "UTC");
        assertNotNull(result.get(DateConstants.PARAMETER_BUSINESS_DATE));
        assertNotNull(result.get(DateConstants.PARAMETER_CURRENT_DATE));
        assertNotNull(result.get(DateConstants.PARAMETER_DATETIME));
        assertTrue(result.get(DateConstants.PARAMETER_BUSINESS_DATE).length() >= 8);
        assertTrue(result.get(DateConstants.PARAMETER_CURRENT_DATE).length() >= 8);
        assertTrue(result.get(DateConstants.PARAMETER_DATETIME).length() >= 8);
    }

    @Test
    void constructorThrows() throws Exception {
        Constructor<BusinessTimeUtils> constructor = BusinessTimeUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        assertThrows(IllegalStateException.class, constructor::newInstance);
    }
}
