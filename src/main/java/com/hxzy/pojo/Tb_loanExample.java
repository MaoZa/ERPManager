package com.hxzy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tb_loanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_loanExample() {
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

        public Criteria andLnoIsNull() {
            addCriterion("lno is null");
            return (Criteria) this;
        }

        public Criteria andLnoIsNotNull() {
            addCriterion("lno is not null");
            return (Criteria) this;
        }

        public Criteria andLnoEqualTo(String value) {
            addCriterion("lno =", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoNotEqualTo(String value) {
            addCriterion("lno <>", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoGreaterThan(String value) {
            addCriterion("lno >", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoGreaterThanOrEqualTo(String value) {
            addCriterion("lno >=", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoLessThan(String value) {
            addCriterion("lno <", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoLessThanOrEqualTo(String value) {
            addCriterion("lno <=", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoLike(String value) {
            addCriterion("lno like", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoNotLike(String value) {
            addCriterion("lno not like", value, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoIn(List<String> values) {
            addCriterion("lno in", values, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoNotIn(List<String> values) {
            addCriterion("lno not in", values, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoBetween(String value1, String value2) {
            addCriterion("lno between", value1, value2, "lno");
            return (Criteria) this;
        }

        public Criteria andLnoNotBetween(String value1, String value2) {
            addCriterion("lno not between", value1, value2, "lno");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNull() {
            addCriterion("goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("principal like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("principal not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonIsNull() {
            addCriterion("borrowperson is null");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonIsNotNull() {
            addCriterion("borrowperson is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonEqualTo(String value) {
            addCriterion("borrowperson =", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonNotEqualTo(String value) {
            addCriterion("borrowperson <>", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonGreaterThan(String value) {
            addCriterion("borrowperson >", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonGreaterThanOrEqualTo(String value) {
            addCriterion("borrowperson >=", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonLessThan(String value) {
            addCriterion("borrowperson <", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonLessThanOrEqualTo(String value) {
            addCriterion("borrowperson <=", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonLike(String value) {
            addCriterion("borrowperson like", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonNotLike(String value) {
            addCriterion("borrowperson not like", value, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonIn(List<String> values) {
            addCriterion("borrowperson in", values, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonNotIn(List<String> values) {
            addCriterion("borrowperson not in", values, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonBetween(String value1, String value2) {
            addCriterion("borrowperson between", value1, value2, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBorrowpersonNotBetween(String value1, String value2) {
            addCriterion("borrowperson not between", value1, value2, "borrowperson");
            return (Criteria) this;
        }

        public Criteria andBtelIsNull() {
            addCriterion("btel is null");
            return (Criteria) this;
        }

        public Criteria andBtelIsNotNull() {
            addCriterion("btel is not null");
            return (Criteria) this;
        }

        public Criteria andBtelEqualTo(String value) {
            addCriterion("btel =", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotEqualTo(String value) {
            addCriterion("btel <>", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelGreaterThan(String value) {
            addCriterion("btel >", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelGreaterThanOrEqualTo(String value) {
            addCriterion("btel >=", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelLessThan(String value) {
            addCriterion("btel <", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelLessThanOrEqualTo(String value) {
            addCriterion("btel <=", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelLike(String value) {
            addCriterion("btel like", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotLike(String value) {
            addCriterion("btel not like", value, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelIn(List<String> values) {
            addCriterion("btel in", values, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotIn(List<String> values) {
            addCriterion("btel not in", values, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelBetween(String value1, String value2) {
            addCriterion("btel between", value1, value2, "btel");
            return (Criteria) this;
        }

        public Criteria andBtelNotBetween(String value1, String value2) {
            addCriterion("btel not between", value1, value2, "btel");
            return (Criteria) this;
        }

        public Criteria andBunitIsNull() {
            addCriterion("bunit is null");
            return (Criteria) this;
        }

        public Criteria andBunitIsNotNull() {
            addCriterion("bunit is not null");
            return (Criteria) this;
        }

        public Criteria andBunitEqualTo(String value) {
            addCriterion("bunit =", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitNotEqualTo(String value) {
            addCriterion("bunit <>", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitGreaterThan(String value) {
            addCriterion("bunit >", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitGreaterThanOrEqualTo(String value) {
            addCriterion("bunit >=", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitLessThan(String value) {
            addCriterion("bunit <", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitLessThanOrEqualTo(String value) {
            addCriterion("bunit <=", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitLike(String value) {
            addCriterion("bunit like", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitNotLike(String value) {
            addCriterion("bunit not like", value, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitIn(List<String> values) {
            addCriterion("bunit in", values, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitNotIn(List<String> values) {
            addCriterion("bunit not in", values, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitBetween(String value1, String value2) {
            addCriterion("bunit between", value1, value2, "bunit");
            return (Criteria) this;
        }

        public Criteria andBunitNotBetween(String value1, String value2) {
            addCriterion("bunit not between", value1, value2, "bunit");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andTasterIsNull() {
            addCriterion("taster is null");
            return (Criteria) this;
        }

        public Criteria andTasterIsNotNull() {
            addCriterion("taster is not null");
            return (Criteria) this;
        }

        public Criteria andTasterEqualTo(String value) {
            addCriterion("taster =", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterNotEqualTo(String value) {
            addCriterion("taster <>", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterGreaterThan(String value) {
            addCriterion("taster >", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterGreaterThanOrEqualTo(String value) {
            addCriterion("taster >=", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterLessThan(String value) {
            addCriterion("taster <", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterLessThanOrEqualTo(String value) {
            addCriterion("taster <=", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterLike(String value) {
            addCriterion("taster like", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterNotLike(String value) {
            addCriterion("taster not like", value, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterIn(List<String> values) {
            addCriterion("taster in", values, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterNotIn(List<String> values) {
            addCriterion("taster not in", values, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterBetween(String value1, String value2) {
            addCriterion("taster between", value1, value2, "taster");
            return (Criteria) this;
        }

        public Criteria andTasterNotBetween(String value1, String value2) {
            addCriterion("taster not between", value1, value2, "taster");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNull() {
            addCriterion("approvetime is null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIsNotNull() {
            addCriterion("approvetime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovetimeEqualTo(Date value) {
            addCriterion("approvetime =", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotEqualTo(Date value) {
            addCriterion("approvetime <>", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThan(Date value) {
            addCriterion("approvetime >", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("approvetime >=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThan(Date value) {
            addCriterion("approvetime <", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeLessThanOrEqualTo(Date value) {
            addCriterion("approvetime <=", value, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeIn(List<Date> values) {
            addCriterion("approvetime in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotIn(List<Date> values) {
            addCriterion("approvetime not in", values, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeBetween(Date value1, Date value2) {
            addCriterion("approvetime between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andApprovetimeNotBetween(Date value1, Date value2) {
            addCriterion("approvetime not between", value1, value2, "approvetime");
            return (Criteria) this;
        }

        public Criteria andBackpersonIsNull() {
            addCriterion("backperson is null");
            return (Criteria) this;
        }

        public Criteria andBackpersonIsNotNull() {
            addCriterion("backperson is not null");
            return (Criteria) this;
        }

        public Criteria andBackpersonEqualTo(String value) {
            addCriterion("backperson =", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonNotEqualTo(String value) {
            addCriterion("backperson <>", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonGreaterThan(String value) {
            addCriterion("backperson >", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonGreaterThanOrEqualTo(String value) {
            addCriterion("backperson >=", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonLessThan(String value) {
            addCriterion("backperson <", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonLessThanOrEqualTo(String value) {
            addCriterion("backperson <=", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonLike(String value) {
            addCriterion("backperson like", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonNotLike(String value) {
            addCriterion("backperson not like", value, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonIn(List<String> values) {
            addCriterion("backperson in", values, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonNotIn(List<String> values) {
            addCriterion("backperson not in", values, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonBetween(String value1, String value2) {
            addCriterion("backperson between", value1, value2, "backperson");
            return (Criteria) this;
        }

        public Criteria andBackpersonNotBetween(String value1, String value2) {
            addCriterion("backperson not between", value1, value2, "backperson");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNull() {
            addCriterion("backtime is null");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNotNull() {
            addCriterion("backtime is not null");
            return (Criteria) this;
        }

        public Criteria andBacktimeEqualTo(Date value) {
            addCriterion("backtime =", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotEqualTo(Date value) {
            addCriterion("backtime <>", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThan(Date value) {
            addCriterion("backtime >", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("backtime >=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThan(Date value) {
            addCriterion("backtime <", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThanOrEqualTo(Date value) {
            addCriterion("backtime <=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeIn(List<Date> values) {
            addCriterion("backtime in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotIn(List<Date> values) {
            addCriterion("backtime not in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeBetween(Date value1, Date value2) {
            addCriterion("backtime between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotBetween(Date value1, Date value2) {
            addCriterion("backtime not between", value1, value2, "backtime");
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