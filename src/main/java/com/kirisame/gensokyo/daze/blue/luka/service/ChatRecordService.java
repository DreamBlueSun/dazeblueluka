package com.kirisame.gensokyo.daze.blue.luka.service;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/9 17:57
 */

public interface ChatRecordService {

    /**
     * @param msg     接收的消息
     * @param pointTo 消息发送者id
     * @return java.lang.String 当前消息记录数据的id
     * @author MaoHangBin
     * @description 记录接收消息
     * @date 2019/12/9 18:02
     **/
    String receiveRecordMessage(String msg, int pointTo);

    /**
     * @param receiveId 回复消息记录数据的id
     * @param msg       回复的消息
     * @param pointTo   消息接收者id
     * @return void
     * @author MaoHangBin
     * @description 记录回复消息
     * @date 2019/12/23 14:56
     **/
    void replyRecordMessage(String receiveId, String msg, int pointTo);

}
