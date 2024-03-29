package com.igotu.autoconfig.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "igotu.sms")
public class SmsProperties {
    private String signName;
    private String templateCode;
    private String accessKey;
    private String secret;
}
