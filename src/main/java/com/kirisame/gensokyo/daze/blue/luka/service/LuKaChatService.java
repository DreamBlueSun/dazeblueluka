package com.kirisame.gensokyo.daze.blue.luka.service;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/9 17:57
 */

public interface LuKaChatService {

    /**
     * @param msg      消息
     * @param userName 消息发送者
     * @return java.lang.String
     * @author MaoHangBin
     * @description 消息处理方法
     * @date 2019/12/9 18:02
     **/
    String handleMessage(String msg, String userName);

}
