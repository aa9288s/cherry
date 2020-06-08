package com.cherry.cloud.app.api.client.utils;

import com.netflix.hystrix.*;

public class UserServiceCommand extends HystrixCommand<String> {

    public UserServiceCommand() {
        super(Setter.withGroupKey(
                HystrixCommandGroupKey.Factory.asKey("userService"))
                .andCommandKey(HystrixCommandKey.Factory.asKey("queryById"))
                .andCommandPropertiesDefaults(
                        HystrixCommandProperties.Setter()
                                .withCircuitBreakerEnabled(true)
                                .withCircuitBreakerRequestVolumeThreshold(10)
                                .withCircuitBreakerSleepWindowInMilliseconds(5000)
                                .withCircuitBreakerErrorThresholdPercentage(60)
                                .withExecutionTimeoutEnabled(true)
                ).andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("UserServiceThreadPool"))
                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(10)));
    }

    @Override
    protected String run() throws Exception {
        //return Math.random() * 100 + "";
        throw new RuntimeException("111");
    }

    @Override
    protected String getFallback() {
        return "-1";
    }
}
