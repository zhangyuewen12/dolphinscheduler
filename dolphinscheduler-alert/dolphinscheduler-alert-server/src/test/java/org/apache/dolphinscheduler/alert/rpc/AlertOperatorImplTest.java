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

package org.apache.dolphinscheduler.alert.rpc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.alert.TestReflectionUtils;
import org.apache.dolphinscheduler.alert.service.AlertSender;
import org.apache.dolphinscheduler.extract.alert.request.AlertSendRequest;
import org.apache.dolphinscheduler.extract.alert.request.AlertSendResponse;
import org.apache.dolphinscheduler.extract.alert.request.AlertTestSendRequest;

import org.junit.jupiter.api.Test;

class AlertOperatorImplTest {

    @Test
    void sendAlertDelegatesToSender() throws Exception {
        AlertSender sender = mock(AlertSender.class);
        AlertSendResponse response = new AlertSendResponse(true, java.util.Collections.emptyList());
        when(sender.syncHandler(1, "t", "c")).thenReturn(response);

        AlertOperatorImpl operator = new AlertOperatorImpl();
        TestReflectionUtils.setField(operator, "alertSender", sender);

        AlertSendRequest request = new AlertSendRequest(1, "t", "c", 0);
        AlertSendResponse result = operator.sendAlert(request);
        assertEquals(response, result);
    }

    @Test
    void sendTestAlertDelegatesToSender() throws Exception {
        AlertSender sender = mock(AlertSender.class);
        AlertSendResponse response = new AlertSendResponse(true, java.util.Collections.emptyList());
        when(sender.syncTestSend(2, "{}")).thenReturn(response);

        AlertOperatorImpl operator = new AlertOperatorImpl();
        TestReflectionUtils.setField(operator, "alertSender", sender);

        AlertTestSendRequest request = new AlertTestSendRequest(2, "{}");
        AlertSendResponse result = operator.sendTestAlert(request);
        assertEquals(response, result);
    }
}
