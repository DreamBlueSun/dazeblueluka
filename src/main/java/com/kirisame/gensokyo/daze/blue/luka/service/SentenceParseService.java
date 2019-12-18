package com.kirisame.gensokyo.daze.blue.luka.service;

import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/18 15:02
 */

public interface SentenceParseService {

    /**
     * @param sentence
     * @return com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse
     * @author MaoHangBin
     * @description 解析语句
     * @date 2019/12/18 15:04
     **/
    SentenceParse parseSentence(String sentence);

}
