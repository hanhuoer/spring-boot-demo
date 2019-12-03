package com.code.websocket.sockjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootWebsocketSockjsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebsocketSockjsApplication.class, args);
    }

}
