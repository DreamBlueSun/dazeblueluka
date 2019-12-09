package com.kirisame.gensokyo.daze.blue.luka.chat;

import com.alibaba.fastjson.JSONObject;
import com.kirisame.gensokyo.daze.blue.luka.service.LuKaChatService;
import com.kirisame.gensokyo.daze.blue.luka.util.SpringUtils;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 处理器
 * @auther: MaoHangBin
 * @date: 2019/11/27 15:29
 */

public class ChatHandler extends TextWebSocketHandler {

    private LuKaChatService chatService = SpringUtils.getBean(LuKaChatService.class);

    private Map<String, String> clientMap = new ConcurrentHashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        String userName = (String) session.getAttributes().get("userName");
        clientMap.put(session.getId(), userName);
        super.afterConnectionEstablished(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //获取发送过来的内容
        byte[] bytes = message.asBytes();
        String messageContent = new String(bytes);
        JSONObject jsonObject = JSONObject.parseObject(messageContent);
        //获取发送者名字
        String name = clientMap.get(session.getId());
        //发送过来的消息
        String content = (String) jsonObject.get("content");
        //处理消息
        String resultMsg = chatService.handleMessage(content, name);
        if (session != null && session.isOpen()) {
            //发送消息
            session.sendMessage(new TextMessage(resultMsg));
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
    }
}
