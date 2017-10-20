# 工程搭建笔记

目前gradle的库加入了公司私有仓储，必要的时候可以删除，直接从外网下载


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



# 开发规范说明
1. 创建class自动增加注释（Idea）
File->settings->Editor->File and Code Templates->Files->Class
