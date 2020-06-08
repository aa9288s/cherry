package com.cherry.cloud.app.sys.autoconfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class SpringRedisSessionAutoConfiguration {
}
