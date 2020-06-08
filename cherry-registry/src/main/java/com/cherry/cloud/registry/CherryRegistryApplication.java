package com.cherry.cloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CherryRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CherryRegistryApplication.class, args);
    }
}
