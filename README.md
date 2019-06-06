
该例使用的是 postgresql 数据库.
-----

如果用的是其他的数据库:<br/>

1. 在[pom.xml](https://github.com/Zhao2018Mr/springboot_mybatis_druid/blob/master/src/main/resources/application.properties) 的postgresql 依赖 更换为 要使用数据库的JDBC连接.

2. 在[application.properties](https://github.com/Zhao2018Mr/springboot_mybatis_druid/blob/master/src/main/resources/application.properties)修改数据库连接以及驱动
	

数据库表
-----------
--master 数据库
```sql
create  TABLE  cd_user(
id bigint primary key,
username VARCHAR(50)
);

insert into cd_user (id,username) values(1,'master')
```

--slave 数据库 
```sql
create  TABLE  cd_user(
id bigint primary key,
username VARCHAR(50)
);

insert into cd_user (id,username) values(1,'slave')
```
使用 测试
---------------
进入
http://localhost:8080/getUserName 
会从两个不同的数据库中查出姓名


进入 http://localhost:8080/druid/ 
用户名 密码 在 com.zyj.config.druid.DruidStatViewServlet 修改 和查看
用于查看状态 

csdn 博客
---------------
https://blog.csdn.net/qq_31807569/article/details/90111068
