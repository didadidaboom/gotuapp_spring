package com.igotu.autoconfig.template;

import com.aliyun.dysmsapi20170525.models.SendSmsRequest;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.dysmsapi20170525.models.SendSmsResponseBody;
import com.aliyun.teaopenapi.models.Config;
import com.igotu.autoconfig.properties.SmsProperties;

public class SmsTemplate {
    private SmsProperties properties;

    public SmsTemplate(SmsProperties properties) {
        this.properties = properties;
    }

    public void sendSms(String mobile, String code) {
        System.out.println("test............");
        try {
            //配置阿里云
            Config config = new Config()
                    .setAccessKeyId(properties.getAccessKey())
                    .setAccessKeySecret(properties.getSecret());
            // 访问的域名
            config.endpoint = "dysmsapi.aliyuncs.com";

            com.aliyun.dysmsapi20170525.Client client = new com.aliyun.dysmsapi20170525.Client(config);
            SendSmsRequest sendSmsRequest = new SendSmsRequest()
                    .setPhoneNumbers(mobile)
                    .setSignName(properties.getSignName())
                    .setTemplateCode(properties.getTemplateCode())
                    .setTemplateParam("{\"code\":\"" + code + "\"}");

            SendSmsResponse response = client.sendSms(sendSmsRequest);

            SendSmsResponseBody body = response.getBody();

            if (body.getCode() != null && body.getCode().equals("OK")) {
                System.out.println("发送成功");
            } else {
                System.out.println("发送失败");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
