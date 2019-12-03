package com.code.websocket.sockjs.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author H
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    /**
     * 有关客户端建立连接的部分
     *
     * @param registry StompEndpointRegistry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry
                // 配置连接前缀，客户端建立连接时：localhost:port/server
                .addEndpoint("/server")
                // 允许所有域
                .setAllowedOrigins("*")
                // 支持以 SockJs 的方式建立连接，这是一个备选方案，在 WebSocket 不可用的时候启用
                .withSockJS();
    }

    /**
     * 消息代理相关配置
     *
     * @param registry MessageBrokerRegistry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // 配置应用前缀，客户端每次访问的时候需要带上此前缀，比如 /app/hello
//        registry.setApplicationDestinationPrefixes("/app");
    }
}
