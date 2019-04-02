package com.speed.cat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShopMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopMapExample() {
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

        public Criteria andShopidIsNull() {
            addCriterion("shopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Long value) {
            addCriterion("shopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Long value) {
            addCriterion("shopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Long value) {
            addCriterion("shopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Long value) {
            addCriterion("shopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Long value) {
            addCriterion("shopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Long value) {
            addCriterion("shopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Long> values) {
            addCriterion("shopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Long> values) {
            addCriterion("shopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Long value1, Long value2) {
            addCriterion("shopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Long value1, Long value2) {
            addCriterion("shopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopcodeIsNull() {
            addCriterion("shopCode is null");
            return (Criteria) this;
        }

        public Criteria andShopcodeIsNotNull() {
            addCriterion("shopCode is not null");
            return (Criteria) this;
        }

        public Criteria andShopcodeEqualTo(String value) {
            addCriterion("shopCode =", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeNotEqualTo(String value) {
            addCriterion("shopCode <>", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeGreaterThan(String value) {
            addCriterion("shopCode >", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeGreaterThanOrEqualTo(String value) {
            addCriterion("shopCode >=", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeLessThan(String value) {
            addCriterion("shopCode <", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeLessThanOrEqualTo(String value) {
            addCriterion("shopCode <=", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeLike(String value) {
            addCriterion("shopCode like", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeNotLike(String value) {
            addCriterion("shopCode not like", value, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeIn(List<String> values) {
            addCriterion("shopCode in", values, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeNotIn(List<String> values) {
            addCriterion("shopCode not in", values, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeBetween(String value1, String value2) {
            addCriterion("shopCode between", value1, value2, "shopcode");
            return (Criteria) this;
        }

        public Criteria andShopcodeNotBetween(String value1, String value2) {
            addCriterion("shopCode not between", value1, value2, "shopcode");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Long value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Long value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Long value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Long value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Long value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Long value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Long> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Long> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Long value1, Long value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Long value1, Long value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("shopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("shopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("shopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("shopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("shopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("shopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("shopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("shopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("shopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("shopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("shopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("shopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("shopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("shopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNull() {
            addCriterion("shopAddress is null");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNotNull() {
            addCriterion("shopAddress is not null");
            return (Criteria) this;
        }

        public Criteria andShopaddressEqualTo(String value) {
            addCriterion("shopAddress =", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotEqualTo(String value) {
            addCriterion("shopAddress <>", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThan(String value) {
            addCriterion("shopAddress >", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThanOrEqualTo(String value) {
            addCriterion("shopAddress >=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThan(String value) {
            addCriterion("shopAddress <", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThanOrEqualTo(String value) {
            addCriterion("shopAddress <=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLike(String value) {
            addCriterion("shopAddress like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotLike(String value) {
            addCriterion("shopAddress not like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressIn(List<String> values) {
            addCriterion("shopAddress in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotIn(List<String> values) {
            addCriterion("shopAddress not in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressBetween(String value1, String value2) {
            addCriterion("shopAddress between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotBetween(String value1, String value2) {
            addCriterion("shopAddress not between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andEquipcountIsNull() {
            addCriterion("equipCount is null");
            return (Criteria) this;
        }

        public Criteria andEquipcountIsNotNull() {
            addCriterion("equipCount is not null");
            return (Criteria) this;
        }

        public Criteria andEquipcountEqualTo(Integer value) {
            addCriterion("equipCount =", value, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountNotEqualTo(Integer value) {
            addCriterion("equipCount <>", value, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountGreaterThan(Integer value) {
            addCriterion("equipCount >", value, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipCount >=", value, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountLessThan(Integer value) {
            addCriterion("equipCount <", value, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountLessThanOrEqualTo(Integer value) {
            addCriterion("equipCount <=", value, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountIn(List<Integer> values) {
            addCriterion("equipCount in", values, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountNotIn(List<Integer> values) {
            addCriterion("equipCount not in", values, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountBetween(Integer value1, Integer value2) {
            addCriterion("equipCount between", value1, value2, "equipcount");
            return (Criteria) this;
        }

        public Criteria andEquipcountNotBetween(Integer value1, Integer value2) {
            addCriterion("equipCount not between", value1, value2, "equipcount");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateIsNull() {
            addCriterion("shopCoordinate is null");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateIsNotNull() {
            addCriterion("shopCoordinate is not null");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateEqualTo(String value) {
            addCriterion("shopCoordinate =", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateNotEqualTo(String value) {
            addCriterion("shopCoordinate <>", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateGreaterThan(String value) {
            addCriterion("shopCoordinate >", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("shopCoordinate >=", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateLessThan(String value) {
            addCriterion("shopCoordinate <", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateLessThanOrEqualTo(String value) {
            addCriterion("shopCoordinate <=", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateLike(String value) {
            addCriterion("shopCoordinate like", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateNotLike(String value) {
            addCriterion("shopCoordinate not like", value, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateIn(List<String> values) {
            addCriterion("shopCoordinate in", values, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateNotIn(List<String> values) {
            addCriterion("shopCoordinate not in", values, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateBetween(String value1, String value2) {
            addCriterion("shopCoordinate between", value1, value2, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andShopcoordinateNotBetween(String value1, String value2) {
            addCriterion("shopCoordinate not between", value1, value2, "shopcoordinate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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