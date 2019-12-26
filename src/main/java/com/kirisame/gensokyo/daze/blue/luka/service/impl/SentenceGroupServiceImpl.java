package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.constant.ConstantSentenceGroup;
import com.kirisame.gensokyo.daze.blue.luka.constant.ConstantSentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.service.SentenceGroupService;
import com.kirisame.gensokyo.daze.blue.luka.util.SentenceParseUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
        //获取解析数据
        Map<String, String> parseDataMap = sentenceParse.getParseDataMap();
        String parseClass = ConstantSentenceGroup.GROUP_CLASS_PREFIX + parseDataMap.get(ConstantSentenceParse.WORD_TYPE_CLASS);
        String parseTime = parseDataMap.get(ConstantSentenceParse.WORD_TYPE_TIME);
//        Date date = new SentenceParseUtils<Date>().parseFunction(null, SentenceDateUtils.class, parseTime);
        String parseEntity = parseDataMap.get(ConstantSentenceParse.WORD_TYPE_ENTITY);
        String parseProperties = parseDataMap.get(ConstantSentenceParse.WORD_TYPE_PROPERTIES);
        String parseParameter = parseDataMap.get(ConstantSentenceParse.WORD_TYPE_PARAMETER);
        //解析、返回
        String[] parameters = new String[]{parseEntity, parseProperties};
        String executeResult = new SentenceParseUtils<String>().parseFunction(null, parseClass, "propertiesValue", parameters);
        return executeResult;
    }

    private String disposeNotParseWordList(List<String> notParseWordList) {
        StringBuffer stringBuffer = new StringBuffer("无法理解：");
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
