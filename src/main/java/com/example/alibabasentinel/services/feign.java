package com.example.alibabasentinel.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(value = "nacos666",fallback = feignimpl.class)
public interface feign {
    @RequestMapping(value = "/n/{string}")
    public String echo(@PathVariable String string);
}
