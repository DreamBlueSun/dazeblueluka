package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.entity.ChatRecord;
import com.kirisame.gensokyo.daze.blue.luka.mapper.ChatRecordMapper;
import com.kirisame.gensokyo.daze.blue.luka.service.LuKaChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/9 17:57
 */

@Service
public class LuKaChatServiceImpl implements LuKaChatService {

    @Autowired
    private ChatRecordMapper chatRecordMapper;

    @Override
    public String handleMessage(String msg, String userName) {
        String resultMsg = "";
        try {
            String id = UUID.randomUUID().toString().trim();
            ChatRecord receiveRecord = new ChatRecord(id, msg, new Date(), 6810, 0);
            chatRecordMapper.insert(receiveRecord);
            ChatRecord replyRecord = new ChatRecord(id, msg, new Date(), 6810, 1);
            chatRecordMapper.insert(replyRecord);
            //TODO 回复消息
            resultMsg = ".";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultMsg;
    }
}
