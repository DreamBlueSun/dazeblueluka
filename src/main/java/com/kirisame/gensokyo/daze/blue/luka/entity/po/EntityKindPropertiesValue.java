package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;

/**
 * entity_kind_properties_value
 * @author 
 */
public class EntityKindPropertiesValue implements Serializable {
    /**
     * 实体id
     */
    private String entityId;

    /**
     * 种类名称
     */
    private String kindName;

    /**
     * 属性名称
     */
    private String propertiesName;

    /**
     * 属性的值
     */
    private String propertiesValue;

    private static final long serialVersionUID = 1L;

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getPropertiesName() {
        return propertiesName;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
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
        EntityKindPropertiesValue other = (EntityKindPropertiesValue) that;
        return (this.getEntityId() == null ? other.getEntityId() == null : this.getEntityId().equals(other.getEntityId()))
            && (this.getKindName() == null ? other.getKindName() == null : this.getKindName().equals(other.getKindName()))
            && (this.getPropertiesName() == null ? other.getPropertiesName() == null : this.getPropertiesName().equals(other.getPropertiesName()))
            && (this.getPropertiesValue() == null ? other.getPropertiesValue() == null : this.getPropertiesValue().equals(other.getPropertiesValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        result = prime * result + ((getKindName() == null) ? 0 : getKindName().hashCode());
        result = prime * result + ((getPropertiesName() == null) ? 0 : getPropertiesName().hashCode());
        result = prime * result + ((getPropertiesValue() == null) ? 0 : getPropertiesValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", entityId=").append(entityId);
        sb.append(", kindName=").append(kindName);
        sb.append(", propertiesName=").append(propertiesName);
        sb.append(", propertiesValue=").append(propertiesValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}