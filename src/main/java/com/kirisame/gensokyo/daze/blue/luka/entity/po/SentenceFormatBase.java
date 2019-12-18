package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;
import java.util.Date;

/**
 * sentence_format_base
 * @author 
 */
public class SentenceFormatBase implements Serializable {
    private String id;

    /**
     * 源语句
     */
    private String sourceWord;

    /**
     * 转义后的语句
     */
    private String resultWord;

    /**
     * 入表时间
     */
    private Date enterDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSourceWord() {
        return sourceWord;
    }

    public void setSourceWord(String sourceWord) {
        this.sourceWord = sourceWord;
    }

    public String getResultWord() {
        return resultWord;
    }

    public void setResultWord(String resultWord) {
        this.resultWord = resultWord;
    }

    public Date getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(Date enterDate) {
        this.enterDate = enterDate;
    }

    public int sourceWordLength(){
        return sourceWord.length();
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
        SentenceFormatBase other = (SentenceFormatBase) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSourceWord() == null ? other.getSourceWord() == null : this.getSourceWord().equals(other.getSourceWord()))
            && (this.getResultWord() == null ? other.getResultWord() == null : this.getResultWord().equals(other.getResultWord()))
            && (this.getEnterDate() == null ? other.getEnterDate() == null : this.getEnterDate().equals(other.getEnterDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSourceWord() == null) ? 0 : getSourceWord().hashCode());
        result = prime * result + ((getResultWord() == null) ? 0 : getResultWord().hashCode());
        result = prime * result + ((getEnterDate() == null) ? 0 : getEnterDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sourceWord=").append(sourceWord);
        sb.append(", resultWord=").append(resultWord);
        sb.append(", enterDate=").append(enterDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}