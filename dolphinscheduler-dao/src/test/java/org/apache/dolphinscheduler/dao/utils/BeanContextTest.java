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

package org.apache.dolphinscheduler.dao.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

class BeanContextTest {

    @AfterEach
    void tearDown() {
        new BeanContext().setApplicationContext(null);
    }

    @Test
    void setAndGetApplicationContext() {
        ApplicationContext context = mock(ApplicationContext.class);
        new BeanContext().setApplicationContext(context);

        assertEquals(context, BeanContext.getApplicationContext());
    }

    @Test
    void getBeanByNameAndType() {
        ApplicationContext context = mock(ApplicationContext.class);
        Foo foo = new Foo();
        when(context.getBean("foo")).thenReturn("value");
        when(context.getBean(Foo.class)).thenReturn(foo);

        new BeanContext().setApplicationContext(context);

        assertEquals("value", BeanContext.getBean("foo"));
        assertEquals(foo, BeanContext.getBean(Foo.class));
    }

    @Test
    void getApplicationContextDefaultsToNull() {
        new BeanContext().setApplicationContext(null);
        assertNull(BeanContext.getApplicationContext());
    }

    static class Foo {
    }
}
