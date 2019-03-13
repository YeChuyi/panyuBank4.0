package com.bank.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PeLoOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PeLoOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPeloorbusinesstypeIsNull() {
            addCriterion("PeLoOrBusinessType is null");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeIsNotNull() {
            addCriterion("PeLoOrBusinessType is not null");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeEqualTo(String value) {
            addCriterion("PeLoOrBusinessType =", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeNotEqualTo(String value) {
            addCriterion("PeLoOrBusinessType <>", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeGreaterThan(String value) {
            addCriterion("PeLoOrBusinessType >", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrBusinessType >=", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeLessThan(String value) {
            addCriterion("PeLoOrBusinessType <", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrBusinessType <=", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeLike(String value) {
            addCriterion("PeLoOrBusinessType like", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeNotLike(String value) {
            addCriterion("PeLoOrBusinessType not like", value, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeIn(List<String> values) {
            addCriterion("PeLoOrBusinessType in", values, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeNotIn(List<String> values) {
            addCriterion("PeLoOrBusinessType not in", values, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeBetween(String value1, String value2) {
            addCriterion("PeLoOrBusinessType between", value1, value2, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloorbusinesstypeNotBetween(String value1, String value2) {
            addCriterion("PeLoOrBusinessType not between", value1, value2, "peloorbusinesstype");
            return (Criteria) this;
        }

        public Criteria andPeloordateIsNull() {
            addCriterion("PeLoOrDate is null");
            return (Criteria) this;
        }

        public Criteria andPeloordateIsNotNull() {
            addCriterion("PeLoOrDate is not null");
            return (Criteria) this;
        }

        public Criteria andPeloordateEqualTo(Date value) {
            addCriterionForJDBCDate("PeLoOrDate =", value, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PeLoOrDate <>", value, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateGreaterThan(Date value) {
            addCriterionForJDBCDate("PeLoOrDate >", value, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PeLoOrDate >=", value, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateLessThan(Date value) {
            addCriterionForJDBCDate("PeLoOrDate <", value, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PeLoOrDate <=", value, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateIn(List<Date> values) {
            addCriterionForJDBCDate("PeLoOrDate in", values, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PeLoOrDate not in", values, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PeLoOrDate between", value1, value2, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloordateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PeLoOrDate not between", value1, value2, "peloordate");
            return (Criteria) this;
        }

        public Criteria andPeloortimeIsNull() {
            addCriterion("PeLoOrTime is null");
            return (Criteria) this;
        }

        public Criteria andPeloortimeIsNotNull() {
            addCriterion("PeLoOrTime is not null");
            return (Criteria) this;
        }

        public Criteria andPeloortimeEqualTo(String value) {
            addCriterion("PeLoOrTime =", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeNotEqualTo(String value) {
            addCriterion("PeLoOrTime <>", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeGreaterThan(String value) {
            addCriterion("PeLoOrTime >", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrTime >=", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeLessThan(String value) {
            addCriterion("PeLoOrTime <", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrTime <=", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeLike(String value) {
            addCriterion("PeLoOrTime like", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeNotLike(String value) {
            addCriterion("PeLoOrTime not like", value, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeIn(List<String> values) {
            addCriterion("PeLoOrTime in", values, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeNotIn(List<String> values) {
            addCriterion("PeLoOrTime not in", values, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeBetween(String value1, String value2) {
            addCriterion("PeLoOrTime between", value1, value2, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloortimeNotBetween(String value1, String value2) {
            addCriterion("PeLoOrTime not between", value1, value2, "peloortime");
            return (Criteria) this;
        }

        public Criteria andPeloornameIsNull() {
            addCriterion("PeLoOrName is null");
            return (Criteria) this;
        }

        public Criteria andPeloornameIsNotNull() {
            addCriterion("PeLoOrName is not null");
            return (Criteria) this;
        }

        public Criteria andPeloornameEqualTo(String value) {
            addCriterion("PeLoOrName =", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameNotEqualTo(String value) {
            addCriterion("PeLoOrName <>", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameGreaterThan(String value) {
            addCriterion("PeLoOrName >", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrName >=", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameLessThan(String value) {
            addCriterion("PeLoOrName <", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrName <=", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameLike(String value) {
            addCriterion("PeLoOrName like", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameNotLike(String value) {
            addCriterion("PeLoOrName not like", value, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameIn(List<String> values) {
            addCriterion("PeLoOrName in", values, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameNotIn(List<String> values) {
            addCriterion("PeLoOrName not in", values, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameBetween(String value1, String value2) {
            addCriterion("PeLoOrName between", value1, value2, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloornameNotBetween(String value1, String value2) {
            addCriterion("PeLoOrName not between", value1, value2, "peloorname");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeIsNull() {
            addCriterion("PeLoOrDocumentType is null");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeIsNotNull() {
            addCriterion("PeLoOrDocumentType is not null");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeEqualTo(String value) {
            addCriterion("PeLoOrDocumentType =", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeNotEqualTo(String value) {
            addCriterion("PeLoOrDocumentType <>", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeGreaterThan(String value) {
            addCriterion("PeLoOrDocumentType >", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrDocumentType >=", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeLessThan(String value) {
            addCriterion("PeLoOrDocumentType <", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrDocumentType <=", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeLike(String value) {
            addCriterion("PeLoOrDocumentType like", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeNotLike(String value) {
            addCriterion("PeLoOrDocumentType not like", value, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeIn(List<String> values) {
            addCriterion("PeLoOrDocumentType in", values, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeNotIn(List<String> values) {
            addCriterion("PeLoOrDocumentType not in", values, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeBetween(String value1, String value2) {
            addCriterion("PeLoOrDocumentType between", value1, value2, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumenttypeNotBetween(String value1, String value2) {
            addCriterion("PeLoOrDocumentType not between", value1, value2, "peloordocumenttype");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumIsNull() {
            addCriterion("PeLoOrDocumentNum is null");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumIsNotNull() {
            addCriterion("PeLoOrDocumentNum is not null");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumEqualTo(String value) {
            addCriterion("PeLoOrDocumentNum =", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumNotEqualTo(String value) {
            addCriterion("PeLoOrDocumentNum <>", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumGreaterThan(String value) {
            addCriterion("PeLoOrDocumentNum >", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrDocumentNum >=", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumLessThan(String value) {
            addCriterion("PeLoOrDocumentNum <", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrDocumentNum <=", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumLike(String value) {
            addCriterion("PeLoOrDocumentNum like", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumNotLike(String value) {
            addCriterion("PeLoOrDocumentNum not like", value, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumIn(List<String> values) {
            addCriterion("PeLoOrDocumentNum in", values, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumNotIn(List<String> values) {
            addCriterion("PeLoOrDocumentNum not in", values, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumBetween(String value1, String value2) {
            addCriterion("PeLoOrDocumentNum between", value1, value2, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloordocumentnumNotBetween(String value1, String value2) {
            addCriterion("PeLoOrDocumentNum not between", value1, value2, "peloordocumentnum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumIsNull() {
            addCriterion("PeLoOrPhoneNum is null");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumIsNotNull() {
            addCriterion("PeLoOrPhoneNum is not null");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumEqualTo(String value) {
            addCriterion("PeLoOrPhoneNum =", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumNotEqualTo(String value) {
            addCriterion("PeLoOrPhoneNum <>", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumGreaterThan(String value) {
            addCriterion("PeLoOrPhoneNum >", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrPhoneNum >=", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumLessThan(String value) {
            addCriterion("PeLoOrPhoneNum <", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrPhoneNum <=", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumLike(String value) {
            addCriterion("PeLoOrPhoneNum like", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumNotLike(String value) {
            addCriterion("PeLoOrPhoneNum not like", value, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumIn(List<String> values) {
            addCriterion("PeLoOrPhoneNum in", values, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumNotIn(List<String> values) {
            addCriterion("PeLoOrPhoneNum not in", values, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumBetween(String value1, String value2) {
            addCriterion("PeLoOrPhoneNum between", value1, value2, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorphonenumNotBetween(String value1, String value2) {
            addCriterion("PeLoOrPhoneNum not between", value1, value2, "peloorphonenum");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsIsNull() {
            addCriterion("PeLoOrBookingOutlets is null");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsIsNotNull() {
            addCriterion("PeLoOrBookingOutlets is not null");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsEqualTo(String value) {
            addCriterion("PeLoOrBookingOutlets =", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsNotEqualTo(String value) {
            addCriterion("PeLoOrBookingOutlets <>", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsGreaterThan(String value) {
            addCriterion("PeLoOrBookingOutlets >", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrBookingOutlets >=", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsLessThan(String value) {
            addCriterion("PeLoOrBookingOutlets <", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrBookingOutlets <=", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsLike(String value) {
            addCriterion("PeLoOrBookingOutlets like", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsNotLike(String value) {
            addCriterion("PeLoOrBookingOutlets not like", value, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsIn(List<String> values) {
            addCriterion("PeLoOrBookingOutlets in", values, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsNotIn(List<String> values) {
            addCriterion("PeLoOrBookingOutlets not in", values, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsBetween(String value1, String value2) {
            addCriterion("PeLoOrBookingOutlets between", value1, value2, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorbookingoutletsNotBetween(String value1, String value2) {
            addCriterion("PeLoOrBookingOutlets not between", value1, value2, "peloorbookingoutlets");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateIsNull() {
            addCriterion("PeLoOrCreaterDate is null");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateIsNotNull() {
            addCriterion("PeLoOrCreaterDate is not null");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateEqualTo(String value) {
            addCriterion("PeLoOrCreaterDate =", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateNotEqualTo(String value) {
            addCriterion("PeLoOrCreaterDate <>", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateGreaterThan(String value) {
            addCriterion("PeLoOrCreaterDate >", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateGreaterThanOrEqualTo(String value) {
            addCriterion("PeLoOrCreaterDate >=", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateLessThan(String value) {
            addCriterion("PeLoOrCreaterDate <", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateLessThanOrEqualTo(String value) {
            addCriterion("PeLoOrCreaterDate <=", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateLike(String value) {
            addCriterion("PeLoOrCreaterDate like", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateNotLike(String value) {
            addCriterion("PeLoOrCreaterDate not like", value, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateIn(List<String> values) {
            addCriterion("PeLoOrCreaterDate in", values, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateNotIn(List<String> values) {
            addCriterion("PeLoOrCreaterDate not in", values, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateBetween(String value1, String value2) {
            addCriterion("PeLoOrCreaterDate between", value1, value2, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andPeloorcreaterdateNotBetween(String value1, String value2) {
            addCriterion("PeLoOrCreaterDate not between", value1, value2, "peloorcreaterdate");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
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