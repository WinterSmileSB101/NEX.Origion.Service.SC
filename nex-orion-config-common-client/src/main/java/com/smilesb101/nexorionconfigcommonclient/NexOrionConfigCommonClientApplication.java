package com.smilesb101.nexorionconfigcommonclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class NexOrionConfigCommonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexOrionConfigCommonClientApplication.class, args);
    }


    @Value("${port}")
    String port;

    @RequestMapping(value="/hi")
    public String hi()
    {
        return port;
    }
}
