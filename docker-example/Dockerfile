#基础镜像使用Java
FROM java:8
#作者
MAINTAINER lhj502819@163.com
VOLUME /tmp

ADD ./docker-example-0.0.1-SNAPSHOT.jar app.jar
#暴露端口
EXPOSE 8090

#运行jar包
RUN bash -c 'touch ./app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar"]