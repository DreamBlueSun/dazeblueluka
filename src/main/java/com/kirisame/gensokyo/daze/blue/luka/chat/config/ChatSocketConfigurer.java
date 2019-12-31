package com.kirisame.gensokyo.daze.blue.luka.chat.config;

import com.kirisame.gensokyo.daze.blue.luka.chat.ChatHandler;
import com.kirisame.gensokyo.daze.blue.luka.chat.ChatInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * @description: 配置
 * @auther: MaoHangBin
 * @date: 2019/11/27 15:14
 */
@Configuration
@EnableWebSocket
public class ChatSocketConfigurer implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry webSocketHandlerRegistry) {
        webSocketHandlerRegistry.addHandler(new ChatHandler(), "luKaChat/*").addInterceptors(new ChatInterceptor()).setAllowedOrigins("*");
    }
}
