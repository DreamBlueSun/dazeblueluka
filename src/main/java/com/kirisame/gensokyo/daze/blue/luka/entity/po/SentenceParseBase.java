package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sentence_parse_base
 * @author 
 */
public class SentenceParseBase implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 单词内容
     */
    private String wordContent;

    /**
     * 单词解析（根据单词类型不同，解析也不同）
     */
    private String wordParse;

    /**
     * 录入时间
     */
    private Date enterDate;

    /**
     * 单词类型的id
     */
    private String wordTypeId;

    /**
     * 词义（暂无作用）
     */
    private String wordDescribe;

    private static final long serialVersionUID = 1L;

    public int wordContentLength() {
        return wordContent.length();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWordContent() {
        return wordContent;
    }

    public void setWordContent(String wordContent) {
        this.wordContent = wordContent;
    }

    public String getWordParse() {
        return wordParse;
    }

    public void setWordParse(String wordParse) {
        this.wordParse = wordParse;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public String getWordTypeId() {
        return wordTypeId;
    }

    public void setWordTypeId(String wordTypeId) {
        this.wordTypeId = wordTypeId;
    }

    public String getWordDescribe() {
        return wordDescribe;
    }

    public void setWordDescribe(String wordDescribe) {
        this.wordDescribe = wordDescribe;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SentenceParseBase other = (SentenceParseBase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getWordContent() == null ? other.getWordContent() == null : this.getWordContent().equals(other.getWordContent()))
            && (this.getWordParse() == null ? other.getWordParse() == null : this.getWordParse().equals(other.getWordParse()))
            && (this.getEnterDate() == null ? other.getEnterDate() == null : this.getEnterDate().equals(other.getEnterDate()))
            && (this.getWordTypeId() == null ? other.getWordTypeId() == null : this.getWordTypeId().equals(other.getWordTypeId()))
            && (this.getWordDescribe() == null ? other.getWordDescribe() == null : this.getWordDescribe().equals(other.getWordDescribe()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWordContent() == null) ? 0 : getWordContent().hashCode());
        result = prime * result + ((getWordParse() == null) ? 0 : getWordParse().hashCode());
        result = prime * result + ((getEnterDate() == null) ? 0 : getEnterDate().hashCode());
        result = prime * result + ((getWordTypeId() == null) ? 0 : getWordTypeId().hashCode());
        result = prime * result + ((getWordDescribe() == null) ? 0 : getWordDescribe().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wordContent=").append(wordContent);
        sb.append(", wordParse=").append(wordParse);
        sb.append(", enterDate=").append(enterDate);
        sb.append(", wordTypeId=").append(wordTypeId);
        sb.append(", wordDescribe=").append(wordDescribe);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}