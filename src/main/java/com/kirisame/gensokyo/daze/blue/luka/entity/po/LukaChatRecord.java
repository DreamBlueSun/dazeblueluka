package com.kirisame.gensokyo.daze.blue.luka.entity.po;

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

    /**
     * 消息
     */
    private String message;

    /**
     * 消息产生时间
     */
    private Date dateTime;

    /**
     * 消息指向对象id
     */
    private Integer pointTo;

    /**
     * 消息类型（0：接收自指向人，1：发送给指向人）
     */
    private Integer type;

    /**
     * 回复消息的id（消息类型为1时有值）
     */
    private String replayId;

    private static final long serialVersionUID = 1L;

    public LukaChatRecord() {
    }

    public LukaChatRecord(String id, String message, Date dateTime, Integer pointTo, Integer type) {
        this.id = id;
        this.message = message;
        this.dateTime = dateTime;
        this.pointTo = pointTo;
        this.type = type;
    }

    public LukaChatRecord(String id, String message, Date dateTime, Integer pointTo, Integer type, String replayId) {
        this.id = id;
        this.message = message;
        this.dateTime = dateTime;
        this.pointTo = pointTo;
        this.type = type;
        this.replayId = replayId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getPointTo() {
        return pointTo;
    }

    public void setPointTo(Integer pointTo) {
        this.pointTo = pointTo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getReplayId() {
        return replayId;
    }

    public void setReplayId(String replayId) {
        this.replayId = replayId;
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
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getDateTime() == null ? other.getDateTime() == null : this.getDateTime().equals(other.getDateTime()))
            && (this.getPointTo() == null ? other.getPointTo() == null : this.getPointTo().equals(other.getPointTo()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getReplayId() == null ? other.getReplayId() == null : this.getReplayId().equals(other.getReplayId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        result = prime * result + ((getPointTo() == null) ? 0 : getPointTo().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getReplayId() == null) ? 0 : getReplayId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", message=").append(message);
        sb.append(", dateTime=").append(dateTime);
        sb.append(", pointTo=").append(pointTo);
        sb.append(", type=").append(type);
        sb.append(", replayId=").append(replayId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}