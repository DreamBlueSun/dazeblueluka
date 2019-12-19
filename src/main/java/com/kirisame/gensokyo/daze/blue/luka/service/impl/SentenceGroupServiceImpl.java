package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.service.SentenceGroupService;
import com.kirisame.gensokyo.daze.blue.luka.util.SentenceParseUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/18 17:59
 */
@Service
public class SentenceGroupServiceImpl implements SentenceGroupService {

    @Override
    public String groupSentence(String name, SentenceParse sentenceParse) {
        List<String> notParseWordList = sentenceParse.getNotParseWordList();
        if (notParseWordList != null) {
            return disposeNotParseWordList(notParseWordList);
        }
        //TODO 执行时间
        Date executeDateTime = sentenceParse.getExecuteDateTime();
        //TODO 执行目标
        String target = sentenceParse.getExecuteTarget();
        //解析、返回
        String executeType = sentenceParse.getExecuteClass();
        String executeContent = sentenceParse.getExecuteMethod();
        String executeParameter = sentenceParse.getExecuteParameter();
        String executeResult = new SentenceParseUtils<String>().parseFunction(null, executeType, executeContent, target);
        return executeResult;
    }

    private String disposeNotParseWordList(List<String> notParseWordList) {
        StringBuffer stringBuffer = new StringBuffer("：");
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


}
