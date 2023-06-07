FROM anapsix/alpine-java:8_server-jre_unlimited

LABEL author=qinmetec@163.com describe=勾勾后端服务

ENV TZ=Asia/Shanghai

ENV JAVA_OPTS="-Xms1024m -Xmx1024m -Djava.security.egd=file:/dev/./urandom"

ENV PROFILE="prod"

ENV SERVER_PORT=8003

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN mkdir -p /gougou-server

WORKDIR /gougou-server

EXPOSE $SERVER_PORT

ADD ./build/libs/gougou-server-1.0.0.jar ./gougou-server.jar

CMD sleep 10;java $JAVA_OPTS -Dserver.port=$SERVER_PORT -Dspring.profiles.active=$PROFILE -jar gougou-server.jar
