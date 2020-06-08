package com.cherry.cloud.mq.service;

import org.apache.activemq.Message;

public interface ConsumerService {

    void consumeQueue(String message);

    void consumeTopic(String message);
}
