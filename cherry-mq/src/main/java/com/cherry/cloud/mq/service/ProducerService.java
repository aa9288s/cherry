package com.cherry.cloud.mq.service;

import javax.jms.Destination;
import javax.jms.Message;

public interface ProducerService {

    boolean produce(Destination destination, String message);
}
