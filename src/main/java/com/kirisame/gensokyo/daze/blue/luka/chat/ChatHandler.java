package com.kirisame.gensokyo.daze.blue.luka.chat;

import com.alibaba.fastjson.JSONObject;
import com.kirisame.gensokyo.daze.blue.luka.entity.bo.Player;
import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.service.ChatRecordService;
import com.kirisame.gensokyo.daze.blue.luka.service.SentenceGroupService;
import com.kirisame.gensokyo.daze.blue.luka.service.SentenceParseService;
import com.kirisame.gensokyo.daze.blue.luka.util.SpringUtils;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 处理器
 * @auther: MaoHangBin
 * @date: 2019/11/27 15:29
 */

public class ChatHandler extends TextWebSocketHandler {

    private ChatRecordService chatRecordService = SpringUtils.getBean(ChatRecordService.class);

    private SentenceParseService parseService = SpringUtils.getBean(SentenceParseService.class);

    private SentenceGroupService groupService = SpringUtils.getBean(SentenceGroupService.class);

    /**
     * Map<sessionId, player>
     **/
    private Map<String, Player> playerMap = new ConcurrentHashMap<>();

    /**
     * Map<playerId, session>
     **/
    private static Map<String, WebSocketSession> sessionMap = new ConcurrentHashMap<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        String userName = (String) session.getAttributes().get("userName");
        playerMap.put(session.getId(), new Player(userName, session));
        sessionMap.put(userName, session);
        super.afterConnectionEstablished(session);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        //获取发送过来的内容
        byte[] bytes = message.asBytes();
        String messageContent = new String(bytes);
        JSONObject jsonObject = JSONObject.parseObject(messageContent);
        //获取发送者名字
        String name = playerMap.get(session.getId()).getName();
        //发送过来的消息
        String content = (String) jsonObject.get("content");
        //处理消息
        chatRecordService.recordMessage(content, name);
        SentenceParse sentenceParse = parseService.parseSentence(content);
        String resultContent = groupService.groupSentence(name, sentenceParse);
        if (session != null && session.isOpen()) {
            //发送消息
            session.sendMessage(new TextMessage(resultContent));
        }
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        super.afterConnectionClosed(session, status);
    }

    public static void sendMessage(String playerId, String message) {
        WebSocketSession session = sessionMap.get(playerId);
        if (session != null && session.isOpen()) {
            try {
                session.sendMessage(new TextMessage(message));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
