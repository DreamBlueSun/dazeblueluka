package com.kirisame.gensokyo.daze.blue.luka.entity.bo;

import java.util.Date;
import java.util.List;

/**
 * @description: 语句解析对象
 * @auther: MaoHangBin
 * @date: 2019/12/18 12:59
 */

public class SentenceParse {

    /**
     * 未解析的词语
     **/
    private List<String> notParseWordList;

    /**
     * 主对象
     **/
    private String targetFirst;

    /**
     * 副对象
     **/
    private String targetSecond;

    /**
     * 执行类型
     **/
    private String executeType;

    /**
     * 执行内容
     **/
    private String executeContent;

    /**
     * 执行参数
     **/
    private String executeParameter;

    /**
     * 执行时间（非立即执行时需要执行时间）
     **/
    private Date executeDateTime;

    public List<String> getNotParseWordList() {
        return notParseWordList;
    }

    public void setNotParseWordList(List<String> notParseWordList) {
        this.notParseWordList = notParseWordList;
    }

    public String getTargetFirst() {
        return targetFirst;
    }

    public void setTargetFirst(String targetFirst) {
        this.targetFirst = targetFirst;
    }

    public String getTargetSecond() {
        return targetSecond;
    }

    public void setTargetSecond(String targetSecond) {
        this.targetSecond = targetSecond;
    }

    public String getExecuteType() {
        return executeType;
    }

    public void setExecuteType(String executeType) {
        this.executeType = executeType;
    }

    public String getExecuteContent() {
        return executeContent;
    }

    public void setExecuteContent(String executeContent) {
        this.executeContent = executeContent;
    }

    public String getExecuteParameter() {
        return executeParameter;
    }

    public void setExecuteParameter(String executeParameter) {
        this.executeParameter = executeParameter;
    }

    public Date getExecuteDateTime() {
        return executeDateTime;
    }

    public void setExecuteDateTime(Date executeDateTime) {
        this.executeDateTime = executeDateTime;
    }
}
