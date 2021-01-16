## Redis

### 一、概述

Redis（Remote Dictionary Server），即远程字典服务。 是一个开源的使用ANSI C语言编写、支持网络、可基于内存亦可持久化的日志型、key-value数据库，并提供多种语言的API，免费开源，是当下最热门的NoSQL技术之一，也被称之为结构化数据库，支持多种数据类型，如String、list、set、zset、hash

Redis可以周期性的把更新的数据写入磁盘或者把修改操作写入追加的记录文件，并且在此基础上实现了**master-slave**（主从）同步。



**支持的语言**

| ActionScript | Common Lisp |  Haxe   | Object-C  |     R     |
| :----------: | :---------: | :-----: | :-------: | :-------: |
|      C       |    Dart     |   Io    |   Perl    |   Ruby    |
|     C++      |   Erlang    |  Java   |    PHP    |   Scala   |
|      C#      |     Go      | Node.js | Pure Data | Smalltalk |
|   Clojure    |   Haskell   |   Lua   |  Python   |    Tcl    |



### 二、特点

1.以内存作为数据存储的介质，读写数据的效率极高。

2.与memcache不同的是，存储在Redis中的数据是持久化的，断电或重启，数据也不会丢失。

3.存储方式分为内存存储、磁盘存储和log文件。

4.可以从磁盘中重新将数据加载到内存中，也可以通过配置文件对其进行配置，因此，redis才能实现持久化。

5.支持主从模式，可以配置集群，更利于支撑大型项目。



### 三、应用场景

1、会话缓存

2、消息队列

3、活动排行榜或计数

4、订阅发布消息

5、商品列表、评论列表

...



### 四、数据类型

一共支持**五种**数据类型：String(字符串)、hash(哈希)、list(列表)、set(集合)、zset(有序集合)

**String**：Redis**最基本**的数据类型，一个键对应一个值，一个键值最大存储512MB

**Hash**：是一个键值对的集合，是一个String类型的field和value的映射表，适合用于**存储对象**

**List**：简单的字符串列表，按插入顺序排序

**Set**：字符串类型的无序集合，也不可重复

**ZSet**：字符串类型的有序集合，也不可重复，有序集合中的每个元素都需要指定一个分数，根据分数对元素进行升序排序



### 五、下载地址

[Redis官网](https://redis.io)

[Redis中文网](http://www.redis.cn)

注意：Windows版本的在[GitHub](https://github.com/redis/redis)上下载，推荐Redis都在Linux服务器上进行搭建。



### 六、Windows

1、下载安装包，地址：https://github.com/microsoftarchive/redis/releases

2、下载得到压缩包

3、解压缩到磁盘，Redis很小，只有5M

4、双击`redis-server.exe`文件启动服务

5、使用`redis-cli.exe`客户端连接redis



### 七、Linux

