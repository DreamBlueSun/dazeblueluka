package com.kirisame.gensokyo.daze.blue.luka.entity.bo;

import org.springframework.web.socket.WebSocketSession;

/**
 * @description: 连接中的用户
 * @auther: MaoHangBin
 * @date: 2019/12/18 11:27
 */

public class Player {

    /**
     * 名称
     **/
    private String name;

    /**
     * 会话
     **/
    private WebSocketSession session;

    public Player() {
    }

    public Player(String name, WebSocketSession session) {
        this.name = name;
        this.session = session;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebSocketSession getSession() {
        return session;
    }

    public void setSession(WebSocketSession session) {
        this.session = session;
    }
}
