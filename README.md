## 环境准备
* 安装mysql 
```shell script
docker run --name mysql-test-instance -p3306:3306 -e MYSQL_ROOT_PASSWORD=password -d mysql:latest

mysql -h127.0.0.1 -uroot -P3306 -p
```

* 安装mysql
```shell script
docker run --name redis-test-instance -p6379:6379 -d redis:latest

#redis-server --daemonize yes
redis-cli
```

* 安装tdengine
```shell script
docker run -tid --privileged=true --name=tdengine --hostname=tdengine -p 6030-6042:6030-6042/tcp -p 6030-6043:6030-6043/udp tdengine/tdengine

docker exec -ti /bin/bash 
taos
```

## 构建服务镜像

* 创建Dockerfile
```shell script
FROM openjdk:8-jdk-alpine
MAINTAINER sf-express.com
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
```

* 构建镜像
```shell script
docker build --tag=demo:latest .
```

* 运行服务
```shell script
docker run -p8080:8080 demo:latest
```