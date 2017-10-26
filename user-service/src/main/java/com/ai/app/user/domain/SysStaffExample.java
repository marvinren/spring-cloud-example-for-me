package com.ai.app.user.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysStaffExample() {
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

        public Criteria andSTAFF_IDIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDEqualTo(Long value) {
            addCriterion("STAFF_ID =", value, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDNotEqualTo(Long value) {
            addCriterion("STAFF_ID <>", value, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDGreaterThan(Long value) {
            addCriterion("STAFF_ID >", value, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDGreaterThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID >=", value, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDLessThan(Long value) {
            addCriterion("STAFF_ID <", value, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDLessThanOrEqualTo(Long value) {
            addCriterion("STAFF_ID <=", value, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDIn(List<Long> values) {
            addCriterion("STAFF_ID in", values, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDNotIn(List<Long> values) {
            addCriterion("STAFF_ID not in", values, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID between", value1, value2, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andSTAFF_IDNotBetween(Long value1, Long value2) {
            addCriterion("STAFF_ID not between", value1, value2, "STAFF_ID");
            return (Criteria) this;
        }

        public Criteria andCODEIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCODEIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCODEEqualTo(String value) {
            addCriterion("CODE =", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotEqualTo(String value) {
            addCriterion("CODE <>", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThan(String value) {
            addCriterion("CODE >", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThan(String value) {
            addCriterion("CODE <", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELike(String value) {
            addCriterion("CODE like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotLike(String value) {
            addCriterion("CODE not like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEIn(List<String> values) {
            addCriterion("CODE in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotIn(List<String> values) {
            addCriterion("CODE not in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDIsNull() {
            addCriterion("RECENT_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDIsNotNull() {
            addCriterion("RECENT_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDEqualTo(String value) {
            addCriterion("RECENT_PASSWORD =", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDNotEqualTo(String value) {
            addCriterion("RECENT_PASSWORD <>", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDGreaterThan(String value) {
            addCriterion("RECENT_PASSWORD >", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("RECENT_PASSWORD >=", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDLessThan(String value) {
            addCriterion("RECENT_PASSWORD <", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDLessThanOrEqualTo(String value) {
            addCriterion("RECENT_PASSWORD <=", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDLike(String value) {
            addCriterion("RECENT_PASSWORD like", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDNotLike(String value) {
            addCriterion("RECENT_PASSWORD not like", value, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDIn(List<String> values) {
            addCriterion("RECENT_PASSWORD in", values, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDNotIn(List<String> values) {
            addCriterion("RECENT_PASSWORD not in", values, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDBetween(String value1, String value2) {
            addCriterion("RECENT_PASSWORD between", value1, value2, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_PASSWORDNotBetween(String value1, String value2) {
            addCriterion("RECENT_PASSWORD not between", value1, value2, "RECENT_PASSWORD");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMEIsNull() {
            addCriterion("RECENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMEIsNotNull() {
            addCriterion("RECENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMEEqualTo(Date value) {
            addCriterionForJDBCDate("RECENT_TIME =", value, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMENotEqualTo(Date value) {
            addCriterionForJDBCDate("RECENT_TIME <>", value, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMEGreaterThan(Date value) {
            addCriterionForJDBCDate("RECENT_TIME >", value, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECENT_TIME >=", value, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMELessThan(Date value) {
            addCriterionForJDBCDate("RECENT_TIME <", value, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMELessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RECENT_TIME <=", value, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMEIn(List<Date> values) {
            addCriterionForJDBCDate("RECENT_TIME in", values, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMENotIn(List<Date> values) {
            addCriterionForJDBCDate("RECENT_TIME not in", values, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMEBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECENT_TIME between", value1, value2, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andRECENT_TIMENotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RECENT_TIME not between", value1, value2, "RECENT_TIME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMEIsNull() {
            addCriterion("EMPLOYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMEIsNotNull() {
            addCriterion("EMPLOYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMEEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME =", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMENotEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <>", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMEGreaterThan(String value) {
            addCriterion("EMPLOYEE_NAME >", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME >=", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMELessThan(String value) {
            addCriterion("EMPLOYEE_NAME <", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMELessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <=", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMELike(String value) {
            addCriterion("EMPLOYEE_NAME like", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMENotLike(String value) {
            addCriterion("EMPLOYEE_NAME not like", value, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMEIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME in", values, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMENotIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME not in", values, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMEBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME between", value1, value2, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andEMPLOYEE_NAMENotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME not between", value1, value2, "EMPLOYEE_NAME");
            return (Criteria) this;
        }

        public Criteria andBILL_IDIsNull() {
            addCriterion("BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBILL_IDIsNotNull() {
            addCriterion("BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBILL_IDEqualTo(String value) {
            addCriterion("BILL_ID =", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDNotEqualTo(String value) {
            addCriterion("BILL_ID <>", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDGreaterThan(String value) {
            addCriterion("BILL_ID >", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_ID >=", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDLessThan(String value) {
            addCriterion("BILL_ID <", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDLessThanOrEqualTo(String value) {
            addCriterion("BILL_ID <=", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDLike(String value) {
            addCriterion("BILL_ID like", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDNotLike(String value) {
            addCriterion("BILL_ID not like", value, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDIn(List<String> values) {
            addCriterion("BILL_ID in", values, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDNotIn(List<String> values) {
            addCriterion("BILL_ID not in", values, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDBetween(String value1, String value2) {
            addCriterion("BILL_ID between", value1, value2, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andBILL_IDNotBetween(String value1, String value2) {
            addCriterion("BILL_ID not between", value1, value2, "BILL_ID");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andRELIGIONIsNull() {
            addCriterion("RELIGION is null");
            return (Criteria) this;
        }

        public Criteria andRELIGIONIsNotNull() {
            addCriterion("RELIGION is not null");
            return (Criteria) this;
        }

        public Criteria andRELIGIONEqualTo(String value) {
            addCriterion("RELIGION =", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONNotEqualTo(String value) {
            addCriterion("RELIGION <>", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONGreaterThan(String value) {
            addCriterion("RELIGION >", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONGreaterThanOrEqualTo(String value) {
            addCriterion("RELIGION >=", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONLessThan(String value) {
            addCriterion("RELIGION <", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONLessThanOrEqualTo(String value) {
            addCriterion("RELIGION <=", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONLike(String value) {
            addCriterion("RELIGION like", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONNotLike(String value) {
            addCriterion("RELIGION not like", value, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONIn(List<String> values) {
            addCriterion("RELIGION in", values, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONNotIn(List<String> values) {
            addCriterion("RELIGION not in", values, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONBetween(String value1, String value2) {
            addCriterion("RELIGION between", value1, value2, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andRELIGIONNotBetween(String value1, String value2) {
            addCriterion("RELIGION not between", value1, value2, "RELIGION");
            return (Criteria) this;
        }

        public Criteria andSTATEIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andSTATEIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSTATEEqualTo(Short value) {
            addCriterion("STATE =", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotEqualTo(Short value) {
            addCriterion("STATE <>", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThan(Short value) {
            addCriterion("STATE >", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEGreaterThanOrEqualTo(Short value) {
            addCriterion("STATE >=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThan(Short value) {
            addCriterion("STATE <", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATELessThanOrEqualTo(Short value) {
            addCriterion("STATE <=", value, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEIn(List<Short> values) {
            addCriterion("STATE in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotIn(List<Short> values) {
            addCriterion("STATE not in", values, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATEBetween(Short value1, Short value2) {
            addCriterion("STATE between", value1, value2, "STATE");
            return (Criteria) this;
        }

        public Criteria andSTATENotBetween(Short value1, Short value2) {
            addCriterion("STATE not between", value1, value2, "STATE");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGIsNull() {
            addCriterion("LOCK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGIsNotNull() {
            addCriterion("LOCK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGEqualTo(Short value) {
            addCriterion("LOCK_FLAG =", value, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGNotEqualTo(Short value) {
            addCriterion("LOCK_FLAG <>", value, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGGreaterThan(Short value) {
            addCriterion("LOCK_FLAG >", value, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGGreaterThanOrEqualTo(Short value) {
            addCriterion("LOCK_FLAG >=", value, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGLessThan(Short value) {
            addCriterion("LOCK_FLAG <", value, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGLessThanOrEqualTo(Short value) {
            addCriterion("LOCK_FLAG <=", value, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGIn(List<Short> values) {
            addCriterion("LOCK_FLAG in", values, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGNotIn(List<Short> values) {
            addCriterion("LOCK_FLAG not in", values, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGBetween(Short value1, Short value2) {
            addCriterion("LOCK_FLAG between", value1, value2, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andLOCK_FLAGNotBetween(Short value1, Short value2) {
            addCriterion("LOCK_FLAG not between", value1, value2, "LOCK_FLAG");
            return (Criteria) this;
        }

        public Criteria andNOTESIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNOTESIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNOTESEqualTo(String value) {
            addCriterion("NOTES =", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESGreaterThan(String value) {
            addCriterion("NOTES >", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESLessThan(String value) {
            addCriterion("NOTES <", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESLike(String value) {
            addCriterion("NOTES like", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESNotLike(String value) {
            addCriterion("NOTES not like", value, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESIn(List<String> values) {
            addCriterion("NOTES in", values, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "NOTES");
            return (Criteria) this;
        }

        public Criteria andNOTESNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "NOTES");
            return (Criteria) this;
        }

        public Criteria andEXT1IsNull() {
            addCriterion("EXT1 is null");
            return (Criteria) this;
        }

        public Criteria andEXT1IsNotNull() {
            addCriterion("EXT1 is not null");
            return (Criteria) this;
        }

        public Criteria andEXT1EqualTo(String value) {
            addCriterion("EXT1 =", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1NotEqualTo(String value) {
            addCriterion("EXT1 <>", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1GreaterThan(String value) {
            addCriterion("EXT1 >", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1GreaterThanOrEqualTo(String value) {
            addCriterion("EXT1 >=", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1LessThan(String value) {
            addCriterion("EXT1 <", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1LessThanOrEqualTo(String value) {
            addCriterion("EXT1 <=", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1Like(String value) {
            addCriterion("EXT1 like", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1NotLike(String value) {
            addCriterion("EXT1 not like", value, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1In(List<String> values) {
            addCriterion("EXT1 in", values, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1NotIn(List<String> values) {
            addCriterion("EXT1 not in", values, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1Between(String value1, String value2) {
            addCriterion("EXT1 between", value1, value2, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT1NotBetween(String value1, String value2) {
            addCriterion("EXT1 not between", value1, value2, "EXT1");
            return (Criteria) this;
        }

        public Criteria andEXT2IsNull() {
            addCriterion("EXT2 is null");
            return (Criteria) this;
        }

        public Criteria andEXT2IsNotNull() {
            addCriterion("EXT2 is not null");
            return (Criteria) this;
        }

        public Criteria andEXT2EqualTo(String value) {
            addCriterion("EXT2 =", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2NotEqualTo(String value) {
            addCriterion("EXT2 <>", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2GreaterThan(String value) {
            addCriterion("EXT2 >", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2GreaterThanOrEqualTo(String value) {
            addCriterion("EXT2 >=", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2LessThan(String value) {
            addCriterion("EXT2 <", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2LessThanOrEqualTo(String value) {
            addCriterion("EXT2 <=", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2Like(String value) {
            addCriterion("EXT2 like", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2NotLike(String value) {
            addCriterion("EXT2 not like", value, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2In(List<String> values) {
            addCriterion("EXT2 in", values, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2NotIn(List<String> values) {
            addCriterion("EXT2 not in", values, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2Between(String value1, String value2) {
            addCriterion("EXT2 between", value1, value2, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT2NotBetween(String value1, String value2) {
            addCriterion("EXT2 not between", value1, value2, "EXT2");
            return (Criteria) this;
        }

        public Criteria andEXT3IsNull() {
            addCriterion("EXT3 is null");
            return (Criteria) this;
        }

        public Criteria andEXT3IsNotNull() {
            addCriterion("EXT3 is not null");
            return (Criteria) this;
        }

        public Criteria andEXT3EqualTo(String value) {
            addCriterion("EXT3 =", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3NotEqualTo(String value) {
            addCriterion("EXT3 <>", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3GreaterThan(String value) {
            addCriterion("EXT3 >", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3GreaterThanOrEqualTo(String value) {
            addCriterion("EXT3 >=", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3LessThan(String value) {
            addCriterion("EXT3 <", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3LessThanOrEqualTo(String value) {
            addCriterion("EXT3 <=", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3Like(String value) {
            addCriterion("EXT3 like", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3NotLike(String value) {
            addCriterion("EXT3 not like", value, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3In(List<String> values) {
            addCriterion("EXT3 in", values, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3NotIn(List<String> values) {
            addCriterion("EXT3 not in", values, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3Between(String value1, String value2) {
            addCriterion("EXT3 between", value1, value2, "EXT3");
            return (Criteria) this;
        }

        public Criteria andEXT3NotBetween(String value1, String value2) {
            addCriterion("EXT3 not between", value1, value2, "EXT3");
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