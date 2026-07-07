create table if not exists flink_monitor_instance
(
    instance_id varchar(255) not null primary key,
    host varchar(255) not null,
    update_time timestamp not null
);

create table if not exists t_flink_job_record
(
    id bigint not null primary key,
    flink_job_id varchar(255) not null,
    job_name varchar(255),
    flink_rest_url varchar(1024),
    status varchar(64) not null,
    monitor_owner varchar(255),
    monitor_lease_expire_time timestamp,
    update_time timestamp not null
);

create index idx_flink_job_record_status_id on t_flink_job_record(status, id);
create index idx_flink_job_record_monitor_lease on t_flink_job_record(monitor_owner, monitor_lease_expire_time);
