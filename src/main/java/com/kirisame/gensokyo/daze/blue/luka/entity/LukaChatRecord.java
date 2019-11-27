package com.kirisame.gensokyo.daze.blue.luka.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * luka_chat_record
 * @author 
 */
public class LukaChatRecord implements Serializable {
    /**
     * 唯一主键
     */
    private String id;

    private String receivedMessage;

    private Date receivedTime;

    private Integer receivedFrom;

    private Integer repliedStatus;

    private String repliedMessage;

    private Date repliedTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceivedMessage() {
        return receivedMessage;
    }

    public void setReceivedMessage(String receivedMessage) {
        this.receivedMessage = receivedMessage;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public Integer getReceivedFrom() {
        return receivedFrom;
    }

    public void setReceivedFrom(Integer receivedFrom) {
        this.receivedFrom = receivedFrom;
    }

    public Integer getRepliedStatus() {
        return repliedStatus;
    }

    public void setRepliedStatus(Integer repliedStatus) {
        this.repliedStatus = repliedStatus;
    }

    public String getRepliedMessage() {
        return repliedMessage;
    }

    public void setRepliedMessage(String repliedMessage) {
        this.repliedMessage = repliedMessage;
    }

    public Date getRepliedTime() {
        return repliedTime;
    }

    public void setRepliedTime(Date repliedTime) {
        this.repliedTime = repliedTime;
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
        LukaChatRecord other = (LukaChatRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReceivedMessage() == null ? other.getReceivedMessage() == null : this.getReceivedMessage().equals(other.getReceivedMessage()))
            && (this.getReceivedTime() == null ? other.getReceivedTime() == null : this.getReceivedTime().equals(other.getReceivedTime()))
            && (this.getReceivedFrom() == null ? other.getReceivedFrom() == null : this.getReceivedFrom().equals(other.getReceivedFrom()))
            && (this.getRepliedStatus() == null ? other.getRepliedStatus() == null : this.getRepliedStatus().equals(other.getRepliedStatus()))
            && (this.getRepliedMessage() == null ? other.getRepliedMessage() == null : this.getRepliedMessage().equals(other.getRepliedMessage()))
            && (this.getRepliedTime() == null ? other.getRepliedTime() == null : this.getRepliedTime().equals(other.getRepliedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReceivedMessage() == null) ? 0 : getReceivedMessage().hashCode());
        result = prime * result + ((getReceivedTime() == null) ? 0 : getReceivedTime().hashCode());
        result = prime * result + ((getReceivedFrom() == null) ? 0 : getReceivedFrom().hashCode());
        result = prime * result + ((getRepliedStatus() == null) ? 0 : getRepliedStatus().hashCode());
        result = prime * result + ((getRepliedMessage() == null) ? 0 : getRepliedMessage().hashCode());
        result = prime * result + ((getRepliedTime() == null) ? 0 : getRepliedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", receivedMessage=").append(receivedMessage);
        sb.append(", receivedTime=").append(receivedTime);
        sb.append(", receivedFrom=").append(receivedFrom);
        sb.append(", repliedStatus=").append(repliedStatus);
        sb.append(", repliedMessage=").append(repliedMessage);
        sb.append(", repliedTime=").append(repliedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}