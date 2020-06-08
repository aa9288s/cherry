package com.cherry.cloud.gateway.filter;

public enum ZuulFilterType {
    PRE("pre", "pre"),
    ROUTING("routing", "route"),
    ERROR("error", "error"),
    POST("post", "post");


    final private String name;
    final private String value;

    ZuulFilterType(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
