package com.cherry.cloud.app.sys.controller;

import com.cherry.cloud.mq.service.ConsumerService;
import com.cherry.cloud.mq.service.ProducerService;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQController {

    @Autowired
    private ProducerService producerService;
    @Autowired
    private ConsumerService consumerService;

    @PostMapping("/mq/message")
    public ResponseEntity produce(@RequestBody String jsonStr) {
        producerService.produce(new ActiveMQQueue("active.queue"), "This is queue message");
        return ResponseEntity.ok("");
    }
}
