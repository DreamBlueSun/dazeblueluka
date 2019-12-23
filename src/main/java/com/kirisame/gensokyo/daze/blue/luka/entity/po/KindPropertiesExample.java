package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.util.ArrayList;
import java.util.List;

public class KindPropertiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public KindPropertiesExample() {
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

        public Criteria andKindIdIsNull() {
            addCriterion("kind_id is null");
            return (Criteria) this;
        }

        public Criteria andKindIdIsNotNull() {
            addCriterion("kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andKindIdEqualTo(String value) {
            addCriterion("kind_id =", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotEqualTo(String value) {
            addCriterion("kind_id <>", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThan(String value) {
            addCriterion("kind_id >", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("kind_id >=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThan(String value) {
            addCriterion("kind_id <", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLessThanOrEqualTo(String value) {
            addCriterion("kind_id <=", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdLike(String value) {
            addCriterion("kind_id like", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotLike(String value) {
            addCriterion("kind_id not like", value, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdIn(List<String> values) {
            addCriterion("kind_id in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotIn(List<String> values) {
            addCriterion("kind_id not in", values, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdBetween(String value1, String value2) {
            addCriterion("kind_id between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andKindIdNotBetween(String value1, String value2) {
            addCriterion("kind_id not between", value1, value2, "kindId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdIsNull() {
            addCriterion("properties_id is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdIsNotNull() {
            addCriterion("properties_id is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdEqualTo(String value) {
            addCriterion("properties_id =", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdNotEqualTo(String value) {
            addCriterion("properties_id <>", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdGreaterThan(String value) {
            addCriterion("properties_id >", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdGreaterThanOrEqualTo(String value) {
            addCriterion("properties_id >=", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdLessThan(String value) {
            addCriterion("properties_id <", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdLessThanOrEqualTo(String value) {
            addCriterion("properties_id <=", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdLike(String value) {
            addCriterion("properties_id like", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdNotLike(String value) {
            addCriterion("properties_id not like", value, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdIn(List<String> values) {
            addCriterion("properties_id in", values, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdNotIn(List<String> values) {
            addCriterion("properties_id not in", values, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdBetween(String value1, String value2) {
            addCriterion("properties_id between", value1, value2, "propertiesId");
            return (Criteria) this;
        }

        public Criteria andPropertiesIdNotBetween(String value1, String value2) {
            addCriterion("properties_id not between", value1, value2, "propertiesId");
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