package ydb.auxiliary.service.ydbauxiliaryservice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OPENID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OPENID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OPENID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OPENID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OPENID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OPENID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
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

        public Criteria andMGroupIsNull() {
            addCriterion("M_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andMGroupIsNotNull() {
            addCriterion("M_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andMGroupEqualTo(Integer value) {
            addCriterion("M_GROUP =", value, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupNotEqualTo(Integer value) {
            addCriterion("M_GROUP <>", value, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupGreaterThan(Integer value) {
            addCriterion("M_GROUP >", value, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("M_GROUP >=", value, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupLessThan(Integer value) {
            addCriterion("M_GROUP <", value, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupLessThanOrEqualTo(Integer value) {
            addCriterion("M_GROUP <=", value, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupIn(List<Integer> values) {
            addCriterion("M_GROUP in", values, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupNotIn(List<Integer> values) {
            addCriterion("M_GROUP not in", values, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupBetween(Integer value1, Integer value2) {
            addCriterion("M_GROUP between", value1, value2, "mGroup");
            return (Criteria) this;
        }

        public Criteria andMGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("M_GROUP not between", value1, value2, "mGroup");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNull() {
            addCriterion("ISRECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNotNull() {
            addCriterion("ISRECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveEqualTo(Integer value) {
            addCriterion("ISRECEIVE =", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotEqualTo(Integer value) {
            addCriterion("ISRECEIVE <>", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThan(Integer value) {
            addCriterion("ISRECEIVE >", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISRECEIVE >=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThan(Integer value) {
            addCriterion("ISRECEIVE <", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThanOrEqualTo(Integer value) {
            addCriterion("ISRECEIVE <=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIn(List<Integer> values) {
            addCriterion("ISRECEIVE in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotIn(List<Integer> values) {
            addCriterion("ISRECEIVE not in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveBetween(Integer value1, Integer value2) {
            addCriterion("ISRECEIVE between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotBetween(Integer value1, Integer value2) {
            addCriterion("ISRECEIVE not between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIswithdrawIsNull() {
            addCriterion("ISWITHDRAW is null");
            return (Criteria) this;
        }

        public Criteria andIswithdrawIsNotNull() {
            addCriterion("ISWITHDRAW is not null");
            return (Criteria) this;
        }

        public Criteria andIswithdrawEqualTo(Integer value) {
            addCriterion("ISWITHDRAW =", value, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawNotEqualTo(Integer value) {
            addCriterion("ISWITHDRAW <>", value, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawGreaterThan(Integer value) {
            addCriterion("ISWITHDRAW >", value, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISWITHDRAW >=", value, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawLessThan(Integer value) {
            addCriterion("ISWITHDRAW <", value, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawLessThanOrEqualTo(Integer value) {
            addCriterion("ISWITHDRAW <=", value, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawIn(List<Integer> values) {
            addCriterion("ISWITHDRAW in", values, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawNotIn(List<Integer> values) {
            addCriterion("ISWITHDRAW not in", values, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawBetween(Integer value1, Integer value2) {
            addCriterion("ISWITHDRAW between", value1, value2, "iswithdraw");
            return (Criteria) this;
        }

        public Criteria andIswithdrawNotBetween(Integer value1, Integer value2) {
            addCriterion("ISWITHDRAW not between", value1, value2, "iswithdraw");
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

        public Criteria andOpenidMpIsNull() {
            addCriterion("OPENID_MP is null");
            return (Criteria) this;
        }

        public Criteria andOpenidMpIsNotNull() {
            addCriterion("OPENID_MP is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidMpEqualTo(String value) {
            addCriterion("OPENID_MP =", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpNotEqualTo(String value) {
            addCriterion("OPENID_MP <>", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpGreaterThan(String value) {
            addCriterion("OPENID_MP >", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID_MP >=", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpLessThan(String value) {
            addCriterion("OPENID_MP <", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpLessThanOrEqualTo(String value) {
            addCriterion("OPENID_MP <=", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpLike(String value) {
            addCriterion("OPENID_MP like", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpNotLike(String value) {
            addCriterion("OPENID_MP not like", value, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpIn(List<String> values) {
            addCriterion("OPENID_MP in", values, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpNotIn(List<String> values) {
            addCriterion("OPENID_MP not in", values, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpBetween(String value1, String value2) {
            addCriterion("OPENID_MP between", value1, value2, "openidMp");
            return (Criteria) this;
        }

        public Criteria andOpenidMpNotBetween(String value1, String value2) {
            addCriterion("OPENID_MP not between", value1, value2, "openidMp");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("UNIONID is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("UNIONID is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("UNIONID =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("UNIONID <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("UNIONID >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("UNIONID >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("UNIONID <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("UNIONID <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("UNIONID like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("UNIONID not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("UNIONID in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("UNIONID not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("UNIONID between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("UNIONID not between", value1, value2, "unionid");
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