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

ALTER TABLE `t_ds_schedules` ADD UNIQUE KEY `uniq_workflow_definition_code` (`workflow_definition_code`);

SET @fk_name = (
    SELECT CONSTRAINT_NAME
    FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
    WHERE TABLE_SCHEMA = DATABASE()
      AND TABLE_NAME = 'QRTZ_TRIGGERS'
      AND REFERENCED_TABLE_NAME = 'QRTZ_JOB_DETAILS'
    LIMIT 1
);
SET @drop_fk_sql = IF(
    @fk_name IS NULL,
    'SELECT 1',
    CONCAT('ALTER TABLE `QRTZ_TRIGGERS` DROP FOREIGN KEY `', @fk_name, '`')
);
PREPARE stmt FROM @drop_fk_sql;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @fk_name = (
    SELECT CONSTRAINT_NAME
    FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
    WHERE TABLE_SCHEMA = DATABASE()
      AND TABLE_NAME = 'QRTZ_BLOB_TRIGGERS'
      AND REFERENCED_TABLE_NAME = 'QRTZ_TRIGGERS'
    LIMIT 1
);
SET @drop_fk_sql = IF(
    @fk_name IS NULL,
    'SELECT 1',
    CONCAT('ALTER TABLE `QRTZ_BLOB_TRIGGERS` DROP FOREIGN KEY `', @fk_name, '`')
);
PREPARE stmt FROM @drop_fk_sql;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @fk_name = (
    SELECT CONSTRAINT_NAME
    FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
    WHERE TABLE_SCHEMA = DATABASE()
      AND TABLE_NAME = 'QRTZ_CRON_TRIGGERS'
      AND REFERENCED_TABLE_NAME = 'QRTZ_TRIGGERS'
    LIMIT 1
);
SET @drop_fk_sql = IF(
    @fk_name IS NULL,
    'SELECT 1',
    CONCAT('ALTER TABLE `QRTZ_CRON_TRIGGERS` DROP FOREIGN KEY `', @fk_name, '`')
);
PREPARE stmt FROM @drop_fk_sql;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @fk_name = (
    SELECT CONSTRAINT_NAME
    FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
    WHERE TABLE_SCHEMA = DATABASE()
      AND TABLE_NAME = 'QRTZ_SIMPLE_TRIGGERS'
      AND REFERENCED_TABLE_NAME = 'QRTZ_TRIGGERS'
    LIMIT 1
);
SET @drop_fk_sql = IF(
    @fk_name IS NULL,
    'SELECT 1',
    CONCAT('ALTER TABLE `QRTZ_SIMPLE_TRIGGERS` DROP FOREIGN KEY `', @fk_name, '`')
);
PREPARE stmt FROM @drop_fk_sql;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET @fk_name = (
    SELECT CONSTRAINT_NAME
    FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
    WHERE TABLE_SCHEMA = DATABASE()
      AND TABLE_NAME = 'QRTZ_SIMPROP_TRIGGERS'
      AND REFERENCED_TABLE_NAME = 'QRTZ_TRIGGERS'
    LIMIT 1
);
SET @drop_fk_sql = IF(
    @fk_name IS NULL,
    'SELECT 1',
    CONCAT('ALTER TABLE `QRTZ_SIMPROP_TRIGGERS` DROP FOREIGN KEY `', @fk_name, '`')
);
PREPARE stmt FROM @drop_fk_sql;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;
