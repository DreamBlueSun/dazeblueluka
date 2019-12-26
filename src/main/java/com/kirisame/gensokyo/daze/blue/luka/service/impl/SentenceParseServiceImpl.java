package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.constant.ConstantSentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceFormatBase;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceParseBase;
import com.kirisame.gensokyo.daze.blue.luka.mapper.SentenceFormatBaseMapper;
import com.kirisame.gensokyo.daze.blue.luka.mapper.SentenceParseBaseMapper;
import com.kirisame.gensokyo.daze.blue.luka.service.SentenceParseService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @description:
 * @auther: MaoHangBin
 * @date: 2019/12/18 15:04
 */

@Service
public class SentenceParseServiceImpl implements SentenceParseService {

    @Autowired
    private SentenceFormatBaseMapper formatBaseMapper;
    @Autowired
    private SentenceParseBaseMapper parseBaseMapper;

    @Override
    public SentenceParse parseSentence(String sentence) {
        //格式化语句
        List<SentenceFormatBase> formatList = formatBaseMapper.queryInclude(sentence);
        if (formatList != null && formatList.size() > 0) {
            List<SentenceFormatBase> formatListSorted = formatList.stream()
                    .sorted(Comparator.comparing(SentenceFormatBase::sourceWordLength).reversed())
                    .collect(Collectors.toList());
            for (SentenceFormatBase format : formatListSorted) {
                if (sentence.contains(format.getSourceWord())) {
                    sentence = sentence.replace(format.getSourceWord(), format.getResultWord());
                }
            }
        }
        String replaceField = ",";
        String nullField = ",,";
        //解析语句
        List<SentenceParseBase> parseList = parseBaseMapper.queryInclude(sentence);
        SentenceParse sentenceParse = new SentenceParse();
        Map<String, String> parseMap = new ConcurrentHashMap<>(16);
        if (parseList != null && parseList.size() > 0) {
            //处理解析的数据
            List<SentenceParseBase> parseListSorted = parseList.stream()
                    .sorted(Comparator.comparing(SentenceParseBase::wordContentLength).reversed())
                    .collect(Collectors.toList());
            for (SentenceParseBase parse : parseListSorted) {
                String content = parse.getWordContent();
                if (sentence.contains(content)) {
                    String type = parse.getWordTypeId();
                    switch (type) {
                        case ConstantSentenceParse.WORD_TYPE_CLASS:
                            parseMap.put(ConstantSentenceParse.WORD_TYPE_CLASS, parse.getWordParse());
                            break;
                        case ConstantSentenceParse.WORD_TYPE_TIME:
                            parseMap.put(ConstantSentenceParse.WORD_TYPE_TIME, parse.getWordParse());
                            break;
                        case ConstantSentenceParse.WORD_TYPE_ENTITY:
                            parseMap.put(ConstantSentenceParse.WORD_TYPE_ENTITY, parse.getWordParse());
                            break;
                        case ConstantSentenceParse.WORD_TYPE_PROPERTIES:
                            parseMap.put(ConstantSentenceParse.WORD_TYPE_PROPERTIES, parse.getWordParse());
                            break;
                        case ConstantSentenceParse.WORD_TYPE_PARAMETER:
                            parseMap.put(ConstantSentenceParse.WORD_TYPE_PARAMETER, parse.getWordParse());
                            break;
                        default:
                            break;
                    }
                    sentence = sentence.replace(content, replaceField);
                }
            }
            sentenceParse.setParseDataMap(parseMap);
            //处理未解析的数据
            while (sentence.contains(nullField)) {
                sentence = sentence.replace(nullField, replaceField);
            }
            if (StringUtils.startsWith(sentence, replaceField)) {
                sentence = StringUtils.substring(sentence, 1);
            }
            if (StringUtils.endsWith(sentence, replaceField)) {
                sentence = StringUtils.substring(sentence, 0, sentence.length() - 1);
            }
            if (sentence.length() > 0) {
                if (StringUtils.endsWith(sentence, replaceField)) {
                    sentence = sentence.substring(0, sentence.length() - 1);
                }
                List<String> notParseWordList = Arrays.asList(sentence.split(replaceField));
                sentenceParse.setNotParseWordList(notParseWordList);
            }
        }
        return sentenceParse;
    }
}
