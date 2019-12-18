package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.service.SentenceGroupService;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/18 17:59
 */

public class SentenceGroupServiceImpl implements SentenceGroupService {
    @Override
    public String groupSentence(SentenceParse sentenceParse) {
        List<String> notParseWordList = sentenceParse.getNotParseWordList();
        if (notParseWordList != null) {
            StringBuffer stringBuffer = new StringBuffer("目前还不懂得这些词语：");
            for (int i = 0; i < notParseWordList.size(); i++) {
                stringBuffer.append(notParseWordList.get(i));
                if (i < notParseWordList.size() - 1) {
                    stringBuffer.append("、");
                } else {
                    stringBuffer.append("。");
                }
            }
            return stringBuffer.toString();
        }
        String targetFirst = sentenceParse.getTargetFirst();
        String targetSecond = sentenceParse.getTargetSecond();
        String executeType = sentenceParse.getExecuteType();
        String executeContent = sentenceParse.getExecuteContent();
        String executeParameter = sentenceParse.getExecuteParameter();
        Date executeDateTime = sentenceParse.getExecuteDateTime();
        return "";
    }
}
