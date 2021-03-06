package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.entity.po.LukaChatRecord;
import com.kirisame.gensokyo.daze.blue.luka.mapper.LukaChatRecordMapper;
import com.kirisame.gensokyo.daze.blue.luka.service.ChatRecordService;
import com.kirisame.gensokyo.daze.blue.luka.util.DazeStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    public String receiveRecordMessage(String msg, int pointTo) {
        try {
            String receiveId = DazeStringUtils.randomUUID();
            LukaChatRecord receiveRecord = new LukaChatRecord(receiveId, msg, new Date(), pointTo, 0);
            chatRecordMapper.insert(receiveRecord);
            return receiveId;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void replyRecordMessage(String receiveId, String msg, int pointTo) {
        try {
            if (receiveId != null) {
                String replyId = DazeStringUtils.randomUUID();
                LukaChatRecord replyRecord = new LukaChatRecord(replyId, msg, new Date(), pointTo, 1, receiveId);
                chatRecordMapper.insert(replyRecord);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
