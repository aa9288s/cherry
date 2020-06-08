package com.cherry.cloud.app.api.client.autoconfiguration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients
@EnableDiscoveryClient
@Configuration
public class APIClientAutoConfiguration {
}
