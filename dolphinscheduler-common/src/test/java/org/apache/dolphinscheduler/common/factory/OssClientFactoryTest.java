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

package org.apache.dolphinscheduler.common.factory;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.common.model.OssConnection;

import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.Mockito;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

class OssClientFactoryTest {

    @Test
    void buildOssClient_usesBuilder() {
        OssConnection connection = new OssConnection("key", "secret", "endpoint");
        OSS ossClient = Mockito.mock(OSS.class);

        try (
                MockedConstruction<OSSClientBuilder> mocked =
                        Mockito.mockConstruction(OSSClientBuilder.class,
                                (builder, context) -> when(builder.build("endpoint", "key", "secret"))
                                        .thenReturn(ossClient))) {
            OSS result = OssClientFactory.buildOssClient(connection);

            assertSame(ossClient, result);
            verify(mocked.constructed().get(0)).build("endpoint", "key", "secret");
        }
    }
}
