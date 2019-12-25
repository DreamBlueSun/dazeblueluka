package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;

/**
 * kind_properties
 * @author 
 */
public class KindProperties implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 种类id
     */
    private String kindId;

    /**
     * 属性id
     */
    private String propertiesId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKindId() {
        return kindId;
    }

    public void setKindId(String kindId) {
        this.kindId = kindId;
    }

    public String getPropertiesId() {
        return propertiesId;
    }

    public void setPropertiesId(String propertiesId) {
        this.propertiesId = propertiesId;
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
        KindProperties other = (KindProperties) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getKindId() == null ? other.getKindId() == null : this.getKindId().equals(other.getKindId()))
            && (this.getPropertiesId() == null ? other.getPropertiesId() == null : this.getPropertiesId().equals(other.getPropertiesId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getKindId() == null) ? 0 : getKindId().hashCode());
        result = prime * result + ((getPropertiesId() == null) ? 0 : getPropertiesId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", kindId=").append(kindId);
        sb.append(", propertiesId=").append(propertiesId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}