package com.code.websocket.sockjs.controller;

import com.code.websocket.sockjs.model.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

/**
 * @author H
 */
@Controller
public class WebSockController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public Chat chat(Chat chat) {
        System.out.println("收到消息：" + chat);
        chat.setPushTime("chat " + System.currentTimeMillis());
        System.out.println("推送消息：" + chat);
        return chat;
    }

    @MessageMapping("/test")
    @SendTo("/topic/test")
    public Chat test(Chat chat) {
        System.out.println("收到消息：" + chat);
        chat.setPushTime("test " + System.currentTimeMillis());
        System.out.println("推送消息：" + chat);
        return chat;
    }

    @Scheduled(fixedRate = 1000)
    public void heartbeat() {
        String data = String.valueOf(System.currentTimeMillis());
        simpMessagingTemplate.convertAndSend("/topic/heartbeat", data);
    }

}
