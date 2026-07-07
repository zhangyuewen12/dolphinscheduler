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
import static org.mockito.ArgumentMatchers.any;

import org.apache.dolphinscheduler.common.constants.Constants;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.security.Principal;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;

import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

class KerberosHttpClientTest {

    @Test
    void get_returnsResponseContent() {
        try (
                MockedStatic<PropertyUtils> propertyUtils = Mockito.mockStatic(PropertyUtils.class);
                MockedStatic<HttpUtils> httpUtils = Mockito.mockStatic(HttpUtils.class);
                MockedConstruction<LoginContext> loginContext =
                        Mockito.mockConstruction(LoginContext.class, (mock, context) -> {
                            Mockito.doNothing().when(mock).login();
                            Mockito.when(mock.getSubject()).thenReturn(new Subject());
                        })) {
            propertyUtils.when(() -> PropertyUtils.getString(Constants.LOGIN_USER_KEY_TAB_USERNAME))
                    .thenReturn("user@EXAMPLE.COM");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.LOGIN_USER_KEY_TAB_PATH))
                    .thenReturn("/tmp/keytab");
            propertyUtils.when(() -> PropertyUtils.getString(Constants.JAVA_SECURITY_KRB5_CONF_PATH))
                    .thenReturn("/tmp/krb5.conf");

            HttpClientBuilder builder = Mockito.mock(HttpClientBuilder.class);
            CloseableHttpClient httpClient = Mockito.mock(CloseableHttpClient.class);
            httpUtils.when(HttpUtils::getHttpClientBuilder).thenReturn(builder);
            Mockito.when(builder.setDefaultCredentialsProvider(any())).thenReturn(builder);
            Mockito.when(builder.build()).thenReturn(httpClient);
            httpUtils.when(() -> HttpUtils.getResponseContentString(any(), any())).thenReturn("ok");

            String result = KerberosHttpClient.get("http://localhost");

            assertEquals("ok", result);
        }
    }

    @Test
    void constructor_setsDebugFlags() {
        KerberosHttpClient client = new KerberosHttpClient("user", "keytab", true);

        assertEquals("true", System.getProperty("sun.security.spnego.debug"));
        assertEquals("true", System.getProperty("sun.security.krb5.debug"));

        // cleanup to avoid leaking global state
        System.clearProperty("sun.security.spnego.debug");
        System.clearProperty("sun.security.krb5.debug");
    }

    @Test
    void anonymousCredentialsReturnNulls() throws Exception {
        Class<?> clazz = Class.forName("org.apache.dolphinscheduler.common.utils.KerberosHttpClient$1");
        Object instance = clazz.getDeclaredConstructor().newInstance();
        org.apache.http.auth.Credentials credentials = (org.apache.http.auth.Credentials) instance;
        Principal principal = credentials.getUserPrincipal();
        String password = credentials.getPassword();
        assertEquals(null, principal);
        assertEquals(null, password);
    }
}
