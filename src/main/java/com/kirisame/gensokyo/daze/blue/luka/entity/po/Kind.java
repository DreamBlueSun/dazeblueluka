package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;

/**
 * kind
 * @author 
 */
public class Kind implements Serializable {
    private String id;

    /**
     * 实体名称
     */
    private String kindName;

    /**
     * 实体详细说明
     */
    private String kindDesc;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc;
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
        Kind other = (Kind) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKindName() == null ? other.getKindName() == null : this.getKindName().equals(other.getKindName()))
            && (this.getKindDesc() == null ? other.getKindDesc() == null : this.getKindDesc().equals(other.getKindDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKindName() == null) ? 0 : getKindName().hashCode());
        result = prime * result + ((getKindDesc() == null) ? 0 : getKindDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", kindName=").append(kindName);
        sb.append(", kindDesc=").append(kindDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}