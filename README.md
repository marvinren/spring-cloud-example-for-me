#Spring Cloud的样例工程

这家伙确实很懒，还没来得及写点什么


## 发布过程
```sh
gradle :discovery-server:bootRepackage :auth-server:bootRepackage :api-gateway-server:bootRepackage :task-service:task-service-impl:bootRepackage
mv discovery-server/build/libs/*.jar .
mv auth-server/build/libs/*.jar .
mv api-gateway-server/build/libs/*.jar .
mv task-service/task-service-impl/build/libs/*.jar .
```
上传到服务器上
```
nohup java -jar discovery-server-1.0.0-SNAPSHOT.jar > discovery.log &
nohup java -jar auth-server-1.0.0-SNAPSHOT.jar > auth.log &
nohup java -jar api-gateway-server-1.0.0-SNAPSHOT.jar > gateway.log &
nohup java -jar task-service-impl-1.0.0-SNAPSHOT.jar > task.log &
```