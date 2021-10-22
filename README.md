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