package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.LukaChatRecord;
import com.kirisame.gensokyo.daze.blue.luka.mapper.LukaChatRecordMapper;
import com.kirisame.gensokyo.daze.blue.luka.service.ChatRecordService;
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
public class ChatRecordServiceImpl implements ChatRecordService {

    @Autowired
    private LukaChatRecordMapper chatRecordMapper;

    @Override
    public void recordMessage(String msg, String userName) {
        try {
            String receiveId = UUID.randomUUID().toString().replace("-", "").trim();
            LukaChatRecord receiveRecord = new LukaChatRecord(receiveId, msg, new Date(), 6810, 0);
            chatRecordMapper.insert(receiveRecord);
            String replyId = UUID.randomUUID().toString().replace("-", "").trim();
            LukaChatRecord replyRecord = new LukaChatRecord(replyId, msg, new Date(), 6810, 1);
            chatRecordMapper.insert(replyRecord);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
