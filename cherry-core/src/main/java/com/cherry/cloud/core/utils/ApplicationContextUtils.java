package com.cherry.cloud.core.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextUtils implements ApplicationContextAware {

    private static ApplicationContext APPLICATION_CONTEXT;

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        APPLICATION_CONTEXT = applicationContext;
    }

    public static Object getBean(String name) throws BeansException {
        return APPLICATION_CONTEXT.getBean(name);
    }

    public static Object getBean(String name, Object... objects) throws BeansException {
        return APPLICATION_CONTEXT.getBean(name, objects);
    }

    public static <T> T getBean(Class<T> requiredClass) throws BeansException {
        return APPLICATION_CONTEXT.getBean(requiredClass);
    }

    public static <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return APPLICATION_CONTEXT.getBean(name, requiredType);
    }

    public static ApplicationContext getApplicationContext() {
        return APPLICATION_CONTEXT;
    }
}
