package com.speed.cat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDivideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDivideExample() {
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

        public Criteria andOrMoneyIsNull() {
            addCriterion("OR_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andOrMoneyIsNotNull() {
            addCriterion("OR_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOrMoneyEqualTo(Double value) {
            addCriterion("OR_MONEY =", value, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyNotEqualTo(Double value) {
            addCriterion("OR_MONEY <>", value, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyGreaterThan(Double value) {
            addCriterion("OR_MONEY >", value, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("OR_MONEY >=", value, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyLessThan(Double value) {
            addCriterion("OR_MONEY <", value, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyLessThanOrEqualTo(Double value) {
            addCriterion("OR_MONEY <=", value, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyIn(List<Double> values) {
            addCriterion("OR_MONEY in", values, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyNotIn(List<Double> values) {
            addCriterion("OR_MONEY not in", values, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyBetween(Double value1, Double value2) {
            addCriterion("OR_MONEY between", value1, value2, "orMoney");
            return (Criteria) this;
        }

        public Criteria andOrMoneyNotBetween(Double value1, Double value2) {
            addCriterion("OR_MONEY not between", value1, value2, "orMoney");
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

        public Criteria andBrTimeIsNull() {
            addCriterion("BR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBrTimeIsNotNull() {
            addCriterion("BR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBrTimeEqualTo(Date value) {
            addCriterion("BR_TIME =", value, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeNotEqualTo(Date value) {
            addCriterion("BR_TIME <>", value, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeGreaterThan(Date value) {
            addCriterion("BR_TIME >", value, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BR_TIME >=", value, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeLessThan(Date value) {
            addCriterion("BR_TIME <", value, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeLessThanOrEqualTo(Date value) {
            addCriterion("BR_TIME <=", value, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeIn(List<Date> values) {
            addCriterion("BR_TIME in", values, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeNotIn(List<Date> values) {
            addCriterion("BR_TIME not in", values, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeBetween(Date value1, Date value2) {
            addCriterion("BR_TIME between", value1, value2, "brTime");
            return (Criteria) this;
        }

        public Criteria andBrTimeNotBetween(Date value1, Date value2) {
            addCriterion("BR_TIME not between", value1, value2, "brTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeIsNull() {
            addCriterion("DI_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDiTimeIsNotNull() {
            addCriterion("DI_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDiTimeEqualTo(Date value) {
            addCriterion("DI_TIME =", value, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeNotEqualTo(Date value) {
            addCriterion("DI_TIME <>", value, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeGreaterThan(Date value) {
            addCriterion("DI_TIME >", value, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DI_TIME >=", value, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeLessThan(Date value) {
            addCriterion("DI_TIME <", value, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeLessThanOrEqualTo(Date value) {
            addCriterion("DI_TIME <=", value, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeIn(List<Date> values) {
            addCriterion("DI_TIME in", values, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeNotIn(List<Date> values) {
            addCriterion("DI_TIME not in", values, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeBetween(Date value1, Date value2) {
            addCriterion("DI_TIME between", value1, value2, "diTime");
            return (Criteria) this;
        }

        public Criteria andDiTimeNotBetween(Date value1, Date value2) {
            addCriterion("DI_TIME not between", value1, value2, "diTime");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyIsNull() {
            addCriterion("PLAT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyIsNotNull() {
            addCriterion("PLAT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyEqualTo(Double value) {
            addCriterion("PLAT_MONEY =", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyNotEqualTo(Double value) {
            addCriterion("PLAT_MONEY <>", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyGreaterThan(Double value) {
            addCriterion("PLAT_MONEY >", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("PLAT_MONEY >=", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyLessThan(Double value) {
            addCriterion("PLAT_MONEY <", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyLessThanOrEqualTo(Double value) {
            addCriterion("PLAT_MONEY <=", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyIn(List<Double> values) {
            addCriterion("PLAT_MONEY in", values, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyNotIn(List<Double> values) {
            addCriterion("PLAT_MONEY not in", values, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyBetween(Double value1, Double value2) {
            addCriterion("PLAT_MONEY between", value1, value2, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyNotBetween(Double value1, Double value2) {
            addCriterion("PLAT_MONEY not between", value1, value2, "platMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyIsNull() {
            addCriterion("PROVINCE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyIsNotNull() {
            addCriterion("PROVINCE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyEqualTo(Double value) {
            addCriterion("PROVINCE_MONEY =", value, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyNotEqualTo(Double value) {
            addCriterion("PROVINCE_MONEY <>", value, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyGreaterThan(Double value) {
            addCriterion("PROVINCE_MONEY >", value, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("PROVINCE_MONEY >=", value, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyLessThan(Double value) {
            addCriterion("PROVINCE_MONEY <", value, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyLessThanOrEqualTo(Double value) {
            addCriterion("PROVINCE_MONEY <=", value, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyIn(List<Double> values) {
            addCriterion("PROVINCE_MONEY in", values, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyNotIn(List<Double> values) {
            addCriterion("PROVINCE_MONEY not in", values, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyBetween(Double value1, Double value2) {
            addCriterion("PROVINCE_MONEY between", value1, value2, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andProvinceMoneyNotBetween(Double value1, Double value2) {
            addCriterion("PROVINCE_MONEY not between", value1, value2, "provinceMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyIsNull() {
            addCriterion("CITY_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCityMoneyIsNotNull() {
            addCriterion("CITY_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCityMoneyEqualTo(Double value) {
            addCriterion("CITY_MONEY =", value, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyNotEqualTo(Double value) {
            addCriterion("CITY_MONEY <>", value, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyGreaterThan(Double value) {
            addCriterion("CITY_MONEY >", value, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("CITY_MONEY >=", value, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyLessThan(Double value) {
            addCriterion("CITY_MONEY <", value, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyLessThanOrEqualTo(Double value) {
            addCriterion("CITY_MONEY <=", value, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyIn(List<Double> values) {
            addCriterion("CITY_MONEY in", values, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyNotIn(List<Double> values) {
            addCriterion("CITY_MONEY not in", values, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyBetween(Double value1, Double value2) {
            addCriterion("CITY_MONEY between", value1, value2, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andCityMoneyNotBetween(Double value1, Double value2) {
            addCriterion("CITY_MONEY not between", value1, value2, "cityMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyIsNull() {
            addCriterion("AREA_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyIsNotNull() {
            addCriterion("AREA_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyEqualTo(Double value) {
            addCriterion("AREA_MONEY =", value, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyNotEqualTo(Double value) {
            addCriterion("AREA_MONEY <>", value, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyGreaterThan(Double value) {
            addCriterion("AREA_MONEY >", value, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("AREA_MONEY >=", value, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyLessThan(Double value) {
            addCriterion("AREA_MONEY <", value, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyLessThanOrEqualTo(Double value) {
            addCriterion("AREA_MONEY <=", value, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyIn(List<Double> values) {
            addCriterion("AREA_MONEY in", values, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyNotIn(List<Double> values) {
            addCriterion("AREA_MONEY not in", values, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyBetween(Double value1, Double value2) {
            addCriterion("AREA_MONEY between", value1, value2, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andAreaMoneyNotBetween(Double value1, Double value2) {
            addCriterion("AREA_MONEY not between", value1, value2, "areaMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyIsNull() {
            addCriterion("SALES_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyIsNotNull() {
            addCriterion("SALES_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyEqualTo(Double value) {
            addCriterion("SALES_MONEY =", value, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyNotEqualTo(Double value) {
            addCriterion("SALES_MONEY <>", value, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyGreaterThan(Double value) {
            addCriterion("SALES_MONEY >", value, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("SALES_MONEY >=", value, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyLessThan(Double value) {
            addCriterion("SALES_MONEY <", value, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyLessThanOrEqualTo(Double value) {
            addCriterion("SALES_MONEY <=", value, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyIn(List<Double> values) {
            addCriterion("SALES_MONEY in", values, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyNotIn(List<Double> values) {
            addCriterion("SALES_MONEY not in", values, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyBetween(Double value1, Double value2) {
            addCriterion("SALES_MONEY between", value1, value2, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andSalesMoneyNotBetween(Double value1, Double value2) {
            addCriterion("SALES_MONEY not between", value1, value2, "salesMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyIsNull() {
            addCriterion("SHOP_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andShopMoneyIsNotNull() {
            addCriterion("SHOP_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andShopMoneyEqualTo(Double value) {
            addCriterion("SHOP_MONEY =", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyNotEqualTo(Double value) {
            addCriterion("SHOP_MONEY <>", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyGreaterThan(Double value) {
            addCriterion("SHOP_MONEY >", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("SHOP_MONEY >=", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyLessThan(Double value) {
            addCriterion("SHOP_MONEY <", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyLessThanOrEqualTo(Double value) {
            addCriterion("SHOP_MONEY <=", value, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyIn(List<Double> values) {
            addCriterion("SHOP_MONEY in", values, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyNotIn(List<Double> values) {
            addCriterion("SHOP_MONEY not in", values, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyBetween(Double value1, Double value2) {
            addCriterion("SHOP_MONEY between", value1, value2, "shopMoney");
            return (Criteria) this;
        }

        public Criteria andShopMoneyNotBetween(Double value1, Double value2) {
            addCriterion("SHOP_MONEY not between", value1, value2, "shopMoney");
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