package com.cherry.cloud.mq.service.impl;

import com.cherry.cloud.mq.service.ConsumerService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @JmsListener(destination = "active.queue", containerFactory = "queueContainerFactory")
    @Override
    public void consumeQueue(String message) {
        System.out.println(message);
    }

    @JmsListener(destination = "active.topic", containerFactory = "topicContainerFactory")
    @Override
    public void consumeTopic(String message) {
        System.out.println(message);
    }
}
