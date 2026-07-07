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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.dolphinscheduler.common.model.OkHttpRequestHeaderContentType;
import org.apache.dolphinscheduler.common.model.OkHttpRequestHeaders;
import org.apache.dolphinscheduler.common.model.OkHttpResponse;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

class OkHttpUtilsTest {

    private static HttpServer server;
    private static String baseUrl;

    @BeforeAll
    static void startServer() throws IOException {
        server = HttpServer.create(new InetSocketAddress(0), 0);
        server.createContext("/echo", new EchoHandler());
        server.createContext("/fail", new FailHandler());
        server.start();
        baseUrl = "http://localhost:" + server.getAddress().getPort();
    }

    @AfterAll
    static void stopServer() {
        server.stop(0);
    }

    @Test
    void get_post_put_delete_requests() throws IOException {
        OkHttpRequestHeaders headers = buildHeaders();
        Map<String, Object> params = new HashMap<>();
        params.put("q", "1");

        OkHttpResponse getResponse = OkHttpUtils.get(baseUrl + "/echo", headers, params, 1000, 1000, 1000);
        assertEquals(200, getResponse.getStatusCode());
        assertEquals("GET", getResponse.getBody());

        Map<String, Object> body = new HashMap<>();
        body.put("k", "v");

        OkHttpResponse postResponse =
                OkHttpUtils.post(baseUrl + "/echo", headers, params, body, 1000, 1000, 1000);
        assertEquals(200, postResponse.getStatusCode());
        assertEquals("{\"k\":\"v\"}", postResponse.getBody());

        OkHttpResponse putResponse = OkHttpUtils.put(baseUrl + "/echo", headers, body, 1000, 1000, 1000);
        assertEquals(200, putResponse.getStatusCode());
        assertEquals("{\"k\":\"v\"}", putResponse.getBody());

        OkHttpResponse deleteResponse = OkHttpUtils.delete(baseUrl + "/echo", headers, 1000, 1000, 1000);
        assertEquals(200, deleteResponse.getStatusCode());
        assertEquals("DELETE", deleteResponse.getBody());
    }

    @Test
    void demoPost_sendsFormBody() throws IOException {
        Map<String, Object> body = new HashMap<>();
        body.put("a", "1");
        body.put("b", "2");
        String response = OkHttpUtils.demoPost(baseUrl + "/echo", "token", body);

        assertEquals("a=1&b=2&", response);
    }

    @Test
    void getHandlesNonOkAndInvalidUrl() throws IOException {
        OkHttpRequestHeaders headers = buildHeaders();
        OkHttpResponse response = OkHttpUtils.get(baseUrl + "/fail", headers, null, 1000, 1000, 1000);
        assertEquals(500, response.getStatusCode());
        assertTrue(response.getBody().startsWith("Request execute failed, httpCode: 500, httpBody:"));

        Map<String, Object> badParams = new HashMap<>();
        badParams.put("k", "v");
        assertThrows(IllegalArgumentException.class,
                () -> OkHttpUtils.get("http://", headers, badParams, 1000, 1000, 1000));
    }

    @Test
    void getAndPostHandleNullHeadersAndBody() throws IOException {
        OkHttpRequestHeaders headers = new OkHttpRequestHeaders();
        headers.setOkHttpRequestHeaderContentType(OkHttpRequestHeaderContentType.APPLICATION_JSON);

        OkHttpResponse getResponse = OkHttpUtils.get(baseUrl + "/echo", headers, null, 1000, 1000, 1000);
        assertEquals(200, getResponse.getStatusCode());
        assertEquals("GET", getResponse.getBody());

        OkHttpResponse postResponse =
                OkHttpUtils.post(baseUrl + "/echo", headers, null, null, 1000, 1000, 1000);
        assertEquals(200, postResponse.getStatusCode());
        assertEquals("GET", postResponse.getBody());

        OkHttpResponse putResponse = OkHttpUtils.put(baseUrl + "/echo", headers, null, 1000, 1000, 1000);
        assertEquals(200, putResponse.getStatusCode());
        assertEquals("GET", putResponse.getBody());
    }

    @Test
    void getResponseBodyHandlesNullBody() throws Exception {
        Response response = new Response.Builder()
                .request(new Request.Builder().url("http://localhost").build())
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .message("OK")
                .build();

        Method method = OkHttpUtils.class.getDeclaredMethod("getResponseBody", Response.class);
        method.setAccessible(true);
        String body = (String) method.invoke(null, response);
        assertTrue(body.contains("httpCode: 200"));
    }

    @Test
    void getThrowsWhenRequestFails() throws Exception {
        OkHttpClient original = getClient();
        OkHttpClient throwingClient = new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    throw new IOException("boom");
                })
                .build();
        setClient(throwingClient);
        try {
            OkHttpRequestHeaders headers = buildHeaders();
            assertThrows(RuntimeException.class,
                    () -> OkHttpUtils.get(baseUrl + "/echo", headers, null, 1000, 1000, 1000));
        } finally {
            setClient(original);
        }
    }

    private static OkHttpClient getClient() throws Exception {
        java.lang.reflect.Field field = OkHttpUtils.class.getDeclaredField("CLIENT");
        field.setAccessible(true);
        return (OkHttpClient) field.get(null);
    }

    private static void setClient(OkHttpClient client) throws Exception {
        java.lang.reflect.Field field = OkHttpUtils.class.getDeclaredField("CLIENT");
        field.setAccessible(true);
        field.set(null, client);
    }

    private static OkHttpRequestHeaders buildHeaders() {
        OkHttpRequestHeaders headers = new OkHttpRequestHeaders();
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("token", "test");
        headers.setHeaders(headerMap);
        headers.setOkHttpRequestHeaderContentType(OkHttpRequestHeaderContentType.APPLICATION_JSON);
        return headers;
    }

    private static class EchoHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String method = exchange.getRequestMethod();
            String responseBody;
            if ("POST".equals(method) || "PUT".equals(method)) {
                responseBody = readBody(exchange.getRequestBody());
            } else {
                responseBody = method;
            }
            byte[] bytes = responseBody.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, bytes.length);
            exchange.getResponseBody().write(bytes);
            exchange.close();
        }

        private String readBody(InputStream inputStream) throws IOException {
            java.io.ByteArrayOutputStream buffer = new java.io.ByteArrayOutputStream();
            byte[] chunk = new byte[1024];
            int read;
            while ((read = inputStream.read(chunk)) != -1) {
                buffer.write(chunk, 0, read);
            }
            return new String(buffer.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    private static class FailHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            byte[] bytes = new byte[0];
            exchange.sendResponseHeaders(500, bytes.length);
            exchange.getResponseBody().write(bytes);
            exchange.close();
        }
    }
}
