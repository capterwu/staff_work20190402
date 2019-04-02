package com.speed.cat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RankShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RankShopExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Long value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Long value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Long value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Long value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Long value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Long> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Long> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Long value1, Long value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Long value1, Long value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(Long value) {
            addCriterion("MANAGER =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(Long value) {
            addCriterion("MANAGER <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(Long value) {
            addCriterion("MANAGER >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(Long value) {
            addCriterion("MANAGER >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(Long value) {
            addCriterion("MANAGER <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(Long value) {
            addCriterion("MANAGER <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<Long> values) {
            addCriterion("MANAGER in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<Long> values) {
            addCriterion("MANAGER not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(Long value1, Long value2) {
            addCriterion("MANAGER between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(Long value1, Long value2) {
            addCriterion("MANAGER not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andPlatIsNull() {
            addCriterion("PLAT is null");
            return (Criteria) this;
        }

        public Criteria andPlatIsNotNull() {
            addCriterion("PLAT is not null");
            return (Criteria) this;
        }

        public Criteria andPlatEqualTo(Long value) {
            addCriterion("PLAT =", value, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatNotEqualTo(Long value) {
            addCriterion("PLAT <>", value, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatGreaterThan(Long value) {
            addCriterion("PLAT >", value, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatGreaterThanOrEqualTo(Long value) {
            addCriterion("PLAT >=", value, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatLessThan(Long value) {
            addCriterion("PLAT <", value, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatLessThanOrEqualTo(Long value) {
            addCriterion("PLAT <=", value, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatIn(List<Long> values) {
            addCriterion("PLAT in", values, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatNotIn(List<Long> values) {
            addCriterion("PLAT not in", values, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatBetween(Long value1, Long value2) {
            addCriterion("PLAT between", value1, value2, "plat");
            return (Criteria) this;
        }

        public Criteria andPlatNotBetween(Long value1, Long value2) {
            addCriterion("PLAT not between", value1, value2, "plat");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentIsNull() {
            addCriterion("PROVINCE_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentIsNotNull() {
            addCriterion("PROVINCE_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentEqualTo(Long value) {
            addCriterion("PROVINCE_AGENT =", value, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentNotEqualTo(Long value) {
            addCriterion("PROVINCE_AGENT <>", value, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentGreaterThan(Long value) {
            addCriterion("PROVINCE_AGENT >", value, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentGreaterThanOrEqualTo(Long value) {
            addCriterion("PROVINCE_AGENT >=", value, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentLessThan(Long value) {
            addCriterion("PROVINCE_AGENT <", value, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentLessThanOrEqualTo(Long value) {
            addCriterion("PROVINCE_AGENT <=", value, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentIn(List<Long> values) {
            addCriterion("PROVINCE_AGENT in", values, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentNotIn(List<Long> values) {
            addCriterion("PROVINCE_AGENT not in", values, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentBetween(Long value1, Long value2) {
            addCriterion("PROVINCE_AGENT between", value1, value2, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andProvinceAgentNotBetween(Long value1, Long value2) {
            addCriterion("PROVINCE_AGENT not between", value1, value2, "provinceAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentIsNull() {
            addCriterion("CITY_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andCityAgentIsNotNull() {
            addCriterion("CITY_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andCityAgentEqualTo(Long value) {
            addCriterion("CITY_AGENT =", value, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentNotEqualTo(Long value) {
            addCriterion("CITY_AGENT <>", value, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentGreaterThan(Long value) {
            addCriterion("CITY_AGENT >", value, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentGreaterThanOrEqualTo(Long value) {
            addCriterion("CITY_AGENT >=", value, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentLessThan(Long value) {
            addCriterion("CITY_AGENT <", value, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentLessThanOrEqualTo(Long value) {
            addCriterion("CITY_AGENT <=", value, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentIn(List<Long> values) {
            addCriterion("CITY_AGENT in", values, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentNotIn(List<Long> values) {
            addCriterion("CITY_AGENT not in", values, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentBetween(Long value1, Long value2) {
            addCriterion("CITY_AGENT between", value1, value2, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andCityAgentNotBetween(Long value1, Long value2) {
            addCriterion("CITY_AGENT not between", value1, value2, "cityAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentIsNull() {
            addCriterion("AREA_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andAreaAgentIsNotNull() {
            addCriterion("AREA_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andAreaAgentEqualTo(Long value) {
            addCriterion("AREA_AGENT =", value, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentNotEqualTo(Long value) {
            addCriterion("AREA_AGENT <>", value, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentGreaterThan(Long value) {
            addCriterion("AREA_AGENT >", value, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentGreaterThanOrEqualTo(Long value) {
            addCriterion("AREA_AGENT >=", value, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentLessThan(Long value) {
            addCriterion("AREA_AGENT <", value, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentLessThanOrEqualTo(Long value) {
            addCriterion("AREA_AGENT <=", value, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentIn(List<Long> values) {
            addCriterion("AREA_AGENT in", values, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentNotIn(List<Long> values) {
            addCriterion("AREA_AGENT not in", values, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentBetween(Long value1, Long value2) {
            addCriterion("AREA_AGENT between", value1, value2, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andAreaAgentNotBetween(Long value1, Long value2) {
            addCriterion("AREA_AGENT not between", value1, value2, "areaAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentIsNull() {
            addCriterion("SALES_AGENT is null");
            return (Criteria) this;
        }

        public Criteria andSalesAgentIsNotNull() {
            addCriterion("SALES_AGENT is not null");
            return (Criteria) this;
        }

        public Criteria andSalesAgentEqualTo(Long value) {
            addCriterion("SALES_AGENT =", value, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentNotEqualTo(Long value) {
            addCriterion("SALES_AGENT <>", value, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentGreaterThan(Long value) {
            addCriterion("SALES_AGENT >", value, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentGreaterThanOrEqualTo(Long value) {
            addCriterion("SALES_AGENT >=", value, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentLessThan(Long value) {
            addCriterion("SALES_AGENT <", value, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentLessThanOrEqualTo(Long value) {
            addCriterion("SALES_AGENT <=", value, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentIn(List<Long> values) {
            addCriterion("SALES_AGENT in", values, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentNotIn(List<Long> values) {
            addCriterion("SALES_AGENT not in", values, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentBetween(Long value1, Long value2) {
            addCriterion("SALES_AGENT between", value1, value2, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andSalesAgentNotBetween(Long value1, Long value2) {
            addCriterion("SALES_AGENT not between", value1, value2, "salesAgent");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_NAME =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_NAME <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_NAME >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_NAME >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_NAME <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_NAME <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_NAME like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_NAME not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_NAME in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_NAME not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_NAME between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_NAME not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNull() {
            addCriterion("S_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andSPhoneIsNotNull() {
            addCriterion("S_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSPhoneEqualTo(String value) {
            addCriterion("S_PHONE =", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotEqualTo(String value) {
            addCriterion("S_PHONE <>", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThan(String value) {
            addCriterion("S_PHONE >", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("S_PHONE >=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThan(String value) {
            addCriterion("S_PHONE <", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLessThanOrEqualTo(String value) {
            addCriterion("S_PHONE <=", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneLike(String value) {
            addCriterion("S_PHONE like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotLike(String value) {
            addCriterion("S_PHONE not like", value, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneIn(List<String> values) {
            addCriterion("S_PHONE in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotIn(List<String> values) {
            addCriterion("S_PHONE not in", values, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneBetween(String value1, String value2) {
            addCriterion("S_PHONE between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSPhoneNotBetween(String value1, String value2) {
            addCriterion("S_PHONE not between", value1, value2, "sPhone");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNull() {
            addCriterion("S_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSAddressIsNotNull() {
            addCriterion("S_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSAddressEqualTo(String value) {
            addCriterion("S_ADDRESS =", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotEqualTo(String value) {
            addCriterion("S_ADDRESS <>", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThan(String value) {
            addCriterion("S_ADDRESS >", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressGreaterThanOrEqualTo(String value) {
            addCriterion("S_ADDRESS >=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThan(String value) {
            addCriterion("S_ADDRESS <", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLessThanOrEqualTo(String value) {
            addCriterion("S_ADDRESS <=", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressLike(String value) {
            addCriterion("S_ADDRESS like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotLike(String value) {
            addCriterion("S_ADDRESS not like", value, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressIn(List<String> values) {
            addCriterion("S_ADDRESS in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotIn(List<String> values) {
            addCriterion("S_ADDRESS not in", values, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressBetween(String value1, String value2) {
            addCriterion("S_ADDRESS between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSAddressNotBetween(String value1, String value2) {
            addCriterion("S_ADDRESS not between", value1, value2, "sAddress");
            return (Criteria) this;
        }

        public Criteria andSLogoIsNull() {
            addCriterion("S_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andSLogoIsNotNull() {
            addCriterion("S_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andSLogoEqualTo(String value) {
            addCriterion("S_LOGO =", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoNotEqualTo(String value) {
            addCriterion("S_LOGO <>", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoGreaterThan(String value) {
            addCriterion("S_LOGO >", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoGreaterThanOrEqualTo(String value) {
            addCriterion("S_LOGO >=", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoLessThan(String value) {
            addCriterion("S_LOGO <", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoLessThanOrEqualTo(String value) {
            addCriterion("S_LOGO <=", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoLike(String value) {
            addCriterion("S_LOGO like", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoNotLike(String value) {
            addCriterion("S_LOGO not like", value, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoIn(List<String> values) {
            addCriterion("S_LOGO in", values, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoNotIn(List<String> values) {
            addCriterion("S_LOGO not in", values, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoBetween(String value1, String value2) {
            addCriterion("S_LOGO between", value1, value2, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSLogoNotBetween(String value1, String value2) {
            addCriterion("S_LOGO not between", value1, value2, "sLogo");
            return (Criteria) this;
        }

        public Criteria andSCoordinateIsNull() {
            addCriterion("S_COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andSCoordinateIsNotNull() {
            addCriterion("S_COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andSCoordinateEqualTo(String value) {
            addCriterion("S_COORDINATE =", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateNotEqualTo(String value) {
            addCriterion("S_COORDINATE <>", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateGreaterThan(String value) {
            addCriterion("S_COORDINATE >", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("S_COORDINATE >=", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateLessThan(String value) {
            addCriterion("S_COORDINATE <", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateLessThanOrEqualTo(String value) {
            addCriterion("S_COORDINATE <=", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateLike(String value) {
            addCriterion("S_COORDINATE like", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateNotLike(String value) {
            addCriterion("S_COORDINATE not like", value, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateIn(List<String> values) {
            addCriterion("S_COORDINATE in", values, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateNotIn(List<String> values) {
            addCriterion("S_COORDINATE not in", values, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateBetween(String value1, String value2) {
            addCriterion("S_COORDINATE between", value1, value2, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andSCoordinateNotBetween(String value1, String value2) {
            addCriterion("S_COORDINATE not between", value1, value2, "sCoordinate");
            return (Criteria) this;
        }

        public Criteria andShopRequireIsNull() {
            addCriterion("SHOP_REQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andShopRequireIsNotNull() {
            addCriterion("SHOP_REQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andShopRequireEqualTo(String value) {
            addCriterion("SHOP_REQUIRE =", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireNotEqualTo(String value) {
            addCriterion("SHOP_REQUIRE <>", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireGreaterThan(String value) {
            addCriterion("SHOP_REQUIRE >", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_REQUIRE >=", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireLessThan(String value) {
            addCriterion("SHOP_REQUIRE <", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireLessThanOrEqualTo(String value) {
            addCriterion("SHOP_REQUIRE <=", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireLike(String value) {
            addCriterion("SHOP_REQUIRE like", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireNotLike(String value) {
            addCriterion("SHOP_REQUIRE not like", value, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireIn(List<String> values) {
            addCriterion("SHOP_REQUIRE in", values, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireNotIn(List<String> values) {
            addCriterion("SHOP_REQUIRE not in", values, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireBetween(String value1, String value2) {
            addCriterion("SHOP_REQUIRE between", value1, value2, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopRequireNotBetween(String value1, String value2) {
            addCriterion("SHOP_REQUIRE not between", value1, value2, "shopRequire");
            return (Criteria) this;
        }

        public Criteria andShopProfitIsNull() {
            addCriterion("SHOP_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andShopProfitIsNotNull() {
            addCriterion("SHOP_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andShopProfitEqualTo(String value) {
            addCriterion("SHOP_PROFIT =", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitNotEqualTo(String value) {
            addCriterion("SHOP_PROFIT <>", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitGreaterThan(String value) {
            addCriterion("SHOP_PROFIT >", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_PROFIT >=", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitLessThan(String value) {
            addCriterion("SHOP_PROFIT <", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitLessThanOrEqualTo(String value) {
            addCriterion("SHOP_PROFIT <=", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitLike(String value) {
            addCriterion("SHOP_PROFIT like", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitNotLike(String value) {
            addCriterion("SHOP_PROFIT not like", value, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitIn(List<String> values) {
            addCriterion("SHOP_PROFIT in", values, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitNotIn(List<String> values) {
            addCriterion("SHOP_PROFIT not in", values, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitBetween(String value1, String value2) {
            addCriterion("SHOP_PROFIT between", value1, value2, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andShopProfitNotBetween(String value1, String value2) {
            addCriterion("SHOP_PROFIT not between", value1, value2, "shopProfit");
            return (Criteria) this;
        }

        public Criteria andSettleAskIsNull() {
            addCriterion("SETTLE_ASK is null");
            return (Criteria) this;
        }

        public Criteria andSettleAskIsNotNull() {
            addCriterion("SETTLE_ASK is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAskEqualTo(String value) {
            addCriterion("SETTLE_ASK =", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskNotEqualTo(String value) {
            addCriterion("SETTLE_ASK <>", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskGreaterThan(String value) {
            addCriterion("SETTLE_ASK >", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_ASK >=", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskLessThan(String value) {
            addCriterion("SETTLE_ASK <", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_ASK <=", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskLike(String value) {
            addCriterion("SETTLE_ASK like", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskNotLike(String value) {
            addCriterion("SETTLE_ASK not like", value, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskIn(List<String> values) {
            addCriterion("SETTLE_ASK in", values, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskNotIn(List<String> values) {
            addCriterion("SETTLE_ASK not in", values, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskBetween(String value1, String value2) {
            addCriterion("SETTLE_ASK between", value1, value2, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andSettleAskNotBetween(String value1, String value2) {
            addCriterion("SETTLE_ASK not between", value1, value2, "settleAsk");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeIsNull() {
            addCriterion("FREE_USETIME is null");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeIsNotNull() {
            addCriterion("FREE_USETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeEqualTo(Integer value) {
            addCriterion("FREE_USETIME =", value, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeNotEqualTo(Integer value) {
            addCriterion("FREE_USETIME <>", value, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeGreaterThan(Integer value) {
            addCriterion("FREE_USETIME >", value, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FREE_USETIME >=", value, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeLessThan(Integer value) {
            addCriterion("FREE_USETIME <", value, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeLessThanOrEqualTo(Integer value) {
            addCriterion("FREE_USETIME <=", value, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeIn(List<Integer> values) {
            addCriterion("FREE_USETIME in", values, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeNotIn(List<Integer> values) {
            addCriterion("FREE_USETIME not in", values, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeBetween(Integer value1, Integer value2) {
            addCriterion("FREE_USETIME between", value1, value2, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andFreeUsetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("FREE_USETIME not between", value1, value2, "freeUsetime");
            return (Criteria) this;
        }

        public Criteria andRentCostIsNull() {
            addCriterion("RENT_COST is null");
            return (Criteria) this;
        }

        public Criteria andRentCostIsNotNull() {
            addCriterion("RENT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRentCostEqualTo(Double value) {
            addCriterion("RENT_COST =", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostNotEqualTo(Double value) {
            addCriterion("RENT_COST <>", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostGreaterThan(Double value) {
            addCriterion("RENT_COST >", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostGreaterThanOrEqualTo(Double value) {
            addCriterion("RENT_COST >=", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostLessThan(Double value) {
            addCriterion("RENT_COST <", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostLessThanOrEqualTo(Double value) {
            addCriterion("RENT_COST <=", value, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostIn(List<Double> values) {
            addCriterion("RENT_COST in", values, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostNotIn(List<Double> values) {
            addCriterion("RENT_COST not in", values, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostBetween(Double value1, Double value2) {
            addCriterion("RENT_COST between", value1, value2, "rentCost");
            return (Criteria) this;
        }

        public Criteria andRentCostNotBetween(Double value1, Double value2) {
            addCriterion("RENT_COST not between", value1, value2, "rentCost");
            return (Criteria) this;
        }

        public Criteria andHighCostIsNull() {
            addCriterion("HIGH_COST is null");
            return (Criteria) this;
        }

        public Criteria andHighCostIsNotNull() {
            addCriterion("HIGH_COST is not null");
            return (Criteria) this;
        }

        public Criteria andHighCostEqualTo(Double value) {
            addCriterion("HIGH_COST =", value, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostNotEqualTo(Double value) {
            addCriterion("HIGH_COST <>", value, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostGreaterThan(Double value) {
            addCriterion("HIGH_COST >", value, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostGreaterThanOrEqualTo(Double value) {
            addCriterion("HIGH_COST >=", value, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostLessThan(Double value) {
            addCriterion("HIGH_COST <", value, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostLessThanOrEqualTo(Double value) {
            addCriterion("HIGH_COST <=", value, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostIn(List<Double> values) {
            addCriterion("HIGH_COST in", values, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostNotIn(List<Double> values) {
            addCriterion("HIGH_COST not in", values, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostBetween(Double value1, Double value2) {
            addCriterion("HIGH_COST between", value1, value2, "highCost");
            return (Criteria) this;
        }

        public Criteria andHighCostNotBetween(Double value1, Double value2) {
            addCriterion("HIGH_COST not between", value1, value2, "highCost");
            return (Criteria) this;
        }

        public Criteria andPlatExtractIsNull() {
            addCriterion("PLAT_EXTRACT is null");
            return (Criteria) this;
        }

        public Criteria andPlatExtractIsNotNull() {
            addCriterion("PLAT_EXTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andPlatExtractEqualTo(Integer value) {
            addCriterion("PLAT_EXTRACT =", value, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractNotEqualTo(Integer value) {
            addCriterion("PLAT_EXTRACT <>", value, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractGreaterThan(Integer value) {
            addCriterion("PLAT_EXTRACT >", value, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAT_EXTRACT >=", value, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractLessThan(Integer value) {
            addCriterion("PLAT_EXTRACT <", value, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractLessThanOrEqualTo(Integer value) {
            addCriterion("PLAT_EXTRACT <=", value, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractIn(List<Integer> values) {
            addCriterion("PLAT_EXTRACT in", values, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractNotIn(List<Integer> values) {
            addCriterion("PLAT_EXTRACT not in", values, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractBetween(Integer value1, Integer value2) {
            addCriterion("PLAT_EXTRACT between", value1, value2, "platExtract");
            return (Criteria) this;
        }

        public Criteria andPlatExtractNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAT_EXTRACT not between", value1, value2, "platExtract");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactIsNull() {
            addCriterion("PROVINCE_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactIsNotNull() {
            addCriterion("PROVINCE_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactEqualTo(Integer value) {
            addCriterion("PROVINCE_EXTACT =", value, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactNotEqualTo(Integer value) {
            addCriterion("PROVINCE_EXTACT <>", value, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactGreaterThan(Integer value) {
            addCriterion("PROVINCE_EXTACT >", value, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_EXTACT >=", value, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactLessThan(Integer value) {
            addCriterion("PROVINCE_EXTACT <", value, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactLessThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_EXTACT <=", value, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactIn(List<Integer> values) {
            addCriterion("PROVINCE_EXTACT in", values, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactNotIn(List<Integer> values) {
            addCriterion("PROVINCE_EXTACT not in", values, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE_EXTACT between", value1, value2, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andProvinceExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE_EXTACT not between", value1, value2, "provinceExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactIsNull() {
            addCriterion("CITY_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andCityExtactIsNotNull() {
            addCriterion("CITY_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andCityExtactEqualTo(Integer value) {
            addCriterion("CITY_EXTACT =", value, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactNotEqualTo(Integer value) {
            addCriterion("CITY_EXTACT <>", value, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactGreaterThan(Integer value) {
            addCriterion("CITY_EXTACT >", value, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("CITY_EXTACT >=", value, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactLessThan(Integer value) {
            addCriterion("CITY_EXTACT <", value, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactLessThanOrEqualTo(Integer value) {
            addCriterion("CITY_EXTACT <=", value, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactIn(List<Integer> values) {
            addCriterion("CITY_EXTACT in", values, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactNotIn(List<Integer> values) {
            addCriterion("CITY_EXTACT not in", values, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactBetween(Integer value1, Integer value2) {
            addCriterion("CITY_EXTACT between", value1, value2, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andCityExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("CITY_EXTACT not between", value1, value2, "cityExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactIsNull() {
            addCriterion("AREA_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andAreaExtactIsNotNull() {
            addCriterion("AREA_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andAreaExtactEqualTo(Integer value) {
            addCriterion("AREA_EXTACT =", value, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactNotEqualTo(Integer value) {
            addCriterion("AREA_EXTACT <>", value, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactGreaterThan(Integer value) {
            addCriterion("AREA_EXTACT >", value, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("AREA_EXTACT >=", value, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactLessThan(Integer value) {
            addCriterion("AREA_EXTACT <", value, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactLessThanOrEqualTo(Integer value) {
            addCriterion("AREA_EXTACT <=", value, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactIn(List<Integer> values) {
            addCriterion("AREA_EXTACT in", values, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactNotIn(List<Integer> values) {
            addCriterion("AREA_EXTACT not in", values, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactBetween(Integer value1, Integer value2) {
            addCriterion("AREA_EXTACT between", value1, value2, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andAreaExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("AREA_EXTACT not between", value1, value2, "areaExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactIsNull() {
            addCriterion("SALES_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andSalesExtactIsNotNull() {
            addCriterion("SALES_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andSalesExtactEqualTo(Integer value) {
            addCriterion("SALES_EXTACT =", value, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactNotEqualTo(Integer value) {
            addCriterion("SALES_EXTACT <>", value, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactGreaterThan(Integer value) {
            addCriterion("SALES_EXTACT >", value, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALES_EXTACT >=", value, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactLessThan(Integer value) {
            addCriterion("SALES_EXTACT <", value, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactLessThanOrEqualTo(Integer value) {
            addCriterion("SALES_EXTACT <=", value, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactIn(List<Integer> values) {
            addCriterion("SALES_EXTACT in", values, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactNotIn(List<Integer> values) {
            addCriterion("SALES_EXTACT not in", values, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactBetween(Integer value1, Integer value2) {
            addCriterion("SALES_EXTACT between", value1, value2, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andSalesExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("SALES_EXTACT not between", value1, value2, "salesExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactIsNull() {
            addCriterion("SHOP_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andShopExtactIsNotNull() {
            addCriterion("SHOP_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andShopExtactEqualTo(Integer value) {
            addCriterion("SHOP_EXTACT =", value, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactNotEqualTo(Integer value) {
            addCriterion("SHOP_EXTACT <>", value, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactGreaterThan(Integer value) {
            addCriterion("SHOP_EXTACT >", value, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOP_EXTACT >=", value, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactLessThan(Integer value) {
            addCriterion("SHOP_EXTACT <", value, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactLessThanOrEqualTo(Integer value) {
            addCriterion("SHOP_EXTACT <=", value, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactIn(List<Integer> values) {
            addCriterion("SHOP_EXTACT in", values, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactNotIn(List<Integer> values) {
            addCriterion("SHOP_EXTACT not in", values, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_EXTACT between", value1, value2, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOP_EXTACT not between", value1, value2, "shopExtact");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyIsNull() {
            addCriterion("SHOP_PROFIT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyIsNotNull() {
            addCriterion("SHOP_PROFIT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyEqualTo(Double value) {
            addCriterion("SHOP_PROFIT_MONEY =", value, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyNotEqualTo(Double value) {
            addCriterion("SHOP_PROFIT_MONEY <>", value, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyGreaterThan(Double value) {
            addCriterion("SHOP_PROFIT_MONEY >", value, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("SHOP_PROFIT_MONEY >=", value, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyLessThan(Double value) {
            addCriterion("SHOP_PROFIT_MONEY <", value, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyLessThanOrEqualTo(Double value) {
            addCriterion("SHOP_PROFIT_MONEY <=", value, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyIn(List<Double> values) {
            addCriterion("SHOP_PROFIT_MONEY in", values, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyNotIn(List<Double> values) {
            addCriterion("SHOP_PROFIT_MONEY not in", values, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyBetween(Double value1, Double value2) {
            addCriterion("SHOP_PROFIT_MONEY between", value1, value2, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andShopProfitMoneyNotBetween(Double value1, Double value2) {
            addCriterion("SHOP_PROFIT_MONEY not between", value1, value2, "shopProfitMoney");
            return (Criteria) this;
        }

        public Criteria andIsblockIsNull() {
            addCriterion("ISBLOCK is null");
            return (Criteria) this;
        }

        public Criteria andIsblockIsNotNull() {
            addCriterion("ISBLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andIsblockEqualTo(Integer value) {
            addCriterion("ISBLOCK =", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockNotEqualTo(Integer value) {
            addCriterion("ISBLOCK <>", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockGreaterThan(Integer value) {
            addCriterion("ISBLOCK >", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISBLOCK >=", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockLessThan(Integer value) {
            addCriterion("ISBLOCK <", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockLessThanOrEqualTo(Integer value) {
            addCriterion("ISBLOCK <=", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockIn(List<Integer> values) {
            addCriterion("ISBLOCK in", values, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockNotIn(List<Integer> values) {
            addCriterion("ISBLOCK not in", values, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockBetween(Integer value1, Integer value2) {
            addCriterion("ISBLOCK between", value1, value2, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockNotBetween(Integer value1, Integer value2) {
            addCriterion("ISBLOCK not between", value1, value2, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsquickIsNull() {
            addCriterion("ISQUICK is null");
            return (Criteria) this;
        }

        public Criteria andIsquickIsNotNull() {
            addCriterion("ISQUICK is not null");
            return (Criteria) this;
        }

        public Criteria andIsquickEqualTo(Integer value) {
            addCriterion("ISQUICK =", value, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickNotEqualTo(Integer value) {
            addCriterion("ISQUICK <>", value, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickGreaterThan(Integer value) {
            addCriterion("ISQUICK >", value, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISQUICK >=", value, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickLessThan(Integer value) {
            addCriterion("ISQUICK <", value, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickLessThanOrEqualTo(Integer value) {
            addCriterion("ISQUICK <=", value, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickIn(List<Integer> values) {
            addCriterion("ISQUICK in", values, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickNotIn(List<Integer> values) {
            addCriterion("ISQUICK not in", values, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickBetween(Integer value1, Integer value2) {
            addCriterion("ISQUICK between", value1, value2, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsquickNotBetween(Integer value1, Integer value2) {
            addCriterion("ISQUICK not between", value1, value2, "isquick");
            return (Criteria) this;
        }

        public Criteria andIsonecodeIsNull() {
            addCriterion("ISONECODE is null");
            return (Criteria) this;
        }

        public Criteria andIsonecodeIsNotNull() {
            addCriterion("ISONECODE is not null");
            return (Criteria) this;
        }

        public Criteria andIsonecodeEqualTo(String value) {
            addCriterion("ISONECODE =", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeNotEqualTo(String value) {
            addCriterion("ISONECODE <>", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeGreaterThan(String value) {
            addCriterion("ISONECODE >", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ISONECODE >=", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeLessThan(String value) {
            addCriterion("ISONECODE <", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeLessThanOrEqualTo(String value) {
            addCriterion("ISONECODE <=", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeLike(String value) {
            addCriterion("ISONECODE like", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeNotLike(String value) {
            addCriterion("ISONECODE not like", value, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeIn(List<String> values) {
            addCriterion("ISONECODE in", values, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeNotIn(List<String> values) {
            addCriterion("ISONECODE not in", values, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeBetween(String value1, String value2) {
            addCriterion("ISONECODE between", value1, value2, "isonecode");
            return (Criteria) this;
        }

        public Criteria andIsonecodeNotBetween(String value1, String value2) {
            addCriterion("ISONECODE not between", value1, value2, "isonecode");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNull() {
            addCriterion("REGISTTIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIsNotNull() {
            addCriterion("REGISTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisttimeEqualTo(Date value) {
            addCriterion("REGISTTIME =", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotEqualTo(Date value) {
            addCriterion("REGISTTIME <>", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThan(Date value) {
            addCriterion("REGISTTIME >", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REGISTTIME >=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThan(Date value) {
            addCriterion("REGISTTIME <", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeLessThanOrEqualTo(Date value) {
            addCriterion("REGISTTIME <=", value, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeIn(List<Date> values) {
            addCriterion("REGISTTIME in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotIn(List<Date> values) {
            addCriterion("REGISTTIME not in", values, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeBetween(Date value1, Date value2) {
            addCriterion("REGISTTIME between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andRegisttimeNotBetween(Date value1, Date value2) {
            addCriterion("REGISTTIME not between", value1, value2, "registtime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Long value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Long value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Long value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Long value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Long value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Long value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Long> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Long> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Long value1, Long value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Long value1, Long value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andLoIsNull() {
            addCriterion("LO is null");
            return (Criteria) this;
        }

        public Criteria andLoIsNotNull() {
            addCriterion("LO is not null");
            return (Criteria) this;
        }

        public Criteria andLoEqualTo(Double value) {
            addCriterion("LO =", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotEqualTo(Double value) {
            addCriterion("LO <>", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoGreaterThan(Double value) {
            addCriterion("LO >", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoGreaterThanOrEqualTo(Double value) {
            addCriterion("LO >=", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLessThan(Double value) {
            addCriterion("LO <", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLessThanOrEqualTo(Double value) {
            addCriterion("LO <=", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoIn(List<Double> values) {
            addCriterion("LO in", values, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotIn(List<Double> values) {
            addCriterion("LO not in", values, "lo");
            return (Criteria) this;
        }

        public Criteria andLoBetween(Double value1, Double value2) {
            addCriterion("LO between", value1, value2, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotBetween(Double value1, Double value2) {
            addCriterion("LO not between", value1, value2, "lo");
            return (Criteria) this;
        }

        public Criteria andLaIsNull() {
            addCriterion("LA is null");
            return (Criteria) this;
        }

        public Criteria andLaIsNotNull() {
            addCriterion("LA is not null");
            return (Criteria) this;
        }

        public Criteria andLaEqualTo(Double value) {
            addCriterion("LA =", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaNotEqualTo(Double value) {
            addCriterion("LA <>", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaGreaterThan(Double value) {
            addCriterion("LA >", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaGreaterThanOrEqualTo(Double value) {
            addCriterion("LA >=", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaLessThan(Double value) {
            addCriterion("LA <", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaLessThanOrEqualTo(Double value) {
            addCriterion("LA <=", value, "la");
            return (Criteria) this;
        }

        public Criteria andLaIn(List<Double> values) {
            addCriterion("LA in", values, "la");
            return (Criteria) this;
        }

        public Criteria andLaNotIn(List<Double> values) {
            addCriterion("LA not in", values, "la");
            return (Criteria) this;
        }

        public Criteria andLaBetween(Double value1, Double value2) {
            addCriterion("LA between", value1, value2, "la");
            return (Criteria) this;
        }

        public Criteria andLaNotBetween(Double value1, Double value2) {
            addCriterion("LA not between", value1, value2, "la");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractIsNull() {
            addCriterion("OVERTIME_PLAT_EXTRACT is null");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractIsNotNull() {
            addCriterion("OVERTIME_PLAT_EXTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractEqualTo(Integer value) {
            addCriterion("OVERTIME_PLAT_EXTRACT =", value, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractNotEqualTo(Integer value) {
            addCriterion("OVERTIME_PLAT_EXTRACT <>", value, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractGreaterThan(Integer value) {
            addCriterion("OVERTIME_PLAT_EXTRACT >", value, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_PLAT_EXTRACT >=", value, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractLessThan(Integer value) {
            addCriterion("OVERTIME_PLAT_EXTRACT <", value, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractLessThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_PLAT_EXTRACT <=", value, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractIn(List<Integer> values) {
            addCriterion("OVERTIME_PLAT_EXTRACT in", values, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractNotIn(List<Integer> values) {
            addCriterion("OVERTIME_PLAT_EXTRACT not in", values, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_PLAT_EXTRACT between", value1, value2, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimePlatExtractNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_PLAT_EXTRACT not between", value1, value2, "overtimePlatExtract");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactIsNull() {
            addCriterion("OVERTIME_PROVINCE_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactIsNotNull() {
            addCriterion("OVERTIME_PROVINCE_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactEqualTo(Integer value) {
            addCriterion("OVERTIME_PROVINCE_EXTACT =", value, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactNotEqualTo(Integer value) {
            addCriterion("OVERTIME_PROVINCE_EXTACT <>", value, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactGreaterThan(Integer value) {
            addCriterion("OVERTIME_PROVINCE_EXTACT >", value, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_PROVINCE_EXTACT >=", value, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactLessThan(Integer value) {
            addCriterion("OVERTIME_PROVINCE_EXTACT <", value, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactLessThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_PROVINCE_EXTACT <=", value, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactIn(List<Integer> values) {
            addCriterion("OVERTIME_PROVINCE_EXTACT in", values, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactNotIn(List<Integer> values) {
            addCriterion("OVERTIME_PROVINCE_EXTACT not in", values, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_PROVINCE_EXTACT between", value1, value2, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeProvinceExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_PROVINCE_EXTACT not between", value1, value2, "overtimeProvinceExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactIsNull() {
            addCriterion("OVERTIME_CITY_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactIsNotNull() {
            addCriterion("OVERTIME_CITY_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactEqualTo(Integer value) {
            addCriterion("OVERTIME_CITY_EXTACT =", value, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactNotEqualTo(Integer value) {
            addCriterion("OVERTIME_CITY_EXTACT <>", value, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactGreaterThan(Integer value) {
            addCriterion("OVERTIME_CITY_EXTACT >", value, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_CITY_EXTACT >=", value, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactLessThan(Integer value) {
            addCriterion("OVERTIME_CITY_EXTACT <", value, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactLessThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_CITY_EXTACT <=", value, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactIn(List<Integer> values) {
            addCriterion("OVERTIME_CITY_EXTACT in", values, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactNotIn(List<Integer> values) {
            addCriterion("OVERTIME_CITY_EXTACT not in", values, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_CITY_EXTACT between", value1, value2, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeCityExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_CITY_EXTACT not between", value1, value2, "overtimeCityExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactIsNull() {
            addCriterion("OVERTIME_AREA_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactIsNotNull() {
            addCriterion("OVERTIME_AREA_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactEqualTo(Integer value) {
            addCriterion("OVERTIME_AREA_EXTACT =", value, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactNotEqualTo(Integer value) {
            addCriterion("OVERTIME_AREA_EXTACT <>", value, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactGreaterThan(Integer value) {
            addCriterion("OVERTIME_AREA_EXTACT >", value, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_AREA_EXTACT >=", value, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactLessThan(Integer value) {
            addCriterion("OVERTIME_AREA_EXTACT <", value, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactLessThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_AREA_EXTACT <=", value, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactIn(List<Integer> values) {
            addCriterion("OVERTIME_AREA_EXTACT in", values, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactNotIn(List<Integer> values) {
            addCriterion("OVERTIME_AREA_EXTACT not in", values, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_AREA_EXTACT between", value1, value2, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeAreaExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_AREA_EXTACT not between", value1, value2, "overtimeAreaExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactIsNull() {
            addCriterion("OVERTIME_SALES_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactIsNotNull() {
            addCriterion("OVERTIME_SALES_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactEqualTo(Integer value) {
            addCriterion("OVERTIME_SALES_EXTACT =", value, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactNotEqualTo(Integer value) {
            addCriterion("OVERTIME_SALES_EXTACT <>", value, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactGreaterThan(Integer value) {
            addCriterion("OVERTIME_SALES_EXTACT >", value, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_SALES_EXTACT >=", value, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactLessThan(Integer value) {
            addCriterion("OVERTIME_SALES_EXTACT <", value, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactLessThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_SALES_EXTACT <=", value, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactIn(List<Integer> values) {
            addCriterion("OVERTIME_SALES_EXTACT in", values, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactNotIn(List<Integer> values) {
            addCriterion("OVERTIME_SALES_EXTACT not in", values, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_SALES_EXTACT between", value1, value2, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeSalesExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_SALES_EXTACT not between", value1, value2, "overtimeSalesExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactIsNull() {
            addCriterion("OVERTIME_SHOP_EXTACT is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactIsNotNull() {
            addCriterion("OVERTIME_SHOP_EXTACT is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactEqualTo(Integer value) {
            addCriterion("OVERTIME_SHOP_EXTACT =", value, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactNotEqualTo(Integer value) {
            addCriterion("OVERTIME_SHOP_EXTACT <>", value, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactGreaterThan(Integer value) {
            addCriterion("OVERTIME_SHOP_EXTACT >", value, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactGreaterThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_SHOP_EXTACT >=", value, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactLessThan(Integer value) {
            addCriterion("OVERTIME_SHOP_EXTACT <", value, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactLessThanOrEqualTo(Integer value) {
            addCriterion("OVERTIME_SHOP_EXTACT <=", value, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactIn(List<Integer> values) {
            addCriterion("OVERTIME_SHOP_EXTACT in", values, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactNotIn(List<Integer> values) {
            addCriterion("OVERTIME_SHOP_EXTACT not in", values, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_SHOP_EXTACT between", value1, value2, "overtimeShopExtact");
            return (Criteria) this;
        }

        public Criteria andOvertimeShopExtactNotBetween(Integer value1, Integer value2) {
            addCriterion("OVERTIME_SHOP_EXTACT not between", value1, value2, "overtimeShopExtact");
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