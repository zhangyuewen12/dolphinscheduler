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

package org.apache.dolphinscheduler.plugin.registry.jdbc;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.mock.env.MockEnvironment;

import com.zaxxer.hikari.HikariConfig;

class JdbcRegistryAutoConfigurationTest {

    @Test
    void getJdbcRegistryHikariConfigShouldFallbackToSpringDatasource() {
        MockEnvironment environment = new MockEnvironment()
                .withProperty("spring.datasource.url", "jdbc:postgresql://localhost:5432/dolphinscheduler")
                .withProperty("spring.datasource.username", "root")
                .withProperty("spring.datasource.password", "root")
                .withProperty("spring.datasource.driver-class-name", "org.postgresql.Driver")
                .withProperty("spring.datasource.hikari.maximum-pool-size", "5");

        HikariConfig hikariConfig = new JdbcRegistryAutoConfiguration()
                .getJdbcRegistryHikariConfig(new JdbcRegistryProperties(), environment);

        assertThat(hikariConfig.getJdbcUrl()).isEqualTo("jdbc:postgresql://localhost:5432/dolphinscheduler");
        assertThat(hikariConfig.getUsername()).isEqualTo("root");
        assertThat(hikariConfig.getPassword()).isEqualTo("root");
        assertThat(hikariConfig.getDriverClassName()).isEqualTo("org.postgresql.Driver");
        assertThat(hikariConfig.getMaximumPoolSize()).isEqualTo(5);
    }

    @Test
    void getJdbcRegistryHikariConfigShouldPreferRegistryHikariConfig() {
        HikariConfig registryHikariConfig = new HikariConfig();
        registryHikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/registry");
        JdbcRegistryProperties jdbcRegistryProperties = new JdbcRegistryProperties();
        jdbcRegistryProperties.setHikariConfig(registryHikariConfig);

        HikariConfig hikariConfig = new JdbcRegistryAutoConfiguration()
                .getJdbcRegistryHikariConfig(jdbcRegistryProperties, new MockEnvironment()
                        .withProperty("spring.datasource.url", "jdbc:postgresql://localhost:5432/dolphinscheduler"));

        assertThat(hikariConfig).isSameInstanceAs(registryHikariConfig);
    }
}
