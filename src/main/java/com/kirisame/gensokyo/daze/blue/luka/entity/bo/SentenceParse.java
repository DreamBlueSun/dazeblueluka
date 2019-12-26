package com.kirisame.gensokyo.daze.blue.luka.entity.bo;

import java.util.List;
import java.util.Map;

/**
 * @description: 语句解析对象
 * @auther: MaoHangBin
 * @date: 2019/12/18 12:59
 */

public class SentenceParse {

    /**
     * 未解析的词语List
     **/
    private List<String> notParseWordList;

    /**
     * 已解析的数据Map
     **/
    private Map<String, String> parseDataMap;

    public List<String> getNotParseWordList() {
        return notParseWordList;
    }

    public void setNotParseWordList(List<String> notParseWordList) {
        this.notParseWordList = notParseWordList;
    }

    public Map<String, String> getParseDataMap() {
        return parseDataMap;
    }

    public void setParseDataMap(Map<String, String> parseDataMap) {
        this.parseDataMap = parseDataMap;
    }
}
