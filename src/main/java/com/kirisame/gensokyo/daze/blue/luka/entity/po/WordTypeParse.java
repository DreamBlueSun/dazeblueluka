package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;

/**
 * word_type_parse
 * @author 
 */
public class WordTypeParse implements Serializable {
    /**
     * 单词内容
     */
    private String word;

    /**
     * 类型名称
     */
    private String type;

    /**
     * 单词解析（根据单词类型不同，解析也不同）
     */
    private String parse;

    private static final long serialVersionUID = 1L;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParse() {
        return parse;
    }

    public void setParse(String parse) {
        this.parse = parse;
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
        WordTypeParse other = (WordTypeParse) that;
        return (this.getWord() == null ? other.getWord() == null : this.getWord().equals(other.getWord()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getParse() == null ? other.getParse() == null : this.getParse().equals(other.getParse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWord() == null) ? 0 : getWord().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getParse() == null) ? 0 : getParse().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", word=").append(word);
        sb.append(", type=").append(type);
        sb.append(", parse=").append(parse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}