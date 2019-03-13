package com.bank.bean;

import java.util.ArrayList;
import java.util.List;

public class ServiceOutletsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceOutletsExample() {
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

        public Criteria andSeroutaddressIsNull() {
            addCriterion("SerOutAddress is null");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressIsNotNull() {
            addCriterion("SerOutAddress is not null");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressEqualTo(String value) {
            addCriterion("SerOutAddress =", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressNotEqualTo(String value) {
            addCriterion("SerOutAddress <>", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressGreaterThan(String value) {
            addCriterion("SerOutAddress >", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressGreaterThanOrEqualTo(String value) {
            addCriterion("SerOutAddress >=", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressLessThan(String value) {
            addCriterion("SerOutAddress <", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressLessThanOrEqualTo(String value) {
            addCriterion("SerOutAddress <=", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressLike(String value) {
            addCriterion("SerOutAddress like", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressNotLike(String value) {
            addCriterion("SerOutAddress not like", value, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressIn(List<String> values) {
            addCriterion("SerOutAddress in", values, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressNotIn(List<String> values) {
            addCriterion("SerOutAddress not in", values, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressBetween(String value1, String value2) {
            addCriterion("SerOutAddress between", value1, value2, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutaddressNotBetween(String value1, String value2) {
            addCriterion("SerOutAddress not between", value1, value2, "seroutaddress");
            return (Criteria) this;
        }

        public Criteria andSeroutnumIsNull() {
            addCriterion("SerOutNum is null");
            return (Criteria) this;
        }

        public Criteria andSeroutnumIsNotNull() {
            addCriterion("SerOutNum is not null");
            return (Criteria) this;
        }

        public Criteria andSeroutnumEqualTo(String value) {
            addCriterion("SerOutNum =", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumNotEqualTo(String value) {
            addCriterion("SerOutNum <>", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumGreaterThan(String value) {
            addCriterion("SerOutNum >", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumGreaterThanOrEqualTo(String value) {
            addCriterion("SerOutNum >=", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumLessThan(String value) {
            addCriterion("SerOutNum <", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumLessThanOrEqualTo(String value) {
            addCriterion("SerOutNum <=", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumLike(String value) {
            addCriterion("SerOutNum like", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumNotLike(String value) {
            addCriterion("SerOutNum not like", value, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumIn(List<String> values) {
            addCriterion("SerOutNum in", values, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumNotIn(List<String> values) {
            addCriterion("SerOutNum not in", values, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumBetween(String value1, String value2) {
            addCriterion("SerOutNum between", value1, value2, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutnumNotBetween(String value1, String value2) {
            addCriterion("SerOutNum not between", value1, value2, "seroutnum");
            return (Criteria) this;
        }

        public Criteria andSeroutdateIsNull() {
            addCriterion("SerOutDate is null");
            return (Criteria) this;
        }

        public Criteria andSeroutdateIsNotNull() {
            addCriterion("SerOutDate is not null");
            return (Criteria) this;
        }

        public Criteria andSeroutdateEqualTo(String value) {
            addCriterion("SerOutDate =", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateNotEqualTo(String value) {
            addCriterion("SerOutDate <>", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateGreaterThan(String value) {
            addCriterion("SerOutDate >", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateGreaterThanOrEqualTo(String value) {
            addCriterion("SerOutDate >=", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateLessThan(String value) {
            addCriterion("SerOutDate <", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateLessThanOrEqualTo(String value) {
            addCriterion("SerOutDate <=", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateLike(String value) {
            addCriterion("SerOutDate like", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateNotLike(String value) {
            addCriterion("SerOutDate not like", value, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateIn(List<String> values) {
            addCriterion("SerOutDate in", values, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateNotIn(List<String> values) {
            addCriterion("SerOutDate not in", values, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateBetween(String value1, String value2) {
            addCriterion("SerOutDate between", value1, value2, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutdateNotBetween(String value1, String value2) {
            addCriterion("SerOutDate not between", value1, value2, "seroutdate");
            return (Criteria) this;
        }

        public Criteria andSeroutnameIsNull() {
            addCriterion("SerOutName is null");
            return (Criteria) this;
        }

        public Criteria andSeroutnameIsNotNull() {
            addCriterion("SerOutName is not null");
            return (Criteria) this;
        }

        public Criteria andSeroutnameEqualTo(String value) {
            addCriterion("SerOutName =", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameNotEqualTo(String value) {
            addCriterion("SerOutName <>", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameGreaterThan(String value) {
            addCriterion("SerOutName >", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameGreaterThanOrEqualTo(String value) {
            addCriterion("SerOutName >=", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameLessThan(String value) {
            addCriterion("SerOutName <", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameLessThanOrEqualTo(String value) {
            addCriterion("SerOutName <=", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameLike(String value) {
            addCriterion("SerOutName like", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameNotLike(String value) {
            addCriterion("SerOutName not like", value, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameIn(List<String> values) {
            addCriterion("SerOutName in", values, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameNotIn(List<String> values) {
            addCriterion("SerOutName not in", values, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameBetween(String value1, String value2) {
            addCriterion("SerOutName between", value1, value2, "seroutname");
            return (Criteria) this;
        }

        public Criteria andSeroutnameNotBetween(String value1, String value2) {
            addCriterion("SerOutName not between", value1, value2, "seroutname");
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