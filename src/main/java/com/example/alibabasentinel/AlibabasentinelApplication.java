package com.example.alibabasentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabasentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabasentinelApplication.class, args);
    }

}
