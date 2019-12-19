package com.kirisame.gensokyo.daze.blue.luka.service.impl;

import com.kirisame.gensokyo.daze.blue.luka.entity.bo.SentenceParse;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceFormatBase;
import com.kirisame.gensokyo.daze.blue.luka.entity.po.SentenceParseBase;
import com.kirisame.gensokyo.daze.blue.luka.mapper.SentenceFormatBaseMapper;
import com.kirisame.gensokyo.daze.blue.luka.mapper.SentenceParseBaseMapper;
import com.kirisame.gensokyo.daze.blue.luka.service.SentenceParseService;
import com.kirisame.gensokyo.daze.blue.luka.util.SentenceDateUtils;
import com.kirisame.gensokyo.daze.blue.luka.util.SentenceParseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
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
        //解析语句
        List<SentenceParseBase> parseList = parseBaseMapper.queryInclude(sentence);
        SentenceParse sentenceParse = new SentenceParse();
        if (parseList != null && parseList.size() > 0) {
            List<SentenceParseBase> parseListSorted = parseList.stream()
                    .sorted(Comparator.comparing(SentenceParseBase::wordContentLength).reversed())
                    .collect(Collectors.toList());
            for (SentenceParseBase parse : parseListSorted) {
                String content = parse.getWordContent();
                if (sentence.contains(content)) {
                    Integer type = parse.getWordType();
                    switch (type) {
                        case 0:
                            sentenceParse.setExecuteTarget(parse.getWordParse());
                            break;
                        case 1:
                            sentenceParse.setExecuteMethod(parse.getWordParse());
                            break;
                        case 2:
                            sentenceParse.setExecuteParameter(parse.getWordParse());
                            break;
                        case 3:
                            Date date = new SentenceParseUtils<Date>().parseFunction(null, SentenceDateUtils.class, parse.getWordParse());
                            sentenceParse.setExecuteDateTime(date);
                            break;
                        default:
                            sentenceParse.setExecuteClass(parse.getWordParse());
                            break;
                    }
                    sentence = sentence.replace(content, ",");
                }
            }
            //处理未解析的数据
            String nullField = ",,";
            while (sentence.contains(nullField)) {
                sentence = sentence.replace(nullField, ",");
            }
            if (sentence.length() > 1) {
                List<String> notParseWordList = Arrays.asList(sentence.split(","));
                sentenceParse.setNotParseWordList(notParseWordList);
            }
        }
        return sentenceParse;
    }
}
