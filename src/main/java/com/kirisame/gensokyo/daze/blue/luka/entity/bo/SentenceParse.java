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
     * 消息对象
     **/
    private String executeTarget;

    /**
     * 执行类型
     **/
    private String executeClass;

    /**
     * 执行内容
     **/
    private String executeMethod;

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

    public String getExecuteTarget() {
        return executeTarget;
    }

    public void setExecuteTarget(String executeTarget) {
        this.executeTarget = executeTarget;
    }

    public String getExecuteClass() {
        return executeClass;
    }

    public void setExecuteClass(String executeClass) {
        this.executeClass = executeClass;
    }

    public String getExecuteMethod() {
        return executeMethod;
    }

    public void setExecuteMethod(String executeMethod) {
        this.executeMethod = executeMethod;
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
