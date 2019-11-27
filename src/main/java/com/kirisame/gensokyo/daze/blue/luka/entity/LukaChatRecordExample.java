package com.kirisame.gensokyo.daze.blue.luka.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LukaChatRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LukaChatRecordExample() {
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

        public Criteria andReceivedMessageIsNull() {
            addCriterion("received_message is null");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageIsNotNull() {
            addCriterion("received_message is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageEqualTo(String value) {
            addCriterion("received_message =", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageNotEqualTo(String value) {
            addCriterion("received_message <>", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageGreaterThan(String value) {
            addCriterion("received_message >", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageGreaterThanOrEqualTo(String value) {
            addCriterion("received_message >=", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageLessThan(String value) {
            addCriterion("received_message <", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageLessThanOrEqualTo(String value) {
            addCriterion("received_message <=", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageLike(String value) {
            addCriterion("received_message like", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageNotLike(String value) {
            addCriterion("received_message not like", value, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageIn(List<String> values) {
            addCriterion("received_message in", values, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageNotIn(List<String> values) {
            addCriterion("received_message not in", values, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageBetween(String value1, String value2) {
            addCriterion("received_message between", value1, value2, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedMessageNotBetween(String value1, String value2) {
            addCriterion("received_message not between", value1, value2, "receivedMessage");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIsNull() {
            addCriterion("received_time is null");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIsNotNull() {
            addCriterion("received_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeEqualTo(Date value) {
            addCriterion("received_time =", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotEqualTo(Date value) {
            addCriterion("received_time <>", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeGreaterThan(Date value) {
            addCriterion("received_time >", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("received_time >=", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeLessThan(Date value) {
            addCriterion("received_time <", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeLessThanOrEqualTo(Date value) {
            addCriterion("received_time <=", value, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeIn(List<Date> values) {
            addCriterion("received_time in", values, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotIn(List<Date> values) {
            addCriterion("received_time not in", values, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeBetween(Date value1, Date value2) {
            addCriterion("received_time between", value1, value2, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedTimeNotBetween(Date value1, Date value2) {
            addCriterion("received_time not between", value1, value2, "receivedTime");
            return (Criteria) this;
        }

        public Criteria andReceivedFromIsNull() {
            addCriterion("received_from is null");
            return (Criteria) this;
        }

        public Criteria andReceivedFromIsNotNull() {
            addCriterion("received_from is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedFromEqualTo(Integer value) {
            addCriterion("received_from =", value, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromNotEqualTo(Integer value) {
            addCriterion("received_from <>", value, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromGreaterThan(Integer value) {
            addCriterion("received_from >", value, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("received_from >=", value, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromLessThan(Integer value) {
            addCriterion("received_from <", value, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromLessThanOrEqualTo(Integer value) {
            addCriterion("received_from <=", value, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromIn(List<Integer> values) {
            addCriterion("received_from in", values, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromNotIn(List<Integer> values) {
            addCriterion("received_from not in", values, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromBetween(Integer value1, Integer value2) {
            addCriterion("received_from between", value1, value2, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andReceivedFromNotBetween(Integer value1, Integer value2) {
            addCriterion("received_from not between", value1, value2, "receivedFrom");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusIsNull() {
            addCriterion("replied_status is null");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusIsNotNull() {
            addCriterion("replied_status is not null");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusEqualTo(Integer value) {
            addCriterion("replied_status =", value, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusNotEqualTo(Integer value) {
            addCriterion("replied_status <>", value, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusGreaterThan(Integer value) {
            addCriterion("replied_status >", value, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("replied_status >=", value, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusLessThan(Integer value) {
            addCriterion("replied_status <", value, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusLessThanOrEqualTo(Integer value) {
            addCriterion("replied_status <=", value, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusIn(List<Integer> values) {
            addCriterion("replied_status in", values, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusNotIn(List<Integer> values) {
            addCriterion("replied_status not in", values, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusBetween(Integer value1, Integer value2) {
            addCriterion("replied_status between", value1, value2, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("replied_status not between", value1, value2, "repliedStatus");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageIsNull() {
            addCriterion("replied_message is null");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageIsNotNull() {
            addCriterion("replied_message is not null");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageEqualTo(String value) {
            addCriterion("replied_message =", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageNotEqualTo(String value) {
            addCriterion("replied_message <>", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageGreaterThan(String value) {
            addCriterion("replied_message >", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageGreaterThanOrEqualTo(String value) {
            addCriterion("replied_message >=", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageLessThan(String value) {
            addCriterion("replied_message <", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageLessThanOrEqualTo(String value) {
            addCriterion("replied_message <=", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageLike(String value) {
            addCriterion("replied_message like", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageNotLike(String value) {
            addCriterion("replied_message not like", value, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageIn(List<String> values) {
            addCriterion("replied_message in", values, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageNotIn(List<String> values) {
            addCriterion("replied_message not in", values, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageBetween(String value1, String value2) {
            addCriterion("replied_message between", value1, value2, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedMessageNotBetween(String value1, String value2) {
            addCriterion("replied_message not between", value1, value2, "repliedMessage");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeIsNull() {
            addCriterion("replied_time is null");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeIsNotNull() {
            addCriterion("replied_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeEqualTo(Date value) {
            addCriterion("replied_time =", value, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeNotEqualTo(Date value) {
            addCriterion("replied_time <>", value, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeGreaterThan(Date value) {
            addCriterion("replied_time >", value, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("replied_time >=", value, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeLessThan(Date value) {
            addCriterion("replied_time <", value, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeLessThanOrEqualTo(Date value) {
            addCriterion("replied_time <=", value, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeIn(List<Date> values) {
            addCriterion("replied_time in", values, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeNotIn(List<Date> values) {
            addCriterion("replied_time not in", values, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeBetween(Date value1, Date value2) {
            addCriterion("replied_time between", value1, value2, "repliedTime");
            return (Criteria) this;
        }

        public Criteria andRepliedTimeNotBetween(Date value1, Date value2) {
            addCriterion("replied_time not between", value1, value2, "repliedTime");
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