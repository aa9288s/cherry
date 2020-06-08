package com.cherry.cloud.mq.service.impl;

import com.cherry.cloud.mq.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.Message;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Override
    public boolean produce(Destination destination, String message) {
        jmsMessagingTemplate.convertAndSend(destination, message);
        return true;
    }
}
