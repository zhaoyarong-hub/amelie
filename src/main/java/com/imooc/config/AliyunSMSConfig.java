package com.imooc.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @program: sell
 * @description: ${description}
 * @author: tzy
 * @create: 2019-01-11 21:56
 **/
@Slf4j
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliyunSMSConfig {


    private String accessKeyId;
    private String accessKeySecret;
    private String product;
    private String domain;
    private String regionId;
    private String signName;
    private String dateFormat;
    private String endpointName;

}