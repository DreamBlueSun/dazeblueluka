package com.kirisame.gensokyo.daze.blue.luka.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SentenceParseBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SentenceParseBaseExample() {
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

        public Criteria andWordContentIsNull() {
            addCriterion("word_content is null");
            return (Criteria) this;
        }

        public Criteria andWordContentIsNotNull() {
            addCriterion("word_content is not null");
            return (Criteria) this;
        }

        public Criteria andWordContentEqualTo(String value) {
            addCriterion("word_content =", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotEqualTo(String value) {
            addCriterion("word_content <>", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentGreaterThan(String value) {
            addCriterion("word_content >", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentGreaterThanOrEqualTo(String value) {
            addCriterion("word_content >=", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentLessThan(String value) {
            addCriterion("word_content <", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentLessThanOrEqualTo(String value) {
            addCriterion("word_content <=", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentLike(String value) {
            addCriterion("word_content like", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotLike(String value) {
            addCriterion("word_content not like", value, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentIn(List<String> values) {
            addCriterion("word_content in", values, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotIn(List<String> values) {
            addCriterion("word_content not in", values, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentBetween(String value1, String value2) {
            addCriterion("word_content between", value1, value2, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordContentNotBetween(String value1, String value2) {
            addCriterion("word_content not between", value1, value2, "wordContent");
            return (Criteria) this;
        }

        public Criteria andWordParseIsNull() {
            addCriterion("word_parse is null");
            return (Criteria) this;
        }

        public Criteria andWordParseIsNotNull() {
            addCriterion("word_parse is not null");
            return (Criteria) this;
        }

        public Criteria andWordParseEqualTo(String value) {
            addCriterion("word_parse =", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseNotEqualTo(String value) {
            addCriterion("word_parse <>", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseGreaterThan(String value) {
            addCriterion("word_parse >", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseGreaterThanOrEqualTo(String value) {
            addCriterion("word_parse >=", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseLessThan(String value) {
            addCriterion("word_parse <", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseLessThanOrEqualTo(String value) {
            addCriterion("word_parse <=", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseLike(String value) {
            addCriterion("word_parse like", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseNotLike(String value) {
            addCriterion("word_parse not like", value, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseIn(List<String> values) {
            addCriterion("word_parse in", values, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseNotIn(List<String> values) {
            addCriterion("word_parse not in", values, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseBetween(String value1, String value2) {
            addCriterion("word_parse between", value1, value2, "wordParse");
            return (Criteria) this;
        }

        public Criteria andWordParseNotBetween(String value1, String value2) {
            addCriterion("word_parse not between", value1, value2, "wordParse");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNull() {
            addCriterion("enter_date is null");
            return (Criteria) this;
        }

        public Criteria andEnterDateIsNotNull() {
            addCriterion("enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnterDateEqualTo(Date value) {
            addCriterion("enter_date =", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotEqualTo(Date value) {
            addCriterion("enter_date <>", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThan(Date value) {
            addCriterion("enter_date >", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("enter_date >=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThan(Date value) {
            addCriterion("enter_date <", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateLessThanOrEqualTo(Date value) {
            addCriterion("enter_date <=", value, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateIn(List<Date> values) {
            addCriterion("enter_date in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotIn(List<Date> values) {
            addCriterion("enter_date not in", values, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateBetween(Date value1, Date value2) {
            addCriterion("enter_date between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andEnterDateNotBetween(Date value1, Date value2) {
            addCriterion("enter_date not between", value1, value2, "enterDate");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdIsNull() {
            addCriterion("word_type_id is null");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdIsNotNull() {
            addCriterion("word_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdEqualTo(String value) {
            addCriterion("word_type_id =", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdNotEqualTo(String value) {
            addCriterion("word_type_id <>", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdGreaterThan(String value) {
            addCriterion("word_type_id >", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("word_type_id >=", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdLessThan(String value) {
            addCriterion("word_type_id <", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdLessThanOrEqualTo(String value) {
            addCriterion("word_type_id <=", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdLike(String value) {
            addCriterion("word_type_id like", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdNotLike(String value) {
            addCriterion("word_type_id not like", value, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdIn(List<String> values) {
            addCriterion("word_type_id in", values, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdNotIn(List<String> values) {
            addCriterion("word_type_id not in", values, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdBetween(String value1, String value2) {
            addCriterion("word_type_id between", value1, value2, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordTypeIdNotBetween(String value1, String value2) {
            addCriterion("word_type_id not between", value1, value2, "wordTypeId");
            return (Criteria) this;
        }

        public Criteria andWordDescribeIsNull() {
            addCriterion("word_describe is null");
            return (Criteria) this;
        }

        public Criteria andWordDescribeIsNotNull() {
            addCriterion("word_describe is not null");
            return (Criteria) this;
        }

        public Criteria andWordDescribeEqualTo(String value) {
            addCriterion("word_describe =", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeNotEqualTo(String value) {
            addCriterion("word_describe <>", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeGreaterThan(String value) {
            addCriterion("word_describe >", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("word_describe >=", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeLessThan(String value) {
            addCriterion("word_describe <", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeLessThanOrEqualTo(String value) {
            addCriterion("word_describe <=", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeLike(String value) {
            addCriterion("word_describe like", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeNotLike(String value) {
            addCriterion("word_describe not like", value, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeIn(List<String> values) {
            addCriterion("word_describe in", values, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeNotIn(List<String> values) {
            addCriterion("word_describe not in", values, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeBetween(String value1, String value2) {
            addCriterion("word_describe between", value1, value2, "wordDescribe");
            return (Criteria) this;
        }

        public Criteria andWordDescribeNotBetween(String value1, String value2) {
            addCriterion("word_describe not between", value1, value2, "wordDescribe");
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