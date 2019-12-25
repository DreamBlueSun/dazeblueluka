package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sentence_parse_base
 *
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
     * 单词类型（0：对象；1：内容；2：参数，3：时间；4：询问-；5：动作-）（带-标识的类型，解析对象中同时仅存在一个）
     */
    private Integer wordType;

    /**
     * 词义（暂无作用）
     */
    private String wordDescribe;

    /**
     * 录入时间
     */
    private Date enterDate;

    /**
     * 单词解析（根据单词类型不同，解析也不同）
     */
    private String wordParse;

    private static final long serialVersionUID = 1L;

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

    public Integer getWordType() {
        return wordType;
    }

    public void setWordType(Integer wordType) {
        this.wordType = wordType;
    }

    public String getWordDescribe() {
        return wordDescribe;
    }

    public void setWordDescribe(String wordDescribe) {
        this.wordDescribe = wordDescribe;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public String getWordParse() {
        return wordParse;
    }

    public void setWordParse(String wordParse) {
        this.wordParse = wordParse;
    }

    public int wordContentLength() {
        return wordContent.length();
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
                && (this.getWordType() == null ? other.getWordType() == null : this.getWordType().equals(other.getWordType()))
                && (this.getWordDescribe() == null ? other.getWordDescribe() == null : this.getWordDescribe().equals(other.getWordDescribe()))
                && (this.getEnterDate() == null ? other.getEnterDate() == null : this.getEnterDate().equals(other.getEnterDate()))
                && (this.getWordParse() == null ? other.getWordParse() == null : this.getWordParse().equals(other.getWordParse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getWordContent() == null) ? 0 : getWordContent().hashCode());
        result = prime * result + ((getWordType() == null) ? 0 : getWordType().hashCode());
        result = prime * result + ((getWordDescribe() == null) ? 0 : getWordDescribe().hashCode());
        result = prime * result + ((getEnterDate() == null) ? 0 : getEnterDate().hashCode());
        result = prime * result + ((getWordParse() == null) ? 0 : getWordParse().hashCode());
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
        sb.append(", wordType=").append(wordType);
        sb.append(", wordDescribe=").append(wordDescribe);
        sb.append(", enterDate=").append(enterDate);
        sb.append(", wordParse=").append(wordParse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}