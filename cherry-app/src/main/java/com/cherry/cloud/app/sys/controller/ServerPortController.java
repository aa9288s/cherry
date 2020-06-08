package com.cherry.cloud.app.sys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerPortController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/server/port")
    public Object port(){
        return ResponseEntity.ok(this.port);
    }
}
