package com.smilesb101.nexorionservercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NexOrionServerCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexOrionServerCenterApplication.class, args);
    }
}
