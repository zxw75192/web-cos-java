# web-cos-java
* 1.添加依赖  注意(lombok需要安装插件)
            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
            </dependency>
            <dependency>
                <groupId>com.qcloud</groupId>
                <artifactId>cos_api</artifactId>
                <version>5.2.4</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-configuration-processor</artifactId>
                <optional>true</optional>
            </dependency>
            <dependency>
                <groupId>com.google.code.gson</groupId>
                <artifactId>gson</artifactId>
            </dependency>
* 2.腾讯云cos的参数  application.yml中配置
        cosProperties:
          bucketName: zxwxxxx51
          accessKey: AKIDxxxxxxxxxxxe6iIN7Z2
          secretKey: FPYxxxxxxxxxxxxxxJIEzZ
          region: ap-beijing
* 3.resources/static/upload.html文件中修改存储桶名称及地区
            var Bucket = 'zxwxxxx51';
            var Region = 'ap-beijing';
* 4.运行项目  访问localhost:8080/upload.html

