package com.bank.bean;

import java.util.ArrayList;
import java.util.List;

public class PageDescriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PageDescriptionExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPageaddressIsNull() {
            addCriterion("PageAddress is null");
            return (Criteria) this;
        }

        public Criteria andPageaddressIsNotNull() {
            addCriterion("PageAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPageaddressEqualTo(String value) {
            addCriterion("PageAddress =", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressNotEqualTo(String value) {
            addCriterion("PageAddress <>", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressGreaterThan(String value) {
            addCriterion("PageAddress >", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressGreaterThanOrEqualTo(String value) {
            addCriterion("PageAddress >=", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressLessThan(String value) {
            addCriterion("PageAddress <", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressLessThanOrEqualTo(String value) {
            addCriterion("PageAddress <=", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressLike(String value) {
            addCriterion("PageAddress like", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressNotLike(String value) {
            addCriterion("PageAddress not like", value, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressIn(List<String> values) {
            addCriterion("PageAddress in", values, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressNotIn(List<String> values) {
            addCriterion("PageAddress not in", values, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressBetween(String value1, String value2) {
            addCriterion("PageAddress between", value1, value2, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPageaddressNotBetween(String value1, String value2) {
            addCriterion("PageAddress not between", value1, value2, "pageaddress");
            return (Criteria) this;
        }

        public Criteria andPagedateIsNull() {
            addCriterion("PageDate is null");
            return (Criteria) this;
        }

        public Criteria andPagedateIsNotNull() {
            addCriterion("PageDate is not null");
            return (Criteria) this;
        }

        public Criteria andPagedateEqualTo(String value) {
            addCriterion("PageDate =", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateNotEqualTo(String value) {
            addCriterion("PageDate <>", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateGreaterThan(String value) {
            addCriterion("PageDate >", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateGreaterThanOrEqualTo(String value) {
            addCriterion("PageDate >=", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateLessThan(String value) {
            addCriterion("PageDate <", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateLessThanOrEqualTo(String value) {
            addCriterion("PageDate <=", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateLike(String value) {
            addCriterion("PageDate like", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateNotLike(String value) {
            addCriterion("PageDate not like", value, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateIn(List<String> values) {
            addCriterion("PageDate in", values, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateNotIn(List<String> values) {
            addCriterion("PageDate not in", values, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateBetween(String value1, String value2) {
            addCriterion("PageDate between", value1, value2, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagedateNotBetween(String value1, String value2) {
            addCriterion("PageDate not between", value1, value2, "pagedate");
            return (Criteria) this;
        }

        public Criteria andPagemessageIsNull() {
            addCriterion("PageMessage is null");
            return (Criteria) this;
        }

        public Criteria andPagemessageIsNotNull() {
            addCriterion("PageMessage is not null");
            return (Criteria) this;
        }

        public Criteria andPagemessageEqualTo(String value) {
            addCriterion("PageMessage =", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageNotEqualTo(String value) {
            addCriterion("PageMessage <>", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageGreaterThan(String value) {
            addCriterion("PageMessage >", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageGreaterThanOrEqualTo(String value) {
            addCriterion("PageMessage >=", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageLessThan(String value) {
            addCriterion("PageMessage <", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageLessThanOrEqualTo(String value) {
            addCriterion("PageMessage <=", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageLike(String value) {
            addCriterion("PageMessage like", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageNotLike(String value) {
            addCriterion("PageMessage not like", value, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageIn(List<String> values) {
            addCriterion("PageMessage in", values, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageNotIn(List<String> values) {
            addCriterion("PageMessage not in", values, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageBetween(String value1, String value2) {
            addCriterion("PageMessage between", value1, value2, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagemessageNotBetween(String value1, String value2) {
            addCriterion("PageMessage not between", value1, value2, "pagemessage");
            return (Criteria) this;
        }

        public Criteria andPagewaringIsNull() {
            addCriterion("PageWaring is null");
            return (Criteria) this;
        }

        public Criteria andPagewaringIsNotNull() {
            addCriterion("PageWaring is not null");
            return (Criteria) this;
        }

        public Criteria andPagewaringEqualTo(String value) {
            addCriterion("PageWaring =", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringNotEqualTo(String value) {
            addCriterion("PageWaring <>", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringGreaterThan(String value) {
            addCriterion("PageWaring >", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringGreaterThanOrEqualTo(String value) {
            addCriterion("PageWaring >=", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringLessThan(String value) {
            addCriterion("PageWaring <", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringLessThanOrEqualTo(String value) {
            addCriterion("PageWaring <=", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringLike(String value) {
            addCriterion("PageWaring like", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringNotLike(String value) {
            addCriterion("PageWaring not like", value, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringIn(List<String> values) {
            addCriterion("PageWaring in", values, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringNotIn(List<String> values) {
            addCriterion("PageWaring not in", values, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringBetween(String value1, String value2) {
            addCriterion("PageWaring between", value1, value2, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagewaringNotBetween(String value1, String value2) {
            addCriterion("PageWaring not between", value1, value2, "pagewaring");
            return (Criteria) this;
        }

        public Criteria andPagephonenumIsNull() {
            addCriterion("PagePhoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPagephonenumIsNotNull() {
            addCriterion("PagePhoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPagephonenumEqualTo(String value) {
            addCriterion("PagePhoneNum =", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumNotEqualTo(String value) {
            addCriterion("PagePhoneNum <>", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumGreaterThan(String value) {
            addCriterion("PagePhoneNum >", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumGreaterThanOrEqualTo(String value) {
            addCriterion("PagePhoneNum >=", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumLessThan(String value) {
            addCriterion("PagePhoneNum <", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumLessThanOrEqualTo(String value) {
            addCriterion("PagePhoneNum <=", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumLike(String value) {
            addCriterion("PagePhoneNum like", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumNotLike(String value) {
            addCriterion("PagePhoneNum not like", value, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumIn(List<String> values) {
            addCriterion("PagePhoneNum in", values, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumNotIn(List<String> values) {
            addCriterion("PagePhoneNum not in", values, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumBetween(String value1, String value2) {
            addCriterion("PagePhoneNum between", value1, value2, "pagephonenum");
            return (Criteria) this;
        }

        public Criteria andPagephonenumNotBetween(String value1, String value2) {
            addCriterion("PagePhoneNum not between", value1, value2, "pagephonenum");
            return (Criteria) this;
        }
    }

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