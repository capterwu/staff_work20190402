package ydb.auxiliary.service.ydbauxiliaryservice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderLibraryExample() {
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

        public Criteria andMOpenidIsNull() {
            addCriterion("M_OPENID is null");
            return (Criteria) this;
        }

        public Criteria andMOpenidIsNotNull() {
            addCriterion("M_OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andMOpenidEqualTo(String value) {
            addCriterion("M_OPENID =", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidNotEqualTo(String value) {
            addCriterion("M_OPENID <>", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidGreaterThan(String value) {
            addCriterion("M_OPENID >", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("M_OPENID >=", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidLessThan(String value) {
            addCriterion("M_OPENID <", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidLessThanOrEqualTo(String value) {
            addCriterion("M_OPENID <=", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidLike(String value) {
            addCriterion("M_OPENID like", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidNotLike(String value) {
            addCriterion("M_OPENID not like", value, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidIn(List<String> values) {
            addCriterion("M_OPENID in", values, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidNotIn(List<String> values) {
            addCriterion("M_OPENID not in", values, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidBetween(String value1, String value2) {
            addCriterion("M_OPENID between", value1, value2, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMOpenidNotBetween(String value1, String value2) {
            addCriterion("M_OPENID not between", value1, value2, "mOpenid");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNull() {
            addCriterion("M_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMTypeIsNotNull() {
            addCriterion("M_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMTypeEqualTo(Integer value) {
            addCriterion("M_TYPE =", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotEqualTo(Integer value) {
            addCriterion("M_TYPE <>", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThan(Integer value) {
            addCriterion("M_TYPE >", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_TYPE >=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThan(Integer value) {
            addCriterion("M_TYPE <", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeLessThanOrEqualTo(Integer value) {
            addCriterion("M_TYPE <=", value, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeIn(List<Integer> values) {
            addCriterion("M_TYPE in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotIn(List<Integer> values) {
            addCriterion("M_TYPE not in", values, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeBetween(Integer value1, Integer value2) {
            addCriterion("M_TYPE between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andMTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("M_TYPE not between", value1, value2, "mType");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("SEX not between", value1, value2, "sex");
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

        public Criteria andEquipCodeIsNull() {
            addCriterion("EQUIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEquipCodeIsNotNull() {
            addCriterion("EQUIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEquipCodeEqualTo(String value) {
            addCriterion("EQUIP_CODE =", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeNotEqualTo(String value) {
            addCriterion("EQUIP_CODE <>", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeGreaterThan(String value) {
            addCriterion("EQUIP_CODE >", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIP_CODE >=", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeLessThan(String value) {
            addCriterion("EQUIP_CODE <", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeLessThanOrEqualTo(String value) {
            addCriterion("EQUIP_CODE <=", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeLike(String value) {
            addCriterion("EQUIP_CODE like", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeNotLike(String value) {
            addCriterion("EQUIP_CODE not like", value, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeIn(List<String> values) {
            addCriterion("EQUIP_CODE in", values, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeNotIn(List<String> values) {
            addCriterion("EQUIP_CODE not in", values, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeBetween(String value1, String value2) {
            addCriterion("EQUIP_CODE between", value1, value2, "equipCode");
            return (Criteria) this;
        }

        public Criteria andEquipCodeNotBetween(String value1, String value2) {
            addCriterion("EQUIP_CODE not between", value1, value2, "equipCode");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
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

        public Criteria andBwShopEqualTo(String value) {
            addCriterion("BW_SHOP =", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopNotEqualTo(String value) {
            addCriterion("BW_SHOP <>", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopGreaterThan(String value) {
            addCriterion("BW_SHOP >", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopGreaterThanOrEqualTo(String value) {
            addCriterion("BW_SHOP >=", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopLessThan(String value) {
            addCriterion("BW_SHOP <", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopLessThanOrEqualTo(String value) {
            addCriterion("BW_SHOP <=", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopLike(String value) {
            addCriterion("BW_SHOP like", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopNotLike(String value) {
            addCriterion("BW_SHOP not like", value, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopIn(List<String> values) {
            addCriterion("BW_SHOP in", values, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopNotIn(List<String> values) {
            addCriterion("BW_SHOP not in", values, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopBetween(String value1, String value2) {
            addCriterion("BW_SHOP between", value1, value2, "bwShop");
            return (Criteria) this;
        }

        public Criteria andBwShopNotBetween(String value1, String value2) {
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

        public Criteria andBkShopEqualTo(String value) {
            addCriterion("BK_SHOP =", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopNotEqualTo(String value) {
            addCriterion("BK_SHOP <>", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopGreaterThan(String value) {
            addCriterion("BK_SHOP >", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopGreaterThanOrEqualTo(String value) {
            addCriterion("BK_SHOP >=", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopLessThan(String value) {
            addCriterion("BK_SHOP <", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopLessThanOrEqualTo(String value) {
            addCriterion("BK_SHOP <=", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopLike(String value) {
            addCriterion("BK_SHOP like", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopNotLike(String value) {
            addCriterion("BK_SHOP not like", value, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopIn(List<String> values) {
            addCriterion("BK_SHOP in", values, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopNotIn(List<String> values) {
            addCriterion("BK_SHOP not in", values, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopBetween(String value1, String value2) {
            addCriterion("BK_SHOP between", value1, value2, "bkShop");
            return (Criteria) this;
        }

        public Criteria andBkShopNotBetween(String value1, String value2) {
            addCriterion("BK_SHOP not between", value1, value2, "bkShop");
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

        public Criteria andPlatOidIsNull() {
            addCriterion("PLAT_OID is null");
            return (Criteria) this;
        }

        public Criteria andPlatOidIsNotNull() {
            addCriterion("PLAT_OID is not null");
            return (Criteria) this;
        }

        public Criteria andPlatOidEqualTo(String value) {
            addCriterion("PLAT_OID =", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidNotEqualTo(String value) {
            addCriterion("PLAT_OID <>", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidGreaterThan(String value) {
            addCriterion("PLAT_OID >", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidGreaterThanOrEqualTo(String value) {
            addCriterion("PLAT_OID >=", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidLessThan(String value) {
            addCriterion("PLAT_OID <", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidLessThanOrEqualTo(String value) {
            addCriterion("PLAT_OID <=", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidLike(String value) {
            addCriterion("PLAT_OID like", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidNotLike(String value) {
            addCriterion("PLAT_OID not like", value, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidIn(List<String> values) {
            addCriterion("PLAT_OID in", values, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidNotIn(List<String> values) {
            addCriterion("PLAT_OID not in", values, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidBetween(String value1, String value2) {
            addCriterion("PLAT_OID between", value1, value2, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatOidNotBetween(String value1, String value2) {
            addCriterion("PLAT_OID not between", value1, value2, "platOid");
            return (Criteria) this;
        }

        public Criteria andPlatNameIsNull() {
            addCriterion("PLAT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlatNameIsNotNull() {
            addCriterion("PLAT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlatNameEqualTo(String value) {
            addCriterion("PLAT_NAME =", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameNotEqualTo(String value) {
            addCriterion("PLAT_NAME <>", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameGreaterThan(String value) {
            addCriterion("PLAT_NAME >", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLAT_NAME >=", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameLessThan(String value) {
            addCriterion("PLAT_NAME <", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameLessThanOrEqualTo(String value) {
            addCriterion("PLAT_NAME <=", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameLike(String value) {
            addCriterion("PLAT_NAME like", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameNotLike(String value) {
            addCriterion("PLAT_NAME not like", value, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameIn(List<String> values) {
            addCriterion("PLAT_NAME in", values, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameNotIn(List<String> values) {
            addCriterion("PLAT_NAME not in", values, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameBetween(String value1, String value2) {
            addCriterion("PLAT_NAME between", value1, value2, "platName");
            return (Criteria) this;
        }

        public Criteria andPlatNameNotBetween(String value1, String value2) {
            addCriterion("PLAT_NAME not between", value1, value2, "platName");
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

        public Criteria andProvinceOidIsNull() {
            addCriterion("PROVINCE_OID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceOidIsNotNull() {
            addCriterion("PROVINCE_OID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceOidEqualTo(String value) {
            addCriterion("PROVINCE_OID =", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidNotEqualTo(String value) {
            addCriterion("PROVINCE_OID <>", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidGreaterThan(String value) {
            addCriterion("PROVINCE_OID >", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_OID >=", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidLessThan(String value) {
            addCriterion("PROVINCE_OID <", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_OID <=", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidLike(String value) {
            addCriterion("PROVINCE_OID like", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidNotLike(String value) {
            addCriterion("PROVINCE_OID not like", value, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidIn(List<String> values) {
            addCriterion("PROVINCE_OID in", values, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidNotIn(List<String> values) {
            addCriterion("PROVINCE_OID not in", values, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidBetween(String value1, String value2) {
            addCriterion("PROVINCE_OID between", value1, value2, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceOidNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_OID not between", value1, value2, "provinceOid");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("PROVINCE_NAME =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("PROVINCE_NAME <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("PROVINCE_NAME >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("PROVINCE_NAME <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("PROVINCE_NAME like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("PROVINCE_NAME not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("PROVINCE_NAME in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("PROVINCE_NAME not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
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

        public Criteria andCityOidIsNull() {
            addCriterion("CITY_OID is null");
            return (Criteria) this;
        }

        public Criteria andCityOidIsNotNull() {
            addCriterion("CITY_OID is not null");
            return (Criteria) this;
        }

        public Criteria andCityOidEqualTo(String value) {
            addCriterion("CITY_OID =", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidNotEqualTo(String value) {
            addCriterion("CITY_OID <>", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidGreaterThan(String value) {
            addCriterion("CITY_OID >", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_OID >=", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidLessThan(String value) {
            addCriterion("CITY_OID <", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidLessThanOrEqualTo(String value) {
            addCriterion("CITY_OID <=", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidLike(String value) {
            addCriterion("CITY_OID like", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidNotLike(String value) {
            addCriterion("CITY_OID not like", value, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidIn(List<String> values) {
            addCriterion("CITY_OID in", values, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidNotIn(List<String> values) {
            addCriterion("CITY_OID not in", values, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidBetween(String value1, String value2) {
            addCriterion("CITY_OID between", value1, value2, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityOidNotBetween(String value1, String value2) {
            addCriterion("CITY_OID not between", value1, value2, "cityOid");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
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

        public Criteria andAreaOidIsNull() {
            addCriterion("AREA_OID is null");
            return (Criteria) this;
        }

        public Criteria andAreaOidIsNotNull() {
            addCriterion("AREA_OID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaOidEqualTo(String value) {
            addCriterion("AREA_OID =", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidNotEqualTo(String value) {
            addCriterion("AREA_OID <>", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidGreaterThan(String value) {
            addCriterion("AREA_OID >", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_OID >=", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidLessThan(String value) {
            addCriterion("AREA_OID <", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidLessThanOrEqualTo(String value) {
            addCriterion("AREA_OID <=", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidLike(String value) {
            addCriterion("AREA_OID like", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidNotLike(String value) {
            addCriterion("AREA_OID not like", value, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidIn(List<String> values) {
            addCriterion("AREA_OID in", values, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidNotIn(List<String> values) {
            addCriterion("AREA_OID not in", values, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidBetween(String value1, String value2) {
            addCriterion("AREA_OID between", value1, value2, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaOidNotBetween(String value1, String value2) {
            addCriterion("AREA_OID not between", value1, value2, "areaOid");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("AREA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("AREA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("AREA_NAME =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("AREA_NAME <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("AREA_NAME >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NAME >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("AREA_NAME <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("AREA_NAME <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("AREA_NAME like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("AREA_NAME not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("AREA_NAME in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("AREA_NAME not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("AREA_NAME between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("AREA_NAME not between", value1, value2, "areaName");
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

        public Criteria andSalesOidIsNull() {
            addCriterion("SALES_OID is null");
            return (Criteria) this;
        }

        public Criteria andSalesOidIsNotNull() {
            addCriterion("SALES_OID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesOidEqualTo(String value) {
            addCriterion("SALES_OID =", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidNotEqualTo(String value) {
            addCriterion("SALES_OID <>", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidGreaterThan(String value) {
            addCriterion("SALES_OID >", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_OID >=", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidLessThan(String value) {
            addCriterion("SALES_OID <", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidLessThanOrEqualTo(String value) {
            addCriterion("SALES_OID <=", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidLike(String value) {
            addCriterion("SALES_OID like", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidNotLike(String value) {
            addCriterion("SALES_OID not like", value, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidIn(List<String> values) {
            addCriterion("SALES_OID in", values, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidNotIn(List<String> values) {
            addCriterion("SALES_OID not in", values, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidBetween(String value1, String value2) {
            addCriterion("SALES_OID between", value1, value2, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesOidNotBetween(String value1, String value2) {
            addCriterion("SALES_OID not between", value1, value2, "salesOid");
            return (Criteria) this;
        }

        public Criteria andSalesNameIsNull() {
            addCriterion("SALES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSalesNameIsNotNull() {
            addCriterion("SALES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSalesNameEqualTo(String value) {
            addCriterion("SALES_NAME =", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotEqualTo(String value) {
            addCriterion("SALES_NAME <>", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThan(String value) {
            addCriterion("SALES_NAME >", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_NAME >=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThan(String value) {
            addCriterion("SALES_NAME <", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLessThanOrEqualTo(String value) {
            addCriterion("SALES_NAME <=", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameLike(String value) {
            addCriterion("SALES_NAME like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotLike(String value) {
            addCriterion("SALES_NAME not like", value, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameIn(List<String> values) {
            addCriterion("SALES_NAME in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotIn(List<String> values) {
            addCriterion("SALES_NAME not in", values, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameBetween(String value1, String value2) {
            addCriterion("SALES_NAME between", value1, value2, "salesName");
            return (Criteria) this;
        }

        public Criteria andSalesNameNotBetween(String value1, String value2) {
            addCriterion("SALES_NAME not between", value1, value2, "salesName");
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

        public Criteria andShopOidIsNull() {
            addCriterion("SHOP_OID is null");
            return (Criteria) this;
        }

        public Criteria andShopOidIsNotNull() {
            addCriterion("SHOP_OID is not null");
            return (Criteria) this;
        }

        public Criteria andShopOidEqualTo(String value) {
            addCriterion("SHOP_OID =", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidNotEqualTo(String value) {
            addCriterion("SHOP_OID <>", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidGreaterThan(String value) {
            addCriterion("SHOP_OID >", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_OID >=", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidLessThan(String value) {
            addCriterion("SHOP_OID <", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidLessThanOrEqualTo(String value) {
            addCriterion("SHOP_OID <=", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidLike(String value) {
            addCriterion("SHOP_OID like", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidNotLike(String value) {
            addCriterion("SHOP_OID not like", value, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidIn(List<String> values) {
            addCriterion("SHOP_OID in", values, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidNotIn(List<String> values) {
            addCriterion("SHOP_OID not in", values, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidBetween(String value1, String value2) {
            addCriterion("SHOP_OID between", value1, value2, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopOidNotBetween(String value1, String value2) {
            addCriterion("SHOP_OID not between", value1, value2, "shopOid");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
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

        public Criteria andBwSidIsNull() {
            addCriterion("BW_SID is null");
            return (Criteria) this;
        }

        public Criteria andBwSidIsNotNull() {
            addCriterion("BW_SID is not null");
            return (Criteria) this;
        }

        public Criteria andBwSidEqualTo(Long value) {
            addCriterion("BW_SID =", value, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidNotEqualTo(Long value) {
            addCriterion("BW_SID <>", value, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidGreaterThan(Long value) {
            addCriterion("BW_SID >", value, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidGreaterThanOrEqualTo(Long value) {
            addCriterion("BW_SID >=", value, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidLessThan(Long value) {
            addCriterion("BW_SID <", value, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidLessThanOrEqualTo(Long value) {
            addCriterion("BW_SID <=", value, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidIn(List<Long> values) {
            addCriterion("BW_SID in", values, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidNotIn(List<Long> values) {
            addCriterion("BW_SID not in", values, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidBetween(Long value1, Long value2) {
            addCriterion("BW_SID between", value1, value2, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwSidNotBetween(Long value1, Long value2) {
            addCriterion("BW_SID not between", value1, value2, "bwSid");
            return (Criteria) this;
        }

        public Criteria andBwScodeIsNull() {
            addCriterion("BW_SCODE is null");
            return (Criteria) this;
        }

        public Criteria andBwScodeIsNotNull() {
            addCriterion("BW_SCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBwScodeEqualTo(String value) {
            addCriterion("BW_SCODE =", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeNotEqualTo(String value) {
            addCriterion("BW_SCODE <>", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeGreaterThan(String value) {
            addCriterion("BW_SCODE >", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeGreaterThanOrEqualTo(String value) {
            addCriterion("BW_SCODE >=", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeLessThan(String value) {
            addCriterion("BW_SCODE <", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeLessThanOrEqualTo(String value) {
            addCriterion("BW_SCODE <=", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeLike(String value) {
            addCriterion("BW_SCODE like", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeNotLike(String value) {
            addCriterion("BW_SCODE not like", value, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeIn(List<String> values) {
            addCriterion("BW_SCODE in", values, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeNotIn(List<String> values) {
            addCriterion("BW_SCODE not in", values, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeBetween(String value1, String value2) {
            addCriterion("BW_SCODE between", value1, value2, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBwScodeNotBetween(String value1, String value2) {
            addCriterion("BW_SCODE not between", value1, value2, "bwScode");
            return (Criteria) this;
        }

        public Criteria andBkSidIsNull() {
            addCriterion("BK_SID is null");
            return (Criteria) this;
        }

        public Criteria andBkSidIsNotNull() {
            addCriterion("BK_SID is not null");
            return (Criteria) this;
        }

        public Criteria andBkSidEqualTo(Long value) {
            addCriterion("BK_SID =", value, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidNotEqualTo(Long value) {
            addCriterion("BK_SID <>", value, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidGreaterThan(Long value) {
            addCriterion("BK_SID >", value, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidGreaterThanOrEqualTo(Long value) {
            addCriterion("BK_SID >=", value, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidLessThan(Long value) {
            addCriterion("BK_SID <", value, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidLessThanOrEqualTo(Long value) {
            addCriterion("BK_SID <=", value, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidIn(List<Long> values) {
            addCriterion("BK_SID in", values, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidNotIn(List<Long> values) {
            addCriterion("BK_SID not in", values, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidBetween(Long value1, Long value2) {
            addCriterion("BK_SID between", value1, value2, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkSidNotBetween(Long value1, Long value2) {
            addCriterion("BK_SID not between", value1, value2, "bkSid");
            return (Criteria) this;
        }

        public Criteria andBkScodeIsNull() {
            addCriterion("BK_SCODE is null");
            return (Criteria) this;
        }

        public Criteria andBkScodeIsNotNull() {
            addCriterion("BK_SCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBkScodeEqualTo(String value) {
            addCriterion("BK_SCODE =", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeNotEqualTo(String value) {
            addCriterion("BK_SCODE <>", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeGreaterThan(String value) {
            addCriterion("BK_SCODE >", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeGreaterThanOrEqualTo(String value) {
            addCriterion("BK_SCODE >=", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeLessThan(String value) {
            addCriterion("BK_SCODE <", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeLessThanOrEqualTo(String value) {
            addCriterion("BK_SCODE <=", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeLike(String value) {
            addCriterion("BK_SCODE like", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeNotLike(String value) {
            addCriterion("BK_SCODE not like", value, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeIn(List<String> values) {
            addCriterion("BK_SCODE in", values, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeNotIn(List<String> values) {
            addCriterion("BK_SCODE not in", values, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeBetween(String value1, String value2) {
            addCriterion("BK_SCODE between", value1, value2, "bkScode");
            return (Criteria) this;
        }

        public Criteria andBkScodeNotBetween(String value1, String value2) {
            addCriterion("BK_SCODE not between", value1, value2, "bkScode");
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

        public Criteria andNickNameIsNull() {
            addCriterion("NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("NICK_NAME =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("NICK_NAME <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("NICK_NAME >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("NICK_NAME >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("NICK_NAME <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("NICK_NAME <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("NICK_NAME like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("NICK_NAME not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("NICK_NAME in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("NICK_NAME not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("NICK_NAME between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("NICK_NAME not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andHeadImgIsNull() {
            addCriterion("HEAD_IMG is null");
            return (Criteria) this;
        }

        public Criteria andHeadImgIsNotNull() {
            addCriterion("HEAD_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andHeadImgEqualTo(String value) {
            addCriterion("HEAD_IMG =", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotEqualTo(String value) {
            addCriterion("HEAD_IMG <>", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgGreaterThan(String value) {
            addCriterion("HEAD_IMG >", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("HEAD_IMG >=", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLessThan(String value) {
            addCriterion("HEAD_IMG <", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLessThanOrEqualTo(String value) {
            addCriterion("HEAD_IMG <=", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgLike(String value) {
            addCriterion("HEAD_IMG like", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotLike(String value) {
            addCriterion("HEAD_IMG not like", value, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgIn(List<String> values) {
            addCriterion("HEAD_IMG in", values, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotIn(List<String> values) {
            addCriterion("HEAD_IMG not in", values, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgBetween(String value1, String value2) {
            addCriterion("HEAD_IMG between", value1, value2, "headImg");
            return (Criteria) this;
        }

        public Criteria andHeadImgNotBetween(String value1, String value2) {
            addCriterion("HEAD_IMG not between", value1, value2, "headImg");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdIsNull() {
            addCriterion("EQUIP_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdIsNotNull() {
            addCriterion("EQUIP_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdEqualTo(Long value) {
            addCriterion("EQUIP_TYPE_ID =", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdNotEqualTo(Long value) {
            addCriterion("EQUIP_TYPE_ID <>", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdGreaterThan(Long value) {
            addCriterion("EQUIP_TYPE_ID >", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EQUIP_TYPE_ID >=", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdLessThan(Long value) {
            addCriterion("EQUIP_TYPE_ID <", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("EQUIP_TYPE_ID <=", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdIn(List<Long> values) {
            addCriterion("EQUIP_TYPE_ID in", values, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdNotIn(List<Long> values) {
            addCriterion("EQUIP_TYPE_ID not in", values, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdBetween(Long value1, Long value2) {
            addCriterion("EQUIP_TYPE_ID between", value1, value2, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("EQUIP_TYPE_ID not between", value1, value2, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeIsNull() {
            addCriterion("EQUIP_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeIsNotNull() {
            addCriterion("EQUIP_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeEqualTo(String value) {
            addCriterion("EQUIP_TYPE_CODE =", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeNotEqualTo(String value) {
            addCriterion("EQUIP_TYPE_CODE <>", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeGreaterThan(String value) {
            addCriterion("EQUIP_TYPE_CODE >", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIP_TYPE_CODE >=", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeLessThan(String value) {
            addCriterion("EQUIP_TYPE_CODE <", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("EQUIP_TYPE_CODE <=", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeLike(String value) {
            addCriterion("EQUIP_TYPE_CODE like", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeNotLike(String value) {
            addCriterion("EQUIP_TYPE_CODE not like", value, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeIn(List<String> values) {
            addCriterion("EQUIP_TYPE_CODE in", values, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeNotIn(List<String> values) {
            addCriterion("EQUIP_TYPE_CODE not in", values, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeBetween(String value1, String value2) {
            addCriterion("EQUIP_TYPE_CODE between", value1, value2, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCodeNotBetween(String value1, String value2) {
            addCriterion("EQUIP_TYPE_CODE not between", value1, value2, "equipTypeCode");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameIsNull() {
            addCriterion("EQUIP_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameIsNotNull() {
            addCriterion("EQUIP_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameEqualTo(String value) {
            addCriterion("EQUIP_TYPE_NAME =", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotEqualTo(String value) {
            addCriterion("EQUIP_TYPE_NAME <>", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameGreaterThan(String value) {
            addCriterion("EQUIP_TYPE_NAME >", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIP_TYPE_NAME >=", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameLessThan(String value) {
            addCriterion("EQUIP_TYPE_NAME <", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameLessThanOrEqualTo(String value) {
            addCriterion("EQUIP_TYPE_NAME <=", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameLike(String value) {
            addCriterion("EQUIP_TYPE_NAME like", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotLike(String value) {
            addCriterion("EQUIP_TYPE_NAME not like", value, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameIn(List<String> values) {
            addCriterion("EQUIP_TYPE_NAME in", values, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotIn(List<String> values) {
            addCriterion("EQUIP_TYPE_NAME not in", values, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameBetween(String value1, String value2) {
            addCriterion("EQUIP_TYPE_NAME between", value1, value2, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeNameNotBetween(String value1, String value2) {
            addCriterion("EQUIP_TYPE_NAME not between", value1, value2, "equipTypeName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumIsNull() {
            addCriterion("EQUIP_TYPE_CARDNUM is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumIsNotNull() {
            addCriterion("EQUIP_TYPE_CARDNUM is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_CARDNUM =", value, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumNotEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_CARDNUM <>", value, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumGreaterThan(Integer value) {
            addCriterion("EQUIP_TYPE_CARDNUM >", value, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_CARDNUM >=", value, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumLessThan(Integer value) {
            addCriterion("EQUIP_TYPE_CARDNUM <", value, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumLessThanOrEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_CARDNUM <=", value, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumIn(List<Integer> values) {
            addCriterion("EQUIP_TYPE_CARDNUM in", values, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumNotIn(List<Integer> values) {
            addCriterion("EQUIP_TYPE_CARDNUM not in", values, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumBetween(Integer value1, Integer value2) {
            addCriterion("EQUIP_TYPE_CARDNUM between", value1, value2, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeCardnumNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUIP_TYPE_CARDNUM not between", value1, value2, "equipTypeCardnum");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionIsNull() {
            addCriterion("EQUIP_TYPE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionIsNotNull() {
            addCriterion("EQUIP_TYPE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_VERSION =", value, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionNotEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_VERSION <>", value, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionGreaterThan(Integer value) {
            addCriterion("EQUIP_TYPE_VERSION >", value, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_VERSION >=", value, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionLessThan(Integer value) {
            addCriterion("EQUIP_TYPE_VERSION <", value, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionLessThanOrEqualTo(Integer value) {
            addCriterion("EQUIP_TYPE_VERSION <=", value, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionIn(List<Integer> values) {
            addCriterion("EQUIP_TYPE_VERSION in", values, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionNotIn(List<Integer> values) {
            addCriterion("EQUIP_TYPE_VERSION not in", values, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionBetween(Integer value1, Integer value2) {
            addCriterion("EQUIP_TYPE_VERSION between", value1, value2, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andEquipTypeVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUIP_TYPE_VERSION not between", value1, value2, "equipTypeVersion");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("M_ID is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("M_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Long value) {
            addCriterion("M_ID =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Long value) {
            addCriterion("M_ID <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Long value) {
            addCriterion("M_ID >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_ID >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Long value) {
            addCriterion("M_ID <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Long value) {
            addCriterion("M_ID <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Long> values) {
            addCriterion("M_ID in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Long> values) {
            addCriterion("M_ID not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Long value1, Long value2) {
            addCriterion("M_ID between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Long value1, Long value2) {
            addCriterion("M_ID not between", value1, value2, "mId");
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