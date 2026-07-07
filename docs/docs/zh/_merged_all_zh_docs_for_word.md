# Apache DolphinScheduler 中文文档

> 由仓库 `docs/docs/zh` 自动合并生成，用于导出 Word（DOCX）。



---

# DSIP

DolphinScheduler Improvement Proposal (DSIP) 是对 Apache DolphinScheduler 代码库进行的重大改进。它不是为了小修小补存在的，
DSIP 的目的是通知社区完成或即将完成的重大变更。

## 怎样的修改应该被认定为 DSIP

- 任何重大的新功能、重大改进、引入或删除组件
- 任何公共接口的任何重大变化，例如 API接口、web ui 巨大变化

当一个 PR 或者 Issue 是否应该被认定为 DSIP 存疑时，如果有 committer 认为他应该纳入 DAIP 的范畴，那它就应该是 DSIP。

我们使用 GitHub Issue 和 Apache 邮件列表来记录和保存 DSIP，想要了解更多相关信息，您可以跳转到 当前的 DSIPs 以及 past DSIPs

作为 DSIP，它应该包含如下部分：

- 在 [dev@dolphinscheduler.apache.org][mail-to-dev] 中有一个以 `[DISCUSS][DSIP` 为开头的邮件。
- 有一个打了 "DSIP" 标签的 GitHub Issue，并在描述中包含邮链接。

### 当前的 DSIPs

当前的 DSIP 包括所有仍在进行中的 DSIP，您可以在 [当前的 DSIPs][current-DSIPs] 中找到他们

### 完结的 DSIPs

完结的 DSIP，包括所有已完成或因某种原因终止的 DSIP，您可以在 [完结的 DSIPs][past-DSIPs] 中找到他们

## DSIP 的步骤

### 创建 GitHub Issue

所有 DSIP 都应该起源于 GitHub Issue

- 如果您确定你的问题是 DSIP，你可以在 [GitHub Issue][github-issue-choose] 中点击并选择 "DSIP"
- 如果您不确定您的问题是否是 DSIP，您可以在 [GitHub Issue][github-issue-choose] 单击并选择 "Feature request"。当DolphinScheduler
  维护团队在查看 Issue 时认为他是 DSIP 时，会为 Issue 增加标签 "DSIP"。

You should and special prefix `[DSIP-XXX]`, `XXX` stand for the id DSIP. It's auto increment, and you could find the next
integer in [All DSIPs][all-DSIPs] issues.
在您的问题被标记成 DSIP 后，您应该特殊前缀 `[DSIP-XXX]`，其中`XXX` 代表 id DSIP。它是自动递增的，你可以在 [All DSIPs][all-DSIPs]
找到下一个 DSIP 的整数编号。

### 发送讨论邮件

在您的问题被标记为 "DSIP" 后，您应该发送电子邮件至 [dev@dolphinscheduler.apache.org][mail-to-dev] 描述提案的目的，以及设计草案。

下面是邮件的模板

- 标题: `[DISCUSS][DSIP-XXX] <CHANGE-TO-YOUR-LOVELY-PROPOSAL-TITLE>`, 将 `XXX` 修改为 to special integer you just change in
  GitHub Issue, and also change proposal title.
- 内容:

  ```text
  Hi community,

  <CHANGE-TO-YOUR-PROPOSAL-DETAIL>

  I already add a GitHub Issue for my proposal, which you could see in <CHANGE-TO-YOUR-GITHUB-ISSUE-LINK>.

  Looking forward any feedback for this thread.
  ```

在社区讨论并且所有人都认为它值得作为 DSIP 之后，您可以去到下节正式开始工作。但是如果社区认为它不应该是 DSIP，维护者需要终止邮件讨论并
删除 GitHub Issue 中的 "DSIP" 标签。如果当这个修改不应该合并到 DolphinScheduler 中时，维护者除了除了移除标签外，还要关闭 GitHub Issue。

### 开始开发或者为他创建子任务

当您的提案通过邮件讨论时，您可以开始工作。你可以提交一个相关的 pull requests 如果更改应该在一次提交中进行。如果提案太大，已经超过了单次
提交的范畴，你可以在 GitHub Issue 中创建子任务，如 [DSIP-1][DSIP-1]，并分成多个 pull requests 提交任务。

### 关闭 DSIP

当 DSIP 完成并合并所有相关 PR 后，您应该回复您在第二步创建的邮件讨论，通知社区 DSIP 的结果。在这之后，这个 DSIP GitHub Issue 将会被
关闭，并从 [当前的 DSIPs][current-DSIPs] 转移到 [完结的 DSIPs][past-DSIPs]，但您仍然可以在 [All DSIPs][all-DSIPs] 中找到它

## DSIP的例子

* [[DSIP-1][Feature][Parent] Add Python API for DolphinScheduler][DSIP-1]: 有多个子任务和项目。

[all-DSIPs]: https://github.com/apache/dolphinscheduler/issues?q=is%3Aissue+label%3A%22DSIP%22+
[current-DSIPs]: https://github.com/apache/dolphinscheduler/issues?q=is%3Aissue+is%3Aopen+label%3A%22DSIP%22
[past-DSIPs]: https://github.com/apache/dolphinscheduler/issues?q=is%3Aissue+is%3Aclosed+label%3A%22DSIP%22+
[github-issue-choose]: https://github.com/apache/dolphinscheduler/issues/new/choose
[mail-to-dev]: mailto:dev@dolphinscheduler.apache.org
[DSIP-1]: https://github.com/apache/dolphinscheduler/issues/6407


---

<!-- markdown-link-check-disable -->

# 历史版本：

#### 以下是Apache DolphinScheduler每个稳定版本的设置说明。

### Versions: 3.3.2

#### Links： [3.3.2 Document](../3.3.2/user_doc/about/introduction.md)

### Versions: 3.3.1

#### Links： [3.3.1 Document](../3.3.1/user_doc/about/introduction.md)

### Versions: 3.3.0-alpha

#### Links： [3.3.0-alpha Document](../3.3.0-alpha/user_doc/about/introduction.md)

### Versions: 3.2.2

#### Links： [3.2.2 Document](../3.2.2/user_doc/about/introduction.md)

### Versions: 3.2.1

#### Links： [3.2.1 Document](../3.2.1/user_doc/about/introduction.md)

### Versions: 3.2.0

#### Links： [3.2.0 Document](../3.2.0/user_doc/about/introduction.md)

### Versions: 3.1.9

#### Links： [3.1.9 Document](../3.1.9/user_doc/about/introduction.md)

### Versions: 3.1.8

#### Links： [3.1.8 Document](../3.1.8/user_doc/about/introduction.md)

### Versions: 3.1.7

#### Links： [3.1.7 Document](../3.1.7/user_doc/about/introduction.md)

### Versions: 3.1.6

#### Links： [3.1.6 Document](../3.1.6/user_doc/about/introduction.md)

### Versions: 3.1.5

#### Links： [3.1.5 Document](../3.1.5/user_doc/about/introduction.md)

### Versions: 3.1.4

#### Links： [3.1.4 Document](../3.1.4/user_doc/about/introduction.md)

### Versions: 3.1.3

#### Links： [3.1.3 Document](../3.1.3/user_doc/about/introduction.md)

### Versions: 3.1.2

#### Links： [3.1.2 Document](../3.1.2/user_doc/about/introduction.md)

### Versions: 3.1.1

#### Links： [3.1.1 文档](../3.1.1/user_doc/about/introduction.md)

### Versions: 3.1.0

#### Links： [3.1.0 文档](../3.1.0/user_doc/about/introduction.md)

### Versions: 3.0.6

#### Links： [3.0.6 文档](../3.0.6/user_doc/about/introduction.md)

### Versions: 3.0.5

#### Links： [3.0.5 文档](../3.0.5/user_doc/about/introduction.md)

### Versions: 3.0.4

#### Links： [3.0.4 文档](../3.0.4/user_doc/about/introduction.md)

### Versions: 3.0.3

#### Links： [3.0.3 文档](../3.0.3/user_doc/about/introduction.md)

### Versions: 3.0.2

#### Links： [3.0.2 文档](../3.0.2/user_doc/about/introduction.md)

### Versions: 3.0.1

#### Links： [3.0.1 文档](../3.0.1/user_doc/about/introduction.md)

### Versions: 3.0.0

#### Links： [3.0.0 文档](../3.0.0/user_doc/about/introduction.md)

### 版本：2.0.7

#### 地址：[2.0.7 文档](../2.0.7/user_doc/guide/quick-start.md)

### 版本：2.0.6

#### 地址：[2.0.6 文档](../2.0.6/user_doc/guide/quick-start.md)

### 版本：2.0.5

#### 地址：[2.0.5 文档](../2.0.5/user_doc/guide/quick-start.md)

### 版本：2.0.3

#### 地址：[2.0.3 文档](../2.0.3/user_doc/guide/quick-start.md)

### 版本：2.0.2

#### 地址：[2.0.2 文档](../2.0.2/user_doc/guide/quick-start.md)

### 版本：2.0.1

#### 地址：[2.0.1 文档](../2.0.1/user_doc/guide/quick-start.md)

### 版本：2.0.0

#### 地址：[2.0.0 文档](../2.0.0/user_doc/guide/quick-start.md)

### 版本：1.3.9

#### 地址：[1.3.9 文档](../1.3.9/user_doc/quick-start.md)

### 版本：1.3.8

#### 地址：[1.3.8 文档](../1.3.8/user_doc/quick-start.md)

### 版本：1.3.6

#### 地址：[1.3.6 文档](../1.3.6/user_doc/quick-start.md)

### 版本：1.3.5

#### 地址：[1.3.5 文档](../1.3.5/user_doc/quick-start.md)

### 版本：1.3.4

##### 地址：[1.3.4 文档](../1.3.4/user_doc/quick-start.md)

### 版本：1.3.3

#### 地址：[1.3.3 文档](../1.3.4/user_doc/quick-start.md)

### 版本：1.3.2

#### 地址：[1.3.2 文档](../1.3.2/user_doc/quick-start.md)

### 版本：1.3.1

#### 地址：[1.3.1 文档](../1.3.1/user_doc/quick-start.md)

### 版本：1.2.1

#### 地址：[1.2.1 文档](../1.2.1/user_doc/quick-start.md)

### 版本：1.2.0

#### 地址：[1.2.0 文档](../1.2.0/user_doc/quick-start.md)

### 版本：1.1.0

#### 地址：[1.1.0 文档](../1.2.0/user_doc/quick-start.md)

### 版本：Dev

#### 地址：[Dev 文档](../dev/user_doc/about/introduction.md)


---

# 其他未在侧边栏中列出的文档



---

## about/features.md

# 特性

## 简单易用

- **可视化 DAG**: 用户友好的，通过拖拽定义工作流的，运行时控制工具
- **模块化操作**: 模块化有助于轻松定制和维护。

## 丰富的使用场景

- **支持多种任务类型**: 支持Shell、MR、Spark、SQL等10余种任务类型，支持跨语言，易于扩展
- **丰富的工作流操作**: 工作流程可以定时、暂停、恢复和停止，便于维护和控制全局和本地参数。

## High Reliability

- **高可靠性**: 去中心化设计，确保稳定性。 原生 HA 任务队列支持，提供过载容错能力。 DolphinScheduler 能提供高度稳健的环境。

## High Scalability

- **高扩展性**: 支持多租户和在线资源管理。支持每天10万个数据任务的稳定运行。


---

## about/glossary.md

## 名词解释

在对 Apache DolphinScheduler 了解之前，我们先来认识一下调度系统常用的名词

### 名词解释

**DAG：** 全称 Directed Acyclic Graph，简称 DAG。工作流中的 Task 任务以有向无环图的形式组装起来，从入度为零的节点进行拓扑遍历，直到无后继节点为止。举例如下图：

![about-glossary](../../img/new_ui/dev/about/glossary.png)

**流程定义**：通过拖拽任务节点并建立任务节点的关联所形成的可视化**DAG**

**流程实例**：流程实例是流程定义的实例化，可以通过手动启动或定时调度生成。每运行一次流程定义，产生一个流程实例

**任务实例**：任务实例是流程定义中任务节点的实例化，标识着某个具体的任务

**任务类型**：目前支持有 SHELL、SQL、SUB_WORKFLOW(子工作流)、PROCEDURE、MR、SPARK、PYTHON、DEPENDENT(依赖)，同时计划支持动态插件扩展，注意：其中 **SUB_WORKFLOW**类型的任务需要关联另外一个流程定义，被关联的流程定义是可以单独启动执行的

**调度方式**：系统支持基于 cron 表达式的定时调度和手动调度。命令类型支持：启动工作流、从当前节点开始执行、恢复被容错的工作流、恢复暂停流程、从失败节点开始执行、补数、定时、重跑、暂停、停止、恢复等待线程。
其中 **恢复被容错的工作流** 和 **恢复等待线程** 两种命令类型是由调度内部控制使用，外部无法调用

**定时调度**：系统采用 **quartz** 分布式调度器，并同时支持cron表达式可视化的生成

**依赖**：系统不单单支持 **DAG** 简单的前驱和后继节点之间的依赖，同时还提供**任务依赖**节点，支持**流程间的自定义任务依赖**

**优先级** ：支持流程实例和任务实例的优先级，如果流程实例和任务实例的优先级不设置，则默认是先进先出

**邮件告警**：支持 **SQL任务** 查询结果邮件发送，流程实例运行结果邮件告警及容错告警通知

**失败策略**：对于并行运行的任务，如果有任务失败，提供两种失败策略处理方式，**继续**是指不管并行运行任务的状态，直到流程失败结束。**结束**是指一旦发现失败任务，则同时Kill掉正在运行的并行任务，流程失败结束

**补数**：补历史数据，支持**区间并行**和**串行**两种补数方式，其日期选择方式包括**日期范围**和**日期枚举**两种

### 模块介绍

- dolphinscheduler-master master模块，提供工作流管理和编排服务。

- dolphinscheduler-worker worker模块，提供任务执行管理服务。

- dolphinscheduler-alert 告警模块，提供 AlertServer 服务。

- dolphinscheduler-api web应用模块，提供 ApiServer 服务。

- dolphinscheduler-common 通用的常量枚举、工具类、数据结构或者基类

- dolphinscheduler-dao 提供数据库访问等操作。

- dolphinscheduler-extract extract模块，包含master/worker/alert的sdk

- dolphinscheduler-service service模块，包含Quartz、Zookeeper、日志客户端访问服务，便于server模块和api模块调用

- dolphinscheduler-ui 前端模块


---

## about/hardware.md

# 软硬件环境建议配置

DolphinScheduler 作为一款开源分布式工作流任务调度系统，可以很好地部署和运行在 Intel 架构服务器及主流虚拟化环境下，并支持主流的Linux操作系统环境

## Linux 操作系统版本要求

| 操作系统                     |    版本     |
|:-------------------------|:---------:|
| Red Hat Enterprise Linux |  7.0 及以上  |
| CentOS                   |  7.0 及以上  |
| Oracle Enterprise Linux  |  7.0 及以上  |
| Ubuntu LTS               | 16.04 及以上 |

> **注意：**
> 以上 Linux 操作系统可运行在物理服务器以及 VMware、KVM、XEN 主流虚拟化环境上

## 服务器建议配置

DolphinScheduler 支持运行在 Intel x86-64 架构的 64 位通用硬件服务器平台。对生产环境的服务器硬件配置有以下建议：

### 生产环境

| **CPU** | **内存** | **硬盘类型** | **网络** | **实例数量** |
|---------|--------|----------|--------|----------|
| 4核+     | 8 GB+  | SAS      | 千兆网卡   | 1+       |

> **注意：**
> - 以上建议配置为部署 DolphinScheduler 的最低配置，生产环境强烈推荐使用更高的配置
> - 硬盘大小配置建议 50GB+ ，系统盘和数据盘分开

## 网络要求

DolphinScheduler正常运行提供如下的网络端口配置：

|          组件          | 默认端口  |        说明         |
|----------------------|-------|-------------------|
| MasterServer         | 5678  | 非通信端口，只需本机端口不冲突即可 |
| WorkerServer         | 1234  | 非通信端口，只需本机端口不冲突即可 |
| ApiApplicationServer | 12345 | 提供后端通信端口          |

> **注意：**
> - MasterServer 和 WorkerServer 不需要开启网络间通信，只需本机端口不冲突即可
> - 管理员可根据实际环境中 DolphinScheduler 组件部署方案，在网络侧和主机侧开放相关端口

## 客户端 Web 浏览器要求

DolphinScheduler 推荐 Chrome 以及使用 Chromium 内核的较新版本浏览器访问前端可视化操作界面

## 时钟同步

为避免可能影响任务执行的内部集群通信问题，请确保所有集群节点上的时钟与公共时钟源同步，例如使用 Chrony 和/或 NTP。 同步时间确保集群中的每个节点都有相同的时间


---

## about/introduction.md

# 关于DolphinScheduler

Apache DolphinScheduler 是一个分布式易扩展的可视化DAG工作流任务调度开源系统。适用于企业级场景，提供了一个可视化操作任务、工作流和全生命周期数据处理过程的解决方案。

Apache DolphinScheduler 旨在解决复杂的大数据任务依赖关系，并为应用程序提供数据和各种 OPS 编排中的关系。 解决数据研发ETL依赖错综复杂，无法监控任务健康状态的问题。
DolphinScheduler 以 DAG（Directed Acyclic Graph，DAG）流式方式组装任务，可以及时监控任务的执行状态，支持重试、指定节点恢复失败、暂停、恢复、终止任务等操作。

![Apache DolphinScheduler](../../img/introduction_ui.png)


---

## architecture/configuration.md

<!-- markdown-link-check-disable -->

# 前言

本文档为dolphinscheduler配置文件说明文档。

# 目录结构

DolphinScheduler的目录结构如下：

```
├── LICENSE
│
├── NOTICE
│
├── licenses                                    licenses存放目录
│
├── bin                                         DolphinScheduler命令和环境变量配置存放目录
│   ├── dolphinscheduler-daemon.sh              启动/关闭DolphinScheduler服务脚本
│   ├── env                                     环境变量配置存放目录
│   │   ├── dolphinscheduler_env.sh             当使用`dolphinscheduler-daemon.sh`脚本起停服务时，运行此脚本加载环境变量配置文件 [如：JAVA_HOME,HADOOP_HOME, HIVE_HOME ...]
│
├── alert-server                                DolphinScheduler alert-server命令、配置和依赖存放目录
│   ├── bin
│   │   └── start.sh                            DolphinScheduler alert-server启动脚本
│   │   └── jvm_args_env.sh                     DolphinScheduler alert-server jvm参数配置脚本
│   ├── conf
│   │   ├── application.yaml                    alert-server配置文件
│   │   ├── bootstrap.yaml                      Spring Cloud 启动阶段配置文件, 通常不需要修改
│   │   ├── common.properties                   公共服务（存储等信息）配置文件
│   │   ├── dolphinscheduler_env.sh             alert-server环境变量配置加载脚本
│   │   └── logback-spring.xml                  alert-service日志配置文件
│   └── libs                                    alert-server依赖jar包存放目录
│
├── api-server                                  DolphinScheduler api-server命令、配置和依赖存放目录
│   ├── bin
│   │   └── start.sh                            DolphinScheduler api-server启动脚本
│   │   └── jvm_args_env.sh                     DolphinScheduler api-server jvm参数配置脚本
│   ├── conf
│   │   ├── application.yaml                    api-server配置文件
│   │   ├── bootstrap.yaml                      Spring Cloud 启动阶段配置文件, 通常不需要修改
│   │   ├── common.properties                   公共服务（存储等信息）配置文件
│   │   ├── dolphinscheduler_env.sh             api-server环境变量配置加载脚本
│   │   └── logback-spring.xml                  api-service日志配置文件
│   ├── libs                                    api-server依赖jar包存放目录
│   └── ui                                      api-server相关前端WEB资源存放目录
│
├── master-server                               DolphinScheduler master-server命令、配置和依赖存放目录
│   ├── bin
│   │   └── start.sh                            DolphinScheduler master-server启动脚本
│   │   └── jvm_args_env.sh                     DolphinScheduler master-server jvm参数配置脚本
│   ├── conf
│   │   ├── application.yaml                    master-server配置文件
│   │   ├── bootstrap.yaml                      Spring Cloud 启动阶段配置文件, 通常不需要修改
│   │   ├── common.properties                   公共服务（存储等信息）配置文件
│   │   ├── dolphinscheduler_env.sh             master-server环境变量配置加载脚本
│   │   └── logback-spring.xml                  master-service日志配置文件
│   └── libs                                    master-server依赖jar包存放目录
│
├── standalone-server                           DolphinScheduler standalone-server命令、配置和依赖存放目录
│   ├── bin
│   │   └── start.sh                            DolphinScheduler standalone-server启动脚本
│   │   └── jvm_args_env.sh                     DolphinScheduler standalone-server jvm参数配置脚本
│   ├── conf
│   │   ├── application.yaml                    standalone-server配置文件
│   │   ├── bootstrap.yaml                      Spring Cloud 启动阶段配置文件, 通常不需要修改
│   │   ├── common.properties                   公共服务（存储等信息）配置文件
│   │   ├── dolphinscheduler_env.sh             standalone-server环境变量配置加载脚本
│   │   ├── logback-spring.xml                  standalone-service日志配置文件
│   │   └── sql                                 DolphinScheduler元数据创建/升级sql文件
│   ├── libs                                    standalone-server依赖jar包存放目录
│   └── ui                                      standalone-server相关前端WEB资源存放目录
│  
|
├── tools                                       DolphinScheduler元数据工具命令、配置和依赖存放目录
│   ├── bin
│   │   └── upgrade-schema.sh                   DolphinScheduler元数据创建/升级脚本
│   ├── conf
│   │   ├── application.yaml                    元数据工具配置文件
│   │   └── common.properties                   公共服务（存储等信息）配置文件
│   ├── libs                                    元数据工具依赖jar包存放目录
│   └── sql                                     DolphinScheduler元数据创建/升级sql文件
│  
|
├── worker-server                               DolphinScheduler worker-server命令、配置和依赖存放目录
│   ├── bin
│   │   └── start.sh                        DolphinScheduler worker-server 启动脚本
│   │   └── jvm_args_env.sh                 DolphinScheduler worker-server jvm参数配置脚本
│   ├── conf
│   │   ├── application.yaml                worker-server配置文件
│   │   ├── bootstrap.yaml                  Spring Cloud 启动阶段配置文件, 通常不需要修改
│   │   ├── common.properties               公共服务（存储等信息）配置文件
│   │   ├── dolphinscheduler_env.sh         worker-server环境变量配置加载脚本
│   │   └── logback-spring.xml              worker-service日志配置文件
│   └── libs                                worker-server依赖jar包存放目录
│
└── ui                                          前端WEB资源目录
```

# 配置文件详解

## dolphinscheduler-daemon.sh [启动/关闭DolphinScheduler服务脚本]

dolphinscheduler-daemon.sh脚本负责DolphinScheduler的启动&关闭.
start-all.sh/stop-all.sh最终也是通过dolphinscheduler-daemon.sh对集群进行启动/关闭操作.
目前DolphinScheduler只是做了一个基本的设置,JVM参数请根据各自资源的实际情况自行设置.

默认简化参数如下:

```bash
export DOLPHINSCHEDULER_OPTS="
-server
-Xmx16g
-Xms1g
-Xss512k
-XX:+UseConcMarkSweepGC
-XX:+CMSParallelRemarkEnabled
-XX:+UseFastAccessorMethods
-XX:+UseCMSInitiatingOccupancyOnly
-XX:CMSInitiatingOccupancyFraction=70
"
```

> 不建议设置"-XX:DisableExplicitGC" , DolphinScheduler使用Netty进行通讯,设置该参数,可能会导致内存泄漏.
>
>> 如果设置"-Djava.net.preferIPv6Addresses=true" 将会使用ipv6的IP地址， 如果设置"-Djava.net.preferIPv4Addresses=true"
>> 将会使用ipv4的IP地址, 如果都不设置，将会随机使用ipv4或者ipv6.

## 数据库连接相关配置

在DolphinScheduler中使用Spring Hikari对数据库连接进行管理，配置文件位置：

|     服务名称      |                 配置文件                  |
|---------------|---------------------------------------|
| Master Server | `master-server/conf/application.yaml` |
| Api Server    | `api-server/conf/application.yaml`    |
| Worker Server | `worker-server/conf/application.yaml` |
| Alert Server  | `alert-server/conf/application.yaml`  |

默认配置如下：

|                          参数                          |                        默认值                        |       描述        |
|------------------------------------------------------|---------------------------------------------------|-----------------|
| spring.datasource.driver-class-name                  | org.postgresql.Driver                             | 数据库驱动           |
| spring.datasource.url                                | jdbc:postgresql://127.0.0.1:5432/dolphinscheduler | 数据库连接地址         |
| spring.datasource.username                           | root                                              | 数据库用户名          |
| spring.datasource.password                           | root                                              | 数据库密码           |
| spring.datasource.hikari.connection-test-query       | select 1                                          | 检测连接是否有效的sql    |
| spring.datasource.hikari.minimum-idle                | 5                                                 | 最小空闲连接池数量       |
| spring.datasource.hikari.auto-commit                 | true                                              | 是否自动提交          |
| spring.datasource.hikari.pool-name                   | DolphinScheduler                                  | 连接池名称           |
| spring.datasource.hikari.maximum-pool-size           | 50                                                | 连接池最大连接数        |
| spring.datasource.hikari.connection-timeout          | 30000                                             | 连接超时时长          |
| spring.datasource.hikari.idle-timeout                | 600000                                            | 空闲连接存活最大时间      |
| spring.datasource.hikari.leak-detection-threshold    | 0                                                 | 连接泄露检测阈值        |
| spring.datasource.hikari.initialization-fail-timeout | 1                                                 | 连接池初始化失败timeout |

DolphinScheduler同样可以通过设置环境变量进行数据库连接相关的配置, 将以上小写字母转成大写并把`.`换成`_`作为环境变量名,
设置值即可。

## 注册中心相关配置

DolphinScheduler默认使用Zookeeper进行集群管理、容错、事件监听等功能，配置文件位置：
|服务名称| 配置文件 |
|--|--|
|Master Server | `master-server/conf/application.yaml`|
|Api Server| `api-server/conf/application.yaml`|
|Worker Server| `worker-server/conf/application.yaml`|

默认配置如下：

|                       参数                        |       默认值        |                                                                             描述                                                                             |
|-------------------------------------------------|------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| registry.zookeeper.namespace                    | dolphinscheduler | Zookeeper集群使用的namespace                                                                                                                                    |
| registry.zookeeper.connect-string               | localhost:2181   | Zookeeper集群连接信息                                                                                                                                            |
| registry.zookeeper.retry-policy.base-sleep-time | 60ms             | 基本重试时间差                                                                                                                                                    |
| registry.zookeeper.retry-policy.max-sleep       | 300ms            | 最大重试时间                                                                                                                                                     |
| registry.zookeeper.retry-policy.max-retries     | 5                | 最大重试次数                                                                                                                                                     |
| registry.zookeeper.session-timeout              | 30s              | session超时时间                                                                                                                                                |
| registry.zookeeper.connection-timeout           | 30s              | 连接超时时间                                                                                                                                                     |
| registry.zookeeper.block-until-connected        | 600ms            | 阻塞直到连接成功的等待时间                                                                                                                                              |
| registry.zookeeper.digest                       | {用户名:密码}         | 如果zookeeper打开了acl，则需要填写认证信息访问znode，认证信息格式为{用户名}:{密码}。关于Zookeeper ACL详见[https://zookeeper.apache.org/doc/r3.4.14/zookeeperAdmin.html](Apache Zookeeper官方文档) |

DolphinScheduler同样可以通过`bin/env/dolphinscheduler_env.sh`进行Zookeeper相关的配置。

如果使用etcd作为注册中心，详细请参考[链接](https://github.com/apache/dolphinscheduler/blob/dev/dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-etcd/README.md)。
如果使用jdbc作为注册中心，详细请参考[链接](https://github.com/apache/dolphinscheduler/blob/dev/dolphinscheduler-registry/dolphinscheduler-registry-plugins/dolphinscheduler-registry-jdbc/README.md)。

## common.properties [hadoop、s3、yarn配置]

common.properties配置文件目前主要是配置hadoop/s3/yarn/applicationId收集相关的配置，配置文件位置：
|服务名称| 配置文件 |
|--|--|
|Master Server | `master-server/conf/common.properties`|
|Api Server| `api-server/conf/common.properties`|
|Worker Server| `worker-server/conf/common.properties`|
|Alert Server| `alert-server/conf/common.properties`|

默认配置如下：

|                      参数                       |                       默认值                        | 描述                                                                                                                                                                                                                   |
|-----------------------------------------------|--------------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| data.basedir.path                             | /tmp/dolphinscheduler                            | 本地工作目录,用于存放临时文件                                                                                                                                                                                                      |
| resource.storage.type                         | NONE                                             | 资源文件存储类型: HDFS,S3,OSS,GCS,ABS,NONE                                                                                                                                                                                   |
| resource.upload.path                          | /dolphinscheduler                                | 资源文件存储路径                                                                                                                                                                                                             |
| aws.access.key.id                             | minioadmin                                       | S3 access key                                                                                                                                                                                                        |
| aws.secret.access.key                         | minioadmin                                       | S3 secret access key                                                                                                                                                                                                 |
| aws.region                                    | us-east-1                                        | S3 区域                                                                                                                                                                                                                |
| aws.s3.endpoint                               | http://minio:9000                                | S3 endpoint地址                                                                                                                                                                                                        |
| hdfs.root.user                                | hdfs                                             | 如果存储类型为HDFS,需要配置拥有对应操作权限的用户                                                                                                                                                                                          |
| fs.defaultFS                                  | hdfs://mycluster:8020                            | 请求地址如果resource.storage.type=S3,该值类似为: s3a://dolphinscheduler. 如果resource.storage.type=HDFS, 如果 hadoop 配置了 HA,需要复制core-site.xml 和 hdfs-site.xml 文件到conf目录                                                             |
| hadoop.security.authentication.startup.state  | false                                            | hadoop是否开启kerberos权限                                                                                                                                                                                                 |
| java.security.krb5.conf.path                  | /opt/krb5.conf                                   | kerberos配置目录                                                                                                                                                                                                         |
| login.user.keytab.username                    | hdfs-mycluster@ESZ.COM                           | kerberos登录用户                                                                                                                                                                                                         |
| login.user.keytab.path                        | /opt/hdfs.headless.keytab                        | kerberos登录用户keytab                                                                                                                                                                                                   |
| kerberos.expire.time                          | 2                                                | kerberos过期时间,整数,单位为小时                                                                                                                                                                                                |
| yarn.resourcemanager.ha.rm.ids                | 192.168.xx.xx,192.168.xx.xx                      | yarn resourcemanager 地址, 如果resourcemanager开启了HA, 输入HA的IP地址(以逗号分隔),如果resourcemanager为单节点, 该值为空即可                                                                                                                      |
| yarn.application.status.address               | http://ds1:8088/ws/v1/cluster/apps/%s            | 如果resourcemanager开启了HA或者没有使用resourcemanager,保持默认值即可. 如果resourcemanager为单节点,你需要将ds1 配置为resourcemanager对应的hostname                                                                                                     |
| development.state                             | false                                            | 是否处于开发模式                                                                                                                                                                                                             |
| dolphin.scheduler.network.interface.preferred | NONE                                             | 将会被使用的网卡名称                                                                                                                                                                                                           |
| dolphin.scheduler.network.interface.restrict  | NONE                                             | 禁止使用的网卡名称                                                                                                                                                                                                            |
| dolphin.scheduler.network.priority.strategy   | default                                          | ip获取策略 default优先获取内网                                                                                                                                                                                                 |
| resource.manager.httpaddress.port             | 8088                                             | resource manager的端口                                                                                                                                                                                                  |
| yarn.job.history.status.address               | http://ds1:19888/ws/v1/history/mapreduce/jobs/%s | yarn的作业历史状态URL                                                                                                                                                                                                       |
| datasource.encryption.enable                  | false                                            | 是否启用datasource 加密                                                                                                                                                                                                    |
| datasource.encryption.salt                    | !@#$%^&*                                         | datasource加密使用的salt                                                                                                                                                                                                  |
| support.hive.oneSession                       | false                                            | 设置hive SQL是否在同一个session中执行                                                                                                                                                                                           |
| sudo.enable                                   | true                                             | 是否开启sudo                                                                                                                                                                                                             |
| zeppelin.rest.url                             | http://localhost:8080                            | zeppelin RESTful API 接口地址                                                                                                                                                                                            |
| appId.collect                                 | log                                              | 收集applicationId方式， 如果用aop方法，将配置log替换为aop，并将`bin/env/dolphinscheduler_env.sh`自动收集applicationId相关环境变量配置的注释取消掉，注意：aop不支持远程主机提交yarn作业的方式比如Beeline客户端提交，且如果用户环境覆盖了dolphinscheduler_env.sh收集applicationId相关环境变量配置，aop方法会失效 |

## Api-server相关配置

位置：`api-server/conf/application.yaml`

|                          参数                           |                 默认值                  |                       描述                        |
|-------------------------------------------------------|--------------------------------------|-------------------------------------------------|
| server.port                                           | 12345                                | api服务通讯端口                                       |
| server.servlet.session.timeout                        | 120m                                 | session超时时间                                     |
| server.servlet.context-path                           | /dolphinscheduler/                   | 请求路径                                            |
| spring.servlet.multipart.max-file-size                | 1024MB                               | 最大上传文件大小                                        |
| spring.servlet.multipart.max-request-size             | 1024MB                               | 最大请求大小                                          |
| server.jetty.max-http-post-size                       | 5000000                              | jetty服务最大发送请求大小                                 |
| spring.banner.charset                                 | UTF-8                                | 请求编码                                            |
| spring.jackson.time-zone                              | UTC                                  | 设置时区                                            |
| spring.jackson.date-format                            | "yyyy-MM-dd HH:mm:ss"                | 设置时间格式                                          |
| spring.messages.basename                              | i18n/messages                        | i18n配置                                          |
| security.authentication.type                          | PASSWORD                             | 权限校验类型                                          |
| security.authentication.ldap.user.admin               | read-only-admin                      | LDAP登陆时，系统管理员账号                                 |
| security.authentication.ldap.urls                     | ldap://ldap.forumsys.com:389/        | LDAP urls                                       |
| security.authentication.ldap.base.dn                  | dc=example,dc=com                    | LDAP base dn                                    |
| security.authentication.ldap.username                 | cn=read-only-admin,dc=example,dc=com | LDAP账号                                          |
| security.authentication.ldap.password                 | password                             | LDAP密码                                          |
| security.authentication.ldap.user.identity-attribute  | uid                                  | LDAP用户身份标识字段名                                   |
| security.authentication.ldap.user.email-attribute     | mail                                 | LDAP邮箱字段名                                       |
| security.authentication.ldap.user.not-exist-action    | CREATE                               | 当通过LDAP登陆时用户不存在的操作，默认值是: CREATE，可选值:CREATE、DENY |
| security.authentication.ldap.ssl.enable               | false                                | LDAP ssl开关                                      |
| security.authentication.ldap.ssl.trust-store          | ldapkeystore.jks                     | LDAP jks文件绝对路径                                  |
| security.authentication.ldap.ssl.trust-store-password | password                             | LDAP jks密码                                      |
| security.authentication.casdoor.user.admin            |                                      | Casdoor登陆时，系统管理员账号                              |
| casdoor.endpoint                                      |                                      | Casdoor服务器URL                                   |
| casdoor.client-id                                     |                                      | Casdoor中的ID                                     |
| casdoor.client-secret                                 |                                      | Casdoor中的密钥                                     |
| casdoor.certificate                                   |                                      | Casdoor中的证书                                     |
| casdoor.organization-name                             |                                      | Casdoor中的组织名称                                   |
| casdoor.application-name                              |                                      | Casdoor中的应用名称                                   |
| casdoor.redirect-url                                  |                                      | dolphinscheduler登录URL                           |
| api.traffic.control.global.switch                     | false                                | 流量控制全局开关                                        |
| api.traffic.control.max-global-qps-rate               | 300                                  | 全局最大请求数/秒                                       |
| api.traffic.control.tenant-switch                     | false                                | 流量控制租户开关                                        |
| api.traffic.control.default-tenant-qps-rate           | 10                                   | 默认租户最大请求数/秒限制                                   |
| api.traffic.control.customize-tenant-qps-rate         |                                      | 自定义租户最大请求数/秒限制                                  |

## Master Server相关配置

位置：`master-server/conf/application.yaml`

|                                     参数                                      |             默认值              |                                           描述                                            |
|-----------------------------------------------------------------------------|------------------------------|-----------------------------------------------------------------------------------------|
| master.listen-port                                                          | 5678                         | master监听端口                                                                              |
| master.pre-exec-threads                                                     | 10                           | master准备执行任务的数量，用于限制并行的command                                                          |
| master.exec-threads                                                         | 100                          | master工作线程数量,用于限制并行的流程实例数量                                                              |
| master.dispatch-task-number                                                 | 3                            | master每个批次的派发任务数量                                                                       |
| master.worker-load-balancer-configuration-properties.type                   | DYNAMIC_WEIGHTED_ROUND_ROBIN | Master 将会使用Worker的动态CPU/Memory/线程池使用率来计算Worker的负载，负载越低的worker将会有更高的机会被分发任务              |
| master.max-heartbeat-interval                                               | 10s                          | master最大心跳间隔                                                                            |
| master.task-commit-retry-times                                              | 5                            | 任务重试次数                                                                                  |
| master.task-commit-interval                                                 | 1000                         | 任务提交间隔,单位为毫秒                                                                            |
| master.state-wheel-interval                                                 | 5                            | 轮询检查状态时间                                                                                |
| master.server-load-protection.enabled                                       | true                         | 是否开启系统保护策略                                                                              |
| master.server-load-protection.max-system-cpu-usage-percentage-thresholds    | 0.7                          | master最大系统cpu使用值,只有当前系统cpu使用值低于最大系统cpu使用值,master服务才能调度任务. 默认值为0.7: 会使用70%的操作系统CPU       |
| master.server-load-protection.max-jvm-cpu-usage-percentage-thresholds       | 0.7                          | master最大JVM cpu使用值,只有当前JVM cpu使用值低于最大JVM cpu使用值,master服务才能调度任务. 默认值为0.7: 会使用70%的JVM CPU |
| master.server-load-protection.max-system-memory-usage-percentage-thresholds | 0.7                          | master最大系统 内存使用值,只有当前系统内存使用值低于最大系统内存使用值,master服务才能调度任务. 默认值为0.7: 会使用70%的操作系统内存          |
| master.server-load-protection.max-disk-usage-percentage-thresholds          | 0.7                          | master最大系统磁盘使用值,只有当前系统磁盘使用值低于最大系统磁盘使用值,master服务才能调度任务. 默认值为0.7: 会使用70%的操作系统磁盘空间         |
| master.server-load-protection.max-concurrent-workflow-instances             | 2147483647                   | Master最大并发工作流实例数. 当Master的工作流实例数达到或超过此值时，Master服务将被标记为繁忙.                               |
| master.failover-interval                                                    | 10                           | failover间隔，单位为分钟                                                                        |
| master.kill-application-when-task-failover                                  | true                         | 当任务实例failover时，是否kill掉yarn或k8s application                                              |
| master.master.worker-group-refresh-interval                                 | 10s                          | 定期将workerGroup从数据库中同步到内存的时间间隔                                                           |
| master.command-fetch-strategy.type                                          | ID_SLOT_BASED                | Command拉取策略, 目前仅支持 `ID_SLOT_BASED`                                                      |
| master.command-fetch-strategy.config.id-step                                | 1                            | 数据库中t_ds_command的id自增步长                                                                 |
| master.command-fetch-strategy.config.fetch-size                             | 10                           | master拉取command数量                                                                       |

## Worker Server相关配置

位置：`worker-server/conf/application.yaml`

|                                     参数                                      |    默认值    |                                           描述                                            |
|-----------------------------------------------------------------------------|-----------|-----------------------------------------------------------------------------------------|
| worker.listen-port                                                          | 1234      | worker监听端口                                                                              |
| worker.max-heartbeat-interval                                               | 10s       | worker最大心跳间隔                                                                            |
| worker.host-weight                                                          | 100       | 派发任务时，worker主机的权重                                                                       |
| worker.tenant-auto-create                                                   | true      | 租户对应于系统的用户,由worker提交作业.如果系统没有该用户,则在参数worker.tenant.auto.create为true后自动创建。               |
| worker.server-load-protection.enabled                                       | true      | 是否开启系统保护策略                                                                              |
| worker.server-load-protection.max-system-cpu-usage-percentage-thresholds    | 0.8       | worker最大系统cpu使用值,只有当前系统cpu使用值低于最大系统cpu使用值,worker服务才能接收任务. 默认值为0.8: 会使用80%的操作系统CPU       |
| worker.server-load-protection.max-jvm-cpu-usage-percentage-thresholds       | 0.8       | worker最大JVM cpu使用值,只有当前JVM cpu使用值低于最大JVM cpu使用值,worker服务才能接收任务. 默认值为0.8: 会使用80%的JVM CPU |
| worker.server-load-protection.max-system-memory-usage-percentage-thresholds | 0.8       | worker最大系统 内存使用值,只有当前系统内存使用值低于最大系统内存使用值,worker服务才能接收任务. 默认值为0.8: 会使用80%的操作系统内存          |
| worker.server-load-protection.max-disk-usage-percentage-thresholds          | 0.8       | worker最大系统磁盘使用值,只有当前系统磁盘使用值低于最大系统磁盘使用值,worker服务才能接收任务. 默认值为0.8: 会使用80%的操作系统磁盘空间         |
| worker.alert-listen-host                                                    | localhost | alert监听host                                                                             |
| worker.alert-listen-port                                                    | 50052     | alert监听端口                                                                               |
| worker.physical-task-config.task-executor-thread-size                       | 100       | Worker中任务最大并发度                                                                          |
| worker.tenant-config.auto-create-tenant-enabled                             | true      | 租户对应于系统的用户,由worker提交作业.如果系统没有该用户,则在参数worker.tenant.auto.create为true后自动创建。               |
| worker.tenant-config.default-tenant-enabled                                 | false     | 如果设置为true, 将会使用worker服务启动用户作为 `default` 租户。                                             |

## Alert Server相关配置

位置：`alert-server/conf/application.yaml`

|     参数      |  默认值  |        描述        |
|-------------|-------|------------------|
| server.port | 50053 | Alert Server监听端口 |
| alert.port  | 50052 | alert监听端口        |

## Quartz相关配置

这里面主要是quartz配置,请结合实际业务场景&资源进行配置,本文暂时不做展开，配置文件位置：

|     服务名称      |                 配置文件                  |
|---------------|---------------------------------------|
| Master Server | `master-server/conf/application.yaml` |
| Api Server    | `api-server/conf/application.yaml`    |

默认配置如下：

|                                   参数                                    |                       默认值                       |
|-------------------------------------------------------------------------|-------------------------------------------------|
| spring.quartz.properties.org.quartz.jobStore.isClustered                | true                                            |
| spring.quartz.properties.org.quartz.jobStore.class                      | org.quartz.impl.jdbcjobstore.JobStoreTX         |
| spring.quartz.properties.org.quartz.scheduler.instanceId                | AUTO                                            |
| spring.quartz.properties.org.quartz.jobStore.tablePrefix                | QRTZ_                                           |
| spring.quartz.properties.org.quartz.jobStore.acquireTriggersWithinLock  | true                                            |
| spring.quartz.properties.org.quartz.scheduler.instanceName              | DolphinScheduler                                |
| spring.quartz.properties.org.quartz.jobStore.useProperties              | false                                           |
| spring.quartz.properties.org.quartz.jobStore.misfireThreshold           | 60000                                           |
| spring.quartz.properties.org.quartz.scheduler.makeSchedulerThreadDaemon | true                                            |
| spring.quartz.properties.org.quartz.jobStore.driverDelegateClass        | org.quartz.impl.jdbcjobstore.PostgreSQLDelegate |
| spring.quartz.properties.org.quartz.jobStore.clusterCheckinInterval     | 5000                                            |

上述配置项在*Master Server* 和 *Api Server*是相同的，但他们的Quartz线程池配置部分却是不一样的。
*Master Server* 的Quartz线程池默认配置如下：

|                            Parameters                             |           Default value           |
|-------------------------------------------------------------------|-----------------------------------|
| spring.quartz.properties.org.quartz.threadPool.makeThreadsDaemons | true                              |
| spring.quartz.properties.org.quartz.threadPool.threadCount        | 25                                |
| spring.quartz.properties.org.quartz.threadPool.threadPriority     | 5                                 |
| spring.quartz.properties.org.quartz.threadPool.class              | org.quartz.simpl.SimpleThreadPool |

因为*Api Server*不会启动*Quartz Scheduler*
实例，只会作为Scheduler客户端使用，因此它的Quartz线程池将会使用`QuartzZeroSizeThreadPool`。`QuartzZeroSizeThreadPool`
不会启动任何线程。具体的默认配置如下：

|                      Parameters                      |                             Default value                             |
|------------------------------------------------------|-----------------------------------------------------------------------|
| spring.quartz.properties.org.quartz.threadPool.class | org.apache.dolphinscheduler.scheduler.quartz.QuartzZeroSizeThreadPool |

## dolphinscheduler_env.sh [环境变量配置]

通过类似shell方式提交任务的的时候，会加载该配置文件中的环境变量到主机中。涉及到的 `JAVA_HOME`
任务类型的环境配置，其中任务类型主要有: Shell任务、Python任务、Spark任务、Flink任务、Datax任务等等。

```bash
# JAVA_HOME, will use it to start DolphinScheduler server
export JAVA_HOME=${JAVA_HOME:-/opt/soft/java}

# Tasks related configurations, need to change the configuration if you use the related tasks.
export HADOOP_HOME=${HADOOP_HOME:-/opt/soft/hadoop}
export HADOOP_CONF_DIR=${HADOOP_CONF_DIR:-/opt/soft/hadoop/etc/hadoop}
export SPARK_HOME=${SPARK_HOME:-/opt/soft/spark}
export PYTHON_LAUNCHER=${PYTHON_LAUNCHER:-/opt/soft/python}
export HIVE_HOME=${HIVE_HOME:-/opt/soft/hive}
export FLINK_HOME=${FLINK_HOME:-/opt/soft/flink}
export DATAX_LAUNCHER=${DATAX_LAUNCHER:-/opt/soft/datax/bin/datax.py}

export PATH=$HADOOP_HOME/bin:$SPARK_HOME/bin:$PYTHON_LAUNCHER:$JAVA_HOME/bin:$HIVE_HOME/bin:$FLINK_HOME/bin:$DATAX_LAUNCHER:$PATH

# applicationId auto collection related configuration, the following configurations are unnecessary if setting appId.collect=log
export HADOOP_CLASSPATH=`hadoop classpath`:${DOLPHINSCHEDULER_HOME}/tools/libs/*
export SPARK_DIST_CLASSPATH=$HADOOP_CLASSPATH:$SPARK_DIST_CLASS_PATH
export HADOOP_CLIENT_OPTS="-javaagent:${DOLPHINSCHEDULER_HOME}/tools/libs/aspectjweaver-1.9.7.jar":$HADOOP_CLIENT_OPTS
export SPARK_SUBMIT_OPTS="-javaagent:${DOLPHINSCHEDULER_HOME}/tools/libs/aspectjweaver-1.9.7.jar":$SPARK_SUBMIT_OPTS
export FLINK_ENV_JAVA_OPTS="-javaagent:${DOLPHINSCHEDULER_HOME}/tools/libs/aspectjweaver-1.9.7.jar":$FLINK_ENV_JAVA_OPTS
```

## 日志相关配置

|     服务名称      |                  配置文件                   |
|---------------|-----------------------------------------|
| Master Server | `master-server/conf/logback-spring.xml` |
| Api Server    | `api-server/conf/logback-spring.xml`    |
| Worker Server | `worker-server/conf/logback-spring.xml` |
| Alert Server  | `alert-server/conf/logback-spring.xml`  |


---

## architecture/design.md

# 系统架构设计

## 系统架构

### 系统架构图

<p align="center">
  <img src="../../../img/architecture-1.3.0.jpg" alt="系统架构图"  width="70%" />
  <p align="center">
        <em>系统架构图</em>
  </p>
</p>

### 启动流程活动图

<p align="center">
  <img src="../../../img/process-start-flow-1.3.0.png" alt="启动流程活动图"  width="70%" />
  <p align="center">
        <em>启动流程活动图</em>
  </p>
</p>

### 架构说明

* **MasterServer**

  MasterServer采用分布式无中心设计理念，MasterServer主要负责 DAG 任务切分、任务提交监控，并同时监听其它MasterServer和WorkerServer的健康状态。
  MasterServer服务启动时向Zookeeper注册临时节点，通过监听Zookeeper临时节点变化来进行容错处理。
  MasterServer基于netty提供监听服务。

  ##### 该服务内主要包含:

  - **DistributedQuartz**分布式调度组件，主要负责定时任务的启停操作，当quartz调起任务后，Master内部会有线程池具体负责处理任务的后续操作；

  - **MasterSchedulerService**是一个扫描线程，定时扫描数据库中的`t_ds_command`表，根据不同的命令类型进行不同的业务操作；

  - **WorkflowExecuteRunnable**主要是负责DAG任务切分、任务提交监控、各种不同事件类型的逻辑处理；

  - **TaskExecuteRunnable**主要负责任务的处理和持久化，并生成任务事件提交到工作流的事件队列；

  - **EventExecuteService**主要负责工作流实例的事件队列的轮询；

  - **StateWheelExecuteThread**主要负责工作流和任务超时、任务重试、任务依赖的轮询，并生成对应的工作流或任务事件提交到工作流的事件队列；

  - **FailoverExecuteThread**主要负责Master容错和Worker容错的相关逻辑；

* **WorkerServer**

  WorkerServer也采用分布式无中心设计理念，WorkerServer主要负责任务的执行和提供日志服务。
  WorkerServer服务启动时向Zookeeper注册临时节点，并维持心跳。
  WorkerServer基于netty提供监听服务。

  ##### 该服务包含：

  - **WorkerManagerThread**主要负责任务队列的提交，不断从任务队列中领取任务，提交到线程池处理；

  - **TaskExecuteThread**主要负责任务执行的流程，根据不同的任务类型进行任务的实际处理；

  - **RetryReportTaskStatusThread**主要负责定时轮询向Master汇报任务的状态，直到Master回复状态的ack，避免任务状态丢失；

* **ZooKeeper**

  ZooKeeper服务，系统中的MasterServer和WorkerServer节点都通过ZooKeeper来进行集群管理和容错。另外系统还基于ZooKeeper进行事件监听和分布式锁。
  我们也曾经基于Redis实现过队列，不过我们希望DolphinScheduler依赖到的组件尽量地少，所以最后还是去掉了Redis实现。

* **AlertServer**

  提供告警服务，通过告警插件的方式实现丰富的告警手段。

* **ApiServer**

  API接口层，主要负责处理前端UI层的请求。该服务统一提供RESTful api向外部提供请求服务。

* **UI**

  系统的前端页面，提供系统的各种可视化操作界面。

### 架构设计思想

#### 一、去中心化vs中心化

##### 中心化思想

中心化的设计理念比较简单，分布式集群中的节点按照角色分工，大体上分为两种角色：

<p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/master_slave.png" alt="master-slave角色"  width="50%" />
 </p>

- Master的角色主要负责任务分发并监督Slave的健康状态，可以动态的将任务均衡到Slave上，以致Slave节点不至于“忙死”或”闲死”的状态。
- Worker的角色主要负责任务的执行工作并维护和Master的心跳，以便Master可以分配任务给Slave。

中心化思想设计存在的问题：

- 一旦Master出现了问题，则群龙无首，整个集群就会崩溃。为了解决这个问题，大多数Master/Slave架构模式都采用了主备Master的设计方案，可以是热备或者冷备，也可以是自动切换或手动切换，而且越来越多的新系统都开始具备自动选举切换Master的能力,以提升系统的可用性。
- 另外一个问题是如果Scheduler在Master上，虽然可以支持一个DAG中不同的任务运行在不同的机器上，但是会产生Master的过负载。如果Scheduler在Slave上，则一个DAG中所有的任务都只能在某一台机器上进行作业提交，则并行任务比较多的时候，Slave的压力可能会比较大。

##### 去中心化

 <p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/decentralization.png" alt="去中心化"  width="50%" />
 </p>

- 在去中心化设计里，通常没有Master/Slave的概念，所有的角色都是一样的，地位是平等的，全球互联网就是一个典型的去中心化的分布式系统，联网的任意节点设备down机，都只会影响很小范围的功能。
- 去中心化设计的核心设计在于整个分布式系统中不存在一个区别于其他节点的”管理者”，因此不存在单点故障问题。但由于不存在” 管理者”节点所以每个节点都需要跟其他节点通信才得到必须要的机器信息，而分布式系统通信的不可靠性，则大大增加了上述功能的实现难度。
- 实际上，真正去中心化的分布式系统并不多见。反而动态中心化分布式系统正在不断涌出。在这种架构下，集群中的管理者是被动态选择出来的，而不是预置的，并且集群在发生故障的时候，集群的节点会自发的举行"会议"来选举新的"管理者"去主持工作。最典型的案例就是ZooKeeper及Go语言实现的Etcd。
- DolphinScheduler的去中心化是Master/Worker注册心跳到Zookeeper中，Master基于slot处理各自的Command，通过selector分发任务给worker，实现Master集群和Worker集群无中心。

#### 二、容错设计

容错分为服务宕机容错和任务重试，服务宕机容错又分为Master容错和Worker容错两种情况

##### 宕机容错

服务容错设计依赖于ZooKeeper的Watcher机制，实现原理如图：

 <p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/fault-tolerant.png" alt="DolphinScheduler容错设计"  width="40%" />
 </p>
其中Master监控其他Master和Worker的目录，如果监听到remove事件，则会根据具体的业务逻辑进行流程实例容错或者任务实例容错。

- Master容错流程：

<p align="center">
   <img src="../../../img/failover-master.jpg" alt="容错流程"  width="50%" />
 </p>

容错范围：从host的维度来看，Master的容错范围包括：自身host+注册中心上不存在的节点host，容错的整个过程会加锁；

容错内容：Master的容错内容包括：容错工作流实例和任务实例，在容错前会比较实例的开始时间和服务节点的启动时间，在服务启动时间之后的则跳过容错；

容错后处理：ZooKeeper Master容错完成之后则重新由DolphinScheduler中Scheduler线程调度，遍历 DAG 找到”正在运行”和“提交成功”的任务，对”正在运行”的任务监控其任务实例的状态，对”提交成功”的任务需要判断Task Queue中是否已经存在，如果存在则同样监控任务实例的状态，如果不存在则重新提交任务实例。

- Worker容错流程：

<p align="center">
   <img src="../../../img/failover-worker.jpg" alt="容错流程"  width="50%" />
 </p>

容错范围：从工作流实例的维度看，每个Master只负责容错自己的工作流实例；只有在`handleDeadServer`时会加锁；

容错内容：当发送Worker节点的remove事件时，Master只容错任务实例，在容错前会比较实例的开始时间和服务节点的启动时间，在服务启动时间之后的则跳过容错；

容错后处理：Master Scheduler线程一旦发现任务实例为” 需要容错”状态，则接管任务并进行重新提交。

注意：由于” 网络抖动”可能会使得节点短时间内失去和ZooKeeper的心跳，从而发生节点的remove事件。对于这种情况，我们使用最简单的方式，那就是节点一旦和ZooKeeper发生超时连接，则直接将Master或Worker服务停掉。

##### 三、任务失败重试

这里首先要区分任务失败重试、流程失败恢复、流程失败重跑的概念：

- 任务失败重试是任务级别的，是调度系统自动进行的，比如一个Shell任务设置重试次数为3次，那么在Shell任务运行失败后会自己再最多尝试运行3次
- 流程失败恢复是流程级别的，是手动进行的，恢复是从只能**从失败的节点开始执行**或**从当前节点开始执行**
- 流程失败重跑也是流程级别的，是手动进行的，重跑是从开始节点进行

接下来说正题，我们将工作流中的任务节点分了两种类型。

- 一种是业务节点，这种节点都对应一个实际的脚本或者处理语句，比如Shell节点、SQL节点、Spark节点等。

- 还有一种是逻辑节点，这种节点不做实际的脚本或语句处理，只是整个流程流转的逻辑处理，比如依赖节点、子流程节点等。

**业务节点**都可以配置失败重试的次数，当该任务节点失败，会自动重试，直到成功或者超过配置的重试次数。**逻辑节点**不支持失败重试。

如果工作流中有任务失败达到最大重试次数，工作流就会失败停止，失败的工作流可以手动进行重跑操作或者流程恢复操作。

#### 四、任务优先级设计

在早期调度设计中，如果没有优先级设计，采用公平调度设计的话，会遇到先行提交的任务可能会和后继提交的任务同时完成的情况，而不能做到设置流程或者任务的优先级，因此我们对此进行了重新设计，目前我们设计如下：

- 按照**不同流程实例优先级**优先于**同一个流程实例优先级**优先于**同一流程内任务优先级**优先于**同一流程内任务**提交顺序依次从高到低进行任务处理。
  - 具体实现是根据任务实例的json解析优先级，然后把**流程实例优先级_流程实例id_任务优先级_任务id**信息保存在ZooKeeper任务队列中，当从任务队列获取的时候，通过字符串比较即可得出最需要优先执行的任务
    - 其中流程定义的优先级是考虑到有些流程需要先于其他流程进行处理，这个可以在流程启动或者定时启动时配置，共有5级，依次为HIGHEST、HIGH、MEDIUM、LOW、LOWEST。如下图

        <p align="center">
           <img src="https://analysys.github.io/easyscheduler_docs_cn/images/process_priority.png" alt="流程优先级配置"  width="40%" />
         </p>

    - 任务的优先级也分为5级，依次为HIGHEST、HIGH、MEDIUM、LOW、LOWEST。如下图

        <p align="center">
           <img src="https://analysys.github.io/easyscheduler_docs_cn/images/task_priority.png" alt="任务优先级配置"  width="35%" />
         </p>

#### 五、Logback和netty实现日志访问

- 由于Web(UI)和Worker不一定在同一台机器上，所以查看日志不能像查询本地文件那样。有两种方案：
- 将日志放到ES搜索引擎上
- 通过netty通信获取远程日志信息
- 介于考虑到尽可能的DolphinScheduler的轻量级性，所以选择了gRPC实现远程访问日志信息。

 <p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/grpc.png" alt="grpc远程访问"  width="50%" />
 </p>

- 详情可参考Master和Worker的logback配置，如下示例：

```xml
<conversionRule conversionWord="message" converterClass="org.apache.dolphinscheduler.plugin.task.api.log.SensitiveDataConverter"/>
<appender name="TASKLOGFILE" class="ch.qos.logback.classic.sift.SiftingAppender">
    <filter class="org.apache.dolphinscheduler.plugin.task.api.log.TaskLogFilter"/>
    <Discriminator class="org.apache.dolphinscheduler.plugin.task.api.log.TaskLogDiscriminator">
        <key>taskAppId</key>
        <logBase>${log.base}</logBase>
    </Discriminator>
    <sift>
        <appender name="FILE-${taskAppId}" class="ch.qos.logback.core.FileAppender">
            <file>${log.base}/${taskAppId}.log</file>
            <encoder>
                <pattern>
                            [%level] %date{yyyy-MM-dd HH:mm:ss.SSS Z} [%thread] %logger{96}:[%line] - %message%n
                </pattern>
                <charset>UTF-8</charset>
            </encoder>
            <append>true</append>
        </appender>
    </sift>
</appender>
```

## 总结

本文从调度出发，初步介绍了大数据分布式工作流调度系统--DolphinScheduler的架构原理及实现思路。未完待续


---

## architecture/load-balance.md

### 负载均衡

负载均衡即通过路由算法（通常是集群环境），合理的分摊服务器压力，达到服务器性能的最大优化。

### DolphinScheduler-Worker 负载均衡算法

DolphinScheduler-Master 分配任务至 worker,默认提供了三种算法:

加权随机（random）

平滑轮询（roundrobin）

线性负载（lowerweight）

默认配置为线性加权负载。

由于路由是在客户端做的，即 master 服务，因此你可以更改 master.properties 中的 master.host.selector 来配置你所想要的算法。

eg：master.host.selector=random（不区分大小写）

### Worker 负载均衡配置

配置文件 worker.properties

#### 权重

上述所有的负载算法都是基于权重来进行加权分配的，权重影响分流结果。你可以在 修改 worker.weight 的值来给不同的机器设置不同的权重。

#### 预热

考虑到 JIT 优化，我们会让 worker 在启动后低功率的运行一段时间，使其逐渐达到最佳状态，这段过程我们称之为预热。感兴趣的同学可以去阅读 JIT 相关的文章。

因此 worker 在启动后，他的权重会随着时间逐渐达到最大（默认十分钟，我们没有提供配置项，如果需要，你可以修改并提交相关的 PR）。

### 负载均衡算法细述

#### 随机（加权）

该算法比较简单，即在符合的 worker 中随机选取一台（权重会影响他的比重）。

#### 平滑轮询（加权）

加权轮询算法一个明显的缺陷。即在某些特殊的权重下，加权轮询调度会生成不均匀的实例序列，这种不平滑的负载可能会使某些实例出现瞬时高负载的现象，导致系统存在宕机的风险。为了解决这个调度缺陷，我们提供了平滑加权轮询算法。

每台 worker 都有两个权重，即 weight（预热完成后保持不变），current_weight（动态变化），每次路由。都会遍历所有的 worker，使其 current_weight+weight，同时累加所有 worker 的 weight，计为  total_weight，然后挑选 current_weight 最大的作为本次执行任务的 worker，与此同时，将这台 worker 的 current_weight-total_weight。

#### 线性加权(默认算法)

该算法每隔一段时间会向注册中心上报自己的负载信息。我们主要根据CPU使用率、内存使用率以及 worker slot 使用情况来进行判断

如果任何一个低于配置项，那么这台 worker 将不参与负载。（即不分配流量）


---

## architecture/metadata.md

# DolphinScheduler 元数据文档

## 表Schema

详见`dolphinscheduler/dolphinscheduler-dao/src/main/resources/sql`目录下的sql文件

## E-R图

### 用户	队列	数据源

![image.png](../../img/metadata-erd/user-queue-datasource.png)

- 一个租户下可以有多个用户；<br />
- `t_ds_user`中的queue字段存储的是队列表中的`queue_name`信息，`t_ds_tenant`下存的是`queue_id`，在流程定义执行过程中，用户队列优先级最高，用户队列为空则采用租户队列；<br />
- `t_ds_datasource`表中的`user_id`字段表示创建该数据源的用户，`t_ds_relation_datasource_user`中的`user_id`表示对数据源有权限的用户；<br />

### 项目	资源	告警

![image.png](../../img/metadata-erd/project-resource-alert.png)

- 一个用户可以有多个项目，用户项目授权通过`t_ds_relation_project_user`表完成project_id和user_id的关系绑定；<br />
- `t_ds_projcet`表中的`user_id`表示创建该项目的用户，`t_ds_relation_project_user`表中的`user_id`表示对项目有权限的用户；<br />

### 项目 - 租户 - 工作流定义 - 定时

![image.png](../../img/metadata-erd/project_tenant_process_definition_schedule.png)

- 一个项目可以有多个工作流定义，每个工作流定义只属于一个项目；<br />
- 一个租户可以被多个工作流定义使用，每个工作流定义必须且只能选择一个租户；<br />
- 一个工作流定义可以有一个或多个定时的配置；<br />

### 工作流定义和执行

![image.png](../../img/metadata-erd/process_definition.png)

- 一个工作流定义对应多个任务定义，通过`t_ds_process_task_relation`进行关联，关联的key是`code + version`，当任务的前置节点为空时，对应的`pre_task_node`和`pre_task_version`为0；
- 一个工作流定义可以有多个工作流实例`t_ds_process_instance`，一个工作流实例对应一个或多个任务实例`t_ds_task_instance`；
- `t_ds_relation_process_instance`表存放的数据用于处理流程定义中含有子流程的情况，`parent_process_instance_id`表示含有子流程的主流程实例id，`process_instance_id`表示子流程实例的id，`parent_task_instance_id`表示子流程节点的任务实例id，流程实例表和任务实例表分别对应`t_ds_process_instance`表和`t_ds_task_instance`表；


---

## architecture/task-structure.md

# 任务总体存储结构

在dolphinscheduler中创建的所有任务都保存在t_ds_process_definition 表中.

该数据库表结构如下表所示:

| 序号 |           字段            |      类型      |           描述            |
|----|-------------------------|--------------|-------------------------|
| 1  | id                      | int(11)      | 主键                      |
| 2  | name                    | varchar(255) | 流程定义名称                  |
| 3  | version                 | int(11)      | 流程定义版本                  |
| 4  | release_state           | tinyint(4)   | 流程定义的发布状态：0 未上线 ,  1已上线 |
| 5  | project_id              | int(11)      | 项目id                    |
| 6  | user_id                 | int(11)      | 流程定义所属用户id              |
| 7  | process_definition_json | longtext     | 流程定义JSON                |
| 8  | description             | text         | 流程定义描述                  |
| 9  | global_params           | text         | 全局参数                    |
| 10 | flag                    | tinyint(4)   | 流程是否可用：0 不可用，1 可用       |
| 11 | locations               | text         | 节点坐标信息                  |
| 12 | connects                | text         | 节点连线信息                  |
| 13 | receivers               | text         | 收件人                     |
| 14 | receivers_cc            | text         | 抄送人                     |
| 15 | create_time             | datetime     | 创建时间                    |
| 16 | timeout                 | int(11)      | 超时时间                    |
| 17 | tenant_id               | int(11)      | 租户id                    |
| 18 | update_time             | datetime     | 更新时间                    |
| 19 | modify_by               | varchar(36)  | 修改用户                    |
| 20 | resource_ids            | varchar(255) | 资源ids                   |

其中process_definition_json 字段为核心字段, 定义了 DAG 图中的任务信息.该数据以JSON 的方式进行存储.

公共的数据结构如下表.
序号 | 字段  | 类型  |  描述
-------- | ---------| -------- | ---------
1|globalParams|Array|全局参数
2|tasks|Array|流程中的任务集合  [ 各个类型的结构请参考如下章节]
3|tenantId|int|租户id
4|timeout|int|超时时间

数据示例:

```bash
{
    "globalParams":[
        {
            "prop":"golbal_bizdate",
            "direct":"IN",
            "type":"VARCHAR",
            "value":"${system.biz.date}"
        }
    ],
    "tasks":Array[1],
    "tenantId":0,
    "timeout":0
}
```

# 各任务类型存储结构详解

## Shell节点

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |SHELL
3| name| |String|名称 |
4| params| |Object| 自定义参数 |Json 格式
5| |rawScript |String| Shell脚本 |
6| | localParams| Array|自定义参数||
7| | resourceList| Array|资源文件||
8|description | |String|描述 | |
9|runFlag | |String |运行标识| |
10|conditionResult | |Object|条件分支 | |
11| | successNode| Array|成功跳转节点| |
12| | failedNode|Array|失败跳转节点 |
13| dependence| |Object |任务依赖 |与params互斥
14|maxRetryTimes | |String|最大重试次数 | |
15|retryInterval | |String |重试间隔| |
16|timeout | |Object|超时控制 | |
17| taskInstancePriority| |String|任务优先级 | |
18|workerGroup | |String |Worker 分组| |
19|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
    "type":"SHELL",
    "id":"tasks-80760",
    "name":"Shell Task",
    "params":{
        "resourceList":[
            {
                "id":3,
                "name":"run.sh",
                "res":"run.sh"
            }
        ],
        "localParams":[

        ],
        "rawScript":"echo "This is a shell script""
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}

```

## SQL节点

通过 SQL对指定的数据源进行数据查询、更新操作.

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |SQL
3| name| |String|名称 |
4| params| |Object| 自定义参数 |Json 格式
5| |type |String | 数据库类型
6| |datasource |Int | 数据源id
7| |sql |String | 查询SQL语句
9| |sqlType | String| SQL节点类型 |0 查询  , 1 非查询
10| |title |String | 邮件标题
11| |receivers |String | 收件人
12| |receiversCc |String | 抄送人
13| |showType | String| 邮件显示类型|TABLE 表格  ,  ATTACHMENT附件
14| |connParams | String| 连接参数
15| |preStatements | Array| 前置SQL
16| | postStatements| Array|后置SQL||
17| | localParams| Array|自定义参数||
18|description | |String|描述 | |
19|runFlag | |String |运行标识| |
20|conditionResult | |Object|条件分支 | |
21| | successNode| Array|成功跳转节点| |
22| | failedNode|Array|失败跳转节点 |
23| dependence| |Object |任务依赖 |与params互斥
24|maxRetryTimes | |String|最大重试次数 | |
25|retryInterval | |String |重试间隔| |
26|timeout | |Object|超时控制 | |
27| taskInstancePriority| |String|任务优先级 | |
28|workerGroup | |String |Worker 分组| |
29|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
    "type":"SQL",
    "id":"tasks-95648",
    "name":"SqlTask-Query",
    "params":{
        "type":"MYSQL",
        "datasource":1,
        "sql":"select id , namge , age from emp where id =  ${id}",
        "sqlType":"0",
        "title":"xxxx@xxx.com",
        "receivers":"xxxx@xxx.com",
        "receiversCc":"",
        "showType":"TABLE",
        "localParams":[
            {
                "prop":"id",
                "direct":"IN",
                "type":"INTEGER",
                "value":"1"
            }
        ],
        "connParams":"",
        "preStatements":[
            "insert into emp ( id,name ) value (1,'Li' )"
        ],
        "postStatements":[

        ]
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}
```

## PROCEDURE[存储过程]节点

**节点数据结构如下:**
**节点数据样例:**

## SPARK节点

**节点数据结构如下:**

| 序号 |                 参数名                  ||   类型   |     描述     |          描述          |
|----|----------------------|----------------|--------|------------|----------------------|
| 1  | id                   |                | String | 任务编码       |
| 2  | type                                 || String | 类型         | SPARK                |
| 3  | name                 |                | String | 名称         |
| 4  | params               |                | Object | 自定义参数      | Json 格式              |
| 5  |                      | mainClass      | String | 运行主类       |
| 6  |                      | mainArgs       | String | 运行参数       |
| 7  |                      | others         | String | 其他参数       |
| 8  |                      | mainJar        | Object | 程序 jar 包   |
| 9  |                      | deployMode     | String | 部署模式       | local,client,cluster |
| 10 |                      | driverCores    | String | driver核数   |
| 11 |                      | driverMemory   | String | driver 内存数 |
| 12 |                      | numExecutors   | String | executor数量 |
| 13 |                      | executorMemory | String | executor内存 |
| 14 |                      | executorCores  | String | executor核数 |
| 15 |                      | programType    | String | 程序类型       | JAVA,SCALA,PYTHON    |
| 16 |                      | localParams    | Array  | 自定义参数      |
| 17 |                      | resourceList   | Array  | 资源文件       |
| 18 | description          |                | String | 描述         |                      |
| 19 | runFlag              |                | String | 运行标识       |                      |
| 20 | conditionResult      |                | Object | 条件分支       |                      |
| 21 |                      | successNode    | Array  | 成功跳转节点     |                      |
| 22 |                      | failedNode     | Array  | 失败跳转节点     |
| 23 | dependence           |                | Object | 任务依赖       | 与params互斥            |
| 24 | maxRetryTimes        |                | String | 最大重试次数     |                      |
| 25 | retryInterval        |                | String | 重试间隔       |                      |
| 26 | timeout              |                | Object | 超时控制       |                      |
| 27 | taskInstancePriority |                | String | 任务优先级      |                      |
| 28 | workerGroup          |                | String | Worker 分组  |                      |
| 29 | preTasks             |                | Array  | 前置任务       |                      |

**节点数据样例:**

```bash
{
    "type":"SPARK",
    "id":"tasks-87430",
    "name":"SparkTask",
    "params":{
        "mainClass":"org.apache.spark.examples.SparkPi",
        "mainJar":{
            "id":4
        },
        "deployMode":"cluster",
        "resourceList":[
            {
                "id":3,
                "name":"run.sh",
                "res":"run.sh"
            }
        ],
        "localParams":[

        ],
        "driverCores":1,
        "driverMemory":"512M",
        "numExecutors":2,
        "executorMemory":"2G",
        "executorCores":2,
        "mainArgs":"10",
        "others":"",
        "programType":"SCALA"
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}
```

## MapReduce(MR)节点

**节点数据结构如下:**

| 序号 |                参数名                 ||   类型   |    描述     |     描述      |
|----|----------------------|--------------|--------|-----------|-------------|
| 1  | id                   |              | String | 任务编码      |
| 2  | type                               || String | 类型        | MR          |
| 3  | name                 |              | String | 名称        |
| 4  | params               |              | Object | 自定义参数     | Json 格式     |
| 5  |                      | mainClass    | String | 运行主类      |
| 6  |                      | mainArgs     | String | 运行参数      |
| 7  |                      | others       | String | 其他参数      |
| 8  |                      | mainJar      | Object | 程序 jar 包  |
| 9  |                      | programType  | String | 程序类型      | JAVA,PYTHON |
| 10 |                      | localParams  | Array  | 自定义参数     |
| 11 |                      | resourceList | Array  | 资源文件      |
| 12 | description          |              | String | 描述        |             |
| 13 | runFlag              |              | String | 运行标识      |             |
| 14 | conditionResult      |              | Object | 条件分支      |             |
| 15 |                      | successNode  | Array  | 成功跳转节点    |             |
| 16 |                      | failedNode   | Array  | 失败跳转节点    |
| 17 | dependence           |              | Object | 任务依赖      | 与params互斥   |
| 18 | maxRetryTimes        |              | String | 最大重试次数    |             |
| 19 | retryInterval        |              | String | 重试间隔      |             |
| 20 | timeout              |              | Object | 超时控制      |             |
| 21 | taskInstancePriority |              | String | 任务优先级     |             |
| 22 | workerGroup          |              | String | Worker 分组 |             |
| 23 | preTasks             |              | Array  | 前置任务      |             |

**节点数据样例:**

```bash
{
    "type":"MR",
    "id":"tasks-28997",
    "name":"MRTask",
    "params":{
        "mainClass":"wordcount",
        "mainJar":{
            "id":5
        },
        "resourceList":[
            {
                "id":3,
                "name":"run.sh",
                "res":"run.sh"
            }
        ],
        "localParams":[

        ],
        "mainArgs":"/tmp/wordcount/input /tmp/wordcount/output/",
        "others":"",
        "programType":"JAVA"
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}
```

## Python节点

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |PYTHON
3| name| |String|名称 |
4| params| |Object| 自定义参数 |Json 格式
5| |rawScript |String| Python脚本 |
6| | localParams| Array|自定义参数||
7| | resourceList| Array|资源文件||
8|description | |String|描述 | |
9|runFlag | |String |运行标识| |
10|conditionResult | |Object|条件分支 | |
11| | successNode| Array|成功跳转节点| |
12| | failedNode|Array|失败跳转节点 |
13| dependence| |Object |任务依赖 |与params互斥
14|maxRetryTimes | |String|最大重试次数 | |
15|retryInterval | |String |重试间隔| |
16|timeout | |Object|超时控制 | |
17| taskInstancePriority| |String|任务优先级 | |
18|workerGroup | |String |Worker 分组| |
19|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
    "type":"PYTHON",
    "id":"tasks-5463",
    "name":"Python Task",
    "params":{
        "resourceList":[
            {
                "id":3,
                "name":"run.sh",
                "res":"run.sh"
            }
        ],
        "localParams":[

        ],
        "rawScript":"print("This is a python script")"
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}
```

## Flink节点

**节点数据结构如下:**

| 序号 |                   参数名                   ||   类型   |       描述       |          描述          |
|----|----------------------|-------------------|--------|----------------|----------------------|
| 1  | id                   |                   | String | 任务编码           |
| 2  | type                                    || String | 类型             | FLINK                |
| 3  | name                 |                   | String | 名称             |
| 4  | params               |                   | Object | 自定义参数          | Json 格式              |
| 5  |                      | mainClass         | String | 运行主类           |
| 6  |                      | mainArgs          | String | 运行参数           |
| 7  |                      | others            | String | 其他参数           |
| 8  |                      | mainJar           | Object | 程序 jar 包       |
| 9  |                      | deployMode        | String | 部署模式           | local,client,cluster |
| 10 |                      | slot              | String | slot数量         |
| 11 |                      | taskManager       | String | taskManager数量  |
| 12 |                      | taskManagerMemory | String | taskManager内存数 |
| 13 |                      | jobManagerMemory  | String | jobManager内存数  |
| 14 |                      | programType       | String | 程序类型           | JAVA,SCALA,PYTHON    |
| 15 |                      | localParams       | Array  | 自定义参数          |
| 16 |                      | resourceList      | Array  | 资源文件           |
| 17 | description          |                   | String | 描述             |                      |
| 18 | runFlag              |                   | String | 运行标识           |                      |
| 19 | conditionResult      |                   | Object | 条件分支           |                      |
| 20 |                      | successNode       | Array  | 成功跳转节点         |                      |
| 21 |                      | failedNode        | Array  | 失败跳转节点         |
| 22 | dependence           |                   | Object | 任务依赖           | 与params互斥            |
| 23 | maxRetryTimes        |                   | String | 最大重试次数         |                      |
| 24 | retryInterval        |                   | String | 重试间隔           |                      |
| 25 | timeout              |                   | Object | 超时控制           |                      |
| 26 | taskInstancePriority |                   | String | 任务优先级          |                      |
| 27 | workerGroup          |                   | String | Worker 分组      |                      |
| 38 | preTasks             |                   | Array  | 前置任务           |                      |

**节点数据样例:**

```bash
{
    "type":"FLINK",
    "id":"tasks-17135",
    "name":"FlinkTask",
    "params":{
        "mainClass":"com.flink.demo",
        "mainJar":{
            "id":6
        },
        "deployMode":"cluster",
        "resourceList":[
            {
                "id":3,
                "name":"run.sh",
                "res":"run.sh"
            }
        ],
        "localParams":[

        ],
        "slot":1,
        "taskManager":"2",
        "jobManagerMemory":"1G",
        "taskManagerMemory":"2G",
        "executorCores":2,
        "mainArgs":"100",
        "others":"",
        "programType":"SCALA"
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}
```

## HTTP节点

**节点数据结构如下:**

| 序号 |                   参数名                    ||   类型   |    描述     |            描述            |
|----|----------------------|--------------------|--------|-----------|--------------------------|
| 1  | id                   |                    | String | 任务编码      |
| 2  | type                                     || String | 类型        | HTTP                     |
| 3  | name                 |                    | String | 名称        |
| 4  | params               |                    | Object | 自定义参数     | Json 格式                  |
| 5  |                      | url                | String | 请求地址      |
| 6  |                      | httpMethod         | String | 请求方式      | GET,POST,HEAD,PUT,DELETE |
| 7  |                      | httpParams         | Array  | 请求参数      |
| 8  |                      | httpCheckCondition | String | 校验条件      | 默认响应码200                 |
| 9  |                      | condition          | String | 校验内容      |
| 10 |                      | localParams        | Array  | 自定义参数     |
| 11 | description          |                    | String | 描述        |                          |
| 12 | runFlag              |                    | String | 运行标识      |                          |
| 13 | conditionResult      |                    | Object | 条件分支      |                          |
| 14 |                      | successNode        | Array  | 成功跳转节点    |                          |
| 15 |                      | failedNode         | Array  | 失败跳转节点    |
| 16 | dependence           |                    | Object | 任务依赖      | 与params互斥                |
| 17 | maxRetryTimes        |                    | String | 最大重试次数    |                          |
| 18 | retryInterval        |                    | String | 重试间隔      |                          |
| 19 | timeout              |                    | Object | 超时控制      |                          |
| 20 | taskInstancePriority |                    | String | 任务优先级     |                          |
| 21 | workerGroup          |                    | String | Worker 分组 |                          |
| 22 | preTasks             |                    | Array  | 前置任务      |                          |

**节点数据样例:**

```bash
{
    "type":"HTTP",
    "id":"tasks-60499",
    "name":"HttpTask",
    "params":{
        "localParams":[

        ],
        "httpParams":[
            {
                "prop":"id",
                "httpParametersType":"PARAMETER",
                "value":"1"
            },
            {
                "prop":"name",
                "httpParametersType":"PARAMETER",
                "value":"Bo"
            }
        ],
        "url":"https://www.xxxxx.com:9012",
        "httpMethod":"POST",
        "httpCheckCondition":"STATUS_CODE_DEFAULT",
        "condition":""
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}
```

## DataX节点

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |DATAX
3| name| |String|名称 |
4| params| |Object| 自定义参数 |Json 格式
5| |customConfig |Int | 自定义类型| 0定制 , 1自定义
6| |dsType |String | 源数据库类型
7| |dataSource |Int | 源数据库ID
8| |dtType | String| 目标数据库类型
9| |dataTarget | Int| 目标数据库ID
10| |sql |String | SQL语句
11| |targetTable |String | 目标表
12| |jobSpeedByte |Int | 限流(字节数)
13| |jobSpeedRecord | Int| 限流(记录数)
14| |preStatements | Array| 前置SQL
15| | postStatements| Array|后置SQL
16| | json| String|自定义配置|customConfig=1时生效
17| | localParams| Array|自定义参数|customConfig=1时生效
18|description | |String|描述 | |
19|runFlag | |String |运行标识| |
20|conditionResult | |Object|条件分支 | |
21| | successNode| Array|成功跳转节点| |
22| | failedNode|Array|失败跳转节点 |
23| dependence| |Object |任务依赖 |与params互斥
24|maxRetryTimes | |String|最大重试次数 | |
25|retryInterval | |String |重试间隔| |
26|timeout | |Object|超时控制 | |
27| taskInstancePriority| |String|任务优先级 | |
28|workerGroup | |String |Worker 分组| |
29|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
    "type":"DATAX",
    "id":"tasks-91196",
    "name":"DataxTask-DB",
    "params":{
        "customConfig":0,
        "dsType":"MYSQL",
        "dataSource":1,
        "dtType":"MYSQL",
        "dataTarget":1,
        "sql":"select id, name ,age from user ",
        "targetTable":"emp",
        "jobSpeedByte":524288,
        "jobSpeedRecord":500,
        "preStatements":[
            "truncate table emp "
        ],
        "postStatements":[
            "truncate table user"
        ]
    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            ""
        ],
        "failedNode":[
            ""
        ]
    },
    "dependence":{

    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[

    ]
}
```

## Sqoop节点

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |SQOOP
3| name| |String|名称 |
4| params| |Object| 自定义参数 |JSON 格式
5| | concurrency| Int|并发度
6| | modelType|String |流向|import,export
7| |sourceType|String |数据源类型 |
8| |sourceParams |String| 数据源参数| JSON格式
9| | targetType|String |目标数据类型
10| |targetParams | String|目标数据参数|JSON格式
11| |localParams |Array |自定义参数
12|description | |String|描述 | |
13|runFlag | |String |运行标识| |
14|conditionResult | |Object|条件分支 | |
15| | successNode| Array|成功跳转节点| |
16| | failedNode|Array|失败跳转节点 |
17| dependence| |Object |任务依赖 |与params互斥
18|maxRetryTimes | |String|最大重试次数 | |
19|retryInterval | |String |重试间隔| |
20|timeout | |Object|超时控制 | |
21| taskInstancePriority| |String|任务优先级 | |
22|workerGroup | |String |Worker 分组| |
23|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
            "type":"SQOOP",
            "id":"tasks-82041",
            "name":"Sqoop Task",
            "params":{
                "concurrency":1,
                "modelType":"import",
                "sourceType":"MYSQL",
                "targetType":"HDFS",
                "sourceParams":"{"srcType":"MYSQL","srcDatasource":1,"srcTable":"","srcQueryType":"1","srcQuerySql":"selec id , name from user","srcColumnType":"0","srcColumns":"","srcConditionList":[],"mapColumnHive":[{"prop":"hivetype-key","direct":"IN","type":"VARCHAR","value":"hivetype-value"}],"mapColumnJava":[{"prop":"javatype-key","direct":"IN","type":"VARCHAR","value":"javatype-value"}]}",
                "targetParams":"{"targetPath":"/user/hive/warehouse/ods.db/user","deleteTargetDir":false,"fileType":"--as-avrodatafile","compressionCodec":"snappy","fieldsTerminated":",","linesTerminated":"@"}",
                "localParams":[

                ]
            },
            "description":"",
            "runFlag":"NORMAL",
            "conditionResult":{
                "successNode":[
                    ""
                ],
                "failedNode":[
                    ""
                ]
            },
            "dependence":{

            },
            "maxRetryTimes":"0",
            "retryInterval":"1",
            "timeout":{
                "strategy":"",
                "interval":null,
                "enable":false
            },
            "taskInstancePriority":"MEDIUM",
            "workerGroup":"default",
            "preTasks":[

            ]
        }
```

## 条件分支节点

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |SHELL
3| name| |String|名称 |
4| params| |Object| 自定义参数 | null
5|description | |String|描述 | |
6|runFlag | |String |运行标识| |
7|conditionResult | |Object|条件分支 | |
8| | successNode| Array|成功跳转节点| |
9| | failedNode|Array|失败跳转节点 |
10| dependence| |Object |任务依赖 |与params互斥
11|maxRetryTimes | |String|最大重试次数 | |
12|retryInterval | |String |重试间隔| |
13|timeout | |Object|超时控制 | |
14| taskInstancePriority| |String|任务优先级 | |
15|workerGroup | |String |Worker 分组| |
16|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
    "type":"CONDITIONS",
    "id":"tasks-96189",
    "name":"条件",
    "params":{

    },
    "description":"",
    "runFlag":"NORMAL",
    "conditionResult":{
        "successNode":[
            "test04"
        ],
        "failedNode":[
            "test05"
        ]
    },
    "dependence":{
        "relation":"AND",
        "dependTaskList":[

        ]
    },
    "maxRetryTimes":"0",
    "retryInterval":"1",
    "timeout":{
        "strategy":"",
        "interval":null,
        "enable":false
    },
    "taskInstancePriority":"MEDIUM",
    "workerGroup":"default",
    "preTasks":[
        "test01",
        "test02"
    ]
}
```

## 子流程节点

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |SHELL
3| name| |String|名称 |
4| params| |Object| 自定义参数 |Json 格式
5| |processDefinitionId |Int| 流程定义id
6|description | |String|描述 | |
7|runFlag | |String |运行标识| |
8|conditionResult | |Object|条件分支 | |
9| | successNode| Array|成功跳转节点| |
10| | failedNode|Array|失败跳转节点 |
11| dependence| |Object |任务依赖 |与params互斥
12|maxRetryTimes | |String|最大重试次数 | |
13|retryInterval | |String |重试间隔| |
14|timeout | |Object|超时控制 | |
15| taskInstancePriority| |String|任务优先级 | |
16|workerGroup | |String |Worker 分组| |
17|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
            "type":"SUB_WORKFLOW",
            "id":"tasks-14806",
            "name":"SubProcessTask",
            "params":{
                "processDefinitionId":2
            },
            "description":"",
            "runFlag":"NORMAL",
            "conditionResult":{
                "successNode":[
                    ""
                ],
                "failedNode":[
                    ""
                ]
            },
            "dependence":{

            },
            "timeout":{
                "strategy":"",
                "interval":null,
                "enable":false
            },
            "taskInstancePriority":"MEDIUM",
            "workerGroup":"default",
            "preTasks":[

            ]
        }
```

## 依赖(DEPENDENT)节点

**节点数据结构如下:**
序号|参数名||类型|描述 |描述
-------- | ---------| ---------| -------- | --------- | ---------
1|id | |String| 任务编码|
2|type ||String |类型 |DEPENDENT
3| name| |String|名称 |
4| params| |Object| 自定义参数 |Json 格式
5| |rawScript |String| Shell脚本 |
6| | localParams| Array|自定义参数||
7| | resourceList| Array|资源文件||
8|description | |String|描述 | |
9|runFlag | |String |运行标识| |
10|conditionResult | |Object|条件分支 | |
11| | successNode| Array|成功跳转节点| |
12| | failedNode|Array|失败跳转节点 |
13| dependence| |Object |任务依赖 |与params互斥
14| | relation|String |关系 |AND,OR
15| | dependTaskList|Array |依赖任务清单 |
16|maxRetryTimes | |String|最大重试次数 | |
17|retryInterval | |String |重试间隔| |
18|timeout | |Object|超时控制 | |
19| taskInstancePriority| |String|任务优先级 | |
20|workerGroup | |String |Worker 分组| |
21|preTasks | |Array|前置任务 | |

**节点数据样例:**

```bash
{
            "type":"DEPENDENT",
            "id":"tasks-57057",
            "name":"DenpendentTask",
            "params":{

            },
            "description":"",
            "runFlag":"NORMAL",
            "conditionResult":{
                "successNode":[
                    ""
                ],
                "failedNode":[
                    ""
                ]
            },
            "dependence":{
                "relation":"AND",
                "dependTaskList":[
                    {
                        "relation":"AND",
                        "dependItemList":[
                            {
                                "projectId":1,
                                "definitionId":7,
                                "definitionList":[
                                    {
                                        "value":8,
                                        "label":"MRTask"
                                    },
                                    {
                                        "value":7,
                                        "label":"FlinkTask"
                                    },
                                    {
                                        "value":6,
                                        "label":"SparkTask"
                                    },
                                    {
                                        "value":5,
                                        "label":"SqlTask-Update"
                                    },
                                    {
                                        "value":4,
                                        "label":"SqlTask-Query"
                                    },
                                    {
                                        "value":3,
                                        "label":"SubProcessTask"
                                    },
                                    {
                                        "value":2,
                                        "label":"Python Task"
                                    },
                                    {
                                        "value":1,
                                        "label":"Shell Task"
                                    }
                                ],
                                "depTasks":"ALL",
                                "cycle":"day",
                                "dateValue":"today"
                            }
                        ]
                    },
                    {
                        "relation":"AND",
                        "dependItemList":[
                            {
                                "projectId":1,
                                "definitionId":5,
                                "definitionList":[
                                    {
                                        "value":8,
                                        "label":"MRTask"
                                    },
                                    {
                                        "value":7,
                                        "label":"FlinkTask"
                                    },
                                    {
                                        "value":6,
                                        "label":"SparkTask"
                                    },
                                    {
                                        "value":5,
                                        "label":"SqlTask-Update"
                                    },
                                    {
                                        "value":4,
                                        "label":"SqlTask-Query"
                                    },
                                    {
                                        "value":3,
                                        "label":"SubProcessTask"
                                    },
                                    {
                                        "value":2,
                                        "label":"Python Task"
                                    },
                                    {
                                        "value":1,
                                        "label":"Shell Task"
                                    }
                                ],
                                "depTasks":"SqlTask-Update",
                                "cycle":"day",
                                "dateValue":"today"
                            }
                        ]
                    }
                ]
            },
            "maxRetryTimes":"0",
            "retryInterval":"1",
            "timeout":{
                "strategy":"",
                "interval":null,
                "enable":false
            },
            "taskInstancePriority":"MEDIUM",
            "workerGroup":"default",
            "preTasks":[

            ]
        }
```


---

## contribute/api-standard.md

# API 设计规范

规范统一的 API 是项目设计的基石。DolphinScheduler 的 API 遵循 REST ful 标准，REST ful 是目前最流行的一种互联网软件架构，它结构清晰，符合标准，易于理解，扩展方便。

本文以 DolphinScheduler 项目的接口为样例，讲解如何构造具有 Restful 风格的 API。

## 1. URI 设计

REST 即为 Representational State Transfer 的缩写，即“表现层状态转化”。

“表现层”指的就是“资源”。资源对应网络上的一种实体，例如：一段文本，一张图片，一种服务。且每种资源都对应一个特定的 URI。

Restful URI 的设计基于资源：
+ 一类资源：用复数表示，如 `task-instances`、`groups` 等；
+ 单个资源：用单数，或是用 id 值表示某类资源下的一个，如 `group`、`groups/{groupId}`；
+ 子资源：某个资源下的资源：`/instances/{instanceId}/tasks`；
+ 子资源下的单个资源：`/instances/{instanceId}/tasks/{taskId}`；

## 2. Method 设计

我们需要通过 URI 来定位某种资源，再通过 Method，或者在路径后缀声明动作来体现对资源的操作。

### ① 查询操作 - GET

通过 URI 来定位要资源，通过 GET 表示查询。

+ 当 URI 为一类资源时表示查询一类资源，例如下面样例表示分页查询 `alter-groups`。

```
Method: GET
/dolphinscheduler/alert-groups
```

+ 当 URI 为单个资源时表示查询此资源，例如下面样例表示查询对应的 `alter-group`。

```
Method: GET
/dolphinscheduler/alter-groups/{id}
```

+ 此外，我们还可以根据 URI 来表示查询子资源，如下：

```
Method: GET
/dolphinscheduler/projects/{projectId}/tasks
```

**上述的关于查询的方式都表示分页查询，如果我们需要查询全部数据的话，则需在 URI 的后面加 `/list` 来区分。分页查询和查询全部不要混用一个 API。**

```
Method: GET
/dolphinscheduler/alert-groups/list
```

### ② 创建操作 - POST

通过 URI 来定位要创建的资源类型，通过 POST 表示创建动作，并且将创建后的 `id` 返回给请求者。

+ 下面样例表示创建一个 `alter-group`：

```
Method: POST
/dolphinscheduler/alter-groups
```

+ 创建子资源也是类似的操作：

```
Method: POST
/dolphinscheduler/alter-groups/{alterGroupId}/tasks
```

### ③ 修改操作 - PUT

通过 URI 来定位某一资源，通过 PUT 指定对其修改。

```
Method: PUT
/dolphinscheduler/alter-groups/{alterGroupId}
```

### ④ 删除操作 -DELETE

通过 URI 来定位某一资源，通过 DELETE 指定对其删除。

+ 下面例子表示删除 `alterGroupId` 对应的资源：

```
Method: DELETE
/dolphinscheduler/alter-groups/{alterGroupId}
```

+ 批量删除：对传入的 id 数组进行批量删除，使用 POST 方法。**（这里不要用 DELETE 方法，因为 DELETE 请求的 body 在语义上没有任何意义，而且有可能一些网关，代理，防火墙在收到 DELETE 请求后会把请求的 body 直接剥离掉。）**

```
Method: POST
/dolphinscheduler/alter-groups/batch-delete
```

### ⑤ 部分更新操作 -PATCH

通过 URI 来定位某一资源，通过 PATCH 指定对其部分更新。

+ 下面例子表示部分更新 `alterGroupId` 对应的资源：

```
Method: PATCH
/dolphinscheduler/alter-groups/{alterGroupId}
```

### ⑥ 其他操作

除增删改查外的操作，我们同样也通过 `url` 定位到对应的资源，然后再在路径后面追加对其进行的操作。例如：

```
/dolphinscheduler/alert-groups/verify-name
/dolphinscheduler/projects/{projectCode}/process-instances/{code}/view-gantt
```

## 3. 参数设计

参数分为两种，一种是请求参数(Request Param 或 Request Body)，另一种是路径参数(Path Param)。

参数变量必须用小驼峰表示，并且在分页场景中，用户输入的参数小于 1，则前端需要返给后端 1 表示请求第一页；当后端发现用户输入的参数大于总页数时，直接返回最后一页。

## 4. 其他设计

### 基础路径

整个项目的 URI 需要以 `/<project_name>` 作为基础路径，从而标识这类 API 都是项目下的，即：

```
/dolphinscheduler
```


---

## contribute/api-test.md

# DolphinScheduler — API 测试

## 前置知识：

### API 测试与单元测试的区别

API测试，它模仿用户调用API，从某个入口开始，逐步执行操作，直到完成某项工作。与单元测试不同，后者通常需要测试参数、参数类型、参数值、参数数量、返回值、抛出错误等，目的在于保证特定函数能够在任何情况下都稳定可靠完成工作。单元测试假定只要所有函数都正常工作，那么整个产品就能正常工作。

相对来说，API 测试关注的**一个完整的操作链是否能够完成**。

比如，租户管理界面的 API 测试，关注用户是否能够正常登录；登陆失败的话，是否能够正确显示错误信息。登陆之后时候能够通过携带的 SessionId 进行租户管理的操作等等。

## API 测试

### API-Pages

DolphinScheduler 的 API 测试使用 docker-compose 部署，当前测试的为单机模式，主要用于检验一些例如“增删改查”基本功能，后期如需做集群验证，例如不同服务之间的协作，或者各个服务之间的通讯机制，可参考 `deploy/docker/docker-compose.yml`来配置。

对于 API 测试，使用 [页面模型](https://www.selenium.dev/documentation/guidelines/page_object_models/) 的形式，主要为每一个页面建立一个对应的模型。下面以登录页为例：

```java
package org.apache.dolphinscheduler.api.test.pages;


import org.apache.dolphinscheduler.api.test.entity.HttpResponse;
import org.apache.dolphinscheduler.api.test.utils.RequestClient;

import java.util.HashMap;
import java.util.Map;

public final class LoginPage {
    public HttpResponse login(String username, String password) {
        Map<String, Object> params = new HashMap<>();

        params.put("userName", username);
        params.put("userPassword", password);

        RequestClient requestClient = new RequestClient();

        return requestClient.post("/login", null, params);
    }
}
```

在测试过程中，我们只针对所需要关注的接口进行测试，而非页面中的所有接口，所以在登陆页面只对用户名、密码和接口路径进行声明。

此外，在测试过程中，并不会直接去操作接口，一般选择封装对应的方法，以达到复用的效果。例如想要登录的话，直接传入用户名和密码，通过 `public LoginPage login()` 方法去操作所传入的信息，从而达到实现登录的效果。

在登陆页面（LoginPage）只定义接口请求的入参规范，对于接口请求出参只定义统一的基础响应结构，接口实际返回的data数据则再实际的测试用例中测试。主要测试接口的输入和输出是否能够符合测试用例的要求。

### API-Cases

下面以租户管理测试为例，前文已经说明，我们使用 docker-compose 进行部署，所以每个测试案例，都需要以注解的形式引入对应的文件。

使用 OkHttpClient 框架来进行 HTTP 请求。在每个测试案例开始之前都需要进行一些准备工作。比如：登录用户、创建对应的租户（根据具体的测试案例而定）。

```java
    @BeforeAll
    public static void setup() {
        LoginPage loginPage = new LoginPage();
        HttpResponse loginHttpResponse = loginPage.login(user, password);

        sessionId = JSONUtils.convertValue(loginHttpResponse.body().data(), LoginResponseData.class).sessionId();
    }
```

在完成准备工作之后，就是正式的测试案例编写。我们使用 @Order() 注解的形式，用于模块化，确认测试顺序。在进行测试之后，使用断言来判断测试是否成功，如果断言返回 true，则表示创建租户成功。可参考创建租户的测试代码：

```java
    @Test
    @Order(1)
    public void testCreateTenant() {
        TenantPage tenantPage = new TenantPage();

        HttpResponse createTenantHttpResponse = tenantPage.createTenant(sessionId, tenant, 1, "");

        Assertions.assertTrue(createTenantHttpResponse.body().success());
    }
```

其余的都是类似的情况，可参考具体的源码来理解。

https://github.com/apache/dolphinscheduler/tree/dev/dolphinscheduler-api-test/dolphinscheduler-api-test-case/src/test/java/org/apache/dolphinscheduler/api/test/cases

## 补充

在本地运行的时候，首先需要启动相应的本地服务，可以参考该页面: [环境搭建](./development-environment-setup.md)

在本地运行 API 测试的时候，可以配置 `-Dlocal=true` 参数，用于连接本地，方便对于 UI 界面的更改。

当前默认的请求超时时长为 10 秒，如无特殊需求不应修改此值。


---

## contribute/architecture-design.md

## 系统架构设计

在对调度系统架构说明之前，我们先来认识一下调度系统常用的名词

### 1.名词解释

**DAG：** 全称 Directed Acyclic Graph，简称 DAG。工作流中的 Task 任务以有向无环图的形式组装起来，从入度为零的节点进行拓扑遍历，直到无后继节点为止。举例如下图：

<p align="center">
  <img src="../../../img/architecture-design/dag_examples.png" alt="dag示例"  width="80%" />
  <p align="center">
        <em>dag示例</em>
  </p>
</p>

**流程定义**：通过拖拽任务节点并建立任务节点的关联所形成的可视化**DAG**

**流程实例**：流程实例是流程定义的实例化，可以通过手动启动或定时调度生成,流程定义每运行一次，产生一个流程实例

**任务实例**：任务实例是流程定义中任务节点的实例化，标识着具体的任务执行状态

**任务类型**： 目前支持有 SHELL、SQL、SUB_WORKFLOW(子工作流)、PROCEDURE、MR、SPARK、PYTHON、DEPENDENT(依赖)，同时计划支持动态插件扩展，注意：其中子 **SUB_WORKFLOW** 也是一个单独的流程定义，是可以单独启动执行的

**调度方式：** 系统支持基于 cron 表达式的定时调度和手动调度。命令类型支持：启动工作流、从当前节点开始执行、恢复被容错的工作流、恢复暂停流程、从失败节点开始执行、补数、定时、重跑、暂停、停止、恢复等待线程。其中 **恢复被容错的工作流** 和 **恢复等待线程** 两种命令类型是由调度内部控制使用，外部无法调用

**定时调度**：系统采用 **quartz** 分布式调度器，并同时支持 cron 表达式可视化的生成

**依赖**：系统不单单支持 **DAG** 简单的前驱和后继节点之间的依赖，同时还提供**任务依赖**节点，支持**流程间的自定义任务依赖**

**优先级** ：支持流程实例和任务实例的优先级，如果流程实例和任务实例的优先级不设置，则默认是先进先出

**邮件告警**：支持 **SQL 任务** 查询结果邮件发送，流程实例运行结果邮件告警及容错告警通知

**失败策略**：对于并行运行的任务，如果有任务失败，提供两种失败策略处理方式，**继续**是指不管并行运行任务的状态，直到流程失败结束。**结束**是指一旦发现失败任务，则同时 Kill 掉正在运行的并行任务，流程失败结束

**补数**：补历史数据，支持**区间并行和串行**两种补数方式

### 2.系统架构

#### 2.1 系统架构图

<p align="center">
  <img src="../../../img/architecture.jpg" alt="系统架构图"  />
  <p align="center">
        <em>系统架构图</em>
  </p>
</p>

#### 2.2 架构说明

- **MasterServer**

  MasterServer 采用分布式无中心设计理念，MasterServer 主要负责 DAG 任务切分、任务提交监控，并同时监听其它 MasterServer 和 WorkerServer 的健康状态。
  MasterServer 服务启动时向 Zookeeper 注册临时节点，通过监听 Zookeeper 临时节点变化来进行容错处理。

  ##### 该服务内主要包含:

  - **Distributed Quartz**分布式调度组件，主要负责定时任务的启停操作，当 quartz 调起任务后，Master 内部会有线程池具体负责处理任务的后续操作

  - **MasterSchedulerThread**是一个扫描线程，定时扫描数据库中的 **command** 表，根据不同的**命令类型**进行不同的业务操作

  - **MasterExecThread**主要是负责 DAG 任务切分、任务提交监控、各种不同命令类型的逻辑处理

  - **MasterTaskExecThread**主要负责任务的持久化

- **WorkerServer**

  WorkerServer 也采用分布式无中心设计理念，WorkerServer 主要负责任务的执行和提供日志服务。WorkerServer 服务启动时向 Zookeeper 注册临时节点，并维持心跳。

  ##### 该服务包含：

  - **FetchTaskThread**主要负责不断从**Task Queue**中领取任务，并根据不同任务类型调用**TaskScheduleThread**对应执行器。
- **ZooKeeper**

  ZooKeeper 服务，系统中的 MasterServer 和 WorkerServer 节点都通过 ZooKeeper 来进行集群管理和容错。另外系统还基于 ZooKeeper 进行事件监听和分布式锁。
  我们也曾经基于 Redis 实现过队列，不过我们希望 DolphinScheduler 依赖到的组件尽量地少，所以最后还是去掉了 Redis 实现。

- **Task Queue**

  提供任务队列的操作，目前队列也是基于 Zookeeper 来实现。由于队列中存的信息较少，不必担心队列里数据过多的情况，实际上我们压测过百万级数据存队列，对系统稳定性和性能没影响。

- **Alert**

  提供告警相关接口，接口主要包括两种类型的告警数据的存储、查询和通知功能。其中通知功能又有**邮件通知**和**SNMP(暂未实现)**两种。

- **API**

  API 接口层，主要负责处理前端 UI 层的请求。该服务统一提供 RESTful api 向外部提供请求服务。
  接口包括工作流的创建、定义、查询、修改、发布、下线、手工启动、停止、暂停、恢复、从该节点开始执行等等。

- **UI**

  系统的前端页面，提供系统的各种可视化操作界面，详见 [快速开始](https://dolphinscheduler.apache.org/zh-cn/docs/3.1.2/about/introduction) 部分。

#### 2.3 架构设计思想

##### 一、去中心化 vs 中心化

###### 中心化思想

中心化的设计理念比较简单，分布式集群中的节点按照角色分工，大体上分为两种角色：

<p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/master_slave.png" alt="master-slave角色"  width="50%" />
 </p>

- Master 的角色主要负责任务分发并监督 Slave 的健康状态，可以动态的将任务均衡到 Slave 上，以致 Slave 节点不至于“忙死”或”闲死”的状态。
- Worker 的角色主要负责任务的执行工作并维护和 Master 的心跳，以便 Master 可以分配任务给 Slave。

中心化思想设计存在的问题：

- 一旦 Master 出现了问题，则群龙无首，整个集群就会崩溃。为了解决这个问题，大多数 Master/Slave 架构模式都采用了主备 Master 的设计方案，可以是热备或者冷备，也可以是自动切换或手动切换，而且越来越多的新系统都开始具备自动选举切换 Master 的能力,以提升系统的可用性。
- 另外一个问题是如果 Scheduler 在 Master 上，虽然可以支持一个 DAG 中不同的任务运行在不同的机器上，但是会产生 Master 的过负载。如果 Scheduler 在 Slave 上，则一个 DAG 中所有的任务都只能在某一台机器上进行作业提交，则并行任务比较多的时候，Slave 的压力可能会比较大。

###### 去中心化

 <p align="center"
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/decentralization.png" alt="去中心化"  width="50%" />
 </p>

- 在去中心化设计里，通常没有 Master/Slave 的概念，所有的角色都是一样的，地位是平等的，全球互联网就是一个典型的去中心化的分布式系统，联网的任意节点设备 down 机，都只会影响很小范围的功能。
- 去中心化设计的核心设计在于整个分布式系统中不存在一个区别于其他节点的”管理者”，因此不存在单点故障问题。但由于不存在” 管理者”节点所以每个节点都需要跟其他节点通信才得到必须要的机器信息，而分布式系统通信的不可靠性，则大大增加了上述功能的实现难度。
- 实际上，真正去中心化的分布式系统并不多见。反而动态中心化分布式系统正在不断涌出。在这种架构下，集群中的管理者是被动态选择出来的，而不是预置的，并且集群在发生故障的时候，集群的节点会自发的举行"会议"来选举新的"管理者"去主持工作。最典型的案例就是 ZooKeeper 及 Go 语言实现的 Etcd。
- DolphinScheduler 的去中心化是 Master/Worker 注册到 Zookeeper 中，实现 Master 集群和 Worker 集群无中心，并使用 Zookeeper 分布式锁来选举其中的一台 Master 或 Worker 为“管理者”来执行任务。

##### 二、分布式锁实践

DolphinScheduler 使用 ZooKeeper 分布式锁来实现同一时刻只有一台 Master 执行 Scheduler，或者只有一台 Worker 执行任务的提交。

1. 获取分布式锁的核心流程算法如下

 <p align="center">
   <img src="../../../img/architecture-design/distributed_lock.png" alt="获取分布式锁流程"  width="70%" />
 </p>

2. DolphinScheduler 中 Scheduler 线程分布式锁实现流程图：

 <p align="center">
   <img src="../../../img/architecture-design/distributed_lock_procss.png" alt="获取分布式锁流程" />
 </p>

##### 三、线程不足循环等待问题

- 如果一个 DAG 中没有子流程，则如果 Command 中的数据条数大于线程池设置的阈值，则直接流程等待或失败。
- 如果一个大的 DAG 中嵌套了很多子流程，如下图则会产生“死等”状态：

 <p align="center">
   <img src="../../../img/architecture-design/lack_thread.png" alt="线程不足循环等待问题"  width="70%" />
 </p>
上图中MainFlowThread等待SubFlowThread1结束，SubFlowThread1等待SubFlowThread2结束， SubFlowThread2等待SubFlowThread3结束，而SubFlowThread3等待线程池有新线程，则整个DAG流程不能结束，从而其中的线程也不能释放。这样就形成的子父流程循环等待的状态。此时除非启动新的Master来增加线程来打破这样的”僵局”，否则调度集群将不能再使用。

对于启动新 Master 来打破僵局，似乎有点差强人意，于是我们提出了以下三种方案来降低这种风险：

1. 计算所有 Master 的线程总和，然后对每一个 DAG 需要计算其需要的线程数，也就是在 DAG 流程执行之前做预计算。因为是多 Master 线程池，所以总线程数不太可能实时获取。
2. 对单 Master 线程池进行判断，如果线程池已经满了，则让线程直接失败。
3. 增加一种资源不足的 Command 类型，如果线程池不足，则将主流程挂起。这样线程池就有了新的线程，可以让资源不足挂起的流程重新唤醒执行。

注意：Master Scheduler 线程在获取 Command 的时候是 FIFO 的方式执行的。

于是我们选择了第三种方式来解决线程不足的问题。

##### 四、容错设计

容错分为服务宕机容错和任务重试，服务宕机容错又分为 Master 容错和 Worker 容错两种情况

###### 1. 宕机容错

服务容错设计依赖于 ZooKeeper 的 Watcher 机制，实现原理如图：

 <p align="center">
   <img src="../../../img/architecture-design/fault-tolerant.png" alt="DolphinScheduler容错设计"  width="70%" />
 </p>
其中Master监控其他Master和Worker的目录，如果监听到remove事件，则会根据具体的业务逻辑进行流程实例容错或者任务实例容错。

- Master 容错流程图：

 <p align="center">
   <img src="../../../img/architecture-design/fault-tolerant_master.png" alt="Master容错流程图"  width="70%" />
 </p>
ZooKeeper Master容错完成之后则重新由DolphinScheduler中Scheduler线程调度，遍历 DAG 找到”正在运行”和“提交成功”的任务，对”正在运行”的任务监控其任务实例的状态，对”提交成功”的任务需要判断Task Queue中是否已经存在，如果存在则同样监控任务实例的状态，如果不存在则重新提交任务实例。

- Worker 容错流程图：

 <p align="center">
   <img src="../../../img/architecture-design/fault-tolerant_worker.png" alt="Worker容错流程图"  width="70%" />
 </p>

Master Scheduler 线程一旦发现任务实例为” 需要容错”状态，则接管任务并进行重新提交。

注意：由于” 网络抖动”可能会使得节点短时间内失去和 ZooKeeper 的心跳，从而发生节点的 remove 事件。对于这种情况，我们使用最简单的方式，那就是节点一旦和 ZooKeeper 发生超时连接，则直接将 Master 或 Worker 服务停掉。

###### 2.任务失败重试

这里首先要区分任务失败重试、流程失败恢复、流程失败重跑的概念：

- 任务失败重试是任务级别的，是调度系统自动进行的，比如一个 Shell 任务设置重试次数为 3 次，那么在 Shell 任务运行失败后会自己再最多尝试运行 3 次
- 流程失败恢复是流程级别的，是手动进行的，恢复是从只能**从失败的节点开始执行**或**从当前节点开始执行**
- 流程失败重跑也是流程级别的，是手动进行的，重跑是从开始节点进行

接下来说正题，我们将工作流中的任务节点分了两种类型。

- 一种是业务节点，这种节点都对应一个实际的脚本或者处理语句，比如 Shell 节点，MR 节点、Spark 节点、依赖节点等。

- 还有一种是逻辑节点，这种节点不做实际的脚本或语句处理，只是整个流程流转的逻辑处理，比如子流程节点等。

每一个**业务节点**都可以配置失败重试的次数，当该任务节点失败，会自动重试，直到成功或者超过配置的重试次数。**逻辑节点**不支持失败重试。但是逻辑节点里的任务支持重试。

如果工作流中有任务失败达到最大重试次数，工作流就会失败停止，失败的工作流可以手动进行重跑操作或者流程恢复操作

##### 五、任务优先级设计

在早期调度设计中，如果没有优先级设计，采用公平调度设计的话，会遇到先行提交的任务可能会和后继提交的任务同时完成的情况，而不能做到设置流程或者任务的优先级，因此我们对此进行了重新设计，目前我们设计如下：

- 按照**不同流程实例优先级**优先于**同一个流程实例优先级**优先于**同一流程内任务优先级**优先于**同一流程内任务**提交顺序依次从高到低进行任务处理。
  - 具体实现是根据任务实例的 json 解析优先级，然后把**流程实例优先级*流程实例 id*任务优先级\_任务 id**信息保存在 ZooKeeper 任务队列中，当从任务队列获取的时候，通过字符串比较即可得出最需要优先执行的任务
    - 其中流程定义的优先级是考虑到有些流程需要先于其他流程进行处理，这个可以在流程启动或者定时启动时配置，共有 5 级，依次为 HIGHEST、HIGH、MEDIUM、LOW、LOWEST。如下图

        <p align="center">
           <img src="https://analysys.github.io/easyscheduler_docs_cn/images/process_priority.png" alt="流程优先级配置"  width="40%" />
         </p>

    - 任务的优先级也分为 5 级，依次为 HIGHEST、HIGH、MEDIUM、LOW、LOWEST。如下图

        <p align="center">
           <img src="https://analysys.github.io/easyscheduler_docs_cn/images/task_priority.png" alt="任务优先级配置"  width="35%" />
         </p>

##### 六、Logback 和 gRPC 实现日志访问

- 由于 Web(UI)和 Worker 不一定在同一台机器上，所以查看日志不能像查询本地文件那样。有两种方案：
- 将日志放到 ES 搜索引擎上
- 通过 gRPC 通信获取远程日志信息
- 介于考虑到尽可能的 DolphinScheduler 的轻量级性，所以选择了 gRPC 实现远程访问日志信息。

 <p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/grpc.png" alt="grpc远程访问"  width="60%" />
 </p>

- 我们使用自定义 Logback 的 FileAppender 和 Filter 功能，实现每个任务实例生成一个日志文件。
- FileAppender 主要实现如下：

```java
/**
 * task log appender
 */
public class TaskLogAppender extends FileAppender<ILoggingEvent> {

    ...

   @Override
   protected void append(ILoggingEvent event) {

       if (currentlyActiveFile == null){
           currentlyActiveFile = getFile();
       }
       String activeFile = currentlyActiveFile;
       // thread name： taskThreadName-processDefineId_processInstanceId_taskInstanceId
       String threadName = event.getThreadName();
       String[] threadNameArr = threadName.split("-");
       // logId = processDefineId_processInstanceId_taskInstanceId
       String logId = threadNameArr[1];
       ...
       super.subAppend(event);
   }
}
```

以/流程定义 id/流程实例 id/任务实例 id.log 的形式生成日志

- 过滤匹配以 TaskLogInfo 开始的线程名称：

- TaskLogFilter 实现如下：

```java
/**
*  task log filter
*/
public class TaskLogFilter extends Filter<ILoggingEvent> {

   @Override
   public FilterReply decide(ILoggingEvent event) {
       if (event.getThreadName().startsWith("TaskLogInfo-")){
           return FilterReply.ACCEPT;
       }
       return FilterReply.DENY;
   }
}
```

### 总结

本文从调度出发，初步介绍了大数据分布式工作流调度系统--DolphinScheduler 的架构原理及实现思路。未完待续


---

## contribute/backend/mechanism/global-parameter.md

# 全局参数开发文档

用户在定义方向为 OUT 的参数后，会保存在 task 的 localParam 中。

## 参数的使用

从 DAG 中获取当前需要创建的 taskInstance 的直接前置节点 preTasks，获取 preTasks 的 varPool，将该 `varPool(List<Property>)`合并为一个 varPool，在合并过程中，如果发现有相同的变量名的变量，按照以下逻辑处理

* 若所有的值都是 null，则合并后的值为 null
* 若有且只有一个值为非 null，则合并后的值为该非 null 值
* 若所有的值都不是 null，则根据取 varPool 的 taskInstance 的 endtime 最早的一个

在合并过程中将所有的合并过来的 Property 的方向更新为 IN

合并后的结果保存在 taskInstance.varPool 中。

Worker 收到后将 varPool 解析为 Map<String,Property> 的格式，其中 map 的 key 为 property.prop 也就是变量名。

在 processor 处理参数时，会将 varPool 和 localParam 和 globalParam 三个变量池参数合并，合并过程中若有参数名重复的参数，按照以下优先级进行替换，高优先级保留，低优先级被替换：

* `globalParam` ：高
* `varPool` ：中
* `localParam` ：低

参数会在节点内容执行之前利用正则表达式比配到 ${变量名}，替换为对应的值。

## 参数的设置

目前仅支持 SQL 和 SHELL 节点的参数获取。
从 localParam 中获取方向为 OUT 的参数，根据不同节点的类型做以下方式处理。

### SQL 节点

参数返回的结构为 List<Map<String,String>>

其中，List 的元素为每行数据，Map 的 key 为列名，value 为该列对应的值

* 若 SQL 语句返回为有一行数据，则根据用户在定义 task 时定义的 OUT 参数名匹配列名，若没有匹配到则放弃。
* 若 SQL 语句返回多行，按照根据用户在定义 task 时定义的类型为 LIST 的 OUT 参数名匹配列名，将对应列的所有行数据转换为 `List<String>`，作为该参数的值。若没有匹配到则放弃。

### SHELL 节点

processor 执行后的结果返回为 `Map<String,String>`

用户在定义 shell 脚本时需要在输出中定义 `${setValue(key=value)}`

在参数处理时去掉 ${setValue()}，按照 “=” 进行拆分，第 0 个为 key，第 1 个为 value。

同样匹配用户定义 task 时定义的 OUT 参数名与 key，将 value 作为该参数的值。

返回参数处理

* 获取到的 processor 的结果为 String
* 判断 processor 是否为空，为空退出
* 判断 localParam 是否为空，为空退出
* 获取 localParam 中为 OUT 的参数，为空退出
* 将String按照上诉格式格式化（SQL为List<Map<String,String>>，shell为Map<String,String>）
* 将匹配好值的参数赋值给 varPool（List<Property>，其中包含原有 IN 的参数）

varPool 格式化为 json，传递给 master。
Master 接收到 varPool 后，将其中为 OUT 的参数回写到 localParam 中。


---

## contribute/backend/mechanism/overview.md

# 综述

<!-- TODO 由于 side menu 不支持多个等级，所以新建了一个leading page存放 -->
* [全局参数](global-parameter.md)
* [switch任务类型](task/switch.md)


---

## contribute/backend/mechanism/task/switch.md

# SWITCH 任务类型开发文档

Switch任务类型的工作流程如下

* 用户定义的表达式和分支流转的信息存在了taskdefinition中的taskParams中，当switch被执行到时，会被格式化为SwitchParameters。
* SwitchTaskExecThread从上到下（用户在页面上定义的表达式顺序）处理switch中定义的表达式，从varPool中获取变量的值，通过js解析表达式，如果表达式返回true，则停止检查，并且记录该表达式的顺序，这里我们记录为resultConditionLocation。SwitchTaskExecThread的任务便结束了。
* 当switch节点运行结束之后，如果没有发生错误（较为常见的是用户定义的表达式不合规范或参数名有问题），这个时候MasterExecThread.submitPostNode会获取DAG的下游节点继续执行。
* DagHelper.parsePostNodes中如果发现当前节点（刚刚运行完成功的节点）是switch节点的话，会获取resultConditionLocation，将SwitchParameters中除了resultConditionLocation以外的其他分支全部skip掉。这样留下来的就只有需要执行的分支了。


---

## contribute/backend/spi/alert.md

### DolphinScheduler Alert SPI 主要设计

#### DolphinScheduler SPI 设计

DolphinScheduler 正在处于微内核 + 插件化的架构更改之中，所有核心能力如任务、资源存储、注册中心等都将被设计为扩展点，我们希望通过 SPI 来提高 DolphinScheduler 本身的灵活性以及友好性（扩展性）。

告警相关代码可以参考 `dolphinscheduler-alert-api` 模块。该模块定义了告警插件扩展的接口以及一些基础代码，当我们需要实现相关功能的插件化的时候，建议先阅读此块的代码，当然，更建议你阅读文档，这会减少很多时间，不过文档有一定的后滞性，当文档缺失的时候，建议以源码为准（如果有兴趣，我们也欢迎你来提交相关文档），此外，我们几乎不会对扩展接口做变更（不包括新增），除非重大架构调整，出现不兼容升级版本，因此，现有文档一般都能够满足。

我们采用了原生的 JAVA-SPI，当你需要扩展的时候，事实上你只需要关注扩展`org.apache.dolphinscheduler.alert.api.AlertChannelFactory`接口即可，底层相关逻辑如插件加载等内核已经实现，这让我们的开发更加专注且简单。

另外，`AlertChannelFactory` 继承自 `PrioritySPI`，这意味着你可以设置插件的优先级，当你有两个插件同名时，你可以通过重写 `getIdentify` 方法来自定义优先级。高优先级的插件会被加载，但是如果你有两个同名且优先级相同的插件，加载插件时服务器会抛出 `IllegalArgumentException`。

顺便提一句，我们采用了一款优秀的前端组件 form-create，它支持基于 json 生成前端 ui 组件，如果插件开发牵扯到前端，我们会通过 json 来生成相关前端 UI 组件，org.apache.dolphinscheduler.spi.params 里面对插件的参数做了封装，它会将相关参数全部全部转化为对应的 json，这意味这你完全可以通过 Java 代码的方式完成前端组件的绘制（这里主要是表单，我们只关心前后端交互的数据）。

本文主要着重讲解 Alert 告警相关设计以及开发。

#### 主要模块

如果你并不关心它的内部设计，只是想单纯的了解如何开发自己的告警插件，可以略过该内容。

* dolphinscheduler-alert-api

  该模块是 ALERT SPI 的核心模块，该模块定义了告警插件扩展的接口以及一些基础代码，扩展插件必须实现此模块所定义的接口:`org.apache.dolphinscheduler.alert.api.AlertChannelFactory`

* dolphinscheduler-alert-plugins

  该模块是目前我们提供的插件，目前我们已经支持数十种插件，如 Email、DingTalk、Script等。

#### Alert SPI 主要类信息：

AlertChannelFactory
告警插件工厂接口，所有告警插件需要实现该接口，该接口用来定义告警插件的名称，需要的参数，create 方法用来创建具体的告警插件实例。

AlertChannel
告警插件的接口，告警插件需要实现该接口，该接口中只有一个方法 process ，上层告警系统会调用该方法并通过该方法返回的 AlertResult 来获取告警的返回信息。

AlertData
告警内容信息，包括 id，标题，内容，日志。

AlertInfo
告警相关信息，上层系统调用告警插件实例时，将该类的实例通过 process 方法传入具体的告警插件。内部包含告警内容 AlertData 和调用的告警插件实例的前端填写的参数信息。

AlertResult
告警插件发送告警返回信息。

org.apache.dolphinscheduler.spi.params
该包下是插件化的参数定义，我们前端使用 from-create 这个前端库，该库可以基于插件定义返回的参数列表 json 来动态生成前端的 ui，因此我们在做 SPI 插件开发的时候无需关心前端。

该 package 下我们目前只封装了 RadioParam，TextParam，PasswordParam，分别用来定义 text 类型的参数，radio 参数和 password 类型的参数。

AbsPluginParams 该类是所有参数的基类，RadioParam 这些类都继承了该类。每个 DS 的告警插件都会在 AlertChannelFactory 的实现中返回一个 AbsPluginParams 的 list。

alert_spi 具体设计可见 issue：[Alert Plugin Design](https://github.com/apache/dolphinscheduler/issues/3049)

#### Alert SPI 内置实现

* Email

  电子邮件告警通知

* DingTalk

  钉钉群聊机器人告警

  相关参数配置可以参考钉钉机器人文档。

* EnterpriseWeChat

  企业微信告警通知

  相关参数配置可以参考企业微信机器人文档。

* Script

  我们实现了 Shell 脚本告警，我们会将相关告警参数透传给脚本，你可以在 Shell 中实现你的相关告警逻辑，如果你需要对接内部告警应用，这是一种不错的方法。

* FeiShu

  飞书告警通知

* Slack

  Slack告警通知

* PagerDuty

  PagerDuty告警通知

* WebexTeams

  WebexTeams告警通知
  相关参数配置可以参考WebexTeams文档。

* Telegram

  Telegram告警通知
  相关参数配置可以参考Telegram文档。

* Http

  我们实现了Http告警，调用大部分的告警插件最终都是Http请求，如果我们没有支持你常用插件，可以使用Http来实现你的告警需求，同时也欢迎将你常用插件贡献到社区。


---

## contribute/backend/spi/datasource.md

## DolphinScheduler Datasource SPI 主要设计

#### 如何使用数据源？

数据源中心默认支持POSTGRESQL、HIVE/IMPALA、SPARK、CLICKHOUSE、SQLSERVER数据源。

如果使用的是MySQL、ORACLE数据源则需要、把对应的驱动包放置lib目录下

#### 如何进行数据源插件开发？

org.apache.dolphinscheduler.spi.datasource.DataSourceChannel
org.apache.dolphinscheduler.spi.datasource.DataSourceChannelFactory
org.apache.dolphinscheduler.spi.datasource.client.DataSourceClient

1. 第一步数据源插件实现以上接口和继承通用client即可，具体可以参考sqlserver、mysql等数据源插件实现，所有RDBMS插件的添加方式都是一样的。
2. 在数据源插件pom.xml添加驱动配置

我们在 dolphinscheduler-datasource-api 模块提供了所有数据源对外访问的 API

另外，DataSourceChannelFactory 继承自PrioritySPI，这意味着你可以设置插件的优先级，当你有两个插件同名时，你可以通过重写getIdentify 方法来自定义优先级。高优先级的插件会被加载，但是如果你有两个同名且优先级相同的插件，加载插件时服务器会抛出 `IllegalArgumentException`。

#### **未来计划**

支持kafka、http、文件、sparkSQL、FlinkSQL等数据源


---

## contribute/backend/spi/registry.md

### DolphinScheduler Registry SPI 扩展

#### 如何使用？

进行以下配置（以 zookeeper 为例）

* 注册中心插件配置, 以Zookeeper 为例 (registry.properties)
  dolphinscheduler-service/src/main/resources/registry.properties

  ```registry.properties
  registry.plugin.name=zookeeper
  registry.servers=127.0.0.1:2181
  ```

具体配置信息请参考具体插件提供的参数信息，例如 zk：`org/apache/dolphinscheduler/plugin/registry/zookeeper/ZookeeperConfiguration.java`
所有配置信息前缀需要 +registry，如 base.sleep.time.ms，在 registry 中应该这样配置：registry.base.sleep.time.ms=100

#### 如何扩展

`dolphinscheduler-registry-api` 定义了实现插件的标准，当你需要扩展插件的时候只需要实现 `org.apache.dolphinscheduler.registry.api.RegistryFactory` 即可。

`dolphinscheduler-registry-plugin` 模块下是我们目前所提供的注册中心插件。

#### FAQ

1：registry connect timeout

可以增加相关超时参数。


---

## contribute/backend/spi/task.md

## DolphinScheduler Task SPI 扩展

#### 如何进行任务插件开发？

org.apache.dolphinscheduler.spi.task.TaskChannel

插件实现以上接口即可。主要包含创建任务（任务初始化，任务运行等方法）、任务取消，如果是 yarn 任务，则需要实现 org.apache.dolphinscheduler.plugin.task.api.AbstractYarnTask。

我们在 dolphinscheduler-task-api 模块提供了所有任务对外访问的 API，而 dolphinscheduler-spi 模块则是 spi 通用代码库，定义了所有的插件模块，比如告警模块，注册中心模块等，你可以详细阅读查看。

另外，`TaskChannelFactory` 继承自 `PrioritySPI`，这意味着你可以设置插件的优先级，当你有两个插件同名时，你可以通过重写 `getIdentify` 方法来自定义优先级。高优先级的插件会被加载，但是如果你有两个同名且优先级相同的插件，加载插件时服务器会抛出 `IllegalArgumentException`。

*NOTICE*

由于任务插件涉及到前端页面，目前前端的SPI还没有实现，因此你需要单独实现插件对应的前端页面。

如果任务插件存在类冲突，你可以采用 [Shade-Relocating Classes](https://maven.apache.org/plugins/maven-shade-plugin/) 来解决这种问题。


---

## contribute/development-environment-setup.md

# DolphinScheduler 开发手册

## 软件要求

在搭建 DolphinScheduler 开发环境之前请确保你已经安装以下软件:

* [Git](https://git-scm.com/downloads)
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html): v1.8+
* [Maven](http://maven.apache.org/download.cgi): v3.5+
* [Node](https://nodejs.org/en/download): v16.0+
* [Pnpm](https://pnpm.io/installation): v8.0+ (请确保不同版本的pnpm与Node.js之间是相互兼容的，可参考：[Compatibility](https://pnpm.io/installation#compatibility))

### 克隆代码库

通过你 git 管理工具下载 git 代码，下面以 git-core 为例

```shell
mkdir dolphinscheduler
cd dolphinscheduler
git clone git@github.com:apache/dolphinscheduler.git
```

### 编译源码

支持的系统:
* MacOS
* Linux

运行 `mvn clean install -Prelease -Dmaven.test.skip=true`

### 代码风格

DolphinScheduler使用`Spotless`检查并修复代码风格和格式问题。
您可以执行如下的命令，`Spotless`将会为您自动检查并修复代码风格和格式问题。

```shell
./mvnw spotless:apply
```

我们也提供了一个`pre-commit`配置文件，方便您配置。要使用它，您需要先安装python，然后通过运行以下命令安装`pre-commit`：

```shell
python -m pip install pre-commit
```

之后，您可以运行以下命令安装`pre-commit`钩子：

```shell
pre-commit install
```

现在，每次您提交代码时，`pre-commit`都会自动运行`Spotless`来检查代码风格和格式。

### Helm 模板规范

当您修改了Helm模板相关的文件后， 可以使用如下命令来调试 Helm 模板：

```shell
helm template ./deploy/kubernetes/dolphinscheduler --debug 
```

Helm模板调试通过之后，需要使用如下命令来自动更新README.md文件（手动更新很可能格式不符合要求）：

```shell
./mvnw validate -P helm-doc -pl :dolphinscheduler
```

## Docker镜像构建

DolphinScheduler 每次发版都会同时发布 Docker 镜像，你可以在 [Docker Hub](https://hub.docker.com/search?q=DolphinScheduler) 中找到这些镜像

* 如果你想基于源码进行改造，然后在本地构建Docker镜像，可以在代码改造完成后运行

> -Pstaging 包含插件，适合开发和测试以及无网络环境离线部署
> -Prelease 不包含插件，适合生产环境，有能访问插件的网络可以按需下载

```shell
cd dolphinscheduler
./mvnw -B clean package \
       -Dmaven.test.skip \
       -Dspotless.skip=true \
       -Ddocker.tag=<TAG> \
       -Pdocker,[release|staging]
```

当命令运行完了后你可以通过 `docker images` 命令查看刚刚创建的镜像

* 如果你想基于源码进行改造，然后构建Docker镜像并推送到 <HUB_URL>，可以在代码改造完成后运行

```shell
cd dolphinscheduler
./mvnw -B clean deploy \
       -Dmaven.test.skip \
       -Dspotless.skip = true \
       -Ddocker.tag=<TAG> \
       -Ddocker.hub=<HUB_URL> \
       -Pdocker,[release|staging]
```

* 如果你不仅需要改造源码，还想要自定义 Docker 镜像打包的依赖，可以在修改源码的同时修改 Dockerfile 的定义。你可以运行以下命令找到所有的 Dockerfile 文件

```shell
cd dolphinscheduler
find . -iname 'Dockerfile'
```

之后再运行上面的构建镜像命令

* 如果你因为个性化需求想要自己打包 Docker 镜像，最佳实践是基于 DolphinScheduler 对应镜像编写 Dockerfile 文件

```Dockerfile
FROM dolphinscheduler-standalone-server
RUN apt update ; \
    apt install -y <YOUR-CUSTOM-DEPENDENCE> ; \
```

> **_注意：_** Docker默认会构建并推送 linux/amd64,linux/arm64 多架构镜像
>
> 必须使用Docker 19.03及以后的版本，因为19.03及以后的版本包含 buildx

## 开发者须知

DolphinScheduler 开发环境配置有两个方式，分别是standalone模式，以及普通模式

* [standalone模式](#dolphinscheduler-standalone快速开发模式)：**推荐使用，但仅支持 1.3.9 及以后的版本**，方便快速的开发环境搭建，能解决大部分场景的开发
* [普通模式](#dolphinscheduler-普通开发模式)：master、worker、api等单独启动，能更好的的模拟真实生产环境，可以覆盖的测试环境更多

## DolphinScheduler Standalone快速开发模式

> **_注意：_** 仅供单机开发调试使用，默认使用 H2 Database, Zookeeper Testing Server
>
> Standalone 仅在 DolphinScheduler 1.3.9 及以后的版本支持

### 分支选择

开发不同的代码需要基于不同的分支

* 如果想基于二进制包开发，切换到对应版本的代码，如 1.3.9 则是 `1.3.9-release`
* 如果想要开发最新代码，切换到 `dev` 分支

### 启动后端

在 IntelliJ IDEA 找到并启动类 `org.apache.dolphinscheduler.StandaloneServer` 即可完成后端启动

> 注意：启动前请在启动配置里将 `Add dependencies with "provided" scope to classpath` 选项勾选上，这样可以避免启动时找不到依赖的问题

### 启动前端

安装前端依赖并运行前端组件

> 注意：你可以在[frontend development](./frontend-development.md)里查看更多前端的相关配置

在运行前端组件前，如果你还没有安装`pnpm`，可以使用以下命令安装：

```shell
npm install -g pnpm
```

确保`pnpm`已经安装完成后，运行以下命令：

```shell
cd dolphinscheduler-ui
pnpm install
pnpm run dev
```

截止目前，前后端已成功运行起来，浏览器访问[http://localhost:5173](http://localhost:5173)，并使用默认账户密码 **admin/dolphinscheduler123** 即可完成登录

## DolphinScheduler 普通开发模式

### 必要软件安装

#### zookeeper

下载 [ZooKeeper](https://zookeeper.apache.org/releases.html)，解压

* 在 ZooKeeper 的目录下新建 zkData、zkLog文件夹
* 将 conf 目录下的 `zoo_sample.cfg` 文件，复制一份，重命名为 `zoo.cfg`，修改其中数据和日志的配置，如：

  ```shell
  dataDir=/data/zookeeper/data ## 此处使用绝对路径
  dataLogDir=/data/zookeeper/datalog
  ```
* 运行 `./bin/zkServer.sh`

#### 数据库

DolphinScheduler 的元数据存储在关系型数据库中，目前支持的关系型数据库包括 MySQL 以及 PostgreSQL。下面以MySQL为例，启动数据库并创建新 database 作为 DolphinScheduler 元数据库，这里以数据库名 dolphinscheduler 为例

创建完新数据库后，将 `dolphinscheduler/dolphinscheduler-dao/src/main/resources/sql/dolphinscheduler_mysql.sql` 下的 sql 文件直接在 MySQL 中运行，完成数据库初始化

#### 启动后端

下面步骤将引导如何启动 DolphinScheduler 后端服务

##### 必要的准备工作

* 打开项目：使用开发工具打开项目，这里以 IntelliJ IDEA 为例，打开后需要一段时间，让 IntelliJ IDEA 完成以依赖的下载

* 必要的修改

  * 如果使用 MySQL 作为元数据库，需要先修改 `dolphinscheduler-bom/pom.xml`，将 `mysql-connector-j` 依赖的 `scope` 改为 `compile`，使用 PostgreSQL 则不需要
  * 修改 Master 数据库配置，修改 `dolphinscheduler-master/src/main/resources/application.yaml` 文件中的数据库配置
  * 修改 Api 数据库配置，修改 `dolphinscheduler-api/src/main/resources/application.yaml` 文件中的数据库配置
  * 修改 Alert 数据库配置，修改 `dolphinscheduler-alert/dolphinscheduler-alert-server/src/main/resources/application.yaml` 文件中的数据库配置

  本样例以 MySQL 为例，其中数据库名为 dolphinscheduler，账户名密码均为 dolphinscheduler

  ```application.yaml
  spring:
    datasource:
      driver-class-name: com.mysql.cj.jdbc.Driver
      url: jdbc:mysql://127.0.0.1:3306/dolphinscheduler?useUnicode=true&characterEncoding=UTF-8
      username: dolphinscheduler
      password: dolphinscheduler
  ```

##### 启动服务

我们需要启动三个服务，包括 MasterServer，WorkerServer，ApiApplicationServer

* MasterServer：在 IntelliJ IDEA 中执行 `org.apache.dolphinscheduler.server.master.MasterServer` 中的 `main` 方法，并配置 *VM Options* `-DDOCKER=true -Dspring.profiles.active=mysql`
* WorkerServer：在 IntelliJ IDEA 中执行 `org.apache.dolphinscheduler.server.worker.WorkerServer` 中的 `main` 方法，并配置 *VM Options* `-DDOCKER=true`
* AlertServer：在 IntelliJ IDEA 中执行 `org.apache.dolphinscheduler.alert.AlertServer` 中的 `main` 方法，并配置 *VM Options* `-DDOCKER=true -Dspring.profiles.active=mysql`
* ApiApplicationServer：在 IntelliJ IDEA 中执行 `org.apache.dolphinscheduler.api.ApiApplicationServer` 中的 `main` 方法，并配置 *VM Options* `-DDOCKER=true -Dspring.profiles.active=mysql`。启动完成可以浏览 Open API 文档，地址为 http://localhost:12345/dolphinscheduler/swagger-ui/index.html

> VM Options `-Dspring.profiles.active=mysql` 中 `mysql` 表示指定的配置文件

### 启动前端

安装前端依赖并运行前端组件

```shell
cd dolphinscheduler-ui
pnpm install
pnpm run dev
```

截止目前，前后端已成功运行起来，浏览器访问[http://localhost:5173](http://localhost:5173)，并使用默认账户密码 **admin/dolphinscheduler123** 即可完成登录


---

## contribute/e2e-test.md

# DolphinScheduler — E2E 自动化测试

## 一、前置知识：

### 1、E2E 测试与单元测试的区别

E2E，是“End to End”的缩写，可以翻译成“端到端”测试。它模仿用户，从某个入口开始，逐步执行操作，直到完成某项工作。与单元测试不同，后者通常需要测试参数、参数类型、参数值、参数数量、返回值、抛出错误等，目的在于保证特定函数能够在任何情况下都稳定可靠完成工作。单元测试假定只要所有函数都正常工作，那么整个产品就能正常工作。

相对来说，E2E 测试并没有那么强调要覆盖全部使用场景，它关注的**一个完整的操作链是否能够完成**。对于 Web 前端来说，还关注**界面布局、内容信息是否符合预期**。

比如，登陆界面的 E2E 测试，关注用户是否能够正常输入，正常登录；登陆失败的话，是否能够正确显示错误信息。至于输入不合法的内容是否处理，并不是所关注的重点。

### 2、Selenium 测试框架

[Selenium](https://www.selenium.dev) 是一种开源测试工具，用于在 Web 浏览器上执行自动化测试。该框架使用 WebDriver 通过浏览器的原生组件，转化 Web Service 的命令为浏览器 native 的调用来完成操作。简单来说，就是模拟浏览器，对于页面的元素进行选择操作。

WebDriver 是一个 API 和协议，它定义了一个语言中立的接口，用于控制 web 浏览器的行为。 每个浏览器都有一个特定的 WebDriver 实现，称为驱动程序。驱动程序是负责委派给浏览器的组件，并处理与 Selenium 和浏览器之间的通信。

Selenium 框架通过一个面向用户的界面将所有这些部分连接在一起， 该界面允许透明地使用不同的浏览器后端， 从而实现跨浏览器和跨平台自动化。

## 二、E2E 测试

### 1、E2E-Pages

DolphinScheduler 的 E2E 测试使用 docker-compose 部署，当前测试的为单机模式，主要用于检验一些例如“增删改查”基本功能，后期如需做集群验证，例如不同服务之间的协作，或者各个服务之间的通讯机制，可参考 `deploy/docker/docker-compose.yml`来配置。

对于 E2E 测试（前端这一块），使用 [页面模型](https://www.selenium.dev/documentation/guidelines/page_object_models/) 的形式，主要为每一个页面建立一个对应的模型。下面以登录页为例：

```java
package org.apache.dolphinscheduler.e2e.pages;

import org.apache.dolphinscheduler.e2e.pages.common.NavBarPage;
import org.apache.dolphinscheduler.e2e.pages.security.TenantPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public final class LoginPage extends NavBarPage {
    @FindBy(id = "inputUsername")
    private WebElement inputUsername;

    @FindBy(id = "inputPassword")
    private WebElement inputPassword;

    @FindBy(id = "btnLogin")
    private WebElement buttonLogin;

    public LoginPage(RemoteWebDriver driver) {
        super(driver);
    }

    @SneakyThrows
    public TenantPage login(String username, String password) {
        inputUsername().sendKeys(username);
        inputPassword().sendKeys(password);
        buttonLogin().click();

        new WebDriverWait(driver, 10)
            .until(ExpectedConditions.urlContains("/#/security"));

        return new TenantPage(driver);
    }
}
```

在测试过程中，我们只针对所需要关注的元素进行测试，而非页面中的所有元素，所以在登陆页面只对用户名、密码和登录按钮这些元素进行声明。通过 Selenium 测试框架所提供的 FindBy 接口来查找 Vue 文件中对应的 id 或 class。

此外，在测试过程中，并不会直接去操作元素，一般选择封装对应的方法，以达到复用的效果。例如想要登录的话，直接传入用户名和密码，通过 `public TenantPage login()` 方法去操作所传入的元素，从而达到实现登录的效果，即当用户完成登录之后，跳转到安全中心（默认进入到租户管理页面）。

在安全中心页面（SecurityPage）提供了 goToTab 方法，用于测试对应侧栏的跳转，主要包括：租户管理（TenantPage）、用户管理（UserPage）、工作组管理（WorkerGroupPage）和队列管理（QueuePage）。这些页面的实现方式同理，主要测试表单的输入、增加和删除按钮是否能够返回出对应的页面。

```java
public <T extends SecurityPage.Tab> T goToTab(Class<T> tab) {
       if (tab == TenantPage.class) {
           WebElement menuTenantManageElement = new WebDriverWait(driver, 60)
                   .until(ExpectedConditions.elementToBeClickable(menuTenantManage));
           ((JavascriptExecutor)driver).executeScript("arguments[0].click();", menuTenantManageElement);
           return tab.cast(new TenantPage(driver));
       }
       if (tab == UserPage.class) {
           WebElement menUserManageElement = new WebDriverWait(driver, 60)
                   .until(ExpectedConditions.elementToBeClickable(menUserManage));
           ((JavascriptExecutor)driver).executeScript("arguments[0].click();", menUserManageElement);
           return tab.cast(new UserPage(driver));
       }
       if (tab == WorkerGroupPage.class) {
           WebElement menWorkerGroupManageElement = new WebDriverWait(driver, 60)
                   .until(ExpectedConditions.elementToBeClickable(menWorkerGroupManage));
           ((JavascriptExecutor)driver).executeScript("arguments[0].click();", menWorkerGroupManageElement);
           return tab.cast(new WorkerGroupPage(driver));
       }
       if (tab == QueuePage.class) {
           menuQueueManage().click();
           return tab.cast(new QueuePage(driver));
       }
       throw new UnsupportedOperationException("Unknown tab: " + tab.getName());
   }
```

![SecurityPage](../../img/e2e-test/SecurityPage.png)

对于导航栏选项的跳转，在`org/apache/dolphinscheduler/e2e/pages/common/NavBarPage.java` 中提供了 goToNav 的方法。当前支持的页面为：项目管理（ProjectPage）、安全中心（SecurityPage）和资源中心（ResourcePage）。

```java
    public <T extends NavBarItem> T goToNav(Class<T> nav) {
        if (nav == ProjectPage.class) {
            WebElement projectTabElement = new WebDriverWait(driver, 60)
                .until(ExpectedConditions.elementToBeClickable(projectTab));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", projectTabElement);
            return nav.cast(new ProjectPage(driver));
        }

        if (nav == SecurityPage.class) {
            WebElement securityTabElement = new WebDriverWait(driver, 60)
                .until(ExpectedConditions.elementToBeClickable(securityTab));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", securityTabElement);
            return nav.cast(new SecurityPage(driver));
        }

        if (nav == ResourcePage.class) {
            WebElement resourceTabElement = new WebDriverWait(driver, 60)
                .until(ExpectedConditions.elementToBeClickable(resourceTab));
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", resourceTabElement);
            return nav.cast(new ResourcePage(driver));
        }

        throw new UnsupportedOperationException("Unknown nav bar");
    }
```

### 2、E2E-Cases

当前所支持的 E2E 测试案例，主要包括：文件管理、项目管理、队列管理、租户管理、用户管理、Worker 分组管理和工作流测试。

![E2E_Cases](../../img/e2e-test/E2E_Cases.png)

下面以租户管理测试为例，前文已经说明，我们使用 docker-compose 进行部署，所以每个测试案例，都需要以注解的形式引入对应的文件。

使用 Selenium 所提供的 RemoteWebDriver 来加载浏览器。在每个测试案例开始之前都需要进行一些准备工作。比如：登录用户、跳转到对应的页面（根据具体的测试案例而定）。

```java
@BeforeAll
public static void setup() {
    new LoginPage(browser)
            .login("admin", "dolphinscheduler123") // 登录进入租户界面
            .goToNav(SecurityPage.class) // 安全中心
            .goToTab(TenantPage.class)
    ;
}
```

在完成准备工作之后，就是正式的测试案例编写。我们使用 @Order() 注解的形式，用于模块化，确认测试顺序。在进行测试之后，使用断言来判断测试是否成功，如果断言返回 true，则表示创建租户成功。可参考创建租户的测试代码：

```java
    @Test
    @Order(10)
    void testCreateTenant() {
        final TenantPage page = new TenantPage(browser);
        page.create(tenant);

        await().untilAsserted(() -> assertThat(page.tenantList())
                .as("Tenant list should contain newly-created tenant")
                .extracting(WebElement::getText)
                .anyMatch(it -> it.contains(tenant)));
    }
```

其余的都是类似的情况，可参考具体的源码来理解。

https://github.com/apache/dolphinscheduler/tree/dev/dolphinscheduler-e2e/dolphinscheduler-e2e-case/src/test/java/org/apache/dolphinscheduler/e2e/cases

## 三、补充

在本地运行的时候，首先需要启动相应的本地服务，可以参考该页面: [环境搭建](./development-environment-setup.md)

在本地运行 E2E 测试的时候，可以配置 `-Dlocal=true` 参数，用于连接本地，方便对于 UI 界面的更改。

如果是`M1`芯片的机器，可以使用`-Dm1_chip=true` 参数,用于配置使用`ARM64`支持的容器。

![Dlocal](../../img/e2e-test/Dlocal.png)

在本地运行过程中，如果出现连接超时，可增大加载时间，建议 30 及其以上。

![timeout](../../img/e2e-test/timeout.png)

测试的运行过程将会以 MP4 的文件格式存在。

![MP4](../../img/e2e-test/MP4.png)


---

## contribute/frontend-development.md

# 前端开发文档

### 技术选型

```
Vue mvvm 框架

Es6 ECMAScript 6.0

Ans-ui Analysys-ui

D3 可视化库图表库

Jsplumb 连线插件库

Lodash 高性能的 JavaScript 实用工具库
```

### 开发环境搭建

- 

#### Node安装

Node包下载 (注意版本 v12.20.2) `https://nodejs.org/download/release/v12.20.2/`

- 

#### 前端项目构建

用命令行模式 `cd`  进入 `dolphinscheduler-ui`项目目录并执行 `npm install` 拉取项目依赖包

> 如果 `npm install` 速度非常慢，你可以设置淘宝镜像

```
npm config set registry http://registry.npmmirror.com/
```

- 修改 `dolphinscheduler-ui/.env.development` 文件中的 `VITE_APP_DEV_WEB_URL`，用于跟后端交互：

```
# 代理的接口地址（自行修改）
VITE_APP_DEV_WEB_URL = 'http://127.0.0.1:12345'
```

##### ！！！这里特别注意 项目如果在拉取依赖包的过程中报 " node-sass error " 错误，请在执行完后再次执行以下命令

```bash
npm install node-sass --unsafe-perm #单独安装node-sass依赖
```

- 

#### 开发环境运行

- `pnpm run dev` 项目开发环境 (启动后访问地址 http://localhost:8888)

#### 前端项目发布

- `pnpm run build:prod` 项目打包 (打包后根目录会创建一个名为dist文件夹，用于发布线上Nginx)

运行 `pnpm run build:prod` 命令，生成打包文件（dist）包

再拷贝到服务器对应的目录下（前端服务静态页面存放目录）

访问地址 `http://localhost:8888`

#### Linux下使用node启动并且守护进程

安装pm2 `npm install -g pm2`

在项目`dolphinscheduler-ui`根目录执行 `pm2 start npm -- run dev` 启动项目

#### 命令

- 启用 `pm2 start npm -- run dev`

- 停止 `pm2 stop npm`

- 删除 `pm2 delete npm`

- 状态 `pm2 list`

```

[root@localhost dolphinscheduler-ui]# pm2 start npm -- run dev
[PM2] Applying action restartProcessId on app [npm](ids: 0)
[PM2] [npm](0) ✓
[PM2] Process successfully started
┌──────────┬────┬─────────┬──────┬──────┬────────┬─────────┬────────┬─────┬──────────┬──────┬──────────┐
│ App name │ id │ version │ mode │ pid  │ status │ restart │ uptime │ cpu │ mem      │ user │ watching │
├──────────┼────┼─────────┼──────┼──────┼────────┼─────────┼────────┼─────┼──────────┼──────┼──────────┤
│ npm      │ 0  │ N/A     │ fork │ 6168 │ online │ 31      │ 0s     │ 0%  │ 5.6 MB   │ root │ disabled │
└──────────┴────┴─────────┴──────┴──────┴────────┴─────────┴────────┴─────┴──────────┴──────┴──────────┘
 Use `pm2 show <id|name>` to get more details about an app

```

### 项目目录结构

`build` 打包及开发环境项目的一些webpack配置

`node_modules` 开发环境node依赖包

`src` 项目所需文件

`src => combo` 项目第三方资源本地化 `npm run combo`具体查看`build/combo.js`

`src => font` 字体图标库可访问 `https://www.iconfont.cn` 进行添加 注意：字体库用的自己的 二次开发需要重新引入自己的库 `src/sass/common/_font.scss`

`src => images` 公共图片存放

`src => js` js/vue

`src => lib` 公司内部组件（公司组件库开源后可删掉）

`src => sass` sass文件 一个页面对应一个sass文件

`src => view` 页面文件 一个页面对应一个html文件

```
> 项目采用vue单页面应用(SPA)开发
- 所有页面入口文件在 `src/js/conf/${对应页面文件名 => home}` 的 `index.js` 入口文件
- 对应的sass文件则在 `src/sass/conf/${对应页面文件名 => home}/index.scss`
- 对应的html文件则在 `src/view/${对应页面文件名 => home}/index.html`
```

公共模块及util `src/js/module`

`components` => 内部项目公共组件

`download` => 下载组件

`echarts` => 图表组件

`filter` => 过滤器和vue管道

`i18n` => 国际化

`io` => io请求封装 基于axios

`mixin` => vue mixin 公共部分 用于disabled操作

`permissions` => 权限操作

`util` => 工具

### 系统功能模块

首页 => `http://localhost:8888/#/home`

项目管理 => `http://localhost:8888/#/projects/list`

```
| 项目首页
| 工作流
  - 工作流定义
  - 工作流实例
  - 任务实例
```

资源管理 => `http://localhost:8888/#/resource/file`

```
| 文件管理
```

数据源管理 => `http://localhost:8888/#/datasource/list`

安全中心 => `http://localhost:8888/#/security/tenant`

```
| 租户管理
| 用户管理
| 告警组管理
  - master
  - worker
```

用户中心 => `http://localhost:8888/#/user/account`

## 路由和状态管理

项目 `src/js/conf/home` 下分为

`pages` => 路由指向页面目录

```
路由地址对应的页面文件
```

`router` => 路由管理

```
vue的路由器，在每个页面的入口文件index.js 都会注册进来 具体操作：https://router.vuejs.org/zh/
```

`store` => 状态管理

```
每个路由对应的页面都有一个状态管理的文件 分为：

actions => mapActions => 详情：https://vuex.vuejs.org/zh/guide/actions.html

getters => mapGetters => 详情：https://vuex.vuejs.org/zh/guide/getters.html

index => 入口

mutations => mapMutations => 详情：https://vuex.vuejs.org/zh/guide/mutations.html

state => mapState => 详情：https://vuex.vuejs.org/zh/guide/state.html

具体操作：https://vuex.vuejs.org/zh/
```

## 规范

## Vue规范

##### 1.组件名

组件名为多个单词，并且用连接线（-）连接，避免与 HTML 标签冲突，并且结构更加清晰。

```
// 正例
export default {
    name: 'page-article-item'
}
```

##### 2.组件文件

`src/js/module/components`项目内部公共组件书写文件夹名与文件名同名,公共组件内部所拆分的子组件与util工具都放置组件内部 `_source`文件夹里。

```
└── components
    ├── header
        ├── header.vue
        └── _source
            └── nav.vue
            └── util.js
    ├── conditions
        ├── conditions.vue
        └── _source
            └── search.vue
            └── util.js
```

##### 3.Prop

定义 Prop 的时候应该始终以驼峰格式（camelCase）命名，在父组件赋值的时候使用连接线（-）。
这里遵循每个语言的特性，因为在 HTML 标记中对大小写是不敏感的，使用连接线更加友好；而在 JavaScript 中更自然的是驼峰命名。

```
// Vue
props: {
    articleStatus: Boolean
}
// HTML
<article-item :article-status="true"></article-item>
```

Prop 的定义应该尽量详细的指定其类型、默认值和验证。

示例：

```
props: {
    attrM: Number,
    attrA: {
        type: String,
        required: true
    },
    attrZ: {
        type: Object,
        // 数组/对象的默认值应该由一个工厂函数返回
        default: function () {
            return {
                msg: '成就你我'
            }
        }
    },
    attrE: {
        type: String,
        validator: function (v) {
            return !(['success', 'fail'].indexOf(v) === -1) 
        }
    }
}
```

##### 4.v-for

在执行 v-for 遍历的时候，总是应该带上 key 值使更新 DOM 时渲染效率更高。

```
<ul>
    <li v-for="item in list" :key="item.id">
        {{ item.title }}
    </li>
</ul>
```

v-for 应该避免与 v-if 在同一个元素（`例如：<li>`）上使用，因为 v-for 的优先级比 v-if 更高，为了避免无效计算和渲染，应该尽量将 v-if 放到容器的父元素之上。

```
<ul v-if="showList">
    <li v-for="item in list" :key="item.id">
        {{ item.title }}
    </li>
</ul>
```

##### 5.v-if / v-else-if / v-else

若同一组 v-if 逻辑控制中的元素逻辑相同，Vue 为了更高效的元素切换，会复用相同的部分，`例如：value`。为了避免复用带来的不合理效果，应该在同种元素上加上 key 做标识。

```
<div v-if="hasData" key="mazey-data">
    <span>{{ mazeyData }}</span>
</div>
<div v-else key="mazey-none">
    <span>无数据</span>
</div>
```

##### 6.指令缩写

为了统一规范始终使用指令缩写，使用`v-bind`，`v-on`并没有什么不好，这里仅为了统一规范。

```
<input :value="mazeyUser" @click="verifyUser">
```

##### 7.单文件组件的顶级元素顺序

样式后续都是打包在一个文件里，所有在单个vue文件中定义的样式，在别的文件里同类名的样式也是会生效的所有在创建一个组件前都会有个顶级类名
注意：项目内已经增加了sass插件，单个vue文件里可以直接书写sass语法
为了统一和便于阅读，应该按 `<template>`、`<script>`、`<style>`的顺序放置。

```
<template>
  <div class="test-model">
    test
  </div>
</template>
<script>
  export default {
    name: "test",
    data() {
      return {}
    },
    props: {},
    methods: {},
    watch: {},
    beforeCreate() {
    },
    created() {
    },
    beforeMount() {
    },
    mounted() {
    },
    beforeUpdate() {
    },
    updated() {
    },
    beforeDestroy() {
    },
    destroyed() {
    },
    computed: {},
    components: {},
  }
</script>

<style lang="scss" rel="stylesheet/scss">
  .test-model {

  }
</style>

```

## JavaScript规范

##### 1.var / let / const

建议不再使用 var，而使用 let / const，优先使用 const。任何一个变量的使用都要提前申明，除了 function 定义的函数可以随便放在任何位置。

##### 2.引号

```
const foo = '后除'
const bar = `${foo}，前端工程师`
```

##### 3.函数

匿名函数统一使用箭头函数，多个参数/返回值时优先使用对象的结构赋值。

```
function getPersonInfo ({name, sex}) {
    // ...
    return {name, gender}
}
```

函数名统一使用驼峰命名，以大写字母开头申明的都是构造函数，使用小写字母开头的都是普通函数，也不该使用 new 操作符去操作普通函数。

##### 4.对象

```
const foo = {a: 0, b: 1}
const bar = JSON.parse(JSON.stringify(foo))

const foo = {a: 0, b: 1}
const bar = {...foo, c: 2}

const foo = {a: 3}
Object.assign(foo, {b: 4})

const myMap = new Map([])
for (let [key, value] of myMap.entries()) {
    // ...
}
```

##### 5.模块

统一使用 import / export 的方式管理项目的模块。

```
// lib.js
export default {}

// app.js
import app from './lib'
```

import 统一放在文件顶部。

如果模块只有一个输出值，使用 `export default`，否则不用。

## HTML / CSS

###### 1.标签

在引用外部 CSS 或 JavaScript 时不写 type 属性。HTML5 默认 type 为 `text/css` 和 `text/javascript` 属性，所以没必要指定。

```
<link rel="stylesheet" href="//www.test.com/css/test.css">
<script src="//www.test.com/js/test.js"></script>
```

##### 2.命名

Class 和 ID 的命名应该语义化，通过看名字就知道是干嘛的；多个单词用连接线 - 连接。

```
// 正例
.test-header{
    font-size: 20px;
}
```

##### 3.属性缩写

CSS 属性尽量使用缩写，提高代码的效率和方便理解。

```
// 反例
border-width: 1px;
border-style: solid;
border-color: #ccc;

// 正例
border: 1px solid #ccc;
```

##### 4.文档类型

应该总是使用 HTML5 标准。

```
<!DOCTYPE html>
```

##### 5.注释

应该给一个模块文件写一个区块注释。

```
/**
* @module mazey/api
* @author Mazey <mazey@mazey.net>
* @description test.
* */
```

## 接口

##### 所有的接口都以 Promise 形式返回

注意非0都为错误走catch

```
const test = () => {
  return new Promise((resolve, reject) => {
    resolve({
      a:1
    })
  })
}

// 调用
test.then(res => {
  console.log(res)
  // {a:1}
})
```

正常返回

```
{
  code:0,
  data:{}
  msg:'成功'
}
```

错误返回

```
{
  code:10000, 
  data:{}
  msg:'失败'
}
```

接口如果是post请求，Content-Type默认为application/x-www-form-urlencoded；如果Content-Type改成application/json，
接口传参需要改成下面的方式

```
io.post('url', payload, null, null, { emulateJSON: false } res => {
  resolve(res)
}).catch(e => {
  reject(e)
})
```

##### 相关接口路径

dag 相关接口 `src/js/conf/home/store/dag/actions.js`

数据源中心 相关接口 `src/js/conf/home/store/datasource/actions.js`

项目管理 相关接口 `src/js/conf/home/store/projects/actions.js`

资源中心 相关接口 `src/js/conf/home/store/resource/actions.js`

安全中心 相关接口 `src/js/conf/home/store/security/actions.js`

用户中心 相关接口 `src/js/conf/home/store/user/actions.js`

## 扩展开发

##### 1.增加节点

(1) 先将节点的icon小图标放置`src/js/conf/home/pages/dag/img`文件夹内，注意 `toolbar_${后台定义的节点的英文名称 例如:SHELL}.png`

(2) 找到 `src/js/conf/home/pages/dag/_source/config.js` 里的 `tasksType` 对象，往里增加

```
'DEPENDENT': {  // 后台定义节点类型英文名称用作key值
  desc: 'DEPENDENT',  // tooltip desc
  color: '#2FBFD8'  // 代表的颜色主要用于 tree和gantt 两张图
}
```

(3) 在 `src/js/conf/home/pages/dag/_source/formModel/tasks` 增加一个 `${节点类型（小写）}`.vue 文件，跟当前节点相关的组件内容都在这里写。 属于节点组件内的必须拥有一个函数 `_verification()` 验证成功后将当前组件的相关数据往父组件抛。

```
/**
 * 验证
*/
  _verification () {
    // datasource 子组件验证
    if (!this.$refs.refDs._verifDatasource()) {
      return false
    }

    // 验证函数
    if (!this.method) {
      this.$message.warning(`${i18n.$t('请输入方法')}`)
      return false
    }

    // localParams 子组件验证
    if (!this.$refs.refLocalParams._verifProp()) {
      return false
    }
    // 存储
    this.$emit('on-params', {
      type: this.type,
      datasource: this.datasource,
      method: this.method,
      localParams: this.localParams
    })
    return true
  }
```

(4) 节点组件内部所用到公共的组件都在`_source`下，`commcon.js`用于配置公共数据

##### 2.增加状态类型

(1) 找到 `src/js/conf/home/pages/dag/_source/config.js` 里的 `tasksState` 对象，往里增加

```
'WAITTING_DEPEND': {  //后端定义状态类型 前端用作key值
  id: 11,  // 前端定义id 后续用作排序
  desc: `${i18n.$t('等待依赖')}`,  // tooltip desc
  color: '#5101be',  // 代表的颜色主要用于 tree和gantt 两张图
  icoUnicode: '&#xe68c;',  // 字体图标 
  isSpin: false  // 是否旋转（需代码判断）
}
```

##### 3.增加操作栏工具

(1) 找到 `src/js/conf/home/pages/dag/_source/config.js` 里的 `toolOper` 对象，往里增加

```
{
  code: 'pointer',  // 工具标识
  icon: '&#xe781;',  // 工具图标 
  disable: disable,  // 是否禁用
  desc: `${i18n.$t('拖动节点和选中项')}`  // tooltip desc
}
```

(2) 工具类都以一个构造函数返回 `src/js/conf/home/pages/dag/_source/plugIn`

`downChart.js`  =>  dag 图片下载处理

`dragZoom.js`  =>  鼠标缩放效果处理

`jsPlumbHandle.js`  =>  拖拽线条处理

`util.js`  =>   属于 `plugIn` 工具类

操作则在 `src/js/conf/home/pages/dag/_source/dag.js` => `toolbarEvent` 事件中处理。

##### 3.增加一个路由页面

(1) 首先在路由管理增加一个路由地址`src/js/conf/home/router/index.js`

```
{
  path: '/test',  // 路由地址 
  name: 'test',  // 别名
  component: resolve => require(['../pages/test/index'], resolve),  // 路由对应组件入口文件
  meta: {
    title: `${i18n.$t('test')} - DolphinScheduler`  // title 显示
  }
},
```

(2) 在`src/js/conf/home/pages` 建一个 `test` 文件夹，在文件夹里建一个`index.vue`入口文件。

        这样就可以直接访问 `http://localhost:8888/#/test`

##### 4.增加预置邮箱

找到`src/lib/localData/email.js`启动和定时邮箱地址输入可以自动下拉匹配。

```
export default ["test@analysys.com.cn","test1@analysys.com.cn","test3@analysys.com.cn"]
```

##### 5.权限管理及disabled状态处理

权限根据后端接口`getUserInfo`接口给出`userType: "ADMIN_USER/GENERAL_USER"`权限控制页面操作按钮是否`disabled`

具体操作：`src/js/module/permissions/index.js`

disabled处理：`src/js/module/mixin/disabledState.js`


---

## contribute/have-questions.md

# 当你遇到问题时

## Slack

聊天室是快速提问或讨论具体话题的好地方。

以下聊天室是Apache DolphinScheduler的正式组成部分：

​	Slack工作区的网址：http://asf-dolphinscheduler.slack.com/

​	你可以通过该邀请链接加入：https://join.slack.com/t/asf-dolphinscheduler/shared_invite/zt-1e0s4agia-Ofkxa93zStmqTm9UsQBE8g

此聊天室用于与DolphinScheduler使用相关的问题讨论。

## 邮件列表

- [dev@dolphinscheduler.apache.org](https://lists.apache.org/list.html?dev@dolphinscheduler.apache.org) 是为那些想为DolphinScheduler贡献代码的人准备的。 [(订阅)](mailto:dev-subscribe@dolphinscheduler.apache.org?subject=(send%20this%20email%20to%20subscribe)) [(退订)](mailto:dev-unsubscribe@dolphinscheduler.apache.org?subject=(send%20this%20email%20to%20unsubscribe)) [(存档)](http://lists.apache.org/list.html?dev@dolphinscheduler.apache.org)

使用电子邮件时的一些快速提示：

- 在你的邮件的主题栏里加上标签会帮助你得到更快的回应，例如：[ApiServer]：如何获得开放的api接口？
- 可以通过以下标签定义你的主题。
  - 组件相关：MasterServer、ApiServer、WorkerServer、AlertServer等等。
  - 级别：Beginner、Intermediate、Advanced
  - 场景相关：Debug,、How-to
- 如果内容包括错误日志或长代码，请使用 [GitHub gist](https://gist.github.com/)，并在邮件中只附加相关代码/日志的几行。


---

## contribute/join/DS-License.md

# License 须知

如您所知，DolphinScheduler现属于ASF(Apache基金会)下的开源项目，这意味着当您想要成为DolphinScheduler的贡献者的时候，就必须按照Apache的规则来，而Apache对于License有着极其严苛的规则，为了避免贡献者在License上浪费过多的时间，
本文将为您讲解ASF—License以及参与DolphinScheduler如何过早的规避掉License风险。

注：本文仅适用于Apache项目。

### Apache项目可接受的License

当您想要为DolphinScheduler（亦或其他Apache项目）增添一个新的功能，这个功能涉及到其他开源软件的引用，那么您必须注意，目前Apache项目支持遵从以下协议的开源软件（如果有遗漏，欢迎补充）：

[ASF第三方许可证策](https://apache.org/legal/resolved.html)

如果您所使用的第三方软件并不在以上协议之中，那么很抱歉，您的代码将无法通过审核，建议您找寻其他替代方案。

另外，当您需要使用新的软件的时候，请将您这样做的原因、最终产出结果发邮件至[dev@dolphinscheduler.apache.org]讨论，当得到至少3票PPMC认同的时候，您方可以引入。

### 如何在DolphinScheduler合法的使用第三方开源软件

当我们想要引入一个新的第三方软件(包含但不限于第三方的jar、文本、css、js、图片、图标、音视频等及在第三方基础上做的修改)至我们的项目中的时候，除了他们所遵从的协议是Apache允许的，另外一点很重要，就是合法的使用。您可以参考以下文章

* [COMMUNITY-LED DEVELOPMENT "THE APACHE WAY"](https://apache.org/dev/licensing-howto.html)

以Apache为例，当我们使用了ZooKeeper，那么ZooKeeper的NOTICE文件（每个开源项目都会有NOTICE文件，一般位于根目录）则必须在我们的项目中体现，用Apache的话来讲，就是"Work" shall mean the work of authorship, whether in Source or Object form, made available under the License, as indicated by a
copyright notice that is included in or attached to the work.

关于具体的各个开源协议使用协议，在此不做过多篇幅一一介绍，有兴趣可以自行查询了解。

### DolphinScheduler-License 检测规则

一般来讲，我们都会为自己的项目建立License-check脚本，DolphinScheduler-License是由[kezhenxu94](https://github.com/kezhenxu94)提供，其他开源软件略有不同，但最终结果都是为了确保我们在使用过程中能够第一时间避免License的问题。

当我们需要添加新的Jar或其他外部资源的时候，我们需要按照以下步骤：

* 在known-dependencies.txt中添加你所需要的jar名称+版本。
* 在dolphinscheduler-dist/release-docs/LICENSE中添加相关的maven仓库地址。
* 在dolphinscheduler-dist/release-docs/NOTICE中追加相关的NOTICE文件，此文件请务必和原代码仓库地址中的NOTICE文件一致。
* 在dolphinscheduler-dist/release-docs/license/下添加相关源代码的协议，文件命名为license+文件名.txt。

#### check dependency license fail

```
--- /dev/fd/63	2020-12-03 03:08:57.191579482 +0000
+++ /dev/fd/62	2020-12-03 03:08:57.191579482 +0000
@@ -1,0 +2 @@
+HikariCP-java6-2.3.13.jar
@@ -16,0 +18 @@
+c3p0-0.9.5.2.jar
@@ -149,0 +152 @@
+mchange-commons-java-0.2.11.jar
Error: Process completed with exit code 1.
```

一般来讲，添加一个jar的工作往往不会如此轻易的结束，因为它往往依赖了其它各种各样的jar，这些jar我们同样需要添加相应的license。
这种情况下，我们会在check里面得到 check dependency license fail的错误信息，如上，我们缺少了HikariCP-java6-2.3.13、c3p0等的license声明，
按照添加jar的步骤补充即可，提示还是蛮友好的（哈哈）。

### 附件

<!-- markdown-link-check-disable -->
附件：新jar的邮-->

```
[VOTE][New Jar] jetcd-core(registry plugin support etcd3 ) 


（说明目的，以及需要添加的 jar 是什么）Hi, the registry SPI will provide the implementation of etcd3. Therefore, we need to introduce a new jar (jetcd-core, jetcd-launcher (test)), which complies with the Apache-2.0 License. I checked his related dependencies to make sure it complies with the license of the Apache project.

new jar : 

jetcd-core             version -x.x.x   license apache2.0

jetcd-launcher (test)  version -x.x.x   license apache2.0

dependent jar（它依赖了哪些jar，最好附带版本,以及相关采用的license协议）:
grpc-core     version -x.x.x  license XXX
grpc-netty    version -x.x.x  license XXX
grpc-protobuf version -x.x.x  license XXX
grpc-stub     version -x.x.x  license XXX
grpc-grpclb   version -x.x.x  license XXX
netty-all     version -x.x.x  license XXX
failsafe      version -x.x.x  license XXX

相关地址：主要有github地址、license文件地址、notice 文件地址、maven中央仓库地址

github address:https://github.com/etcd-io/jetcd


license:https://github.com/etcd-io/jetcd/blob/master/LICENSE


notice:https://github.com/etcd-io/jetcd/blob/master/NOTICE


Maven repository:


https://mvnrepository.com/artifact/io.etcd/jetcd-core


https://mvnrepository.com/artifact/io.etcd/jetcd-launcher
```

<!-- markdown-link-check-enable -->

### 参考文章：

* [COMMUNITY-LED DEVELOPMENT "THE APACHE WAY"](https://apache.org/dev/licensing-howto.html)
* [ASF 3RD PARTY LICENSE POLICY](https://apache.org/legal/resolved.html)


---

## contribute/join/become-a-committer.md

# 如何成为Apache Dolphinscheduler项目的committer

Dolphinscheduler 项目管理委员会（PMC）会评估候选人的贡献，并在合适的时间提名候选者。

像许多Apache项目一样，Dolphinscheduler欢迎所有形式的贡献，包括代码贡献、博客布道、新用户指南、公开演讲，以及以各种方式宣传项目和优化项目。

成为committer的第一步是要学习如何为Dolphinscheduler贡献并开始为Dolphinscheduler贡献，任何人可以向项目提交补丁、使用文档、测试用例等。

PMC会定期基于活跃贡献者们对Dolphinscheduler的贡献从他们中提名增加新的committer，要被提名为committer的条件如下：

1. 对Dolphinscheduler有持续的贡献：候选人应该对Dolphinscheduler有重大贡献，并且至少贡献了一个主要的组件，并在其中扮演了"owner"的角色。
2. 贡献的质量：候选人提交代码的质量应该比其他贡献者更高，此外他们应该表现出足够的专业知识来审查每个pr，包括确保它们符合Dolphinscheduler的工程实践（可测试性，文档，API稳定性，代码风格，等等）。委员会与committer对Dolphinscheduler的软件质量和可维护性共同负责。请注意，对Dolphinscheduler关键部分的贡献，比如它的核心模块，在评估质量时将会有更高的标准，这些领域的贡献者将面临更多的修改审查。
3. 社区参与：候选人在所有的社区互动中应该有一个建设性的和友好的态度，他们还应该在开发和用户列表中活跃，帮助指导新的贡献者和用户。在设计讨论中，候选人应该保持专业和开发的态度，即使面对分歧时也要有合理的沟通。

## 提名新的committer

在Dolphinscheduler中，committer提名只能由现有的PMC成员开始。如果一个新的提交者觉得他/她有资格，他/她应该联系任何现有的PMC成员并进行讨论。如果这一点在PMC的一些成员中得到了认同，那么这个过程就会启动。

建议采取以下步骤（仅需要现有2个PMC成员就可以发起）：
1. 发送一封标题为"[讨论]晋升xxx为新的committer"的电子邮件到`private@dolphinscheduler.apache.org`，并在邮件中列出该候选人的重要贡献，这样就可以提名流程。
2. 保持讨论要超过3天，但不超过1周，除非有任何明确的反对。
3. 如果PMC普遍同意该提议，请发送一封题为"[投票]提名xxx成为新的committer"的电子邮件到`private@dolphinscheduler.apache.org`
4. 保持投票过程超过3天，但不超过1周。至少3 + 1票，且无反对票，则视为"共识批准"。注：+1票 > -1票。
5. 发送一封题为"[结果] [投票]晋升xxx为新的committer"的电子邮件到`private@dolphinscheduler.apache.org`，并列出投票细节，包括谁是投票者。

## 邀请新的committer

发起提名的PMC成员负责向新的committer发出邀请，并指导他/她建立ASF精神思想。

PMC成员应使用以下模板向新的committer发送一封电子邮件:

```
To: <invitee name>@gmail.com
Cc: private@dolphinscheduler.apache.org
Subject: Invitation to become dolphinscheduler committer: <invitee name>

Hello <invitee name>,

The Dolphinscheduler Project Management Committee] (PMC) 
hereby offers you committer privileges to the project. These privileges are
offered on the understanding that you'll use them
reasonably and with common sense. We like to work on trust
rather than unnecessary constraints.

Being a committer enables you to more easily make 
changes without needing to go through the patch 
submission process. 

Being a committer does not require you to 
participate any more than you already do. It does 
tend to make one even more committed.  You will 
probably find that you spend more time here.

Of course, you can decline and instead remain as a 
contributor, participating as you do now.

A. This personal invitation is a chance for you to 
accept or decline in private.  Either way, please 
let us know in reply to the [private@dolphinscheduler.apache.org] 
address only.

B. If you accept, the next step is to register an iCLA:
    1. Details of the iCLA and the forms are found 
    through this link: http://www.apache.org/licenses/#clas

    2. Instructions for its completion and return to 
    the Secretary of the ASF are found at
    http://www.apache.org/licenses/#submitting

    3. When you transmit the completed iCLA, request 
    to notify the Apache Dolphinscheduler and choose a 
    unique Apache id. Look to see if your preferred 
    id is already taken at 
    http://people.apache.org/committer-index.html     
    This will allow the Secretary to notify the PMC 
    when your iCLA has been recorded.

When recording of your iCLA is noticed, you will 
receive a follow-up message with the next steps for 
establishing you as a committer.
```

## 接受邀请

新的提交者应该回复`private@dolphinscheduler.apache.org`（选择`回复所有`），并表达他/她接受邀请的意愿。

一旦接受了邀请，新的committer必须采取以下步骤：
1. 订阅`dev@dolphinscheduler.apache.org`，通常情况下，这已经完成
2. 选择一个不在[apache committers list page](http://people.apache.org/committer-index.html)上的Apache ID
3. 下载[ICLA](https://www.apache.org/licenses/icla.pdf)（如果新的提交者将项目作为日常工作来贡献，则应下载[CCLA](http://www.apache.org/licenses/cla-corporate.pdf)）
4. 在`icla.pdf`(或`ccla.pdf`)中填写正确的信息后，打印出来，手写签名，扫描成PDF格式，并作为附件发送至[secretary@apache.org](mailto:secretary@apache.org)。(如果希望使用电子签名，请按照[本页](http://www.apache.org/licenses/contributor-agreements.html#submitting)上的步骤进行)
5. PMC将等待Apache秘书确认所提交的ICLA（或CCLA），新的committer和PMC将收到以下电子邮件：

```
Dear XXX,

This message acknowledges receipt of your ICLA, which has been filed in the Apache Software Foundation records.

Your account has been requested for you and you should receive email with next steps
within the next few days (can take up to a week).

Please refer to https://www.apache.org/foundation/how-it-works.html#developers
for more information about roles at Apache.
```

在极端情况下，如果账户申请过程中出现问题，PMC成员应该联系项目的V.P.，V.P.可以通过[Apache Account Submission Helper Form](https://whimsy.apache.org/officers/acreq)进行申请。

几天后，新的committer将收到一封确认创建账户的电子邮件，标题为 `欢迎来到Apache软件基金会(ASF)!`。祝贺你! 现在有了一个正式的Apache ID。

PMC成员应通过[花名册](https://whimsy.apache.org/roster/pmc/dolphinscheduler)将新的提交者加入官方committer名单。

## 初始化Apache ID和设置开发环境

1. 进入[Apache Account Utility Platform](https://id.apache.org/)，创建你的密码，设置你的个人邮箱(`Forwarding email address`)和GitHub账户(`Your GitHub Username`)。此后不久（2小时内），我们将通过电子邮件向你发出组织邀请。
2. 如果你想使用`xxx@apache.org`电子邮件服务，请参考[这里](https://infra.apache.org/committer-email.html)。推荐使用`Gmail`，因为这种转发模式在大多数邮箱服务设置中都不容易被设置。
3. 根据`GitHub 2FA wiki`，在[Github](http://github.com/)上启用双因素授权（2FA）。当你将2FA设置为关闭时，它将被相应的Apache committer写权限组除名，直到你再次开启。(**注意：对待你的恢复码要像对待你的密码一样严谨！**)
4. 使用[GitBox Account Linking Utility](https://gitbox.apache.org/setup/)获得Dolphinscheduler项目的写入许可。

如果你想在Apache GitHub组织中公开显示，你需要到[Apache GitHub组织人员页面](https://github.com/orgs/apache/people)搜索你自己，并选择 "组织可见性 "为 "公开"。

## Committer的权利、义务和责任

Dolphinscheduler项目并不要求你在成为committer后继续做出贡献，但我们真心希望你能继续在社区中发挥榜样作用!

作为committer，你应该：
1. review贡献者的pr，并将合格的pr合并到项目主分支，一个pr通常包含多个提交，这些提交**必须被压缩并合并为一个提交**，**并附上解释说明**，我们建议新的committer在review完pr后再请求资深committer重新review pr。
2. 创建并推送代码至项目中的新分支。
3. 按照发布流程来准备一个新的版本，记住要与committer团队确认，发布版本之前与团队确认是必须要做的事情。

PMC希望新的committer能够参与发布过程以及发布投票，尽管他们的投票将被视为"+1无约束力"，熟悉发布过程是晋升为PMC成员的关键。

## 项目管理委员会

项目管理委员会（PMC）成员在代码贡献方面没有任何特殊权利，
他们只是监督项目，并确保其遵循Apache的要求，其职能包括：

1. 对版本发布和许可检查进行有约束力的投票
2. 认可新的committer和PMC成员
3. 确定品牌问题和品牌保护
4. 回应ASF董事会提出的问题，并采取必要的行动

副主席和PMC的主席是秘书，负责初始化董事会报告。

在大多数情况下，一个新的PMC成员是由committer团队提名的，但也有可能直接成为PMC成员，只要PMC同意提名并确信候选人有资格。例如，可以通过他/她曾经是Apache成员、Apache官员或其他项目的PMC成员来证明这一点。

新的PMC投票过程也应遵循 新的PMC投票过程也应遵循`[讨论]`、`[投票]`和`[结果][投票]`程序，使用一个私人邮件列表，就像新提交者的投票过程，在发送邀请之前，PMC还必须向Apache董事会发送NOTICE邮件；`[讨论]`、`[投票]`和`[结果][投票]`程序使用私人邮件列表，就像新committer的投票过程，在发送邀请之前，PMC还必须向Apache董事会发送一封NOTICE邮件：

```
To: board@apache.org
Cc: private@dolphinscheduler.apache.org
Subject: [NOTICE] Jane Doe for Dolphinscheduler PMC

Dolphinscheduler proposes to invite Jane Doe (janedoe) to join the PMC.

(include if a vote was held) The vote result is available here: https://lists.apache.org/...
```

72小时后，如果董事会不反对提名（大多数情况下不会反对），那么就可以向候选人发出邀请。

一旦候选人接受邀请，PMC成员应通过[花名册](https://whimsy.apache.org/roster/pmc/dolphinscheduler)将新成员加入PMC正式名单。


---

## contribute/join/code-conduct.md

# 行为准则

以下行为准则以完全遵循[Apache软件基金会行为准则](https://www.apache.org/foundation/policies/conduct.html)为前提。

## 开发理念

- **一致** 代码风格、命名以及使用方式保持一致。
- **易读** 代码无歧义，易于阅读和理解而非调试手段才知晓代码意图。
- **整洁** 认同《重构》和《代码整洁之道》的理念，追求整洁优雅代码。
- **抽象** 层次划分清晰，概念提炼合理。保持方法、类、包以及模块处于同一抽象层级。
- **用心** 保持责任心，持续以工匠精神雕琢。

## 开发规范

- 执行`mvn -U clean package -Prelease`可以编译和测试通过全部测试用例。
- 测试覆盖率工具检查不低于dev分支覆盖率。
- 请使用Checkstyle检查代码，违反验证规则的需要有特殊理由。模板位置在根目录下ds_check_style.xml。
- 遵守编码规范。

## 编码规范

- 使用linux换行符。
- 缩进（包含空行）和上一行保持一致。
- 类声明后与下面的变量或方法之间需要空一行。
- 不应有无意义的空行。
- 类、方法和变量的命名要做到顾名思义，避免使用缩写。
- 返回值变量使用`result`命名；循环中使用`each`命名循环变量；map中使用`entry`代替`each`。
- 捕获的异常名称命名为`e`；捕获异常且不做任何事情，异常名称命名为`ignored`。
- 配置文件使用驼峰命名，文件名首字母小写。
- 需要注释解释的代码尽量提成小方法，用方法名称解释。
- `equals`和`==`条件表达式中，常量在左，变量在右；大于小于等条件表达式中，变量在左，常量在右。
- 除了用于继承的抽象类之外，尽量将类设计为`final`。
- 嵌套循环尽量提成方法。
- 成员变量定义顺序以及参数传递顺序在各个类和方法中保持一致。
- 优先使用卫语句。
- 类和方法的访问权限控制为最小。
- 方法所用到的私有方法应紧跟该方法，如果有多个私有方法，书写私有方法应与私有方法在原方法的出现顺序相同。
- 方法入参和返回值不允许为`null`。
- 优先使用三目运算符代替if else的返回和赋值语句。
- 优先考虑使用`LinkedList`，只有在需要通过下标获取集合中元素值时再使用`ArrayList`。
- `ArrayList`，`HashMap`等可能产生扩容的集合类型必须指定集合初始大小，避免扩容。
- 日志与注释一律使用英文。
- 注释只能包含javadoc，todo和fixme。
- 公开的类和方法必须有javadoc，其他类和方法以及覆盖自父类的方法无需javadoc。

## 单元测试规范

- 测试代码和生产代码需遵守相同代码规范。
- 单元测试需遵循AIR（Automatic, Independent, Repeatable）设计理念。
  - 自动化（Automatic）：单元测试应全自动执行，而非交互式。禁止人工检查输出结果，不允许使用`System.out`，`log`等，必须使用断言进行验证。
  - 独立性（Independent）：禁止单元测试用例间的互相调用，禁止依赖执行的先后次序。每个单元测试均可独立运行。
  - 可重复执行（Repeatable）：单元测试不能受到外界环境的影响，可以重复执行。
- 单元测试需遵循BCDE（Border, Correct, Design, Error）设计原则。
  - 边界值测试（Border）：通过循环边界、特殊数值、数据顺序等边界的输入，得到预期结果。
  - 正确性测试（Correct）：通过正确的输入，得到预期结果。
  - 合理性设计（Design）：与生产代码设计相结合，设计高质量的单元测试。
  - 容错性测试（Error）：通过非法数据、异常流程等错误的输入，得到预期结果。
- 如无特殊理由，测试需全覆盖。
- 每个测试用例需精确断言。
- 准备环境的代码和测试代码分离。
- 只有junit `Assert`，hamcrest `CoreMatchers`，Mockito相关可以使用static import。
- 单数据断言，应使用`assertTrue`，`assertFalse`，`assertNull`和`assertNotNull`。
- 多数据断言，应使用`assertThat`。
- 精确断言，尽量不使用`not`，`containsString`断言。
- 测试用例的真实值应名为为actualXXX，期望值应命名为expectedXXX。
- 测试类和`@Test`标注的方法无需javadoc。
- 公共规范
  - 每行长度不超过`200`个字符，保证每一行语义完整以便于理解。


---

## contribute/join/commit-message.md

# Commit Message 须知

### 前言

一个好的 commit message 是能够帮助其他的开发者（或者未来的开发者）快速理解相关变更的上下文，同时也可以帮助项目管理人员确定该提交是否适合包含在发行版中。但当我们在查看了很多开源项目的 commit log 后，发现一个有趣的问题，一部分开发者，代码质量很不错，但是 commit message 记录却比较混乱，当其他贡献者或者学习者在查看代码的时候，并不能通过 commit log 很直观的了解
该提交前后变更的目的，正如 Peter Hutterer 所言：Re-establishing the context of a piece of code is wasteful. We can’t avoid it completely, so our efforts should go to reducing it as much as possible. Commit messages can do exactly that and as a result, a commit message shows whether a developer is a good collaborator. 因此，DolphinScheduler 结合其他社区以及 Apache 官方文档制定了该规约。

### Commit Message RIP

#### 1：明确修改内容

commit message 应该明确说明该提交解决了哪些问题（bug 修复、功能增强等），以便于用户开发者更好的跟踪问题，明确版本迭代过程中的优化情况。

#### 2：关联相应的Pull Request 或者Issue

当我们的改动较大的时候，commit message 最好能够关联 GitHub 上的相关 Issue 或者 Pull Request，这样，我们的开发者在查阅代码的时候能够通过关联信息较为迅速的了解改代码提交的上下文情景，如果当前 commit 针对某个 issue，那么可以在 Footer 部分关闭这个 issue。

#### 3：统一的格式

格式化后的 CommitMessage 能够帮助我们提供更多的历史信息，方便快速浏览，同时也可以直接从 commit 生成 Change Log。

Commit message 应该包括三个部分：Header，Body 和 Footer。其中，Header 是必需的，Body 和 Footer 可以省略。

##### header

Header 部分只有一行，包括三个字段：type（必需）、scope（可选）和 subject（必需）。

[DS-ISSUE编号][type] subject

(1) type 用于说明 commit 的类别，只允许使用下面7个标识。

* feat：新功能（feature）
* fix：修补bug
* docs：文档（documentation）
* style： 格式（不影响代码运行的变动）
* refactor：重构（即不是新增功能，也不是修改bug的代码变动）
* test：增加测试
* chore：构建过程或辅助工具的变动

如果 type 为 feat 和 fix，则该 commit 将肯定出现在 Change log 之中。其他情况（docs、chore、style、refactor、test）建议不放入。

(2）scope

scope 用于说明 commit 影响的范围，比如 server、remote 等，如果没有更合适的范围，你可以用 *。

(3) subject

subject 是 commit 目的的简短描述，不超过50个字符。

##### Body

Body 部分是对本次 commit 的详细描述，可以分成多行，换行符将以72个字符换行，避免自动换行影响美观。

Body 部分需要注意以下几点：

* 使用动宾结构，注意使用现在时，比如使用 change 而非 changed 或 changes

* 首字母不要大写

* 语句最后不需要 ‘.’ (句号) 结尾

##### Footer

Footer只适用于两种情况

(1) 不兼容变动

如果当前代码与上一个版本不兼容，则 Footer 部分以 BREAKING CHANGE 开头，后面是对变动的描述、以及变动理由和迁移方法。

(2) 关闭 Issue

如果当前 commit 针对某个issue，那么可以在 Footer 部分关闭这个 issue,也可以一次关闭多个 issue 。

##### 举个例子

[DS-001][docs-zh] add commit message

* commit message RIP
* build some conventions
* help the commit messages become clean and tidy
* help developers and release managers better track issues
  and clarify the optimization in the version iteration

This closes #001

### 参考文档

[提交消息格式](https://cwiki.apache.org/confluence/display/GEODE/Commit+Message+Format)

[On commit messages-Peter Hutterer](http://who-t.blogspot.com/2009/12/on-commit-messages.html)

[RocketMQ Community Operation Conventions](https://mp.weixin.qq.com/s/LKM4IXAY-7dKhTzGu5-oug)


---

## contribute/join/contribute.md

# 参与贡献

首先非常感谢大家选择和使用 DolphinScheduler，非常欢迎大家加入 DolphinScheduler 大家庭，融入开源世界！

我们鼓励任何形式的参与社区，最终成为 Committer 或 PPMC，如：
* 将遇到的问题通过 github 上 [issue](https://github.com/apache/dolphinscheduler/issues) 的形式反馈出来
* 回答别人遇到的 issue 问题
* 帮助完善文档
* 帮助项目增加测试用例
* 为代码添加注释
* 提交修复 Bug 或者 Feature 的 PR
* 发表应用案例实践、调度流程分析或者与调度相关的技术文章
* 帮助推广 DolphinScheduler，参与技术大会或者 meetup 的分享等

欢迎加入贡献的队伍，加入开源从提交第一个 PR 开始
- 比如添加代码注释或找到带有 ”easy to fix” 标记或一些非常简单的 issue(拼写错误等) 等等，先通过第一个简单的 PR 熟悉提交流程

注：贡献不仅仅限于 PR 哈，对促进项目发展的都是贡献

相信参与 DolphinScheduler，一定会让您从开源中受益！

### 1. 参与文档贡献

参考[参与贡献-文档需知](./document.md)

### 2. 参与代码贡献

参考[参与贡献 Issue 需知](./issue.md)，[参与贡献 Pull Request 需知](./pull-request.md)，[参与贡献 CommitMessage 需知](./commit-message.md)

### 3. 如何领取 Issue，提交 Pull Request

如果你想实现某个 Feature 或者修复某个 Bug。请参考以下内容：

* 所有的 Bug 与新 Feature 建议使用 Issues Page 进行管理。
* 如果想要开发实现某个 Feature 功能，请先回复该功能所关联的 Issue，表明你当前正在这个 Issue 上工作。 并在回复的时候为自己设置一个 **deadline**，并添加到回复内容中。
* 最好在核心贡献者找到一个导师（指导者），导师会在设计与功能实现上给予即时的反馈。
* 你应该新建一个分支来开始你的工作，分支的名字参考[参与贡献 Pull Request 需知](./pull-request.md)。比如，你想完成 feature 功能并提交了 Issue 111，那么你的 branch 名字应为 feature-111。 功能名称可与导师讨论后确定。
* 完成后，发送一个 Pull Request 到 dolphinscheduler，提交过程具体请参考下面《[提交代码流程](./submit-code.md)》。

如果是想提交 Pull Request 完成某一个 Feature 或者修复某个 Bug，这里都建议大家从小处做起，完成一个小功能就提交一次，每次别改动太多文件，改动文件太多也会给 Reviewer 造成很大的心理压力，建议通过多次 Pull Request 的方式完成。


---

## contribute/join/document.md

# 文档须知

良好的使用文档对任何类型的软件都是至关重要的。欢迎任何可以改进 DolphinScheduler 文档的贡献。

### 获取文档项目

DolphinScheduler 项目的文档维护在独立的 [git 仓库](https://github.com/apache/dolphinscheduler-website)中。

首先你需要先将文档项目 fork 到自己的 github 仓库中，然后将 fork 的文档克隆到本地计算机中。

```
git clone https://github.com/<your-github-user-name>/dolphinscheduler-website
```

### 文档构建指南

1. 在根目录中运行 `yarn` 以安装依赖项。

2. 运行命令收集资源：2.1.运行 `export PROTOCOL_MODE=ssh` 告诉Git克隆资源，通过SSH协议而不是HTTPS协议。 2.2.运行 `./scripts/prepare_docs.sh` 准备所有相关资源，关更多信息，您可以查看[how prepare script work](https://github.com/apache/dolphinscheduler-website/blob/master/HOW_PREPARE_WORK.md)。

3. 在根目录下运行 `yarn generate` 来格式化和准备数据。

4. 在根目录下运行 `yarn dev` 启动本地服务器，其将允许在 http://localhost:3000 。

```
注意：如果您在 Windows 而非 Mac 或 Linux 中克隆代码。请阅读下面的详细信息。
如果执行上述两个步骤中的命令，将出现异常 “UnhandledPromiseRejectionWarning.Error:”： Error： EPERM: operation not permitted, symlink ‘2.0.3’ -> ‘latest’".
如果出现异常 “Can't resolve ‘antd’ in xxx”，你可以运行 `yarn add antd` 和 `yarn install`。
因为这两个步骤运行的命令`./scripts/prepare_docs.sh`应该是 Linux 环境，所以如果你是 Windows 系统，可以使用 WSL 来完成。
遇到这个问题时。你可以以管理员身份运行 cmd.exe 中的两个步骤。
```

5. 运行 `yarn build` 来构建源代码，此时会自动生成一个名为 `build` 目录，等待执行完成之后进入 `build` 目录。

6. 在本地验证你的更改：`python -m SimpleHTTPServer 8000`，当 python 版本为 3 时，请使用：`python3 -m http.server 8000`。

如果本地安装了更高版本的 node，可以考虑使用 `nvm` 来允许不同版本的 `node` 在你的计算机上运行。

1. 参考[说明](http://nvm.sh)安装 nvm

2. 运行 `nvm install v18.12.1` 安装 node v18

3. 运行 `nvm use v18.12.1` 将当前工作环境切换到 node v18

然后你就可以在本地环境运行和建立网站了。

### 文档规范

1. 汉字与英文、数字之间**需空格**，中文标点符号与英文、数字之间**不需空格**，以增强中英文混排的美观性和可读性。

2. 建议在一般情况下使用 “你” 即可。当然必要的时候可以使用 “您” 来称呼，比如有 warning 提示的时候。

### 怎样提交文档 Pull Request

1. 不要使用 “git add.” 提交所有更改。

2. 只需推送更改的文件，例如：

* `*.md`
* `blog.js or docs.js or site.js`

3. 向 **master** 分支提交 Pull Request。

### 参考文档

[Apache Flink 中文文档规范](https://cwiki.apache.org/confluence/display/FLINK/Flink+Translation+Specifications)


---

## contribute/join/e2e-guide.md

# DolphinScheduler E2E 测试参与指南

E2E 测试的主要目的是通过模拟真实的用户场景，验证被测系统及其组件的集成性和数据完整性，从而可以扩展测试范围，确保系统的健康稳定，在一定程度上减少测试工作量和成本。简单来说，E2E 测试就是把程序当做黑盒子，以用户的视角对真实系统的访问行为进行仿真，对测试的输入（用户行为/模拟数据），看能否得到预期得到的结果。因此，社区决定为 DolphinScheduler 增加 E2E 自动化测试。

当前社区的 E2E 测试尚未达到完全覆盖，因此编写此文档，目的在于引导更多的同学参与进来。

### 如何寻找对应的 issue ？

当前社区把 E2E 需要测试的页面已经列出相关的 issue，主要分为 Project Management、Resource Center、DataSource、Security Center 四个页面。

贡献者可以通过 GitHub 然后搜索 [apace/dolphinscheduler](https://github.com/apache/dolphinscheduler)，然后在 [issue](https://github.com/apache/dolphinscheduler/issues?q=is%3Aissue+is%3Aopen+e2e+test+cases) 列表中搜索 `e2e test cases` 即可找到对应的任务。如下图：

![e2e-issue](../../img/contribute/join/e2e/e2e-issue.png)

在每个对应的 issue 中，我们都列出需要测试的内容和期望的结果，可以在 Description 中看见。进入当前页面之后，可以根据自身所感兴趣的选择对应的 issue，例如参与 Security Center 的测试，在对应的 issue 下留言自己所想测试的案例即可。

- Task status：若该测试已经完成，则视为 finish，作为贡献者需要寻找尚未完成的测试。
- number：测试案例的序号。
- function module：需要测试的功能模块，一个功能模块包含多个测试案例。
- test point：具体的需要测试的案例。例如页面中的按钮点击操作，页面跳转的功能。
- priority：测试案例的优先级，**推荐寻找优先级高的案例**。
- service：测试过程中所需要启动的服务。
- test steps：每个测试案例需要操作的测试步骤。
- expected results：所期望的测试结果。
- actual results：实际测试的结果。
- remarks：测试过程中需要的注意点。

![e2e-security](../../img/contribute/join/e2e/e2e-security.png)

### 如何编写测试代码？

在认领对应的任务之后，下一步就进入到编写代码的关键。很多同学可能对于 E2E 测试代码并不是很熟悉，因此可以参考该页面：[e2e-test](../e2e-test.md)。

### 如何提交 Pull Request ？

参与开源社区的形式多种多样，其中不限于 issue、pull request 和翻译等等。在参与 E2E 测试的过程，首先要求贡献者了解简单的提交 pull request 的流程，可参考：[Pull Request](./pull-request.md)。


---

## contribute/join/issue.md

# Issue 须知

## 前言

Issues 功能被用来追踪各种特性，Bug，功能等。项目维护者可以通过 Issues 来组织需要完成的任务。

Issue 是引出一个 Feature 或 Bug 等的重要步骤，在单个
Issue 中可以讨论的内容包括但不限于 Feature 的包含的功能，存在的 Bug 产生原因，前期方案的调研，以及其对应的实现设计和代码思路。

并且只有当 Issue 被 approve 之后才需要有对应的 Pull Request 去实现。

如果是一个 Issue 对应的是一个大 Feature，建议先将其按照功能模块等维度分成多个小的 Issue。

## 规范

### Issue 标题

标题格式：[`Issue 类型`][`模块名`] `Issue 描述`

其中`Issue 类型`如下：

<table>
    <thead>
        <tr>
            <th style="width: 10%; text-align: center;">Issue 类型</th>
            <th style="width: 20%; text-align: center;">描述</th>
            <th style="width: 20%; text-align: center;">样例</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="text-align: center;">Feature</td>
            <td style="text-align: center;">包含所期望的新功能和新特性</td>
            <td style="text-align: center;">[Feature][api] Add xxx api in xxx controller</td>
        </tr>
        <tr>
            <td style="text-align: center;">Bug</td>
            <td style="text-align: center;">程序中存在的 Bug</td>
            <td style="text-align: center;">[Bug][api] Throw exception when xxx</td>
        </tr>
        <tr>
            <td style="text-align: center;">Improvement</td>
            <td style="text-align: center;">针对目前程序的一些改进，不限于代码格式，程序性能等</td>
            <td style="text-align: center;">[Improvement][server] Improve xxx between Master and Worker</td>
        </tr>
        <tr>
            <td style="text-align: center;">Test</td>
            <td style="text-align: center;">专门针对测试用例部分</td>
            <td style="text-align: center;">[Test][server] Add xxx e2e test</td>
        </tr>
        <tr>
            <td style="text-align: center;">Sub-Task</td>
            <td style="text-align: center;">一般都是属于 Feature 类的子任务，针对大 Feature，可以将其分成很多个小的子任务来一一完成</td>
            <td style="text-align: center;">[Sub-Task][server] Implement xxx in xxx</td>
        </tr>
    </tbody>
</table>

其中`模块名`如下：

<table>
    <thead>
        <tr>
            <th style="width: 10%; text-align: center;">模块名</th>
            <th style="width: 20%; text-align: center;">描述</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="text-align: center;">alert</td>
            <td style="text-align: center;">报警模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">api</td>
            <td style="text-align: center;">应用程序接口层模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">service</td>
            <td style="text-align: center;">应用程序服务层模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">dao</td>
            <td style="text-align: center;">应用程序数据访问层模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">plugin</td>
            <td style="text-align: center;">插件模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">remote</td>
            <td style="text-align: center;">通信模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">server</td>
            <td style="text-align: center;">服务器模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">ui</td>
            <td style="text-align: center;">前端界面模块</td>
        </tr>
        <tr>
            <td style="text-align: center;">docs-zh</td>
            <td style="text-align: center;">中文文档</td>
        </tr>
        <tr>
            <td style="text-align: center;">docs</td>
            <td style="text-align: center;">英文文档</td>
        </tr>
        <tr>
            <td style="text-align: center;">待补充...</td>
            <td style="text-align: center;">-</td>
        </tr>
    </tbody>
</table>

### Issue 内容模板

https://github.com/apache/dolphinscheduler/tree/dev/.github/ISSUE_TEMPLATE

### Bug 类 Issue

当您发现一个 Bug 时，请提交一个 Issue 类的 Bug，提交前：
* 请先在 issue 列表里查找一下是否该 Bug 已经提交，如果已经有此 Bug，请在此 Bug 下接着回复。
* 如果该 Bug 是可以复现的。请尽量提供完整的重现步骤。

请在 issues 页面中提交 Bug。

一个高质量的 Bug 通常有以下特征：

* 使用一个清晰并有描述性的标题来定义 Bug。
* 详细的描述复现 Bug 的步骤。包括您的配置情况，预计产生的结果，实际产生的结果。并附加详细的 TRACE 日志。
* 如果程序抛出异常，请附加完整的堆栈日志。
* 如有可能，请附上屏幕截图或动态的 GIF 图，这些图片能帮助演示整个问题的产生过程。
* 哪个版本。
* 需要修复的优先级(危急、重大、次要、细微)。

下面是 **Bug 的 Markdown 内容模板**，请按照该模板填写 issue。

```shell
**标题** 
标题格式: [BUG][Priority] bug标题
Priority分为四级: Critical、Major、Minor、Trivial

**问题描述**
[清晰准确描述遇到的问题]

**问题复现步骤:**
1. [第一步]
2. [第二步]
3. [...]

**期望的表现:**
[在这里描述期望的表现]

**观察到的表现:**
[在这里描述观察到的表现]

**屏幕截图和动态GIF图**
![复现步骤的屏幕截图和动态GIF图](contribute/join/图片的url)

**DolphinScheduler版本:(以1.1.0为例)** 
 -[1.1.0]
 
**补充的内容:**
[请描述补充的内容，比如]

**需求或者建议**
[请描述你的需求或者建议]
```

### Feature 类 Issue

提交前：
* 请确定这不是一个重复的功能增强建议。 查看 Issue Page 列表，搜索您要提交的功能增强建议是否已经被提交过。

请在 issues 页面中提交 Feature。

一个高质量的 Feature 通常有以下特征：
* 一个清晰的标题来定义 Feature
* 详细描述 Feature 的行为模式
* 说明为什么该 Feature 对大多数用户是有用的。新功能应该具有广泛的适用性。
* 尽量列出其他调度已经具备的类似功能。商用与开源软件均可。

以下是 **Feature 的 Markdown 内容模板**，请按照该模板填写 issue 内容。

```shell
**标题** 
标题格式: [Feature][Priority] feature标题
Priority分为四级: Critical、Major、Minor、Trivial

**Feature的描述**
[描述新Feature应实现的功能]

**为什么这个新功能是对大多数用户有用的**
[解释这个功能为什么对大多数用户是有用的]

**补充的内容**
[列出其他的调度是否包含该功能，是如何实现的]

```

### Contributor

除一些特殊情况之外，在开始完成
Issue 之前，建议先在 Issue 下或者邮件列表中和大家讨论确定设计方案或者提供设计方案，以及代码实现思路。

如果存在多种不同的方案，建议通过邮件列表或者在
Issue 下进行投票决定，最终方案和代码实现思路被
approve 之后，再去实现，这样做的主要目的是避免在
Pull Request review 阶段针对实现思路的意见不同或需要重构而导致 waste time。

### 相关问题

- 当出现提出 Issue 的用户不清楚该 Issue 对应的模块时的处理方式。

  确实存在大多数提出 Issue 用户不清楚这个 Issue 是属于哪个模块的，其实这在很多开源社区都是很常见的。在这种情况下，其实
  committer/contributor 是知道这个 Issue 影响的模块的，如果之后这个 Issue 被 committer 和 contributor approve
  确实有价值，那么 committer 就可以按照 Issue 涉及到的具体的模块去修改 Issue 标题，或者留言给提出 Issue 的用户去修改成对应的标题。


---

## contribute/join/microbench.md

# 微基准测试须知

所有的优化必须建立在数据印证的基础上，拒绝盲目优化。基于此，我们提供了MicroBench模块。

MicroBench模块是基于OpenJDK JMH构件的（HotSpot的推荐基准测试方案）。当你开始基准测试时，你不需要额外的依赖。

JMH，即Java MicroBenchmark Harness，是专门用于代码微基准测试的工具套件。何谓Micro Benchmark呢？简单的来说就是基于方法层面的基准测试，精度可以达到微秒级。当你定位到热点方法，希望进一步优化方法性能的时候，就可以使用JMH对优化的结果进行量化的分析。

### Java基准测试需要注意的几个点：

* 防止无用代码进入测试方法中。

* 并发测试。

* 测试结果呈现。

### JMH比较典型的应用场景有：

* 1:定量分析某个热点函数的优化效果

* 2:想定量地知道某个函数需要执行多长时间，以及执行时间和输入变量的相关性

* 3:对比一个函数的多种实现方式

DolphinScheduler-MicroBench提供了AbstractBaseBenchmark,你可以在其基础上继承，编写你的基准测试代码，AbstractMicroBenchmark能保证以JUnit的方式运行。

### 定制运行参数

默认的AbstractMicrobenchmark配置是

Warmup次数 10（warmupIterations）

测试次数 10（measureIterations）

Fork数量 2 （forkCount）

你可以在启动的时候指定这些参数，-DmeasureIterations、-DperfReportDir（输出基准测试结果文件目录）、-DwarmupIterations、-DforkCount

### DolphinScheduler-MicroBench 介绍

通常并不建议跑测试时，用较少的循环次数，但是较少的次数有助于确认基准测试时工作的，在确认结束后，再运行大量的基准测试。

```java
@Warmup(iterations = 2, time = 1)
@Measurement(iterations = 4, time = 1)
@State(Scope.Benchmark)
public class EnumBenchMark extends AbstractBaseBenchmark {

}
```

这可以以方法级别或者类级别来运行基准测试，命令行的参数会覆盖annotation上的参数。

```java
@Benchmark //方法注解，表示该方法是需要进行 benchmark 的对象。
@BenchmarkMode(Mode.AverageTime) //可选基准测试模式通过枚举Mode得到
@OutputTimeUnit(TimeUnit.MICROSECONDS) // 输出的时间单位
public void enumStaticMapTest() {
    TestTypeEnum.newGetNameByType(testNum);
}
```

当你的基准测试编写完成后，你可以运行它查看具体的测试情况：（实际结果取决于你的系统配置情况）

首先它会对我们的代码进行预热，

```
# Warmup Iteration   1: 0.007 us/op
# Warmup Iteration   2: 0.008 us/op
Iteration   1: 0.004 us/op
Iteration   2: 0.004 us/op
Iteration   3: 0.004 us/op
Iteration   4: 0.004 us/op
```

在经过预热后，我们通常会得到如下结果

```java
Benchmark                        (testNum)   Mode  Cnt          Score           Error  Units
EnumBenchMark.simpleTest               101  thrpt    8  428750972.826 ±  66511362.350  ops/s
EnumBenchMark.simpleTest               108  thrpt    8  299615240.337 ± 290089561.671  ops/s
EnumBenchMark.simpleTest               103  thrpt    8  288423221.721 ± 130542990.747  ops/s
EnumBenchMark.simpleTest               104  thrpt    8  236811792.152 ± 155355935.479  ops/s
EnumBenchMark.simpleTest               105  thrpt    8  472247775.246 ±  45769877.951  ops/s
EnumBenchMark.simpleTest               103  thrpt    8  455473025.252 ±  61212956.944  ops/s
EnumBenchMark.enumStaticMapTest        101   avgt    8          0.006 ±         0.003  us/op
EnumBenchMark.enumStaticMapTest        108   avgt    8          0.005 ±         0.002  us/op
EnumBenchMark.enumStaticMapTest        103   avgt    8          0.006 ±         0.005  us/op
EnumBenchMark.enumStaticMapTest        104   avgt    8          0.006 ±         0.004  us/op
EnumBenchMark.enumStaticMapTest        105   avgt    8          0.004 ±         0.001  us/op
EnumBenchMark.enumStaticMapTest        103   avgt    8          0.004 ±         0.001  us/op
EnumBenchMark.enumValuesTest           101   avgt    8          0.011 ±         0.004  us/op
EnumBenchMark.enumValuesTest           108   avgt    8          0.025 ±         0.016  us/op
EnumBenchMark.enumValuesTest           103   avgt    8          0.019 ±         0.010  us/op
EnumBenchMark.enumValuesTest           104   avgt    8          0.018 ±         0.018  us/op
EnumBenchMark.enumValuesTest           105   avgt    8          0.014 ±         0.012  us/op
EnumBenchMark.enumValuesTest           103   avgt    8          0.012 ±         0.009  us/op
```

OpenJDK官方给了很多样例代码，有兴趣的同学可以自己查询并学习JMH：[OpenJDK-JMH-Example](http://hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/)


---

## contribute/join/pull-request.md

# Pull Request 须知

## 前言

Pull Request 本质上是一种软件的合作方式，是将涉及不同功能的代码，纳入主干的一种流程。这个过程中，可以进行讨论、审核和修改代码。

在 Pull Request 中尽量不讨论代码的实现方案，代码及其逻辑的大体实现方案应该尽量在
Issue 或者邮件列表中被讨论确定，在 Pull Request 中我们尽量只关注代码的格式以及代码规范等信息，从而避免实现方式的意见不同而导致
waste time。

## 规范

### Pull Request 标题

标题格式：[`Pull Request 类型`-`Issue 号`][`模块名`] `Pull Request 描述`

其中`Pull Request 类型`和`Issue 类型`的对应关系如下：

<table>
    <thead>
        <tr>
            <th style="width: 10%; text-align: center;">Issue 类型</th>
            <th style="width: 20%; text-align: center;">Pull Request 类型</th>
            <th style="width: 20%; text-align: center;">样例（假设 Issue 号为 3333）</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td style="text-align: center;">Feature</td>
            <td style="text-align: center;">Feature</td>
            <td style="text-align: center;">[Feature-3333][server] Implement xxx</td>
        </tr>
        <tr>
            <td style="text-align: center;">Bug</td>
            <td style="text-align: center;">Fix</td>
            <td style="text-align: center;">[Fix-3333][ui] Fix xxx</td>
        </tr>
        <tr>
            <td style="text-align: center;">Improvement</td>
            <td style="text-align: center;">Improvement</td>
            <td style="text-align: center;">[Improvement-3333][alert] Improve the performance of xxx</td>
        </tr>
        <tr>
            <td style="text-align: center;">Test</td>
            <td style="text-align: center;">Test</td>
            <td style="text-align: center;">[Test-3333][api] Add the e2e test of xxx</td>
        </tr>
        <tr>
            <td style="text-align: center;">Doc</td>
            <td style="text-align: center;">Doc</td>
            <td style="text-align: center;">[Doc-3333] Improve xxx</td>
        <tr>
            <td style="text-align: center;">E2E</td>
            <td style="text-align: center;">E2E</td>
            <td style="text-align: center;">[E2E-3333] Implement xxx</td>
        </tr>
        <tr>
            <td style="text-align: center;">CI</td>
            <td style="text-align: center;">CI</td>
            <td style="text-align: center;">[CI] Improve xxx</td>
        </tr>
        <tr>
            <td style="text-align: center;">Chore</td>
            <td style="text-align: center;">Chore</td>
            <td style="text-align: center;">[Chore] Improve xxx</td>
        </tr>
    </tbody>
</table>

其中 `Issue 号`是指当前 Pull Request 对应要解决的 Issue 号，`模块名`同 Issue 的模块名。

### Pull Request 分支名

分支名格式：`Pull Request 类型`-`Issue 号`，举例：Feature-3333。

### Pull Request 内容

请参阅到 commit message 篇。

### Pull Request Code Style

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (DolphinScheduler使用`Spotless`为您自动修复代码风格和格式问题，)
[//]: # (详情见[开发手册]&#40;../development-environment-setup.md#代码风格&#41;`代码风格`一栏。)

DolphinScheduler使用`Spotless`为您自动修复代码风格和格式问题，
详情见[开发手册](../development-environment-setup.md)`代码风格`一栏。

### 相关问题

- 怎样处理一个 Pull Request 对应多个 Issue 的场景。

  首先 Pull Request 和 Issue 一对多的场景是比较少的。Pull Request 和 Issue 一对多的根本原因就是出现了多个
  Issue 需要做大体相同的一件事情的场景，通常针对这种场景有两种解决方法：第一种就是把多个功能相同的 Issue 合并到同一个 Issue 上，然后把其他的
  Issue 进行关闭；第二种就是多个 Issue 大体上是在做一个功能，但是存在一些细微的差别，这类场景下可以把每个 Issue 的职责划分清楚，每一个
  Issue 的类型都标记为 Sub-Task，然后将这些 Sub-Task 类型的 Issue 关联到一个总 Issue 上，在提交
  Pull Request 时，每个 Pull Request 都只关联一个 Sub-Task 的 Issue。

  尽量把一个 Pull Request 作为最小粒度。如果一个 Pull Request 只做一件事，Contributor 容易完成，Pull Request 影响的范围也会更加清晰，对 reviewer 的压力也会小。


---

## contribute/join/review.md

# 参与社区 review

贡献 DolphinScheduler 的方式，除了向 [团队](https://dolphinscheduler.apache.org/zh-cn/community) 中提到的 GitHub 仓库提交 Issues 和 pull requests 外，另一非常重要的方式是
review 社区的 Issues 或者 Pull Requests。通过别人 Issues 和 Pull Requests，你不仅能知道社区的最新进展和发展方向，还能了解别人代码的设
计思想，同时可以增加自己在社区的曝光、积累自己在社区的荣誉值。

任何人都被鼓励去 review 社区的 Issues 和 Pull Requests。我们还曾经发起过一个 Help Wanted 的邮件讨论，向社区征求贡献者协助 review Issues
以及 Pull Requests，详见 [邮件][mail-review-wanted]，并将其结果放到了 [GitHub Discussion][discussion-result-review-wanted] 中。

> 注意: 这里并不是说只有 [GitHub Discussion][discussion-result-review-wanted] 中提及的用户才可以协助 review Issue 或者 Pull Requests，
> 请记住社区的主张是 **任何人都被鼓励去 review 社区的 Issues 和 Pull Requests**。只是那部分用户在邮件列表意见征集的时候，表达了愿意付
> 出更多的时间，参与社区的 review。另一个好处是，当社区有不确定的问题的时，除了可以找 [团队](https://dolphinscheduler.apache.org/zh-cn/community) 中对应的 Members 外，还可以找
> [GitHub Discussion][discussion-result-review-wanted] 中提及的人解答对应的问题。如果你要想要加入到 [GitHub Discussion][discussion-result-review-wanted]
> 中，请在该 discussion 中评论并留下你感兴趣的模块，维护者会将你加入到对应的名单中。

## 怎么参与社区 review

DolphinScheduler 主要通过 GitHub 接收社区的贡献，其所有的 Issues 和 Pull Requests 都托管在 GitHub 中，如果你想参与 Issues 的 review
具体请查看 [review Issues](#issues) 章节，如果你是想要参与 Pull Requests 的 review 具体请查看 [review Pull Requests](#pull-requests)
章节。

### Issues

Review Issues 是指在 GitHub 中参与 [Issues][all-issues] 的讨论，并在对应的 Issues 给出建议。给出的建议包括但不限于如下的情况

|   情况    |          原因          |                        需增加标签                         |              需要的动作              |
|---------|----------------------|------------------------------------------------------|---------------------------------|
| 不需要修改   | 问题在 dev 分支最新代码中已经修复了 | [wontfix][label-wontfix]                             | 关闭 Issue，告知提出者将在那个版本发布，如已发布告知版本 |
| 重复的问题   | 之前已经存在相同的问题          | [duplicate][label-duplicate]                         | 关闭 Issue，告知提出者相同问题的连接           |
| 问题描述不清晰 | 没有明确说明问题如何复现         | [need more information][label-need-more-information] | 提醒用户需要增加缺失的描述                   |

除了个 issue 建议之外，给 Issue 分类也是非常重要的一个工作。分类后的 Issue 可以更好的被检索，为以后进一步处理提供便利。一个 Issue 可以被打上多个标签，常见的 Issue 分类有

|                    标签                    |        标签代表的情况        |
|------------------------------------------|-----------------------|
| [UI][label-ui]                           | UI 以及前端相关的 Issue      |
| [security][label-security]               | 安全相关的 Issue           |
| [user experience][label-user-experience] | 用户体验相关的 Issue         |
| [development][label-development]         | 开发者相关的 Issue          |
| [Python][label-python]                   | Python 相关的 Issue      |
| [plug-in][label-plug-in]                 | 插件相关的 Issue           |
| [document][label-document]               | 文档相关的 Issue           |
| [docker][label-docker]                   | docker 相关的 Issue      |
| [need verify][label-need-verify]         | Issue 需要被验证           |
| [e2e][label-e2e]                         | e2e 相关的 Issue         |
| [win-os][label-win-os]                   | windows 操作系统相关的 Issue |
| [suggestion][label-suggestion]           | Issue 为项目提出了建议        |

标签除了分类之外，还能区分 Issue 的优先级，优先级越高的标签越重要，越容易被重视，并会尽快被修复或者实现，优先级的标签如下

|                    标签                    | 优先级  |
|------------------------------------------|------|
| [priority:high][label-priority-high]     | 高优先级 |
| [priority:middle][label-priority-middle] | 中优先级 |
| [priority:low][label-priority-low]       | 低优先级 |

以上是常见的几个标签，更多的标签请查阅项目[全部的标签列表][label-all-list]

在阅读以下内容是，请确保你已经为 Issue 打了标签。

- 回复后及时去掉标签[Waiting for reply][label-waiting-for-reply]：在 [创建 Issue 的时候][issue-choose]，我们会为 Issue 打上特定的标签
  [Waiting for reply][label-waiting-for-reply]，方便定位还没有被回复的 Issue，所以当你 review 了 Issue 之后，就需要将标签
  [Waiting for reply][label-waiting-for-reply] 及时的从 Issue 中删除。
- 打上 [Waiting for review][label-waiting-for-review] 标当你不确定这个 Issue 是否被解决：当你查阅了 Issue 后，会有两个情况出现。一是
  问题已经被定位或解决，如果创建 Pull Requests 的话，则参考 [创建 PR](./submit-code.md)。二是你也不确定这个问题是否真的是
  被解决，这时你可以为 Issue 打上 [Waiting for review][label-waiting-for-review] 标签，并在 Issue 中 `@` 对应的人进行二次确认

当 Issue 需要被创建 Pull Requests 解决，也可以视情况打上部分标签

|                     标签                     |     标签代表的 PR     |
|--------------------------------------------|------------------|
| [Chore][label-chore]                       | 日常维护工作           |
| [Good first issue][label-good-first-issue] | 适合首次贡献者解决的 Issue |
| [easy to fix][label-easy-to-fix]           | 比较容易解决           |
| [help wanted][label-help-wanted]           | 向社区寻求帮忙          |

> 注意: 上面关于增加和删除标签的操作，目前只有成员可以操作，当你遇到需要增减标签的时候，但是不是成员是，可以 `@` 对应的成员让其帮忙增减。
> 但只要你有 GitHub 账号就能评论 Issue，并给出建议。我们鼓励社区每人都去评论并为 Issue 给出解答

### Pull Requests

<!-- markdown-link-check-disable -->

Review Pull 是指在 GitHub 中参与 [Pull Requests][all-prs] 的讨论，并在对应的 Pull Requests 给出建议。DolphinScheduler review
Pull Requests 与 [GitHub 的 reviewing changes in pull requests][gh-review-pr] 一样。你可以为 Pull Requests 提出自己的-->

- 当你认为这个 Pull Requests 没有问题，可以被合并的时候，可以根据 [GitHub 的 reviewing changes in pull requests][gh-review-pr] 的
  approve 流程同意这个 Pull Requests。
- 当你觉得这个 Pull Requests 需要被修改时，可以根据 [GitHub 的 reviewing changes in pull requests][gh-review-pr] 的 comment
  流程评论这个 Pull Requests。当你认为存在一定要先修复才能合并的问题，请参照 [GitHub 的 reviewing changes in pull requests][gh-review-pr]
  的 Request changes 流程要求贡献者修改 Pull Requests 的内容。

<!-- markdown-link-check-enable -->

为 Pull Requests 打上标签也是非常重要的一个环节，合理的分类能为后来的 reviewer 节省大量的时间。值得高兴的是，Pull Requests 的标签和 [Issues](#issues)
中提及的标签和用法是一致的，这能减少 reviewer 对标签的记忆。例如这个 Pull Requests 是和 docker 并且直接影响到用户部署的，我们可以为他
打上 [docker][label-docker] 和 [priority:high][label-priority-high] 的标签。

除了和 Issue 类似的标签外，Pull Requests 还有许多自己特有的标签

|                           标签                           |             含义              |
|--------------------------------------------------------|-----------------------------|
| [miss document][label-miss-document]                   | 该 Pull Requests 缺少文档 需要增加   |
| [first time contributor][label-first-time-contributor] | 该 Pull Requests 贡献者是第一次贡献项目 |
| [don't merge][label-do-not-merge]                      | 该 Pull Requests 有问题 暂时先不要合并 |

> 注意: 上面关于增加和删除标签的操作，目前只有成员可以操作，当你遇到需要增减标签的时候，可以 `@` 对应的成员让其帮忙增减。但只要你有 GitHub
> 账号就能评论 Pull Requests，并给出建议。我们鼓励社区每人都去评论并为 Pull Requests 给出建议

[mail-review-wanted]: https://lists.apache.org/thread/9flwlzrp69xjn6v8tdkbytq8glqp2k51
[discussion-result-review-wanted]: https://github.com/apache/dolphinscheduler/discussions/7545
[label-wontfix]: https://github.com/apache/dolphinscheduler/labels/wontfix
[label-duplicate]: https://github.com/apache/dolphinscheduler/labels/duplicate
[label-need-more-information]: https://github.com/apache/dolphinscheduler/labels/need%20more%20information
[label-win-os]: https://github.com/apache/dolphinscheduler/labels/win-os
[label-waiting-for-reply]: https://github.com/apache/dolphinscheduler/labels/Waiting%20for%20reply
[label-waiting-for-review]: https://github.com/apache/dolphinscheduler/labels/Waiting%20for%20review
[label-user-experience]: https://github.com/apache/dolphinscheduler/labels/user%20experience
[label-development]: https://github.com/apache/dolphinscheduler/labels/development
[label-ui]: https://github.com/apache/dolphinscheduler/labels/UI
[label-suggestion]: https://github.com/apache/dolphinscheduler/labels/suggestion
[label-security]: https://github.com/apache/dolphinscheduler/labels/security
[label-python]: https://github.com/apache/dolphinscheduler/labels/Python
[label-plug-in]: https://github.com/apache/dolphinscheduler/labels/plug-in
[label-document]: https://github.com/apache/dolphinscheduler/labels/document
[label-docker]: https://github.com/apache/dolphinscheduler/labels/docker
[label-all-list]: https://github.com/apache/dolphinscheduler/labels
[label-chore]: https://github.com/apache/dolphinscheduler/labels/Chore
[label-good-first-issue]: https://github.com/apache/dolphinscheduler/labels/good%20first%20issue
[label-help-wanted]: https://github.com/apache/dolphinscheduler/labels/help%20wanted
[label-easy-to-fix]: https://github.com/apache/dolphinscheduler/labels/easy%20to%20fix
[label-priority-high]: https://github.com/apache/dolphinscheduler/labels/priority%3Ahigh
[label-priority-middle]: https://github.com/apache/dolphinscheduler/labels/priority%3Amiddle
[label-priority-low]: https://github.com/apache/dolphinscheduler/labels/priority%3Alow
[label-miss-document]: https://github.com/apache/dolphinscheduler/labels/miss%20document
[label-first-time-contributor]: https://github.com/apache/dolphinscheduler/labels/first%20time%20contributor
[label-do-not-merge]: https://github.com/apache/dolphinscheduler/labels/don%27t%20merge
[label-e2e]: https://github.com/apache/dolphinscheduler/labels/e2e
[label-need-verify]: https://github.com/apache/dolphinscheduler/labels/need%20to%20verify
[issue-choose]: https://github.com/apache/dolphinscheduler/issues/new/choose
[all-issues]: https://github.com/apache/dolphinscheduler/issues
[all-prs]: https://github.com/apache/dolphinscheduler/pulls
[gh-review-pr]: https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/about-pull-request-reviews


---

## contribute/join/security-model.md

# Apache DolphinScheduler安全模型

本文档主要用于描述不同角色用户的工作范围、职责和重点功能，通过对用户权限和功能的介绍辅助用户在了解部署、使用、运维等阶段的注意事项和规则。针对开发者可以通过本文档了解安全漏洞与正常功能的边界。

## Apache DolphinScheduler工作流程

从了解到使用Apache DolphinScheduler，用户一般会经过以下几个阶段。

1.系统部署，配置运行环境

2.创建系统用户，配置对应资源

3.创建工作流定义，配置任务运行

4.系统运维

无论用户使用的是单节点、伪集群、还是集群部署（服务器或云部署），对于系统的使用都会经过以上四个步骤。针对上述四个步骤，一般会涉及到以下三种类型的用户。

## 用户类型

### 1.服务部署人员

服务部署人员需要拥有操作服务器的权限，服务部署人员需要了解相关任务运行的方式，已确保服务器安全边界和环境要求。
(1).对于多租户运行场景，服务器部署用户需要具备创建用户和切换用户权限。
(2).Apache DolphinScheduler中可以运行用户自定的脚本和代码，用户可以通过节点配置运行机器上执行任意命令或代码，服务部署人员需要确认服务启动用户的权限，通过权限保护一些敏感文件，明确部署用户的操作权限边界。
(3).服务器会进行数据源连接操作，执行用户自定义的sql语句，平台不会限制用户执行sql的类型，sql执行的权限与创建创建数据源的用户权限有关。
(4).服务器部署人员需要确保业务所需的worker分组中所有的worker服务器与任务运行所需资源之间的网络和交互安全要求。
(5).对于worker本地任务类型（datax等）需要具备调用对应服务的权限。
(6).Apache DolphinScheduler提供的资源中心可以直接对接本地文件系统，在集群部署环境下，可以通过共享文件方式挂载其他服务器文件到api服务器上实现文件访问，此处服务部署人员需要确保挂载文件目录中包含的文件允许系统用户操作，并且信任操作用户的操作行为。
(7).Apache DolphinScheduler 支持k8s任务类型，k8s集群由运维提供，运维需要保证k8s的服务安全问题，防止出现pod逃逸等安全问题。

### 2.系统管理员

系统管理员拥有Apache DolphinScheduler所有的操作权限，在实际使用中应该确保管理员用户的使用范围，并高度信任管理员用户不会滥用此功能。
(1).管理员用户可以操作队列管理、租户管理、用户管理、告警组管理、worker分组管理、令牌管理等功能，管理员用户可以操作所有的配置，其中包括连接资源所需的敏感凭证等重要信息，要确保使用管理员用户的人员可以操作对应资源。同时管理员用户在用户管理模块可以对资源、数据源、项目等授权操作，管理员用户需要明确授权后用户将对对应资源拥有所有使用权限。
(2).系统管理员用户拥有普通用户所有的操作权限

### 3.系统普通用户

Apache DolphinScheduler的普通用户定义为实际的工作流开发和运营用户，当然也需要维护在工作流开发过程中所需要的部分资源。应该高度信任这些用户不会滥用此功能。
(1).用户可以创建工作流和任务，任务支撑类型列表查看【任务列表】，任务会在worker中执行，用户可以自定义任意命令和代码在指定的worker分组中运行，一定要注意这里的任意命令和代码，用户可以执行Apache DolphinScheduler支持任务类型下的所有任务，包括shell、sql、和跳转至其他服务器执行shell脚本等任务。同时任务运行过程会产生日志，用户可以通过UI页面查看、下载任务运行日志。
(2).用户可以创建数据源连接，可以修改、删除有权限的连接包括对应的配置，尤其是对有权限连接的敏感凭据的操作，这些操作可能会对资源本身或系统造成一定的影响，数据源包括众多种类，具体可以查看官网中【数据源列表】。

### 4.未登录用户

Apache DolphinScheduler不允许未登录用户访问系统。下文中提到的用户不包含该类型用户。

平台正常使用除核心的工作流开发、运行外，还需要配置、管理对应的环境和资源。

## 数据源管理

所有用户均可操作数据源管理，管理员用户可对普通用户进行授权后进行操作。数据源任务运行的对应权限由数据源连接提供，连接配置应尽量控制任务执行权限。数据源配置中，用户可以自定义连接参数，并对所有使用该数据源的任务生效。

## 资源中心

资源中心可以配置本地、分布式文件存储、云对象存储等多种方式，当需要使用资源中心进行相关文件的创建或者上传操作时，所有的文件和资源都会被存储在分布式文件系统HDFS或者远端的对象存储。同时用户可修改有权限文件的内容，在这个过程中需要信任用户不会损坏文件，不会造成其他安全风险。

## 告警管理

告警方式支持列表可查看官网中【告警】，所有用户可将有权限的告警通道配置到各自的流程中。用户可以修改包含敏感凭据的告警配置。告警配置会应用在工作流运行超时、结果等规则的告警中，需要信任用户告警的配置和告警信息的发送不会对告警通道和接受告警人员产生影响。

## 认证方式

Apache DolphinScheduler支持四种认证方式，自身账号密码登录，LDAP, 通过Casdoor实现的SSO登录和通过Oauth2授权登录，并且oauth2授权登录方式可以和其他认证方式同时使用。需要高度信任用户以任何方式登录的用户都不会滥用对应权限和功能。

## 安全中心

管理员用户可以配置队列、租户、用户、告警组、worker分组、令牌、k8s集群、k8s命名空间等资源，需要信用用户对资源的权限分配、使用、维护，都不会对平台和服务本身产生影响。

## 网络环境

Apache DolphinScheduler的部署和使用认为用户网络是安全和值得信任的，Apache DolphinScheduler不处理内网交叉渗透问题

### 误认为是安全漏洞的示例

以下是以往使用者和开发者提出的一些错误的漏洞情况。

1.利用插件的不安全设置进行攻击或其他操作
用户使用某个插件时，将某些参数设置成不安全的配置，进而通过该配置进行系统攻击，这种问题不属于安全漏洞。这种插件包括但不限于数据源、任务等，用户对于参数的设置属于主动行为，授权事已信任用户的参数配置操作，用户在设置对应的参数或某个配置时认为该配置用户已经完全了解所配置的功能和所带来的风险，所以该类型的问题不属于漏洞。例如在使用mysql驱动链接doris时，在jdbc的连接参数中增加了{"aaa":"dsf&allowLoadLocalInfile=true#"}，该配置可能会将本地的敏感文件发送至服务器，在该过程中，用户按需增加了配置，则信任用户的所有操作。
2.利用部署时的安全配置访问系统进行攻击或其他操作
部署用户在系统部署时应该按照官网的操作，将敏感配置进行修改，该配置属于服务敏感信息，其重要和安全级别等同与服务数据库连接等信息。当其他用户无论通过任何途径获取到敏感配置后，平台变认为该用户为正常授权用户，完全信任授权用户的所有操作。例如用户通过配置文件中获取了auth-token数据，通过该配置进行鉴权并且创建用户，利用创建的用户对系统进行操作，该过程中既然用户获得了平台的鉴权信息，则认为信任用户的所有操作。
3.执行平台在任务执行过程中产生的中间文件
在Apache DolphinScheduler运行任务的过程中会产生部分中间文件，该文件主要是封装任务运行所需的环境和参数等信息，该文件与任务相关，并且与运行的任务存储在同一个节点中，运行这些文件与其他用户在同一个节点中运行同一个任务没有差异。在部署和权限的分配过程中，将对应的worker或其他资源分配给对应的用户，这个操作意味着完全信任该用户对该服务节点的所有操作，包括任务运行和读取、修改服务器中有权限的资源，当然也包括平台所生成的文件。所以该类型问题不属于漏洞。例如remote shell任务会在服务器中生产一个中间文件，用户得知了文件信息，通过shell节点操作该文件，在该过程中，用户具有该节点的权限，则信任用户对该节点的所有操作。
4.已授权用户通过页面输入框输入脚本进行攻击或其他操作
在Apache DolphinScheduler有多个输入框，允许用户按需进行自定义配置，Apache DolphinScheduler作为开源任务调度系统，管理员用户在部署、授权等涉及安全的过程中需要完全信任目标用户的所有授权范围内的操作，用户通过页面或调用接口增加、修改配置的行为如果属于权限范围内的操作，则通过该方式进行攻击或其他操作的行为不属于安全漏洞。
5.通过修改镜像或提供不安全的镜像运行进行攻击或其他操作
Apache DolphinScheduler的本身和任务运行均支持k8s集群，在服务或任务运行之前，用户需要确保镜像的功能和所配置参数，信任服务、任务运行过程中的所有操作。所以在镜像运行之前通过任何途径将任务或参数进行修改进行攻击或其他完成其他操作的行为不属于安全漏洞。
6.通过获取服务日志中打印的某些敏感信息进行攻击
Apache DolphinScheduler的服务日志中会打印部分敏感信息，服务部署人员可以通过日志查看程序运行的详细信息。服务部署人员被认为是可信任的用户，我们认为服务部署人员不会攻击程序，所以该类型问题不属于漏洞。
7.系统管理员通过访问不受信任的三方网站导致的安全问题
系统管理员在使用Apache DolphinScheduler的过程中，可能会访问不受信任的三方网站，导致系统被攻击，这种问题不属于安全漏洞。系统管理员被认为是可信任的用户，我们认为系统管理员具备基本的安全防范意识，由于系统管理员的安全防范意识薄弱所引发的问题不属于漏洞。


---

## contribute/join/security.md

# 安全

Apache Software Foundation在消除其软件项目中的安全性问题方面采取严格的立场。 Apache DolphinScheduler也非常关注与其功能有关的安全性问题。

如果您对DolphinScheduler的安全性有疑虑，或者发现了漏洞或潜在威胁，请发送邮件至[security@apache.org]，与Apache安全团队联系。 请在电子邮件中将项目名称指定为DolphinScheduler，并提供相关问题或潜在威胁的描述。 还敦促您推荐重现和复制问题的方法。 在评估和分析调查结果之后，apache安全团队和DolphinScheduler社区将与您联系。

在公共领域公开该安全电子邮件之前，请注意在安全电子邮件中报告该安全问题。

## 注意

在您提交之前，请先按照Apache DolphinScheduler[安全模型](https://github.com/apache/dolphinscheduler/tree/dev/docs/docs/zh/contribute/join/security-model.md)检查该问题是否属于安全漏洞。


---

## contribute/join/submit-code.md

# 提交代码

* 首先从远端仓库*https://github.com/apache/dolphinscheduler.git* fork一份代码到自己的仓库中

* 远端仓库中目前有三个分支：

  * master 正常交付分支
    发布稳定版本以后，将稳定版本分支的代码合并到master上。

  * dev    日常开发分支
    日常dev开发分支，新提交的代码都可以pull request到这个分支上。

  * branch-1.0.0 发布版本分支
    发布版本分支，后续会有2.0...等版本分支。

* 把自己仓库clone到本地

  ` git clone https://github.com/apache/dolphinscheduler.git`

* 添加远端仓库地址，命名为upstream

  ` git remote add upstream https://github.com/apache/dolphinscheduler.git `

* 查看仓库：

  ` git remote -v`

> 此时会有两个仓库：origin(自己的仓库)和upstream（远端仓库）

* 获取/更新远端仓库代码（已经是最新代码，就跳过）

  ` git fetch upstream `

* 同步远端仓库代码到本地仓库

```
git checkout origin/dev
git merge --no-ff upstream/dev
```

如果远端分支有新加的分支比如`dev-1.0`,需要同步这个分支到本地仓库

```
git checkout -b dev-1.0 upstream/dev-1.0
git push --set-upstream origin dev-1.0
```

* 新建分支

```
git checkout -b xxx origin/dev
```

确保分支`xxx`是基于官方dev分支的最新代码

* 在新建的分支上本地修改代码以后，提交到自己仓库：

  `git commit -m 'commit content'`

  `git push origin xxx --set-upstream`

* 将修改提交到远端仓库

  * 在github的PullRequest页面，点击"New pull request".

  * 选择修改完的本地分支和要合并的目的分支，点击"Create pull request".

* 接着社区Committer们会做CodeReview，然后他会与您讨论一些细节（包括设计，实现，性能等）。当团队中所有人员对本次修改满意后，会将提交合并到dev分支

* 最后，恭喜您已经成为了dolphinscheduler的官方贡献者！


---

## contribute/join/subscribe.md

# 订阅邮件列表

强烈推荐订阅开发邮件列表，与社区保持最新信息同步，这一点非常重要。

在使用DolphinScheduler的过程中，如果您有任何问题或者想法、建议，都可以通过Apache邮件列表参与到DolphinScheduler的社区建设中来。

发送订阅邮件也非常简单，步骤如下:

1. 用自己的邮箱向[dev-subscribe@dolphinscheduler.apache.org]发送一封邮件，主题和内容任意。

2. 接收确认邮件并回复。 完成步骤1后，您将收到一封来自dev-help@dolphinscheduler.apache.org的确认邮件（如未收到，请确认邮件是否被自动归入垃圾邮件、推广邮件、订阅邮件等文件夹）。然后直接回复该邮件，或点击邮件里的链接快捷回复即可，主题和内容任意。

3. 接收欢迎邮件。 完成以上步骤后，您会收到一封主题为WELCOME to dev@dolphinscheduler.apache.org的欢迎邮件，至此您已成功订阅Apache DolphinScheduler的邮件列表。

# 取消订阅邮件列表

如果您不再需要了解DolphinScheduler的动态，可以取消订阅邮件列表。

取消订阅邮件列表步骤如下:

1. 用已经订阅的邮箱向[dev-unsubscribe@dolphinscheduler.apache.org]发送一封邮件，主题和内容任意。

2. 接收确认邮件并回复。 完成步骤1后，您将收到一封来自[dev-help@dolphinscheduler.apache.org]的确认邮件（如未收到，请确认邮件是否被自动归入垃圾邮件、推广邮件、订阅邮件等文件夹）。然后直接回复该邮件，或点击邮件里的链接快捷回复即可，主题和内容任意。

3. 接收告别邮件。 完成以上步骤后，您会收到一封主题为GOODBYE from [dev@dolphinscheduler.apache.org]的告别邮件，至此您已成功取消订阅Apache DolphinScheduler的邮件列表，以后将不会再接收来自[dev@dolphinscheduler.apache.org]的邮件通知。


---

## contribute/join/unit-test.md

## Unit Test 覆盖率

Unit Test

### 1.写单元测试的收益

* 单元测试能帮助每个人深入代码细节，了解代码的功能。
* 通过测试用例我们能发现 bug，并提交代码的健壮性。
* 测试用例同时也是代码的 demo 用法。

### 2.单元测试用例的一些设计原则

* 应该精心设计好步骤，颗粒度和组合条件。
* 注意边界条件。
* 单元测试也应该好好设计，不要写无用的代码。
* 当你发现一个`方法`很难写单元测试时，如果可以确认这个`方法`是`臭代码`，那么就和开发者一起重构它。

<!-- markdown-link-check-disable -->
* DolphinScheduler: [mockito](http://site.mockito.org/). 下面是一些开发向导: [mockito tutorial](https://www.baeldung.com/bdd-mockito), [mockito refcard](https://dzone.com/refcardz/mockito)

<!-- markdown-link-check-enable -->
* TDD（可选）：当你开始写一个新的功能时，你可以试着先写测试用例。

### 3.测试覆盖率设定值

* 在现阶段，Delta 更改代码的测试覆盖设定值为：>＝60%，越高越好。
* 我们可以在这个页面中看到测试报告: https://codecov.io/gh/apache/dolphinscheduler

## 单元测试基本准则

### 1： 隔离性与单一性

一个测试用例应该精确到方法级别，并应该能够单独执行该测试用例。同时关注点也始终在该方法上（只测试该方法）。

如果方法过于复杂，开发阶段就应该将其再次进行拆分，对于测试用例来讲，最佳做法是一个用例只关注一个分支（判断）。当对其进行修改后，也仅仅影响一个测试用例的成功与否。这会极大方便我们在开发阶段验证问题和解决问题，但与此同时，也对我们覆盖率提出了极大的挑战。

### 2：自动性

单元测试能够自动化进行。强制要求：所有的单元测试必须写在 src/test 下，同时方法命名应该符合规范。基准测试除外。

### 3：可重复性

多次执行（任何环境任何时间）结果唯一，且可以重复执行。

### 4：轻量型

即任何环境都可快速执行。

这要求我们尽可能不要依赖太多组件，如各种 spring bean 之类的。在单元测试中，这些都是可被 mock 的，增加这些，会加大我们单测的执行速度，同时也可能会传递污染。

对于一些数据库、其他外部组件等。尽可能也采用模拟客户端的形式，即不依赖于外部环境，（任何外部依赖的存在都会极大的限制测试用例的可迁移性和稳定性以及结果正确性），这同时也方便开发者在任何环境都能够进行测试。

### 5： 可测性

这么多年过去了，你所看到的 mockito 已经成长为 mock 界的 NO.1 了，但他依然不支持 mock 静态方法、构造方法等。甚至官网上一直写着： "Don’t mock everything" 。因此尽量少用静态方法。

一般建议只在一些工具类提供静态方法，这种情况下也不需要 mock，直接使用真实类即可。如果被依赖类不是工具类，可以将静态方法重构为实例方法。这样更加符合面向对象的设计理念。

### 6： 完备性

测试覆盖率，这是个非常费劲的问题，对于核心流程，我们是希望能够达到 90% 的覆盖率，非核心流程要求 60% 以上。

覆盖率足够高的情况下会减少足够多的 bug 出现的概率，同时也减少了我们回归测试的成本。这是一个长久的工作，每当开发者新增或者修改代码的时候，相关测试用例与此同时也需要完善。这一点，希望开发者以及相关代码 reviewer 都能足够重视。

### 7：拒绝无效断言

无效断言让测试本身变得毫无意义，它和你的代码正确与否几乎没什么关系，且有可能会给你造成一种成功的假象，这种假象有可能持续到你的代码部署到生产环境。

关于无效的断言这么几种类型

1:不同类型的比较。

2:判断一个具有默认值的对象或者变量不为空。

这本身显得毫无意义，因此，在进行相关判断的时候应该关注一下其本身是否含有默认值。

3:断言尽可能采用肯定断言而非否定断言，断言尽可能在一个预知结果范围内,或者是准确的数值，（否则有可能会导致一些不符合你的实际预期但是通过了断言）除非你的代码只关心他是否为空。

### 8:一些单测的注意点

1:Thread.sleep()

测试代码中尽量不要使用 Thread.sleep，这让测试变得不稳定，可能会因为环境或者负载而意外导致失败。建议采用以下方式：

Awaitility.await().atMost(…)

2:忽略某些测试类

@Disabled 注解应该附上相关 issue 地址，方便后续开发者追踪了解该测试被忽略的历史原因。

如 @Disabled("see #1")

3: try-catch 单元测试异常

当单元测试中的代码引发异常的时候，测试将失败,因此，不需要使用 try-catch 捕获异常。

```
@Test
public void testMethod() {
  try {
            // Some code
  } catch (MyException e) {
    Assert.fail(e.getMessage());  // Noncompliant
  }
}
```

你应该这样做：

```
@Test
public void testMethod() throws MyException {
    // Some code
}
```

4:测试异常情况

当你需要进行异常情况测试时，应该避免在测试代码中包含多个方法的调用（尤其是有多个可以引发相同异常的方法），同时应该明确说明你要测试什么。

5:拒绝使用 MockitoJUnitRunner.Silent.class

当单测出现 UnnecessaryStubbingException 时，请不要第一时间考虑使用 @RunWith(MockitoJUnitRunner.Silent.class) 来解决它，这只是隐藏了问题，
你应该根据异常提示解决相关问题，这并不是一个困难的工作。当完成更改时，你会发现，你的代码又简洁了许多。


---

## contribute/log-specification.md

# 日志规范

## 前言

日志被用来追踪、记录系统开发、运行期间的各种行为。规范的日志打印可以帮助用户或开发者快速了解系统运行状态、定位问题。

Apache DolphinScheduler使用Logback日志框架，按照DEBUG、WARN、INFO、ERROR四个级别对日志进行打印，其优先级为DEBUG < INFO < WARN < ERROR。

## 规范

### 日志级别规范

不同级别的日志在业务过程中起着不同的作用，如果不能使用合理的日志级别进行打印，会对系统运维带来很大的困难。

- DEBUG级别在开发、测试过程中使用，用于输出调试信息。开发者尽可能将调试过程中的参数信息，过程细节，结果信息使用该级别打印，方便在开发、测试阶段定位、分析问题。此外，禁止在生产环境中使用该级别打印日志。
- INFO级别用于记录系统运行期间的信息。使用该级别打印的日志应能够反映系统的行为，比如工作流、任务的状态变化等。
- WARN级别用于对运行过程中将会出现的问题进行警告。比如API模块参数的校验等。
- ERROR级别用于记录一些不可预知的错误、异常，这些错误、异常会影响系统流程。比如导致工作流、任务无法正常完成的错误、异常。

### 日志内容规范

日志内容是否规范决定着日志能否完整地还原系统行为或状态。

- DEBUG级别的日志记录开发过程中的调试信息。DEBUG级别的日志出现在需要调试的关键程序处，其内容涵盖细致的现场信息，参数，结果等。

- INFO级别的日志需要记录当前程序调用的状态信息或运行信息，起到描述系统运行过程的作用。所以该级别的日志需要在系统运行的关键环节出现，其内容需涵盖关键环节描述，参数以及结果等。比如工作流实例被调度时，打印每一个关键环节的状态变化。

- WARN级别的日志记录当前程序调用中发生的可容忍错误的信息，该错误不会影响系统或功能的正常运行，但是该级别的日志内容也需要涵盖详细地环节描述，参数以及结果等信息。比如API模块接口参数校验失败时，记录校验失败的描述，参数。

- ERROR级别的日志记录当前程序调用中发生的不可容忍错误的信息，该错误会导致系统或功能无法正常运行。所以该级别的日志需要详细地记录错误描述，现场参数，错误结果等，保证能够根据日志快速定位到问题以及原因。此外，处理异常时如果确定要打印堆栈信息，使用如下格式：

  ```java
  logger.error("description of current error, parameter is {}", parameter, e);
  ```

### 日志格式规范

Master模块和Worker模块的日志打印使用如下格式。即在打印的日志中使用MDC注入工作流实例ID和任务实例ID，因此开发者在打印这两个模块中与工作流实例和任务实例有关的日志前，需要获取ID并注入；在打印完成后，需要移除相关ID。

```xml
[%level] %date{yyyy-MM-dd HH:mm:ss.SSS Z} %logger{96}:[%line] - [WorkflowInstance-%X{workflowInstanceId:-0}][TaskInstance-%X{taskInstanceId:-0}] - %msg%n
```

## 日志配置修改

DolphinScheduler使用[`LogBack`](https://docs.spring.io/spring-boot/docs/2.1.8.RELEASE/reference/html/howto-logging.html)作为日志工具。若您要修改某个包的日志打点级别，您需要修改对应模块的`logback-spring.xml`文件。
举例来说，若您需要将`standalone`模式下`org.springframework.web`包日志提升到`DEBUG`级别，您需要在`apache-dolphinscheduler-dev-SNAPSHOT-bin/standalone-server/conf/logback-spring.xml`文件中加入如下配置：

```xml
<configuration scan="true" scanPeriod="120 seconds">

......

  <logger name="org.springframework.web" level="DEBUG">
    <appender-ref ref="STANDALONELOGFILE" />
    <appender-ref ref="TASKLOGFILE"/>
  </logger>

......

</configuration>
```

## 注意事项

- 禁止使用标准输出打印日志。标准输出会极大影响系统性能。
- 异常处理时禁止使用printStackTrace()。该方法会将异常堆栈信息打印到标准错误输出中。
- 禁止分行打印日志。日志的内容需要与日志格式中的相关信息关联，如果分行打印会导致日志内容与时间等信息匹配不上，并且在大量日志环境下导致日志混合，会加大日志检索难度。
- 禁止使用"+"运算符对日志内容进行拼接。使用占位符进行日志格式化打印，提高内存使用效率。
- 日志内容中包括对象实例时，需要确保重写toString()方法，防止打印无意义的hashcode。


---

## contribute/release.md

# 发版指南

## 准备

这部分是预发布工作，大部分是一次性的，意思是**它只在你的第一次发布时需要**。 如果你有之前发布过，请跳过本节到下一个部分。

### 检查环境

为确保您可以成功完成 DolphinScheduler 的发布，您应该检查您的环境并确保满足所有条件，如果缺少任何条件，您应该安装它们并确保它们正常工作。

```shell
# 需要 JDK 1.8 及以上的版本
java -version
# 需要 Maven
mvn -version
```

### GPG 设置

#### 安装 GPG

在[GnuPG 官网](https://www.gnupg.org/download/index.html)下载安装包。
GnuPG 的 1.x 版本和 2.x 版本的命令有细微差别，下列说明以`GnuPG-2.1.23`版本为例。

安装完成后，执行以下命令查看版本号。

```shell
gpg --version
```

#### 创建 key

安装完成后，执行以下命令创建 key。

`GnuPG-2.x`可使用：

```shell
gpg --full-gen-key
```

`GnuPG-1.x`可使用：

```shell
gpg --gen-key
```

根据提示完成 key，**注意：请使用 Apache mail 和 对应的密码生成 GPG 的 Key。**

```shell
gpg (GnuPG) 2.0.12; Copyright (C) 2009 Free Software Foundation, Inc.
This is free software: you are free to change and redistribute it.
There is NO WARRANTY, to the extent permitted by law.

Please select what kind of key you want:
  (1) RSA and RSA (default)
  (2) DSA and Elgamal
  (3) DSA (sign only)
  (4) RSA (sign only)
Your selection? 1
RSA keys may be between 1024 and 4096 bits long.
What keysize do you want? (2048) 4096
Requested keysize is 4096 bits
Please specify how long the key should be valid.
        0 = key does not expire
     <n>  = key expires in n days
     <n>w = key expires in n weeks
     <n>m = key expires in n months
     <n>y = key expires in n years
Key is valid for? (0)
Key does not expire at all
Is this correct? (y/N) y

GnuPG needs to construct a user ID to identify your key.

Real name: ${输入用户名}
Email address: ${输入邮件地址}
Comment: ${输入注释}
You selected this USER-ID:
   "${输入的用户名} (${输入的注释}) <${输入的邮件地址}>"

Change (N)ame, (C)omment, (E)mail or (O)kay/(Q)uit? O
You need a Passphrase to protect your secret key. # 输入apache登录密码
```

注意：如果遇到以下错误：

```
gpg: cancelled by user
gpg: Key generation canceled.
```

需要使用自己的用户登录服务器，而不是 root 切到自己的账户

#### 查看生成的 key

```shell
gpg --list-keys
```

执行结果：

```shell
pub   4096R/85E11560 2019-11-15
uid                  ${用户名} (${注释}) <{邮件地址}>
sub   4096R/A63BC462 2019-11-15
```

其中 85E11560 为公钥 ID。

gpg2.0版本后格式发生变化

```shell
pub   rsa4096 2023-07-01 [SC]
1234ABCD5678EFGH9012IJKL3456MNOP7890QRST
uid           [ultimate] ${用户名} <{邮件地址}>
sub   rsa4096 2023-07-01 [E]
```

其中1234ABCD5678EFGH9012IJKL3456MNOP7890QRST为公钥 ID。

#### 将公钥同步到服务器

命令如下：

```shell
gpg --keyserver hkp://keyserver.ubuntu.com --send-key 85E11560
```

`keyserver.ubuntu.com`为随意挑选的[公钥服务器](https://keyserver.ubuntu.com)，每个服务器之间是自动同步的，选任意一个即可。

注意：如果同步到公钥服务器，可以在服务器上查到新建的公钥
http://keyserver.ubuntu.com/pks/lookup?search=${用户名}&fingerprint=on&op=index

### 配置 Apache Maven Central Repository

#### 设置 `settings-security.xml` 和 `settings.xml` 文件

在本节中，我们添加 Apache 服务器 maven 配置以准备发布，请参考[这里](http://maven.apache.org/guides/mini/guide-encryption.html) 添加
`settings-security.xml` 文件，并且像下面这样更改你的 `~/.m2/settings.xml`

```xml
<settings>
  <servers>
    <server>
      <id>apache.snapshots.https</id>
      <username> <!-- APACHE LDAP 用户名 --> </username>
      <password> <!-- APACHE LDAP 加密后的密码 --> </password>
    </server>
    <server>
      <id>apache.releases.https</id>
      <username> <!-- APACHE LDAP 用户名 --> </username>
      <password> <!-- APACHE LDAP 加密后的密码 --> </password>
    </server>
  </servers>
</settings>
```

## Releasing

## 检查 release-docs

和上一个版本比较，如果有依赖及版本发生了变化，当前版本的 `release-docs` 需要被更新到最新

- `dolphinscheduler-dist/release-docs/LICENSE`
- `dolphinscheduler-dist/release-docs/NOTICE`
- `dolphinscheduler-dist/release-docs/licenses`

### 配置环境变量

我们将多次使用发布版本 `VERSION`，github 名称 `GH_USERNAME`，以及 Apache 用户名 `<YOUR-APACHE-USERNAME>`，因此最好将其存储到 bash 变量中以便于使用。

```shell
VERSION=<THE-VERSION-YOU-RELEASE>
SOURCE_CODE_DIR=<YOUR-SOURCE-CODE-ROOT-DIR>  # the directory of your source code hold, the location of parent pom.xml instead of binary package

GH_USERNAME=<YOUR-GITHUB-USERNAME>
GH_REMOTE=<GITHUB-REMOTE>  # we use `upstream` or `origin` mostly base on your release environment

A_USERNAME=<YOUR-APACHE-USERNAME>
SVN_DIR=<PATH-TO-SVN-ROOT>  # to keep binary package checkout from SVN, the sub path end with `/dolphinscheduler/dev` and `/dolphinscheduler/release` will be create
```

> 注意：设置环境变量后，我们可以直接在你的 bash 中使用该变量，而无需更改任何内容。例如，我们可以直接使用命令 `git clone -b "${VERSION}"-prepare https://github.com/apache/dolphinscheduler.git`
> 来克隆发布分支，他会自动将其中的 `"${VERSION}"` 转化成你设置的值 `<THE-VERSION-YOU-RELEASE>`。 但是您必须在一些非 bash 步骤中手动更改
> `<VERSION>` 为对应的版本号，例如发起投票中的内容。我们使用 `<VERSION>` 而不是 `"${VERSION}"` 来提示 release manager 他们必须手动更改这部分内容

### 更新文档和代码的版本

我们需要在 Maven 发布之前更新一些文档。 例如，要发布版本 `VERSION`，需要进行以下更新：

- 修改代码中的版本号:
  - `sql`:
    - `dolphinscheduler_mysql.sql`: `t_ds_version` 版本更新为 x.y.z
    - `dolphinscheduler_postgre.sql`: `t_ds_version` 版本更新为 x.y.z
    - `dolphinscheduler_h2.sql`: `t_ds_version` 版本更新为 x.y.z
    - `upgrade`: 是否新增 `x.y.z_schema` 文件夹，如果有一些升级的 DDL 或 DML，如果没有添加任何 DDL 或 DML 可以跳过这一步。
    - `soft_version`: 版本更新为 x.y.z
  - `deploy/docker/.env`: `HUB` 改为 `apache`，`TAG` 改为 `x.y.z`
  - `deploy/kubernetes/dolphinscheduler`:
    - `Chart.yaml`: `appVersion` 和 `version` 版本更新为 x.y.z
    - `values.yaml`: `image.tag` 版本更新为 x.y.z
  - `config`
    - `install-plugins.sh`: `version` 版本 `dev-SNAPSHOT` 更新为 x.y.z
- 修改文档（docs 模块）中的版本号:
  - 将 `docs` 文件夹下文件的占位符 `<version>` (除了 pom.xml 相关的) 修改成 `x.y.z`
  - 新增历史版本
    - `docs/docs/en/history-versions.md` 和 `docs/docs/zh/history-versions.md`: 增加新的历史版本为 `x.y.z`
  - 修改文档 sidebar
    - `docs/configs/docsdev.js`: 将里面的 `/dev/` 修改成 `/x.y.z/`，**不要**修改文件名称，website 仓库的 shell 脚本会对他进行修改

> 注意：`VERSION` 是一个占位字符串，与我们在 `VERSION=<THE-VERSION-YOU-RELEASE>` 中设置的版本相同。

### 修改NOTICE年份

需要检查NOTICE文件，将第二行中的截止年份修改为当前年份。 需要检查的文件包括
- `dolphinscheduler-dist/release-docs/NOTICE`
- `NOTICE`

### Maven 发布

#### Maven 发布检查

在准备分支的基础上创建发布分支。

```shell
cd "${SOURCE_CODE_DIR}"
git checkout -b "${VERSION}"-release "${VERSION}"-prepare
git push "${GH_REMOTE}" "${VERSION}"-release
export GPG_TTY=$(tty)
```

> 注意：如果你在没有源代码的远程主机上发布，你应该先运行 `git clone -b "${VERSION}"-prepare https://github.com/apache/dolphinscheduler.git`
> 首先要克隆源代码。 然后确保设置`GH_REMOTE="origin"` 以使所有命令正常工作。

```shell
# 运行发版校验
mvn release:prepare -Papache-release,release -Darguments="-Dmaven.test.skip=true -Dspotless.skip=true -Dspotless.check.skip=true -Dmaven.javadoc.skip=true" -DautoVersionSubmodules=true -DdryRun=true -Dusername="${GH_USERNAME}"
```

- `-Prelease`: 选择 release 的 profile，这个 profile 会打包所有源码、jar 文件以及可执行二进制包。
- `-DautoVersionSubmodules=true`: 作用是发布过程中版本号只需要输入一次，不必为每个子模块都输入一次。
- `-DdryRun=true`: 演练，即不产生版本号提交，不生成新的 tag。

#### 准备发布

首先清理发布预校验本地信息。

```shell
mvn release:clean
```

然后准备执行发布。

```shell
mvn release:prepare -Papache-release,release -Darguments="-Dmaven.test.skip=true -Dspotless.skip=true -Dspotless.check.skip=true -Dmaven.javadoc.skip=true" -DautoVersionSubmodules=true -DpushChanges=false -Dusername="${GH_USERNAME}"
```

和上一步演练的命令基本相同，去掉了 `-DdryRun=true` 参数。

- `-DpushChanges=false`:不要将修改后的版本号和 tag 自动提交至 GitHub。

> 注意：如果你遇到来自 git 的类似 **Please tell me who you are.** 错误信息。您可以通过命令 `git config --global user.email "you@example.com"`
> 和 `git config --global user.name "Your Name"` 来配置你的用户名和邮箱如果你遇到一些错误。

将本地文件检查无误后，提交至 github。

```shell
git push -u "${GH_REMOTE}" "${VERSION}"-release
git push "${GH_REMOTE}" --tags
```

<!-- markdown-link-check-disable -->

> 注意 1：因为 Github 不再支持在 HTTPS 协议中使用原生密码在，所以在这一步你应该使用 github token 作为密码。你可以通过 https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/creating-a-personal-access-token
> 了解更多如果创建 token 的信息。
>
> 注意 2：命令完成后，会自动创建 `release.properties` 文件和 `*.Backup` 文件，它们在下面的命令中是需要的，不要删除它们

<!-- markdown-link-check-enable -->

#### 部署发布

```shell
mvn release:perform -Papache-release,release -Darguments="-Dmaven.test.skip=true -Dspotless.skip=true -Dspotless.check.skip=true -Dmaven.javadoc.skip=true -Dmaven.deploy.skip=false" -DautoVersionSubmodules=true -Dusername="${GH_USERNAME}"
```

执行完该命令后，待发布版本会自动上传到 Apache 的临时筹备仓库(staging repository)。你可以通过访问 [apache staging repositories](https://repository.apache.org/#stagingRepositories)
, 然后使用 Apache 的 LDAP 账户登录后，就会看到上传的版本，`Repository` 列的内容即为 `${STAGING.REPOSITORY}`。
点击 `Close` 来告诉 Nexus 这个构建已经完成，只有这样该版本才是可用的。如果电子签名等出现问题，`Close` 会失败，可以通过 `Activity` 查看失败信息。

### SVN

#### 检出 dolphinscheduler 发布目录

我们还需要将 Dolphinscheduler 开发版本目录检出到本地，并且

```shell
SVN_DIR_DEV="${SVN_DIR}/dolphinscheduler/dev"
SVN_DIR_RELEASE="${SVN_DIR}/dolphinscheduler/release"
# 可选，只有当路径不存在时
mkdir -p "${SVN_DIR_DEV}"

# When you first time checkout from this path
svn --username="${A_USERNAME}" co https://dist.apache.org/repos/dist/dev/dolphinscheduler "${SVN_DIR_DEV}"
# Or update when the svn directory exists, and you already checkout
svn --username="${A_USERNAME}" update "${SVN_DIR_DEV}"
```

> 注意：第一次结帐时可能需要几分钟才能同步到镜像，因为它会下载所有文件

#### 将 gpg KEYS 文件拷贝至发布目录（可选）

只有你第一次使用该 KEY 发版时才需要，如果之前已经发过版且 KEY 没有变化则不需要。你需要切换到一个新的目录，因为这步骤需要 checkout 并修改 release
库中的 KEYS 文件

```shell
# Optional, only if the SVN root path not exists.
mkdir -p "${SVN_DIR_RELEASE}"

cd "${SVN_DIR_RELEASE}"
svn --username="${A_USERNAME}" co https://dist.apache.org/repos/dist/release/dolphinscheduler
# Change the placeholder <YOUR-GPG-KEY-ID> to your id
gpg -a --export <YOUR-GPG-KEY-ID> >> KEYS
svn add *
svn --username="${A_USERNAME}" commit -m "new key <YOUR-GPG-KEY-ID> add"
```

> 注意：这个步骤需要一定的时间去 checkout 特别是在你第一次 checkout 的时候，因为这个库比较大，且这个操作需要 checkout 出全部文件

#### 将待发布的内容添加至 SVN 目录

按版本号创建文件夹，将源码包、二进制包、可执行二进制包移动到 SVN 工作目录。

```shell
mkdir -p "${SVN_DIR_DEV}/${VERSION}"

# Add to SVN
cp -f "${SOURCE_CODE_DIR}"/dolphinscheduler-dist/target/*.tar.gz "${SVN_DIR_DEV}/${VERSION}"
cp -f "${SOURCE_CODE_DIR}"/dolphinscheduler-dist/target/*.tar.gz.asc "${SVN_DIR_DEV}/${VERSION}"

# Create sign
cd "${SVN_DIR_DEV}/${VERSION}"
shasum -a 512 apache-dolphinscheduler-"${VERSION}"-src.tar.gz >> apache-dolphinscheduler-"${VERSION}"-src.tar.gz.sha512
shasum -b -a 512 apache-dolphinscheduler-"${VERSION}"-bin.tar.gz >> apache-dolphinscheduler-"${VERSION}"-bin.tar.gz.sha512

# Check sha512
shasum -c apache-dolphinscheduler-"${VERSION}"-src.tar.gz.sha512
shasum -c apache-dolphinscheduler-"${VERSION}"-bin.tar.gz.sha512
# Check gpg signature
gpg --verify apache-dolphinscheduler-"${VERSION}"-src.tar.gz.asc
gpg --verify apache-dolphinscheduler-"${VERSION}"-bin.tar.gz.asc

# Commit to Apache SVN
cd "${SVN_DIR_DEV}"
svn add "${VERSION}"
svn --username="${A_USERNAME}" commit -m "release ${VERSION}"
```

> 注意：当你找不到你的 `asc` 文件时，你必须手动创建 gpg 签名，命令
> `gpg --armor --detach-sign --digest-algo=SHA512 apache-dolphinscheduler-"${VERSION}"-bin.tar.gz` 和
> `gpg --armor --detach-sign --digest-algo=SHA512 apache-dolphinscheduler-"${VERSION}"-src.tar.gz` 将创建它们

将源码包和二进制包添加至 SVN 工作目录。

### 检查发布文件内容

#### 检查源码包的文件内容

解压缩`apache-dolphinscheduler-<VERSION>-src.tar.gz`，进行如下检查:

- 检查源码包是否包含由于包含不必要文件，致使 tarball 过于庞大
- 存在`LICENSE`和`NOTICE`文件
- `NOTICE` 文件中的当前年份
- 只存在文本文件，不存在二进制文件
- 所有文件的开头都有 ASF 许可证
- 能够正确编译，单元测试可以通过 (mvn install)
- 版本内容与 GitHub 上 tag 的内容相符 (diff -r a verify_dir tag_dir)
- 检查是否有多余文件或文件夹，例如空文件夹等

#### 检查二进制包的文件内容

解压缩`apache-dolphinscheduler-<VERSION>-bin.tar.gz`进行如下检查:

- 存在`LICENSE`和`NOTICE`文件
- 所有文本文件开头都有 ASF 许可证
- 检查第三方依赖许可证：
  - 第三方依赖的许可证兼容
  - 所有第三方依赖的许可证都在`LICENSE`文件中声明
  - 依赖许可证的完整版全部在`license`目录
  - 如果依赖的是 Apache 许可证并且存在`NOTICE`文件，那么这些`NOTICE`文件也需要加入到版本的`NOTICE`文件中

## 发起投票

### 更新版本说明

在 GitHub 中通过 [创建新的 release note](https://github.com/apache/dolphinscheduler/releases/new) 创建一个 release note。 这要在
投票邮件开始之前完成，因为我们需要在邮件中使用 release note。你可以在 `tools/release` 目录中运行 `python release.py changelog` 自动创建
changelog.([使用方式](https://github.com/apache/dolphinscheduler/blob/dev/tools/release/README.md))

> 备注： 如果你更加倾向于手动创建 changelog，你可以通过命令 `git log --pretty="- %s" <PREVIOUS-RELEASE-SHA>..<CURRENT-RELEASE-SHA> > changelog.md`
> 生成 changelog（部分可以不太准确，需要人为过滤一遍），然后将他们分类并粘贴到 GitHub 的 release note 中

### 投票阶段

DolphinScheduler 社区投票，发起投票邮件到`dev@dolphinscheduler.apache.org`。PMC 需要先按照文档检查版本的正确性，然后再进行投票。 经过
至少 72 小时并统计到至少 3 个`+1 并且没有-1 PMC member`票后，即可进入下一阶段。

宣布投票结果,发起投票结果邮件到`dev@dolphinscheduler.apache.org`。

### 模板

### VOTE 模板

标题：

```txt
[VOTE] Release Apache DolphinScheduler <VERSION>
```

正文：

```txt
Hello DolphinScheduler Community,

This is a call for vote to release Apache DolphinScheduler version <VERSION>

Release notes: https://github.com/apache/dolphinscheduler/releases/tag/<VERSION>

The release candidates: https://dist.apache.org/repos/dist/dev/dolphinscheduler/<VERSION>/

Maven 2 staging repository: https://repository.apache.org/content/repositories/<STAGING.REPOSITORY>/org/apache/dolphinscheduler/

Git tag for the release: https://github.com/apache/dolphinscheduler/tree/<VERSION>

Release Commit ID: https://github.com/apache/dolphinscheduler/commit/<SHA-VALUE>

Keys to verify the Release Candidate: https://downloads.apache.org/dolphinscheduler/KEYS

Look at here for how to verify this release candidate: https://dolphinscheduler.apache.org/zh-cn/docs/3.1.2/contribute/release/release

The vote will be open for at least 72 hours or until necessary number of votes are reached.

Please vote accordingly:

[ ] +1 approve
[ ] +0 no opinion
[ ] -1 disapprove with the reason

Checklist for reference:

[ ] Download links are valid.
[ ] Checksums and PGP signatures are valid.
[ ] Source code artifacts have correct names matching the current release.
[ ] LICENSE and NOTICE files are correct for each DolphinScheduler repo.
[ ] All files have license headers if necessary.
[ ] No compiled archives bundled in source archive.
```

#### RESULT 模版

Title：

```txt
[RESULT][VOTE] Release Apache DolphinScheduler <VERSION>
```

```txt
The vote to release Apache DolphinScheduler <VERSION> has passed.Here is the vote result,

4 PMC member +1 votes:

xxx
xxx
xxx
xxx

1 community +1 vote:
xxx

Thanks everyone for taking time to check this release and help us.
```

## Announce

### 移动发布包

```shell
# move to release directory
svn mv -m "release ${VERSION}" https://dist.apache.org/repos/dist/dev/dolphinscheduler/"${VERSION}" https://dist.apache.org/repos/dist/release/dolphinscheduler/

# remove old release directory
svn delete -m "remove old release" https://dist.apache.org/repos/dist/release/dolphinscheduler/<PREVIOUS-RELEASE-VERSION>

```

在 [apache staging repositories](https://repository.apache.org/#stagingRepositories) 仓库找到 DolphinScheduler 并点击`Release`

### 更新文档

官网应该在您发送通知邮件之前完成更新，本节将告诉您如何更改网站。假设发版的版本是 `<VERSION>`，需要进行以下更新（注意，当修改 pull requests 被 merge 后就会生效）:

- **apache/dolphinscheduler-website** 仓库：
  - `config/download.json`: 增加 `<VERSION>` 版本发布包的下载
  - `scripts/conf.sh`: 在变量 `DEV_RELEASE_DOCS_VERSIONS` 中增加版本为 `<VERSION>` 的新键值对
- **apache/dolphinscheduler** 仓库 (dev 分支)：
  - `docs/configs/site.js`:
    - `docsLatest`: 更新为 `<VERSION>`
    - `docs0`: 两处 `en-us/zh-cn` 的 `text` 更新为 `latest(<VERSION>)`
  - `docs/configs/index.md.jsx`: 增加 `'<VERSION>': docsxyzConfig,` 以及新的 `import`
  - `docs/docs/en/history-versions.md` 和 `docs/docs/zh/history-versions.md`: 增加新的发版版本 `<VERSION>` 的链接
  - `.github/ISSUE_TEMPLATE/bug-report.yml`: DolphinScheduler 在 GitHub bug report 的 issue 中有版本选择，当有新的版本发版后，需要更新
    [bug-report](https://github.com/apache/dolphinscheduler/blob/dev/.github/ISSUE_TEMPLATE/bug-report.yml) 中的 **Version** 部分。

### 发布 Docker Image

我们有一个 [工作流](../../../../.github/workflows/publish-docker.yaml) 来自动发布 Docker 镜像，
以及一个 [工作流](../../../../.github/workflows/publish-helm-chart.yaml) 来自动发布 Helm Chart 到 Docker Hub。
当你创建了release node后，这两个工作流就会被触发。你需要做的就是观察上述的工作流，
当它们完成后，你可以在本地拉取 Docker 镜像并验证它们是否按预期工作。

### 发送公告邮件通知社区

当完成了上述的发版流程后，需要发送一封公告邮件给社区。你需要将邮件发送到 `dev@dolphinscheduler.apache.org` 并抄送到 `announce@apache.org`，注意**邮件格式需要使用纯文本格式**。

通知邮件模板如下：

标题：

```txt
[ANNOUNCE] Release Apache DolphinScheduler <VERSION>
```

正文：

```txt
Hi all,

We are glad to announce the release of Apache DolphinScheduler <VERSION>. Once again I would like to express my thanks to your help.

Dolphin Scheduler is a distributed and easy-to-extend visual workflow scheduler system,
dedicated to solving the complex task dependencies in data processing, making the scheduler system out of the box for data processing.


Download Links: https://dolphinscheduler.apache.org/zh-cn/download

Release Notes: https://github.com/apache/dolphinscheduler/releases/tag/<VERSION>

Website: https://dolphinscheduler.apache.org/

DolphinScheduler Resources:
- Issue: https://github.com/apache/dolphinscheduler/issues/
- Mailing list: dev@dolphinscheduler.apache.org
- Documents: https://dolphinscheduler.apache.org/zh-cn/docs/<VERSION>/about/introduction
```

## 删除prepare分支

```shell
cd "${SOURCE_CODE_DIR}"
git push --delete "${GH_REMOTE}" "${VERSION}-prepare"
```

## News

一切就绪后，应该写一篇文章发布到社区，它应该包括：

- 版本、功能添加、错误修复或两者的主要目的是什么
- 主要新功能及使用方法，最好有图片或 gif
- 主要错误修复和与之前版本不同的地方，最好有图片或 gif
- 自上一版本以来的所有贡献者

## 获取全部的贡献者

当您想要发布新版本的新闻或公告时，您可能需要当前版本的所有贡献者，您可以在 `tools/release` 中使用命令 `python release.py contributor` 自动生成贡献者 Github id。


---

## faq.md

<!-- markdown-link-check-disable -->

## Q：项目的名称是？

A：DolphinScheduler

---

## Q：DolphinScheduler 服务介绍及建议运行内存

A：DolphinScheduler 由 5 个服务组成，MasterServer、WorkerServer、ApiServer、AlertServer、LoggerServer 和 UI。

|            服务             |                              说明                               |
|---------------------------|---------------------------------------------------------------|
| MasterServer              | 主要负责 **DAG** 的切分和任务状态的监控                                      |
| WorkerServer/LoggerServer | 主要负责任务的提交、执行和任务状态的更新。LoggerServer 用于 Rest Api 通过 **RPC** 查看日志 |
| ApiServer                 | 提供 Rest Api 服务，供 UI 进行调用                                      |
| AlertServer               | 提供告警服务                                                        |
| UI                        | 前端页面展示                                                        |

注意：**由于服务比较多，建议单机部署最好是 4 核 16G 以上**

---

## Q：系统支持哪些邮箱？

A：支持绝大多数邮箱，qq、163、126、139、outlook、aliyun 等皆支持。支持 **TLS 和 SSL** 协议，可以在 dolphinscheduler 的 ui 中进行配置：
[如何配置邮箱告警](../zh/guide/alert/email.md)。

---

## Q：常用的系统变量时间参数有哪些，如何使用？

A：请参考[使用手册](https://dolphinscheduler.apache.org/zh-cn/docs/latest/user_doc/guide/parameter/built-in.html) 第 8 小节

---

## Q：pip install kazoo 这个安装报错。是必须安装的吗？

A： 这个是 python 连接 Zookeeper 需要使用到的，用于删除 Zookeeper 中的 master/worker 临时节点信息。所以如果是第一次安装，就可以忽略错误。在 1.3.0 之后，kazoo 不再需要了，我们用程序来代替 kazoo 所做的

---

## Q：怎么指定机器运行任务

A：使用 **管理员** 创建 Worker 分组，在 **流程定义启动** 的时候可**指定 Worker 分组**或者在**任务节点上指定 Worker 分组**。如果不指定，则使用 Default，**Default 默认是使用的集群里所有的 Worker 中随机选取一台来进行任务提交、执行**

---

## Q：任务的优先级

A：我们同时 **支持流程和任务的优先级**。优先级我们有 **HIGHEST、HIGH、MEDIUM、LOW 和 LOWEST** 五种级别。**可以设置不同流程实例之间的优先级，也可以设置同一个流程实例中不同任务实例的优先级**。详细内容请参考任务优先级设计 https://analysys.github.io/easyscheduler_docs_cn/%E7%B3%BB%E7%BB%9F%E6%9E%B6%E6%9E%84%E8%AE%BE%E8%AE%A1.html#%E7%B3%BB%E7%BB%9F%E6%9E%B6%E6%9E%84%E8%AE%BE%E8%AE%A1

---

## Q：dolphinscheduler-grpc 报错

A：在 1.2 及以前版本中，在根目录下执行：mvn -U clean package assembly:assembly -Dmaven.test.skip=true,然后刷新下整个项目就好，1.3 版本中不再使用 GRPC 进行通信了

---

## Q：DolphinScheduler 支持 windows 上运行么

A： 理论上只有 **Worker 是需要在 Linux 上运行的**，其它的服务都是可以在 windows 上正常运行的。但是还是建议最好能在 linux 上部署使用

---

## Q：UI 在 linux 编译 node-sass 提示：Error：EACCESS:permission denied，mkdir xxxx

A：单独安装 **npm install node-sass --unsafe-perm**，之后再 **npm install**

---

## Q：UI 不能正常登陆访问

A： 1，如果是 node 启动的查看 dolphinscheduler-ui 下的 .env 文件里的 API_BASE 配置是否是 Api Server 服务地址

​ 2，如果是 nginx 启动的并且是通过 **install-dolphinscheduler-ui.sh** 安装的，查看

​ **/etc/nginx/conf.d/dolphinscheduler.conf** 中的 proxy_pass 配置是否是 Api Server 服务地址

​ 3，如果以上配置都是正确的，那么请查看 Api Server 服务是否是正常的，

​ curl http://localhost:12345/dolphinscheduler/users/get-user-info 查看 Api Server 日志，

​ 如果提示 cn.dolphinscheduler.api.interceptor.LoginHandlerInterceptor:[76] - session info is null，则证明 Api Server 服务是正常的

​ 4，如果以上都没有问题，需要查看一下 **application.properties** 中的 **server.context-path 和 server.port 配置**是否正确
注意：1.3 版本直接使用 Jetty 进行前端代码的解析，无需再安装配置 nginx 了

---

## Q：流程定义手动启动或调度启动之后，没有流程实例生成

A： 1，首先通过 **jps 查看 MasterServer 服务是否存在**，或者从服务监控直接查看 zk 中是否存在 master 服务

​ 2，如果存在 master 服务，查看 **命令状态统计** 或者 **t_ds_error_command** 中是否增加的新记录，如果增加了，**请查看 message 字段定位启动异常原因**

---

## Q：任务状态一直处于提交成功状态

A： 1，首先通过 **jps 查看 WorkerServer 服务是否存在**，或者从服务监控直接查看 zk 中是否存在 worker 服务

​ 2，如果 **WorkerServer** 服务正常，需要 **查看 MasterServer 是否把 task 任务放到 zk 队列中** ，**需要查看 MasterServer 日志及 zk 队列中是否有任务阻塞**

​ 3，如果以上都没有问题，需要定位是否指定了 Worker 分组，但是 **Worker 分组的机器不是在线状态**

---

## Q：install.sh 中需要注意问题

A： 1，如果替换变量中包含特殊字符，**请用 \ 转移符进行转移**

​ 2，installPath="/data1_1T/dolphinscheduler"，**这个目录不能和当前要一键安装的 install.sh 目录是一样的**

​ 3，deployUser="dolphinscheduler"，**部署用户必须具有 sudo 权限**，因为 worker 是通过 sudo -u 租户 sh xxx.command 进行执行的

​ 4，monitorServerState="false"，服务监控脚本是否启动，默认是不启动服务监控脚本的。**如果启动服务监控脚本，则每 5 分钟定时来监控 master 和 worker 的服务是否 down 机，如果 down 机则会自动重启**

​ 5，hdfsStartupSate="false"，是否开启 HDFS 资源上传功能。默认是不开启的，**如果不开启则资源中心是不能使用的**。如果开启，需要 conf/common/hadoop/hadoop.properties 中配置 resource.hdfs.fs.defaultFS 和 yarn 的相关配置，如果使用 namenode HA，需要将 core-site.xml 和 hdfs-site.xml 复制到 conf 根目录下

​ 注意：**1.0.x 版本是不会自动创建 hdfs 根目录的，需要自行创建，并且需要部署用户有 hdfs 的操作权限**

---

## Q：流程定义和流程实例下线异常

A ： 对于 **1.0.4 以前的版本中**，修改 dolphinscheduler-api cn.dolphinscheduler.api.quartz 包下的代码即可

```
public boolean deleteJob(String jobName, String jobGroupName) {
    lock.writeLock().lock();
    try {
      JobKey jobKey = new JobKey(jobName,jobGroupName);
      if(scheduler.checkExists(jobKey)){
        logger.info("try to delete job, job name: {}, job group name: {},", jobName, jobGroupName);
        return scheduler.deleteJob(jobKey);
      }else {
        return true;
      }

    } catch (SchedulerException e) {
      logger.error(String.format("delete job : %s failed",jobName), e);
    } finally {
      lock.writeLock().unlock();
    }
    return false;
  }
```

---

## Q：HDFS 启动之前创建的租户，能正常使用资源中心吗

A： 不能。因为在未启动 HDFS 创建的租户，不会在 HDFS 中注册租户目录。所以上次资源会报错

## Q：多 Master 和多 Worker 状态下，服务掉了，怎么容错

A： **注意：Master 监控 Master 及 Worker 服务。**

​ 1，如果 Master 服务掉了，其它的 Master 会接管挂掉的 Master 的流程，继续监控 Worker task 状态

​ 2，如果 Worker 服务掉了，Master 会监控到 Worker 服务掉了，如果存在 Yarn 任务，Kill Yarn 任务之后走重试

具体请看容错设计：https://analysys.github.io/easyscheduler_docs_cn/%E7%B3%BB%E7%BB%9F%E6%9E%B6%E6%9E%84%E8%AE%BE%E8%AE%A1.html#%E7%B3%BB%E7%BB%9F%E6%9E%B6%E6%9E%84%E8%AE%BE%E8%AE%A1

---

## Q：对于 Master 和 Worker 一台机器伪分布式下的容错

A ： 1.0.3 版本只实现了 Master 启动流程容错，不走 Worker 容错。也就是说如果 Worker 挂掉的时候，没有 Master 存在。这流程将会出现问题。我们会在 **1.1.0** 版本中增加 Master 和 Worker 启动自容错，修复这个问题。如果想手动修改这个问题，需要针对 **跨重启正在运行流程** **并且已经掉的正在运行的 Worker 任务，需要修改为失败**，**同时跨重启正在运行流程设置为失败状态**。然后从失败节点进行流程恢复即可

---

## Q：定时容易设置成每秒执行

A ： 设置定时的时候需要注意，如果第一位（\* \* \* \* _ ? _）设置成 \* ，则表示每秒执行。**我们将会在 1.1.0 版本中加入显示最近调度的时间列表** ，使用 http://cron.qqe2.com/ 可以在线看近 5 次运行时间

## Q：定时有有效时间范围吗

A：有的，**如果定时的起止时间是同一个时间，那么此定时将是无效的定时**。**如果起止时间的结束时间比当前的时间小，很有可能定时会被自动删除**

## Q：任务依赖有几种实现

A： 1，**DAG** 之间的任务依赖关系，是从 **入度为零** 进行 DAG 切分的

​ 2，有 **任务依赖节点** ，可以实现跨流程的任务或者流程依赖，具体请参考 依赖(DEPENDENT)节点：https://analysys.github.io/easyscheduler_docs_cn/%E7%B3%BB%E7%BB%9F%E4%BD%BF%E7%94%A8%E6%89%8B%E5%86%8C.html#%E4%BB%BB%E5%8A%A1%E8%8A%82%E7%82%B9%E7%B1%BB%E5%9E%8B%E5%92%8C%E5%8F%82%E6%95%B0%E8%AE%BE%E7%BD%AE

## Q：流程定义有几种启动方式

A： 1，在 **流程定义列表**，点击 **启动** 按钮

​ 2，**流程定义列表添加定时器**，调度启动流程定义

​ 3，流程定义 **查看或编辑** DAG 页面，任意 **任务节点右击** 启动流程定义

​ 4，可以对流程定义 DAG 编辑，设置某些任务的运行标志位 **禁止运行**，则在启动流程定义的时候，将该节点的连线将从 DAG 中去掉

## Q：Python 任务设置 Python 版本

A： 只需要修改 `bin/env/dolphinscheduler_env.sh` 中的 PYTHON_LAUNCHER

```
export PYTHON_LAUNCHER=/bin/python
```

注意：这了 **PYTHON_LAUNCHER** ，是 python 命令的绝对路径，而不是单纯的 PYTHON_LAUNCHER，还需要注意的是 export PATH 的时候，需要直接

```
export PATH=$HADOOP_HOME/bin:$SPARK_HOME/bin:$PYTHON_LAUNCHER:$JAVA_HOME/bin:$HIVE_HOME/bin:$PATH
```

## Q：Worker Task 通过 sudo -u 租户 sh xxx.command 会产生子进程，在 kill 的时候，是否会杀掉

A： 我们会在 1.0.4 中增加 kill 任务同时，kill 掉任务产生的各种所有子进程

## Q：DolphinScheduler 中的队列怎么用，用户队列和租户队列是什么意思

A ： DolphinScheduler 中的队列可以在用户或者租户上指定队列，**用户指定的队列优先级是高于租户队列的优先级的。**，例如：对 MR 任务指定队列，是通过 mapreduce.job.queuename 来指定队列的。

注意：MR 在用以上方法指定队列的时候，传递参数请使用如下方式：

```
Configuration conf = new Configuration();
   GenericOptionsParser optionParser = new GenericOptionsParser(conf, args);
   String[] remainingArgs = optionParser.getRemainingArgs();
```

如果是 Spark 任务 --queue 方式指定队列

## Q：Master 或者 Worker 报如下告警

<p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/master_worker_lack_res.png" width="60%" />
 </p>

A ： 修改 conf 下的 master.properties **master.reserved.memory** 的值为更小的值，比如说 0.1 或者

worker.properties **worker.reserved.memory** 的值为更小的值，比如说 0.1

## Q：hive 版本是 1.1.0+cdh5.15.0，SQL hive 任务连接报错

<p align="center">
   <img src="https://analysys.github.io/easyscheduler_docs_cn/images/cdh_hive_error.png" width="60%" />
 </p>

A： 将 hive pom

```
<dependency>
    <groupId>org.apache.hive</groupId>
    <artifactId>hive-jdbc</artifactId>
    <version>2.3.9</version>
</dependency>
```

修改为

```
<dependency>
    <groupId>org.apache.hive</groupId>
    <artifactId>hive-jdbc</artifactId>
    <version>1.1.0</version>
</dependency>
```

---

## Q：如何增加一台工作服务器

A： 1，参考官网[部署文档](https://dolphinscheduler.apache.org/zh-cn/docs/3.1.2/installation/cluster) 1.3 小节，创建部署用户和 hosts 映射

​ 2，参考官网[部署文档](https://dolphinscheduler.apache.org/zh-cn/docs/3.1.2/installation/cluster) 1.4 小节，配置 hosts 映射和 ssh 打通及修改目录权限.
​ 1.4 小节的最后一步是在当前新增机器上执行的，即需要给部署目录部署用户的权限

​ 3，复制正在运行的服务器上的部署目录到新机器的同样的部署目录下

​ 4，到 bin 下，启动 worker server

```
./dolphinscheduler-daemon.sh start worker-server
```

---

## Q：DolphinScheduler 什么时候发布新版本，同时新旧版本区别，以及如何升级，版本号规范

A：1，Apache 项目的发版流程是通过邮件列表完成的。 你可以订阅 DolphinScheduler 的邮件列表，订阅之后如果有发版，你就可以收到邮件。请参照这篇[指引](https://github.com/apache/dolphinscheduler#get-help)来订阅 DolphinScheduler 的邮件列表。

2，当项目发版的时候，会有发版说明告知具体的变更内容，同时也会有从旧版本升级到新版本的升级文档。

3，版本号为 x.y.z, 当 x 增加时代表全新架构的版本。当 y 增加时代表与 y 版本之前的不兼容需要升级脚本或其他人工处理才能升级。当 z 增加代表是 bug 修复，升级完全兼容。无需额外处理。之前有个问题 1.0.2 的升级不兼容 1.0.1 需要升级脚本。

---

## Q：后续任务在前置任务失败情况下仍旧可以执行

A：在启动工作流的时候，你可以设置失败策略：继续还是失败。
![设置任务失败策略](https://user-images.githubusercontent.com/15833811/80368215-ee378080-88be-11ea-9074-01a33d012b23.png)

---

## Q：工作流模板 DAG、工作流实例、工作任务及实例之间是什么关系 工作流模板 DAG、工作流实例、工作任务及实例之间是什么关系，一个 dag 支持最大并发 100，是指产生 100 个工作流实例并发运行吗？一个 dag 中的任务节点，也有并发数的配置，是指任务也可以并发多个线程运行吗？最大数 100 吗？

A：

1.2.1 version

```
   master.properties
   设置 master 节点并发执行的最大工作流数
   master.exec.threads=100

   Control the number of parallel tasks in each workflow
   设置每个工作流可以并发执行的最大任务数
   master.exec.task.number=20

   worker.properties
   设置 worker 节点并发执行的最大任务数
   worker.exec.threads=100
```

---

## Q：工作组管理页面没有展示按钮

<p align="center">
   <img src="https://user-images.githubusercontent.com/39816903/81903776-d8cb9180-95f4-11ea-98cb-94ca1e6a1db5.png" width="60%" />
</p>
A：1.3.0 版本，为了支持 k8s，worker ip 一直变动，因此我们不能在 UI 界面上配置，工作组可以配置在 worker.properties 上配置名称。

---

## Q：为什么不把 mysql 的 jdbc 连接包添加到 docker 镜像里面

A：Mysql jdbc 连接包的许可证和 apache v2 的许可证不兼容，因此它不能被加入到 docker 镜像里面。

---

## Q：当一个任务提交多个 yarn 程序的时候经常失败

<p align="center">
   <img src="https://user-images.githubusercontent.com/16174111/81312485-476e9380-90b9-11ea-9aad-ed009db899b1.png" width="60%" />
</p>
A：这个 Bug 在 dev 分支已修复，并加入到需求/待做列表。

---

## Q：Master 服务和 Worker 服务在运行几天之后停止了

<p align="center">
   <img src="https://user-images.githubusercontent.com/18378986/81293969-c3101680-90a0-11ea-87e5-ac9f0dd53f5e.png" width="60%" />
</p>
A：会话超时时间太短了，只有 0.3 秒，修改 zookeeper.properties 的配置项：

```
zookeeper.session.timeout=60000
zookeeper.connection.timeout=30000
```

---

## Q：使用 docker-compose 默认配置启动，显示 zookeeper 错误

<p align="center">
   <img src="https://user-images.githubusercontent.com/42579056/80374318-13c98780-88c9-11ea-8d5f-53448b957f02.png" width="60%" />
 </p>
A：这个问题在 dev-1.3.0 版本解决了。这个 [pr](https://github.com/apache/dolphinscheduler/pull/2595) 已经解决了这个 bug，主要的改动点：

```
在docker-compose.yml文件中增加zookeeper的环境变量ZOO_4LW_COMMANDS_WHITELIST。
把minLatency,avgLatency and maxLatency的类型从int改成float。
```

---

## Q：界面上显示任务一直运行，结束不了，从日志上看任务实例为空

<p align="center">
   <img src="https://user-images.githubusercontent.com/51871547/80302626-b1478d00-87dd-11ea-97d4-08aa2244a6d0.jpg" width="60%" />
 </p>
<p align="center">
   <img src="https://user-images.githubusercontent.com/51871547/80302626-b1478d00-87dd-11ea-97d4-08aa2244a6d0.jpg" width="60%" />
 </p>
A：这个 [bug](https://github.com/apache/dolphinscheduler/issues/1477)  描述了问题的详情。这个问题在 1.2.1 版本已经被修复了。
对于 1.2.1 以下的版本，这种情况的一些提示：

```
1，清空 zk 下这个路径的任务：/dolphinscheduler/task_queue
2，修改任务状态为失败（int 值 6）
3，运行工作流来从失败中恢复
```

---

## Q：zk 中注册的 master 信息 ip 地址是 127.0.0.1，而不是配置的域名所对应或者解析的 ip 地址，可能导致不能查看任务日志

A：修复 bug：

```
1、confirm hostname
$hostname
hadoop1
2、hostname -i
127.0.0.1 10.3.57.15
3、edit /etc/hosts,delete hadoop1 from 127.0.0.1 record
$cat /etc/hosts
127.0.0.1 localhost
10.3.57.15 ds1 hadoop1
4、hostname -i
10.3.57.15
```

hostname 命令返回服务器主机名，hostname -i 返回的是服务器主机名在 /etc/hosts 中所有匹配的 ip 地址。所以我把 /etc/hosts 中 127.0.0.1 中的主机名删掉，只保留内网 ip 的解析就可以了，没必要把 127.0.0.1 整条注释掉, 只要 hostname 命令返回值在 /etc/hosts 中对应的内网 ip 正确就可以，ds 程序取了第一个值，我理解上 ds 程序不应该用 hostname -i 取值这样有点问题，因为好多公司服务器的主机名都是运维配置的，感觉还是直接取配置文件的域名解析的返回 ip 更准确，或者 znode 中存域名信息而不是 /etc/hosts。

---

## Q：调度系统设置了一个秒级的任务，导致系统挂掉

A：调度系统不支持秒级任务。

---

## Q：编译前后端代码 (dolphinscheduler-ui) 报错不能下载"https://github.com/sass/node-sass/releases/download/v4.13.1/darwin-x64-72_binding.node"

A：1，cd dolphinscheduler-ui 然后删除 node_modules 目录

```
sudo rm -rf node_modules
```

​ 2，通过 npmmirror.com 下载 node-sass

```
sudo npm uninstall node-sass
sudo npm i node-sass --sass_binary_site=https://npmmirror.com/mirrors/node-sass/
```

3，如果步骤 2 报错，请重新构建 node-saas [参考链接](https://github.com/apache/dolphinscheduler/blob/dev/docs/docs/zh/contribute/frontend-development.md)

```
sudo npm rebuild node-sass
```

当问题解决之后，如果你不想每次编译都下载这个 node，你可以设置系统环境变量：SASS_BINARY_PATH= /xxx/xxx/xxx/xxx.node。

---

## Q：当使用 mysql 作为 ds 数据库需要如何配置

A：1，修改项目根目录 maven 配置文件，移除 scope 的 test 属性，这样 mysql 的包就可以在其它阶段被加载

```
<dependency>
	<groupId>mysql</groupId>
	<artifactId>mysql-connector-java</artifactId>
	<version>${mysql.connector.version}</version>
	<scope>test<scope>
</dependency>
```

​ 2，修改 application-dao.properties 和 quzrtz.properties 来使用 mysql 驱动
默认驱动是 postgres 主要由于许可证原因。

---

## Q：shell 任务是如何运行的

A：1，被执行的服务器在哪里配置，以及实际执行的服务器是哪台? 要指定在某个 worker 上去执行，可以在 worker 分组中配置，固定 IP，这样就可以把路径写死。如果配置的 worker 分组有多个 worker，实际执行的服务器由调度决定的，具有随机性。

​ 2，如果是服务器上某个路径的一个 shell 文件，怎么指向这个路径？服务器上某个路径下的 shell 文件，涉及到权限问题，不建议这么做。建议你可以使用资源中心的存储功能，然后在 shell 编辑器里面使用资源引用就可以，系统会帮助你把脚本下载到执行目录下。如果以 hdfs 作为资源中心，在执行的时候，调度器会把依赖的 jar 包，文件等资源拉到 worker 的执行目录上，我这边是 /tmp/escheduler/exec/process，该配置可以在 install.sh 中进行指定。

3，以哪个用户来执行任务？执行任务的时候，调度器会采用 sudo -u 租户的方式去执行，租户是一个 linux 用户。

---

## Q：生产环境部署方式有推荐的最佳实践吗

A：1，如果没有很多任务要运行，出于稳定性考虑我们建议使用 3 个节点，并且最好把 Master/Worker/Api 服务部署在不同的节点。如果你只有一个节点，当然只能把所有的服务部署在同一个节点！通常来说，需要多少节点取决于你的业务，海豚调度系统本身不需要很多的资源。充分测试之后，你们将找到使用较少节点的合适的部署方式。

---

## Q：DEPENDENT 节点

A：1，DEPENDENT 节点实际是没有执行体的，是专门用来配置数据周期依赖逻辑，然后再把执行节点挂载后面，来实现任务间的周期依赖。

---

## Q：如何改变 Master 服务的启动端口

<p align="center">
   <img src="https://user-images.githubusercontent.com/8263441/62352160-0f3e9100-b53a-11e9-95ba-3ae3dde49c72.png" width="60%" />
 </p>
A：1，修改 application_master.properties 配置文件，例如：server.port=12345。

---

## Q：调度任务不能上线

A：1，我们可以成功创建调度任务，并且表 t_scheduler_schedules 中也成功加入了一条记录，但当我点击上线后，前端页面无反应且会把 t_scheduler_schedules 这张表锁定，我测试过将 t_scheduler_schedules 中的 RELEASE_state 字段手动更新为 1 这样前端会显示为上线状态。DS 版本 1.2+ 表名是 t_ds_schedules，其它版本表名是 t_scheduler_schedules。

---

## Q：请问 swagger ui 的地址是什么

A：1， 3.1.0+ 版本地址是 [http://apiServerIp:apiServerPort/dolphinscheduler/swagger-ui/index.html], 1.2+ 版本地址是：[http://apiServerIp:apiServerPort/dolphinscheduler/swagger-ui/index.html?language=zh_CN&lang=cn]，其它版本是 [http://apiServerIp:apiServerPort/escheduler/swagger-ui/index.html?language=zh_CN&lang=cn]。

---

## Q：前端安装包缺少文件

<p align="center">
   <img src="https://user-images.githubusercontent.com/41460919/61437083-d960b080-a96e-11e9-87f1-297ba3aca5e3.png" width="60%" />
 </p>
 <p align="center">
    <img src="https://user-images.githubusercontent.com/41460919/61437218-1b89f200-a96f-11e9-8e48-3fac47eb2389.png" width="60%" />
  </p>
A： 1，用户修改了 api server 配置文件中的![apiServerContextPath](https://user-images.githubusercontent.com/41460919/61678323-1b09a680-ad35-11e9-9707-3ba68bbc70d6.png)配置项，导致了这个问题，恢复成默认配置之后问题解决。

---

## Q：上传比较大的文件卡住

<p align="center">
   <img src="https://user-images.githubusercontent.com/21357069/58231400-805b0e80-7d69-11e9-8107-7f37b06a95df.png" width="60%" />
 </p>
A：1，编辑 ngnix 配置文件 vi /etc/nginx/nginx.conf，更改上传大小 client_max_body_size 1024m。

​ 2，更新 google chrome 版本到最新版本。

---

## Q：创建 spark 数据源，点击“测试连接”，系统回退回到登入页面

A：1，edit /etc/nginx/conf.d/escheduler.conf

```
proxy_connect_timeout 300s;
proxy_read_timeout 300s;
proxy_send_timeout 300s;
```

---

## Q：工作流依赖

A：1，目前是按照自然天来判断，上月末：判断时间是工作流 A start_time/scheduler_time between '2019-05-31 00:00:00' and '2019-05-31 23:59:59'。上月：是判断上个月从 1 号到月末每天都要有完成的 A 实例。上周： 上周 7 天都要有完成的 A 实例。前两天： 判断昨天和前天，两天都要有完成的 A 实例。

---

## Q：DS 后端接口文档

A：1，http://localhost:8888/dolphinscheduler/swagger-ui/index.html?language=zh_CN&lang=zh。

## dolphinscheduler 在运行过程中，ip 地址获取错误的问题

master 服务、worker 服务在 zookeeper 注册时，会以 ip:port 的形式创建相关信息

如果 ip 地址获取错误，请检查网络信息，如 Linux 系统通过 `ifconfig` 命令查看网络信息，以下图为例：

<p align="center">
  <img src="../../img/network/network_config.png" width="60%" />
</p>

可以使用 dolphinscheduler 提供的三种策略，获取可用 ip：

- default: 优先获取内网网卡获取 ip 地址，其次获取外网网卡获取 ip 地址，在前两项失效情况下，使用第一块可用网卡的地址
- inner: 使用内网网卡获取 ip 地址，如果获取失败抛出异常信息
- outer: 使用外网网卡获取 ip 地址，如果获取失败抛出异常信息

配置方式是在 `common.properties` 中修改相关配置：

```shell
# network IP gets priority, default: inner outer
# dolphin.scheduler.network.priority.strategy=default
```

另外，如果希望从指定的网卡获取 ip 地址，配置方式是在 `common.properties` 中设置配置项 `dolphin.scheduler.network.interface.preferred`。例如，如果希望从网卡 `eth1` 获取 ip 地址，配置方式是：

```shell
dolphin.scheduler.network.interface.preferred=eth1
```

以上配置修改后重启服务生效

如果 ip 地址获取依然错误，请下载 [dolphinscheduler-netutils.jar] 到相应机器，执行以下命令以进一步排障，并反馈给社区开发人员：

```shell
java -jar target/dolphinscheduler-netutils.jar
```

## 配置 sudo 免密，用于解决默认配置 sudo 权限过大或不能申请 root 权限的使用问题

配置 dolphinscheduler OS 账号的 sudo 权限为部分普通用户范围内的一个普通用户管理者，限制指定用户在指定主机上运行某些命令，详细配置请看 sudo 权限管理
例如 sudo 权限管理配置 dolphinscheduler OS 账号只能操作用户 userA,userB,userC 的权限（其中用户 userA,userB,userC 用于多租户向大数据集群提交作业）

```shell
echo 'dolphinscheduler  ALL=(userA,userB,userC)  NOPASSWD: NOPASSWD: ALL' >> /etc/sudoers
sed -i 's/Defaults    requirett/#Defaults    requirett/g' /etc/sudoers
```

---

## Q：Yarn 多集群支持

A：将 Worker 节点分别部署至多个 Yarn 集群，步骤如下（例如 AWS EMR）：

1. 将 Worker 节点部署至 EMR 集群的 Master 节点

2. 将 `conf/common.properties` 中的 `yarn.application.status.address` 修改为当前集群的 Yarn 的信息

3. 通过 `bin/dolphinscheduler-daemon.sh start worker-server` 启动 worker-server

---

## Q：Update process definition error: Duplicate key TaskDefinition

A：在 DS 2.0.4 之前（2.0.0-alpha 之后），可能存在版本切换的重复键问题，导致更新工作流失败；可参考如下 SQL 进行重复数据的删除，以 MySQL 为例：（注意：操作前请务必备份原数据，SQL 来源于 pr [#8408](https://github.com/apache/dolphinscheduler/pull/8408)）

```SQL
DELETE FROM t_ds_process_task_relation_log WHERE id IN
(
 SELECT
     x.id
 FROM
     (
         SELECT
             aa.id
         FROM
             t_ds_process_task_relation_log aa
                 JOIN
             (
                 SELECT
                     a.process_definition_code
                      ,MAX(a.id) as min_id
                      ,a.pre_task_code
                      ,a.pre_task_version
                      ,a.post_task_code
                      ,a.post_task_version
                      ,a.process_definition_version
                      ,COUNT(*) cnt
                 FROM
                     t_ds_process_task_relation_log a
                         JOIN (
                         SELECT
                             code
                         FROM
                             t_ds_process_definition
                         GROUP BY code
                     )b ON b.code = a.process_definition_code
                 WHERE 1=1
                 GROUP BY a.pre_task_code
                        ,a.post_task_code
                        ,a.pre_task_version
                        ,a.post_task_version
                        ,a.process_definition_code
                        ,a.process_definition_version
                 HAVING COUNT(*) > 1
             )bb ON bb.process_definition_code = aa.process_definition_code
                 AND bb.pre_task_code = aa.pre_task_code
                 AND bb.post_task_code = aa.post_task_code
                 AND bb.process_definition_version = aa.process_definition_version
                 AND bb.pre_task_version = aa.pre_task_version
                 AND bb.post_task_version = aa.post_task_version
                 AND bb.min_id != aa.id
     )x
)
;

DELETE FROM t_ds_task_definition_log WHERE id IN
(
   SELECT
       x.id
   FROM
       (
           SELECT
               a.id
           FROM
               t_ds_task_definition_log a
                   JOIN
               (
                   SELECT
                       code
                        ,name
                        ,version
                        ,MAX(id) AS min_id
                   FROM
                       t_ds_task_definition_log
                   GROUP BY code
                          ,name
                          ,version
                   HAVING COUNT(*) > 1
               )b ON b.code = a.code
                   AND b.name = a.name
                   AND b.version = a.version
                   AND b.min_id != a.id
       )x
)
;
```

---

## Q：使用 Postgresql 数据库从 2.0.1 升级至 2.0.5 更新失败

A：在数据库中执行以下 SQL 即可完成修复:

```SQL
update t_ds_version set version='2.0.1';
```

---

## Q：在二进制分发包中找不到 python-gateway-server 文件夹

A：在 3.0.0-alpha 版本之后，Python gateway server 集成到 api server 中，当您启动 api server 后，Python gateway server 将启动。
如果您不想在 api server 启动的时候启动 Python gateway server，您可以修改 api server 中的配置文件 `api-server/conf/application.yaml`
并更改可选项 `python-gateway.enabled` 中的值设置为 `false`。

---

## Q: 缓存执行时怎么判断任务已经存在缓存过的任务，即如何判断一个任务可以使用另外一个任务的运行结果？

A: 对于标识为`缓存执行`的任务, 当任务启动时会生成一个缓存 key, 该 key 由以下字段组合哈希得到：

- 任务定义：任务实例对应的任务定义的 id
- 任务的版本：任务实例对应的任务定义的版本
- 任务输入的参数：包括上游节点和全局参数传入的参数中，被任务定义的参数列表所引用和任务定义中使用`${}`引用的参数
- 环境配置: 环境名称下具体的环境配置内容，具体为安全中心环境管理中的实际配置内容

当缓存标识的任务运行时，会查找数据库中是否用相同缓存 key 的数据，

- 若有则复制该任务实例并进行相应数据的更新
- 若无，则任务照常运行，并在任务完成时将任务实例的数据存入缓存

若不需要缓存时，可以在工作流实例中右键运行清除缓存，则会清除该版本下当前输入的参数的缓存数据。

--- 

## Q：为什么导入一个在线的工作流定义，导入后的工作流定义的定时状态是下线的？

A：因为我们不希望用户直接导入一个`在线`的定时工作流，所以在导出时，系统会将它的状态改为`下线`。
为了遵循这个原则，即使用户自行将要导入的工作流定义中的定时状态改为`在线`，系统也会将状态覆盖为`下线`。

---

我们会持续收集更多的 FAQ。


---

## guide/alert/alert_plugin_user_guide.md

## 如何创建告警插件以及告警组

在 2.0.0 版本中，用户需要创建告警实例，在创建告警实例时，需要选择告警策略，有三个选项，成功发、失败发，以及成功和失败都发。在执行完工作流或任务时，如果触发告警，调用告警实例发送方法会进行逻辑判断，将告警实例与任务状态进行匹配，匹配则执行该告警实例发送逻辑，不匹配则过滤。创建完告警实例后，需要同告警组进行关联，一个告警组可以使用多个告警实例。
告警模块支持场景如下：
<img src="../../../../img/alert/alert_scenarios_zh.png">

使用步骤如下：

首先需要进入到安全中心，选择告警组管理，然后点击左侧的告警实例管理，然后创建一个告警实例，然后选择对应的告警插件，填写相关告警参数。

然后选择告警组管理，创建告警组，选择相应的告警实例即可。

> 可以使用`测试发送`功能来验证配置的告警实例是否正确。

![alert-instance01](../../img/new_ui/dev/alert/alert_instance01.png)
![alert-instance02](../../img/new_ui/dev/alert/alert_instance02.png)
![alert-instance03](../../img/new_ui/dev/alert/alert_instance03.png)
![alert-instance04](../../img/new_ui/dev/alert/alert_instance04.png)


---

## guide/alert/aliyun-voice.md

# 阿里云-语音告警

如果您需要使用到`语音`（阿里云）进行告警，请在告警实例管理里创建告警实例，选择`语音`插件。

## 参数配置

* 被叫电话号码

  > 被叫显示号

* 呼叫显示号码

  > 接收语音通知的号码

* 语音模板

  > 语音通知文件的语音ID

* accessKeyId

  > 您的 AccessKey ID

* accessKeySecret

  > 您的 AccessKey Secret

### 阿里云-语音告警示例

向指定号码发送语音通知文件类型的语音通知。
下图是告警配置的示例:

![enterprise-wechat-app-msg-config](../../img/alert/aliyun-vocie-form-example.png)


---

## guide/alert/dingtalk.md

# 钉钉

如果您需要使用到钉钉进行告警，请在告警实例管理里创建告警实例，选择 DingTalk 插件。钉钉的配置样例如下:

![alert-dingtalk](../../img/new_ui/dev/alert/alert_dingtalk.png)

参数配置

* Webhook

  > 格式如下：https://oapi.dingtalk.com/robot/send?access_token=XXXXXX

* Keyword

  > 安全设置的自定义关键词

* Secret

  > 安全设置的加签

* 消息类型

  > 支持 text 和 markdown 两种类型

自定义机器人发送消息时，可以通过手机号码指定“被@人列表”。在“被@人列表”里面的人员收到该消息时，会有@消息提醒。免打扰会话仍然通知提醒，首屏出现“有人@你”
* @Mobiles

> 被@人的手机号
> * @UserIds
> 被@人的用户userid
> * @All
> 是否@所有人

[钉钉自定义机器人接入开发文档](https://open.dingtalk.com/document/robots/custom-robot-access)


---

## guide/alert/email.md

# Email

如果需要使用`Email`进行告警，请在告警实例管理中创建告警实例，并选择Email插件。
下面显示了 `Email` 配置示例：:
![alert-email](../../img/alert/email-alter-setup1-en.png)
![alert-email](../../img/alert/email-alter-setup2-en.png)
![alert-email](../../img/alert/email-alter-setup3-en.png)


---

## guide/alert/enterprise-webexteams.md

# WebexTeams

如果您需要使用到Webex Teams进行告警，请在告警实例管理里创建告警实例，选择 WebexTeams 插件。
你可以选择机器人私聊通知或聊天室通知。
WebexTeams的配置样例如下:

![enterprise-webexteams-plugin](../../img/alert/enterprise-webexteams-plugin.png)

## 参数配置

* botAccessToken

  > 在创建机器人时，获得的访问令牌

* roomID

  > 接受消息的room ID(只支持一个ID)

* toPersonId

  > 接受消息的用户ID(只支持一个ID)

* toPersonEmail

  > 接受消息的用户邮箱(只支持一个邮箱)

* atSomeoneInRoom

  > 如果消息目的地为room，被@人的用户邮箱，多个邮箱用英文逗号分隔

* destination

  > 消息目的地，一条消息只支持一个目的地

## 创建一个机器人

访问[官网My-Apps](https://developer.webex.com/docs/api/v1/rooms/create-a-room)来创建一个机器人，点击`Create a New APP` 然后选择 `Create a Bot`，填入机器人信息后获取`bot username` 和 `bot ID`以备以下步骤使用。

![enterprise-webexteams-bot-info](../../img/alert/enterprise-webexteams-bot.png)

## 创建一个房间

访问[官网开发者APIs](https://developer.webex.com/docs/api/v1/rooms/create-a-room)来创建一个房间，填入房间名称后获取`id`(room ID) 和 `creatorId`以备以下步骤使用。

![enterprise-webexteams-room-info](../../img/alert/enterprise-webexteams-room.png)

### 邀请机器人到房间

通过机器人的Email(bot username)将机器人添加至房间。

## 发送私聊消息

通过这种方式，你可以通过`用户邮箱`或`用户`对一个用户私聊窗口发送告警，填入`用户` 或 `用户邮箱`(推荐) 和 `访问令牌`并选择`描述` `personEmail` 或 `personId`。
`用户邮箱`是用户注册Email地址。
`用户`我们可以从新建房间返回的`creatorId`中获取。

![enterprise-webexteams-private-message-form](../../img/alert/enterprise-webexteams-private-form.png)

### 私聊告警样例

![enterprise-webexteams-private-message-example](../../img/alert/enterprise-webexteams-private-msg.png)

## 发送群聊消息

通过这种方式，你可以通过`房间`向一个房间发送告警，填入`房间` 和 `访问令牌`并选择`描述` `roomId`。
`房间`我们可以从新建房间API返回的`id`中获取。

![enterprise-webexteams-group-form](../../img/alert/enterprise-webexteams-group-form.png)

### 群聊告警消息样例

![enterprise-webexteams-room-message-example](../../img/alert/enterprise-webexteams-room-msg.png)

[WebexTeams申请机器人文档](https://developer.webex.com/docs/bots)
[WebexTeamsMessage开发文档](https://developer.webex.com/docs/api/v1/messages/create-a-message)


---

## guide/alert/enterprise-wechat.md

# 企业微信

如果您需要使用到企业微信进行告警，请在告警实例管理里创建告警实例，选择 WeChat 插件。企业微信的配置样例如下：

![enterprise-wechat-plugin](../../img/alert/enterprise-wechat-plugin.png)

## 发送类型

其中`send.type`分别对应向企业微信自定义应用发送和向企业微信API创建的群聊发送消息。

### 应用

应用指将告警结果通过企业微信的自定义应用进行通知，支持向特定用户发送消息和对所有人发送消息。目前还不支持部门和标签，欢迎提PR贡献代码。
下图是应用告警配置的示例:

![enterprise-wechat-app-msg-config](../../img/alert/wechat-app-form-example.png)

下图是`应用``MARKDOWN`告警消息的示例:

![enterprise-wechat-app-msg-markdown](../../img/alert/enterprise-wechat-app-msg-md.png)

下图是`应用``TEXT`告警消息的示例:

![enterprise-wechat-app-msg-text](../../img/alert/enterprise-wechat-app-msg.png)

#### 前置

向企业微信应用发送消息之前需要在企业微信中创建自定义应用，请在[应用页面](https://work.weixin.qq.com/wework_admin/frame#apps) 进行创建,获取应用的`AgentId`并将可见范围设为根。

#### 向指定用户发消息

企业微信应用支持向特定用户发送消息和对所有人发送消息，分别为使用`|`分隔多个userId和使用`@all`向所有人发送信息。
获取用户的userId请参考[官方文档](https://developer.work.weixin.qq.com/document/path/95402)根据手机号获取userId。
下图是获取userId接口的示例:

![enterprise-wechat-create-group](../../img/alert/enterprise-wechat-query-userid.png)

#### 参考文档

应用：https://work.weixin.qq.com/api/doc/90000/90135/90236

### 群聊

群聊指将告警结果通过企业微信API创建的群聊进行通知，会向该群聊下的所有人发送消息，不支持向特定用户发送消息。
下图是群聊告警配置的示例:

![enterprise-wechat-group-msg-config](../../img/alert/wechat-group-form-example.png)

下图是`群聊``MARKDOWN`告警消息的示例:

![enterprise-wechat-group-msg-markdown](../../img/alert/enterprise-wechat-group-msg-md.png)

下图是`群聊``TEXT`告警消息的示例:

![enterprise-wechat-group-msg-text](../../img/alert/enterprise-wechat-group-msg.png)

#### 前置

向企业微信群聊发送消息之前需要通过企业微信的API创建群聊，请参考[官方文档](https://developer.work.weixin.qq.com/document/path/90245) 进行创建群聊并获取`chatid`。
其中获取用户的userId请参考[官方文档](https://developer.work.weixin.qq.com/document/path/95402)根据手机号获取userId。
下图是创建新聊天群组和获取userId接口的示例:

![enterprise-wechat-create-group](../../img/alert/enterprise-wechat-create-group.png)

![enterprise-wechat-create-group](../../img/alert/enterprise-wechat-query-userid.png)

#### 参考文档

群聊：https://work.weixin.qq.com/api/doc/90000/90135/90248


---

## guide/alert/feishu.md

# 飞书

如果您需要使用到飞书进行告警，请在告警实例管理里创建告警实例，选择 Feishu 插件。飞书的配置样例如下:

![alert-feishu](../../img/new_ui/dev/alert/alert_feishu.png)

## 参数配置

* Webhook

  > 复制机器人的webhook地址,如下图所示：

  ![alert-feishu-webhook](../../img/new_ui/dev/alert/alert_feishu_webhook.png)

[飞书：如何在群组中使用机器人？](https://www.feishu.cn/hc/zh-CN/articles/360024984973)


---

## guide/alert/http.md

# HTTP告警

如果您需要使用到`Http`（GET或POST）进行告警，请在告警实例管理里创建告警实例，选择`Http`插件。

## 参数配置

|    **参数**    |                     **描述**                     |
|--------------|------------------------------------------------|
| URL          | 访问的`Http`连接URL,需要包含协议、Host、路径，如果是GET方法可以添加参数   |
| 请求方式         | 当前支持`GET`和`POST`以及`PUT`三种请求方式                  |
| 请求头(Headers) | `Http`请求的完整请求头，以JSON为格式(注意不包含Content-Type)，非必填 |
| 请求体(Body)    | Http`请求的完整请求体，以JSON为格式，非必填                     |
| Content-Type | 请求体的`Content-Type`，默认为`application/json`       |

> 告警消息，支持变量`$msg`，可在`URL`,`请求头`,`请求体`中使用，非必填。

### GET Http告警

GET `Http`告警指将告警结果作为参数通过`Http` GET方法进行请求。
下图是GET告警配置的示例:

![http-alert-msg-config](../../img/alert/http-alert-example.png)


---

## guide/alert/script.md

# Script脚本

如果您需要使用到`Shell`脚本进行告警，请在告警实例管理里创建告警实例，选择`Script`插件。`Script`的配置样例如下:

![dingtalk-plugin](../../img/alert/script-plugin.png)

参数配置

* 自定义参数

  > 用户自定义的参数将被传入脚本执行

* 脚本路径

  > 脚本在服务器上的文件位置，只支持.sh后缀的文件

* 脚本类型

  > 支持`Shell`脚本

**_注意：_**
1.请注意脚本的读写权限与执行租户的关系
2.脚本告警会执行对应shell脚本，平台不会校验脚本内容和是否被篡改，需要高度信任该shell脚本，并且信任用户不会滥用此功能


---

## guide/alert/slack.md

# Slack

如果您需要使用到Slack进行告警，请在告警实例管理里创建告警实例，选择 Slack 插件。Slack的配置样例如下:

![alert-slack](../../img/new_ui/dev/alert/alert_slack.png)

## 参数配置

* Webhook

  > 复制APP的`Incoming Webhooks`地址,如下图所示：

  ![alert-slack-webhook](../../img/new_ui/dev/alert/alert_slack_webhook_addr.png)

* 用户名

  > 发送人的昵称（已过时），由于Slack更新原因目前会使用APP名称作为发件人

## 如何获取Webhook地址

请参考官网文章[《Slack：如何通过Incoming Webhooks发送消息？》](https://api.slack.com/messaging/webhooks)进行创建。

### 新建一个Slack APP

打开[Slack官网](https://api.slack.com/apps/new)新建一个APP。

### 激活Incoming Webhooks设置

新建APP后，在APP页面左侧，选择`Feature`栏目下的`Incoming Webhooks`，点击激活`Activate Incoming Webhooks`到`ON`。
![alert-slack-webhook](../../img/new_ui/dev/alert/alert_slack_enable.png)

### 创建一个Incoming Webhook

创建一个新的`Incoming Webhook`，并选择消息的发送分组。
![select-post-group](../../img/new_ui/dev/alert/alert_slack_new.png)

### 获取Incoming Webhooks地址

复制APP的`Incoming Webhooks`地址,如下图所示：
`Incoming Webhooks`的格式为：`https://hooks.slack.com/services/T00000000/B00000000/XXXXXXXXXXXXXXXXXXXXXXXX`

![alert-slack-webhook](../../img/new_ui/dev/alert/alert_slack_webhook_addr.png)

参考：[Slack：如何通过Incoming Webhooks发送消息？](https://api.slack.com/messaging/webhooks)


---

## guide/alert/telegram.md

# Telegram

如果您需要使用 `Telegram` 进行告警，请在告警实例管理模块创建告警实例，选择 `Telegram` 插件。

`Telegram` 的配置样例如下:

![alert-telegram](../../img/new_ui/dev/alert/alert_telegram.png)

参数配置:
* WebHook:

> 使用 Telegram 的机器人，发送消息的 WebHook。
> * botToken
> 创建 Telegram 的机器人，获取的访问令牌。
> * chatId
> 订阅的 Telegram 频道
> * parseMode
> 消息解析类型, 支持: txt、markdown、markdownV2、html
> * EnableProxy
> 开启代理
> * Proxy
> 代理地址
> * Port
> 代理端口
> * User
> 代理鉴权用户
> * Password
> 代理鉴权密码

**注意**：用户配置的 WebHook 需要能够接收和使用与 DolphinScheduler 构造的 HTTP POST 请求 BODY 相同的结构，JSON 结构如下：

```json
{
    "text": "[{\"projectId\":1,\"projectName\":\"p1\",\"owner\":\"admin\",\"processId\":35,\"processDefinitionCode\":4928367293568,\"processName\":\"s11-3-20220324084708668\",\"taskCode\":4928359068928,\"taskName\":\"s1\",\"taskType\":\"SHELL\",\"taskState\":\"FAILURE\",\"taskStartTime\":\"2022-03-24 08:47:08\",\"taskEndTime\":\"2022-03-24 08:47:09\",\"taskHost\":\"192.168.1.103:1234\",\"logPath\":\"\"}]",
    "chat_id": "chat id number"
}
```

[Telegram 如何申请机器人，如何创建频道](https://core.telegram.org/bots)
[Telegram 机器人开发文档](https://core.telegram.org/bots/api)
[Telegram SendMessage 接口文档](https://core.telegram.org/bots/api#sendmessage)


---

## guide/api/healthcheck.md

# 健康检查

## 背景

运行状况检查旨在提供一种独特的方法来检查 Dolphinscheduler 服务的运行状况。它包括模块的运行状况，例如 DB、缓存、网络等等。

## Endpoint

### API-Server

```shell
curl --request GET 'http://localhost:12345/dolphinscheduler/actuator/health'

{"status":"UP","components":{"db":{"status":"UP","details":{"database":"H2","validationQuery":"isValid()"}}}}
```

### Master-Server

```shell
curl --request GET 'http://localhost:5679/actuator/health'

{"status":"UP","components":{"db":{"status":"UP","details":{"database":"H2","validationQuery":"isValid()"}}}}
```

### Worker-Server

```shell
curl --request GET 'http://localhost:1235/actuator/health'

{"status":"UP","components":{"db":{"status":"UP","details":{"database":"H2","validationQuery":"isValid()"}}}}
```

### Alert-Server

```shell
curl --request GET 'http://localhost:50053/actuator/health'

{"status":"UP","components":{"db":{"status":"UP","details":{"database":"H2","validationQuery":"isValid()"}}}}
```

> 注意: 如果你修改过默认的服务端口和地址，那么你需要修改 IP+Port 为你修改后的值。


---

## guide/api/open-api.md

# API 调用

## 背景

一般都是通过页面来创建项目、流程等，但是与第三方系统集成就需要通过调用 API 来管理项目、流程。

## 操作步骤

### 创建 token

1. 登录调度系统，点击 "安全中心"，再点击左侧的 "令牌管理"，点击 "令牌管理" 创建令牌。

![create-token](../../img/new_ui/dev/security/create-token.png)

2. 选择 "失效时间" (Token 有效期)，选择 "用户" (以指定的用户执行接口操作)，点击 "生成令牌" ，拷贝 Token 字符串，然后点击 "提交" 。

![token-expiration](../../img/new_ui/dev/open-api/token_expiration.png)

### 使用案例

#### 查询项目列表信息

1. 打开 API 文档页面

> 地址：http://{api server ip}:12345/dolphinscheduler/swagger-ui/index.html?language=zh_CN&lang=cn

![api-doc](../../img/new_ui/dev/open-api/api_doc.png)

2. 选一个测试的接口，本次测试选取的接口是：查询所有项目

> projects/list

3. 打开 Postman，填写接口地址，并在 Headers 中填写 Token，发送请求后即可查看结果

   ```
   token: 刚刚生成的 Token
   ```

![api-test](../../img/new_ui/dev/open-api/api_test.png)

#### 创建项目

这里演示如何使用调用 api 来创建对应的项目。

通过查阅 api 文档，在 Postman 的 Headers 中配置 KEY 为 Accept，VALUE 为 application/json 的参数。

![create-project01](../../img/new_ui/dev/open-api/create_project01.png)

然后再 Body 中配置所需的 projectName 和 description 参数。

![create-project02](../../img/new_ui/dev/open-api/create_project02.png)

检查 post 请求结果。

![create-project03](../../img/new_ui/dev/open-api/create_project03.png)

返回 msg 信息为 "success"，说明我们已经成功通过 API 的方式创建了项目。

如果您对创建项目的源码感兴趣，欢迎继续阅读下面内容

### 附:创建项目源码

![api-source01](../../img/new_ui/dev/open-api/api_source01.png)

![api-source02](../../img/new_ui/dev/open-api/api_source02.png)


---

## guide/api/pydolphinscheduler.md

# PyDolphinScheduler

PyDolphinScheduler 是 Apache DolphinScheduler 的 Python API，它允许您通过 Python 代码定义您的工作流，也称为 workflow-as-codes。

更多信息请参考[PyDolphinScheduler](https://dolphinscheduler.apache.org/python/main/)


---

## guide/datasource/athena.md

# AWS Athena 数据源

![AWS Athena](../../img/new_ui/dev/datasource/athena.png)

- 数据源：选择 ATHENA
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- 用户名：设置连接 AWS 的 access key
- 密码：设置连接 AWS 的 secret access key
- AwsRegion: 设置连接 AWS 的区域
- 数据库名：输入连接 ATHENA 的数据库名称
- Jdbc 连接参数：用于 ATHENA 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- JDBC驱动配置参考文档 [athena-connect-with-jdbc](https://docs.amazonaws.cn/athena/latest/ug/connect-with-jdbc.html)
- 驱动下载链接 [SimbaAthenaJDBC-2.0.31.1000/AthenaJDBC42.jar](https://s3.cn-north-1.amazonaws.com.cn/athena-downloads-cn/drivers/JDBC/SimbaAthenaJDBC-2.0.31.1000/AthenaJDBC42.jar)


---

## guide/datasource/azure-sql.md

# AZURE SQL 数据源

## 模式

### SqlPassword

![sqlpassword](../../img/new_ui/dev/datasource/azuresql-server.png)

使用数据库服务器的用户名和密码验证。
- 数据源：选择 AZURE SQL
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 AZURE SQL 的 HOST 或 IP ，例如：xxx.database.windows.net
- 端口：输入连接 AZURE SQL 的端口，默认1433
- 验证模式：输入 AZURE SQL 的连接模式，目前支持：SqlPassword,ActiveDirectoryPassword,ActiveDirectoryMSI,ActiveDirectoryServicePrincipal,accessToken.
- 用户名：设置连接 AZURE SQL 的用户名
- 密码：设置连接 AZURE SQL 的密码
- 数据库名：输入连接 AZURE SQL 的数据库名称
- Jdbc 连接参数：用于 AZURE SQL 连接的参数设置，以 JSON 形式填写
以下仅对差异化属性进行说明。

### ActiveDirectoryPassword

![AD](../../img/new_ui/dev/datasource/azuresql-ad.png)

采用Azure AD账号名和密码验证。
前置条件：设置AD账号为数据库AD管理员。
![admin](../../img/new_ui/dev/datasource/azuresql-ad2.png)
- Azure AD用户名：Azure AD 的账号名，例如：[xx@xx.onmicrosoft.com]
- 密码：Azure AD 的密码

### ActiveDirectoryMSI

![msi](../../img/new_ui/dev/datasource/azuresql-msi.png)
采用AZURE内部服务器验证。
前置条件：先设置内部服务器为数据库AD管理员再进行请求，MSIClientId是服务器的id，是不必要的。
![msi-admin2](../../img/new_ui/dev/datasource/azuresql-msi-admin2.png)
![msi-admin1](../../img/new_ui/dev/datasource/azuresql-msi-admin1.png)
- MSIClientId：选择ActiveDirectoryMSI模式下的内部资源（例如 Azure 虚拟机、应用服务或与 Azure Active Directory 联合的函数应用）的clientId

### ActiveDirectoryServicePrincipal

![principal](../../img/new_ui/dev/datasource/azuresql-principal.png)
采用应用的应用程序(客户端) ID和密钥进行验证。
前置条件：先设置应用为数据库AD管理员,同时给应用设置客户端密码，最终使用两者新建数据源。
![principal2](../../img/new_ui/dev/datasource/azuresql-principal2.png)
- clientId： ActiveDirectoryServicePrincipal模式下，应用的应用程序(客户端) ID
- clientSecret：ActiveDirectoryServicePrincipal模式下，应用的应用程序客户端密码

### accessToken

![principal](../../img/new_ui/dev/datasource/azuresql-token.png)
采用应用的应用程序(客户端) ID和密钥去请求临时token，然后仅采用token进行连接，非jdbc连接。
![principal](../../img/new_ui/dev/datasource/azuresql-endpoints.png)
- clientId： accessToken模式下，应用的应用程序(客户端) ID
- clientSecret：accessToken模式下，应用的应用程序客户端密码
- OAuth 2.0 令牌终结点：accessToken模式下，应用的OAuth 2.0 令牌终结点(v2)

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- 驱动下载链接 [mssql-jdbc-11.2.1.jre8](https://repo1.maven.org/maven2/com/microsoft/sqlserver/mssql-jdbc/11.2.1.jre8/mssql-jdbc-11.2.1.jre8.jar)


---

## guide/datasource/dameng.md

# DAMENG数据源

![dameng](../../img/new_ui/dev/datasource/dameng.png)

- 数据源：选择 DAMENG
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 DAMENG 的 IP
- 端口：输入连接 DAMENG 的端口
- 用户名：设置连接 DAMENG 的用户名
- 密码：设置连接 DAMENG 的密码
- 数据库名：输入连接 DAMENG 的 schema
- Jdbc 连接参数：用于 DAMENG 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/databend.md

# Databend

![Databend 数据源](../../img/new_ui/dev/datasource/Databend.png)

## 数据源参数

|  **数据源**  |            **描述**             |
|-----------|-------------------------------|
| 数据源       | 选择 DATABEND。                  |
| 数据源名称     | 输入数据源的名称。                     |
| 描述        | 输入数据源的描述。                     |
| IP/主机名    | 输入 DATABEND 服务的 IP 地址。        |
| 端口        | 输入 DATABEND 服务的端口。            |
| 用户名       | 设置 DATABEND 连接的用户名。           |
| 密码        | 设置 DATABEND 连接的密码。            |
| 数据库名称     | 输入 DATABEND 连接的数据库名称。         |
| jdbc 连接参数 | DATABEND 连接的参数设置，以 JSON 格式表示。 |

``jdbc`` 连接参数可参考 [databend-jdbc](https://github.com/databendcloud/databend-jdbc)

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/dolphindb.md

# DOLPHINDB 数据源

![dolphindb](../../img/new_ui/dev/datasource/dolphindb-zh.png)

- 数据源：选择 DOLPHINDB
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 DOLPHINDB 的 IP
- 端口：输入连接 DOLPHINDB 的端口
- 用户名：设置连接 DOLPHINDB 的用户名
- 密码：设置连接 DOLPHINDB 的密码
- JDBC 连接参数：用于 DOLPHINDB 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- JDBC驱动配置参考文档 [DolphinDB JDBC Connector](https://docs.dolphindb.cn/zh/jdbcdoc/jdbc.html)
- 驱动Maven依赖 [com.dolphindb:jdbc:3.00.3.0](https://mvnrepository.com/artifact/com.dolphindb/jdbc/3.00.3.0)


---

## guide/datasource/doris.md

# DORIS 数据源

![DORIS](../../img/new_ui/dev/datasource/doris.png)

- 数据源：选择 DORIS
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 DORIS 的 IP(如有多个IP，请用`,`分隔)
- 端口：输入连接 DORIS 的端口
- 用户名：设置连接 DORIS 的用户名
- 密码：设置连接 DORIS 的密码
- 数据库名：输入连接 DORIS 的数据库名称
- Jdbc 连接参数：用于 DORIS 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- 驱动下载链接，[mysql-connector-j-8.0.33](https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.0.33/mysql-connector-j-8.0.33.jar)


---

## guide/datasource/hana.md

# HANA 数据源

![hana](../../img/new_ui/dev/datasource/hana.png)

- 数据源：选择 HANA
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 HANA 的 IP
- 端口：输入连接 HANA 的端口
- 用户名：设置连接 HANA 的用户名
- 密码：设置连接 HANA 的密码
- 数据库名：输入连接 HANA 的数据库名称
- Jdbc 连接参数：用于 HANA 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/hive.md

# HIVE数据源

## 使用HiveServer2

![hive](../../img/new_ui/dev/datasource/hive.png)

- 数据源：选择 HIVE
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 HIVE 的 IP
- 端口：输入连接 HIVE 的端口
- 用户名：设置连接 HIVE 的用户名
- 密码：设置连接 HIVE 的密码
- 数据库名：输入连接 HIVE 的数据库名称
- Jdbc 连接参数：用于 HIVE 连接的参数设置，以 JSON 形式填写

> 注意：如果您希望在同一个会话中执行多个 HIVE SQL，您可以修改配置文件 `common.properties` 中的配置，设置 `support.hive.oneSession = true`。
> 这对运行 HIVE SQL 前设置环境变量的场景会很有帮助。参数 `support.hive.oneSession` 默认值为 `false`，多条 SQL 将在不同的会话中运行。

## 使用 HiveServer2 HA Zookeeper

![hive-server2](../../img/new_ui/dev/datasource/hiveserver2.png)

注意：如果没有开启 kerberos,请保证参数 `hadoop.security.authentication.startup.state` 值为 `false`,
参数 `java.security.krb5.conf.path` 值为空. 开启了 **kerberos**，则需要在 `common.properties` 配置以下参数

```conf
# whether to startup kerberos
hadoop.security.authentication.startup.state=true

# java.security.krb5.conf path
java.security.krb5.conf.path=/opt/krb5.conf

# login user from keytab username
login.user.keytab.username=hdfs-mycluster@ESZ.COM

# login user from keytab path
login.user.keytab.path=/opt/hdfs.headless.keytab
```

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/kyuubi.md

# KYUUBI数据源

## 使用HiveServer2

![kyuubi](../../img/new_ui/dev/datasource/kyuubi.png)

- 数据源：选择 KYUUBI
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 KYUUBI 的 IP
- 端口：输入连接 KYUUBI 的端口
- 用户名：设置连接 KYUUBI 的用户名
- 密码：设置连接 KYUUBI 的密码
- 数据库名：输入连接 KYUUBI 的数据库名称
- Jdbc 连接参数：用于 KYUUBI 连接的参数设置，以 JSON 形式填写

```Kerberos 验证
如需Kerberos验证，请直接配置相应参数在jdbc连接参数中

clientKeytab: 用户客户端验证的keytab文件路径

clientPrincipal: 用户客户端验证的Kerberos principal

serverPrincipal: 在服务端通过kyuubi.kinit.principal配置的Kerberos principal.
```

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/mysql.md

# MySQL 数据源

![mysql](../../img/new_ui/dev/datasource/mysql.png)

- 数据源：选择 MYSQL
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 MySQL 的 IP
- 端口：输入连接 MySQL 的端口
- 用户名：设置连接 MySQL 的用户名
- 密码：设置连接 MySQL 的密码
- 数据库名：输入连接 MySQL 的数据库名称
- Jdbc 连接参数：用于 MySQL 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- 驱动下载链接，[mysql-connector-j-8.0.33](https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.0.33/mysql-connector-j-8.0.33.jar)


---

## guide/datasource/oceanbase.md

# OceanBase 数据源

![oceanbase](../../img/new_ui/dev/datasource/oceanbase.png)

- 数据源：选择 OCEANBASE
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 OceanBase 的 IP
- 端口：输入连接 OceanBase 的端口
- 用户名：设置连接 OceanBase 的用户名
- 密码：设置连接 OceanBase 的密码
- 数据库名：输入连接 OceanBase 的数据库名称
- 兼容模式：输入连接 OceanBase 的兼容模式
- Jdbc 连接参数：用于 OceanBase 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需要先引入 OceanBase 的 JDBC 驱动 [oceanbase-client](https://mvnrepository.com/artifact/com.oceanbase/oceanbase-client)，请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- OceanBase 数据源的兼容模式可以是 'mysql' 或 'oracle'，如果你只使用 mysql 模式，你也可以选择将 OceanBase 数据源当作 MySQL 数据源来使用，请参考 [MySQL 数据源](mysql.md)


---

## guide/datasource/oracle.md

# Oracle数据源

![oracle-choose-schema](../../img/new_ui/dev/datasource/oracle-choose-schema.png)

- 数据源：选择 ORACLE
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 ORACLE 的 IP
- 端口：输入连接 ORACLE 的端口
- 用户名：设置连接 ORACLE 的用户名
- 密码：设置连接 ORACLE 的密码
- 数据库名：输入连接 ORACLE 的 ServiceName 或 SID
- Jdbc 连接参数：用于 ORACLE 连接的参数设置，以 JSON 形式填写
  - 比如 `{"schema": "abc"}` 指定使用 `username` 用户下的 `abc` 数据库

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/postgresql.md

# POSTGRESQL 数据源

![postgresql](../../img/new_ui/dev/datasource/postgresql.png)

- 数据源：选择 POSTGRESQL
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 POSTGRESQL 的 IP
- 端口：输入连接 POSTGRESQL 的端口
- 用户名：设置连接 POSTGRESQL 的用户名
- 密码：设置连接 POSTGRESQL 的密码
- 数据库名：输入连接 POSTGRESQL 的数据库名称
- Jdbc 连接参数：用于 POSTGRESQL 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/redshift.md

# Amazon Redshift

## 数据源参数

使用数据库服务器的用户名和密码验证。
- 数据源：选择 AZURE Redshift
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 Redshift 的 HOST 或 IP ，例如：cluster-name.xxx.region.redshift.amazonaws.com.cn
- 端口：输入连接 Redshift 的端口，默认5439
- 验证模式：输入 Redshift 的连接模式，目前支持：Password,IAM-accessKey
- 用户名：设置连接 Redshift 的用户名
- 密码：设置连接 Redshift 的密码
- 数据库名：输入连接 Redshift 的数据库名称
- Jdbc 连接参数：用于 Redshift 连接的参数设置，以 JSON 形式填写
- AccessKeyID：IAM-accessKey模式下的access key ID
- SecretAccessKey：IAM-accessKey模式下的secret access key

### 验证: Password

![password](../../img/new_ui/dev/datasource/redshift-password.png)

使用Redshift数据库的用户名和密码验证。

### 验证: IAM-accessKey

![IAM1](../../img/new_ui/dev/datasource/redshift-iam1.png)
![IAM2](../../img/new_ui/dev/datasource/redshift-iam2.png)

使用 cluster ID, AWS Region, port(可选) and IAM信息来登录。

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- 参考更多关于Redshift相关的JDBC文档[校验模式](https://docs.aws.amazon.com/redshift/latest/mgmt/generating-iam-credentials-configure-jdbc-odbc.html)


---

## guide/datasource/snowflake.md

# SNOWFLAKE 数据源

![snowflake](../../img/new_ui/dev/datasource/snowflake.png)

## 数据源参数

- 数据源：选择 SNOWFLAKE 数据源
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 SNOWFLAKE 数据源 的 IP
- 端口：输入连接 SNOWFLAKE 数据源 的端口
- 用户名：设置连接 SNOWFLAKE 数据源 的用户名
- 密码：设置连接 SNOWFLAKE 数据源 的密码
- 数据库名：输入连接 SNOWFLAKE 数据源 的数据库名称
- 数据仓库： 输入数据 SNOWFLAKE 的数据仓库名称
- Jdbc 连接参数：用于 SNOWFLAKE 数据源 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/spark.md

# Spark数据源

![sparksql](../../img/new_ui/dev/datasource/sparksql.png)

- 数据源：选择 Spark
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP/主机名：输入连接Spark的IP
- 端口：输入连接Spark的端口
- 用户名：设置连接Spark的用户名
- 密码：设置连接Spark的密码
- 数据库名：输入连接Spark的数据库名称
- Jdbc连接参数：用于Spark连接的参数设置，以JSON形式填写

注意：如果开启了**kerberos**，则需要填写 **Principal**

<p align="center">
    <img src="../../../../img/sparksql_kerberos.png" width="80%" />
  </p>

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/ssh.md

# SSH 数据源

该数据源用于RemoteShell组件，用于远程执行命令。

![sh](../../img/new_ui/dev/datasource/ssh.png)

- 数据源：选择 SSH
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 SSH 的 IP
- 端口：输入连接 SSH 的端口
- 用户名：设置连接 SSH 的用户名
- 密码：设置连接 SSH 的密码
- 公钥：设置连接 SSH 的公钥

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/starrocks.md

# StarRocks数据源

![starrocks](../../img/new_ui/dev/datasource/starrocks.png)

- 数据源：选择 STARROCKS
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 STARROCKS 的 IP
- 端口：输入连接 STARROCKS 的端口
- 用户名：设置连接 STARROCKS 的用户名
- 密码：设置连接 STARROCKS 的密码
- 数据库名：输入连接 STARROCKS 的数据库名称
- Jdbc 连接参数：用于 STARROCKS 连接的参数设置，以 JSON 形式填写

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。
- 驱动下载链接，[mysql-connector-j-8.0.33](https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.0.33/mysql-connector-j-8.0.33.jar)


---

## guide/datasource/trino.md

# Trino数据源

![trino](../../img/new_ui/dev/datasource/trino.png)

- 数据源：选择 TRINO
- 数据源名称：输入数据源的名称
- 描述：输入数据源的描述
- IP 主机名：输入连接 TRINO 的 IP
- 端口：输入连接 TRINO 的端口
- 用户名：设置连接 TRINO 的用户名
- 密码：设置连接 TRINO 的密码
- 数据库名：输入连接 TRINO 的数据库名称
- Jdbc 连接参数：用于 TRINO 连接的参数设置，以 JSON 形式填写
- 数据源定义: 定义数据源是否为测试数据源或上线数据源

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/datasource/vertica.md

# VERTICA 数据源

![vertica](../../img/new_ui/dev/datasource/vertica.png)

| **参数名称**  |            **参数描述**            |
|-----------|--------------------------------|
| 数据源       | 选择 VERTICA                     |
| 数据源名称     | 输入数据源的名称                       |
| 描述        | 输入数据源的描述                       |
| IP 主机名    | 输入连接 VERTICA 的 IP              |
| 端口        | 输入连接 VERTICA 的端口               |
| 用户名       | 设置连接 VERTICA 的用户名              |
| 密码        | 设置连接 VERTICA 的密码               |
| 数据库名      | 输入连接 VERTICA 的数据库名称            |
| JDBC 连接参数 | 用于 VERTICA 连接的参数设置，以 JSON 形式填写 |

## 是否原生支持

- 否，使用前需请参考 [pseudo-cluster](../installation/pseudo-cluster.md) 中的 "下载插件依赖" 章节激活数据源。


---

## guide/demo.md

# DolphinScheduler 初始化工作流 demo

## 准备工作

### 备份上一版本文件和数据库

为了防止操作错误导致数据丢失，建议初始化工作流 demo 服务之前备份数据，备份方法请结合你数据库的情况来定

### 下载新版本的安装包

在[下载](https://dolphinscheduler.apache.org/zh-cn/download)页面下载最新版本的二进制安装包，并将二进制包放到与当前 dolphinscheduler 服务不一样的路径中，以下服务启动操作都需要在新版本的目录进行。

## 服务启动步骤

### 开启 dolphinscheduler 服务

根据你部署方式开启 dolphinscheduler 的所有服务，如果你是通过 [集群部署](installation/cluster.md) 来部署你的 dolphinscheduler 的话，可以通过 `sh ./script/start-all.sh` 开启全部服务。

### 数据库配置

初始化工作流 demo 服务需要使用 MySQL 或 PostgreSQL 等其他数据库作为其元数据存储数据，因此必须更改一些配置。
请参考[数据源配置](installation/datasource-setting.md) `Standalone 切换元数据库`创建并初始化数据库 ，然后运行 demo 服务启动脚本。

### 租户配置

#### 修改 `dolphinscheduler-tools/resources/application.yaml` 配置内容

```
demo:
  tenant-code: default
  domain-name: localhost
  api-server-port: 5173
```

其中 tenant-code 是默认租户 default ，用户可以根据自己操作系统用户名修改，从而代替手动创建租户操作。api-server-port 是 dolphinscheduler 服务的端口号

然后执行初始化工作流 demo 服务的启动脚本：`sh ./tools/bin/create-demo-processes.sh` 来启动服务。

创建 demo 可以参考[快速上手](start/quick-start.md)


---

## guide/expansion-reduction.md

# DolphinScheduler扩容/缩容 文档

## 1. DolphinScheduler扩容文档

本文扩容是针对现有的DolphinScheduler集群添加新的master或者worker节点的操作说明.

```
注意： 一台物理机上不能存在多个master服务进程或者worker服务进程.
      如果扩容master或者worker节点所在的物理机已经安装了调度的服务,请直接跳到 [1.4.修改配置]. 编辑 ** 所有 ** 节点上的配置文件 `bin/env/install_env.sh`. 新增masters或者workers参数,重启调度集群即可.
```

### 1.1. 基础软件安装(必装项请自行安装)

* [必装] [JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) (1.8+) :  必装，请安装好后在/etc/profile下配置 JAVA_HOME 及 PATH 变量
* [可选] 如果扩容的是worker类型的节点,需要考虑是否要安装外部客户端,比如Hadoop、Hive、Spark 的Client.

```markdown
注意：DolphinScheduler本身不依赖Hadoop、Hive、Spark,仅是会调用他们的Client，用于对应任务的提交。
```

### 1.2. 获取安装包

- 确认现有环境使用的DolphinScheduler是哪个版本,获取对应版本的安装包,如果版本不同,可能存在兼容性的问题.
- 确认其他节点的统一安装目录,本文假设DolphinScheduler统一安装在 /opt/ 目录中,安装全路径为/opt/dolphinscheduler.
- 请下载对应版本的安装包至服务器安装目录,解压并重名为dolphinscheduler存放在/opt目录中.
- 添加数据库依赖包,本文使用Mysql数据库,添加mysql-connector-java驱动包到/opt/dolphinscheduler/lib目录中

```shell
# 创建安装目录,安装目录请不要创建在/root、/home等高权限目录 
mkdir -p /opt
cd /opt
# 解压缩
tar -zxvf apache-dolphinscheduler-<version>-bin.tar.gz -C /opt 
cd /opt
mv apache-dolphinscheduler-<version>-bin  dolphinscheduler
```

```markdown
注意：安装包可以从现有的环境直接复制到扩容的物理机上使用.
```

### 1.3. 创建部署用户

- 在**所有**扩容的机器上创建部署用户，并且一定要配置sudo免密。假如我们计划在ds1,ds2,ds3,ds4这四台扩容机器上部署调度，首先需要在每台机器上都创建部署用户

```shell
# 创建用户需使用root登录，设置部署用户名，请自行修改，后面以dolphinscheduler为例
useradd dolphinscheduler;

# 设置用户密码，请自行修改，后面以dolphinscheduler123为例
echo "dolphinscheduler123" | passwd --stdin dolphinscheduler

# 配置sudo免密
echo 'dolphinscheduler  ALL=(ALL)  NOPASSWD: NOPASSWD: ALL' >> /etc/sudoers
sed -i 's/Defaults    requirett/#Defaults    requirett/g' /etc/sudoers

```

```markdown
注意：
- 因为是以 sudo -u {linux-user} 切换不同linux用户的方式来实现多租户运行作业，所以部署用户需要有 sudo 权限，而且是免密的。
- 如果发现/etc/sudoers文件中有"Default requiretty"这行，也请注释掉
- 如果用到资源上传的话，还需要在`HDFS或者MinIO`上给该部署用户分配读写的权限
```

### 1.4. 修改配置

- 从现有的节点比如Master/Worker节点,直接拷贝conf目录替换掉新增节点中的conf目录.拷贝之后检查一下配置项是否正确.

  ```markdown
  重点检查:
  datasource.properties 中的数据库连接信息. 
  zookeeper.properties 中的连接zk的信息.
  common.properties 中关于资源存储的配置信息(如果设置了hadoop,请检查是否存在core-site.xml和hdfs-site.xml配置文件).
  dolphinscheduler_env.sh 中的环境变量
  ```
- 根据机器配置,修改 conf/env 目录下的 `dolphinscheduler_env.sh` 环境变量(以相关用到的软件都安装在/opt/soft下为例)

  ```shell
      export HADOOP_HOME=/opt/soft/hadoop
      export HADOOP_CONF_DIR=/opt/soft/hadoop/etc/hadoop
      export SPARK_HOME=/opt/soft/spark
      export PYTHON_LAUNCHER=/opt/soft/python/bin/python3
      export JAVA_HOME=/opt/soft/java
      export HIVE_HOME=/opt/soft/hive
      export FLINK_HOME=/opt/soft/flink
      export DATAX_LAUNCHER=/opt/soft/datax/bin/datax.py
      export PATH=$HADOOP_HOME/bin:$SPARK_HOME/bin:$PYTHON_LAUNCHER:$JAVA_HOME/bin:$HIVE_HOME/bin:$PATH:$FLINK_HOME/bin:$DATAX_LAUNCHER:$PATH

      ```

   `注: 这一步非常重要,例如 JAVA_HOME 和 PATH 是必须要配置的，没有用到的可以忽略或者注释掉`


  ```
- 将jdk软链到/usr/bin/java下(仍以 JAVA_HOME=/opt/soft/java 为例)

  ```shell
  sudo ln -s /opt/soft/java/bin/java /usr/bin/java
  ```
- 修改 **所有** 节点上的配置文件 `bin/env/install_env.sh`, 同步修改以下配置.
  * 新增的master节点, 需要修改 ips 和 masters 参数.
  * 新增的worker节点, 需要修改 ips 和  workers 参数.

```shell
#在哪些机器上新增部署DS服务,多个物理机之间用逗号隔开.
ips="ds1,ds2,ds3,ds4"

#ssh端口,默认22
sshPort="22"

#master服务部署在哪台机器上
masters="现有master01,现有master02,ds1,ds2"

#worker服务部署在哪台机器上,并指定此worker属于哪一个worker组,下面示例的default即为组名
workers="现有worker01:default,现有worker02:default,ds3:default,ds4:default"

```

- 如果扩容的是worker节点,需要设置worker分组.请参考安全中心[创建worker分组](security/security.md)

- 在所有的新增节点上，修改目录权限，使得部署用户对dolphinscheduler目录有操作权限

```shell
sudo chown -R dolphinscheduler:dolphinscheduler dolphinscheduler
```

### 1.4. 重启集群&验证

- 重启集群

```shell
停止命令:
bin/stop-all.sh 停止所有服务

bash bin/dolphinscheduler-daemon.sh stop master-server  停止 master 服务
bash bin/dolphinscheduler-daemon.sh stop worker-server  停止 worker 服务
bash bin/dolphinscheduler-daemon.sh stop api-server     停止 api    服务
bash bin/dolphinscheduler-daemon.sh stop alert-server   停止 alert  服务


启动命令:
bin/start-all.sh 启动所有服务

bash bin/dolphinscheduler-daemon.sh start master-server  启动 master 服务
bash bin/dolphinscheduler-daemon.sh start worker-server  启动 worker 服务
bash bin/dolphinscheduler-daemon.sh start api-server     启动 api    服务
bash bin/dolphinscheduler-daemon.sh start alert-server   启动 alert  服务

```

```
注意： 使用stop-all.sh或者stop-all.sh的时候,如果执行该命令的物理机没有配置到所有机器的ssh免登陆的话,会提示输入密码
```

- 脚本完成后，使用`jps`命令查看各个节点服务是否启动(`jps`为`java JDK`自带)

```
MasterServer         ----- master服务
WorkerServer         ----- worker服务
ApiApplicationServer ----- api服务
AlertServer          ----- alert服务
```

启动成功后，可以进行日志查看，日志统一存放于logs文件夹内

```日志路径
logs/
   ├── dolphinscheduler-alert-server.log
   ├── dolphinscheduler-master-server.log
   ├── dolphinscheduler-worker-server.log
   ├── dolphinscheduler-api-server.log
```

如果以上服务都正常启动且调度系统页面正常,在web系统的[监控中心]查看是否有扩容的Master或者Worker服务.如果存在,则扩容完成

-----------------------------------------------------------------------------

## 2. 缩容

缩容是针对现有的DolphinScheduler集群减少master或者worker服务,
缩容一共分两个步骤,执行完以下两步,即可完成缩容操作.

### 2.1 停止缩容节点上的服务

* 如果缩容master节点,要确定要缩容master服务所在的物理机,并在物理机上停止该master服务.
* 如果缩容worker节点,要确定要缩容worker服务所在的物理机,并在物理机上停止worker服务.

```shell
停止命令:
bin/stop-all.sh 停止所有服务

bash bin/dolphinscheduler-daemon.sh stop master-server  停止 master 服务
bash bin/dolphinscheduler-daemon.sh stop worker-server  停止 worker 服务
bash bin/dolphinscheduler-daemon.sh stop api-server     停止 api    服务
bash bin/dolphinscheduler-daemon.sh stop alert-server   停止 alert  服务


启动命令:
bin/start-all.sh 启动所有服务

bash bin/dolphinscheduler-daemon.sh start master-server  启动 master 服务
bash bin/dolphinscheduler-daemon.sh start worker-server  启动 worker 服务
bash bin/dolphinscheduler-daemon.sh start api-server     启动 api    服务
bash bin/dolphinscheduler-daemon.sh start alert-server   启动 alert  服务

```

```
注意： 使用stop-all.sh或者stop-all.sh的时候,如果没有执行该命令的机器没有配置到所有机器的ssh免登陆的话,会提示输入密码
```

- 脚本完成后，使用`jps`命令查看各个节点服务是否成功关闭(`jps`为`java JDK`自带)

```
MasterServer         ----- master服务
WorkerServer         ----- worker服务
ApiApplicationServer ----- api服务
AlertServer          ----- alert服务
```

如果对应的master服务或者worker服务不存在,则代表master/worker服务成功关闭.

### 2.2 修改配置文件

- 修改 **所有** 节点上的配置文件 `bin/env/install_env.sh`, 同步修改以下配置.
  * 缩容master节点, 需要修改 ips 和 masters 参数.
  * 缩容worker节点, 需要修改 ips 和  workers 参数.

```shell
#在哪些机器上部署DS服务，本机选localhost
ips="ds1,ds2,ds3,ds4"

#ssh端口,默认22
sshPort="22"

#master服务部署在哪台机器上
masters="现有master01,现有master02,ds1,ds2"

#worker服务部署在哪台机器上,并指定此worker属于哪一个worker组,下面示例的default即为组名
workers="现有worker01:default,现有worker02:default,ds3:default,ds4:default"

```


---

## guide/homepage.md

# 首页

Apache DolphinScheduler 首页可让您查看用户所有项目的任务实例状态统计、工作流实例状态统计和项目统计。 这是观察整个系统状态以及深入各个进程以检查任务和任务日志的每个状态的最佳方式。

![homepage](../../img/new_ui/dev/homepage/homepage.png)


---

## guide/installation/cluster.md

# 集群部署(Cluster)

集群部署目的是在多台机器部署 DolphinScheduler 服务，用于运行大量任务情况。

如果你是新手，想要体验 DolphinScheduler 的功能，推荐使用[Standalone](standalone.md)方式体检。如果你想体验更完整的功能，或者更大的任务量，推荐使用[伪集群部署](pseudo-cluster.md)。如果你是在生产中使用，推荐使用[集群部署](cluster.md)或者[kubernetes](kubernetes.md)

## 部署步骤

集群部署(Cluster)使用的脚本和配置文件与[伪集群部署](pseudo-cluster.md)中的配置一样，所以所需要的步骤也与伪集群部署大致一样。区别就是伪集群部署针对的是一台机器，而集群部署(Cluster)需要针对多台机器，且两者“修改相关配置”步骤区别较大

### 前置准备工作 && 准备 DolphinScheduler 启动环境

需要将安装包分发至每台集群的每台服务器上，并且需要在每台机器中进行配置执行[伪集群部署](pseudo-cluster.md)中的所有执行项

> **_注意:_** 请确保每台机器的配置文件都是一致的，否则会导致集群无法正常工作
> **_注意:_** 每个服务都是无状态且互相独立的，所以可以在每台机器上部署多个服务，但是需要注意端口冲突问题
> **_注意_**: DS默认使用本地模式的目录 /tmp/dolphinscheduler 作为资源中心, 如果需要修改资源中心目录, 请修改配置文件 conf/common.properties 中 resource 的相关配置项

### 修改相关配置

这个是与[伪集群部署](pseudo-cluster.md)差异较大的一步，请使用 scp 等方式将配置文件分发到各台机器上，然后修改配置文件

## 启动 DolphinScheduler && 登录 DolphinScheduler && 启停服务

[与伪集群部署](pseudo-cluster.md)保持一致


---

## guide/installation/datasource-setting.md

# 数据源配置

## Standalone 切换元数据库

我们这里以 MySQL 为例来说明如何配置外部数据库：

> 如果使用 MySQL 需要手动下载 [mysql-connector-java 驱动][mysql] (8.0.16) 并移动到 DolphinScheduler 的每个模块的 libs 目录下，其中包括 `api-server/libs` 和 `alert-server/libs` 和 `master-server/libs` 和 `worker-server/libs`。

* 首先，参照 `伪分布式/分布式安装初始化数据库` 创建并初始化数据库
* 在你的命令行设定下列环境变量，将 `{address}`, `{user}` 和 `{password}` 改为你数据库的地址, 用户名和密码

```shell
export DATABASE=mysql
export SPRING_PROFILES_ACTIVE=${DATABASE}
export SPRING_DATASOURCE_URL="jdbc:mysql://{address}/dolphinscheduler?useUnicode=true&characterEncoding=UTF-8&useSSL=false"
export SPRING_DATASOURCE_USERNAME={user}
export SPRING_DATASOURCE_PASSWORD={password}
```

* 将mysql-connector-java驱动加到`./standalone-server/libs/standalone-server/`目录下, 下载方法见 [数据源配置](datasource-setting.md) `伪分布式/分布式安装初始化数据库` 一栏
* 启动standalone-server，此时你已经连接上mysql，重启或者停止standalone-server并不会清空您数据库里的数据

## 伪分布式/分布式安装初始化数据库

DolphinScheduler 元数据存储在关系型数据库中，目前支持 PostgreSQL 和 MySQL。下面分别介绍如何使用 MySQL 和 PostgresQL 初始化数据库。

> 如果使用 MySQL 需要手动下载 [mysql-connector-java 驱动][mysql] (8.0.16) 并移动到 DolphinScheduler 的每个模块的 libs 目录下，其中包括 `api-server/libs` 和 `alert-server/libs` 和 `master-server/libs` 和 `worker-server/libs` 和 `tools/libs`。

对于mysql 5.6 / 5.7：

```shell
mysql -uroot -p

mysql> CREATE DATABASE dolphinscheduler DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;

# 修改 {user} 和 {password} 为你希望的用户名和密码
mysql> GRANT ALL PRIVILEGES ON dolphinscheduler.* TO '{user}'@'%' IDENTIFIED BY '{password}';
mysql> GRANT ALL PRIVILEGES ON dolphinscheduler.* TO '{user}'@'localhost' IDENTIFIED BY '{password}';

mysql> flush privileges;
```

对于mysql 8：

```shell
mysql -uroot -p

mysql> CREATE DATABASE dolphinscheduler DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;

# 修改 {user} 和 {password} 为你希望的用户名和密码
mysql> CREATE USER '{user}'@'%' IDENTIFIED BY '{password}';
mysql> GRANT ALL PRIVILEGES ON dolphinscheduler.* TO '{user}'@'%';
mysql> CREATE USER '{user}'@'localhost' IDENTIFIED BY '{password}';
mysql> GRANT ALL PRIVILEGES ON dolphinscheduler.* TO '{user}'@'localhost';
mysql> FLUSH PRIVILEGES;
```

对于 PostgreSQL：

```shell
# 采用命令行工具登陆 PostgreSQL
psql
# 创建数据库
postgres=# CREATE DATABASE dolphinscheduler;
# 修改 {user} 和 {password} 为你希望的用户名和密码
postgres=# CREATE USER {user} PASSWORD {password};
postgres=# ALTER DATABASE dolphinscheduler OWNER TO {user};
# 退出 PostgreSQL
postgres=#\q
# 在终端执行如下命令，向配置文件新增登陆权限，并重载 PostgreSQL 配置，替换 {ip} 为对应的 DS 集群服务器 IP 地址段
echo "host    dolphinscheduler   {user}    {ip}     md5" >> $PGDATA/pg_hba.conf
pg_ctl reload
```

然后设置以下环境变量，将username和password改成你在上一步中设置的用户名{user}和密码{password}

对于 MySQL：

```shell
# for mysql
export DATABASE=${DATABASE:-mysql}
export SPRING_PROFILES_ACTIVE=${DATABASE}
export SPRING_DATASOURCE_URL="jdbc:mysql://127.0.0.1:3306/dolphinscheduler?useUnicode=true&characterEncoding=UTF-8&useSSL=false"
export SPRING_DATASOURCE_USERNAME={user}
export SPRING_DATASOURCE_PASSWORD={password}
```

对于 PostgreSQL：

```shell
# for postgresql
export DATABASE=${DATABASE:-postgresql}
export SPRING_PROFILES_ACTIVE=${DATABASE}
export SPRING_DATASOURCE_URL="jdbc:postgresql://127.0.0.1:5432/dolphinscheduler"
export SPRING_DATASOURCE_USERNAME={user}
export SPRING_DATASOURCE_PASSWORD={password}
```

完成上述步骤后，您已经为 DolphinScheduler 创建一个新数据库，现在你可以通过快速的 Shell 脚本来初始化数据库

```shell
bash tools/bin/upgrade-schema.sh
```

## 数据源中心

数据源中心支持MySQL、POSTGRESQL、HIVE/IMPALA、SPARK、CLICKHOUSE、ORACLE、SQLSERVER等数据源。

- 点击"数据源中心->创建数据源"，根据需求创建不同类型的数据源
- 点击"测试连接"，测试数据源是否可以连接成功（只有当数据源通过连接性测试后才能保存数据源）。

### 使用不兼容 Apache LICENSE V2 许可的数据库

数据源中心里，DolphinScheduler 对部分数据源有原生的支持，但是部分数据源需要用户下载对应的 JDBC 驱动包并放置到正确的位置才能正常使用。
这对用户会增加用户的使用成本，但是我们不得不这么做，因为这部分数据源的 JDBC 驱动和 Apache LICENSE V2 不兼容，所以我们无法在
DolphinScheduler 分发的二进制包中包含他们。这部分数据源主要包括 MySQL，Oracle，SQL Server 等，幸运的是我们为这部分数据源的支持给出了解决方案。

#### 样例

我们以 MySQL 为例，如果你想要使用 MySQL 数据源，你需要先在 [mysql maven 仓库](https://repo1.maven.org/maven2/mysql/mysql-connector-java)
中下载对应版本的 JDBC 驱动，将其移入 `api-server/libs` 以及 `worker-server/libs` 文件夹中，最后重启 `api-server` 和 `worker-server`
服务，即可使用 MySQL 数据源。如果你使用容器启动 DolphinScheduler，同样也是将 JDBC 驱动挂载放到以上两个服务的对应路径下后，重启驱动即可。

> 注意：如果你只是想要在数据源中心使用 MySQL，则对 MySQL JDBC 驱动的版本没有要求，如果你想要将 MySQL 作为 DolphinScheduler 的元数据库，
> 则仅支持 [8.0.16 及以上](https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.16/mysql-connector-java-8.0.16.jar)的版本。

[mysql]: https://downloads.MySQL.com/archives/c-j/


---

## guide/installation/general-setting.md

# 通用配置

## 语言

DolphinScheduler 支持两种内置语言，包括 `English` 和 `Chinese` 。您可以点击顶部控制栏名为 `English` 或 `Chinese` 的按钮切换语言。
当您将语言从一种切换为另一种时，您所有 DolphinScheduler 的页面语言页面将发生变化。

## 主题

DolphinScheduler 支持两种类型的内置主题，包括 `Dark` 和 `Light`。当您想改变主题时，只需单击顶部控制栏在 [语言](#语言) 左侧名为 `Dark`(or `Light`)
的按钮即可。

## 时区

DolphinScheduler 支持时区设置。

服务时区

使用脚本 `bin/dolphinshceduler_daemon.sh`启动服务， 服务的默认时区为UTC， 可以在 `application.yaml` 文件中进行修改，或通过环境变量修改, 如`export SPRING_JACKSON_TIME_ZONE=${SPRING_JACKSON_TIME_ZONE:-Asia/Shanghai}`。<br>
IDEA 启动服务默认时区为本地时区，可以加jvm参数如`-Duser.timezone=UTC`来修改时区。 时区选择详见[List of tz database time zones](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones)

用户时区

用户的默认时区基于您运行 DolphinScheduler 服务的时区。如果你想要切换时区，可以点击 [语言](#语言) 按钮右侧的时区按钮，
然后点击 `请选择时区` 进行时区选择。当切换完成后，所有与时间相关的组件都将更改。


---

## guide/installation/kubernetes.md

# 快速试用 Kubernetes 部署

Kubernetes 部署目的是在 Kubernetes 集群中部署 DolphinScheduler 服务，能调度大量任务，可用于在生产中部署。

如果你是新手，想要体验 DolphinScheduler 的功能，推荐使用[Standalone](standalone.md)方式体检。如果你想体验更完整的功能，或者更大的任务量，推荐使用[伪集群部署](pseudo-cluster.md)。如果你是在生产中使用，推荐使用[集群部署](cluster.md)或者[kubernetes](kubernetes.md)

> **提示**: 您也可以尝试使用[DolphinScheduler K8S Operator](https://github.com/apache/dolphinscheduler-operator)，目前处于 alpha1 阶段

## 先决条件

- [Helm](https://helm.sh/) 3.1.0+
- [Kubernetes](https://kubernetes.io/) 1.12+
- PV 供应(需要基础设施支持)

## 安装 dolphinscheduler

```bash
# 自行选择对应的版本
helm upgrade --install dolphinscheduler --create-namespace --namespace dolphinscheduler oci://registry-1.docker.io/apache/dolphinscheduler-helm --version <version>
```

这些命令以默认配置在 Kubernetes 集群上部署 DolphinScheduler，[附录-配置](#附录-配置)部分列出了可以在安装过程中配置的参数 <!-- markdown-link-check-disable-line -->

> **提示**: 列出所有已发布的版本，使用 `helm list`

**PostgreSQL** (用户 `root`, 密码 `root`, 数据库 `dolphinscheduler`) 和 **ZooKeeper** 服务将会默认启动

## 访问 DolphinScheduler 前端页面

如果 `values.yaml` 文件中的 `ingress.enabled` 被设置为 `true`, 在浏览器中访问 `http://${ingress.host}/dolphinscheduler` 即可

> **提示**: 如果 ingress 访问遇到问题，请联系 Kubernetes 管理员并查看 [Ingress](https://kubernetes.io/docs/concepts/services-networking/ingress/)

否则，当 `api.service.type=ClusterIP` 时，你需要执行 port-forward 端口转发命令：

```bash
$ kubectl port-forward --address 0.0.0.0 svc/dolphinscheduler-api 12345:12345
$ kubectl port-forward --address 0.0.0.0 -n test svc/dolphinscheduler-api 12345:12345 # 使用 test 命名空间
```

> **提示**: 如果出现 `unable to do port forwarding: socat not found` 错误, 需要先安装 `socat`

访问前端页面：http://localhost:12345/dolphinscheduler/ui，如果有需要请修改成对应的 IP 地址

或者当 `api.service.type=NodePort` 时，你需要执行命令：

```bash
NODE_IP=$(kubectl get no -n {{ .Release.Namespace }} -o jsonpath="{.items[0].status.addresses[0].address}")
NODE_PORT=$(kubectl get svc {{ template "dolphinscheduler.fullname" . }}-api -n {{ .Release.Namespace }} -o jsonpath="{.spec.ports[0].nodePort}")
echo http://$NODE_IP:$NODE_PORT/dolphinscheduler
```

然后访问前端页面: http://localhost:12345/dolphinscheduler/ui

默认的用户是`admin`，默认的密码是`dolphinscheduler123`

请参考用户手册章节的[快速上手](../start/quick-start.md)查看如何使用 DolphinScheduler

## 卸载 dolphinscheduler

卸载名为 `dolphinscheduler` 的版本(release)，请执行：

```bash
$ helm uninstall dolphinscheduler
```

该命令将删除与 `dolphinscheduler` 相关的所有 Kubernetes 组件（但 PVC 除外），并删除版本(release)

要删除与 `dolphinscheduler` 相关的 PVC，请执行：

```bash
$ kubectl delete pvc -l app.kubernetes.io/instance=dolphinscheduler
```

> **注意**: 删除 PVC 也会删除所有数据，请谨慎操作！

## [试验性] worker 自动扩缩容

> **警告**: 目前此功能尚在试验阶段，不建议在生产环境使用！

`DolphinScheduler` 使用 [KEDA](https://github.com/kedacore/keda) 对 worker 进行自动扩缩容。但是 `DolphinScheduler` 默认是不启用该功能的。
您需要做下列配置来启用该功能：

首先您需要创建一个单独的命名空间并使用 `helm` 安装 `KEDA`：

```bash
helm repo add kedacore https://kedacore.github.io/charts

helm repo update

kubectl create namespace keda

helm install keda kedacore/keda \
    --namespace keda \
    --version "v2.0.0"
```

其次，您需要将 `values.yaml` 中的 `worker.keda.enabled` 配置设置成 `true`，或者您可以通过以下命令安装 chart：

```bash
helm upgrade --install dolphinscheduler --create-namespace --namespace dolphinscheduler oci://registry-1.docker.io/apache/dolphinscheduler-helm --version <version> --set worker.keda.enabled=true
```

一旦自动扩缩容功能启用，worker的数量将基于任务状态在 `minReplicaCount` 和 `maxReplicaCount` 之间弹性扩缩。
举例来说，当您的 `DolphinScheduler` 实例中没有任务在运行时，将不会有 worker。因此，这个功能会显著节约资源，降低您的使用成本。

自动扩缩容功能目前支持 `DolphinScheduler 官方 helm chart` 中自带的 `postgresql` and `mysql`。
如果您要使用外部的数据库，自动扩缩容功能目前只支持 `mysql` 和 `postgresql` 类型的外部数据库。

如果您在使用自动扩缩容时需要改变 worker `WORKER_EXEC_THREADS` 的值，请直接在 `values.yaml` 中修改 `worker.env.WORKER_EXEC_THREADS` 的值，
而不要通过 `configmap` 来更新。

## 配置

配置文件为 `values.yaml`，[附录-配置](#附录-配置) 表格列出了 DolphinScheduler 的可配置参数及其默认值 <!-- markdown-link-check-disable-line -->

## 支持矩阵

|                             Type                             |  支持  |         备注         |
|--------------------------------------------------------------|------|--------------------|
| Shell                                                        | 是    |                    |
| Python2                                                      | 是    |                    |
| Python3                                                      | 间接支持 | 详见 FAQ             |
| Hadoop2                                                      | 间接支持 | 详见 FAQ             |
| Hadoop3                                                      | 尚未确定 | 尚未测试               |
| Spark-Local(client)                                          | 间接支持 | 详见 FAQ             |
| Spark-YARN(cluster)                                          | 间接支持 | 详见 FAQ             |
| Spark-Standalone(cluster)                                    | 尚不   |                    |
| Spark-Kubernetes(cluster)                                    | 尚不   |                    |
| Flink-Local(local>=1.11)                                     | 尚不   | Generic CLI 模式尚未支持 |
| Flink-YARN(yarn-cluster)                                     | 间接支持 | 详见 FAQ             |
| Flink-YARN(yarn-session/yarn-per-job/yarn-application>=1.11) | 尚不   | Generic CLI 模式尚未支持 |
| Flink-Standalone(default)                                    | 尚不   |                    |
| Flink-Standalone(remote>=1.11)                               | 尚不   | Generic CLI 模式尚未支持 |
| Flink-Kubernetes(default)                                    | 尚不   |                    |
| Flink-Kubernetes(remote>=1.11)                               | 尚不   | Generic CLI 模式尚未支持 |
| Flink-NativeKubernetes(kubernetes-session/application>=1.11) | 尚不   | Generic CLI 模式尚未支持 |
| MapReduce                                                    | 间接支持 | 详见 FAQ             |
| Kerberos                                                     | 间接支持 | 详见 FAQ             |
| HTTP                                                         | 是    |                    |
| DataX                                                        | 间接支持 | 详见 FAQ             |
| Sqoop                                                        | 间接支持 | 详见 FAQ             |
| SQL-MySQL                                                    | 间接支持 | 详见 FAQ             |
| SQL-PostgreSQL                                               | 是    |                    |
| SQL-Hive                                                     | 间接支持 | 详见 FAQ             |
| SQL-Spark                                                    | 间接支持 | 详见 FAQ             |
| SQL-ClickHouse                                               | 间接支持 | 详见 FAQ             |
| SQL-Oracle                                                   | 间接支持 | 详见 FAQ             |
| SQL-SQLServer                                                | 间接支持 | 详见 FAQ             |
| SQL-DB2                                                      | 间接支持 | 详见 FAQ             |

## FAQ

### 如何查看一个 pod 容器的日志？

列出所有 pods (别名 `po`):

```
kubectl get po
kubectl get po -n test # with test namespace
```

查看名为 dolphinscheduler-master-0 的 pod 容器的日志:

```
kubectl logs dolphinscheduler-master-0
kubectl logs -f dolphinscheduler-master-0 # 跟随日志输出
kubectl logs --tail 10 dolphinscheduler-master-0 -n test # 显示倒数10行日志
```

### 如何在 Kubernetes 上扩缩容 api, master 和 worker？

列出所有 deployments (别名 `deploy`):

```
kubectl get deploy
kubectl get deploy -n test # with test namespace
```

扩缩容 api 至 3 个副本:

```
kubectl scale --replicas=3 deploy dolphinscheduler-api
kubectl scale --replicas=3 deploy dolphinscheduler-api -n test # with test namespace
```

列出所有 statefulsets (别名 `sts`):

```
kubectl get sts
kubectl get sts -n test # with test namespace
```

扩缩容 master 至 2 个副本:

```
kubectl scale --replicas=2 sts dolphinscheduler-master
kubectl scale --replicas=2 sts dolphinscheduler-master -n test # with test namespace
```

扩缩容 worker 至 6 个副本:

```
kubectl scale --replicas=6 sts dolphinscheduler-worker
kubectl scale --replicas=6 sts dolphinscheduler-worker -n test # with test namespace
```

### 如何用 MySQL 替代 PostgreSQL 作为 DolphinScheduler 的数据库？

> 由于商业许可证的原因，我们不能直接使用 MySQL 的驱动包.
>
> 如果你要使用 MySQL, 你可以基于官方镜像 `apache/dolphinscheduler-<service>` 进行构建.
>
> 从 3.0.0 版本起，dolphinscheduler 已经微服务化，更改元数据存储需要对把所有的服务都替换为 MySQL 驱动包，包括 dolphinscheduler-tools, dolphinscheduler-master, dolphinscheduler-worker, dolphinscheduler-api, dolphinscheduler-alert-server .

1. 下载 MySQL 驱动包 [mysql-connector-java-8.0.16.jar](https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.16/mysql-connector-java-8.0.16.jar)

2. 创建一个新的 `Dockerfile`，用于添加 MySQL 的驱动包:

```
FROM dolphinscheduler.docker.scarf.sh/apache/dolphinscheduler-<service>:<version>
# 例如
# FROM dolphinscheduler.docker.scarf.sh/apache/dolphinscheduler-tools:<version>

# 注意，如果构建的是dolphinscheduler-tools镜像
# 需要将下面一行修改为COPY mysql-connector-java-8.0.16.jar /opt/dolphinscheduler/tools/libs
# 其他服务保持不变即可
COPY mysql-connector-java-8.0.16.jar /opt/dolphinscheduler/libs
```

3. 构建一个包含 MySQL 驱动包的新镜像:

```
docker build -t apache/dolphinscheduler-<service>:mysql-driver .
```

4. 推送 docker 镜像 `apache/dolphinscheduler-<service>:mysql-driver` 到一个 docker registry 中

5. 修改 `values.yaml` 文件中 image 的 `repository` 字段，并更新 `tag` 为 `mysql-driver`

6. 修改 `values.yaml` 文件中 postgresql 的 `enabled` 为 `false`

7. 修改 `values.yaml` 文件中的 externalDatabase 配置 (尤其修改 `host`, `username` 和 `password`)

```yaml
externalDatabase:
  type: "mysql"
  host: "localhost"
  port: "3306"
  username: "root"
  password: "root"
  database: "dolphinscheduler"
  params: "useUnicode=true&characterEncoding=UTF-8"
```

8. 部署 dolphinscheduler (详见**安装 dolphinscheduler**)

### 如何在数据源中心支持 MySQL 或者 Oracle 数据源？

> 由于商业许可证的原因，我们不能直接使用 MySQL 或者 Oracle 的驱动包.
>
> 如果你要添加 MySQL 或者 Oracle, 你可以基于官方镜像 `apache/dolphinscheduler-<service>` 进行构建.
>
> 需要更改 dolphinscheduler-worker, dolphinscheduler-api 两个服务的镜像.

1. 下载 MySQL 驱动包 [mysql-connector-java-8.0.16.jar](https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.16/mysql-connector-java-8.0.16.jar)
   或者 Oracle 驱动包 [ojdbc8.jar](https://repo1.maven.org/maven2/com/oracle/database/jdbc/ojdbc8/) (例如 `ojdbc8-19.9.0.0.jar`)

2. 创建一个新的 `Dockerfile`，用于添加 MySQL 或者 Oracle 驱动包:

```
FROM dolphinscheduler.docker.scarf.sh/apache/dolphinscheduler-<service>:<version>
# 例如
# FROM dolphinscheduler.docker.scarf.sh/apache/dolphinscheduler-worker:<version>

# 如果你想支持 MySQL 数据源
COPY mysql-connector-java-8.0.16.jar /opt/dolphinscheduler/libs

# 如果你想支持 Oracle 数据源
COPY ojdbc8-19.9.0.0.jar /opt/dolphinscheduler/libs
```

3. 构建一个包含 MySQL 或者 Oracle 驱动包的新镜像:

```
docker build -t apache/dolphinscheduler-<service>:new-driver .
```

4. 推送 docker 镜像 `apache/dolphinscheduler-<service>:new-driver` 到一个 docker registry 中

5. 修改 `values.yaml` 文件中 image 的 `repository` 字段，并更新 `tag` 为 `new-driver`

6. 部署 dolphinscheduler (详见**安装 dolphinscheduler**)

7. 在数据源中心添加一个 MySQL 或者 Oracle 数据源

### 如何支持 Python 2 pip 以及自定义 requirements.txt？

> 只需要更改 dolphinscheduler-worker 服务的镜像.

1. 创建一个新的 `Dockerfile`，用于安装 pip:

```
FROM dolphinscheduler.docker.scarf.sh/apache/dolphinscheduler-worker:<version>
COPY requirements.txt /tmp
RUN apt-get update && \
    apt-get install -y --no-install-recommends python-pip && \
    pip install --no-cache-dir -r /tmp/requirements.txt && \
    rm -rf /var/lib/apt/lists/*
```

这个命令会安装默认的 **pip 18.1**. 如果你想升级 pip, 只需添加一行

```
pip install --no-cache-dir -U pip && \
```

2. 构建一个包含 pip 的新镜像:

```
docker build -t apache/dolphinscheduler-worker:pip .
```

3. 推送 docker 镜像 `apache/dolphinscheduler-worker:pip` 到一个 docker registry 中

4. 修改 `values.yaml` 文件中 image 的 `repository` 字段，并更新 `tag` 为 `pip`

5. 部署 dolphinscheduler (详见**安装 dolphinscheduler**)

6. 在一个新 Python 任务下验证 pip

### 如何支持 Python 3？

> 只需要更改 dolphinscheduler-worker 服务的镜像.

1. 创建一个新的 `Dockerfile`，用于安装 Python 3:

```
FROM dolphinscheduler.docker.scarf.sh/apache/dolphinscheduler-worker:<version>
RUN apt-get update && \
    apt-get install -y --no-install-recommends python3 && \
    rm -rf /var/lib/apt/lists/*
```

这个命令会安装默认的 **Python 3.7.3**. 如果你也想安装 **pip3**, 将 `python3` 替换为 `python3-pip` 即可

```
apt-get install -y --no-install-recommends python3-pip && \
```

2. 构建一个包含 Python 3 的新镜像:

```
docker build -t apache/dolphinscheduler-worker:python3 .
```

3. 推送 docker 镜像 `apache/dolphinscheduler-worker:python3` 到一个 docker registry 中

4. 修改 `values.yaml` 文件中 image 的 `repository` 字段，并更新 `tag` 为 `python3`

5. 修改 `values.yaml` 文件中的 `PYTHON_LAUNCHER` 为 `/usr/bin/python3`

6. 部署 dolphinscheduler (详见**安装 dolphinscheduler**)

7. 在一个新 Python 任务下验证 Python 3

### 如何支持 Hadoop, Spark, Flink, Hive 或 DataX？

以 Spark 2.4.7 为例:

1. 下载 Spark 2.4.7 发布的二进制包 `spark-2.4.7-bin-hadoop2.7.tgz`

2. 确保 `common.sharedStoragePersistence.enabled` 开启

3. 部署 dolphinscheduler (详见**安装 dolphinscheduler**)

4. 复制 Spark 3.1.1 二进制包到 Docker 容器中

```bash
kubectl cp spark-2.4.7-bin-hadoop2.7.tgz dolphinscheduler-worker-0:/opt/soft
kubectl cp -n test spark-2.4.7-bin-hadoop2.7.tgz dolphinscheduler-worker-0:/opt/soft # with test namespace
```

因为存储卷 `sharedStoragePersistence` 被挂载到 `/opt/soft`, 因此 `/opt/soft` 中的所有文件都不会丢失

5. 登录到容器并确保 `SPARK_HOME` 存在

```bash
kubectl exec -it dolphinscheduler-worker-0 bash
kubectl exec -n test -it dolphinscheduler-worker-0 bash # with test namespace
cd /opt/soft
tar zxf spark-2.4.7-bin-hadoop2.7.tgz
rm -f spark-2.4.7-bin-hadoop2.7.tgz
ln -s spark-2.4.7-bin-hadoop2.7 spark2 # or just mv
$SPARK_HOME/bin/spark-submit --version
```

如果一切执行正常，最后一条命令将会打印 Spark 版本信息

6. 在一个 Shell 任务下验证 Spark

```
$SPARK_HOME/bin/spark-submit --class org.apache.spark.examples.SparkPi $SPARK_HOME/examples/jars/spark-examples_2.11-2.4.7.jar
```

检查任务日志是否包含输出 `Pi is roughly 3.146015`

7. 在一个 Spark 任务下验证 Spark

文件 `spark-examples_2.11-2.4.7.jar` 需要先被上传到资源中心，然后创建一个 Spark 任务并设置:

- 主函数的 Class: `org.apache.spark.examples.SparkPi`
- 主程序包: `spark-examples_2.11-2.4.7.jar`
- 部署方式: `local`

同样地, 检查任务日志是否包含输出 `Pi is roughly 3.146015`

8. 验证 Spark on YARN

Spark on YARN (部署方式为 `cluster` 或 `client`) 需要 Hadoop 支持. 类似于 Spark 支持, 支持 Hadoop 的操作几乎和前面的步骤相同

确保 `$HADOOP_HOME` 和 `$HADOOP_CONF_DIR` 存在

### 如何在 Master、Worker 和 Api 服务之间支持共享存储？

例如, Master、Worker 和 Api 服务可能同时使用 Hadoop

1. 修改 `values.yaml` 文件中下面的配置项

```yaml
common:
  sharedStoragePersistence:
    enabled: false
    mountPath: "/opt/soft"
    accessModes:
      - "ReadWriteMany"
    storageClassName: "-"
    storage: "20Gi"
```

`storageClassName` 和 `storage` 需要被修改为实际值

> **注意**: `storageClassName` 必须支持访问模式: `ReadWriteMany`

2. 将 Hadoop 复制到目录 `/opt/soft`

3. 确保 `$HADOOP_HOME` 和 `$HADOOP_CONF_DIR` 正确

### 如何支持本地文件存储而非 HDFS 和 S3？

修改 `values.yaml` 文件中下面的配置项

```yaml
common:
  configmap:
    RESOURCE_STORAGE_TYPE: "HDFS"
    RESOURCE_UPLOAD_PATH: "/dolphinscheduler"
    FS_DEFAULT_FS: "file:///"
  fsFileResourcePersistence:
    enabled: true
    accessModes:
      - "ReadWriteMany"
    storageClassName: "-"
    storage: "20Gi"
```

`storageClassName` 和 `storage` 需要被修改为实际值

> **注意**: `storageClassName` 必须支持访问模式: `ReadWriteMany`

### 如何支持 S3 资源存储，例如 MinIO？

以 MinIO 为例: 修改 `values.yaml` 文件中下面的配置项

```yaml
common:
  configmap:
    RESOURCE_STORAGE_TYPE: "S3"
    ...
```

对于配置其他字段相关细节, 请参考: [资源中心配置详情](../resource/configuration.md)

### 如何单独部署特定组件?

修改 `values.yaml` 文件中的 `api.enabled`, `alert.enabled` `master.enabled` 或 `worker.enabled` 配置项

例如，在一个集群中需要同时将 worker 部署到 CPU 服务器和 GPU 服务器，并且 worker 使用不同的镜像，可以这样做:

```bash
# 安装 master、api-server、alert-server以及其他默认组件，但是不安装 worker
helm upgrade --install dolphinscheduler --create-namespace --namespace dolphinscheduler oci://registry-1.docker.io/apache/dolphinscheduler-helm --version <version> --set worker.enabled=false
# 禁用其他组件的安装，只安装 worker，使用自行建构建的 CPU镜像，通过 nodeselector部署到附带 x86标签的 CPU服务器，使用 zookeeper作为外部注册中心
helm upgrade --install dolphinscheduler-cpu-worker --create-namespace --namespace dolphinscheduler oci://registry-1.docker.io/apache/dolphinscheduler-helm --version <version> \
     --set minio.enabled=false --set postgresql.enabled=false --set zookeeper.enabled=false \
     --set master.enabled=false  --set api.enabled=false --set alert.enabled=false \
     --set worker.enabled=true --set image.tag=latest-cpu --set worker.nodeSelector.cpu="x86" \
     --set externalRegistry.registryPluginName=zookeeper --set externalRegistry.registryServers=dolphinscheduler-zookeeper:2181
# 禁用其他组件的安装，只安装 worker，使用自行建构建的 GPU 镜像，通过 nodeselector部署到附带 a100标签的 gpu服务器，使用zookeeper作为外部注册中心
helm upgrade --install dolphinscheduler-gpu-worker --create-namespace --namespace dolphinscheduler oci://registry-1.docker.io/apache/dolphinscheduler-helm --version <version> \
     --set minio.enabled=false --set postgresql.enabled=false --set zookeeper.enabled=false \
     --set master.enabled=false  --set api.enabled=false --set alert.enabled=false \
     --set worker.enabled=true --set image.tag=latest-gpu --set worker.nodeSelector.gpu="a100" \
     --set externalRegistry.registryPluginName=zookeeper --set externalRegistry.registryServers=dolphinscheduler-zookeeper:2181
```

> **注意**:以上步骤仅供参考，具体操作需要根据实际情况进行调整。
> **注意**: DS默认使用本地模式的目录 /tmp/dolphinscheduler 作为资源中心, 如果需要修改资源中心目录, 请修改配置文件 conf/common.properties 中 resource 的相关配置项

## 附录-配置

参考 [DolphinScheduler Helm Charts](https://github.com/apache/dolphinscheduler/blob/dev/deploy/kubernetes/dolphinscheduler/README.md)


---

## guide/installation/pseudo-cluster.md

# 伪集群部署

伪集群部署目的是在单台机器部署 DolphinScheduler 服务，该模式下 master、worker、api server 都在同一台机器上

如果你是新手，想要体验 DolphinScheduler 的功能，推荐使用[Standalone](standalone.md)方式体检。如果你想体验更完整的功能，或者更大的任务量，推荐使用伪集群部署。如果你是在生产中使用，推荐使用[集群部署](cluster.md)或者[kubernetes](kubernetes.md)

## 前置准备工作

伪分布式部署 DolphinScheduler 需要有外部软件的支持

- JDK：下载[JDK][jdk] (1.8 或者 11)，安装并配置 `JAVA_HOME` 环境变量，并将其下的 `bin` 目录追加到 `PATH` 环境变量中。如果你的环境中已存在，可以跳过这步。
- 二进制包：在[下载页面](https://dolphinscheduler.apache.org/zh-cn/download)下载 DolphinScheduler 二进制包
- 数据库：[PostgreSQL](https://www.postgresql.org/download/) (8.2.15+) 或者 [MySQL](https://dev.mysql.com/downloads/mysql/) (5.7+)，两者任选其一即可，如 MySQL 则需要 JDBC Driver 8.0.33
- 注册中心：当前支持 [ZooKeeper](https://zookeeper.apache.org/releases.html) (3.8.0)，[MYSQL](https://www.mysql.com/)(8.0.33)，[ETCD](https://etcd.io/)
- 进程树分析
  - macOS 安装`pstree`
  - Fedora/Red/Hat/CentOS/Ubuntu/Debian 安装`psmisc`

## 下载插件依赖

从 3.3.0 版本开始，二进制包不再提供插件依赖，需要用户自行下载。插件依赖包下载地址：[插件依赖包](https://repo.maven.apache.org/maven2/org/apache/dolphinscheduler)
你也可以执行以下命令来安装插件依赖:

```shell
bash ./bin/install-plugins.sh 3.3.0
```

通常你并不需要所有的连接器插件，可以通过配置 `conf/plugins_config` 来指定你所需要的插件，例如，你只需要 `dolphinscheduler-task-shell` 插件，那么您可以修改配置文件如下：

```
--task-plugins--
dolphinscheduler-task-shell
--end--
```

> **_注意:_** 插件依赖包通常不包含在二进制包中，如果你在启动服务时遇到 `ClassNotFoundException` 错误，请参考相关插件类型的文档检查是否缺少插件依赖包，例如 `dolphinscheduler-datasource-mysql` 中不包含 `mysql-connector-java.jar`

## 准备 DolphinScheduler 启动环境

> **_注意:_** DolphinScheduler 本身不依赖 Hadoop、Hive、Spark，但如果你运行的任务需要依赖他们，就需要有对应的环境支持

### 配置用户免密及权限

创建部署用户，并且一定要配置 `sudo` 免密。以创建 dolphinscheduler 用户为例

```shell
# 创建用户需使用 root 登录
useradd dolphinscheduler

# 添加密码
echo "dolphinscheduler" | passwd --stdin dolphinscheduler

# 配置 sudo 免密
sed -i '$adolphinscheduler  ALL=(ALL)  NOPASSWD: NOPASSWD: ALL' /etc/sudoers
sed -i 's/Defaults    requiretty/#Defaults    requiretty/g' /etc/sudoers

# 修改目录权限，使得部署用户对二进制包解压后的 apache-dolphinscheduler-*-bin 目录有操作权限
chown -R dolphinscheduler:dolphinscheduler apache-dolphinscheduler-*-bin
chmod -R 755 apache-dolphinscheduler-*-bin
```

> **_注意:_**
>
> - 因为任务执行服务是以 `sudo -u {linux-user} -i` 切换不同 linux 用户的方式来实现多租户运行作业，所以部署用户需要有 sudo 权限，而且是免密的。初学习者不理解的话，完全可以暂时忽略这一点
> - 如果发现 `/etc/sudoers` 文件中有 "Defaults requiretty" 这行，也请注释掉

### 准备 zookeeper

如果使用 Zookeeper 作为注册中心，需要先安装 Zookeeper 并启动。

## 修改相关配置

完成基础环境的准备后，需要根据你的机器环境修改配置文件。配置文件可以在目录 `bin/env/dolphinscheduler_env.sh`，`api-server/conf/application.yaml`，
`master-server/conf/application.yaml`，`worker-server/conf/application.yaml`，`alert-server/conf/application.yaml` 中找到。

### 修改 `dolphinscheduler_env.sh` 文件

文件 `./bin/env/dolphinscheduler_env.sh` 描述了下列配置：

- DolphinScheduler 的数据库配置，详细配置方法见[初始化数据库]
- 一些任务类型外部依赖路径或库文件，如 `JAVA_HOME` 和 `SPARK_HOME`都是在这里定义的
- 默认的注册中心是 mysql
- 服务器相关配置，如缓存类型、时区等

如果您不使用某些任务类型，您可以忽略任务外部依赖项，但您必须根据您的环境更改 `JAVA_HOME`、注册中心和数据库相关配置。

```sh
# JAVA_HOME, will use it to start DolphinScheduler server
export JAVA_HOME=${JAVA_HOME:-/opt/soft/java}

# Database related configuration, set database type, username and password
export DATABASE=${DATABASE:-postgresql}
export SPRING_PROFILES_ACTIVE=${DATABASE}
export SPRING_DATASOURCE_URL="jdbc:postgresql://127.0.0.1:5432/dolphinscheduler"
export SPRING_DATASOURCE_USERNAME={user}
export SPRING_DATASOURCE_PASSWORD={password}

# DolphinScheduler server related configuration
export SPRING_CACHE_TYPE=${SPRING_CACHE_TYPE:-none}
export SPRING_JACKSON_TIME_ZONE=${SPRING_JACKSON_TIME_ZONE:-UTC}

# Registry center configuration, determines the type and link of the registry center
export REGISTRY_TYPE=${REGISTRY_TYPE:-zookeeper}
export REGISTRY_ZOOKEEPER_CONNECT_STRING=${REGISTRY_ZOOKEEPER_CONNECT_STRING:-localhost:2181}

# Tasks related configurations, need to change the configuration if you use the related tasks.
export HADOOP_HOME=${HADOOP_HOME:-/opt/soft/hadoop}
export HADOOP_CONF_DIR=${HADOOP_CONF_DIR:-/opt/soft/hadoop/etc/hadoop}
export SPARK_HOME=${SPARK_HOME:-/opt/soft/spark}
export PYTHON_LAUNCHER=${PYTHON_LAUNCHER:-/opt/soft/python}
export HIVE_HOME=${HIVE_HOME:-/opt/soft/hive}
export FLINK_HOME=${FLINK_HOME:-/opt/soft/flink}
export DATAX_LAUNCHER=${DATAX_LAUNCHER:-/opt/soft/datax/bin/python3}

export PATH=$HADOOP_HOME/bin:$SPARK_HOME/bin:$PYTHON_LAUNCHER:$JAVA_HOME/bin:$HIVE_HOME/bin:$FLINK_HOME/bin:$DATAX_LAUNCHER:$PATH
```

> **_注意:_** 如果您使用的是 MySQL 数据库，需要将 `DATABASE` 设置为 `mysql`，并且修改 `SPRING_DATASOURCE_URL`、`SPRING_DATASOURCE_USERNAME` 和 `SPRING_DATASOURCE_PASSWORD` 为您的数据库配置
>
> **_注意:_** dolphinscheduler_env.sh 文件中的配置会覆盖各个服务的配置文件(application.yaml)中的配置，所以如果您在配置文件中配置了某个参数，
> 而且在 dolphinscheduler_env.sh 文件中也配置了，那么以 dolphinscheduler_env.sh 文件中的配置为准。dolphinscheduler_env.sh 里的配置项格式样例:
> SPRING_DATASOURCE_URL 在 application.yaml 为 spring.datasource.url，以此类推

## 初始化数据库

请参考 [数据源配置](datasource-setting.md) `伪分布式/分布式安装初始化数据库` 创建并初始化数据库

## 启动 DolphinScheduler

部署后的运行日志将存放在 `xxx-server/logs` 文件夹内

```
# 启动 api-server
bash ./bin/dolphinscheduler-daemon.sh start api-server

# 启动 master-server
bash ./bin/dolphinscheduler-daemon.sh start master-server

# 启动 worker-server
bash ./bin/dolphinscheduler-daemon.sh start worker-server

# 启动 alert-server
bash ./bin/dolphinscheduler-daemon.sh start alert-server

```

> **_注意:_** 第一次部署的话，可以通过 bash ./bin/dolphinscheduler-daemon.sh status xxx-server 来进行服务状态查询

## 登录 DolphinScheduler

浏览器访问地址 http://localhost:12345/dolphinscheduler/ui 即可登录系统 UI。默认的用户名和密码是 **admin/dolphinscheduler123**

## 启停服务

```shell
# 查询服务状态
bash ./bin/dolphinscheduler-daemon.sh status xxx-server

# 启停 Master
bash ./bin/dolphinscheduler-daemon.sh stop master-server
bash ./bin/dolphinscheduler-daemon.sh start master-server

# 启停 Worker
bash ./bin/dolphinscheduler-daemon.sh start worker-server
bash ./bin/dolphinscheduler-daemon.sh stop worker-server

# 启停 Api
bash ./bin/dolphinscheduler-daemon.sh start api-server
bash ./bin/dolphinscheduler-daemon.sh stop api-server

# 启停 Alert
bash ./bin/dolphinscheduler-daemon.sh start alert-server
bash ./bin/dolphinscheduler-daemon.sh stop alert-server
```

> **_注意 1:_**: 每个服务在路径 `<service>/conf/dolphinscheduler_env.sh` 中都有 `dolphinscheduler_env.sh` 文件，这是可以为微
> 服务需求提供便利。意味着您可以基于不同的环境变量来启动各个服务，只需要在对应服务中配置 `<service>/conf/dolphinscheduler_env.sh` 然后通过 `<service>/bin/start.sh`
> 命令启动即可。但是如果您使用命令 `/bin/dolphinscheduler-daemon.sh start <service>` 启动服务器，它将会用文件 `bin/env/dolphinscheduler_env.sh`
> 覆盖 `<service>/conf/dolphinscheduler_env.sh` 然后启动服务，目的是为了减少用户修改配置的成本.
>
> **_注意 2:_**：服务用途请具体参见《系统架构设计》小节。Python gateway service 默认与 api-server 一起启动，如果您不想启动 Python gateway service
> 请通过更改 api-server 配置文件 `api-server/conf/application.yaml` 中的 `python-gateway.enabled : false` 来禁用它。
> **_注意 3:_**: DS默认使用本地模式的目录 /tmp/dolphinscheduler 作为资源中心, 如果需要修改资源中心目录, 请修改配置文件 conf/common.properties 中 resource 的相关配置项

[jdk]: https://www.oracle.com/technetwork/java/javase/downloads/index.html
[zookeeper]: https://zookeeper.apache.org/releases.html
[issue]: https://github.com/apache/dolphinscheduler/issues/6597


---

## guide/installation/standalone.md

# Standalone 极速体验版

Standalone 仅适用于 DolphinScheduler 的快速体验.

如果你是新手，想要体验 DolphinScheduler 的功能，推荐使用 Standalone 方式体检。如果你想体验更完整的功能，或者更大的任务量，推荐使用[伪集群部署](pseudo-cluster.md)。如果你是在生产中使用，推荐使用[集群部署](cluster.md)或者[kubernetes](kubernetes.md)

> **_注意:_** Standalone 仅建议 20 个以下工作流使用，因为其采用内存式的 H2 Database, Zookeeper Testing Server，任务过多可能导致不稳定，并且如果重启或者停止 standalone-server 会导致内存中数据库里的数据清空。
> Standalone 支持元数据持久化，但是需要使用外部数据库，如 mysql 或者 postgresql，请看[配置数据库](#配置数据库)

## 前置准备工作

- JDK：下载[JDK][jdk] (1.8 or 11)，安装并配置 `JAVA_HOME` 环境变量，并将其下的 `bin` 目录追加到 `PATH` 环境变量中。如果你的环境中已存在，可以跳过这步。
- 二进制包：在[下载页面](https://dolphinscheduler.apache.org/en-us/download/<version>)下载 DolphinScheduler 二进制包  <!-- markdown-link-check-disable-line -->

## 下载插件依赖

请参考伪集群部署的[下载插件依赖](../installation/pseudo-cluster.md#下载插件依赖)，注意 standalone 最小化运行需要下载插件依赖 `dolphinscheduler-task-shell` 和 `dolphinscheduler-storage-hdfs`

## 配置用户免密及权限

创建部署用户，并且一定要配置 `sudo` 免密。以创建 dolphinscheduler 用户为例

```shell
# 创建用户需使用 root 登录
useradd dolphinscheduler

# 添加密码
echo "dolphinscheduler" | passwd --stdin dolphinscheduler

# 配置 sudo 免密
sed -i '$adolphinscheduler  ALL=(ALL)  NOPASSWD: NOPASSWD: ALL' /etc/sudoers
sed -i 's/Defaults    requiretty/#Defaults    requiretty/g' /etc/sudoers

# 修改目录权限，使得部署用户对二进制包解压后的 apache-dolphinscheduler-*-bin 目录有操作权限
chown -R dolphinscheduler:dolphinscheduler apache-dolphinscheduler-*-bin
chmod -R 755 apache-dolphinscheduler-*-bin
```

> **_注意:_**
>
> - 因为任务执行服务是以 `sudo -u {linux-user} -i` 切换不同 linux 用户的方式来实现多租户运行作业，所以部署用户需要有 sudo 权限，而且是免密的。初学习者不理解的话，完全可以暂时忽略这一点
> - 如果发现 `/etc/sudoers` 文件中有 "Defaults requiretty" 这行，也请注释掉

## 启动 DolphinScheduler Standalone Server

### 解压并启动 DolphinScheduler

二进制压缩包中有 standalone 启动的脚本，解压后即可快速启动。

```shell
# 解压并运行 Standalone Server
tar -xvzf apache-dolphinscheduler-*-bin.tar.gz
chmod -R 755 apache-dolphinscheduler-*-bin
cd apache-dolphinscheduler-*-bin
bash ./bin/dolphinscheduler-daemon.sh start standalone-server
```

### 登录 DolphinScheduler

浏览器访问地址 http://localhost:12345/dolphinscheduler/ui 即可登录系统 UI。默认的用户名和密码是 **admin/dolphinscheduler123**

![登录页面](../../img/new_ui/dev/quick-start/login.png)

## 启停服务

脚本 `./bin/dolphinscheduler-daemon.sh` 除了可以快捷启动 standalone 外，还能停止服务运行，全部命令如下

```shell
# 启动 Standalone Server 服务
bash ./bin/dolphinscheduler-daemon.sh start standalone-server
# 停止 Standalone Server 服务
bash ./bin/dolphinscheduler-daemon.sh stop standalone-server
# 查看 Standalone Server 状态
bash ./bin/dolphinscheduler-daemon.sh status standalone-server
```

> **_注意_**: Python 网关服务默认为关闭状态，如果您想启动 Python 网关服务，
> 请修改 YAML 配置文件，将 `python-gateway.enabled` 设置为 `true`，
> 配置文件路径为 `api-server/conf/application.yaml`

[jdk]: https://www.oracle.com/technetwork/java/javase/downloads/index.html

## 配置数据库

Standalone server 使用 H2 数据库作为其元数据存储数据，这是为了上手简单，用户在启动服务器之前不需要启动数据库。但是如果用户想将元数据库存储在
MySQL 或 PostgreSQL 等其他数据库中，必须更改一些配置。请参考 [数据源配置](datasource-setting.md) `Standalone 切换元数据库` 创建并初始化数据库

> **_注意_**: DS默认使用本地模式的目录 /tmp/dolphinscheduler 作为资源中心, 如果需要修改资源中心目录, 请修改配置文件 conf/common.properties 中 resource 的相关配置项


---

## guide/integration/rainbond.md

# 基于 Rainbond 部署 DolphinScheduler 高可用集群

本文描述通过 [Rainbond](https://www.rainbond.com/) 云原生应用管理平台 一键部署高可用的 DolphinScheduler 集群，这种方式适合给不太了解 Kubernetes、容器化等复杂技术的用户使用，降低了在 Kubernetes 中部署 DolphinScheduler 的门槛。

## 前提条件

* 可用的 Rainbond 云原生应用管理平台，请参阅文档 [Rainbond 快速安装](https://www.rainbond.com/docs/quick-start/quick-install)

## DolphinScheduler 集群一键部署

1. 进入 Rainbond 的**平台管理 -> 应用市场 -> 开源应用商店**中搜索 **dolphinscheduler** 即可找到 DolphinScheduler 应用。

![](../../img/rainbond/appstore-dolphinscheduler.png)

2. 点击 DolphinScheduler 右侧的**安装**进入应用安装页面，填写对应的信息，点击确定即可开始安装，自动跳转至应用视图。

| 选择项  |                      说明                      |
|------|----------------------------------------------|
| 团队名称 | 用户自建的工作空间，以命名空间隔离                            |
| 集群名称 | 选择 DolphinScheduler 被部署到哪一个 K8s 集群           |
| 选择应用 | 选择 DolphinScheduler 被部署到哪一个应用，应用中包含有若干有关联的组件 |
| 应用版本 | 选择 DolphinScheduler 的版本                      |

![](../../img/rainbond/install-dolphinscheduler.png)

3. 等待几分钟后，DolphinScheduler 集群就会安装完成，并运行起来。

![](../../img/rainbond/topology-dolphinscheduler.png)

4. 点击应用内的访问按钮，即可通过 Rainbond 默认提供的域名访问 DolphinScheduler-API 组件，默认的用户密码是 **admin/dolphinscheduler123**。

## API Master Worker 节点伸缩

DolphinScheduler API、Master、Worker 都支持伸缩多个实例，多个实例可以保证整个集群的高可用性。

以 Worker 为例，进入组件内 -> 伸缩，设置实例数量。

![](../../img/rainbond/dolpscheduler-worker.png)

验证 Worker 节点，进入 DolphinScheduler UI -> 监控中心 -> Worker 查看节点信息。

![](../../img/rainbond/monitor-dolphinscheduler.png)

## 配置文件

API 和 Worker 服务共用 `/opt/dolphinscheduler/conf/common.properties` ，修改配置时只需修改 API 服务的配置文件。

## 如何支持 Python 3？

Worker 服务默认安装了 Python3，使用时可以添加环境变量  `PYTHON_LAUNCHER=/usr/bin/python3`

## 如何支持 Hadoop, Spark, DataX 等？

以 Datax 为例：

1. 安装插件。Rainbond 团队视图 -> 插件 -> 从应用商店安装插件 -> 搜索 `通用数据初始化插件` 并安装。
2. 开通插件。进入 Worker 组件内 -> 插件 -> 开通  `通用数据初始化插件` ，并修改配置
   * FILE_URL：http://datax-opensource.oss-cn-hangzhou.aliyuncs.com/datax.tar.gz
   * FILE_PATH：/opt/soft
   * LOCK_PATH：/opt/soft
3. 更新组件，初始化插件会自动下载 `Datax` 并解压到 `/opt/soft`目录下。
   ![](../../img/rainbond/plugin.png)

---


---

## guide/metrics/metrics.md

# 指标（Metrics）使用指南

Apache DolphinScheduler通过向外透出指标来提高系统的监控告警能力。 我们使用[Micrometer](https://micrometer.io/)作为指标采集和透出框架。
目前，我们只支持`Prometheus Exporter`，但是多样化的Exporter将会持续贡献给用户。

## 快速上手

- 我们提供Apache DolphinScheduler `standalone` 模式下采集并透出指标的能力，提供用户轻松快速的体验。
- 当您在`standalone`模式下触发任务后，您可通过链接 `http://localhost:12345/dolphinscheduler/actuator/metrics` 访问生成的metrics列表。
- 当您在`standalone`模式下触发任务后，您可通过链接 `http://localhost:12345/dolphinscheduler/actuator/prometheus` 访问`prometheus格式`指标。
- 为了给您提供一个一站式的`Prometheus` + `Grafana`体验, 我们已经为您准备好了开箱即用的 `Grafana` 配置。您可在`dolphinscheduler-meter/resources/grafana`找到`Grafana`面板配置。
  您可直接将这些配置导入您的`Grafana`实例中。
- 如果您想通过`docker`方式体验，可使用如下命令启动我们为您准备好的开箱即用的`Prometheus`和`Grafana`:

```shell
cd dolphinscheduler-meter/src/main/resources/grafana-demo
docker compose up
```

然后，您即可通过`http://localhost:3001`链接访问`Grafana`面板。

![image.png](../../img/metrics/metrics-master.png)
![image.png](../../img/metrics/metrics-worker.png)
![image.png](../../img/metrics/metrics-datasource.png)

- 如果您想在`集群`模式下体验指标，请参照下面的[配置](#配置)一栏：

## 配置

您可通过链接`http://ip:port/actuator/prometheus`获取metrics。

metrics exporter端口`server.port`是在application.yaml里定义的: master: `server.port: 5679`, worker: `server.port: 1235`, alert: `server.port: 50053`, api: `server.port: 12345`.

举例来说，您可通过访问链接获取`curl http://localhost:5679/actuator/prometheus`master metrics。

## 命名规则 & 命名映射

- Apache DolphinScheduler指标命名遵循[Micrometer](https://github.com/micrometer-metrics/micrometer-docs/blob/main/src/docs/concepts/naming.adoc)
  官方推荐的命名方式。
- `Micrometer` 会根据您配置的外部指标系统自动将指标名称转化成适合您指标系统的格式。目前，我们只支持`Prometheus Exporter`，但是多样化的指标格式将会持续贡献给用户。

### Prometheus

- 指标名中的点会被映射为下划线
- 以数字开头的指标名会被加上`m_`前缀
- COUNTER: 如果没有以`_total`结尾，会自动加上此后缀
- LONG_TASK_TIMER: 如果没有以`_timer_seconds`结尾，会自动加上此后缀
- GAUGE: 如果没有以`_baseUnit`结尾，会自动加上此后缀

## Dolphin Scheduler指标清单

- Dolphin Scheduler按照组成部分进行指标分类，如：`master server`, `worker server`, `api server` and `alert server`。
- 尽管任务 / 工作流相关指标是由 `master server` 和 `worker server` 透出的，我们将这两块指标单独罗列出来，以方便您对任务 / 工作流的监控。

### 任务相关指标

- ds.task.instance.count: (counter) 任务实例数量，由tag `state`按状态切分：
  - timeout：超时的任务数量
  - finish：完成的任务数量，成功和失败的任务都算在内
  - success：成功完成的任务数量
  - fail：失败的任务数量
  - stop：暂停的任务数量
  - retry：重试的任务数量
  - submit：已提交的任务数量
  - failover：容错的任务数量
- ds.task.dispatch.count: (counter) 分发到worker上的任务数量
- ds.task.dispatch.failure.count: (counter) 分发失败的任务数量，重试也包含在内
- ds.task.dispatch.error.count: (counter) 分发任务的错误数量
- ds.task.execution.count.by.type: (counter) 任务执行数量，按标签`task_type`聚类
- ds.task.prepared: (gauge) 准备好且待提交的任务数量
- ds.task.execution.count: (counter) 已执行的任务数量
- ds.task.execution.duration: (histogram) 任务执行时长

### 工作流相关指标

- ds.workflow.create.command.count: (counter) 工作量创建并插入的命令数量
- ds.workflow.instance.running: (gauge) 正在运行的工作流实例数量
- ds.workflow.instance.count: (counter) 工作流实例数量，由tag `process.definition.code` 和 `state` 切分。您可以通过 `process.definition.code` 这个tag筛选出和某个workflow相关的指标，这里的 `process.definition.code` 指的是您工作流定义的编号代码。工作流实例有如下七种状态：
  - submit：已提交的工作量实例数量
  - timeout：运行超时的工作流实例数量
  - finish：已完成的工作流实例数量，包含成功和失败
  - success：运行成功的工作流实例数量
  - fail：运行失败的工作流实例数量
  - stop：停止的工作流实例数量
  - failover：容错的工作流实例数量

### RPC相关指标

- ds.rpc.client.sync.request.exception.count: (counter) 同步rpc请求异常数
- ds.rpc.client.sync.request.duration.time: (histogram) 同步rpc请求耗时

### Master Server指标

- ds.master.overload.count: (counter) master过载次数
- ds.master.consume.command.count: (counter) master消耗指令数量
- ds.master.scheduler.failover.check.count: (counter) scheduler (master) 容错检查次数
- ds.master.scheduler.failover.check.time: (histogram) scheduler (master) 容错检查耗时
- ds.master.quartz.job.executed: 已执行quartz任务数量
- ds.master.quartz.job.execution.time: 已执行quartz任务总耗时

### Worker Server指标

- ds.worker.overload.count: (counter) worker过载次数
- ds.worker.task: (gauge) worker上任务总数，包含等待提交和正在执行的任务
- ds.worker.execute.queue.size: (gauge) worker上等待提交的任务总数
- ds.worker.active.execute.thread: (gauge) worker上正在执行的任务总数
- ds.worker.memory.available: (gauge) worker机器可用物理内存 (GB)
- ds.worker.cpu.usage: (gauge) worker机器cpu使用百分比
- ds.worker.memory.usage: (gauge) worker机器内存使用百分比
- ds.worker.full.submit.queue.count: (counter) worker提交队列全满次数
- ds.worker.resource.download.count: (counter) worker下载资源文件的次数，可由`status`标签切分
- ds.worker.resource.download.duration: (histogram) worker下载资源文件时花费的时间分布
- ds.worker.resource.download.size: (histogram) worker下载资源文件大小的分布（bytes）

### Api Server指标

- ds.api.request.count: (counter) api请求次数
- ds.api.response.count: (counter) api响应次数，可由标签`code`切分
- ds.api.response.time: (timer) api响应时间分布，可由标签`user_id`切分
- ds.api.resource.upload.size: (histogram) api上传资源文件大小的分布（bytes）
- ds.api.resource.download.size: (histogram) api下载资源文件大小的分布（bytes）

### Alert Server指标

- ds.alert.send.count: (counter) 已发送的告警数量，可由标签`status`切分
- ds.alert.pending: (gauge) 等待发送的告警数量

**在每个server中都有一些系统层面（如数据库链接、JVM）的默认指标，为了您的检阅方便，我们也将它们列在了这里：**

### 数据库相关指标（默认）

- hikaricp.connections: 连接综述
- hikaricp.connections.creation: 连接创建时间 (包含最长时间，创建数量和时间总和)
- hikaricp.connections.acquire: 连接获取时间 (包含最长时间，创建数量和时间总和)
- hikaricp.connections.usage: 连接使用时长 (包含最长时间，创建数量和时间总和)
- hikaricp.connections.max: 最大连接数量
- hikaricp.connections.min: 最小连接数量
- hikaricp.connections.active: 活跃的连接数量
- hikaricp.connections.idle: 闲置的连接数量
- hikaricp.connections.pending: 等待中的连接数量
- hikaricp.connections.timeout: 超时连接数量
- jdbc.connections.max: 可同时分配的最大活跃连接数量
- jdbc.connections.min: 连接池中最小的闲置连接数量
- jdbc.connections.idle: 已创建但闲置的连接总数
- jdbc.connections.active: 当前数据源分配的活跃连接数量

### JVM相关指标（默认）

- jvm.buffer.total.capacity: 资源池中buffer总容量估计
- jvm.buffer.count: 资源池中buffer总数估计
- jvm.buffer.memory.used: JVM因buffer资源池使用的内存估计
- jvm.memory.committed: 以bytes为单位的提供JVM使用的内存
- jvm.memory.max: 以bytes为单位的可用于内存管理的最大内存
- jvm.memory.used: 已占用的内存量
- jvm.threads.peak: JVM启动以来的峰值线程数
- jvm.threads.states: 当前拥有新状态的线程数
- jvm.gc.memory.allocated: GC时，年轻代分配的内存空间
- jvm.gc.max.data.size: GC时，老年代的最大内存空间
- jvm.gc.pause: GC耗时 (包含次数, 总时长, 最大时长)
- jvm.gc.live.data.size: FullGC时，老年代的内存空间
- jvm.gc.memory.promoted: GC时，老年代分配的内存空间
- jvm.classes.loaded: JVM当前加载的类的数量
- jvm.threads.live: JVM当前活跃线程数（包含守护和非守护线程）
- jvm.threads.daemon: JVM守护线程数
- jvm.classes.unloaded: 未加载的classes数
- process.cpu.usage: 当前JVM进程CPU使用率
- process.start.time: 应用启动时间
- process.uptime: 应用已运行时间

### 其他指标（默认）

- jetty.threads.config.max: 资源池中最大线程数
- jetty.threads.config.min: 资源池中最小线程数
- jetty.threads.current: 资源池中线程总数
- jetty.threads.idle: 资源池中闲置线程数
- jetty.threads.busy: 资源池中繁忙线程数
- jetty.threads.jobs: 队列中等待执行线程的任务数
- process.files.max: 文件描述符最大数量
- process.files.open: 打开状态的文件描述符数量
- system.cpu.usage: 整个系统当前的CPU使用率
- system.cpu.count: JVM可用处理器数量
- system.load.average.1m: 系统的平均负荷（1分钟）
- logback.events: 日志时间数量，以标签`level`聚类
- http.server.requests: http请求总数


---

## guide/monitor.md

# 监控中心

## 服务管理

- 服务管理主要是对系统中的各个服务的健康状况和基本信息的监控和显示

### Master

- 主要是 master 的相关信息。

![master](../../img/new_ui/dev/monitor/master.png)

### Worker

- 主要是 worker 的相关信息。

![worker](../../img/new_ui/dev/monitor/worker.png)

### Alert Server

- 主要是 alert server 的相关信息。

![alert-server](../../img/new_ui/dev/monitor/alert-server.png)

### Database

- 主要是 DB 的健康状况

![db](../../img/new_ui/dev/monitor/db.png)

## 统计管理

### Statistics

![Command Statistics List](../../img/new_ui/dev/monitor/command-list.png)

展示系统中的命令列表，数据来自`t_ds_command`表。

![Failure Command Statistics List](../../img/new_ui/dev/monitor/failure-command-list.png)

展示系统中的失败命令列表，数据来自`t_ds_error_command`表。

### 审计日志

审计日志的记录提供了有关谁访问了系统，以及他或她在给定时间段内执行了哪些操作的信息，对于维护安全都很有用。

![audit-log](../../img/new_ui/dev/monitor/audit-log.png)


---

## guide/parameter/built-in.md

# 内置参数

## 基础内置参数

|               变量名               |                 声明方式                 |                含义                |
|---------------------------------|--------------------------------------|----------------------------------|
| system.biz.date                 | `${system.biz.date}`                 | 日常调度实例定时的定时时间前一天，格式为 yyyyMMdd    |
| system.biz.curdate              | `${system.biz.curdate}`              | 日常调度实例定时的定时时间，格式为 yyyyMMdd       |
| system.datetime                 | `${system.datetime}`                 | 日常调度实例定时的定时时间，格式为 yyyyMMddHHmmss |
| system.task.execute.path        | `${system.task.execute.path}`        | 当前任务执行的绝对路径                      |
| system.task.instance.id         | `${system.task.instance.id}`         | 当前任务实例的ID                        |
| system.task.definition.name     | `${system.task.definition.name}`     | 当前任务所属任务定义的名称                    |
| system.task.definition.code     | `${system.task.definition.code}`     | 当前任务所属任务定义的code                  |
| system.workflow.instance.id     | `${system.workflow.instance.id}`     | 当前任务所属工作流实例ID                    |
| system.workflow.definition.name | `${system.workflow.definition.name}` | 当前任务所属工作流定义的名称                   |
| system.workflow.definition.code | `${system.workflow.definition.code}` | 当前任务所属工作流定义的code                 |
| system.project.name             | `${system.project.name}`             | 当前任务所在项目的名称                      |
| system.project.code             | `${system.project.code}`             | 当前任务所在项目的code                    |

## 衍生内置参数

- 支持代码中自定义变量名，声明方式：${变量名}。可以是引用 "系统参数"

- 我们定义这种基准变量为 \$[...] 格式的，\$[yyyyMMddHHmmss] 是可以任意分解组合的，比如：\$[yyyyMMdd], \$[HHmmss], \$[yyyy-MM-dd] 等

- 也可以通过以下两种方式：

  1.使用add_months()函数，该函数用于加减月份，
  第一个入口参数为[yyyyMMdd]，表示返回时间的格式
  第二个入口参数为月份偏移量，表示加减多少个月
  * 后 N 年：$[add_months(yyyyMMdd,12*N)]
  * 前 N 年：$[add_months(yyyyMMdd,-12*N)]
  * 后 N 月：$[add_months(yyyyMMdd,N)]
  * 前 N 月：$[add_months(yyyyMMdd,-N)]
  *******************************************
  2.直接加减数字
  在自定义格式后直接“+/-”数字
  * 后 N 周：$[yyyyMMdd+7*N]
  * 前 N 周：$[yyyyMMdd-7*N]
  * 后 N 天：$[yyyyMMdd+N]
  * 前 N 天：$[yyyyMMdd-N]
  * 后 N 小时：$[HHmmss+N/24]
  * 前 N 小时：$[HHmmss-N/24]
  * 后 N 分钟：$[HHmmss+N/24/60]
  * 前 N 分钟：$[HHmmss-N/24/60]
  *******************************************
  3.业务属性方式
  在自定义格式后直接“+/-”数字
  支持日志格式：所有日期表达式，例如：yyyy-MM-dd/yyyyMMddHHmmss
  * 当天：$[this_day(yyyy-MM-dd)]，如：2022-08-26 => 2022-08-26
  * 昨天：$[last_day(yyyy-MM-dd)]，如：2022-08-26 => 2022-08-25
  * 年的第N周，以周一为起点：$[year_week(yyyy-MM-dd)]，如：2022-08-26 => 2022-34
  * 年的第N周，以周N为起点：$[year_week(yyyy-MM-dd,N)]，如：N=5时 2022-08-26 => 2022-35
  * 前(-)/后(+) N 月第一天：$[month_first_day(yyyy-MM-dd,-N)]，如：N=1时 2022-08-26 => 2022-07-01
  * 前(-)/后(+) N 月最后一天：$[month_last_day(yyyy-MM-dd,-N)]，如：N=1时 2022-08-28 => 2022-07-31
  * 前(-)/后(+) N 周的周一：$[week_first_day(yyyy-MM-dd,-N)]，如：N=1 2022-08-26 => 2022-08-15
  * 前(-)/后(+) N 周的周日：$[week_last_day(yyyy-MM-dd,-N)]，如：N=1 2022-08-26 => 2022-08-21


---

## guide/parameter/context.md

# 参数的引用

DolphinScheduler 提供参数间相互引用的能力，包括：本地参数引用全局参数、上下游参数传递。因为有引用的存在，就涉及当参数名相同时，参数的优先级问题，详见[参数优先级](priority.md)

## 本地任务引用全局参数

本地任务引用全局参数的前提是，你已经定义了[全局参数](global.md)，使用方式和[本地参数](local.md)中的使用方式类似，但是参数的值需要配置成全局参数中的 key。

## 上游任务传递给下游任务

DolphinScheduler 允许在任务间进行参数传递，目前传递方向仅支持上游单向传递给下游。目前支持这个特性的任务类型有：

* [Shell](../task/shell.md)
* [SQL](../task/sql.md)
* [Procedure](../task/stored-procedure.md)
* [Python](../task/python.md)
* [SubWorkflow](../task/sub-workflow.md)
* [Kubernetes](../task/kubernetes.md)

当定义上游节点时，如果有需要将该节点的结果传递给有依赖关系的下游节点，需要在【当前节点设置】的【自定义参数】设置一个方向是 OUT 的变量。如果是 SubWorkflow 节点无需在【当前节点设置】中设置变量，需要在子流程的工作流定义中设置一个方向是 OUT 的变量。

上游传递的参数可以在下游节点中被更新，更新方法与[设置参数](#创建-shell-任务并设置参数)相同。

如果定义了同名的传递参数，上游节点的参数将被覆盖。

> 注：若节点之间没有依赖关系，则局部参数无法通过上游传递。

### 任务样例

本样例展示了如何使用参数传递的功能，通过 SHELL 任务来创建本地参数并赋值传递给下游，SQL 任务通过获得上游任务的参数完成查询操作。

#### 创建 SHELL 任务并设置参数

> 用户需要传递参数，在定义 SHELL 脚本时，需要输出格式为 ${setValue(key=value)} 的语句，key 为对应参数的 prop，value 为该参数的值。

创建 Node_A 任务，在自定义参数中添加 output 和 value 参数，并编写如下脚本：

![context-parameter01](../../img/new_ui/dev/parameter/context_parameter01.png)

参数说明：

- value：方向选择为 IN，并赋值为 66
- output：方向选择为 OUT，通过脚本 `'${setValue(output=1)}'` 赋值，并传递给下游参数

SHELL 节点定义时当日志检测到 ${setValue(output=1)} 的格式时，会将 1 赋值给 output，下游节点便可以直接使用变量 output 的值。同样，您可以在【工作流实例】页面，找到对应的节点实例，便可以查看该变量的值。

创建 Node_B 任务，主要用于测试输出上游任务 Node_A 传递的参数。

![context-parameter02](../../img/new_ui/dev/parameter/context_parameter02.png)

#### 创建 SQL 任务并使用参数

完成上述的 SHELL 任务之后，我们可以使用上游所传递的 output 作为 SQL 的查询对象。其中将所查询的 id 重命名为 ID，作为参数输出。

![context-parameter03](../../img/new_ui/dev/parameter/context_parameter03.png)

> 注：如果 SQL 节点的结果只有一行，一个或多个字段，参数的名字需要和字段名称一致。数据类型可选择为除 LIST 以外的其他类型。变量会选择 SQL 查询结果中的列名中与该变量名称相同的列对应的值。
>
> 如果 SQL 节点的结果为多行，一个或多个字段，参数的名字需要和字段名称一致。数据类型选择为 LIST。获取到 SQL 查询结果后会将对应列转化为 LIST，并将该结果转化为 JSON 后作为对应变量的值。

#### 保存工作流并设置全局参数

点击保存工作流图标，并设置全局参数 output 和 value。

![context-parameter03](../../img/new_ui/dev/parameter/context_parameter04.png)

#### 查看运行结果

创建完成工作流之后，上线运行该工作流，查看其运行结果。

Node_A 运行结果如下：

![context-log01](../../img/new_ui/dev/parameter/context_log01.png)

Node_B 运行结果如下：

![context-log02](../../img/new_ui/dev/parameter/context_log02.png)

Node_mysql 运行结果如下：

![context-log03](../../img/new_ui/dev/parameter/context_log03.png)

虽然在 Node_A 的脚本中为 output 赋值为 1，但日志中显示的值仍然为 100。但根据[参数优先级](priority.md)的原则：`启动参数 > 本地参数 > 上游任务传递的参数 > 全局参数`，在 Node_B 中输出的值为 1。则证明 output 参数参照预期的值在该工作流中传递，并在 Node_mysql 中使用该值完成查询操作。

但是 value 的值却只有在 Node_A 中输出为 66，其原因为 value 的方向选择为 IN，只有当方向为 OUT 时才会被定义为变量输出。

#### Python 任务传递参数

使用 `print('${setValue(key=%s)}' % value)`，DolphinScheduler会捕捉输出中的 `${setValue(key=value}`来进行参数捕捉，从而传递到下游

如
![python_context_param](../../img/new_ui/dev/parameter/python_context_param.png)

注意： 当变量 value 中含有 `\n` 标识，如 `value = "hello \n world"`， 则需要将 value 进行特殊进行，需要使用 `print('${setValue(key=%s)}' % repr(value))`, 否则参数无法传递到后面的流程。

#### SubWorkflow 任务传递参数

在子流程的工作流定义中定义方向是 OUT 的变量作为输出参数，可以将这些参数传递到子流程节点的下游任务。

在子流程的工作流定义中创建 A 任务，在自定义参数中添加 var1 和 var2 参数，并编写如下脚本：

![context-sub-workflow01](../../img/new_ui/dev/parameter/context-sub-workflow01.png)

保存 sub-workflow_example1 工作流，设置全局参数 var1。

![context-sub-workflow02](../../img/new_ui/dev/parameter/context-sub-workflow02.png)

在新的工作流中创建 sub_workflow 任务，使用 sub-workflow_example1 工作流作为子节点。

![context-sub-workflow03](../../img/new_ui/dev/parameter/context-sub-workflow03.png)

创建一个 shell 任务作为 sub_workflow 任务的下游任务，并编写如下脚本：

![context-sub-workflow04](../../img/new_ui/dev/parameter/context-sub-workflow04.png)

保存该工作流并运行，下游任务运行结果如下：

![context-sub-workflow05](../../img/new_ui/dev/parameter/context-sub-workflow05.png)

虽然在 A 任务中输出 var1 和 var2 两个参数，但是工作流定义中只定义了 var1 的 OUT 变量，下游任务成功输出 var1，证明var1 参数参照预期的值在该工作流中传递。

#### Kubernetes 任务传递参数

在Kubernetes任务中不同的程序开发语言可能会采用不同的日志框架，DolphinScheduler为了兼容不同的日志框架，提供了一种通用的日志数据格式，即 `${(key=value)}` 或 `#{(key=value)}`，用户可以在应用程序的终端日志中输出以这种格式的日志数据，key 为对应参数的 prop，value 为该参数的值。DolphinScheduler会捕捉输出日志中的 `${(key=value)}` 和 `#{(key=value)}` 来进行参数捕捉，从而传递到下游。

如下图所示：

![kubernetes_context_param](../../img/new_ui/dev/parameter/k8s_context_param.png)

另外需要特别注意的是，并非总是可以收集pod日志，如果用户重定向日志输出流，我们既不能收集日志使用，也不能使用输出参数。


---

## guide/parameter/file-parameter.md

# 文件参数

通过配置文件参数，在同一工作流实例中，可以将上游任务工作目录下的文件(或文件夹，下统一以**文件**代替)传递给下游任务。 如以下场景可能使用到

- 在ETL任务中，将多个上游任务处理好的数据文件一起传递给特定的下游任务。
- 在机器学习场景中，将上游数据准备任务的数据集文件传递给下游模型训练任务。

## 使用方式

### 配置文件参数

文件参数配置方式如下：在任务定义页面，点击“自定义参数”右边的加号，即可进行配置。

### 输出文件给下游任务

**自定义参数四个选项分别为:**

- 参数名：任务间传递时使用的标识，如下图中使用的`KEY1`和`KEY2`
- 方向：OUT, 则表示输出文件给下游任务
- 参数类型：FILE, 表示文件参数
- 参数值：输出的文件路径，如下图中的`data`和`data/test2/text.txt`

下图的配置表示任务`output`向下游任务传递两个文件数据，分别为:
- 传出文件夹 `data`, 并标记为`dir-data`, 下游任务可以通过`output.dir-data`获取该文件夹
- 传出文件 `data/test2/text.txt`, 并标记为`file-text`, 下游任务可以通过`output.file-text`获取该文件夹

![img.png](../../img/new_ui/dev/parameter/file_parameter_output.png)

### 获取上游任务的文件

**自定义参数四个选项分别为:**

- 参数名：上游文件输入后保存的位置，如下图中使用的`input_dir`
- 方向：IN, 则表示从上游任务获取文件
- 参数类型：FILE, 表示文件参数
- 参数值：上游文件的标识，为 `taskName.KEY` 的格式 如下图中的`output.dir-data`, 其中`output`为上游任务的名称，`dir-data`为上游任务中输出的文件标识

下图的配置表示任务从上游任务`output`中获取标识为`dir-data`的文件夹，并保存为`input_dir`

![img.png](../../img/new_ui/dev/parameter/file_parameter_input_dir.png)

下图的配置表示任务从上游任务`output`中获取标识为`file-text`的文件，并保存为`input.txt`

![img.png](../../img/new_ui/dev/parameter/file_parameter_input_file.png)

## 其他

### 备注

- 上下游任务间的文件传递基于资源中心作为中转，数据保存在资源中心`DATA_TRANSFER`的目录下, 因此**必须开启资源中心功能**，详情请参考[资源中心配置详情](../resource/configuration.md), 否则无法使用文件参数功能。
- 文件命名规则为 `DATA_TRANSFER/日期/工作流Code/工作流版本_工作流实例ID/任务名称_任务实例ID_文件名`
- 若传输的文件数据为文件夹，则会打包成后缀为`.zip`的压缩文件再上传，下游任务接到后会解压并保存在对应目录
- 若需要删除文件数据，可以在资源中心的`DATA_TRANSFER`目录下删除对应文件夹即可, 如直接按照日期子目录删除，会删除该日期下所有的文件数据. 也可以使用`resources/data-transfer`[Open API 接口](../api/open-api.md)（删除N天前的数据）删除对应文件数据。
- 如果存在任务链 task1->task2->tas3, 则最下游任务task3也能获取task1的文件数据
- 支持一对多传输以及多对一传输
- 如果频繁大量传输文件，毫无疑问会因传输的数据量影响到系统IO性能

### 样例

你可以保存以下YAML文件到本地，然后执行`pydolphinscheduler yaml -f data-transfer.yaml`即可运行Demo.

```yaml
# Define the workflow
workflow:
  name: "data-transfer"
  run: true

# Define the tasks under the workflow
tasks:
  - name: output
    task_type: Shell
    command: |
      mkdir -p data/test1 data/test2
      echo "test1 message" >> data/test1/text.txt
      echo "test2 message" >> data/test2/text.txt
      tree .
    local_params:
      - { "prop": "dir-data", "direct": "OUT", "type": "FILE", "value": "data" }
      - { "prop": "file-text", "direct": "OUT", "type": "FILE", "value": "data/test2/text.txt" }

  - name: input_dir
    task_type: Shell
    deps: [output]
    command: |
      tree .
      cat input_dir/test1/text.txt
      cat input_dir/test2/text.txt
    local_params:
      - { "prop": "input_dir", "direct": "IN", "type": "FILE", "value": "output.dir-data" }


  - name: input_file
    task_type: Shell
    deps: [output]
    command: |
      tree .
      cat input.txt
    local_params:
      - { "prop": "input.txt", "direct": "IN", "type": "FILE", "value": "output.file-text" }
```


---

## guide/parameter/global.md

# 全局参数

## 作用域

全局参数在工作流定义页面配置。

方向是 IN 的变量是针对**整个工作流**的所有任务节点都有效的参数。

方向是 OUT 的变量作为该工作流的输出参数，传递到父工作流中对应 SubProcess 任务的下游任务。

## 使用方式

具体的使用方式可结合实际的生产情况而定，这里演示为使用 Shell 任务打印出前一天的日期。

### 创建 Shell 任务

创建一个 Shell 任务，并在脚本内容中输入 `echo ${dt}`。此时 dt 则为我们需要声明的全局参数。如下图所示：

![global-parameter01](../../img/new_ui/dev/parameter/global_parameter01.png)

### 保存工作流，并设置全局参数

全局参数配置方式如下：在工作流定义页面，点击“设置全局”右边的加号，填写对应的变量名称和对应的值，选择相应的参数值类型，保存即可。如下图所示：

![global-parameter02](../../img/new_ui/dev/parameter/global_parameter02.png)

> 注：这里定义的 dt 参数可以被其它任一节点的局部参数引用。

### 任务实例查看执行结果

进入任务实例页面，可以通过查看日志，验证任务的执行结果，判断参数是否有效。

![global-parameter03](../../img/new_ui/dev/parameter/global_parameter03.png)


---

## guide/parameter/local.md

# 本地参数

## 作用域

在任务定义页面配置的参数，默认作用域仅限该任务，如果配置了[参数传递](context.md)则可将该参数作用到下游任务中。

## 使用方式

本地参数配置方式如下：在任务定义页面，点击“自定义参数”右边的加号，填写对应的变量名称和对应的值，保存即可。

* 如果要在单个任务中使用参数，请参阅通过自定义参数使用
* 如果要在任务中使用配置参数并在下游任务中使用它们：
  * 如果你只是想要简单使用，且不使用自定义参数, 请参阅 通过 `setValue` 和自定义参数 export 本地参数
  * 如果想要使用自定义参数, 请参阅 通过 `setValue` 和自定义参数 export 本地参数
  * 如果想要使用 Bash 参数, 请参阅 通过 `setValue` 和 Bash 环境变量参数 export 本地参数

## 任务样例

### 通过自定义参数使用

本样例展示了如何使用本地参数，打印输出当前日期。创建一个 Shell 任务，并编写脚本内容为 `echo ${dt}`。点击配置栏中的**自定义参数**，配置如下图所示：

![local-parameter01](../../img/new_ui/dev/parameter/local_parameter01.png)

参数说明：

- dt：参数名
- IN：IN 表示局部参数仅能在当前节点使用，OUT 表示局部参数可以向下游传递
- DATE：数据类型，日期
- $[yyyy-MM-dd]：自定义格式的衍生内置参数

保存工作流并运行，查看 Shell 任务输出日志。

![local-parameter02](../../img/new_ui/dev/parameter/local_parameter02.png)

> 注：本地参数可以在当前任务节点的工作流中，设置其为 OUT 则可以传递给下游的工作流使用，可以参考：[参数传递](context.md)

### 通过 `setValue` export 本地参数

如果你想简单 export 参数然后在下游任务中使用它们，你可以在你的任务中使用 `setValue`，你可以将参数统一在一个任务中管理。在 Shell 任务中使用语法
`echo '${setValue(set_val=123)}'`(**不要忘记单引号**) 并添加新的 `OUT` 自定义参数来 export 它。

![local-parameter-set-val](../../img/new_ui/dev/parameter/local_param_set_val.png)

你可以在下游任务中使用语法 `echo '${set_val}'` 在获取设定的值。

### 通过 `setValue` 和自定义参数 export 本地参数

如果你想用自定义参数而不是常量值来实现参数 export，并下游任务中使用它们，你可以在通过 `setValue` 和 自定义参数实现，当你想改变参数的值时可以直接改变
“自定义参数”模块中的值，这让程序更加容易维护。您可以在 Shell 任务中使用语法 `echo "#{setValue(set_val_param=${val})}"`（**如果你想要将任何
变量赋值给 `setValue`** 请不要忘记使用双引号）并添加新的 `IN` 自定义参数用于输入变量 `val` 和 `OUT` 自定义参数用于 export 参数 `set_val_param`。

![local-parameter-set-val-param](../../img/new_ui/dev/parameter/local_param_set_val_custom.png)

你可以在下游任务中使用语法 `echo '${set_val_param}'` 在获取设定的值。

### 通过 `setValue` 和 Bash 环境变量参数 export 本地参数

If you want to export parameters with bash variable instead of constants value, and then use them in downstream tasks, you could use `setValue` in your task, which more flexible such as you can get variable for exists local or HTTP resource. You can use syntax like

如果你想用 bash 变量而不是常量值 export 参数，并在下游任务中使用它们，你可以在通过 `setValue` 和 Bash 变量实现，它更灵活，例如你动态获取现有的本地
或 HTTP 资源获取设定变量。 您可以使用类似的语法

```shell
lines_num=$(wget https://raw.githubusercontent.com/apache/dolphinscheduler/dev/README.md -q -O - | wc -l | xargs)
echo "#{setValue(set_val_var=${lines_num})}"
```

在 Shell 任务中（**如果你想要将任何变量赋值给 `setValue`** 请不要忘记使用双引号）和 `OUT` 自定义参数用于 export 参数 `set_val_var`。
.

![local-parameter-set-val-bash](../../img/new_ui/dev/parameter/local_param_set_val_bash.png)

你可以在下游任务中使用语法 `echo '${set_val_var}'` 在获取设定的值。


---

## guide/parameter/priority.md

# 参数优先级

DolphinScheduler 中所涉及的参数值的定义可能来自三种类型：

* [项目级别参数](project-parameter.md)：在项目管理中定义的项目级别参数
* [全局参数](global.md)：在工作流保存页面定义时定义的变量
* [启动参数](startup-parameter.md)：在工作流启动页面定义的变量
* [上游任务传递的参数](context.md)：上游任务传递过来的参数
* [本地参数](local.md)：节点的自有变量，用户在“自定义参数”定义的变量，并且用户可以在工作流定义时定义该部分变量的值

因为参数的值存在多个来源，当参数名相同时，就需要会存在参数优先级的问题。DolphinScheduler 参数的优先级从高到低为：`启动参数 > 本地参数 > 上游任务传递的参数 > 全局参数 > 项目级别参数`

在上游任务传递的参数中，由于上游可能存在多个任务向下游传递参数，当上游传递的参数名称相同时：

* 下游节点会优先使用值为非空的参数
* 如果存在多个值为非空的参数，则按照上游任务的完成时间排序，选择完成时间最晚的上游任务对应的参数

## 例子

下面例子向你展示如何使用任务参数传递的优先级问题

1：先以 shell 节点解释第一种情况

![priority-parameter01](../../img/new_ui/dev/parameter/priority_parameter01.png)

节点 【useParam】可以使用到节点【createParam】中设置的变量。而节点 【useParam】与节点【noUseParam】中并没有依赖关系，所以并不会获取到节点【noUseParam】的变量。上图中只是以 shell 节点作为例子，其他类型节点具有相同的使用规则。

![priority-parameter02](../../img/new_ui/dev/parameter/priority_parameter02.png)

其中节点【createParam】在使用变量时直接使用即可。另外该节点设置了 "key" 和 "key1" 两个变量，这里用户用定义了一个与上游节点传递的变量名相同的变量 key1，并且赋值为 "12"，但是由于我们设置的优先级的关系，这里的值 "12" 会被使用，最终上游节点设置的变量值会被抛弃。

2：我们再以 sql 节点来解释另外一种情况

![priority-parameter03](../../img/new_ui/dev/parameter/priority_parameter03.png)

节点【use_create】的定义如下：

![priority-parameter04](../../img/new_ui/dev/parameter/priority_parameter04.png)

"status" 是当前节点设置的节点的自有变量。但是用户在保存工作流时也同样设置了 "status" 变量（全局参数），并且赋值为 -1。那在该 SQL 执行时，status 的值为优先级更高的 2。抛弃了全局变量中的值。

这里的 "id" 是上游节点设置的变量，用户在节点【createParam1】、节点【createParam2】中设置了相同参数名 "id" 的参数。而节点【use_create】中使用了最先结束的【createParam1】的值。


---

## guide/parameter/project-parameter.md

# 项目级别参数

## 作用域

项目级别参数是针对整个项目下的所有任务节点都有效的参数。

## 使用方式

### 定义项目级别参数

在项目管理页面，点击项目级别参数，点击创建项目级别参数，填写参数名称和参数值，选择相应的参数值类型。如下图所示：

![project-parameter01](../../img/new_ui/dev/parameter/project_parameter01.png)

### 使用项目级别参数

以shell任务为例，在脚本内容中输入`echo ${param}`，其中`param`为上一步创建的项目级别参数。

![project-parameter02](../../img/new_ui/dev/parameter/project_parameter02.png)

运行该shell任务，在任务实例页面，可以查看任务日志，验证参数是否有效。

![project-parameter03](../../img/new_ui/dev/parameter/project_parameter03.png)


---

## guide/parameter/startup-parameter.md

# 启动参数

## 作用域

启动参数是针对**整个工作流**的所有任务节点都有效的参数，在工作流启动页面配置。

## 使用方式

启动参数配置方式如下：在启动前参数设置界面，点击“启动参数“下面的加号，填写对应的参数名称和对应的值，选择相应的参数值类型，点击确定，工作流会将启动参数加入全局参数中。

## 任务样例

本样例展示了如何使用启动参数，打印输出不同天的日期。

### 创建 Shell 任务

创建一个 Shell 任务，并在脚本内容中输入 `echo ${dt}`。此时 dt 则为我们需要声明的启动参数。如下图所示：

![startup-parameter01](../../img/new_ui/dev/parameter/startup_parameter01.png)

### 保存工作流，上线运行并设置启动参数

启动参数配置如下图所示：

![startup-parameter02](../../img/new_ui/dev/parameter/startup_parameter02.png)

> 注：这里定义的 dt 参数可以被其它任一节点的局部参数引用。

### 任务实例查看执行结果

进入任务实例页面，可以通过查看日志，验证任务的执行结果，判断参数是否有效。

![startup-parameter03](../../img/new_ui/dev/parameter/startup_parameter03.png)

### 修改启动参数，再次执行

![startup-parameter04](../../img/new_ui/dev/parameter/startup_parameter04.png)

### 任务实例查看执行结果

验证任务执行结果，判断Shell任务是否输出了不同日期。

![startup-parameter05](../../img/new_ui/dev/parameter/startup_parameter05.png)


---

## guide/project/project-list.md

# 项目管理

## 创建项目

点击"项目管理"进入项目管理页面，点击“创建项目”按钮，输入项目名称，项目描述，点击“提交”，创建新的项目。

![project](../../img/new_ui/dev/project/project-create.png)

## 项目工作组授权

在项目管理页面，点击“工作组授权”按钮，进入工作组授权页面，如下图所示，选择工作组，点击“分配WorkerGroup”，授权成功后，该项目可以访问该工作组。
![project-worker-group](../../img/new_ui/dev/project/project-worker-group-auth.png)

## 项目首页

在项目管理页面点击项目名称链接，进入项目首页，如下图所示，项目首页包含该项目的任务实例状态统计、工作流实例状态统计、工作流定义统计。这几个指标的说明如下

- **任务实例状态统计**：在指定时间范围内，统计任务实例中状态为提交成功、正在运行、准备暂停、暂停、准备停止、停止、失败、成功、需要容错、kill、等待线程的个数
- **工作流实例状态统计**：在指定时间范围内，统计工作流实例中状态为提交成功、正在运行、准备暂停、暂停、准备停止、停止、失败、成功、需要容错、kill、等待线程的个数
- **工作流定义统计**：统计用户创建的工作流定义及管理员授予该用户的工作流定义

![project-overview](../../img/new_ui/dev/project/project-overview.png)


---

## guide/project/task-instance.md

# 任务实例

## 批量任务实例

- 点击项目管理->工作流->任务实例，进入任务实例页面，如下图所示，点击工作流实例名称，可跳转到工作流实例DAG图查看任务状态。

![task-instance](../../img/new_ui/dev/project/batch-task-instance.png)

- 查看日志：点击操作列中的“查看日志”按钮，可以查看任务执行的日志情况。

![task-log](../../img/new_ui/dev/project/task-log.png)

## 实时任务实例

- 切换到实时任务实例页面，如下图所示：

![task-instance](../../img/new_ui/dev/project/stream-task-instance.png)

- SavePoint：点击操作列中的SavePoint按钮，可以进行实时任务的SavePoint。
- Stop：点击操作列中的Stop按钮，可以停止该实时任务。


---

## guide/project/workflow-definition.md

# 工作流定义

## 创建工作流定义

- 点击项目管理->工作流->工作流定义，进入工作流定义页面，点击“创建工作流”按钮，进入**工作流DAG编辑**页面，如下图所示：

  ![workflow-dag](../../img/new_ui/dev/project/workflow-dag.png)

- 工具栏中拖拽 <img src="../../../../img/tasks/icons/shell.png" width="15"/> 到画板中，新增一个Shell任务,如下图所示：

  ![demo-shell-simple](../../img/tasks/demo/shell.jpg)

- **添加 Shell 任务的参数设置：**

  1. 填写“节点名称”，“描述”，“脚本”字段；
  2. “运行标志”勾选“正常”，若勾选“禁止执行”，运行工作流不会执行该任务；
  3. 选择“任务优先级”：当 worker 线程数不足时，级别高的任务在执行队列中会优先执行，相同优先级的任务按照先进先出的顺序执行；
  4. 超时告警（非必选）：勾选超时告警、超时失败，填写“超时时长”，当任务执行时间超过**超时时长**，会发送告警邮件并且任务超时失败；
  5. 资源（非必选）：资源文件是资源中心->文件管理页面创建或上传的文件，如文件名为 `test.sh`，脚本中调用资源命令为 `sh test.sh`。注意调用需要使用资源的全路径；
  6. 自定义参数（非必填）；
  7. 点击"确认添加"按钮，保存任务设置。
- **配置任务之间的依赖关系：** 点击任务节点的右侧加号连接任务；如下图所示，任务 Node_B 和任务 Node_C 并行执行，当任务 Node_A 执行完，任务 Node_B、Node_C 会同时执行。

  ![workflow-dependent](../../img/new_ui/dev/project/workflow-dependent.png)

- **实时任务的依赖关系：** 若DAG中包含了实时任务的组件，则实时任务的关联关系显示为虚线，在执行工作流实例的时候会跳过实时任务的执行

  ![workflow-dependent](../../img/new_ui/dev/project/workflow-definition-with-stream-task.png)

- **删除依赖关系：** 点击右上角"箭头"图标<img src="../../../../img/arrow.png" width="35"/>，选中连接线，点击右上角"删除"图标<img src="../../../../img/delete.png" width="35"/>，删除任务间的依赖关系。

  ![workflow-delete](../../img/new_ui/dev/project/workflow-delete.png)

- **保存工作流定义：** 点击”保存“按钮，弹出"设置DAG图名称"弹框，如下图所示，输入工作流定义名称，工作流定义描述，设置全局参数（选填，参考[全局参数](../parameter/global.md)），点击"添加"按钮，工作流定义创建成功。

  ![workflow-save](../../img/new_ui/dev/project/workflow-save.png)

  > 其他类型任务，请参考 [任务节点类型和参数设置]

- **执行策略**
- `并行`：如果对于同一个工作流定义，同时有多个工作流实例，则并行执行工作流实例。
- `串行等待`：如果对于同一个工作流定义，同时有多个工作流实例，则串行执行工作流实例。
- `串行抛弃`：如果对于同一个工作流定义，同时有多个工作流实例，则抛弃后生成的工作流实例并杀掉正在跑的实例。
- `串行优先`：如果对于同一个工作流定义，同时有多个工作流实例，则按照优先级串行执行工作流实例。

![workflow-execution-type](../../img/new_ui/dev/project/workflow-execution-type.png)

## 工作流定义操作功能

点击项目管理->工作流->工作流定义，进入工作流定义页面，如下图所示:

![workflow-list](../../img/new_ui/dev/project/workflow-list.png)

### 单个工作流支持的操作

- **编辑：** 只能编辑"下线"的工作流定义。工作流DAG编辑同创建工作流定义。
- **运行：** 只有上线的工作流能运行。运行操作步骤见运行工作流
- **上线：** 工作流状态为"下线"时，上线工作流，只有"上线"状态的工作流能运行，但不能编辑。
- **下线：** 工作流状态为"上线"时，下线工作流，下线状态的工作流可以编辑，但不能运行。
- **定时：** 工作流设置定时，系统自动定时调度工作流运行。创建定时后的状态为"下线"，需要点击右边<img src="../../../../img/scheduler_online.png" width="20"/>按钮上线定时才生效。定时操作步骤见[工作流定时](#工作流定时)
- **定时上线：** 定时调度上线，只能定时创建后且工作流状态为"上线"时才可点击。
- **定时下线：** 定时调度下线。
- **删除：** 删除工作流定义。在同一个项目中，只能删除自己创建的工作流定义，其他用户的工作流定义不能进行删除，如果需要删除请联系创建用户或者管理员。
- **下载：** 下载工作流定义到本地。
- **复制：** 在当前项目下，根据当前工作流复制出一个新的工作流，新工作流的名称会在原工作流名称的基础上加上后缀`_copy_<date>`。
- **导出：** 导出工作流定义json文件。
- **版本信息：** 查看工作流版本信息，可在版本信息列表中切换工作流版本。
- **树形图：** 以树形结构展示任务节点的类型及任务状态，如下图所示：

![workflow-tree](../../img/new_ui/dev/project/workflow-tree.png)

### 工作流批量操作

选中多个工作流后，可以在工作流定义列表底部执行批量操作，如下：

- **批量删除：** 批量删除多个工作流定义。
- **批量导出：** 批量导出多个工作流定义到一个json文件。
- **批量复制：** 批量复制多个工作流定义，可选择在哪个项目下生成复制的工作流。

## 运行工作流

- 点击项目管理->工作流->工作流定义，进入工作流定义页面，如下图所示，点击"上线"按钮<img src="../../../../img/online.png" width="35"/>，上线工作流。

![workflow-online](../../img/new_ui/dev/project/workflow-online.png)

- 点击”运行“按钮，弹出启动参数设置弹框，如下图所示，设置启动参数，点击弹框中的"运行"按钮，工作流开始运行，工作流实例页面生成一条工作流实例。

![workflow-run](../../img/new_ui/dev/project/workflow-run.png)

工作流运行参数说明：

* 失败策略：当某一个任务节点执行失败时，其他并行的任务节点需要执行的策略。”继续“表示：某一任务失败后，其他任务节点正常执行；”结束“表示：终止所有正在执行的任务，并终止整个流程。
* 通知策略：当流程结束，根据流程状态发送流程执行信息通知邮件，包含任何状态都不发，成功发，失败发，成功或失败都发。
* 流程优先级：流程运行的优先级，分五个等级：最高（HIGHEST），高(HIGH),中（MEDIUM）,低（LOW），最低（LOWEST）。当 master 线程数不足时，级别高的流程在执行队列中会优先执行，相同优先级的流程按照先进先出的顺序执行。
* Worker 分组：该流程只能在指定的 worker 机器组里执行。默认是 Default，可以在任一 worker 上执行。
* 通知组：选择通知策略||超时报警||发生容错时，会发送流程信息或邮件到通知组里的所有成员。
* 启动参数: 在启动新的流程实例时，设置或覆盖全局参数的值。
* 补数：指运行指定日期范围内的工作流定义，根据补数策略生成对应的工作流实例，补数策略包括串行补数、并行补数 2 种模式。

  > 日期可以通过页面选择或者手动输入，日期范围是左关右关区间(startDate <= N <= endDate)

  * 串行补数：指定时间范围内，从开始日期至结束日期依次执行补数，依次生成多条流程实例；点击运行工作流，选择串行补数模式：例如从7月 9号到7月10号依次执行，依次在流程实例页面生成两条流程实例。

  ![workflow-serial](../../img/new_ui/dev/project/workflow-serial.png)

  * 并行补数： 指定时间范围内，同时进行多天的补数，同时生成多条流程实例。手动输入日期：手动输入以逗号分割日期格式为 `yyyy-MM-dd HH:mm:ss` 的日期。点击运行工作流，选择并行补数模式：例如同时执行7月9号到7月10号的工作流定义，同时在流程实例页面生成两条流程实例(执行策略为串行时流程实例按照策略执行)。

  ![workflow-parallel](../../img/new_ui/dev/project/workflow-parallel.png)

  * 并行度：是指在并行补数的模式下，最多并行执行的实例数。例如同时执行7月6号到7月10号的工作流定义，并行度为2，那么流程实例为：
    ![workflow-concurrency-from](../../img/new_ui/dev/project/workflow-concurrency-from.png)

  ![workflow-concurrency](../../img/new_ui/dev/project/workflow-concurrency.png)

  * 依赖模式：是否触发下游依赖节点依赖到当前工作流的工作流实例的补数（要求当前补数的工作流实例的定时状态为已上线，只会触发下游直接依赖到当前工作流的补数）。

  ![workflow-dependency](../../img/new_ui/dev/project/workflow-dependency.png)

  * 日期选择：

    1. 通过页面选择日期：

    ![workflow-pageSelection](../../img/new_ui/dev/project/workflow-pageSelection.png)

    2. 手动输入：

    ![workflow-input](../../img/new_ui/dev/project/workflow-input.png)

  * 补数与定时配置的关系：

    1. `未配置定时`或`已配置定时并定时状态下线`：根据所选的时间范围结合定时默认配置(每天0点)进行补数，比如该工作流调度日期为7月7号到7月10号，流程实例为：

    ![workflow-unconfiguredTimingResult](../../img/new_ui/dev/project/workflow-unconfiguredTimingResult.png)

    2. `已配置定时并定时状态上线`：根据所选的时间范围结合定时配置进行补数，比如该工作流调度日期为7月7号到7月10号，配置了定时（每日凌晨5点运行），流程实例为：

    ![workflow-configuredTiming](../../img/new_ui/dev/project/workflow-configuredTiming.png)

    ![workflow-configuredTimingResult](../../img/new_ui/dev/project/workflow-configuredTimingResult.png)

## 单独运行任务

- 右键选中任务，点击"启动"按钮(只有已上线的任务才能点击运行)

![workflow-task-run](../../img/new_ui/dev/project/workflow-task-run.png)

- 弹出启动参数设置弹框，参数说明同运行工作流

![workflow-task-run-config](../../img/new_ui/dev/project/workflow-task-run-config.png)

## 工作流定时

- 创建定时：点击项目管理->工作流->工作流定义，进入工作流定义页面，上线工作流，点击"定时"按钮<img src="../../../../img/timing.png" width="35"/>,弹出定时参数设置弹框，如下图所示：

  ![workflow-time01](../../img/new_ui/dev/project/workflow-time01.png)

- 选择起止时间。在起止时间范围内，定时运行工作流；不在起止时间范围内，不再产生定时工作流实例。

- 添加一个每隔 5 分钟执行一次的定时，如下图所示：

  ![workflow-time02](../../img/new_ui/dev/project/workflow-time02.png)

- 失败策略、通知策略、流程优先级、Worker 分组、通知组、收件人、抄送人同工作流运行参数。

- 点击"创建"按钮，创建定时成功，此时定时状态为"**下线**"，定时需**上线**才生效。

- 定时上线：点击"定时上线"按钮<img src="../../../../img/scheduler_online.png" width="30"/>，点击"上线"按钮，定时状态变为"上线"，如下图选中所示，工作流定时生效。
  ![workflow-time03](../../img/new_ui/dev/project/workflow-time03.png)

- 查看定时：定时上线后可以通过"定时"按钮<img src="../../../../img/timing.png" width="35"/>，查看当前定时情况。但是不可修改，如图所示。
  ![workflow-time04](../../img/new_ui/dev/project/workflow-time04.png)

## 导入工作流

点击项目管理->工作流->工作流定义，进入工作流定义页面，点击"导入工作流"按钮，导入本地工作流文件，工作流定义列表显示导入的工作流，状态为下线。


---

## guide/project/workflow-instance.md

# 工作流实例

## 查看工作流实例

- 点击项目管理->工作流->工作流实例，进入工作流实例页面，如下图所示：

![workflow-instance](../../img/new_ui/dev/project/workflow-instance.png)

- 点击工作流名称，进入DAG查看页面，查看任务执行状态，如下图所示。

![instance-state](../../img/new_ui/dev/project/instance-state.png)

## 查看任务日志

- 进入工作流实例页面，点击工作流名称，进入DAG查看页面，双击任务节点，如下图所示：

![instance-log01](../../img/new_ui/dev/project/instance-log01.png)

- 点击"查看日志"，弹出日志弹框，如下图所示,任务实例页面也可查看任务日志，参考[任务查看日志](./task-instance.md)。

![instance-log02](../../img/new_ui/dev/project/instance-log02.png)

## 查看任务历史记录

- 点击项目管理->工作流->工作流实例，进入工作流实例页面，点击工作流名称，进入工作流 DAG 页面;
- 双击任务节点，如下图所示，点击"查看历史"，跳转到任务实例页面，并展示该任务定义运行的任务实例列表

![instance-history](../../img/new_ui/dev/project/instance-history.png)

## 查看运行参数

- 点击项目管理->工作流->工作流实例，进入工作流实例页面，点击工作流名称，进入工作流 DAG 页面;
- 点击左上角图标<img src="../../../../img/run_params_button.png" width="35"/>，查看工作流实例的启动参数；点击图标<img src="../../../../img/global_param.png" width="35"/>，查看工作流实例的全局参数和局部参数，如下图所示：

![instance-parameter](../../img/new_ui/dev/project/instance-parameter.png)

## 工作流实例操作功能

点击项目管理->工作流->工作流实例，进入工作流实例页面，如下图所示：

![workflow-instance](../../img/new_ui/dev/project/workflow-instance.png)

- **编辑：** 只能编辑 成功/失败/停止 状态的流程。点击"编辑"按钮或工作流实例名称进入 DAG 编辑页面，编辑后点击"保存"按钮，弹出保存 DAG 弹框，如下图所示，修改流程定义信息，在弹框中勾选"是否更新工作流定义"，保存后则将实例修改的信息更新到工作流定义；若不勾选，则不更新工作流定义。

  <p align="center">
  <img src="../../../../img/editDag.png" width="80%" />
  </p>

- **重跑：** 重新执行已经终止的流程。

- **恢复失败：** 针对失败的流程，可以执行恢复失败操作，从失败的节点开始执行。

- **停止：** 对正在运行的流程进行**停止**操作，后台会先 `kill` worker 进程,再执行 `kill -9` 操作

- **暂停：** 对正在运行的流程进行**暂停**操作，系统状态变为**等待执行**，会等待正在执行的任务结束，暂停下一个要执行的任务。

- **恢复暂停：** 对暂停的流程恢复，直接从**暂停的节点**开始运行

- **删除：** 删除工作流实例及工作流实例下的任务实例

- **甘特图：** Gantt 图纵轴是某个工作流实例下的任务实例的拓扑排序，横轴是任务实例的运行时间,如图示：

![instance-gantt](../../img/new_ui/dev/project/instance-gantt.png)


---

## guide/remote-logging.md

# 远程日志存储（Remote Logging）

Apache DolphinScheduler支持将任务日志传输到远端存储上。当配置开启远程日志存储后，DolphinScheduler将在任务结束后，将对应的任务日志异步地发送到指定的远端存储上。此外，用户在查看或下载任务日志时，若本地没有该日志文件，DolphinScheduler将从远端存储上下载对应的日志文件到本地文件系统。

## 开启远程日志存储

如果您以 `集群` 模式或者 `伪集群` 模式部署DolphinScheduler，您需要对以下路径的文件进行配置：`api-server/conf/common.properties`，`master-server/conf/common.properties`和 `worker-server/conf/common.properties`；
若您以 `单机` 模式部署DolphinScheduler，您只需要配置 `standalone-server/conf/common.properties`，具体配置如下：

```properties
# 是否开启远程日志存储
remote.logging.enable=true
# 任务日志写入的远端存储，目前支持OSS, S3, GCS, ABS
remote.logging.target=OSS
# 任务日志在远端存储上的目录
remote.logging.base.dir=logs
# 设置向远端存储异步发送日志的线程池大小
remote.logging.thread.pool.size=10
```

## 将任务日志写入[阿里云对象存储（OSS）](https://www.aliyun.com/product/oss)

配置`common.propertis`如下：

```properties
# oss access key id, required if you set remote.logging.target=OSS
remote.logging.oss.access.key.id=<access.key.id>
# oss access key secret, required if you set remote.logging.target=OSS
remote.logging.oss.access.key.secret=<access.key.secret>
# oss bucket name, required if you set remote.logging.target=OSS
remote.logging.oss.bucket.name=<bucket.name>
# oss endpoint, required if you set remote.logging.target=OSS
remote.logging.oss.endpoint=<endpoint>
```

## 将任务日志写入[Amazon S3](https://aws.amazon.com/cn/s3/)

配置`common.propertis`如下：

```properties
# s3 access key id, required if you set remote.logging.target=S3
remote.logging.s3.access.key.id=<access.key.id>
# s3 access key secret, required if you set remote.logging.target=S3
remote.logging.s3.access.key.secret=<access.key.secret>
# s3 bucket name, required if you set remote.logging.target=S3
remote.logging.s3.bucket.name=<bucket.name>
# s3 endpoint, required if you set remote.logging.target=S3
remote.logging.s3.endpoint=<endpoint>
# s3 region, required if you set remote.logging.target=S3
remote.logging.s3.region=<region>
```

## 将任务日志写入[Google Cloud Storage (GCS)](https://cloud.google.com/storage)

配置`common.propertis`如下：

```properties
# the location of the google cloud credential, required if you set remote.logging.target=GCS
remote.logging.google.cloud.storage.credential=/path/to/credential
# gcs bucket name, required if you set remote.logging.target=GCS
remote.logging.google.cloud.storage.bucket.name=<your-bucket>
```

## 将任务日志写入[Azure Blob Storage (ABS)](https://azure.microsoft.com/en-us/products/storage/blobs)

配置`common.propertis`如下：

```properties
# abs account name, required if you set resource.storage.type=ABS
remote.logging.abs.account.name=<your-account-name>
# abs account key, required if you set resource.storage.type=ABS
remote.logging.abs.account.key=<your-account-key>
# abs container name, required if you set resource.storage.type=ABS
remote.logging.abs.container.name=<your-container-name>
```

### 注意事项

由于Azure Blob Storage不支持空目录单独存在，因此资源目录下会有空文件`<no name>`。但是并不影响Dolphinscheduler资源中心上的文件展示。


---

## guide/resource/configuration.md

# 资源中心配置详情

- 资源中心通常用于上传文件以及任务组管理等操作。
- 资源中心可以对接分布式的文件存储系统，如[Hadoop](https://hadoop.apache.org/docs/r2.7.0/)（2.6+）或者[MinIO](https://github.com/minio/minio)集群，也可以对接远端的对象存储，如[AWS S3](https://aws.amazon.com/s3/)或者[阿里云 OSS](https://www.aliyun.com/product/oss)，[华为云 OBS](https://support.huaweicloud.com/obs/index.html)，[腾讯云 COS](https://cloud.tencent.com/product/cos) 等。
- 资源中心也可以直接对接本地文件系统。在单机模式下，您无需依赖`Hadoop`或`S3`一类的外部存储系统，可以方便地对接本地文件系统进行体验。
- 除此之外，对于集群模式下的部署，您可以通过使用[S3FS-FUSE](https://github.com/s3fs-fuse/s3fs-fuse)将`S3`挂载到本地，或者使用[JINDO-FUSE](https://help.aliyun.com/document_detail/187410.html)将`OSS`挂载到本地等，再用资源中心对接本地文件系统方式来操作远端对象存储中的文件。

## 对接本地文件系统

### 配置 `common.properties` 文件

Dolphinscheduler 资源中心使用本地系统默认是开启的，不需要用户做任何额外的配置，但是当用户需要对默认配置做修改时，请确保同时完成下面的修改。

- 如果您以 `集群` 模式或者 `伪集群` 模式部署DolphinScheduler，您需要对以下路径的文件进行配置：`api-server/conf/common.properties` 和 `worker-server/conf/common.properties`；
- 若您以 `单机` 模式部署DolphinScheduler，您只需要配置 `standalone-server/conf/common.properties`，具体配置如下：

您可能需要涉及如下的修改：

- 将 `resource.storage.upload.base.path` 改为本地存储路径，请确保部署 DolphinScheduler 的用户拥有读写权限，例如：`resource.storage.upload.base.path=/tmp/dolphinscheduler`。当路径不存在时会自动创建文件夹

> **注意**
> 1. LOCAL模式不支持分布式模式读写，意味着上传的资源只能在一台机器上使用，除非使用共享文件挂载点
> 2. 如果您不想用默认值作为资源中心的基础路径，请修改`resource.storage.upload.base.path`的值。
> 3. 当配置 `resource.storage.type=LOCAL`，其实您配置了两个配置项，分别是 `resource.storage.type=HDFS` 和 `resource.hdfs.fs.defaultFS=file:///` ，我们单独配置 `resource.storage.type=LOCAL` 这个值是为了
> 方便用户，并且能使得本地资源中心默认开启

## 对接AWS S3

如果需要使用到资源中心的 S3 上传资源，我们需要对以下路径的进行配置：`api-server/conf/common.properties`, `api-server/conf/aws.yaml` 和 `worker-server/conf/common.properties`, `worker-server/conf/aws.yaml`。可参考如下：

配置以下字段

```properties

resource.storage.type=S3
```

```yaml
aws:
    s3:
        # The AWS credentials provider type. support: AWSStaticCredentialsProvider, InstanceProfileCredentialsProvider
        # AWSStaticCredentialsProvider: use the access key and secret key to authenticate
        # InstanceProfileCredentialsProvider: use the IAM role to authenticate
        credentials.provider.type: AWSStaticCredentialsProvider
        access.key.id: <access.key.id>
        access.key.secret: <access.key.secret>
        region: <region>
        bucket.name: <bucket.name>
        endpoint: <endpoint>

```

## 对接阿里云 OSS

如果需要使用到资源中心的 OSS 上传资源，我们需要对以下路径的进行配置：`api-server/conf/common.properties` 和 `worker-server/conf/common.properties`。可参考如下：

```properties
# alibaba cloud access key id, required if you set resource.storage.type=OSS 
resource.alibaba.cloud.access.key.id=<your-access-key-id>
# alibaba cloud access key secret, required if you set resource.storage.type=OSS
resource.alibaba.cloud.access.key.secret=<your-access-key-secret>
# alibaba cloud region, required if you set resource.storage.type=OSS
resource.alibaba.cloud.region=cn-hangzhou
# oss bucket name, required if you set resource.storage.type=OSS
resource.alibaba.cloud.oss.bucket.name=dolphinscheduler
# oss bucket endpoint, required if you set resource.storage.type=OSS
resource.alibaba.cloud.oss.endpoint=https://oss-cn-hangzhou.aliyuncs.com

```

## 对接华为云 OBS

如果需要使用到资源中心的 OBS 上传资源，我们需要对以下路径的进行配置：`api-server/conf/common.properties` 和 `worker-server/conf/common.properties`。可参考如下：

```properties
# access key id, required if you set resource.storage.type=OBS
resource.huawei.cloud.access.key.id=<your-access-key-id>
# access key secret, required if you set resource.storage.type=OBS
resource.huawei.cloud.access.key.secret=<your-access-key-secret>
# oss bucket name, required if you set resource.storage.type=OBS
resource.huawei.cloud.obs.bucket.name=dolphinscheduler
# oss bucket endpoint, required if you set resource.storage.type=OBS
resource.huawei.cloud.obs.endpoint=obs.cn-southwest-2.huaweicloud.com

```

> **注意**：
>
> * 如果只配置了 `api-server/conf/common.properties` 的文件，则只是开启了资源上传的操作，并不能满足正常使用。如果想要在工作流中执行相关文件则需要额外配置 `worker-server/conf/common.properties`。
> * 如果用到资源上传的功能，那么[安装部署](../installation/standalone.md)中，部署用户需要有这部分的操作权限。
> * 如果 Hadoop 集群的 NameNode 配置了 HA 的话，需要开启 HDFS 类型的资源上传，同时需要将 Hadoop 集群下的 `core-site.xml` 和 `hdfs-site.xml` 复制到 `worker-server/conf` 以及 `api-server/conf`，非 NameNode HA 跳过此步骤。

## 对接腾讯云 COS

如果需要使用到资源中心的 COS 上传资源，我们需要对以下路径的进行配置：`api-server/conf/resource-center.yaml` 和 `worker-server/conf/resource-center.yaml`。可参考如下：

```yaml
resource:
  # 腾讯云 COS 配置
  tencent:
    cloud:
      access:
        key:
          id: <your-access-key-id>
          secret: <your-access-key-secret>
      cos:
        # COS 区域代码可参考: https://cloud.tencent.com/document/product/436/6224
        region: ap-nanjing
        bucket:
          name: dolphinscheduler

```

为了激活腾讯云存储 COS，还需要对以下路径的进行配置：`api-server/conf/common.properties` 和 `worker-server/conf/common.properties`。可参考如下：

```properties
resource.storage.type=COS
```


---

## guide/resource/file-manage.md

# 文件管理

当在调度过程中需要使用到第三方的 jar 或者用户需要自定义脚本的情况，可以通过在该页面完成相关操作。可创建的文件类型包括：`txt/log/sh/conf/py/java` 等。并且可以对文件进行编辑、重命名、下载和删除等操作。

> **_注意：_**
>
> * 当您以`admin`身份登入并操作文件时，需要先给`admin`设置租户

## 基础操作

![file-manage](../../img/new_ui/dev/resource/file-manage.png)

### 创建文件

文件格式支持以下几种类型：txt、log、sh、conf、cfg、py、java、sql、xml、hql、properties

![create-file](../../img/new_ui/dev/resource/create-file.png)

### 上传文件

上传文件：点击"上传文件"按钮进行上传，将文件拖拽到上传区域，文件名会自动以上传的文件名称补全

![upload-file](../../img/new_ui/dev/resource/upload-file.png)

### 文件查看

对可查看的文件类型，点击文件名称，可查看文件详情

![file_detail](../../img/tasks/demo/file_detail.png)

### 下载文件

点击文件列表的"下载"按钮下载文件或者在文件详情中点击右上角"下载"按钮下载文件

### 文件重命名

![rename-file](../../img/new_ui/dev/resource/rename-file.png)

### 删除文件

文件列表->点击"删除"按钮，删除指定文件

## 任务样例

该样例主要通过一个简单的 shell 脚本，来演示如何在工作流定义中使用资源中心的文件。像 MR、Spark 等任务需要用到 jar 包，也是同理。

### 创建 shell 文件

创建一个 shell 文件，输出 “hello world”。

![create-shell](../../img/new_ui/dev/resource/demo/file-demo01.png)

### 创建工作流执行文件

在项目管理的工作流定义模块，创建一个新的工作流，使用 shell 任务。

- 脚本：`sh resource/hello.sh`
- 资源：选择 `resource/hello.sh`

> 注意：脚本中选择资源文件时文件名称需要保持和所选择资源全路径一致：
> 例如：资源路径为`resource/hello.sh` 则脚本中调用需要使用`resource/hello.sh`全路径

![use-shell](../../img/new_ui/dev/resource/demo/file-demo02.png)

### 查看结果

可以在工作流实例中，查看该节点运行的日志结果。如下图：

![log-shell](../../img/new_ui/dev/resource/demo/file-demo03.png)


---

## guide/resource/intro.md

# 资源中心简介

资源中心通常用于上传文件和任务组管理。 对于 standalone 环境，可以选择本地文件目录作为上传文件夹（此操作不需要Hadoop部署）。当然，你也可以
选择上传到 Hadoop 或者 MinIO 集群。 在这种情况下，您需要有 Hadoop（2.6+）或 MinIO 等相关环境。


---

## guide/resource/task-group.md

# 任务组管理

任务组主要用于控制任务实例并发，旨在控制其他资源的压力（也可以控制 Hadoop 集群压力，不过集群会有队列管控）。您可在新建任务定义时，可配置对应的任务组，并配置任务在任务组内运行的优先级。用户仅能查看有权限的项目对应的任务组，且仅能创建或修改具有写权限的项目对应的任务组。

> 注意：任务组的对资源的限制是在项目级别的，和租户没有关系

### 任务组配置

#### 新建任务组

![taskGroup](../../img/new_ui/dev/resource/taskGroup.png)

用户点击【资源中心】-【任务组管理】-【任务组配置】-新建任务组

![create-taskGroup](../../img/new_ui/dev/resource/create-taskGroup.png)

您需要输入图片中信息，其中

【任务组名称】：任务组在被使用时显示的名称

【项目名称】：任务组作用的项目，该项为非必选项，如果不选择，则整个系统所有项目均可使用该任务组。

【资源容量】：允许任务实例并发的最大数量

#### 查看任务组队列

![view-queue](../../img/new_ui/dev/resource/view-queue.png)

点击按钮查看任务组使用信息

![view-queue](../../img/new_ui/dev/resource/view-groupQueue.png)

#### 任务组的使用

注：任务组的使用适用于由 worker 执行的任务，例如【switch】节点、【condition】节点、【sub_workflow】等由 master 负责执行的节点类型不受任务组控制。

我们以 shell 节点为例：

![use-queue](../../img/new_ui/dev/resource/use-queue.png)

关于任务组的配置，您需要做的只需要配置红色框内的部分，其中：

【任务组名称】：任务组配置页面显示的任务组名称，这里只能看到该项目有权限的任务组（新建任务组时选择了该项目），或作用在全局的任务组（新建任务组时没有选择项目）

【组内优先级】：在出现等待资源时，优先级高的任务会最先被 master 分发给 worker 执行，该部分数值越大，优先级越高。

### 任务组的实现逻辑

#### 获取任务组资源：

Master 在分发任务时判断该任务是否配置了任务组，如果任务没有配置，则正常抛给 worker 运行；如果配置了任务组，在抛给 worker 执行之前检查任务组资源池剩余大小是否满足当前任务运行，如果满足资源池 -1，继续运行；如果不满足则退出任务分发，等待其他任务结束唤醒。

#### 释放与唤醒：

当获取到任务组资源的任务结束运行后，会释放任务组资源，释放后会检查当前任务组是否有任务等待，如果有则标记优先级最好的任务可以运行，并新建一个可以执行的event。该event中存储着被标记可以获取资源的任务id，随后在获取任务组资源然后运行。

#### 任务组流程图

![task_group](../../img/task_group_process.png)


---

## guide/security/authentication-type.md

# 认证方式

* 目前我们支持四种认证方式，Apache DolphinScheduler自身账号密码登录，LDAP, 通过Casdoor实现的SSO登录和通过Oauth2授权登录，并且oauth2授权登录方式可以和其他认证方式同时使用。

## 修改认证方式

> dolphinscheduler-api/src/main/resources/application.yaml

```yaml
security:
  authentication:
    # Authentication types (supported types: PASSWORD,LDAP,CASDOOR_SSO)
    type: PASSWORD
    # IF you set type `LDAP`, below config will be effective
    ldap:
      # ldap server config
      url: ldap://ldap.forumsys.com:389/
      base-dn: dc=example,dc=com
      username: cn=admin,dc=example,dc=com
      password: password
      user:
         # admin userId when you use LDAP login
         admin: ldap-admin
         # user search filter to find admin user
         identity-attribute: uid
         email-attribute: mail
         # action when ldap user is not exist (supported types: CREATE,DENY)
         not-exist-action: DENY
      ssl:
         enable: false
         # jks file absolute path && password
         trust-store: "/ldapkeystore.jks"
         trust-store-password: "password"
    casdoor:
      user:
        admin: ""
    oauth2:
      enable: false
      provider:
        github:
          authorizationUri: ""
          redirectUri: ""
          clientId: ""
          clientSecret: ""
          tokenUri: ""
          userInfoUri: ""
          callbackUrl: ""
          iconUri: ""
          provider: github
        google:
          authorizationUri: ""
          redirectUri: ""
          clientId: ""
          clientSecret: ""
          tokenUri: ""
          userInfoUri: ""
          callbackUrl: ""
          iconUri: ""
          provider: google
casdoor:
   # Your Casdoor server url
   endpoint: ""
   client-id: ""
   client-secret: ""
   # The certificate may be multi-line, you can use `|-` for ease
   certificate: ""
   # Your organization name added in Casdoor
   organization-name: ""
   # Your application name added in Casdoor
   application-name: ""
   # Doplhinscheduler login url
   redirect-url: ""
```

## 通过 Casdoor 实现 SSO 登录

Casdoor 是基于 OAuth 2.0、OIDC、SAML 和 CAS 的面向 UI 的身份访问管理（IAM）/单点登录（SSO）平台。您可以通过以下步骤通过 Casdoor 为 Dolphinscheduler 添加 SSO 功能：

### 步骤1. 部署 Casdoor

首先，需要部署 Casdoor。 您可以参考 Casdoor 官方文档进行[安装](https://casdoor.org/docs/basic/server-installation)。 成功部署后，您需要确保：

* Casdoor 服务器在 http://localhost:8000 上成功运行。
* 打开您喜欢的浏览器并访问 http://localhost:7001 ，您将看到 Casdoor 的登录页面。
* 输入 admin 和 123，测试登录功能是否正常工作。

然后，您可以通过以下步骤在自己的应用程序中快速实现基于 Casdoor 的登录页面。

### 步骤2. 配置 Casdoor

1. 创建或使用现有的 Casdoor 应用程序。
2. 添加您的重定向 URL（您可以在下一节中了解更多关于如何获取重定向 URL 的详细信息）
   ![Casdoor Application Setting](../../img/casdoor-sso-configuration.png)
3. 添加您想要的提供程序并补充其他设置。

不出所料，您可以在应用程序设置页面上获得两个值：`Client ID` 和 `Client secret`，如上图所示。我们将在下一步中使用它们。

打开您喜欢的浏览器并访问：**http://`CASDOOR_HOSTNAME`/.well-known/openid-configuration**，您将看到 Casdoor 的 OIDC 配置。

### 步骤3. 配置 Dolphinscheduler

> dolphinscheduler-api/src/main/resources/application.yaml

```yaml
security:
  authentication:
    # Authentication types (supported types: PASSWORD,LDAP,CASDOOR_SSO)
    type: CASDOOR_SSO
casdoor:
  # Your Casdoor server url
  endpoint:
  client-id:
  client-secret:
  # The certificate may be multi-line, you can use `|-` for ease
  certificate: 
  # Your organization name added in Casdoor
  organization-name:
  # Your application name added in Casdoor
  application-name:
  # Doplhinscheduler login url
  redirect-url: http://localhost:5173/login 
```

## 通过OAuth2授权认证登录

dolphinscheduler可以同时支持多种OAuth2的provider，只需要在配置文件中打开Oauth2的开关并进行简单的配置即可。

### 步骤1. 获取OAuth2客户端凭据

![create-client-credentials-1](../../img/security/authentication/create-client-credentials-1.png)

![create-client-credentials-2](../../img/security/authentication/create-client-credentials-2.png)

### 步骤2. 在api的配置文件中开启oauth2登录

```yaml
security:
  authentication:
    …… # 省略
    oauth2:
      # 将enable设置为true 开启oauth2登录模式
      enable: true
      provider:
        github:
          # 设置provider的授权地址，例如https://github.com/login/oauth/authorize
          authorizationUri: ""
          # dolphinscheduler的后端重定向接口地址，例如http://127.0.0.1:12345/dolphinscheduler/redirect/login/oauth2
          redirectUri: ""
          # oauth2的 clientId
          clientId: ""
          # oauth2的 clientSecret
          clientSecret: ""
          # 设置provider的请求token的地址
          tokenUri: ""
          # 设置provider的请求用户信息的地址
          userInfoUri: ""
          # 登录成功后的重定向地址, http://{ip}:{port}/login
          callbackUrl: ""
          # 登录页跳转按钮的图片url，不填写则会展示一个文字按钮
          iconUri: ""
          provider: github
        google:
          authorizationUri: ""
          redirectUri: ""
          clientId: ""
          clientSecret: ""
          tokenUri: ""
          userInfoUri: ""
          callbackUrl: ""
          iconUri: ""
          provider: google
        gitee:
          authorizationUri: "https://gitee.com/oauth/authorize"
          redirectUri: "http://127.0.0.1:12345/dolphinscheduler/redirect/login/oauth2"
          clientId: ""
          clientSecret: ""
          tokenUri: "https://gitee.com/oauth/token?grant_type=authorization_code"
          userInfoUri: "https://gitee.com/api/v5/user"
          callbackUrl: "http://127.0.0.1:5173/login"
          iconUri: ""
          provider: gitee
```

### 步骤3.使用oauth2登录

![login-with-oauth2](../../img/security/authentication/login-with-oauth2.png)


---

## guide/security/security.md

# 安全中心（权限系统）

* 安全中心只有管理员账户才有权限操作，分别有队列管理、租户管理、用户管理、告警组管理、worker分组管理、令牌管理等功能，在用户管理模块可以对资源、数据源、项目等授权
* 管理员登录，默认用户名/密码：admin/dolphinscheduler123

## 创建队列

- 队列是在执行 spark、mapreduce 等程序，需要用到“队列”参数时使用的。
- 管理员进入安全中心 -> 队列管理页面，点击“创建队列”按钮，创建队列。

> 注意：目前仅有 admin 用户可以修改队列。

![create-queue](../../img/new_ui/dev/security/create-queue.png)

## 添加租户

- 租户对应的是 Linux 的用户，用于 worker 提交作业所使用的用户。如果 linux 没有这个用户，则会导致任务运行失败。你可以通过修改 `worker.properties` 配置文件中参数 `worker.tenant.auto.create=true` 实现当 linux 用户不存在时自动创建该用户。`worker.tenant.auto.create=true` 参数会要求 worker 可以免密运行 `sudo` 命令
- 租户编码：**租户编码是 Linux上 的用户，唯一，不能重复**
- 管理员进入安全中心->租户管理页面，点击“创建租户”按钮，创建租户。

> 注意：
> 1. 目前仅有 admin 用户可以修改租户；
> 2. 如果您在 Linux 中手动创建一个租户，则需要将手动创建的租户添加到 dolphinscheduler 启动用户组，以便该租户拥有足够的工作目录权限。

![create-tenant](../../img/new_ui/dev/security/create-tenant.png)

## 创建普通用户

- 用户分为**管理员用户**和**普通用户**
  * 管理员有授权和用户管理等权限，没有创建项目和工作流定义的操作的权限。
  * 普通用户可以创建项目和对工作流定义的创建，编辑，执行等操作。
  * 注意：如果该用户切换了租户，则该用户所在租户下所有资源将复制到切换的新租户下。
- 进入安全中心->用户管理页面，点击“创建用户”按钮，创建用户。

![create-user](../../img/new_ui/dev/security/create-user.png)

### 编辑用户信息

- 管理员进入安全中心->用户管理页面，点击"编辑"按钮，编辑用户信息。
- 普通用户登录后，点击用户名下拉框中的用户信息，进入用户信息页面，点击"编辑"按钮，编辑用户信息。

### 修改用户密码

- 管理员进入安全中心->用户管理页面，点击"编辑"按钮，编辑用户信息时，输入新密码修改用户密码。
- 普通用户登录后，点击用户名下拉框中的用户信息，进入修改密码页面，输入密码并确认密码后点击"编辑"按钮，则修改密码成功。

## 创建告警组

* 告警组是在启动时设置的参数，在流程结束以后会将流程的状态和其他信息以邮件形式发送给告警组。
* 管理员进入安全中心->告警组管理页面，点击“创建告警组”按钮，创建告警组。

![create-alarmInstance](../../img/new_ui/dev/security/create-alarmInstance.png)

## 令牌管理

> 由于后端接口有登录检查，令牌管理提供了一种可以通过调用接口的方式对系统进行各种操作。
> - 管理员进入安全中心->令牌管理页面，点击“创建令牌”按钮，选择失效时间与用户，点击"生成令牌"按钮，点击"提交"按钮，则选择用户的token创建成功。

![create-token](../../img/new_ui/dev/security/create-token.png)

- 普通用户登录后，点击用户名下拉框中的用户信息，进入令牌管理页面，选择失效时间，点击"生成令牌"按钮，点击"提交"按钮，则该用户创建 token 成功。

- 调用示例：

```java
    /**
     * test token
     */
    public  void doPOSTParam()throws Exception{
        // create HttpClient
        CloseableHttpClient httpclient = HttpClients.createDefault();

        // create http post request
        HttpPost httpPost = new HttpPost("http://127.0.0.1:12345/escheduler/projects/create");
        httpPost.setHeader("token", "123");
        // set parameters
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("projectName", "qzw"));
        parameters.add(new BasicNameValuePair("desc", "qzw"));
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(parameters);
        httpPost.setEntity(formEntity);
        CloseableHttpResponse response = null;
        try {
            // execute
            response = httpclient.execute(httpPost);
            // response status code 200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println(content);
            }
        } finally {
            if (response != null) {
                response.close();
            }
            httpclient.close();
        }
    }
```

## 授予权限

* 授予权限包括项目权限，数据源权限和k8s命名空间。
* 管理员可以对普通用户进行非其创建的项目、数据源k8s命名空间。因为项目、数据源、k8s命名空间授权方式都是一样的，所以以项目授权为例介绍。
* 注意：对于用户自己创建的项目，该用户默认拥有所有的权限，因此对用户自己创建的项目进行权限变更是无效的。
- 管理员进入`安全中心->用户管理页面`，点击需授权用户的“授权”按钮，如下图所示：

![project-authroize-step-1](../../img/new_ui/dev/security/project-authroize-step-1.png)

- 勾选单个或多个项目，再点击上方授权按钮进行项目授权。上方按钮从左至右分别对应着`撤销所有权限`，`授予读权限`和`授予所有权限`（包括读权限和写权限）。

![project-authroize-step-2](../../img/new_ui/dev/security/project-authroize-step-2.png)

- 如果用户对某个项目只拥有读权限而没有写权限，则在执行删除项目或更新项目等操作时，会返回错误提示，提示用户没有写权限，无法完成该操作。

![no-permission-error](../../img/new_ui/dev/security/no-permission-error.png)

- 数据源授权同项目授权。

## Worker 分组

每个 worker 节点都会归属于自己的 worker 分组，默认分组为 `default`。

在任务执行时,可以将任务分配给指定 worker 分组，最终由该组中的 worker 节点执行该任务。

### 新增 / 更新 worker 分组

- 打开要设置分组的 worker 节点上的 `worker-server/conf/application.yaml` 配置文件. 修改 `worker` 配置下的 `groups` 参数.
- `groups` 参数的值为 worker 节点对应的分组名称，默认为 `default`。
- 如果该 worker 节点对应多个分组，则用连字符列出，示范如下：

```conf
worker:
......
  groups:
    - default
    - group1
    - group2
......
```

- 也可以在运行中添加 worker 所属的 worker 分组而忽略 `application.yaml` 中的配置。修改步骤为 `安全中心` -> `worker分组管理` -> 点击 `创建worker分组` -> 输入`分组名称`和`worker地址` -> 点击`确定`

## 环境管理

* 在线配置 worker 运行环境，一个 worker 可以指定多个环境，每个环境等价于 dolphinscheduler_env.sh 文件.

* 默认环境为dolphinscheduler_env.sh文件.

* 在任务执行时,可以将任务分配给指定 worker 分组，根据 worker 分组选择对应的环境，最终由该组中的 worker 节点执行环境后执行该任务.

> 创建/更新 环境

- 环境配置等价于dolphinscheduler_env.sh文件内配置

![create-environment](../../img/new_ui/dev/security/create-environment.png)

> 使用环境

- 在工作流定义中创建任务节点选择 worker 分组和 worker 分组对应的环境，任务执行时 worker 会先执行环境在执行任务.

![use-environment](../../img/new_ui/dev/security/use-environment.png)

> 注意: 当无法在任务定义或工作流运行对话框中使用你想要使用的环境时，请检查您已经选择worker，并且您要使用的环境已经关联到您选择的worker中

## 集群管理

> 创建/更新 集群

- 每个工作流可以绑定零到若干个集群用来支持多集群，目前先用于k8s。

> 使用集群

- 创建和授权后，k8s命名空间和工作流会增加关联集群的功能。每一个集群会有独立的工作流和任务实例独立运行。

![create-cluster](../../img/new_ui/dev/security/create-cluster.png)

## 命名空间管理

> 创建/更新 k8s集群

- 先把k8s集群连接的配置录入 database 的表 `t_ds_k8s`给批次使用后续移除，namespace的创建现在通过下拉选择集群.

> 创建/更新 namespace

- 创建和授权后，在相关k8s任务选择命名空间时下拉可选，如果k8s集群名字是`ds_null_k8s`是测试模式，不会真正操作集群.

![create-environment](../../img/new_ui/dev/security/create-namespace.png)


---

## guide/start/docker.md

# Docker 快速使用教程

本教程使用三种不同的方式通过 Docker 完成 DolphinScheduler 的部署

- 如果你想要快速体验，推荐使用 standalone-server 镜像，
- 如果你想要体验比较完成的服务，推荐使用 docker-compose 启动服务.
- 如果你已经有自己的数据库或者 Zookeeper 服务你想要沿用这些基础服务，你可以参考沿用已有的 PostgreSQL 和 ZooKeeper 服务完成部署。

## 前置条件

需要安装 [Docker](https://docs.docker.com/engine/install/) 1.13.1 以上版本，以及 [Docker Compose](https://docs.docker.com/compose/) 1.28.0 以上版本。

## 启动服务

### 使用 standalone-server 镜像

使用 standalone-server 镜像启动一个 DolphinScheduler standalone-server 容器应该是最快体验 DolphinScheduler 的方法。通过这个方式
你可以最快速的体验到 DolphinScheduler 的大部分功能，了解主要和概念和内容。

```shell
$ DOLPHINSCHEDULER_VERSION=<version>
$ docker run --name dolphinscheduler-standalone-server -p 12345:12345 -p 25333:25333 -d apache/dolphinscheduler-standalone-server:"${DOLPHINSCHEDULER_VERSION}"
```

> 注意：请不要将 apache/dolphinscheduler-standalone-server 镜像作为生产镜像，应该仅仅作为快速体验 DolphinScheduler 的功能的途径。
> 除了因为他将全部服务运行在一个进程中外，还因为其使用内存数据库 H2 储存其元数据，当服务停止时内存数据库中的数据将会被清空。另外
> apache/dolphinscheduler-standalone-server 仅包含 DolphinScheduler 核心服务，部分任务组件（如 Spark 和 Flink 等），
> 告警组件（如 Telegram 和 Dingtalk 等）需要外部的组件或对应的配置后

### 使用 docker-compose 启动服务

使用 docker-compose 启动服务相比 standalone-server 的优点是 DolphinScheduler 的各个是独立的容器和进程，相互影响降到最小，且能够在
服务重启的时候保留元数据（如需要挂载到本地路径需要做指定）。他更健壮，能保证用户体验更加完整的 DolphinScheduler 服务。这种方式需要先安装
[docker-compose](https://docs.docker.com/compose/install/)，链接适用于 Mac，Linux，Windows。

确保 docker-compose 顺利安装后，需要获取 `docker-compose.yaml` 文件，通过[下载页面](https://dolphinscheduler.apache.org/en-us/download/<version>)
下载对应版本源码包可能是最快的方法，当下载完源码后就可以运行命令进行部署了。

```shell
$ DOLPHINSCHEDULER_VERSION=<version>
$ tar -zxf apache-dolphinscheduler-"${DOLPHINSCHEDULER_VERSION}"-src.tar.gz
# Mac Linux 用户
$ cd apache-dolphinscheduler-"${DOLPHINSCHEDULER_VERSION}"-src/deploy/docker
# Windows 用户, `cd apache-dolphinscheduler-"${DOLPHINSCHEDULER_VERSION}"-src\deploy\docker`

# 如果需要初始化或者升级数据库结构，需要指定profile为schema
$ docker-compose --profile schema up -d

# 启动dolphinscheduler所有服务，指定profile为all
$ docker-compose --profile all up -d
```

> 提醒：安装完成 docker-compose 后需要修改部分配置以便能更好体验 DolphinScheduler 服务，我们推荐配置不少于 4GB 的空闲内存，详见
> [How to assign more memory to docker container](https://stackoverflow.com/a/44533437/7152658).
>
> 通过 docker-compose 启动服务时，除了会启动 DolphinScheduler 对应的服务外，还会启动必要依赖服务，如数据库 PostgreSQL 和 服务发现 ZooKeeper

### 沿用已有的 PostgreSQL 和 ZooKeeper 服务

使用 docker-compose 启动服务会新启动数据库，以及 ZooKeeper 服务。如果你已经有在运行中的数据库，或者
ZooKeeper 且不想启动新的服务，可以使用这个方式分别启动 DolphinScheduler 容器。

```shell
$ DOLPHINSCHEDULER_VERSION=<version>
# 初始化数据库，其确保数据库 <DATABASE> 已经存在
$ docker run -d --name dolphinscheduler-tools \
    -e DATABASE="postgresql" \
    -e SPRING_DATASOURCE_URL="jdbc:postgresql://localhost:5432/<DATABASE>" \
    -e SPRING_DATASOURCE_USERNAME="<USER>" \
    -e SPRING_DATASOURCE_PASSWORD="<PASSWORD>" \
    -e SPRING_JACKSON_TIME_ZONE="UTC" \
    --net host \
    apache/dolphinscheduler-tools:"${DOLPHINSCHEDULER_VERSION}" tools/bin/upgrade-schema.sh
# 启动 DolphinScheduler 对应的服务
$ docker run -d --name dolphinscheduler-master \
    -e DATABASE="postgresql" \
    -e SPRING_DATASOURCE_URL="jdbc:postgresql://localhost:5432/<DATABASE>" \
    -e SPRING_DATASOURCE_USERNAME="<USER>" \
    -e SPRING_DATASOURCE_PASSWORD="<PASSWORD>" \
    -e SPRING_JACKSON_TIME_ZONE="UTC" \
    -e REGISTRY_ZOOKEEPER_CONNECT_STRING="localhost:2181" \
    --net host \
    -d apache/dolphinscheduler-master:"${DOLPHINSCHEDULER_VERSION}"
$ docker run -d --name dolphinscheduler-worker \
    -e DATABASE="postgresql" \
    -e SPRING_DATASOURCE_URL="jdbc:postgresql://localhost:5432/<DATABASE>" \
    -e SPRING_DATASOURCE_USERNAME="<USER>" \
    -e SPRING_DATASOURCE_PASSWORD="<PASSWORD>" \
    -e SPRING_JACKSON_TIME_ZONE="UTC" \
    -e REGISTRY_ZOOKEEPER_CONNECT_STRING="localhost:2181" \
    --net host \
    -d apache/dolphinscheduler-worker:"${DOLPHINSCHEDULER_VERSION}"
$ docker run -d --name dolphinscheduler-api \
    -e DATABASE="postgresql" \
    -e SPRING_DATASOURCE_URL="jdbc:postgresql://localhost:5432/<DATABASE>" \
    -e SPRING_DATASOURCE_USERNAME="<USER>" \
    -e SPRING_DATASOURCE_PASSWORD="<PASSWORD>" \
    -e SPRING_JACKSON_TIME_ZONE="UTC" \
    -e REGISTRY_ZOOKEEPER_CONNECT_STRING="localhost:2181" \
    --net host \
    -d apache/dolphinscheduler-api:"${DOLPHINSCHEDULER_VERSION}"
$ docker run -d --name dolphinscheduler-alert-server \
    -e DATABASE="postgresql" \
    -e SPRING_DATASOURCE_URL="jdbc:postgresql://localhost:5432/<DATABASE>" \
    -e SPRING_DATASOURCE_USERNAME="<USER>" \
    -e SPRING_DATASOURCE_PASSWORD="<PASSWORD>" \
    -e SPRING_JACKSON_TIME_ZONE="UTC" \
    -e REGISTRY_ZOOKEEPER_CONNECT_STRING="localhost:2181" \
    --net host \
    -d apache/dolphinscheduler-alert-server:"${DOLPHINSCHEDULER_VERSION}"
```

> 注意：如果你本地还没有对应的数据库和 ZooKeeper 服务，但是想要尝试这个启动方式，可以先安装并启动
> [PostgreSQL](https://www.postgresql.org/download/)(8.2.15+) 以及 [ZooKeeper](https://zookeeper.apache.org/releases.html)(3.8.0)

## 登录系统

不管你是用那种方式启动的服务，只要服务启动后，你都可以通过 [http://localhost:12345/dolphinscheduler/ui](http://localhost:12345/dolphinscheduler/ui)
访问 DolphinScheduler。访问上述链接后会跳转到登陆页面，DolphinScheduler 默认的用户和密码分别为 `admin` 和 `dolphinscheduler123`。
想要了解更多操作请参考用户手册[快速上手](../start/quick-start.md)。

![login](../../img/new_ui/dev/quick-start/login.png)

> 注意：如果你使用沿用已有的 PostgreSQL 和 ZooKeeper 服务方式启动服务，且服务分布在多台机器中，
> 请将上述的地址改成你 API 容器启动的 hostname 或者 IP。

## 环境变量

可以通过环境变量来修改 Docker 运行的配置，我们在沿用已有的 PostgreSQL 和 ZooKeeper 服务中就通过环境变量修改了 Docker 的数据库配置和
注册中心配置，关于全部的配置环境可以查看对应组件的 application.yaml 文件了解。


---

## guide/start/quick-start.md

# 快速上手

在本节中，我们将使用 DolphinScheduler 逐步创建和运行一个简单的工作流。 在这段旅程中，您将学习 DolphinScheduler 的基本概念，
并了解运行工作流的最基本配置。 我们在本教程中提供了视频和文字两种方式，您可以选择您喜欢的方式

## 视频教程

[![image](https://user-images.githubusercontent.com/15833811/126286960-dfb3bfee-c8fb-4bdf-a717-d3be221c9711.png)](https://www.bilibili.com/video/BV1d64y1s7eZ)

## 图文教程

### 设置 Dolphinscheduler

在继续之前，您必须先安装并启动 dolphinscheduler。 对于初学者，我们建议设置 dolphionscheduler 与官方 Docker image 或 standalone server。

* [standalone server](../installation/standalone.md)
* [docker](./docker.md)

### 构建您的第一个工作流程

您可以使用默认用户名/密码 http://localhost:12345/dolphinscheduler/ui 登录 dolphinscheduler 是“admin/dolphinscheduler123”。

#### 创建租户

Tenant是使用DolphinScheduler时绕不开的一个概念，所以先简单介绍一下tenant的概念。

登录 DolphinScheduler 名为 admin 的帐户在 dolphinscheduler 中称为 user。 为了更好的控制系统资源，DolphinScheduler引入了概念租户，用于执行任务。

简述如下：

* 用户：登录web UI，在web UI中进行所有操作，包括工作流管理和租户创建。
* Tenant：任务的实际执行者，A Linux user for DolphinScheduler worker。

我们可以在 DolphinScheduler `Security -> Tenant Manage` 页面创建租户。

> ![create-tenant](../../img/start/create-tenant.gif)
>
> 注意：如果没有关联租户，则会使用默认租户，默认租户为default，会使用程序启动用户执行任务。

#### 将租户分配给用户

正如我们上面在创建租户中谈到的，用户只能运行任务除非用户被分配给租户。

我们可以在 DolphinScheduler 的“安全 -> 用户管理”页面中将租户分配给特定用户。

![assign-tenant](../../img/start/assign-tenant.gif)

在我们创建一个租户并将其分配给一个用户之后，我们可以开始创建一个 DolphinScheduler 中的简单工作流程。

#### 创建项目

但是在 DolphinScheduler 中，所有的工作流都必须属于一个项目，所以我们需要首先创建一个项目。

我们可以通过单击在 DolphinScheduler `Project` 页面中创建一个项目 “创建项目” 按钮。

![create-project](../../img/start/create-project.gif)

#### 创建工作流

现在我们可以为项目“tutorial”创建一个工作流程。 点击我们刚刚创建的项目，转到“工作流定义”页面，单击“创建工作流”按钮，我们将重定向到工作流详细信息页面。

![create-workflow](../../img/start/create-workflow.gif)

#### 创建任务

我们可以使用鼠标从工作流画布的工具栏中拖动要创建的任务。 在这种情况下，我们创建一个 `Shell` 任务。 输入任务的必要信息，对于这个简单的工作流程
我们只需将属性“节点名称”填充为“脚本”即可。之后，我们可以单击“保存”按钮将任务保存到工作流中。 我们创建另一个任务使用相同的方式。

![create-task](../../img/start/create-task.gif)

#### 设置任务依赖

因此，我们有两个具有不同名称和命令的不同任务在工作流中运行。 这当前工作流中唯一缺少的是任务依赖性。 我们可以使用添加依赖，鼠标将箭头从上游任务拖到下游
然后松开鼠标。您可以看到从上游创建了两个任务之间带有箭头的链接任务交给下游一个。 最后，我们可以点击右上角的“保存”按钮保存工作流，不要忘记填写工作流名称。

![set-dependence](../../img/start/set-dep.gif)

#### 运行工作流

全部完成后，我们可以通过单击“在线”然后单击“运行”按钮来运行工作流工作流列表。 如果您想查看工作流实例，只需转到 “工作流实例” 页面，可以看到工作流实例正在运行，状态为`Executing`。

![run-workflow](../../img/start/run-workflow.gif)

#### 查看日志

如需查看任务日志，请从工作流实例中点击工作流实例列表，然后找到要查看日志的任务，右击鼠标选择`View Log` 从上下文对话框中，您可以看到任务的详细日志。

您可以在任务中打印 `Hello DolphinScheduler` 和 `Ending...` 这和我们一样定义 在创建任务中。

![view-log](../../img/start/view-log.gif)

你刚刚完成了 DolphinScheduler 的第一个教程，你现在可以运行一些简单的工作流在 DolphinScheduler 中，恭喜！


---

## guide/task/aliyun-serverless-spark.md

# Aliyun EMR Serverless Spark

## 简介

`Aliyun EMR Serverless Spark` 任务插件用于向
[`阿里云EMR Serverless Spark`](https://help.aliyun.com/zh/emr/emr-serverless-spark/product-overview/what-is-emr-serverless-spark) 服务提交作业。

## 创建链接

- 点击 `数据源 -> 创建数据源 -> ALIYUN_SERVERLESS_SPARK` 创建链接。

![demo-aliyun-serverless-spark-create-datasource-1](../../img/tasks/demo/aliyun_serverless_spark_1.png)

- 填入 `Datasource Name`, `Access Key Id`, `Access Key Secret`, `Region Id` 参数并且点击 `确认`.

![demo-aliyun-serverless-spark-create-datasource-2](../../img/tasks/demo/aliyun_serverless_spark_2.png)

## 创建任务节点

- 点击 `项目 -> 工作流定义 -> 创建工作流` 并且将 `ALIYUN_SERVERLESS_SPARK` 任务拖到画板中。

![demo-aliyun-serverless-spark-create-task-1](../../img/tasks/demo/aliyun_serverless_spark_3.png)

- 填入相关任务参数并且点击 `确认` 创建任务节点。

![demo-aliyun-serverless-spark-create-task-2](../../img/tasks/demo/aliyun_serverless_spark_4.png)

## 任务参数

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|        **任务参数**         |                          **描述**                          |
|-------------------------|----------------------------------------------------------|
| Datasource types        | 链接类型，应该选择 `ALIYUN_SERVERLESS_SPARK`。                     |
| Datasource instances    | `ALIYUN_SERVERLESS_SPARK` 链接实例。                          |
| workspace id            | `Aliyun Serverless Spark` 工作空间id。                        |
| resource queue id       | `Aliyun Serverless Spark` 任务队列id。                        |
| code type               | `Aliyun Serverless Spark` 任务类型，可以是`JAR`、`PYTHON`或者`SQL`。 |
| job name                | `Aliyun Serverless Spark` 任务名。                           |
| entry point             | 任务代码（JAR包、PYTHON / SQL脚本）的位置，支持OSS中的文件。                  |
| entry point arguments   | 主程序入口参数。                                                 |
| spark submit parameters | Spark-submit相关参数。                                        |
| engine release version  | Spark引擎版本。                                               |
| is production           | Spark任务是否运行在生产环境中。                                       |

## 示例

### 提交jar类型任务

|         **参数名**         |                                                                                            **参数值 / 按钮操作**                                                                                            |
|-------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| region id               | cn-hangzhou                                                                                                                                                                                          |
| access key id           | <your-access-key-id>                                                                                                                                                                                 |
| access key secret       | <your-access-key-secret>                                                                                                                                                                             |
| resource queue id       | root_queue                                                                                                                                                                                           |
| code type               | JAR                                                                                                                                                                                                  |
| job name                | ds-emr-spark-jar                                                                                                                                                                                     |
| entry point             | oss://datadev-oss-hdfs-test/spark-resource/examples/jars/spark-examples_2.12-3.3.1.jar                                                                                                               |
| entry point arguments   | 100                                                                                                                                                                                                  |
| spark submit parameters | --class org.apache.spark.examples.SparkPi --conf spark.executor.cores=4 --conf spark.executor.memory=20g --conf spark.driver.cores=4 --conf spark.driver.memory=8g --conf spark.executor.instances=1 |
| engine release version  | esr-2.1-native (Spark 3.3.1, Scala 2.12, Native Runtime)                                                                                                                                             |
| is production           | 请您将按钮打开                                                                                                                                                                                              |

### 提交sql类型任务

|         **参数名**         |                                                                                                       **参数值 / 按钮操作**                                                                                                        |
|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| region id               | cn-hangzhou                                                                                                                                                                                                                 |
| access key id           | <your-access-key-id>                                                                                                                                                                                                        |
| access key secret       | <your-access-key-secret>                                                                                                                                                                                                    |
| resource queue id       | root_queue                                                                                                                                                                                                                  |
| code type               | SQL                                                                                                                                                                                                                         |
| job name                | ds-emr-spark-sql-1                                                                                                                                                                                                          |
| entry point             | 任意非空值                                                                                                                                                                                                                       |
| entry point arguments   | -e#show tables;show tables;                                                                                                                                                                                                 |
| spark submit parameters | --class org.apache.spark.sql.hive.thriftserver.SparkSQLCLIDriver --conf spark.executor.cores=4 --conf spark.executor.memory=20g --conf spark.driver.cores=4 --conf spark.driver.memory=8g --conf spark.executor.instances=1 |
| engine release version  | esr-2.1-native (Spark 3.3.1, Scala 2.12, Native Runtime)                                                                                                                                                                    |
| is production           | 请您将按钮打开                                                                                                                                                                                                                     |

### 提交oss中的sql脚本任务

|         **参数名**         |                                                                                                        **参数值 / 按钮操作**                                                                                                        |
|-------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| region id               | cn-hangzhou                                                                                                                                                                                                                  |
| access key id           | <your-access-key-id>                                                                                                                                                                                                         |
| access key secret       | <your-access-key-secret>                                                                                                                                                                                                     |
| resource queue id       | root_queue                                                                                                                                                                                                                   |
| code type               | SQL                                                                                                                                                                                                                          |
| job name                | ds-emr-spark-sql-2                                                                                                                                                                                                           |
| entry point             | 任意非空值                                                                                                                                                                                                                        |
| entry point arguments   | -f#oss://datadev-oss-hdfs-test/spark-resource/examples/sql/show_db.sql                                                                                                                                                       |
| spark submit parameters | --class org.apache.spark.sql.hive.thriftserver.SparkSQLCLIDriver --conf spark.executor.cores=4 --conf spark.executor.memory=20g --conf spark.driver.cores=4 --conf spark.driver.memory=8g --conf spark.executor.instances=1" |
| engine release version  | esr-2.1-native (Spark 3.3.1, Scala 2.12, Native Runtime)                                                                                                                                                                     |
| is production           | 请您将按钮打开                                                                                                                                                                                                                      |

### 提交pyspark任务

|         **参数名**         |                                                                       **参数值 / 按钮操作**                                                                       |
|-------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------|
| region id               | cn-hangzhou                                                                                                                                                |
| access key id           | <your-access-key-id>                                                                                                                                       |
| access key secret       | <your-access-key-secret>                                                                                                                                   |
| resource queue id       | root_queue                                                                                                                                                 |
| code type               | PYTHON                                                                                                                                                     |
| job name                | ds-emr-spark-python                                                                                                                                        |
| entry point             | oss://datadev-oss-hdfs-test/spark-resource/examples/src/main/python/pi.py                                                                                  |
| entry point arguments   | 100                                                                                                                                                        |
| spark submit parameters | --conf spark.executor.cores=4 --conf spark.executor.memory=20g --conf spark.driver.cores=4 --conf spark.driver.memory=8g --conf spark.executor.instances=1 |
| engine release version  | esr-2.1-native (Spark 3.3.1, Scala 2.12, Native Runtime)                                                                                                   |
| is production           | 请您将按钮打开                                                                                                                                                    |


---

## guide/task/appendix.md

# DolphinScheduler任务参数附录

`DolphinScheduler`任务插件有一些公共参数，我们将这些公共参数列在文档中供您查阅。每种任务都有如下的所有或者**部分**默认参数：

## 默认任务参数

| **任务参数** |                                                                **描述**                                                                |
|----------|--------------------------------------------------------------------------------------------------------------------------------------|
| 任务名称     | 任务的名称，同一个工作流定义中的节点名称不能重复。                                                                                                            |
| 运行标志     | 标识这个节点是否需要调度执行，如果不需要执行，可以打开禁止执行开关。                                                                                                   |
| 缓存执行     | 标识这个节点是否需要进行缓存，如果缓存，则对于相同标识（相同任务版本，相同任务定义，相同参数传入）的任务进行缓存，运行时若已经存在缓存过的任务时，不再重复执行，直接复用结果。                                              |
| 描述       | 当前节点的功能描述。                                                                                                                           |
| 任务优先级    | worker线程数不足时，根据优先级从高到低依次执行任务，优先级一样时根据先到先得原则执行。                                                                                       |
| Worker分组 | 设置分组后，任务会被分配给worker组的机器机执行。若选择Default，则会随机选择一个worker执行。                                                                              |
| 任务组名称    | 任务资源组，未配置则不生效。                                                                                                                       |
| 组内优先级    | 一个任务组内此任务的优先级。                                                                                                                       |
| 环境名称     | 配置任务执行的环境。                                                                                                                           |
| 失败重试次数   | 任务失败重新提交的次数，可以在下拉菜单中选择或者手动填充。                                                                                                        |
| 失败重试间隔   | 任务失败重新提交任务的时间间隔，可以在下拉菜单中选择或者手动填充。                                                                                                    |
| CPU 配额   | 为执行的任务分配指定的CPU时间配额，单位为百分比，默认-1代表不限制，例如1个核心的CPU满载是100%，16个核心的是1600%。 [task.resource.limit.state](../../architecture/configuration.md) |
| 最大内存     | 为执行的任务分配指定的内存大小，超过会触发OOM被Kill同时不会进行自动重试，单位MB，默认-1代表不限制。该功能由 [task.resource.limit.state](../../architecture/configuration.md) 控制。     |
| 超时告警     | 设置超时告警、超时失败。当任务超过"超时时长"后，会发送告警邮件并且任务执行失败。该功能由 [task.resource.limit.state](../../architecture/configuration.md) 控制。                   |
| 资源       | 任务执行时所需资源文件                                                                                                                          |
| 前置任务     | 设置当前任务的前置（上游）任务。                                                                                                                     |
| 延时执行时间   | 任务延迟执行的时间，以分为单位                                                                                                                      |


---

## guide/task/chunjun.md

# ChunJun节点

## 综述

ChunJun 任务类型，用于执行 ChunJun 程序。对于 ChunJun 节点，worker 会通过执行 `${CHUNJUN_HOME}/bin/start-chunjun` 来解析传入的 json 文件。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的<img src="../../../../img/tasks/icons/chunjun.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                           **描述**                           |
|----------|------------------------------------------------------------|
| 自定义模板    | 自定义 ChunJun 节点的 json 配置文件内容，当前支持此种方式。                      |
| json     | ChunJun 同步的 json 配置文件。                                     |
| 自定义参数    | 用户自定义参数，会替换脚本中以 ${变量} 的内容。                                 |
| 部署方式     | 执行ChunJun任务的方式，比如local，standalone等。                        |
| 选项参数     | 支持 `-confProp "{\"flink.checkpoint.interval\":60000}"` 格式。 |

## 任务样例

该样例演示为从 Hive 数据导入到 MySQL 中。

### 在 DolphinScheduler 中配置 ChunJun 环境

若生产环境中要是使用到 ChunJun 任务类型，则需要先配置好所需的环境。配置文件如下：`/dolphinscheduler/conf/env/dolphinscheduler_env.sh`。

![chunjun_task01](../../img/tasks/demo/chunjun_task01.png)

当环境配置完成之后，需要重启 DolphinScheduler。

### 配置 ChunJun 任务节点

从 Hive 中读取数据，所以需要自定义 json，可参考：[Hive Json Template](https://github.com/DTStack/chunjun/blob/master/chunjun-examples/json/hive/binlog_hive.json)


---

## guide/task/conditions.md

# Conditions 节点

Conditions 是一个条件节点，根据上游任务运行状态，判断应该运行哪个下游任务。截止目前 Conditions 支持多个上游任务，但只支持两个下游任务。当上游任务数超过一个时，可以通过`且`以及`或`操作符实现复杂上游依赖

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏中的<img src="../../../../img/conditions.png" width="20"/>任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                                                                **描述**                                                                 |
|----------|---------------------------------------------------------------------------------------------------------------------------------------|
| 下游任务选择   | 根据前置任务的状态来跳转到对应的分支：成功分支 - 当上游运行成功时，运行成功选择的分支；失败分支 - 当上游运行失败时，运行失败选择的分支                                                                |
| 上游条件选择   | 可以为 Conditions 任务选择一个或多个上游任务：增加上游依赖 - 通过选择第一个参数选择对应的任务名称，通过第二个参数选择触发的 Conditions 任务的状态；上游任务关系选择 - 当有多个上游任务时，可以通过`且`以及`或`操作符实现任务的复杂关系。 |

## 相关任务

[switch](switch.md)：Condition节点主要依据上游节点的执行状态（成功、失败）执行对应分支。[Switch](switch.md)节点主要依据全局变量的值和用户所编写的表达式判断结果执行对应分支

## 任务样例

该样例通过使用 [Shell](shell.md) 任务来演示 Condition 任务的操作流程。

### 1、创建工作流

进入工作流定义页面，然后分别创建如下任务节点：

- Node_A：Shell 任务，打印输出 ”hello world“，其主要作用是 Condition 的上游分支，根据其执行是否成功来触发对应的分支节点。
- Condition：Conditions 任务，根据上游任务的执行状态，来执行对应的分支。
- Node_Success：Shell 任务，打印输出 “success”，Node_A 执行成功的分支。
- Node_False：Shell 任务，打印输出 ”false“，Node_A 执行失败的分支。

![condition_task01](../../img/tasks/demo/condition_task01.png)

### 2、查看执行结果

当完成创建工作流之后，可以上线运行该工作流。在工作流实例页面可以查看到各个任务的执行状态。如下图所示：

![condition_task02](../../img/tasks/demo/condition_task02.png)

上图中，任务状态标记为绿色对号的，即为成功执行的任务节点。

## 注意事项

- Conditions 任务支持多个上游任务，但只支持两个下游任务。
- Conditions 任务以及包含该任务的工作流不支持复制操作。
- Conditions 的前置任务不能连接其分支节点，会造成逻辑混乱，不符合 DAG 调度。如下图所示的情况是**错误**的。

![condition_task03](../../img/tasks/demo/condition_task03.png)
![condition_task04](../../img/tasks/demo/condition_task04.png)


---

## guide/task/datafactory.md

# Azure DataFactory 节点

## 综述

在大数据环境中，原始、散乱的数据通常存储在关系、非关系和其他存储系统中。[Azure DataFactory](https://learn.microsoft.com/en-us/azure/data-factory/introduction) 是为这些复杂的混合提取-转换-加载 (ETL)、提取-加载-转换 (ELT) 和数据集成项目而构建的托管云服务。

DolphinScheduler DataFactory 组件的功能:

- 创建 Azure DataFactory 任务可以调度DataFactory中的pipeline，持续获取执行状态，直至任务执行完成。

## 前置条件

- **资源组**: 拥有一个资源组
- **数据工厂**: 拥有一个资源组下的数据工厂
- **Pipeline**: 拥有前两者对应的pipeline
- **应用**: 拥有一个有数据工厂访问权限的应用，才能赋予SDK调用数据工厂
- **应用客户端密钥**: 在应用的`Certificates & secrets`申请客户端密钥
- **AZURE-CLI**: 在机器上安装了AZURE的鉴权应用AZURE-CLI，请参考[在LINUX上安装AZURE-CLI](https://learn.microsoft.com/en-us/cli/azure/install-azure-cli-linux)

### 应用权限设置

首先打开当前`Subscription`页面，点击`Access control (IAM)`，再点击`Add role assignment`进入授权页面。
![Subscription-IAM](../../img/tasks/demo/datafactory_auth1.png)
首先选择`Contributor`角色足够满足调用数据工厂。然后选择`Members`页面，再选择`Select members`，检索APP名称或APP的`Object ID`并添加，从给指定APP添加权限.
![Subscription-Role](../../img/tasks/demo/datafactory_auth2.png)

## 环境配置

需要进行Azure的一些配置，修改`common.properties`中的`azure`相关配置信息
- **resource.azure.client.id**: Azure Application应用的Application (client) ID
- **resource.azure.client.secret**: Azure Application应用的`Certificates & secrets`下的客户端密钥
- **resource.azure.subId**: 数据工厂的subscription ID
- **resource.azure.tenant.id**: Azure Active Directory下的tenant ID

```yaml
# The Azure client ID (Azure Application (client) ID)
resource.azure.client.id=minioadmin
# The Azure client secret in the Azure application
resource.azure.client.secret=minioadmin
# The Azure data factory subscription ID
resource.azure.subId=minioadmin
# The Azure tenant ID in the Azure Active Directory
resource.azure.tenant.id=minioadmin

```

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/datafactory.png" width="15"/> 任务节点到画板中。

## 任务样例

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

### 独有参数

- **factoryName**: 数据工厂名称
- **resourceGroupName**: 与数据工厂相关的资源组名称
- **pipelineName**: 选取数据工厂以及资源组下的对应pipeline名称

组件图示如下：

![data-factory](../../img/tasks/demo/datafactory.png)


---

## guide/task/datasync.md

# DataSync 节点

## 综述

[AWS DataSync](https://console.aws.amazon.com/datasync/) 是一种在线数据传输服务，可简化、自动化和加速本地存储系统和 AWS Storage 服务之间，以及不同 AWS Storage 服务之间的数据移动。

DataSync 支持的组件:

- Network File System (NFS) file servers
- Server Message Block (SMB) file servers
- Hadoop Distributed File System (HDFS)
- Object storage systems
- Amazon Simple Storage Service (Amazon S3) buckets
- Amazon EFS file systems
- Amazon FSx for Windows File Server file systems
- Amazon FSx for Lustre file systems
- Amazon FSx for OpenZFS file systems
- Amazon FSx for NetApp ONTAP file systems
- AWS Snowcone devices

DolphinScheduler DataSync 组件的功能:

- 创建 AWS DataSync 任务并启动，持续获取状态，直至任务执行完成。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/datasync.png" width="15"/> 任务节点到画板中。

## 任务样例

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

### 独有参数

- **name**: 任务名称
- **destinationLocationArn**: 目标 AWS 存储资源位置的 Amazon Resource Name (ARN) ，可见 [AWS API](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-DestinationLocationArn)
- **sourceLocationArn**: 源 AWS 存储资源位置的 Amazon Resource Name (ARN) ，可见 [AWS API](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-SourceLocationArn)
- **cloudWatchLogGroupArn**: 用来监控任务的Amazon CloudWatch任务组的 Amazon Resource Name (ARN) ，可见 [AWS API](https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn)

或

- **json**: 创建 datasync 任务的JSON结构任务参数，可以支持options等参数，可见 [AWS CreateTask API] 的 Request Syntax (https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html)

组件图示如下：

![datasync](../../img/tasks/demo/datasync_task01.png)

## 环境配置

需要进行AWS的一些配置，修改`common.properties`中的`xxxxx`为你的配置信息

```yaml
# Defines AWS access key and is required
resource.aws.access.key.id=<YOUR AWS ACCESS KEY>
# Defines AWS secret access key and is required
resource.aws.secret.access.key=<YOUR AWS SECRET KEY>
# Defines  AWS Region to use and is required
resource.aws.region=<AWS REGION>
```


---

## guide/task/datax.md

# DATAX 节点

## 综述

DataX 任务类型，用于执行 DataX 程序。对于 DataX 节点，worker 会通过执行 `${DATAX_LAUNCHER}` 来解析传入的 json 文件。

执行 datax 任务前需要在环境变量或者 `dolphinshceduler_env.sh` 中配置 `PYTHON_LAUNCHER` 和 `DATAX_LAUNCHER`，部分 datax 发行版只支持 python2.7。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的<img src="../../../../img/tasks/icons/datax.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                                                **描述**                                                 |
|----------|-------------------------------------------------------------------------------------------------------|
| json     | DataX 同步的 json 配置文件                                                                                   |
| 资源       | 在使用自定义json中如果集群开启了kerberos认证后，datax读取或者写入hdfs、hbase等插件时需要使用相关的keytab，xml文件等，则可使用改选项。资源中心-文件管理上传或创建的文件 |
| 自定义参数    | sql 任务类型，而存储过程是自定义参数顺序的给方法设置值自定义参数类型和数据类型同存储过程任务类型一样。区别在于SQL任务类型自定义参数会替换 sql 语句中 ${变量}                |
| 数据源      | 选择抽取数据的数据源                                                                                            |
| sql 语句   | 目标库抽取数据的 sql 语句，节点执行时自动解析 sql 查询列名，映射为目标表同步列名，源表和目标表列名不一致时，可以通过列别名（as）转换                              |
| 目标库      | 选择数据同步的目标库                                                                                            |
| 目标库前置    | 前置 sql 在 sql 语句之前执行（目标库执行）                                                                            |
| 目标库后置    | 后置 sql 在 sql 语句之后执行（目标库执行）                                                                            |
| 限流（字节数）  | 限制查询的字节数                                                                                              |
| 限流（记录数）  | 限制查询的记录数                                                                                              |

## 任务样例

该样例演示为从 Hive 数据导入到 MySQL 中。

### 在 DolphinScheduler 中配置 DataX 环境

若生产环境中要是使用到 DataX 任务类型，则需要先配置好所需的环境。配置文件如下：`/dolphinscheduler/conf/env/dolphinscheduler_env.sh`。

![datax_task01](../../img/tasks/demo/datax_task01.png)

当环境配置完成之后，需要重启 DolphinScheduler。

### 配置 DataX 任务节点

由于默认的的数据源中并不包含从 Hive 中读取数据，所以需要自定义 json，可参考：[HDFS Writer](https://github.com/alibaba/DataX/blob/master/hdfswriter/doc/hdfswriter.md)。其中需要注意的是 HDFS 路径上存在分区目录，在实际情况导入数据时，分区建议进行传参，即使用自定义参数。

在编写好所需的 json 之后，可按照下图步骤进行配置节点内容。

![datax_task02](../../img/tasks/demo/datax_task02.png)

### 查看运行结果

![datax_task03](../../img/tasks/demo/datax_task03.png)

## 注意事项：

若默认提供的数据源不满足需求，可在自定义模板选项中，根据实际使用环境来配置 DataX 的 writer 和 reader，可参考：https://github.com/alibaba/DataX


---

## guide/task/dependent.md

# Dependent 节点

## 综述

Dependent 节点，就是**依赖检查节点**。比如 A 流程依赖昨天的 B 流程执行成功，依赖节点会去检查 B 流程在昨天是否有执行成功的实例。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的<img src="../../../../img/tasks/icons/dependent.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                    **描述**                    |
|----------|----------------------------------------------|
| 添加依赖     | 配置依赖的上游任务.                                   |
| 检查间隔     | 检查依赖的上游任务状态间隔，默认10s.                         |
| 依赖失败策略   | 失败: 依赖的上游任务失败当前任务直接失败；等待: 依赖的上游任务失败当前任务继续等待； |
| 依赖失败等待时间 | 当依赖失败策略选择等待时，当前任务等待的时间.                      |

## 任务样例

Dependent 节点提供了逻辑判断功能，可以按照逻辑来检测所依赖节点的执行情况。

支持两种依赖模式，包括依赖于工作流和依赖于任务。依赖于任务的模式分依赖工作流中的所有任务和依赖单个任务两种情况。
依赖工作流的模式会检查所依赖的工作流的状态；依赖所有任务的模式会检查工作流中所有任务的状态；
依赖单个任务的模式会检查所依赖的任务的状态。

当 Dependent 节点结果为 success 且参数传递选项为 true 时，Dependent 节点会将该依赖项的输出参数输出给下游任务。当多个依赖项的参数名称相同时涉及到参数的优先级问题，详见[参数优先级](../parameter/priority.md)

例如，A 流程为周报任务，B、C 流程为天任务，A 任务需要 B、C 任务在上周执行成功，如图示：

![dependent_task01](../../img/tasks/demo/dependent_task01.png)

例如，A 流程为周报任务，B、C 流程为天任务，A 任务需要 B 或 C 任务在上周执行成功，如图示：

![dependent_task02](../../img/tasks/demo/dependent_task02.png)

假如，周报 A 同时还需要自身在上周二执行成功：

![dependent_task03](../../img/tasks/demo/dependent_task03.png)

> **注意**: 依赖周期中的本周和本月代表的是自然周和自然月内的整个周期，即本周为周一到今天，1 号到 今天 为一个月，以此类推。


---

## guide/task/dinky.md

# Dinky

## Overview

`Dinky`任务类型，用于创建并执行`Dinky`类型任务以支撑一站式的开发、调试、运维 FlinkSQL、Flink Jar、SQL。worker 执行该任务的时候，会通过`Dinky API`触发`Dinky 的作业`。
点击[这里](https://www.dinky.org.cn/) 获取更多关于`Dinky`的信息。

## Create Task

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入DAG编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/dinky.png" width="15"/> 到画板中，即可完成创建。

## Task Parameter

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|  **任务参数**   |                                   **描述**                                   |
|-------------|----------------------------------------------------------------------------|
| Dinky 地址    | Dinky 服务的 url，例如：`http://localhost:8888`。                                  |
| Dinky 任务 ID | Dinky 作业对应的唯一ID。                                                           |
| 上线作业        | 指定当前 Dinky 作业是否上线，如果是，则该被提交的作业只能处于已发布且当前无对应的 Flink Job 实例在运行才可提交成功。        |
| 自定义参数       | 从Dinky 1.0开始支持传递自定义参数，目前仅支持`IN`类型输入，不支持`OUT`类型输出。支持`${param}`方式获取全局或局部动态参数 |

## Task Example

### Dinky Task Example

这个示例展示了如何创建 Dinky 任务节点：

![demo-dinky](../../img/tasks/demo/dinky.png)

![demo-get-dinky-task-id](../../img/tasks/demo/dinky_task_id.png)


---

## guide/task/dms.md

# DMS 节点

## 综述

[AWS Database Migration Service (AWS DMS)](https://aws.amazon.com/cn/dms) 可帮助您快速并安全地将数据库迁移至 AWS。
源数据库在迁移过程中可继续正常运行，从而最大程度地减少依赖该数据库的应用程序的停机时间。
AWS Database Migration Service 可以在广泛使用的开源商业数据库之间迁移您的数据。

DMS任务组件帮助用户在DolphinScheduler中创建和启动DMS任务。

组件主要包含两个功能：
- 创建并启动迁移任务
- 重启已存在的迁移任务

组件的使用方式有两种：
- 通过界面创建
- 通过Json数据创建

DolphinScheduler 在 启动DMS 任务后，会跟中DMS任务状态，直至DMS任务完成后才将任务设为成功状态。除了以下情况：

不跟踪无结束时间的CDC任务，即 当迁移类型为 `full-load-and-cdc` 或者 `cdc` 时，且没有配置 `cdcStopPosition` 参数时，DolphinScheduler 在成功启动任务后，则会将任务状态设为 成功。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/dms.png" width="15"/> 任务节点到画板中。

## 任务样例

组件图示如下：

**创建并启动迁移任务（通过界面）**

![dms](../../img/tasks/demo/dms_create_and_start.png)

**重启已存在的迁移任务（通过界面）**

![dms](../../img/tasks/demo/dms_restart.png)

**创建并启动迁移任务（通过Json数据）**

![dms](../../img/tasks/demo/dms_create_and_start_json.png)

**重启已存在的迁移任务（通过Json数据）**

![dms](../../img/tasks/demo/dms_restart_json.png)

### 首先介绍一些DS通用参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

### DMS组件独有的参数

- **isRestartTask**：是否重启已存在的迁移任务
- **isJsonFormat**：是否使用Json格式的数据创建任务
- **jsonData**：Json格式的数据, 是有`isJsonFormat`为true时才会生效

创建并启动迁移任务时参数

- **migrationType**：迁移类型, 可选值为：[ `full-load`, `full-load-and-cdc`, `cdc`]
- **replicationTaskIdentifier**：迁移任务标识符, 任务名称
- **replicationInstanceArn**：迁移实例的ARN
- **sourceEndpointArn**：源端点的ARN
- **targetEndpointArn**：目标端点的ARN
- **tableMappings**：表映射

重启已存在的迁移任务时参数

- **replicationTaskArn**：迁移任务的ARN

## 环境配置

需要进行AWS的一些配置，修改`aws.yml`中的以下配置信息

```yaml
dms:
  # The AWS credentials provider type. support: AWSStaticCredentialsProvider, InstanceProfileCredentialsProvider
  # AWSStaticCredentialsProvider: use the access key and secret key to authenticate
  # InstanceProfileCredentialsProvider: use the IAM role to authenticate
  credentials.provider.type: AWSStaticCredentialsProvider
  access.key.id: <access.key.id>
  access.key.secret: <access.key.secret>
  region: <region>
  endpoint: <endpoint>
```


---

## guide/task/dvc.md

# DVC节点

## 综述

[DVC（Data Version Control）](https://dvc.org) 是一个MLops领域一个优秀的开机器学习版本管理系统。

DVC 组件用于在DS上使用DVC的数据版本管理功能，帮助用户简易地进行数据的版本管理。组件提供如下三个功能：

- Init DVC: 将git仓库初始化为DVC仓库，并绑定存储数据的地址用于存储实际的数据。
- Upload: 将特定数据添加或者更新到仓库中，并记录版本号。
- Download: 从仓库中下载特定版本的数据。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/dvc.png" width="15"/> 任务节点到画板中。

## 任务样例

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |            **描述**             |
|----------|-------------------------------|
| DVC任务类型  | 可以选择 Upload、Download、Init DVC |
| DVC仓库    | 任务执行时关联的仓库地址                  |

### Init DVC

将git仓库初始化为DVC仓库, 并绑定数据储存的地方。

项目初始化后，仍然为git仓库，不过添加了DVC的特性。

实际上数据并不保存在git仓库，而是存储在另外的地方，DVC会跟踪数据的版本和地址，并处理好这个关系。

![dvc_init](../../img/tasks/demo/dvc_init.png)

**任务参数**

- **数据存储地址**
  ：实际的数据保存的地址，支持的类型可见 [DVC supported storage types](https://dvc.org/doc/command-reference/remote/add#supported-storage-types)
  。

如上述例子表示： 将仓库 `git@github.com:<YOUR-NAME-OR-ORG>/dvc-data-repository-example.git` 初始化为DVC项目，并绑定远程储存地址为 `~/dvc`

### Upload

用于上传和更新数据，并记录版本号。

![dvc_upload](../../img/tasks/demo/dvc_upload.png)

**任务参数**

- **DVC仓库中的数据路径** ：上传的数据保存到仓库的地址。
- **Worker中数据路径** ：需要上传的数据的地址。
- **数据版本** ：上传数据后，为该版本数据打上的版本号，会保存到 git tag 里面。
- **数据版本信息** ：本次上传需要备注的信息。

如上述例子表示： 将数据 `/home/data/iris` 上传到仓库 `git@github.com:<YOUR-NAME-OR-ORG>/dvc-data-repository-example.git`
的根目录下，数据的文件/文件夹名字为`iris`。 然后执行 `git tag "iris_1.0" -m "init iris data"`。 记录版本号 `iris_1.0`和 版本信息 'inir iris data'

### Download

用于下载特定版本的数据。

![dvc_download](../../img/tasks/demo/dvc_download.png)

**任务参数**

- **DVC仓库中的数据路径** ：需要下载数据在仓库中的路径。
- **Worker中数据路径** ：数据下载到本地后的保存地址。
- **数据版本** ：需要下载的数据的版本。

如上述例子表示： 将仓库 `git@github.com:xxxx/dvc-data-repository-example.git` 版本为 `iris_1.0` 的 iris 的数据下载到 `~/dvc_test/iris`

## 环境准备

### dvc 安装

确保你已经安装DVC可以使用`pip install dvc`进行安装。

获取dvc地址, 并配置环境变量

下面以 conda 上的 python pip 安装为例子，配置 conda 的环境变量，使得组件能正确找到`dvc`命令

```shell
which dvc
# >> ~/anaconda3/bin/dvc
```

你需要进入admin账户配置一个conda环境变量（请提前[安装anaconda](https://docs.continuum.io/anaconda/install/)
或者[安装miniconda](https://docs.conda.io/en/latest/miniconda.html#installing) )。

![dvc_env_config](../../img/tasks/demo/dvc_env_config.png)

后续注意配置任务时，环境选择上面创建的conda环境，否则程序会找不到conda环境。

![dvc_env_name](../../img/tasks/demo/dvc_env_name.png)


---

## guide/task/emr.md

# Amazon EMR

## 综述

Amazon EMR 任务类型，用于在AWS上操作EMR集群并执行计算任务。
后台使用 [aws-java-sdk](https://aws.amazon.com/cn/sdk-for-java/) 将JSON参数转换为任务对象，提交到AWS，目前支持两种程序类型：

* `RUN_JOB_FLOW` 使用 [API_RunJobFlow](https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html#API_RunJobFlow_Examples) 提交 [RunJobFlowRequest](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/elasticmapreduce/model/RunJobFlowRequest.html) 对象
* `ADD_JOB_FLOW_STEPS` 使用 [API_AddJobFlowSteps](https://docs.aws.amazon.com/emr/latest/APIReference/API_AddJobFlowSteps.html#API_AddJobFlowSteps_Examples) 提交 [AddJobFlowStepsRequest](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/elasticmapreduce/model/AddJobFlowStepsRequest.html) 对象

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|     **任务参数**      |                                                                                                                                                          **描述**                                                                                                                                                          |
|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 程序类型              | 选择程序类型，如果是`RUN_JOB_FLOW`，则需要填写`jobFlowDefineJson`，如果是`ADD_JOB_FLOW_STEPS`，则需要填写`stepsDefineJson`                                                                                                                                                                                                                         |
| jobFlowDefineJson | [RunJobFlowRequest](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/elasticmapreduce/model/RunJobFlowRequest.html) 对象对应的JSON，详细JSON定义参见 [API_RunJobFlow_Examples](https://docs.aws.amazon.com/emr/latest/APIReference/API_RunJobFlow.html#API_RunJobFlow_Examples)                          |
| stepsDefineJson   | [AddJobFlowStepsRequest](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/elasticmapreduce/model/AddJobFlowStepsRequest.html) 对象对应的JSON，详细JSON定义参见 [API_AddJobFlowSteps_Examples](https://docs.aws.amazon.com/emr/latest/APIReference/API_AddJobFlowSteps.html#API_AddJobFlowSteps_Examples) |

## 任务样例

### 创建EMR集群并运行Steps

该样例展示了如何创建`RUN_JOB_FLOW`类型`EMR`任务节点，以执行`SparkPi`为例，该任务会创建一个`EMR`集群，并且执行`SparkPi`示例程序。
![RUN_JOB_FLOW](../../img/tasks/demo/emr_run_job_flow.png)

jobFlowDefineJson 参数样例

```json
{
  "Name": "SparkPi",
  "ReleaseLabel": "emr-5.34.0",
  "Applications": [
    {
      "Name": "Spark"
    }
  ],
  "Instances": {
    "InstanceGroups": [
      {
        "Name": "Primary node",
        "InstanceRole": "MASTER",
        "InstanceType": "m4.xlarge",
        "InstanceCount": 1
      }
    ],
    "KeepJobFlowAliveWhenNoSteps": false,
    "TerminationProtected": false
  },
  "Steps": [
    {
      "Name": "calculate_pi",
      "ActionOnFailure": "CONTINUE",
      "HadoopJarStep": {
        "Jar": "command-runner.jar",
        "Args": [
          "/usr/lib/spark/bin/run-example",
          "SparkPi",
          "15"
        ]
      }
    }
  ],
  "JobFlowRole": "EMR_EC2_DefaultRole",
  "ServiceRole": "EMR_DefaultRole"
}
```

### 向运行中的EMR集群添加Step

该样例展示了如何创建`ADD_JOB_FLOW_STEPS`类型`EMR`任务节点，以执行`SparkPi`为例，该任务会向运行中的`EMR`集群添加一个`SparkPi`示例程序。
![ADD_JOB_FLOW_STEPS](../../img/tasks/demo/emr_add_job_flow_steps.png)
![JobFlowId](../../img/tasks/demo/emr_jobFlowId.png)

stepsDefineJson 参数样例

```json
{
  "JobFlowId": "j-3V628TKAERHP8",
  "Steps": [
    {
      "Name": "calculate_pi",
      "ActionOnFailure": "CONTINUE",
      "HadoopJarStep": {
        "Jar": "command-runner.jar",
        "Args": [
          "/usr/lib/spark/bin/run-example",
          "SparkPi",
          "15"
        ]
      }
    }
  ]
}
```

## 注意事项：

- EMR 任务类型的故障转移尚未实现。目前，DolphinScheduler 仅支持对 yarn task type 进行故障转移。其他任务类型，如 EMR 任务、k8s 任务尚未准备好。
- `stepsDefineJson` 一个任务定义仅支持关联单个step，这样可以更好的保证任务状态的可靠性。


---

## guide/task/flink.md

# Flink节点

## 综述

Flink 任务类型，用于执行 Flink 程序。对于 Flink 节点：

1. 当程序类型为 Java、Scala 或 Python 时，worker 使用 Flink 命令提交任务 `flink run`。更多详情查看 [flink cli](https://nightlies.apache.org/flink/flink-docs-release-1.14/docs/deployment/cli/) 。

2. 当程序类型为 SQL 时，worker 使用`sql-client.sh` 提交任务。更多详情查看 [flink sql client](https://nightlies.apache.org/flink/flink-docs-master/docs/dev/table/sqlclient/) 。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/flink.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|    **任务参数**     |                                                                                                                   **描述**                                                                                                                   |
|-----------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 程序类型            | 支持 Java、Scala、 Python 和 SQL 四种语言                                                                                                                                                                                                           |
| 主函数的 Class      | Flink 程序的入口 Main Class 的**全路径**                                                                                                                                                                                                            |
| 主程序包            | 执行 Flink 程序的 jar 包（通过资源中心上传）                                                                                                                                                                                                               |
| 部署方式            | 支持 cluster、 local 和 application （Flink 1.11和之后的版本支持，参见 [Run an application in Application Mode](https://nightlies.apache.org/flink/flink-docs-release-1.11/ops/deployment/yarn_setup.html#run-an-application-in-application-mode)） 三种模式的部署 |
| 初始化脚本           | 用于初始化会话上下文的脚本文件                                                                                                                                                                                                                            |
| 脚本              | 用户开发的应该执行的 SQL 脚本文件                                                                                                                                                                                                                        |
| Flink 版本        | 根据所需环境选择对应的版本即可                                                                                                                                                                                                                            |
| 任务名称（选填）        | Flink 程序的名称                                                                                                                                                                                                                                |
| jobManager 内存数  | 用于设置 jobManager 内存数，可根据实际生产环境设置对应的内存数                                                                                                                                                                                                      |
| Slot 数量         | 用于设置 Slot 的数量，可根据实际生产环境设置对应的数量                                                                                                                                                                                                             |
| taskManager 内存数 | 用于设置 taskManager 内存数，可根据实际生产环境设置对应的内存数                                                                                                                                                                                                     |
| taskManager 数量  | 用于设置 taskManager 的数量，可根据实际生产环境设置对应的数量                                                                                                                                                                                                      |
| 并行度             | 用于设置执行 Flink 任务的并行度                                                                                                                                                                                                                        |
| Yarn 队列         | 用于设置 Yarn 队列，默认使用 default 队列                                                                                                                                                                                                               |
| 主程序参数           | 设置 Flink 程序的输入参数，支持自定义参数变量的替换                                                                                                                                                                                                              |
| 选项参数            | 设置Flink命令的选项参数，例如`-D`, `-C`, `-yt`                                                                                                                                                                                                         |
| 自定义参数           | 是 Flink 局部的用户自定义参数，会替换脚本中以 ${变量} 的内容                                                                                                                                                                                                       |

## 任务样例

### 执行 WordCount 程序

本案例为大数据生态中常见的入门案例，常应用于 MapReduce、Flink、Spark 等计算框架。主要为统计输入的文本中，相同的单词的数量有多少。（Flink 的 Releases 附带了此示例作业）

#### 在 DolphinScheduler 中配置 flink 环境

若生产环境中要是使用到 flink 任务类型，则需要先配置好所需的环境。配置文件如下：`bin/env/dolphinscheduler_env.sh`。

![flink-configure](../../img/tasks/demo/flink_task01.png)

#### 上传主程序包

在使用 Flink 任务节点时，需要利用资源中心上传执行程序的 jar 包，可参考[资源中心](../resource/configuration.md)。

当配置完成资源中心之后，直接使用拖拽的方式，即可上传所需目标文件。

![resource_upload](../../img/tasks/demo/upload_jar.png)

#### 配置 Flink 节点

根据上述参数说明，配置所需的内容即可。

![demo-flink-simple](../../img/tasks/demo/flink_task02.png)

### 执行 FlinkSQL 程序

根据上述参数说明，配置所需的内容即可。

![demo-flink-sql-simple](../../img/tasks/demo/flink_sql_test.png)

## 注意事项：

- Java 和 Scala 只是用来标识，没有区别，如果是 Python 开发的 Flink 则没有主函数的 class，其余的都一样。

- 使用 SQL 执行 Flink SQL 任务，目前只支持 Flink 1.13及以上版本。


---

## guide/task/hive-cli.md

# Hive CLI

## 综述

使用`Hive Cli任务插件`创建`Hive Cli`类型的任务执行SQL脚本语句或者SQL任务文件。
执行任务的worker会通过`hive -e`命令执行hive SQL脚本语句或者通过`hive -f`命令执行`资源中心`中的hive SQL文件。

## Hive CLI任务 VS 连接Hive数据源的SQL任务

在DolphinScheduler中，我们有`Hive CLI任务插件`和`使用Hive数据源的SQL插件`提供用户在不同场景下使用，您可以根据需要进行选择。

- `Hive CLI任务插件`直接连接`HDFS`和`Hive Metastore`来执行hive类型的任务，所以需要能够访问到对应的服务。
  执行任务的worker节点需要有相应的`Hive` jar包以及`Hive`和`HDFS`的配置文件。
  但是在生产调度中，`Hive CLI任务插件`能够提供更可靠的稳定性。
- `使用Hive数据源的SQL插件`不需要您在worker节点上有相应的`Hive` jar包以及`Hive`和`HDFS`的配置文件，而且支持 `Kerberos`认证。
  但是在生产调度中，若调度压力很大，使用这种方式可能会遇到`HiveServer2`服务过载失败等问题。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入DAG编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/hivecli.png" width="15"/> 到画板中，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|   **任务参数**    |                       **描述**                        |
|---------------|-----------------------------------------------------|
| Hive Cli 任务类型 | Hive Cli任务执行方式，可以选择`FROM_SCRIPT`或者`FROM_FILE`。      |
| Hive SQL 脚本   | 手动填入您的Hive SQL脚本语句。                                 |
| Hive Cli 选项   | Hive Cli的其他选项，如`--verbose`来查看任务结果。                  |
| 资源            | 如果您选择`FROM_FILE`作为Hive Cli任务类型，您需要在资源中选择Hive SQL文件。 |

## 任务样例

### Hive CLI任务样例

下面的样例演示了如何使用`Hive CLI`任务节点执行Hive SQL脚本语句：

![demo-hive-cli-from-script](../../img/tasks/demo/hive_cli_from_script.png)

下面的样例演示了如何使用`Hive CLI`任务节点从资源中心的Hive SQL

![demo-hive-cli-from-file](../../img/tasks/demo/hive_cli_from_file.png)


---

## guide/task/http.md

# HTTP 节点

## 综述

该节点用于执行 http 类型的任务，此外还支持 http 请求校验等功能。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击”创建工作流”按钮，进入 DAG 编辑页面：

- 拖动工具栏的 <img src="../../../../img/tasks/icons/http_get.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |               **描述**                |
|----------|-------------------------------------|
| 请求地址     | http 请求 URL                         |
| 请求类型     | 支持 GET、POST、PUT、DELETE              |
| 请求参数     | 支持 Parameter、Body、Headers           |
| 校验条件     | 支持默认响应码、自定义响应码、内容包含、内容不包含           |
| 校验内容     | 当校验条件选择自定义响应码、内容包含、内容不包含时，需填写校验内容   |
| 自定义参数    | 是 http 局部的用户自定义参数，会替换脚本中以 ${变量} 的内容 |

## 任务输出参数

| **任务参数** |       **描述**        |
|----------|---------------------|
| response | VARCHAR, http请求返回结果 |

可以在下游任务中使用 ${taskName.response} 引用任务输出参数。

如，当前task1为http任务, 下游任务可以使用 `${task1.response}` 引用task1的输出参数

## 任务样例

HTTP 定义了与服务器交互的不同方法，最基本的方法有4种，分别是GET，POST, PUT, DELETE。这里我们使用 http 任务节点，演示使用 POST 向系统的登录页面发送请求，提交数据。

主要配置参数如下(以下参数均可通过内置参数替换)：

- URL：访问目标资源的地址，这里为系统的登录页面。
- 请求类型：GET、POST、PUT、DELETE
- Headers: 请求头信息，当前仅支持 application/json、application/x-www-form-urlencoded 格式，如输入其他格式默认会使用 application/json 格式。
- HTTP Parameters(GET、DELETE请求参数)
- HTTP Body(POST、PUT请求参数)
- 校验条件：默认响应码200、自定义响应码、内容包含、内容不包含
- 校验内容：校验条件为自定义响应码、内容包含、内容不包含时，需填写校验内容，校验内容为模糊匹配

![http_task](../../img/tasks/demo/http_post.png)


---

## guide/task/java.md

# JAVA 节点

## 综述

该节点用于执行`Java`类型的任务，支持使用`FAT_JAR`类型和`NORMAL_JAR`类型的`jar`包运行。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击”创建工作流”按钮，进入 DAG 编辑页面：

- 拖动工具栏的JAVA任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                            **描述**                             |
|----------|---------------------------------------------------------------|
| 模块路径     | 开启使用JAVA9+的模块化特性，把所有资源放入--module-path中，要求您的worker中的JDK版本支持模块化 |
| 主程序参数    | 作为普通Java程序main方法入口参数                                          |
| 虚拟机参数    | 配置启动虚拟机参数                                                     |
| 主类名      | 启动类的完整主类名(可选)                                                 |
| 主程序包     | 选择要运行程序的主程序包                                                  |
| 资源       | 可以是外部JAR包也可以是其他资源文件，它们都会被加入到类路径或模块路径中，您可以在自己的JAVA脚本中轻松获取      |

## 任务样例

java任务类型有两种运行模式，这里进行分别进行演示。

主要配置参数如下：

- 运行类型
- 模块路径
- 主程序参数
- 虚拟机参数
- 主程序包
- 资源文件

如图所示

- FAT_JAR类型

![java_task](../../img/tasks/demo/java_fat.png)

`FAT_JAR`即`uber-jar`，依赖和代码都在同一个`jar`中，只需选择这一个`jar`即可

- NORMAL_JAR类型

![java_task](../../img/tasks/demo/java_normal.png)

`normal1.jar`是程序运行的入口，`normal2.jar`是所需的依赖，需要用主程序包指定程序的入口，并且在资源文件中选择所有依赖和程序入口的`jar`文件，才能正确运行

## 注意事项

1. 基于安全原因，执行JAVA任务时，请使用环境管理功能配置JDK环境，例如`JAVA_HOME`等环境变量
2. `NORMAL_JAR` 应该提供主类名(可选)，`FAT_JAR` 不需要提供主类名。


---

## guide/task/jupyter.md

# Jupyter

## 综述

`Jupyter`任务类型，用于创建并执行`Jupyter`类型任务。worker 执行该任务的时候，会通过`papermill`执行`jupyter note`。
点击[这里](https://papermill.readthedocs.io/en/latest/) 获取更多关于`papermill`的信息。

## Conda虚拟环境配置

- 在`common.properties`配置`conda.path`，将其指向您的`conda.sh`。这里的`conda`应该是您用来管理您的 `papermill`和`jupyter`所在python环境的相同`conda`。
  点击 [这里](https://docs.conda.io/en/latest/) 获取更多关于`conda`的信息.
- `conda.path`默认设置为`/opt/anaconda3/etc/profile.d/conda.sh`。 如果您不清楚您的`conda`环境在哪里，只需要在命令行执行`conda info | grep -i 'base environment'`即可获得。

> 注意：`Jupyter任务插件`使用`source`命令激活conda环境，
> 如果您的租户没有`source`命令使用权限，`Jupyter任务插件`将无法使用。

## Python依赖管理

### 使用预装好的Conda环境

1. 手动或使用`shell任务`在您的目标机器上创建conda环境。
2. 在您的`jupyter任务`中，将`condaEnvName`设置为您在上一步创建的conda环境名。

### 使用打包的Conda环境

1. 使用 [Conda-Pack](https://conda.github.io/conda-pack/) 将您的conda环境打包成`tarball`.
2. 将您打包好的conda环境上传到`资源中心`.
3. 在您的`jupyter任务`资源设置中，添加您在上一步中上传的conda环境包，如`jupyter_env.tar.gz`.

> **_提示:_** 请您按照 [Conda-Pack](https://conda.github.io/conda-pack/) 官方指导打包conda环境，
> 正确打包出的conda环境包解压后文件目录结构应和下图完全一致：

```
.
├── bin
├── conda-meta
├── etc
├── include
├── lib
├── share
└── ssl
```

> 注意: 请严格按照上述`conda pack`指示操作，并且不要随意修改`bin/activate`。
> `Jupyter任务插件`使用`source`命令激活您打包的conda环境。
> 若您对使用`source`命令有安全性上的担忧，请使用其他方法管理您的python依赖。

### 由依赖需求文本文件临时构建

1. 在`资源中心`创建或上传`.txt`格式的python依赖需求文本文件。
2. 将`jupyter任务`中的`condaEnvName`参数设置成您的python依赖需求文本文件，如`requirements.txt`。
3. 在您`jupyter任务`的`资源`中选取您的python依赖需求文本文件，如`requirements.txt`。

如下是一个依赖需求文本文件的样例，通过该文件，`jupyter任务插件`会自动构建您的python依赖，并执行您的python代码，
执行完成后会自动释放临时构建的环境。

```text
fastjsonschema==2.15.3
fonttools==4.33.3
geojson==2.5.0
identify==2.4.11
idna==3.3
importlib-metadata==4.11.3
importlib-resources==5.7.1
ipykernel==5.5.6
ipython==8.2.0
ipython-genutils==0.2.0
jedi==0.18.1
Jinja2==3.1.1
json5==0.9.6
jsonschema==4.4.0
jupyter-client==7.3.0
jupyter-core==4.10.0
jupyter-server==1.17.0
jupyterlab==3.3.4
jupyterlab-pygments==0.2.2
jupyterlab-server==2.13.0
kiwisolver==1.4.2
MarkupSafe==2.1.1
matplotlib==3.5.2
matplotlib-inline==0.1.3
mistune==0.8.4
nbclassic==0.3.7
nbclient==0.6.0
nbconvert==6.5.0
nbformat==5.3.0
nest-asyncio==1.5.5
notebook==6.4.11
notebook-shim==0.1.0
numpy==1.22.3
packaging==21.3
pandas==1.4.2
pandocfilters==1.5.0
papermill==2.3.4
```

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入DAG编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/jupyter.png" width="15"/> 到画板中，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|         **任务参数**          |               **描述**               |
|---------------------------|------------------------------------|
| Conda Env Name            | Conda环境或打包的Conda环境包名称              |
| Input Note Path           | 输入的jupyter note模板路径                |
| Output Note Path          | 输出的jupyter note路径                  |
| Jupyter Parameters        | 用于对接jupyter note参数化的JSON格式参数       |
| Kernel                    | Jupyter notebook 内核                |
| Engine                    | 用于执行Jupyter note的引擎名称              |
| Jupyter Execution Timeout | 对于每个jupyter notebook cell设定的超时时间   |
| Jupyter Start Timeout     | 对于jupyter notebook kernel设定的启动超时时间 |
| Others                    | 传入papermill命令的其他参数                 |

## 任务样例

### 简单的Jupyter任务样例

这个示例展示了如何创建Jupyter任务节点：

![demo-jupyter-simple](../../img/tasks/demo/jupyter.png)


---

## guide/task/kubeflow.md

# Kubeflow

## 综述

[Kubeflow](https://www.kubeflow.org) 任务类型，用于在Kubeflow上创建任务。
后台主要使用 `kubectl` 命令来创建kubeflow任务, 并持续Kubeflow上资源状态直至任务完成。
目前主要支持通过使用yaml文件来创建kubeflow任务。 如果需要发布`kubeflow pipeline`任务可以使用[python任务类型](./python.md)。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/kubeflow.png" width="15"/> 任务节点到画板中。

## 任务样例

组件图示如下：

![kubeflow](../../img/tasks/demo/kubeflow.png)

### 首先介绍一些DS通用参数

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

### Kubeflow组件独有的参数

- **Namespace**：集群命名空间参数
- **yamlContent**：CRD YAML文件内容, 如：

```yaml
apiVersion: "kubeflow.org/v1"
kind: TFJob
metadata:
  name: tfjob-simple
  namespace: kubeflow-user-example-com
spec:
   tfReplicaSpecs:
     Worker:
       replicas: 2
       restartPolicy: OnFailure
       template:
         metadata:
           annotations:
             sidecar.istio.io/inject: "false"
         spec:
           containers:
             - name: tensorflow
               image: gcr.io/kubeflow-ci/tf-mnist-with-summaries:1.0
               command:
                 - "python"
                 - "/var/tf_mnist/mnist_with_summaries.py"
```

## 环境配置

**配置Kubernetes环境**

参考[集群管理和命名空间管理](../security/security.md)。

只需填写必填项即可，其他无需填写，资源管理依赖于具体Job中的YAML文件定义。

**kubectl**

安装[kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/)，并确保`kubectl`能正常提交任务到kubeflow。


---

## guide/task/kubernetes.md

# Kubernetes

## 综述

kubernetes任务类型，用于在kubernetes上执行一个短时和批处理的任务。worker最终会通过使用kubernetes client提交任务。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入DAG编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/kubernetes.png" width="25"/> 到画板中，选择需要连接的数据源，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                                                                                       **描述**                                                                                        |
|----------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 命名空间     | 选择kubernetes集群上存在的命名空间                                                                                                                                                              |
| 最小CPU    | 任务在kubernetes上运行所需的最小CPU                                                                                                                                                            |
| 最小内存     | 任务在kubernetes上运行所需的最小内存                                                                                                                                                             |
| 镜像       | 镜像地址                                                                                                                                                                                |
| 镜像拉取策略   | 镜像的拉取策略                                                                                                                                                                             |
| 容器执行命令   | 容器执行命令（yaml格式数组），例如：["printenv"]                                                                                                                                                    |
| 执行命令参数   | 执行命令参数（yaml格式数组），例如：["HOSTNAME", "KUBERNETES_PORT"]                                                                                                                                 |
| 自定义标签    | 作业自定义标签                                                                                                                                                                             |
| 节点选择器    | 定义Pod在kubernetes集群上运行的标签选择器，值集中不同表达式值使用逗号分割，例如：`value1,value2`，不同操作符配置方式可参考：https://kubernetes.io/zh-cn/docs/reference/kubernetes-api/common-definitions/node-selector-requirement/ |
| 自定义参数    | kubernetes任务局部的用户自定义参数，自定义参数最终会通过环境变量形式存在于容器中，提供给kubernetes任务使用                                                                                                                     |

## 任务样例

### 在 DolphinScheduler 中配置 kubernetes 集群环境

若生产环境中要是使用到 kubernetes 任务类型，则需要预先配置好所需的kubernetes集群环境

### 配置 kubernetes 任务节点

根据上述参数说明，配置所需的内容即可。

![kubernetes](../../img/tasks/demo/kubernetes-task-en.png)

## 注意事项

任务名字限制在小写字母、数字和-这三种字符之中


---

## guide/task/linkis.md

# Apache Linkis

## 综述

`Linkis` 任务类型，用于创建并执行 `Linkis` 类型任务。worker 执行该任务的时候，会通过 `linkis-cli` 执行命令行。
点击 [这里](https://linkis.apache.org/) 获取更多关于 `Apache Linkis` 的信息。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的<img src="../../../../img/tasks/icons/linkis.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。
- Linkis支持的参数列表请参考[linkis-cli任务参数](https://linkis.apache.org/zh-CN/docs/latest/user-guide/linkiscli-manual)`支持的参数列表`一栏。

## 任务样例

该样例演示为使用 Spark 引擎提交sql执行。

### 在 DolphinScheduler 中配置 Linkis 环境

若生产环境中要是使用到 Linkis 任务类型，则需要先配置好所需的环境，配置文件如下：`/dolphinscheduler/conf/env/dolphinscheduler_env.sh`。

![linkis_task01](../../img/tasks/demo/linkis_task01.png)

### 配置 Linkis 任务节点

根据上述参数说明，配置所需的内容即可。

![linkis_task02](../../img/tasks/demo/linkis_task02.png)

### Config 样例

```

sh ./bin/linkis-cli -engineType spark-2.4.3 -codeType sql -code "select count(*) from testdb.test;"  -submitUser hadoop -proxyUser hadoop 

```

### 注意事项

- 无需在配置栏里再填写`sh ./bin/linkis-cli`，已提前配置。
- 配置默认为异步提交，您无需再配置`--async`参数。


---

## guide/task/map-reduce.md

# MapReduce(MR) 节点

## 综述

MapReduce(MR) 任务类型，用于执行 MapReduce 程序。对于 MapReduce 节点，worker 会通过使用 Hadoop 命令 `hadoop jar` 的方式提交任务。更多详情查看 [Hadoop Command Manual](https://hadoop.apache.org/docs/r3.2.4/hadoop-project-dist/hadoop-common/CommandsManual.html#jar)。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入 DAG 编辑页面。
- 拖动工具栏中的 <img src="../../../../img/tasks/icons/mr.png" width="15"/> 任务节点到画板中，如下图所示：

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

### JAVA/SCALA 程序

|  **任务参数**  |                  **描述**                  |
|------------|------------------------------------------|
| 程序类型       | 选择 JAVA/SCALA 语言                         |
| 主函数的 Class | 是 MapReduce 程序的入口 Main Class 的**全路径**    |
| 主程序包       | 执行 MapReduce 程序的 jar 包                   |
| 任务名称（选填）   | MapReduce 任务名称                           |
| Yarn 队列    | 设置 Yarn 队列，默认使用 default                  |
| 命令行参数      | 是设置 MapReduce 程序的输入参数，支持自定义参数变量的替换       |
| 其他参数       | 支持 –D、-files、-libjars、-archives 格式       |
| 自定义参数      | 是 MapReduce 局部的用户自定义参数，会替换脚本中以 ${变量} 的内容 |

### Python 程序

| **任务参数** |                                                                                                                                    **描述**                                                                                                                                    |
|----------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 程序类型     | 选择 Python 语言                                                                                                                                                                                                                                                                 |
| 主 jar 包  | 是运行 MapReduce 的 Python jar 包                                                                                                                                                                                                                                                 |
| 其他参数     | 支持 –D、-mapper、-reducer、-input  -output格式，这里可以设置用户自定义参数的输入，比如：-mapper  "mapper.py 1"  -file mapper.py   -reducer reducer.py  -file reducer.py –input /journey/words.txt -output /journey/out/mr/${currentTimeMillis}，其中 -mapper 后的 mapper.py 1是两个参数，第一个参数是 mapper.py，第二个参数是 1 |
| 自定义参数    | 是 MapReduce 局部的用户自定义参数，会替换脚本中以 ${变量} 的内容                                                                                                                                                                                                                                     |

## 任务样例

### 执行 WordCount 程序

该样例为 MapReduce 应用中常见的入门类型，主要为统计输入的文本中，相同单词的数量有多少。

#### 在 DolphinScheduler 中配置 MapReduce 环境

若生产环境中要是使用到 MapReduce 任务类型，则需要先配置好所需的环境。配置文件如下：`bin/env/dolphinscheduler_env.sh`。

![mr_configure](../../img/tasks/demo/mr_task01.png)

#### 上传主程序包

在使用 MapReduce 任务节点时，需要利用资源中心上传执行程序的 jar 包。可参考[资源中心](../resource/configuration.md)。

当配置完成资源中心之后，直接使用拖拽的方式，即可上传所需目标文件。

![resource_upload](../../img/tasks/demo/upload_jar.png)

#### 配置 MapReduce 节点

根据上述参数说明，配置所需的内容即可。

![demo-mr-simple](../../img/tasks/demo/mr_task02.png)


---

## guide/task/mlflow.md

# MLflow节点

## 综述

[MLflow](https://mlflow.org) 是一个MLops领域一个优秀的开源项目， 用于管理机器学习的生命周期，包括实验、可再现性、部署和中心模型注册。

MLflow 组件用于执行 MLflow 任务，目前包含Mlflow Projects，和MLflow Models。（Model Registry将在不就的将来支持）。

- MLflow Projects: 将代码打包，并可以运行到任务的平台上。
- MLflow Models: 在不同的服务环境中部署机器学习模型。
- Model Registry: 在一个中央存储库中存储、注释、发现和管理模型 (你也可以在你的MLflow project 里面自行注册模型)。

目前 Mlflow 组件支持的和即将支持的内容如下中：

- MLflow Projects
  - BasicAlgorithm: 基础算法，包含LogisticRegression， svm， lightgbm， xgboost
  - AutoML: AutoML工具，包含autosklean， flaml
  - Custom projects: 支持运行自己的MLflow Projects项目
- MLflow Models
  - MLFLOW: 直接使用 `mlflow models serve` 部署模型。
  - Docker: 打包 DOCKER 镜像后部署模型。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/mlflow.png" width="15"/> 任务节点到画板中。

## 任务样例

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

以下是一些MLflow 组件的常用参数

|          **任务参数**          |                         **描述**                          |
|----------------------------|---------------------------------------------------------|
| MLflow Tracking Server URI | MLflow Tracking Server 的连接，默认 http://localhost:5000     |
| 实验名称                       | 任务运行时所在的实验，若实验不存在，则创建。若实验名称为空，则设置为`Default`，与 MLflow 一样 |

### MLflow Projects

#### BasicAlgorithm

![mlflow-conda-env](../../img/tasks/demo/mlflow-basic-algorithm.png)

| **任务参数** |                                                                                                                                                                                                                                                                                                  **描述**                                                                                                                                                                                                                                                                                                   |
|----------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 注册模型     | 是否注册模型，若选择注册，则会展开以下参数                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
| 注册的模型名称  | 注册的模型名称，会在原来的基础上加上一个模型版本，并注册为Production                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| 数据路径     | 文件/文件夹的绝对路径，若文件需以.csv结尾（自动切分训练集与测试集），文件夹需包含train.csv和test.csv（建议方式，用户应自行构建测试集用于模型评估）。详细的参数列表如下: [LogisticRegression](https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LogisticRegression.html#sklearn.linear_model.LogisticRegression)  [SVM](https://scikit-learn.org/stable/modules/generated/sklearn.svm.SVC.html?highlight=svc#sklearn.svm.SVC)  [lightgbm](https://lightgbm.readthedocs.io/en/latest/pythonapi/lightgbm.LGBMClassifier.html#lightgbm.LGBMClassifier)   [xgboost](https://xgboost.readthedocs.io/en/release_3.0.0/python/python_api.html#xgboost.XGBClassifier) |
| 算法       | 选择的算法，目前基于 [scikit-learn](https://scikit-learn.org/) 形式支持 `lr`，`svm`，`lightgbm`，`xgboost`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| 参数搜索空间   | 运行对应算法的参数搜索空间，可为空。如针对lightgbm 的 `max_depth=[5, 10];n_estimators=[100, 200]` 则会进行对应搜索。约定传入后会以;切分各个参数，等号前的名字作为参数名，等号后的名字将以python eval执行得到对应的参数值                                                                                                                                                                                                                                                                                                                                                                                                                                                             |

#### AutoML

![mlflow-automl](../../img/tasks/demo/mlflow-automl.png)

| **任务参数** |                                                                                                                                               **描述**                                                                                                                                               |
|----------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 注册模型     | 是否注册模型，若选择注册，则会展开以下参数                                                                                                                                                                                                                                                                              |
| 注册的模型名称  | 注册的模型名称，会在原来的基础上加上一个模型版本，并注册为Production                                                                                                                                                                                                                                                            |
| 数据路径     | 文件/文件夹的绝对路径，若文件需以.csv结尾（自动切分训练集与测试集），文件夹需包含train.csv和test.csv（建议方式，用户应自行构建测试集用于模型评估）                                                                                                                                                                                                               |
| 参数       | 初始化AutoML训练器时的参数，可为空，如针对 flaml 设置`time_budget=30;estimator_list=['lgbm']`。约定传入后会以; 切分各个参数，等号前的名字作为参数名，等号后的名字将以python eval执行得到对应的参数值。详细的参数列表如下: [flaml](https://microsoft.github.io/FLAML/docs/Use-Cases/Task-Oriented-AutoML)，[autosklearn](https://automl.github.io/auto-sklearn/master/api.html) |
| AutoML工具 | 使用的AutoML工具，目前支持 [autosklearn](https://github.com/automl/auto-sklearn)，[flaml](https://github.com/microsoft/FLAML)                                                                                                                                                                                 |

#### Custom projects

![mlflow-custom-project.png](../../img/tasks/demo/mlflow-custom-project.png)

| **任务参数** |                                                                       **描述**                                                                       |
|----------|----------------------------------------------------------------------------------------------------------------------------------------------------|
| 参数       | `mlflow run`中的 --param-list 如 `-P learning_rate=0.2 -P colsample_bytree=0.8 -P subsample=0.9`                                                      |
| 运行仓库     | MLflow Project的仓库地址，可以为github地址，或者worker上的目录，如MLflow project位于子目录，可以添加 `#` 隔开，如 `https://github.com/mlflow/mlflow#examples/xgboost/xgboost_native` |
| 项目版本     | 对应项目中git版本管理中的版本，默认 master                                                                                                                         |

现在你可以使用这个功能来运行github上所有的MLflow Projects (如 [MLflow examples](https://github.com/mlflow/mlflow/tree/master/examples) )了。你也可以创建自己的机器学习库，用来复用你的研究成果，以后你就可以使用DolphinScheduler来一键操作使用你的算法库。

### MLflow Models

| **任务参数** |                                **描述**                                 |
|----------|-----------------------------------------------------------------------|
| 部署模型的URI | MLflow 服务里面模型对应的URI，支持 `models:/<model_name>/suffix` 格式 和 `runs:/` 格式 |
| 监听端口     | 部署服务时的端口                                                              |

#### MLFLOW

![mlflow-models-mlflow](../../img/tasks/demo/mlflow-models-mlflow.png)

#### Docker

![mlflow-models-docker](../../img/tasks/demo/mlflow-models-docker.png)

## 环境准备

### conda 环境配置

请提前[安装anaconda](https://docs.continuum.io/anaconda/install/) 或者[安装miniconda](https://docs.conda.io/en/latest/miniconda.html#installing)

**方法A：**

配置文件：/dolphinscheduler/conf/env/dolphinscheduler_env.sh。

在文件最后添加内容

```
# 配置你的conda环境路径
export PATH=/opt/anaconda3/bin:$PATH
```

**方法B：**

你需要进入admin账户配置一个conda环境变量。

![mlflow-conda-env](../../img/tasks/demo/mlflow-conda-env.png)

后续注意配置任务时，环境选择上面创建的conda环境，否则程序会找不到conda环境。

![mlflow-set-conda-env](../../img/tasks/demo/mlflow-set-conda-env.png)

### MLflow service 启动

确保你已经安装MLflow，可以使用`pip install mlflow`进行安装。

在你想保存实验和模型的地方建立一个文件夹，然后启动 mlflow service。

```sh
mkdir mlflow
cd mlflow
mlflow server -h 0.0.0.0 -p 5000 --serve-artifacts --backend-store-uri sqlite:///mlflow.db
```

运行后会启动一个MLflow服务。

可以通过访问 MLflow service (`http://localhost:5000`) 页面查看实验与模型。

![mlflow-server](../../img/tasks/demo/mlflow-server.png)

### 内置算法仓库配置

如果遇到github无法访问的情况，可以修改`common.properties`配置文件的以下字段，将github地址替换能访问的地址。

```yaml
# mlflow task plugin preset repository
ml.mlflow.preset_repository=https://github.com/apache/dolphinscheduler-mlflow
# mlflow task plugin preset repository version
ml.mlflow.preset_repository_version="main"
```


---

## guide/task/openmldb.md

# OpenMLDB 节点

## 综述

[OpenMLDB](https://openmldb.ai/) 是一个优秀的开源机器学习数据库，提供生产级数据及特征开发全栈解决方案。

OpenMLDB任务组件可以连接OpenMLDB集群执行任务。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/openmldb.png" width="15"/> 任务节点到画板中。

## 任务样例

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|  **任务参数**   |                      **描述**                      |
|-------------|--------------------------------------------------|
| zookeeper地址 | OpenMLDB集群连接地址中的zookeeper地址, e.g. 127.0.0.1:2181 |
| zookeeper路径 | OpenMLDB集群连接地址中的zookeeper路径, e.g. /openmldb      |
| 执行模式        | 初始执行模式（离线/在线），你可以在sql语句中随时切换                     |
| SQL语句       | SQL语句                                            |

下面有几个例子：

#### 导入数据

![load data](../../img/tasks/demo/openmldb-load-data.png)

我们使用`LOAD DATA`语句导入数据到OpenMLDB集群。因为选择的是离线执行模式，所以将会导入数据到离线存储中。

#### 特征抽取

![fe](../../img/tasks/demo/openmldb-feature-extraction.png)

我们使用`SELECT INTO`进行特征抽取。因为选择的是离线执行模式，所以会使用离线引擎做特征计算。

## 环境准备

### OpenMLDB 启动

执行任务之前，你需要启动OpenMLDB集群。如果是在生产环境，请参考[deploy OpenMLDB](https://openmldb.ai/docs/zh/v0.5/deploy/install_deploy.html).

你可以参考[在docker中运行OpenMLDB集群](https://openmldb.ai/docs/zh/v0.5/quickstart/openmldb_quickstart.html#id11) 快速启动。

### Python 环境

OpenMLDB任务组件将使用OpenMLDB Python SDK来连接OpenMLDB。所以你需要Python环境。

我们默认使用`python3`，你可以通过配置`PYTHON_LAUNCHER`来设置自己的Python环境。

请确保已通过`pip install openmldb`，在worker server的主机中安装了OpenMLDB Python SDK。


---

## guide/task/python.md

# Python 节点

## 综述

Python 任务类型，用于创建 Python 类型的任务并执行一系列的 Python 脚本。worker 执行该任务的时候，会生成一个临时python脚本，
并使用与租户同名的 linux 用户执行这个脚本。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入DAG编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/python.png" width="15"/> 到画板中，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |              **描述**               |
|----------|-----------------------------------|
| 脚本       | 用户开发的PYTHON程序                     |
| 自定义参数    | 是PYTHON局部的用户自定义参数，会替换脚本中以${变量}的内容 |

## 任务样例

### 简单打印一行文字

该样例模拟了常见的简单任务，这些任务只需要简单的一两行命令就能运行起来。我们以打印一行日志为例，该任务仅会在日志文件中打印一行
"This is a demo of python task"

![demo-python-simple](../../img/tasks/demo/python_ui_next.jpg)

```python
print("This is a demo of python task")
```

### 使用自定义参数

该样例模拟了自定义参数任务，为了更方便的复用已有的任务，或者面对动态的需求时，我们会使用变量保证脚本的复用性。本例中，我们先在自定义脚本
中定义了参数 "param_key"，并将他的值设置为 "param_val"。接着在"脚本"中使用了 print 函数，将参数 "param_key" 打印了出来。当我们保存
并运行任务后，在日志中会看到将参数 "param_key" 对应的值 "param_val" 打印出来。

![demo-python-custom-param](../../img/tasks/demo/python_custom_param_ui_next.jpg)

```python
print("${param_key}")
```

## 注意事项

None


---

## guide/task/pytorch.md

# Pytorch 节点（试验版）

## 综述

[Pytorch](https://pytorch.org) 是一个的主流Python机器学习库。

为了用户能够在DolphinScheduler中**更方便的运行Pytorch项目**，实现了Pytorch任务组件。主要提供**便捷的python环境管理**以及支持**运行python项目**。

与Python任务组件不同，该组件允许用户快速使用已有python环境或者创建新的python环境（使用virtualenv或者conda）；支持运行Python项目（本地项目或者Git项目）而非只是python脚本。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/pytorch.png" width="15"/> 任务节点到画板中。

## 任务样例

组件图示如下：

![pytorch](../../img/tasks/demo/pytorch_en.png)

### Pytorch参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

#### 运行参数

| **任务参数** |      **描述**       |
|----------|-------------------|
| python脚本 | 需要运行的python脚本文件入口 |
| 脚本启动参数   | 运行时的输入参数          |

以上为两个最小化配置运行的参数，另外提供其他的一些配置参数如下可选，当选择展开更多配置时，可以配置更多参数。

|  **任务参数**  |                                                                                                         **描述**                                                                                                          |
|------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| python项目地址 | 设置`PYTHONPATH`环境变量，设置后运行python脚本时可以加载该地址下的python包/项目代码。支持本地路径或者Git url。若为本地路径，作为`PYTHONPATH`环境变量，如果为Git URL （以`git@ | https:// | http:// `前缀），则会下载项目，并将下载后存放地址作为新的**python项目地址**，若需要运行子文件夹下的项目，可以添加 `#subdirectory` 来配置 |

#### python环境参数

|   **任务参数**   |                                                                            **描述**                                                                             |
|--------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 是否创建新环境      | 是否创建新的python环境来运行该任务                                                                                                                                          |
| python命令路径   | 如`/usr/bin/python`，默认为DS环境配置中的`${PYTHON_LAUNCHER}`                                                                                                            |
| python环境管理工具 | 可以选择virtualenv或者conda，若选择`virtualenv`，则会用`virtualenv`创建一个新环境，使用命令 `virtualenv -p ${PYTHON_LAUNCHER} venv` 创建；若选择`conda`, 则会使用`conda` 创建一个新环境，并需要指定创建的python版本 |
| 依赖文件         | 默认为 requirements.txt                                                                                                                                          |

配置了`python项目地址`参数，那么`python脚本`和`依赖文件`参数允许输入相对路径

#### Demo

如现在需要运行 https://github.com/pytorch/examples 项目下的mnist的子项目。

可以设置

![pytorch_note](../../img/tasks/demo/pytorch_note_en.png)

另外如果代码存放在资源中心，则可以使用`资源`参数下载代码，并将相关参数写成对应资源的路径即可。

## 环境配置

环境配置主要取决于运行时python环境的选择，需要在`安全中心`-`环境管理`中配置对应需要的环境变量即可。

### 指定python路径

适用于worker上已经有运行该项目的python环境，那么可以直接在组件中配置`pyhton命令路径`为对应的python环境即可，如果不知道该环境地址，可以使用`which python`获取。

### 使用Conda创建新环境

适用于新建环境运行该项目，需要在`安全中心`-`环境管理`中创建环境, 参考如下添加修改为实际环境即可。

```shell
# conda命令对应的目录加入PATH中
export PATH=$HOME/anaconda3/bin:$PATH
```

### 使用virtualenv创建新环境

适用于新建环境运行该项目，需要在`安全中心`-`环境管理`中创建环境, 参考如下添加修改为实际环境即可。

```shell
# virtualenv命令对应的目录加入PATH中
export PATH=/home/lucky/anaconda3/bin:$PATH
export PYTHON_LAUNCHER=/usr/local/bin/python3.7
```

## 其他

本组件也可以运行xgboost, lightgbm, sklearn, tensorflow, keras 等项目。本组件可作为python组件运行机器学习任务的升级组件。

如果有需要，后续建议可以统一涵盖为PythonML组件，来运行机器学习项目。


---

## guide/task/remoteshell.md

# RemoteShell

## 综述

RemoteShell 任务类型，用于在远程服务器上执行命令。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入 DAG 编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/remoteshell.png" width="15"/> 到画板中，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。
- SSH Data Source: 选择SSH 数据源。

## 任务样例

### 查看远程服务器(remote-server)的路径

![remote-shell-demo](../../img/tasks/demo/remote-shell.png)

## 注意事项

该任务连接服务器后，不会自动source bashrc等文件，所需的环境变量，可以通过以下方式导入
- 在安全中心-环境管理中创建环境变量，然后通过任务定义中的环境选项引入
- 在脚本中直接输入对应的环境变量


---

## guide/task/sagemaker.md

# SageMaker 节点

## 综述

[Amazon SageMaker](https://aws.amazon.com/cn/pm/sagemaker) 是一个云机器学习平台。 提供了完整的基础设施，工具和工作流来帮助用户可以创建、训练和发布机器学习模型。

[Amazon SageMaker Model Building Pipelines](https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines.html) 是一个可以直接使用SageMaker各种集成的机器学习管道构建工具，用户可以使用使用 Amazon SageMaker Pipeline 来构建端到端的机器学习系统。

对于使用大数据与人工智能的用户，SageMaker 任务组件帮助用户可以串联起大数据工作流与SagaMaker的使用场景。

DolphinScheduler SageMaker 组件的功能:
- 启动 SageMaker Pipeline Execution，并持续获取状态，直至Pipeline执行完成。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/sagemaker.png" width="15"/> 任务节点到画板中。

## 任务样例

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|       **任务参数**       |                                                               **描述**                                                                |
|----------------------|-------------------------------------------------------------------------------------------------------------------------------------|
| SagemakerRequestJson | 启动SageMakerPipeline的需要的请求参数，可见 [AWS API](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html) |

组件图示如下：

![sagemaker_pipeline](../../img/tasks/demo/sagemaker_pipeline.png)

## 环境配置

需要进行AWS的一些配置，修改`aws.yml`中的以下配置信息

```yaml
sagemaker:
  # The AWS credentials provider type. support: AWSStaticCredentialsProvider, InstanceProfileCredentialsProvider
  # AWSStaticCredentialsProvider: use the access key and secret key to authenticate
  # InstanceProfileCredentialsProvider: use the IAM role to authenticate
  credentials.provider.type: AWSStaticCredentialsProvider
  access.key.id: <access.key.id>
  access.key.secret: <access.key.secret>
  region: <region>
  endpoint: <endpoint>
```


---

## guide/task/seatunnel.md

# Apache SeaTunnel

## 综述

`SeaTunnel` 任务类型，用于创建并执行 `SeaTunnel` 类型任务。worker 执行该任务的时候，会通过 `start-seatunnel-spark.sh` 、 `start-seatunnel-flink.sh` 和 `seatunnel.sh` 命令解析 config 文件。
点击 [这里](https://seatunnel.apache.org/) 获取更多关于 `Apache SeaTunnel` 的信息。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的<img src="../../../../img/tasks/icons/seatunnel.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。
- 启动脚本：选择你想要运行任务的启动脚本，包括 `seatunnel.sh`, `start-seatunnel-flink-13-connector-v2.sh`, `start-seatunnel-flink-15-connector-v2.sh`, `start-seatunnel-flink-connector-v2.sh`, `start-seatunnel-flink.sh`, `start-seatunnel-spark-2-connector-v2.sh`, `start-seatunnel-spark-3-connector-v2.sh`, `start-seatunnel-spark-connector-v2.sh`, `start-seatunnel-spark.sh`
- FLINK
- 运行模型：支持 `run` 和 `run-application` 两种模式
- 选项参数：用于添加 Flink 引擎本身参数，例如 `-m yarn-cluster -ynm seatunnel`
- SPARK
- 部署方式：指定部署模式，`cluster` `client`
- Master：指定 `Master` 模型，`yarn` `local` `spark` `mesos`，其中 `spark` 和 `mesos` 需要指定 `Master` 服务地址，例如：127.0.0.1:7077
- SEATUNNEL_ENGINE
- 部署方式：指定部署模式，`cluster` `local`

  > 点击 [这里](https://seatunnel.apache.org/docs/command/usage) 获取更多关于`Apache SeaTunnel command` 使用的信息

- 自定义配置：支持自定义配置或从资源中心选择配置文件

  > 点击 [这里](https://seatunnel.apache.org/docs/concept/config) 获取更多关于`Apache SeaTunnel config` 文件介绍

- 脚本：在任务节点那自定义配置信息，包括四部分：`env` `source` `transform` `sink`
- 自定义参数/全局参数: 当定义了自定义参数/全局参数时, 会将该参数传递给SeaTunnel任务, 可以在SeaTunnel任务中通过`${}`引用该参数, 从而在任务运行时动态替换参数值.

  > 点击 [这里](https://seatunnel.apache.org/docs/concept/config/#config-variable-substitution) 获取更多关于`Apache SeaTunnel 变量替换` 使用的信息

## 任务样例

该样例演示为使用 Flink 引擎从 Fake 源读取数据打印到控制台。

### 在 DolphinScheduler 中配置 SeaTunnel 环境

若生产环境中要是使用到 SeaTunnel 任务类型，则需要先配置好所需的环境，配置文件如下：`/dolphinscheduler/conf/env/dolphinscheduler_env.sh`。

![seatunnel_task01](../../img/tasks/demo/seatunnel_task01.png)

### 配置 SeaTunnel 任务节点

根据上述参数说明，配置所需的内容即可。

![seatunnel_task02](../../img/tasks/demo/seatunnel_task02.png)

### Config 样例

```Config

env {
  execution.parallelism = 1
}

source {
  FakeSource {
    result_table_name = "fake"
    field_name = "name,age"
  }
}

transform {
  sql {
    sql = "select name,age from fake"
  }
}

sink {
  ConsoleSink {}
}

```

### 支持 SeaTunnel 版本

- 2.3.1
- 2.3.2
- 2.3.3


---

## guide/task/shell.md

# Shell

## 综述

Shell 任务类型，用于创建 Shell 类型的任务并执行一系列的 Shell 脚本。worker 执行该任务的时候，会生成一个临时 shell 脚本，并使用与租户同名的 linux 用户执行这个脚本。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入 DAG 编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/shell.png" width="15"/> 到画板中，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。
- 除上述默认参数，此任务没有其他参数

## 任务样例

### 简单打印一行文字

该样例模拟了常见的简单任务，这些任务只需要简单的一两行命令就能运行起来。我们以打印一行日志为例，该任务仅会在日志文件中打印一行
"This is a demo of shell task"

![demo-shell-simple](../../img/tasks/demo/shell.jpg)

### 使用自定义参数

该样例模拟了自定义参数任务，为了更方便的复用已有的任务，或者面对动态的需求时，我们会使用变量保证脚本的复用性。本例中，我们先在自定义脚本
中定义了参数 "param_key"，并将他的值设置为 "param_val"。接着在"脚本"中声明了 echo 命令，将参数 "param_key" 打印了出来。当我们保存
并运行任务后，在日志中会看到将参数 "param_key" 对应的值 "param_val" 打印出来。

![demo-shell-custom-param](../../img/tasks/demo/shell_custom_param.jpg)

## 注意事项

Shell 任务类型通过解析任务日志是否包含 ```application_xxx_xxx``` 的内容来判断是否 Yarn 任务，如果是则会将相应的 ```application_id``` 的状态作为当前 Shell 节点的运行状态判断，此时如果操作停止工作流则会 Kill 相应的 ```application_id```

如果 Shell 任务中需要使用到用户自定义的脚本，可通过资源中心来上传对应的文件然后在 Shell 任务中引用他们，可参考：[文件管理](../resource/file-manage.md)。


---

## guide/task/spark.md

# SPARK节点

## 综述

Spark  任务类型用于执行 Spark 应用。对于 Spark 节点，worker 支持两个不同类型的 spark 命令提交任务：

(1) `spark submit` 方式提交任务。更多详情查看 [spark-submit](https://archive.apache.org/dist/spark/docs/3.2.1/#running-the-examples-and-shell)。

(2) `spark sql` 方式提交任务。更多详情查看 [spark sql](https://archive.apache.org/dist/spark/docs/3.2.1/api/sql/index.html)。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击”创建工作流”按钮，进入 DAG 编辑页面：

- 拖动工具栏的 <img src="../../../../img/tasks/icons/spark.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。
- 程序类型：支持 Java、Scala、Python 和 SQL 四种语言。
- 主函数的 Class：Spark 程序的入口 Main class 的全路径。
- 主程序包：执行 Spark 程序的 jar 包（通过资源中心上传）。
- Master：执行 Spark 集群的 Master Url。
- SQL脚本：Spark sql 运行的 .sql 文件中的 SQL 语句。
- 部署方式：(1) spark submit 支持 cluster、client 和 local 三种模式。
  (2) spark sql 支持 client 和 local 两种模式。
- 命名空间（集群）：若选择命名空间（集群），则以原生的方式提交至所选择 K8S 集群执行，未选择则提交至 Yarn 集群执行（默认）。
- 任务名称（可选）：Spark 程序的名称。
- Driver 核心数：用于设置 Driver 内核数，可根据实际生产环境设置对应的核心数。
- Driver 内存数：用于设置 Driver 内存数，可根据实际生产环境设置对应的内存数。
- Executor 数量：用于设置 Executor 的数量，可根据实际生产环境设置对应的内存数。
- Executor 内存数：用于设置 Executor 内存数，可根据实际生产环境设置对应的内存数。
- Yarn 队列：用于设置 Yarn 队列，默认使用 default 队列。
- 主程序参数：设置 Spark 程序的输入参数，支持自定义参数变量的替换。
- 选项参数：设置Spark命令的选项参数，例如`--jars`、`--files`、`--archives`、`--conf`。
- 资源：如果其他参数中引用了资源文件，需要在资源中选择指定。
- 自定义参数：是 Spark 局部的用户自定义参数，会替换脚本中以 ${变量} 的内容。

## 任务样例

### spark submit

#### 执行 WordCount 程序

本案例为大数据生态中常见的入门案例，常应用于 MapReduce、Flink、Spark 等计算框架。主要为统计输入的文本中，相同的单词的数量有多少。

##### 在 DolphinScheduler 中配置 Spark 环境

若生产环境中要是使用到 Spark 任务类型，则需要先配置好所需的环境。配置文件如下：`bin/env/dolphinscheduler_env.sh`。

![spark_configure](../../img/tasks/demo/spark_task01.png)

##### 上传主程序包

在使用 Spark 任务节点时，需要利用资源中心上传执行程序的 jar 包，可参考[资源中心](../resource/configuration.md)。

当配置完成资源中心之后，直接使用拖拽的方式，即可上传所需目标文件。

![resource_upload](../../img/tasks/demo/upload_jar.png)

##### 配置 Spark 节点

根据上述参数说明，配置所需的内容即可。

![demo-spark-simple](../../img/tasks/demo/spark_task02.png)

### spark sql

#### 执行 DDL 和 DML 语句

本案例为创建一个视图表 terms 并写入三行数据和一个格式为 parquet 的表 wc 并判断该表是否存在。程序类型为 SQL。将视图表 terms 的数据插入到格式为 parquet 的表 wc。

![spark_sql](../../img/tasks/demo/spark_sql.png)

## 注意事项：

注意：

JAVA 和 Scala 只用于标识，使用 Spark 任务时没有区别。如果应用程序是由 Python 开发的，那么可以忽略表单中的参数**Main Class**。参数**SQL脚本**仅适用于 SQL 类型，在 JAVA、Scala 和 Python 中可以忽略。

SQL 目前不支持 cluster 模式。


---

## guide/task/sql.md

# SQL

## 综述

SQL任务类型，用于连接数据库并执行相应SQL。

## 创建数据源

可参考 [数据源配置](../installation/datasource-setting.md) `数据源中心`。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入DAG编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/sql.png" width="25"/> 到画板中，选择需要连接的数据源，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。
- 数据源：选择对应的数据源
- sql类型：支持查询和非查询两种。
- 查询：支持 `DML select` 类型的命令，是有结果集返回的，可以指定邮件通知为表格、附件或表格附件三种模板；
- 非查询：支持 `DDL`全部命令 和 `DML update、delete、insert` 三种类型的命令；
- 默认采用`;\n`作为SQL分隔符,拆分成多段SQL语句执行。Hive的JDBC不支持一次执行多段SQL语句，请不要使用`;\n`。
- sql参数：输入参数格式为key1=value1;key2=value2…
- sql语句：SQL语句
- 自定义参数：SQL任务类型，而存储过程是自定义参数顺序，给方法设置值自定义参数类型和数据类型，同存储过程任务类型一样。区别在于SQL任务类型自定义参数会替换sql语句中${变量}。
- 前置sql:前置sql在sql语句之前执行。
- 后置sql:后置sql在sql语句之后执行。

## 任务样例

### Hive表创建示例

#### 在hive中创建临时表并写入数据

该样例向hive中创建临时表`tmp_hello_world`并写入一行数据。选择SQL类型为非查询，在创建临时表之前需要确保该表不存在，所以我们使用自定义参数，在每次运行时获取当天时间作为表名后缀，这样这个任务就可以每天运行。创建的表名格式为：`tmp_hello_world_{yyyyMMdd}`。
**注意**：sql任务组件的hive应用是基于JDBC去调用，SQL statement 不支持多行执行，请注意不要在语句末尾使用';'。如果要执行多行语句请使用[Hive-Cli](./hive-cli.md)任务。

![hive-sql](../../img/tasks/demo/hive-sql.png)

#### 运行该任务成功之后在hive中查询结果

登录集群使用`hive`命令或使用`beeline`、`JDBC`等方式连接`apache hive`进行查询，查询SQL为`select * from tmp_hello_world_{yyyyMMdd}`，请将`{yyyyMMdd}`替换为运行当天的日期，查询截图如下：

![hive-sql](../../img/tasks/demo/hive-result.png)

### 使用前置sql和后置sql示例

在前置sql中执行建表操作，在sql语句中执行操作，在后置sql中执行清理操作。

![pre_post_sql](../../img/tasks/demo/pre_post_sql.png)

## 注意事项

* 注意SQL类型的选择，如果是INSERT等操作需要选择非查询类型。


---

## guide/task/sqoop.md

# SQOOP 节点

## 综述

SQOOP 任务类型，用于执行 SQOOP 程序。对于 SQOOP 节点，worker 会通过执行 `sqoop` 命令来执行 SQOOP 任务。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击“创建工作流”按钮，进入 DAG 编辑页面；
- 拖动工具栏的 <img src="../../../../img/tasks/icons/sqoop.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|     **任务参数**     |                                **描述**                                |
|------------------|----------------------------------------------------------------------|
| 任务名称             | map-reduce 任务名称                                                      |
| 流向               | (1) import：从 RDBMS 导入 HDFS 或Hive  (2) export：从 HDFS 或 Hive 导出到 RDBMS |
| Hadoop 参数        | 添加自定义 Hadoop 参数                                                      |
| Sqoop 参数         | 添加自定义 Sqoop 参数                                                       |
| 数据来源 - 类型        | 选择数据源类型                                                              |
| 数据来源 - 数据源       | 选择数据源                                                                |
| 数据来源 - 模式        | (1) 单表：同步单张表的数据，需填写`表名`和`列类型`  (2) SQL：同步 SQL 查询的结果，需填写`SQL语句`       |
| 数据来源 - 表名        | 设置需要导入 hive 的表名                                                      |
| 数据来源 - 列类型       | (1) 全表导入：导入表中的所有字段  (2) 选择列：导入表中的指定列，需填写`列`信息                        |
| 数据来源 - 列         | 填写字段名称，多个字段之间使用英文逗号分割                                                |
| 数据来源 - SQL 语句    | 填写 SQL 查询语句                                                          |
| 数据来源 - Hive 类型映射 | 自定义 SQL 与 Hive 类型映射                                                  |
| 数据来源 - Java 类型映射 | 自定义 SQL 与 Java 类型映射                                                  |
| 数据目的 - 类型        | 选择数据目的类型                                                             |
| 数据目的 - 数据库       | 填写 Hive 数据库名称                                                        |
| 数据目的 - 表名        | 填写 Hive 表名                                                           |
| 数据目的 - 是否创建新表    | 选择是否自动根据导入数据类型创建数据目的表，如果目标表已经存在了，那么创建任务会失败                           |
| 数据目的 - 是否删除分隔符   | 自动删除字符串中的`\n`、`\r`和`\01`字符                                           |
| 数据目的 - 是否覆盖数据源   | 覆盖 Hive 表中的现有数据                                                      |
| 数据目的 - Hive 目标路径 | 自定义 Hive 目标路径                                                        |
| 数据目的 - 替换分隔符     | 替换字符串中的`\n`、`\r`和`\01`字符                                             |
| 数据目的 - Hive 分区键  | 填写 Hive 分区键，多个分区键之间使用英文逗号分割                                          |
| 数据目的 - Hive 分区值  | 填写 Hive 分区值，多个分区值之间使用英文逗号分割                                          |
| 数据目的 - 目标路径      | 填写 HDFS 的目标路径                                                        |
| 数据目的 - 是否删除目录    | 如果目录已经存在，则删除目录                                                       |
| 数据目的 - 压缩类型      | 选择 HDFS 文件压缩类型                                                       |
| 数据目的 - 保存格式      | 选择文件保存格式                                                             |
| 数据目的 - 列分隔符      | 自定义列分隔符                                                              |
| 数据目的 - 行分隔符      | 自定义行分隔符                                                              |

## 任务样例

该样例演示为从 MySQL 数据导入到 Hive 中。 其中 MySQL 数据库名称为：`test`，表名称为`example`。下图为样例数据。

![sqoop_task01](../../img/tasks/demo/sqoop_task01.png)

### 配置 Sqoop 环境

若生产环境中要是使用到 Sqoop 任务类型，则需要先配置好所需的环境。确保任务节点可以执行`sqoop`命令。

### 配置 Sqoop 任务节点

可按照下图步骤进行配置节点内容。

![sqoop_task02](../../img/tasks/demo/sqoop_task02.png)

本样例中的关键配置如下表。

|     **任务参数**     |                    **参数值**                     |
|------------------|------------------------------------------------|
| 任务名称             | sqoop_mysql_to_hive_test                       |
| 流向               | import                                         |
| 数据来源 - 类型        | MYSQL                                          |
| 数据来源 - 数据源       | MYSQL MyTestMySQL（您可以将MyTestMySQL改成您自己取的数据源名称） |
| 数据来源 - 模式        | 表单                                             |
| 数据来源 - 表名        | example                                        |
| 数据来源 - 列类型       | 全表导入                                           |
| 数据目的 - 类型        | HIVE                                           |
| 数据目的 - 数据库       | tmp                                            |
| 数据目的 - 表名        | example                                        |
| 数据目的 - 是否创建新表    | true                                           |
| 数据目的 - 是否删除分隔符   | false                                          |
| 数据目的 - 是否覆盖数据源   | true                                           |
| 数据目的 - Hive 目标路径 | （无需填写）                                         |
| 数据目的 - 替换分隔符     | ,                                              |
| 数据目的 - Hive 分区键  | （无需填写）                                         |
| 数据目的 - Hive 分区值  | （无需填写）                                         |

### 查看运行结果

![sqoop_task03](../../img/tasks/demo/sqoop_task03.png)


---

## guide/task/stored-procedure.md

# 存储过程节点

- 根据选择的数据源，执行存储过程。

> 拖动工具栏中的`PROCEDURE`任务节点到画板中，如下图所示：

<p align="center">
   <img src="../../../../img/procedure_edit.png" width="80%" />
 </p>

- 前提：在该数据库里面创建存储过程，如：

```
CREATE PROCEDURE dolphinscheduler.test(in in1 INT, out out1 INT)
begin
	set out1=in1;
END
```

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|   **任务参数**    |                                              **描述**                                              |
|---------------|--------------------------------------------------------------------------------------------------|
| 数据源           | 存储过程的数据源类型支持MySQL、POSTGRESQL、ORACLE，选择对应的数据源                                                     |
| SQL Statement | 调用存储过程，如 `call test(${in1},${out1});`                                                            |
| 自定义参数         | 存储过程的自定义参数类型支持IN、OUT两种，数据类型支持VARCHAR、INTEGER、LONG、FLOAT、DOUBLE、DATE、TIME、TIMESTAMP、BOOLEAN九种数据类型 |


---

## guide/task/sub-workflow.md

# 子流程节点

## 综述

子流程节点，就是把外部的某个工作流定义当做一个节点去执行。

## 创建任务

- 点击项目管理 -> 项目名称 -> 工作流定义，点击”创建工作流”按钮，进入 DAG 编辑页面：

- 拖动工具栏的 <img src="../../../../img/tasks/icons/sub_workflow.png" width="15"/> 任务节点到画板中。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                 **描述**                 |
|----------|----------------------------------------|
| 子节点      | 是选择子流程的工作流定义，右上角进入该子节点可以跳转到所选子流程的工作流定义 |

## 任务样例

该样例模拟了常见的任务类型，这里我们使用子结点任务调用 [Shell](shell.md) 打印出 ”hello world“。即将一个 shell 任务当作子结点来执行。

### 创建 shell 任务

创建一个 shell 任务，用于打印 “hello”。并为该工作流定义为 test_dag01。

![subworkflow_task01](../../img/tasks/demo/subworkflow_task01.png)

### 创建 sub_workflow 任务

在使用 sub_workflow 的过程中，需要创建所需的子结点任务，也就是我们第一步所创建的 test_dag01 工作流。然后如下图所示，在 ⑤ 的位置选择对应的子结点即可。

![subworkflow_task02](../../img/tasks/demo/subworkflow_task02.png)

创建 sub_workflow 完成之后，再创建一个对应的 shell 任务，用于打印 “world”，并将二者连接起来。保存当前工作流，并上线运行，即可得到想要的结果。

![subworkflow_task03](../../img/tasks/demo/subworkflow_task03.png)

## 注意事项

在使用 sub_workflow 调用子结点任务的时候，不需要保证定义的子结点为上线状态。


---

## guide/task/switch.md

# Switch

Switch 是一个条件判断节点，依据[全局变量](../parameter/global.md)的值和用户所编写的表达式判断结果执行对应分支。
**注意**使用 javax.script.ScriptEngine.eval 执行表达式。

## 创建任务

点击项目管理 -> 项目名称 -> 工作流定义，点击"创建工作流"按钮，进入 DAG 编辑页面。
拖动工具栏中的 <img src="../../../../img/switch.png" width="20"/> 任务节点到画板中即能完成任务创建。
**注意** switch 任务创建后，要先配置上下游，才能配置任务分支的参数。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

| **任务参数** |                                 **描述**                                  |
|----------|-------------------------------------------------------------------------|
| 条件       | 可以为 switch 任务配置多个条件，当条件满足时，就会执行指定的分支，可以配置多个不同的条件来满足不同的业务，使用字符串判断时需要使用"" |
| 分支流转     | 默认的流转内容，当**条件**中的内容为全部不符合要求时，则运行**分支流转**中指定的分支                          |

## 任务样例

这里使用一个 switch 任务以及三个 shell 任务来演示。

### 创建工作流

新建 switch 任务，以及下游的三个 shell 任务。shell 任务没有要求。
switch 任务需要和下游任务连线配置关系后，才可以进行下游任务的选择。

![switch_01](../../img/tasks/demo/switch_01.png)

### 设置条件

配置条件和默认分支，满足条件会走指定分支，都不满足则走默认分支。
图中如果变量的值为 "A" 则执行分支 taskA，如果变量的值为 "B" 则执行分支 taskB ，都不满足则执行 default。

![switch_02](../../img/tasks/demo/switch_02.png)

条件使用了全局变量，请参考[全局变量](../parameter/global.md)。
这里配置全局变量的值为 A。

![switch_03](../../img/tasks/demo/switch_03.png)

如果执行正确，那么 taskA 会被正确执行。

### 执行

执行，并且查看是否符合预期。可以看到符合预期，执行了指定的下游任务 taskA。

![switch_04](../../img/tasks/demo/switch_04.png)


---

## guide/task/zeppelin.md

# Apache Zeppelin

## 综述

`Zeppelin`任务类型，用于创建并执行`Zeppelin`类型任务。worker 执行该任务的时候，会通过`Zeppelin Cient API`触发`Zeppelin Notebook Paragraph`。
点击[这里](https://zeppelin.apache.org/) 获取更多关于`Apache Zeppelin Notebook`的信息。

## 创建任务

- 点击项目管理-项目名称-工作流定义，点击"创建工作流"按钮，进入DAG编辑页面。
- 工具栏中拖动 <img src="../../../../img/tasks/icons/zeppelin.png" width="15"/> 到画板中，即可完成创建。

## 任务参数

[//]: # (TODO: use the commented anchor below once our website template supports this syntax)
[//]: # (- 默认参数说明请参考[DolphinScheduler任务参数附录]&#40;appendix.md#默认任务参数&#41;`默认任务参数`一栏。)

- 默认参数说明请参考[DolphinScheduler任务参数附录](appendix.md)`默认任务参数`一栏。

|              **任务参数**              |                      **描述**                       |
|------------------------------------|---------------------------------------------------|
| Zeppelin Note ID                   | Zeppelin Note对应的唯一ID                              |
| Zeppelin Paragraph ID              | Zeppelin Paragraph对应的唯一ID。如果你想一次性调度整个note，这一栏不填即可 |
| Zeppelin Rest Endpoint             | 您的Zeppelin服务的REST Endpoint                        |
| Zeppelin username                  | 您的Zeppelin服务的登陆用户名                                |
| Zeppelin password                  | 您的Zeppelin服务的登陆密码                                 |
| Zeppelin Production Note Directory | 生产模式下存放克隆note的目录                                  |
| Zeppelin Parameters                | 用于传入Zeppelin Dynamic Form的参数                      |

## 生产（克隆）模式

- 填上`Zeppelin Production Note Directory`参数以启动`生产模式`。
- 在`生产模式`下，目标note会被克隆到您所填的`Zeppelin Production Note Directory`目录下。
  `Zeppelin任务插件`将会执行克隆出来的note并在执行成功后自动清除它。
  因为在此模式下，如果您不小心修改了正在被`Dolphin Scheduler`调度的note，也不会影响到生产任务的执行，
  从而提高了稳定性。
- 如果您选择不填`Zeppelin Production Note Directory`这个参数，`Zeppelin任务插件`将会执行您的原始note。
  'Zeppelin Production Note Directory'参数在格式上应该以`斜杠`开头和结尾，例如 `/production_note_directory/`。

## 任务样例

### Zeppelin Paragraph 任务样例

这个示例展示了如何创建Zeppelin Paragraph任务节点：

![demo-zeppelin-paragraph](../../img/tasks/demo/zeppelin.png)

![demo-get-zeppelin-id](../../img/tasks/demo/zeppelin_id.png)


---

## guide/upgrade/incompatible.md

# 不向前兼容的更新

本文档记录了各版本之间不兼容的更新内容。在升级到相关版本前，请检查本文档。

## dev

* 将mysql驱动版本从8.0.16升级至8.0.33 ([#14684](https://github.com/apache/dolphinscheduler/pull/14684))
* 更改了环境变量名称，将 `PYTHON_HOME` 改为 `PYTHON_LAUNCHER`， 将 `DATAX_HOME` 改为 `DATAX_LAUNCHER` ([#14523](https://github.com/apache/dolphinscheduler/pull/14523))
* 更新了SQL任务中用于匹配变量的正则表达式 ([#13378](https://github.com/apache/dolphinscheduler/pull/13378))
* Remove the spark version of spark task ([#11860](https://github.com/apache/dolphinscheduler/pull/11860)).
* Change the default unix shell executor from sh to bash ([#12180](https://github.com/apache/dolphinscheduler/pull/12180)).
* Remove `deleteSource` in `download()` of `StorageOperate` ([#14084](https://github.com/apache/dolphinscheduler/pull/14084))

## 3.2.0

* 资源中心相关接口删除请求参数 `description` ([#14394](https://github.com/apache/dolphinscheduler/pull/14394))

## 3.0.0

* Copy and import workflow without 'copy' suffix [#10607](https://github.com/apache/dolphinscheduler/pull/10607)
* Use semicolon as default sql segment separator [#10869](https://github.com/apache/dolphinscheduler/pull/10869)

## 3.2.0

* 在 /datasources/tables && /datasources/tableColumns 接口中添加了必选字段`database` [#14406](https://github.com/apache/dolphinscheduler/pull/14406)

## 3.3.0

* 从 `资源中心` 中移除 `udf-manage` 功能 ([#16209])(https://github.com/apache/dolphinscheduler/pull/16209)
* 从 `任务插件` 中移除 `Pigeon` 类型 ([#16218])(https://github.com/apache/dolphinscheduler/pull/16218)
* 统一代码中的 `process` 为 `workflow` ([#16515])(https://github.com/apache/dolphinscheduler/pull/16515)
* 废弃从 1.x 至 2.x 的升级代码  ([#16543])(https://github.com/apache/dolphinscheduler/pull/16543)
* 移除 `数据质量` 模块  ([#16794])(https://github.com/apache/dolphinscheduler/pull/16794)
* 在`application.yaml`中移除`registry-disconnect-strategy`配置 ([#16821])(https://github.com/apache/dolphinscheduler/pull/16821)
* 在 `worker` 的 `application.yaml` 中移除 `exec-threads`，使用`physical-task-config`替代;在master的`application.yaml`中移除`master-async-task-executor-thread-pool-size`使用`logic-task-config`替代 ([#16790])(https://github.com/apache/dolphinscheduler/pull/16790)
* 在 `t_ds_worker_group` 表中移除 无用的 `other_params_json` 字段 ([#16860])(https://github.com/apache/dolphinscheduler/pull/16860)
* 从 `任务插件` 中移除 `Dynamic` 类型 ([#16482])(https://github.com/apache/dolphinscheduler/pull/16842)


---

## guide/upgrade/upgrade.md

# DolphinScheduler 升级

## 准备工作

### 检查不向前兼容的更改

在升级之前，您应该检查 [incompatible change](./incompatible.md)，因为一些不兼容的更改可能会破坏您当前的功能。

### 备份上一版本文件和数据库

为了防止操作错误导致数据丢失，建议升级之前备份数据，备份方法请结合你数据库的情况来定

### 下载新版本的安装包

在[下载](https://dolphinscheduler.apache.org/zh-cn/download)页面下载最新版本的二进制安装包，并将二进制包放到与当前 dolphinscheduler 服务不一样的路径中，以下升级操作都需要在新版本的目录进行。

## 升级步骤

### 停止 dolphinscheduler 所有服务

根据你部署方式停止 dolphinscheduler 的所有服务。

### 数据库升级

设置相关环境变量（{user}和{password}改成你数据库的用户名和密码），然后运行升级脚本。

下面以 MySQL 为例，别的数据库仅需要修改成对应的配置即可。请先手动下载 [mysql-connector-java 驱动 jar](https://downloads.MySQL.com/archives/c-j/)
jar 包 并添加到 `./tools/libs` 目录下，设置以下环境变量

        ```shell
        export DATABASE=${DATABASE:-mysql}
        export SPRING_PROFILES_ACTIVE=${DATABASE}
        export SPRING_DATASOURCE_URL="jdbc:mysql://127.0.0.1:3306/dolphinscheduler?useUnicode=true&characterEncoding=UTF-8&useSSL=false"
        export SPRING_DATASOURCE_USERNAME={user}
        export SPRING_DATASOURCE_PASSWORD={password}
        ```

执行数据库升级脚本：`sh ./tools/bin/upgrade-schema.sh`

### 资源迁移

3.2.0 版本资源中心重构，原资源中心内的资源将不受管理，您可以指定迁移到的目标租户，然后运行一次性资源迁移脚本，所有资源会迁移到目标租户的 .migrate 目录下。

#### 示例：

指定已存在目标租户 `abc`，其资源根目录为 `/dolphinscheduler/abc/`。

执行脚本：`sh ./tools/bin/migrate-resource.sh abc`。

执行结果：

- 原文件资源 `a/b.sh` 迁移至 `/dolphinscheduler/abc/resources/.migrate/a/b.sh`。
- 原 UDF 资源 `x/y.jar` 迁移至 `/dolphinscheduler/abc/udf/.migrate/x/y.jar`。
- 更新 UDF 函数绑定资源信息。

### 血缘升级

执行脚本：`sh ./tools/bin/migrate-lineage.sh`。

执行结果：

- 原血缘数据迁移至新血缘表 `t_ds_workflow_task_lineage`。
- 此脚本仅执行 upsert 操作，不执行删除操作，如果需要删除，您可以手动删除。

### 服务升级

#### 修改配置内容

- 伪集群部署请参照[伪集群部署(Pseudo-Cluster)](../installation/pseudo-cluster.md)中的 `修改相关配置`
- 集群部署请参照[集群部署(Cluster)](../installation/cluster.md)中的 `修改相关配置`

## 注意事项

#### 升级版本限制

- 在 3.3.X 以及之后的版本，我们仅支持从 3.0.0 开始进行升级，低于此版本的请下载历史版本升级至 3.0.0。
- 在 3.3.X 以及之后的版本，二进制包不再默认提供插件依赖，因此第一次使用时，需要自行下载安装。具体请参考请参照[伪集群部署(Pseudo-Cluster)](../installation/pseudo-cluster.md)

#### 升级后的注意事项

在历史版本中可能告警插件会有一些脏数据，升级后请参考一下 SQL 手动清理。

```sql
delete from t_ds_alertgroup where group_name = 'global alert group' and description = 'global alert group';
```
