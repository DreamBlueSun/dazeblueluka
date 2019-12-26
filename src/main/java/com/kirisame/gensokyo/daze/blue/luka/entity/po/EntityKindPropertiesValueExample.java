package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.util.ArrayList;
import java.util.List;

public class EntityKindPropertiesValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EntityKindPropertiesValueExample() {
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

        public Criteria andEntityIdIsNull() {
            addCriterion("entity_id is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(String value) {
            addCriterion("entity_id =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(String value) {
            addCriterion("entity_id <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(String value) {
            addCriterion("entity_id >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(String value) {
            addCriterion("entity_id >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(String value) {
            addCriterion("entity_id <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(String value) {
            addCriterion("entity_id <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLike(String value) {
            addCriterion("entity_id like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotLike(String value) {
            addCriterion("entity_id not like", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<String> values) {
            addCriterion("entity_id in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<String> values) {
            addCriterion("entity_id not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(String value1, String value2) {
            addCriterion("entity_id between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(String value1, String value2) {
            addCriterion("entity_id not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNull() {
            addCriterion("kind_name is null");
            return (Criteria) this;
        }

        public Criteria andKindNameIsNotNull() {
            addCriterion("kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andKindNameEqualTo(String value) {
            addCriterion("kind_name =", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotEqualTo(String value) {
            addCriterion("kind_name <>", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThan(String value) {
            addCriterion("kind_name >", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("kind_name >=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThan(String value) {
            addCriterion("kind_name <", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLessThanOrEqualTo(String value) {
            addCriterion("kind_name <=", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameLike(String value) {
            addCriterion("kind_name like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotLike(String value) {
            addCriterion("kind_name not like", value, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameIn(List<String> values) {
            addCriterion("kind_name in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotIn(List<String> values) {
            addCriterion("kind_name not in", values, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameBetween(String value1, String value2) {
            addCriterion("kind_name between", value1, value2, "kindName");
            return (Criteria) this;
        }

        public Criteria andKindNameNotBetween(String value1, String value2) {
            addCriterion("kind_name not between", value1, value2, "kindName");
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

        public Criteria andPropertiesValueIsNull() {
            addCriterion("properties_value is null");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueIsNotNull() {
            addCriterion("properties_value is not null");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueEqualTo(String value) {
            addCriterion("properties_value =", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueNotEqualTo(String value) {
            addCriterion("properties_value <>", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueGreaterThan(String value) {
            addCriterion("properties_value >", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueGreaterThanOrEqualTo(String value) {
            addCriterion("properties_value >=", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueLessThan(String value) {
            addCriterion("properties_value <", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueLessThanOrEqualTo(String value) {
            addCriterion("properties_value <=", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueLike(String value) {
            addCriterion("properties_value like", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueNotLike(String value) {
            addCriterion("properties_value not like", value, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueIn(List<String> values) {
            addCriterion("properties_value in", values, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueNotIn(List<String> values) {
            addCriterion("properties_value not in", values, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueBetween(String value1, String value2) {
            addCriterion("properties_value between", value1, value2, "propertiesValue");
            return (Criteria) this;
        }

        public Criteria andPropertiesValueNotBetween(String value1, String value2) {
            addCriterion("properties_value not between", value1, value2, "propertiesValue");
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