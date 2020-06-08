package com.cherry.cloud.mq.autoconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

@EnableJms
@Configuration
public class SpringActiveMQAutoConfiguration {

    /**
     * 实现监听queue
     *
     * @param connectionFactory
     * @return
     */
    @Bean("queueContainerFactory")
    public JmsListenerContainerFactory<?> queueContainerFactory(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        jmsListenerContainerFactory.setPubSubDomain(false);
        return  jmsListenerContainerFactory;
    }


    /**
     * 实现监听topic
     *
     * @param connectionFactory
     * @return
     */
    @Bean("topicContainerFactory")
    public JmsListenerContainerFactory<?> topicContainerFactory(ConnectionFactory connectionFactory){
        DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        jmsListenerContainerFactory.setPubSubDomain(true);
        return  jmsListenerContainerFactory;
    }
}
