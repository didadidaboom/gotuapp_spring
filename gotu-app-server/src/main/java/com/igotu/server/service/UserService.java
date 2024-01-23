package com.igotu.server.service;

import com.igotu.autoconfig.template.SmsTemplate;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private SmsTemplate smsTemplate;

    public void sendSms(String phone) {
        //根据手机号查询用户，如果用户存在，判断用户是否被冻结，如果被冻结

        //1, 随机生成6位数的验证码
//        String code = RandomStringUtils.randomNumeric(6);
        String code = "123456";
        //2,调用template发送短信
        smsTemplate.sendSms(phone, code);
        //3,将验证码保存到redis中

    }
}
