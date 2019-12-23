package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.io.Serializable;

/**
 * properties
 * @author 
 */
public class Properties implements Serializable {
    private String id;

    /**
     * 属性名称（可重复，两种种类可有相同属性：乌龟和狗都有年龄，但是年龄具体上限不一致）
     */
    private String propertiesName;

    /**
     * 属性详细说明
     */
    private String propertiesDesc;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPropertiesName() {
        return propertiesName;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
    }

    public String getPropertiesDesc() {
        return propertiesDesc;
    }

    public void setPropertiesDesc(String propertiesDesc) {
        this.propertiesDesc = propertiesDesc;
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
        Properties other = (Properties) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPropertiesName() == null ? other.getPropertiesName() == null : this.getPropertiesName().equals(other.getPropertiesName()))
            && (this.getPropertiesDesc() == null ? other.getPropertiesDesc() == null : this.getPropertiesDesc().equals(other.getPropertiesDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPropertiesName() == null) ? 0 : getPropertiesName().hashCode());
        result = prime * result + ((getPropertiesDesc() == null) ? 0 : getPropertiesDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", propertiesName=").append(propertiesName);
        sb.append(", propertiesDesc=").append(propertiesDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}