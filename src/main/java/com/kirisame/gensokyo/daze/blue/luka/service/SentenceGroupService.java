package com.kirisame.gensokyo.daze.blue.luka.service;

import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/18 17:59
 */

public interface SentenceGroupService {

    /**
     * @param name
     * @param sentenceParse
     * @return java.lang.String
     * @author MaoHangBin
     * @description 根据语句解析组装回复语句
     * @date 2019/12/18 18:01
     **/
    String groupSentence(String name, SentenceParse sentenceParse);

}
