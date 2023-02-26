# 基础镜像
FROM openjdk:8-jre

# 维护者信息
MAINTAINER zhangjj <17310319450@163.com>

# 设置容器时区为当前时区
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \&& echo 'Asia/Shanghai' >/etc/timezone

# /tmp 目录作为容器数据卷目录，SpringBoot内嵌Tomcat容器默认使用/tmp作为工作目录，任何向 /tmp 中写入的信息不会记录进容器存储层
# 在宿主机的/var/lib/docker目录下创建一个临时文件并把它链接到容器中的/tmp目录
VOLUME /tmp

# 复制jar包
COPY *.jar /data/app/app.jar

# 容器启动执行命令
ENTRYPOINT ["java", "-Xmx128m", "-jar", "/data/app/app.jar"]

