package com.code.rabbitmq.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class Consumer {

    @RabbitHandler
    public void get(String content) {
        System.out.println("[Consumer] " + content);
    }
}