package com.cherry.cloud.gateway.autoconfiguration;

import com.cherry.cloud.gateway.fallback.UniteFallbackProvider;
import com.cherry.cloud.gateway.filter.TokenFilter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@EnableZuulProxy
@Configuration
public class GatewayAutoConfiguration {

    @Bean
    public UniteFallbackProvider uniteFallbackProvider() {
        return new UniteFallbackProvider();
    }

    @Bean
    public TokenFilter TokenFilter() {
        return new TokenFilter();
    }
}
