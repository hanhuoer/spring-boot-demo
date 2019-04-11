package com.code.rabbitmq.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class Producer {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void put() {
        String content = "hello" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date());
        System.out.println("[Producer] " + content);
        this.rabbitTemplate.convertAndSend("hello", content);
    }
}