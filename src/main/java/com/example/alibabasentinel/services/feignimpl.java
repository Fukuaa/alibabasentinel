package com.example.alibabasentinel.services;

import org.springframework.stereotype.Component;

@Component
public class feignimpl implements feign{
    @Override
    public String echo(String string) {
        return "服务降级💕💕";
    }
}
