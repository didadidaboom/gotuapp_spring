package com.igotu.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("user")
public class LoginController {
    @PostMapping("login")
    public ResponseEntity login(@RequestBody Map<String,Object> map) {
        String phone = String.valueOf(map.get("phone"));
        //发送信息
        System.out.println("start............");
        return ResponseEntity.ok(null);
    }
}
