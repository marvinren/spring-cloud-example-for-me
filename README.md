# 工程搭建笔记

* 目前gradle的库加入了公司私有仓储，必要的时候可以删除，直接从外网下载
* 由于service工程使用的了lombok，需要在idea浏览器中打开`Enable annotation processing`
* 全部工程使用gradle构建，导入工程最要按照gradle方式导入


## Todo
1. 根据环境不同使用不同的环境变量！！！查看build.gradle
```
    if (project.hasProperty("prod")) {
        apply from: "$rootDir/gradle/profile_prod.gradle"
    } else {
        apply from: "$rootDir/gradle/profile_dev.gradle"
    }
```
1. 使用sonarsource
2. gradle使用node来了编译生成工程
3. 配置参数过滤---gradle.properties
4. 使用war包
5. 集中化配置dev/prod划分以及集群
6. spring-reload



# 开发规范说明
1. 端口划分

| 服务 | 端口 |
|--------------|--------------|
| ConfigServer | 8888 |
| EurekaServer | 8761 |
| mircoservice | 10000 - 19999|



2. 创建class自动增加注释（Idea）
File->settings->Editor->File and Code Templates->Files->Class
