package com.bank.bean;

import java.util.ArrayList;
import java.util.List;

public class PeLoOrFrontWebWordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeLoOrFrontWebWordsExample() {
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

        public Criteria andPeloordealaddressIsNull() {
            addCriterion("PeLoOrDealAddress is null");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressIsNotNull() {
            addCriterion("PeLoOrDealAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressEqualTo(String value) {
            addCriterion("PeLoOrDealAddress =", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressNotEqualTo(String value) {
            addCriterion("PeLoOrDealAddress <>", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressGreaterThan(String value) {
            addCriterion("PeLoOrDealAddress >", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealAddress >=", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressLessThan(String value) {
            addCriterion("PeLoOrDealAddress <", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealAddress <=", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressLike(String value) {
            addCriterion("PeLoOrDealAddress like", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressNotLike(String value) {
            addCriterion("PeLoOrDealAddress not like", value, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressIn(List<String> values) {
            addCriterion("PeLoOrDealAddress in", values, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressNotIn(List<String> values) {
            addCriterion("PeLoOrDealAddress not in", values, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressBetween(String value1, String value2) {
            addCriterion("PeLoOrDealAddress between", value1, value2, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealaddressNotBetween(String value1, String value2) {
            addCriterion("PeLoOrDealAddress not between", value1, value2, "peloordealaddress");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateIsNull() {
            addCriterion("PeLoOrDealDate is null");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateIsNotNull() {
            addCriterion("PeLoOrDealDate is not null");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateEqualTo(String value) {
            addCriterion("PeLoOrDealDate =", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateNotEqualTo(String value) {
            addCriterion("PeLoOrDealDate <>", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateGreaterThan(String value) {
            addCriterion("PeLoOrDealDate >", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealDate >=", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateLessThan(String value) {
            addCriterion("PeLoOrDealDate <", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealDate <=", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateLike(String value) {
            addCriterion("PeLoOrDealDate like", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateNotLike(String value) {
            addCriterion("PeLoOrDealDate not like", value, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateIn(List<String> values) {
            addCriterion("PeLoOrDealDate in", values, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateNotIn(List<String> values) {
            addCriterion("PeLoOrDealDate not in", values, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateBetween(String value1, String value2) {
            addCriterion("PeLoOrDealDate between", value1, value2, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealdateNotBetween(String value1, String value2) {
            addCriterion("PeLoOrDealDate not between", value1, value2, "peloordealdate");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageIsNull() {
            addCriterion("PeLoOrDealMessage is null");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageIsNotNull() {
            addCriterion("PeLoOrDealMessage is not null");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageEqualTo(String value) {
            addCriterion("PeLoOrDealMessage =", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageNotEqualTo(String value) {
            addCriterion("PeLoOrDealMessage <>", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageGreaterThan(String value) {
            addCriterion("PeLoOrDealMessage >", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealMessage >=", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageLessThan(String value) {
            addCriterion("PeLoOrDealMessage <", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealMessage <=", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageLike(String value) {
            addCriterion("PeLoOrDealMessage like", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageNotLike(String value) {
            addCriterion("PeLoOrDealMessage not like", value, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageIn(List<String> values) {
            addCriterion("PeLoOrDealMessage in", values, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageNotIn(List<String> values) {
            addCriterion("PeLoOrDealMessage not in", values, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageBetween(String value1, String value2) {
            addCriterion("PeLoOrDealMessage between", value1, value2, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealmessageNotBetween(String value1, String value2) {
            addCriterion("PeLoOrDealMessage not between", value1, value2, "peloordealmessage");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumIsNull() {
            addCriterion("PeLoOrDealPhoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumIsNotNull() {
            addCriterion("PeLoOrDealPhoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumEqualTo(String value) {
            addCriterion("PeLoOrDealPhoneNum =", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumNotEqualTo(String value) {
            addCriterion("PeLoOrDealPhoneNum <>", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumGreaterThan(String value) {
            addCriterion("PeLoOrDealPhoneNum >", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealPhoneNum >=", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumLessThan(String value) {
            addCriterion("PeLoOrDealPhoneNum <", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrDealPhoneNum <=", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumLike(String value) {
            addCriterion("PeLoOrDealPhoneNum like", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumNotLike(String value) {
            addCriterion("PeLoOrDealPhoneNum not like", value, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumIn(List<String> values) {
            addCriterion("PeLoOrDealPhoneNum in", values, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumNotIn(List<String> values) {
            addCriterion("PeLoOrDealPhoneNum not in", values, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumBetween(String value1, String value2) {
            addCriterion("PeLoOrDealPhoneNum between", value1, value2, "peloordealphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloordealphonenumNotBetween(String value1, String value2) {
            addCriterion("PeLoOrDealPhoneNum not between", value1, value2, "peloordealphonenum");
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