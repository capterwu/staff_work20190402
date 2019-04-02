package com.speed.cat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderinfoExample() {
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

        public Criteria andMemberIsNull() {
            addCriterion("MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(Long value) {
            addCriterion("MEMBER =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(Long value) {
            addCriterion("MEMBER <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(Long value) {
            addCriterion("MEMBER >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(Long value) {
            addCriterion("MEMBER >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(Long value) {
            addCriterion("MEMBER <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(Long value) {
            addCriterion("MEMBER <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<Long> values) {
            addCriterion("MEMBER in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<Long> values) {
            addCriterion("MEMBER not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(Long value1, Long value2) {
            addCriterion("MEMBER between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(Long value1, Long value2) {
            addCriterion("MEMBER not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andEquipIsNull() {
            addCriterion("EQUIP is null");
            return (Criteria) this;
        }

        public Criteria andEquipIsNotNull() {
            addCriterion("EQUIP is not null");
            return (Criteria) this;
        }

        public Criteria andEquipEqualTo(Long value) {
            addCriterion("EQUIP =", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotEqualTo(Long value) {
            addCriterion("EQUIP <>", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipGreaterThan(Long value) {
            addCriterion("EQUIP >", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipGreaterThanOrEqualTo(Long value) {
            addCriterion("EQUIP >=", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLessThan(Long value) {
            addCriterion("EQUIP <", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLessThanOrEqualTo(Long value) {
            addCriterion("EQUIP <=", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipIn(List<Long> values) {
            addCriterion("EQUIP in", values, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotIn(List<Long> values) {
            addCriterion("EQUIP not in", values, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipBetween(Long value1, Long value2) {
            addCriterion("EQUIP between", value1, value2, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotBetween(Long value1, Long value2) {
            addCriterion("EQUIP not between", value1, value2, "equip");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("PAY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("PAY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("PAY_STATUS =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("PAY_STATUS <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("PAY_STATUS >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_STATUS >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("PAY_STATUS <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_STATUS <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("PAY_STATUS in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("PAY_STATUS not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("PAY_STATUS between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_STATUS not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPatTypeIsNull() {
            addCriterion("PAT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPatTypeIsNotNull() {
            addCriterion("PAT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPatTypeEqualTo(Integer value) {
            addCriterion("PAT_TYPE =", value, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeNotEqualTo(Integer value) {
            addCriterion("PAT_TYPE <>", value, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeGreaterThan(Integer value) {
            addCriterion("PAT_TYPE >", value, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAT_TYPE >=", value, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeLessThan(Integer value) {
            addCriterion("PAT_TYPE <", value, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PAT_TYPE <=", value, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeIn(List<Integer> values) {
            addCriterion("PAT_TYPE in", values, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeNotIn(List<Integer> values) {
            addCriterion("PAT_TYPE not in", values, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeBetween(Integer value1, Integer value2) {
            addCriterion("PAT_TYPE between", value1, value2, "patType");
            return (Criteria) this;
        }

        public Criteria andPatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PAT_TYPE not between", value1, value2, "patType");
            return (Criteria) this;
        }

        public Criteria andPayCodeIsNull() {
            addCriterion("PAY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPayCodeIsNotNull() {
            addCriterion("PAY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayCodeEqualTo(String value) {
            addCriterion("PAY_CODE =", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotEqualTo(String value) {
            addCriterion("PAY_CODE <>", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeGreaterThan(String value) {
            addCriterion("PAY_CODE >", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CODE >=", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLessThan(String value) {
            addCriterion("PAY_CODE <", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLessThanOrEqualTo(String value) {
            addCriterion("PAY_CODE <=", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeLike(String value) {
            addCriterion("PAY_CODE like", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotLike(String value) {
            addCriterion("PAY_CODE not like", value, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeIn(List<String> values) {
            addCriterion("PAY_CODE in", values, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotIn(List<String> values) {
            addCriterion("PAY_CODE not in", values, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeBetween(String value1, String value2) {
            addCriterion("PAY_CODE between", value1, value2, "payCode");
            return (Criteria) this;
        }

        public Criteria andPayCodeNotBetween(String value1, String value2) {
            addCriterion("PAY_CODE not between", value1, value2, "payCode");
            return (Criteria) this;
        }

        public Criteria andPowerBiIsNull() {
            addCriterion("POWER_BI is null");
            return (Criteria) this;
        }

        public Criteria andPowerBiIsNotNull() {
            addCriterion("POWER_BI is not null");
            return (Criteria) this;
        }

        public Criteria andPowerBiEqualTo(String value) {
            addCriterion("POWER_BI =", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiNotEqualTo(String value) {
            addCriterion("POWER_BI <>", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiGreaterThan(String value) {
            addCriterion("POWER_BI >", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_BI >=", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiLessThan(String value) {
            addCriterion("POWER_BI <", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiLessThanOrEqualTo(String value) {
            addCriterion("POWER_BI <=", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiLike(String value) {
            addCriterion("POWER_BI like", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiNotLike(String value) {
            addCriterion("POWER_BI not like", value, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiIn(List<String> values) {
            addCriterion("POWER_BI in", values, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiNotIn(List<String> values) {
            addCriterion("POWER_BI not in", values, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiBetween(String value1, String value2) {
            addCriterion("POWER_BI between", value1, value2, "powerBi");
            return (Criteria) this;
        }

        public Criteria andPowerBiNotBetween(String value1, String value2) {
            addCriterion("POWER_BI not between", value1, value2, "powerBi");
            return (Criteria) this;
        }

        public Criteria andBwShopIsNull() {
            addCriterion("BW_SHOP is null");
            return (Criteria) this;
        }

        public Criteria andBwShopIsNotNull() {
            addCriterion("BW_SHOP is not null");
            return (Criteria) this;
        }

        public Criteria andBwShopEqualTo(Long value) {
            addCriterion("BW_SHOP =", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopNotEqualTo(Long value) {
            addCriterion("BW_SHOP <>", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopGreaterThan(Long value) {
            addCriterion("BW_SHOP >", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopGreaterThanOrEqualTo(Long value) {
            addCriterion("BW_SHOP >=", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopLessThan(Long value) {
            addCriterion("BW_SHOP <", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopLessThanOrEqualTo(Long value) {
            addCriterion("BW_SHOP <=", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopIn(List<Long> values) {
            addCriterion("BW_SHOP in", values, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopNotIn(List<Long> values) {
            addCriterion("BW_SHOP not in", values, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopBetween(Long value1, Long value2) {
            addCriterion("BW_SHOP between", value1, value2, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopNotBetween(Long value1, Long value2) {
            addCriterion("BW_SHOP not between", value1, value2, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBkShopIsNull() {
            addCriterion("BK_SHOP is null");
            return (Criteria) this;
        }

        public Criteria andBkShopIsNotNull() {
            addCriterion("BK_SHOP is not null");
            return (Criteria) this;
        }

        public Criteria andBkShopEqualTo(Long value) {
            addCriterion("BK_SHOP =", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopNotEqualTo(Long value) {
            addCriterion("BK_SHOP <>", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopGreaterThan(Long value) {
            addCriterion("BK_SHOP >", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopGreaterThanOrEqualTo(Long value) {
            addCriterion("BK_SHOP >=", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopLessThan(Long value) {
            addCriterion("BK_SHOP <", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopLessThanOrEqualTo(Long value) {
            addCriterion("BK_SHOP <=", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopIn(List<Long> values) {
            addCriterion("BK_SHOP in", values, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopNotIn(List<Long> values) {
            addCriterion("BK_SHOP not in", values, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopBetween(Long value1, Long value2) {
            addCriterion("BK_SHOP between", value1, value2, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopNotBetween(Long value1, Long value2) {
            addCriterion("BK_SHOP not between", value1, value2, "bkShop");
            return (Criteria) this;
        }

        public Criteria andUseMinuteIsNull() {
            addCriterion("USE_MINUTE is null");
            return (Criteria) this;
        }

        public Criteria andUseMinuteIsNotNull() {
            addCriterion("USE_MINUTE is not null");
            return (Criteria) this;
        }

        public Criteria andUseMinuteEqualTo(Integer value) {
            addCriterion("USE_MINUTE =", value, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteNotEqualTo(Integer value) {
            addCriterion("USE_MINUTE <>", value, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteGreaterThan(Integer value) {
            addCriterion("USE_MINUTE >", value, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_MINUTE >=", value, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteLessThan(Integer value) {
            addCriterion("USE_MINUTE <", value, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteLessThanOrEqualTo(Integer value) {
            addCriterion("USE_MINUTE <=", value, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteIn(List<Integer> values) {
            addCriterion("USE_MINUTE in", values, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteNotIn(List<Integer> values) {
            addCriterion("USE_MINUTE not in", values, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteBetween(Integer value1, Integer value2) {
            addCriterion("USE_MINUTE between", value1, value2, "useMinute");
            return (Criteria) this;
        }

        public Criteria andUseMinuteNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_MINUTE not between", value1, value2, "useMinute");
            return (Criteria) this;
        }

        public Criteria andBillIsNull() {
            addCriterion("BILL is null");
            return (Criteria) this;
        }

        public Criteria andBillIsNotNull() {
            addCriterion("BILL is not null");
            return (Criteria) this;
        }

        public Criteria andBillEqualTo(Double value) {
            addCriterion("BILL =", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotEqualTo(Double value) {
            addCriterion("BILL <>", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThan(Double value) {
            addCriterion("BILL >", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillGreaterThanOrEqualTo(Double value) {
            addCriterion("BILL >=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThan(Double value) {
            addCriterion("BILL <", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillLessThanOrEqualTo(Double value) {
            addCriterion("BILL <=", value, "bill");
            return (Criteria) this;
        }

        public Criteria andBillIn(List<Double> values) {
            addCriterion("BILL in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotIn(List<Double> values) {
            addCriterion("BILL not in", values, "bill");
            return (Criteria) this;
        }

        public Criteria andBillBetween(Double value1, Double value2) {
            addCriterion("BILL between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andBillNotBetween(Double value1, Double value2) {
            addCriterion("BILL not between", value1, value2, "bill");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Double value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Double value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Double value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Double value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Double> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Double> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Double value1, Double value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNull() {
            addCriterion("ORDERTIME is null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIsNotNull() {
            addCriterion("ORDERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertimeEqualTo(Date value) {
            addCriterion("ORDERTIME =", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotEqualTo(Date value) {
            addCriterion("ORDERTIME <>", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThan(Date value) {
            addCriterion("ORDERTIME >", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDERTIME >=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThan(Date value) {
            addCriterion("ORDERTIME <", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeLessThanOrEqualTo(Date value) {
            addCriterion("ORDERTIME <=", value, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeIn(List<Date> values) {
            addCriterion("ORDERTIME in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotIn(List<Date> values) {
            addCriterion("ORDERTIME not in", values, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeBetween(Date value1, Date value2) {
            addCriterion("ORDERTIME between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andOrdertimeNotBetween(Date value1, Date value2) {
            addCriterion("ORDERTIME not between", value1, value2, "ordertime");
            return (Criteria) this;
        }

        public Criteria andBkTimeIsNull() {
            addCriterion("BK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBkTimeIsNotNull() {
            addCriterion("BK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBkTimeEqualTo(Date value) {
            addCriterion("BK_TIME =", value, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeNotEqualTo(Date value) {
            addCriterion("BK_TIME <>", value, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeGreaterThan(Date value) {
            addCriterion("BK_TIME >", value, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BK_TIME >=", value, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeLessThan(Date value) {
            addCriterion("BK_TIME <", value, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeLessThanOrEqualTo(Date value) {
            addCriterion("BK_TIME <=", value, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeIn(List<Date> values) {
            addCriterion("BK_TIME in", values, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeNotIn(List<Date> values) {
            addCriterion("BK_TIME not in", values, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeBetween(Date value1, Date value2) {
            addCriterion("BK_TIME between", value1, value2, "bkTime");
            return (Criteria) this;
        }

        public Criteria andBkTimeNotBetween(Date value1, Date value2) {
            addCriterion("BK_TIME not between", value1, value2, "bkTime");
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