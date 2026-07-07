# JDBC 注册中心实现逻辑说明

本文说明 DolphinScheduler JDBC 注册中心的实现逻辑，重点覆盖 3.3.2 分支中服务注册、事件监听、正常停止、异常退出清理，以及 Master/Alert 因 DELETE 事件缺失导致的状态不一致问题。

## 范围

核心类如下：

- `RegistryClient`：上层通用注册中心门面，Master、Worker、Alert 等模块都通过它访问注册中心。
- `JdbcRegistry`：`Registry` SPI 的 JDBC 实现。
- `JdbcRegistryClient`：每个服务进程本地持有的轻量 client。
- `JdbcRegistryServer`：进程内 JDBC registry 协调器，负责心跳、数据、锁和清理。
- `JdbcRegistryDataManager`：负责 registry data 的增删改，以及 registry 事件表轮询。
- `JdbcRegistryLockManager`：基于 JDBC 表实现分布式锁。
- `JdbcRegistryDataChangeListenerAdapter`：把 JDBC data 事件转换成统一的 registry `Event`。
- `MasterRegistryClient`、`AlertRegistryClient`：服务级注册客户端。
- `MasterClusters`、`MasterSlotManager`、`AlertHAServer`：消费注册中心状态和事件的业务组件。

注意：虽然类名叫 `JdbcRegistryServer`，但它不是一个独立部署的远程 server。每个 DolphinScheduler 服务进程都会创建自己的 `JdbcRegistryServer` 实例，然后通过数据库表和其他进程协作。

## 数据库表

JDBC 注册中心主要使用这些表：

| 表名 | 作用 |
| --- | --- |
| `t_ds_jdbc_registry_client_heartbeat` | 保存 registry client 心跳。每个进程有一个 client id，并周期性刷新 `last_heartbeat_time`。 |
| `t_ds_jdbc_registry_data` | 保存注册节点数据，例如 `/nodes/master/ip:port`、`/nodes/worker/ip:port`、`/nodes/alert-server/ip:port`、`/nodes/alert-server-ha-leader`。 |
| `t_ds_jdbc_registry_lock` | 保存 JDBC 锁，用于选主和其他互斥协调。 |
| `t_ds_jdbc_registry_data_change_event` | 保存 registry data 的 ADD、UPDATE、DELETE 事件。其他进程通过轮询这张表模拟 watch 事件。 |

`t_ds_jdbc_registry_data` 中的数据分两类：

- `PERSISTENT`：持久节点，除非显式删除，否则一直存在。
- `EPHEMERAL`：临时节点，归属于某个 registry client，该 client 死亡后应被清理。

## 核心类职责

### `RegistryClient`

`RegistryClient` 是上层模块使用的统一 API，它内部包装了一个 `Registry` 实现。

常用方法：

- `persistEphemeral(key, value)` -> `registry.put(key, value, true)`
- `persist(key, value)` -> `registry.put(key, value, false)`
- `remove(key)` -> `registry.delete(key)`
- `subscribe(path, listener)` -> `registry.subscribe(path, listener)`
- `getServerList(type)` -> 读取 `/nodes/master`、`/nodes/worker`、`/nodes/alert-server` 下的子节点

Master 启动注册时，`MasterRegistryClient` 会调用：

```java
registryClient.remove(masterRegistryPath);
registryClient.persistEphemeral(masterRegistryPath, heartbeatJson);
```

Alert 心跳线程会周期性写入：

```text
/nodes/alert-server/{alertServerAddress}
```

### `JdbcRegistry`

`JdbcRegistry` 是 `Registry` SPI 的 JDBC 实现，主要把通用 registry 操作转给 `JdbcRegistryClient`。

重要逻辑：

- `start()`：先启动 `JdbcRegistryServer`，再启动 `JdbcRegistryClient`。
- `put(key, value, deleteOnDisconnect)`：根据 `deleteOnDisconnect` 决定写 `EPHEMERAL` 还是 `PERSISTENT`。
- `delete(key)`：委托给 `deleteJdbcRegistryDataByKey`。
- `subscribe(watchedPath, listener)`：用 `JdbcRegistryDataChangeListenerAdapter` 包装 listener。
- `close()`：关闭共享调度线程池，并关闭本地 client。

### `JdbcRegistryClient`

`JdbcRegistryClient` 是进程本地 registry client。它包含：

- 自动生成的 `clientId`；
- `clientName`；
- 向 `JdbcRegistryServer` 注册和注销自己的方法；
- 写入、删除、查询 registry data 的方法；
- 获取和释放 JDBC lock 的方法。

调用 `start()` 时，它会在下面的表中注册自己：

```text
t_ds_jdbc_registry_client_heartbeat
```

调用 `close()` 时，它会注销自己。

### `JdbcRegistryServer`

`JdbcRegistryServer` 是 JDBC 注册中心的进程内协调器。

`start()` 会做这些事：

1. 先执行一次 `purgeInvalidJdbcRegistryMetadata()`，清理历史遗留的失效数据。
2. 按 `registry.session-timeout` 周期调度 `purgeInvalidJdbcRegistryMetadata()`。
3. 启动 `JdbcRegistryDataManager`。
4. 将状态设置为 `STARTED`。
5. 触发连接成功 listener。
6. 按 `registry.heartbeat-refresh-interval` 周期调度 `refreshClientsHeartbeat()`。

### `JdbcRegistryDataManager`

`JdbcRegistryDataManager` 负责 registry data 的真实增删改，以及事件表轮询。

`start()` 会做这些事：

1. 从当前事件表最大 id 初始化 `lastDetectedJdbcRegistryDataChangeEventId`。
2. 按 `registry.heartbeat-refresh-interval` 周期调度 `detectJdbcRegistryDataChangeEvent()`。
3. 调度历史事件清理。

通过 `putJdbcRegistryData` 新增或更新 data 时，会写：

```text
t_ds_jdbc_registry_data
t_ds_jdbc_registry_data_change_event，事件类型为 ADD 或 UPDATE
```

通过 `deleteJdbcRegistryDataByKey` 删除 data 时，会写：

```text
delete from t_ds_jdbc_registry_data where data_key = ?
insert into t_ds_jdbc_registry_data_change_event，事件类型为 DELETE
```

因此，事件表是运行中进程感知 registry data 变化的唯一机制。

### `JdbcRegistryDataChangeListenerAdapter`

`JdbcRegistryDataChangeListenerAdapter` 负责把 JDBC registry row event 转成统一的 registry `Event`。

它会按 `SubscribeScope` 判断路径是否匹配：

- `PATH_ONLY`：只监听当前路径。
- `CHILDREN_ONLY`：只监听子路径。
- `ALL`：监听当前路径和子路径。

事件转换关系：

- JDBC add -> `Event.Type.ADD`
- JDBC update -> `Event.Type.UPDATE`
- JDBC delete -> `Event.Type.REMOVE`

Master 监听 `/nodes/master`，scope 是 `CHILDREN_ONLY`。

Alert HA 监听 `/nodes/alert-server-ha-leader`，scope 是 `PATH_ONLY`。

## 服务启动流程

### Master 启动

简化流程：

```text
MasterServer.initialized()
  -> masterRegistryClient.start()
      -> MasterRegistryClient.registry()
          -> registryClient.remove("/nodes/master/{masterAddress}")
          -> registryClient.persistEphemeral("/nodes/master/{masterAddress}", heartbeat)
          -> masterHeartBeatTask.start()
  -> masterCoordinator.start()
  -> clusterManager.start()
      -> initializeMasterClusters()
          -> registryClient.getServerList(MASTER)
          -> masterClusters.onServerAdded(each current registry node)
          -> registryClient.subscribe("/nodes/master", masterClusters)
  -> workflowEngine.start()
      -> commandEngine.start()
```

`MasterClusters` 在内存中保存 Master 元数据：

```text
master address -> MasterServerMetadata
```

当 `MasterClusters` 发生变化时，`MasterSlotChangeListenerAdaptor` 会调用：

```text
masterSlotManager.doReBalance(masterClusters.getNormalServers())
```

`MasterSlotManager` 会对 NORMAL Master 地址排序，并计算：

```text
currentSlot = 当前 master address 在排序列表中的下标
totalSlots = NORMAL master 数量
```

Command 拉取使用这两个值：

```sql
where (id / idStep) % totalSlot = currentSlotIndex
```

所以，如果 `MasterClusters` 内存里仍然保留旧 Master 地址，即使真实环境只有一个 Master 进程，`totalSlot` 也可能一直是 `2`。

### Alert 启动

简化流程：

```text
AlertServer.run()
  -> alertPluginManager.start()
  -> alertRpcServer.start()
  -> alertRegistryClient.start()
      -> AlertHeartbeatTask.start()
          -> writes /nodes/alert-server/{alertServerAddress}
  -> alertHAServer.addServerStatusChangeListener(...)
  -> alertHAServer.start()
      -> subscribe("/nodes/alert-server-ha-leader", PATH_ONLY)
      -> participateElection()
          -> acquire "/nodes/alert-server-ha-leader-lock"
          -> 如果 leader path 不存在，则写入 EPHEMERAL leader
          -> 如果 leader path 已存在，则比较 leader value 是否等于当前 alert address
```

只有 active Alert 会拉取告警事件：

```java
if (!alertHAServer.isActive()) {
    sleep;
    continue;
}
```

如果新 Alert 启动时旧 leader 记录仍存在，新 Alert 会进入 standby。

如果旧 leader 记录后来被删除，但新 Alert 没收到 DELETE/REMOVE 事件，新 Alert 会一直保持 standby，因为它不会周期性主动重新选举。

## 正常数据变更事件流程

正常写 registry data 的链路：

```text
Service code
  -> RegistryClient.persistEphemeral / persist / remove
  -> JdbcRegistry.put / delete
  -> JdbcRegistryClient
  -> JdbcRegistryServer
  -> JdbcRegistryDataManager.putJdbcRegistryData / deleteJdbcRegistryDataByKey
  -> t_ds_jdbc_registry_data
  -> t_ds_jdbc_registry_data_change_event
```

事件消费链路：

```text
JdbcRegistryDataManager.detectJdbcRegistryDataChangeEvent()
  -> select events where id > lastDetectedJdbcRegistryDataChangeEventId
  -> trigger local RegistryRowChangeListener
  -> JdbcRegistryDataChangeListenerAdapter
  -> SubscribeListener.notify(Event)
  -> MasterClusters / AlertHAServer / other listeners
```

这不是数据库原生 watch，而是基于事件表的轮询机制。

## 正常停止流程

### Master 正常停止

`MasterRegistryClient.close()` 会停止心跳，并注销 Master 节点：

```text
registryClient.remove(masterRegistryPath)
masterHeartBeatTask.shutdown()
registryClient.close()
```

如果 `registryClient.remove` 走到 `deleteJdbcRegistryDataByKey`，就会插入 DELETE event。其他 Master 收到 REMOVE 后，会移除旧 Master 并重新 rebalance。

### Alert 正常停止

Alert 心跳线程会停止。底层 registry 生命周期会关闭本地 client。

如果 Alert HA leader path 通过正常 registry delete 路径删除，standby Alert 可以收到 REMOVE 事件并重新竞选。

## 异常退出和清理

如果进程 crash 或被 kill，它无法正常执行 deregister。

JDBC registry 通过 `t_ds_jdbc_registry_client_heartbeat` 判断 client 是否死亡：

```java
System.currentTimeMillis() - lastHeartbeatTime > sessionTimeout
```

`JdbcRegistryServer.purgeInvalidJdbcRegistryMetadata()` 会周期性执行：

1. 读取所有 registry client heartbeat。
2. 找出超过 `sessionTimeout` 未刷新的 dead client。
3. 删除 dead client heartbeat。
4. 清理不属于任何有效 client 的 EPHEMERAL registry data。
5. 清理不属于任何有效 client 的 lock。

清理周期基于 `registry.session-timeout`，所以恢复时间并不精确等于一个 timeout。根据调度时机，实际可能接近一到两个 timeout。

## 3.3.2 的问题

3.3.2 中，dead client 清理逻辑会调用：

```java
jdbcRegistryDataRepository.deleteEphemeralDateByClientIds(jdbcRegistryClientIds);
jdbcRegistryLockRepository.deleteByClientIds(jdbcRegistryClientIds);
jdbcRegistryClientRepository.deleteByIds(jdbcRegistryClientIds);
```

其中 `deleteEphemeralDateByClientIds` 会直接删除 `t_ds_jdbc_registry_data`：

```sql
delete from t_ds_jdbc_registry_data
where client_id in (...)
  and data_type = 'EPHEMERAL'
```

这绕过了 `JdbcRegistryDataManager.deleteJdbcRegistryDataByKey`，所以不会向 `t_ds_jdbc_registry_data_change_event` 插入 DELETE event。

影响：

- 运行中的 Master 收不到 `/nodes/master/{old-ip}` 的 REMOVE。
- `MasterClusters` 内存里仍然保留旧 Master 地址。
- `MasterSlotManager` 可能在真实只有一个 Master 时仍然保持 `totalSlots = 2`。
- Command 拉取只消费一个 id slot，另一个 slot 的 command 会一直积压。
- 运行中的 standby Alert 收不到 `/nodes/alert-server-ha-leader` 的 REMOVE。
- 即使 DB 里的 leader 记录已经消失，Alert 也可能一直 standby。

这就是为什么 DB 状态看起来已经正确，但运行中进程内存状态仍然是旧的。

## 3.4.1 的行为

3.4.1 中，清理逻辑做了调整。`doPurgeJdbcRegistryClientInDB` 只删除 dead client heartbeat：

```java
jdbcRegistryClientRepository.deleteByIds(jdbcRegistryClientIds);
```

然后 `purgeInvalidJdbcRegistryMetadata` 计算有效 client id，并通过下面的方法逐条删除 orphan EPHEMERAL data：

```java
jdbcRegistryDataManager.deleteJdbcRegistryDataByKey(jdbcRegistryData.getDataKey());
```

这个方法会在一个事务里删除 registry data 并插入 DELETE event：

```text
delete t_ds_jdbc_registry_data
insert t_ds_jdbc_registry_data_change_event(type=DELETE)
```

这样其他运行中进程才能收到 REMOVE 事件，并更新自己的内存状态。

## Backport 到 3.3.2 的建议

建议回迁这些改动：

1. 修改 `JdbcRegistryServer#doPurgeJdbcRegistryClientInDB`，不要在这里直接删除 EPHEMERAL data。
2. 在 `purgeInvalidJdbcRegistryMetadata` 中计算 `existJdbcRegistryClientIds` 时排除 dead client。
3. 清理 orphan EPHEMERAL data 时，调用 `jdbcRegistryDataManager.deleteJdbcRegistryDataByKey`。
4. 保留 dead 或 missing client 的 lock 清理。
5. 将 `JdbcRegistryDataManager#deleteJdbcRegistryDataByKey` 改成事务，保证 data 删除和 DELETE event 插入同时成功或同时失败。

核心原则：

```text
凡是其他进程需要感知的 registry data 删除，都必须产生 DELETE event。
```

## 运维排查

常用 SQL：

```sql
select *
from t_ds_jdbc_registry_data
where data_key like '%master%'
   or data_key like '%alert%';

select *
from t_ds_jdbc_registry_client_heartbeat
order by last_heartbeat_time desc;

select *
from t_ds_jdbc_registry_data_change_event
where jdbc_registry_data like '%master%'
   or jdbc_registry_data like '%alert%'
order by id desc
limit 50;

select *
from t_ds_jdbc_registry_lock
where lock_key like '%alert%'
   or lock_key like '%master%';
```

Master 关键日志：

```text
Do rebalance success, current master slot: X, total master slots: Y
MasterSlotManager check slot
Fetch N commands
```

Alert 关键日志：

```text
Server {address} is standby
The status is active now
The current node is not active, will not loop Alert
```

如果已经出现运行中进程内存状态陈旧：

- 重启受影响的 Master 或 Alert。
- Master 重启后会重新从 DB 初始化 `MasterClusters` 并重新计算 slot。
- Alert 重启后会重新执行 leader election。

长期加固建议：

- 滚动更新时尽量保持 `masterAddress` 或 `alertServerAddress` 稳定，避免新旧 IP 同时作为不同 identity 出现。
- 如果部署形态允许，优先使用稳定服务标识，不依赖自动探测的 pod/container IP。
- 增加周期性 reconcile，避免 Master 和 Alert 完全依赖事件表投递。
- Alert standby 可以周期性检查 leader path 是否存在，不存在则主动重新竞选。
- Master 可以周期性从 `registryClient.getServerList(MASTER)` 全量校准 `MasterClusters`，修复漏掉的 REMOVE 事件。
