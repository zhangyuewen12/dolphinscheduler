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

package org.apache.dolphinscheduler.plugin.task.shell;

import static org.apache.dolphinscheduler.plugin.task.api.TaskConstants.EXIT_CODE_FAILURE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.apache.dolphinscheduler.plugin.task.api.ShellCommandExecutor;
import org.apache.dolphinscheduler.plugin.task.api.TaskCallBack;
import org.apache.dolphinscheduler.plugin.task.api.TaskException;
import org.apache.dolphinscheduler.plugin.task.api.TaskExecutionContext;
import org.apache.dolphinscheduler.plugin.task.api.enums.DataType;
import org.apache.dolphinscheduler.plugin.task.api.enums.Direct;
import org.apache.dolphinscheduler.plugin.task.api.model.Property;
import org.apache.dolphinscheduler.plugin.task.api.model.TaskResponse;
import org.apache.dolphinscheduler.plugin.task.api.shell.IShellInterceptorBuilder;
import org.apache.dolphinscheduler.plugin.task.api.shell.ShellInterceptorBuilderFactory;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ShellTaskTest {

    @Test
    void initParsesParameters() {
        TaskExecutionContext context = buildContext("{\"rawScript\":\"echo 1\"}");
        ShellTask task = new ShellTask(context);

        task.init();

        assertInstanceOf(ShellParameters.class, task.getParameters());
        ShellParameters parameters = (ShellParameters) task.getParameters();
        assertEquals("echo 1", parameters.getRawScript());
    }

    @Test
    void initThrowsWhenParametersInvalid() {
        TaskExecutionContext context = buildContext("{\"rawScript\":\"\"}");
        ShellTask task = new ShellTask(context);

        assertThrows(TaskException.class, task::init);
    }

    @Test
    void handleSuccessUpdatesStatusAndVarPool() throws Exception {
        TaskExecutionContext context = buildContext("{\"rawScript\":\"echo 1\"}");
        ShellTask task = new ShellTask(context);
        task.init();

        ShellParameters parameters = (ShellParameters) task.getParameters();
        parameters.setLocalParams(Collections.singletonList(new Property("out", Direct.OUT, DataType.VARCHAR, "x")));

        ShellCommandExecutor executor = mock(ShellCommandExecutor.class);
        Map<String, String> outputParams = new HashMap<>();
        outputParams.put("out", "value");
        when(executor.getTaskOutputParams()).thenReturn(outputParams);

        TaskResponse response = new TaskResponse();
        response.setExitStatusCode(0);
        response.setProcessId(123);
        when(executor.run(any(IShellInterceptorBuilder.class), any(TaskCallBack.class))).thenReturn(response);

        setExecutor(task, executor);

        IShellInterceptorBuilder builder = mock(IShellInterceptorBuilder.class, org.mockito.Mockito.RETURNS_SELF);
        try (
                MockedStatic<ShellInterceptorBuilderFactory> mockedFactory =
                        mockStatic(ShellInterceptorBuilderFactory.class)) {
            mockedFactory.when(ShellInterceptorBuilderFactory::newBuilder).thenReturn(builder);

            task.handle(mock(TaskCallBack.class));
        }

        assertEquals(0, task.getExitStatusCode());
        assertEquals(123, task.getProcessId());
        assertNotNull(context.getVarPool());
        assertEquals(1, context.getVarPool().size());
        assertEquals("value", context.getVarPool().get(0).getValue());
    }

    @Test
    void handleInterruptedSetsFailureAndPropagates() throws Exception {
        TaskExecutionContext context = buildContext("{\"rawScript\":\"echo 1\"}");
        ShellTask task = new ShellTask(context);
        task.init();

        ShellCommandExecutor executor = mock(ShellCommandExecutor.class);
        when(executor.run(any(IShellInterceptorBuilder.class), any(TaskCallBack.class)))
                .thenThrow(new InterruptedException("interrupt"));

        setExecutor(task, executor);

        IShellInterceptorBuilder builder = mock(IShellInterceptorBuilder.class, org.mockito.Mockito.RETURNS_SELF);
        try (
                MockedStatic<ShellInterceptorBuilderFactory> mockedFactory =
                        mockStatic(ShellInterceptorBuilderFactory.class)) {
            mockedFactory.when(ShellInterceptorBuilderFactory::newBuilder).thenReturn(builder);

            TaskException exception = assertThrows(TaskException.class,
                    () -> task.handle(mock(TaskCallBack.class)));
            assertTrue(exception.getMessage().contains("interrupted"));
        } finally {
            Thread.interrupted();
        }

        assertEquals(EXIT_CODE_FAILURE, task.getExitStatusCode());
    }

    @Test
    void handleErrorSetsFailureAndPropagates() throws Exception {
        TaskExecutionContext context = buildContext("{\"rawScript\":\"echo 1\"}");
        ShellTask task = new ShellTask(context);
        task.init();

        ShellCommandExecutor executor = mock(ShellCommandExecutor.class);
        when(executor.run(any(IShellInterceptorBuilder.class), any(TaskCallBack.class)))
                .thenThrow(new RuntimeException("boom"));

        setExecutor(task, executor);

        IShellInterceptorBuilder builder = mock(IShellInterceptorBuilder.class, org.mockito.Mockito.RETURNS_SELF);
        try (
                MockedStatic<ShellInterceptorBuilderFactory> mockedFactory =
                        mockStatic(ShellInterceptorBuilderFactory.class)) {
            mockedFactory.when(ShellInterceptorBuilderFactory::newBuilder).thenReturn(builder);

            TaskException exception = assertThrows(TaskException.class,
                    () -> task.handle(mock(TaskCallBack.class)));
            assertTrue(exception.getMessage().contains("Execute shell task error"));
        }

        assertEquals(EXIT_CODE_FAILURE, task.getExitStatusCode());
    }

    @Test
    void cancelDelegatesToExecutor() throws Exception {
        TaskExecutionContext context = buildContext("{\"rawScript\":\"echo 1\"}");
        ShellTask task = new ShellTask(context);

        ShellCommandExecutor executor = mock(ShellCommandExecutor.class);
        doNothing().when(executor).cancelApplication();
        setExecutor(task, executor);

        task.cancel();

        verify(executor).cancelApplication();
    }

    @Test
    void cancelThrowsTaskExceptionOnFailure() throws Exception {
        TaskExecutionContext context = buildContext("{\"rawScript\":\"echo 1\"}");
        ShellTask task = new ShellTask(context);

        ShellCommandExecutor executor = mock(ShellCommandExecutor.class);
        doThrow(new RuntimeException("cancel-failed")).when(executor).cancelApplication();
        setExecutor(task, executor);

        TaskException exception = assertThrows(TaskException.class, task::cancel);
        assertTrue(exception.getMessage().contains("cancel application error"));
    }

    private static TaskExecutionContext buildContext(String taskParams) {
        TaskExecutionContext context = new TaskExecutionContext();
        context.setTaskParams(taskParams);
        context.setPrepareParamsMap(new HashMap<String, org.apache.dolphinscheduler.plugin.task.api.model.Property>());
        context.setTaskName("shell");
        context.setTaskInstanceId(1);
        context.setTaskAppId("1");
        context.setExecutePath("/tmp");
        context.setLogPath("/tmp/log");
        context.setTenantCode("root");
        return context;
    }

    private static void setExecutor(ShellTask task, ShellCommandExecutor executor) throws Exception {
        Field field = ShellTask.class.getDeclaredField("shellCommandExecutor");
        field.setAccessible(true);
        field.set(task, executor);
    }
}
