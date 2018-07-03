package com.demo.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "cosProperties")
public class CosProperties {
    private String bucketName;
    private String accessKey;
    private String secretKey;
    private String region;
}