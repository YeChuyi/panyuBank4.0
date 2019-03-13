package com.bank.bean;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminuserIsNull() {
            addCriterion("adminUser is null");
            return (Criteria) this;
        }

        public Criteria andAdminuserIsNotNull() {
            addCriterion("adminUser is not null");
            return (Criteria) this;
        }

        public Criteria andAdminuserEqualTo(String value) {
            addCriterion("adminUser =", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotEqualTo(String value) {
            addCriterion("adminUser <>", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserGreaterThan(String value) {
            addCriterion("adminUser >", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserGreaterThanOrEqualTo(String value) {
            addCriterion("adminUser >=", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserLessThan(String value) {
            addCriterion("adminUser <", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserLessThanOrEqualTo(String value) {
            addCriterion("adminUser <=", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserLike(String value) {
            addCriterion("adminUser like", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotLike(String value) {
            addCriterion("adminUser not like", value, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserIn(List<String> values) {
            addCriterion("adminUser in", values, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotIn(List<String> values) {
            addCriterion("adminUser not in", values, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserBetween(String value1, String value2) {
            addCriterion("adminUser between", value1, value2, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminuserNotBetween(String value1, String value2) {
            addCriterion("adminUser not between", value1, value2, "adminuser");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("adminPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("adminPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("adminPassword =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("adminPassword <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("adminPassword >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adminPassword >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("adminPassword <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("adminPassword <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("adminPassword like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("adminPassword not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("adminPassword in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("adminPassword not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("adminPassword between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("adminPassword not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpositionIsNull() {
            addCriterion("adminPosition is null");
            return (Criteria) this;
        }

        public Criteria andAdminpositionIsNotNull() {
            addCriterion("adminPosition is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpositionEqualTo(String value) {
            addCriterion("adminPosition =", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionNotEqualTo(String value) {
            addCriterion("adminPosition <>", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionGreaterThan(String value) {
            addCriterion("adminPosition >", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionGreaterThanOrEqualTo(String value) {
            addCriterion("adminPosition >=", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionLessThan(String value) {
            addCriterion("adminPosition <", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionLessThanOrEqualTo(String value) {
            addCriterion("adminPosition <=", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionLike(String value) {
            addCriterion("adminPosition like", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionNotLike(String value) {
            addCriterion("adminPosition not like", value, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionIn(List<String> values) {
            addCriterion("adminPosition in", values, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionNotIn(List<String> values) {
            addCriterion("adminPosition not in", values, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionBetween(String value1, String value2) {
            addCriterion("adminPosition between", value1, value2, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminpositionNotBetween(String value1, String value2) {
            addCriterion("adminPosition not between", value1, value2, "adminposition");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("adminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumIsNull() {
            addCriterion("adminPhoneNum is null");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumIsNotNull() {
            addCriterion("adminPhoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumEqualTo(String value) {
            addCriterion("adminPhoneNum =", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumNotEqualTo(String value) {
            addCriterion("adminPhoneNum <>", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumGreaterThan(String value) {
            addCriterion("adminPhoneNum >", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumGreaterThanOrEqualTo(String value) {
            addCriterion("adminPhoneNum >=", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumLessThan(String value) {
            addCriterion("adminPhoneNum <", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumLessThanOrEqualTo(String value) {
            addCriterion("adminPhoneNum <=", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumLike(String value) {
            addCriterion("adminPhoneNum like", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumNotLike(String value) {
            addCriterion("adminPhoneNum not like", value, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumIn(List<String> values) {
            addCriterion("adminPhoneNum in", values, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumNotIn(List<String> values) {
            addCriterion("adminPhoneNum not in", values, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumBetween(String value1, String value2) {
            addCriterion("adminPhoneNum between", value1, value2, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andAdminphonenumNotBetween(String value1, String value2) {
            addCriterion("adminPhoneNum not between", value1, value2, "adminphonenum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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