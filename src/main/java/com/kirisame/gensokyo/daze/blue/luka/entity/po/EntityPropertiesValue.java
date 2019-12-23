package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;

/**
 * entity_properties_value
 * @author 
 */
public class EntityPropertiesValue implements Serializable {
    /**
     * 实体id
     */
    private String id;

    /**
     * 属性的id
     */
    private String propertiesId;

    /**
     * 属性的值
     */
    private String propertiesValue;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPropertiesId() {
        return propertiesId;
    }

    public void setPropertiesId(String propertiesId) {
        this.propertiesId = propertiesId;
    }

    public String getPropertiesValue() {
        return propertiesValue;
    }

    public void setPropertiesValue(String propertiesValue) {
        this.propertiesValue = propertiesValue;
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
        EntityPropertiesValue other = (EntityPropertiesValue) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPropertiesId() == null ? other.getPropertiesId() == null : this.getPropertiesId().equals(other.getPropertiesId()))
            && (this.getPropertiesValue() == null ? other.getPropertiesValue() == null : this.getPropertiesValue().equals(other.getPropertiesValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPropertiesId() == null) ? 0 : getPropertiesId().hashCode());
        result = prime * result + ((getPropertiesValue() == null) ? 0 : getPropertiesValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", propertiesId=").append(propertiesId);
        sb.append(", propertiesValue=").append(propertiesValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}