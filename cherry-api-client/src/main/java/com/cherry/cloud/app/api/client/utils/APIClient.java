package com.cherry.cloud.app.api.client.utils;

import org.springframework.web.client.RestTemplate;

public class APIClient {

    private RestTemplate restTemplate;

    public APIClient(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
}
