package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.util.ArrayList;
import java.util.List;

public class PropertiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PropertiesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameIsNull() {
            addCriterion("properties_name is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameIsNotNull() {
            addCriterion("properties_name is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameEqualTo(String value) {
            addCriterion("properties_name =", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameNotEqualTo(String value) {
            addCriterion("properties_name <>", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameGreaterThan(String value) {
            addCriterion("properties_name >", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("properties_name >=", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameLessThan(String value) {
            addCriterion("properties_name <", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameLessThanOrEqualTo(String value) {
            addCriterion("properties_name <=", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameLike(String value) {
            addCriterion("properties_name like", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameNotLike(String value) {
            addCriterion("properties_name not like", value, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameIn(List<String> values) {
            addCriterion("properties_name in", values, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameNotIn(List<String> values) {
            addCriterion("properties_name not in", values, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameBetween(String value1, String value2) {
            addCriterion("properties_name between", value1, value2, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesNameNotBetween(String value1, String value2) {
            addCriterion("properties_name not between", value1, value2, "propertiesName");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescIsNull() {
            addCriterion("properties_desc is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescIsNotNull() {
            addCriterion("properties_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescEqualTo(String value) {
            addCriterion("properties_desc =", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescNotEqualTo(String value) {
            addCriterion("properties_desc <>", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescGreaterThan(String value) {
            addCriterion("properties_desc >", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescGreaterThanOrEqualTo(String value) {
            addCriterion("properties_desc >=", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescLessThan(String value) {
            addCriterion("properties_desc <", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescLessThanOrEqualTo(String value) {
            addCriterion("properties_desc <=", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescLike(String value) {
            addCriterion("properties_desc like", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescNotLike(String value) {
            addCriterion("properties_desc not like", value, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescIn(List<String> values) {
            addCriterion("properties_desc in", values, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescNotIn(List<String> values) {
            addCriterion("properties_desc not in", values, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescBetween(String value1, String value2) {
            addCriterion("properties_desc between", value1, value2, "propertiesDesc");
            return (Criteria) this;
        }

        public Criteria andPropertiesDescNotBetween(String value1, String value2) {
            addCriterion("properties_desc not between", value1, value2, "propertiesDesc");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}