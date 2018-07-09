package com.hxzy.pojo;

import java.util.ArrayList;
import java.util.List;

public class Tb_userExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Tb_userExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andSetinstorageIsNull() {
            addCriterion("setInstorage is null");
            return (Criteria) this;
        }

        public Criteria andSetinstorageIsNotNull() {
            addCriterion("setInstorage is not null");
            return (Criteria) this;
        }

        public Criteria andSetinstorageEqualTo(Boolean value) {
            addCriterion("setInstorage =", value, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageNotEqualTo(Boolean value) {
            addCriterion("setInstorage <>", value, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageGreaterThan(Boolean value) {
            addCriterion("setInstorage >", value, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setInstorage >=", value, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageLessThan(Boolean value) {
            addCriterion("setInstorage <", value, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageLessThanOrEqualTo(Boolean value) {
            addCriterion("setInstorage <=", value, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageIn(List<Boolean> values) {
            addCriterion("setInstorage in", values, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageNotIn(List<Boolean> values) {
            addCriterion("setInstorage not in", values, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageBetween(Boolean value1, Boolean value2) {
            addCriterion("setInstorage between", value1, value2, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetinstorageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setInstorage not between", value1, value2, "setinstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageIsNull() {
            addCriterion("setOutstorage is null");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageIsNotNull() {
            addCriterion("setOutstorage is not null");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageEqualTo(Boolean value) {
            addCriterion("setOutstorage =", value, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageNotEqualTo(Boolean value) {
            addCriterion("setOutstorage <>", value, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageGreaterThan(Boolean value) {
            addCriterion("setOutstorage >", value, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setOutstorage >=", value, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageLessThan(Boolean value) {
            addCriterion("setOutstorage <", value, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageLessThanOrEqualTo(Boolean value) {
            addCriterion("setOutstorage <=", value, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageIn(List<Boolean> values) {
            addCriterion("setOutstorage in", values, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageNotIn(List<Boolean> values) {
            addCriterion("setOutstorage not in", values, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageBetween(Boolean value1, Boolean value2) {
            addCriterion("setOutstorage between", value1, value2, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetoutstorageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setOutstorage not between", value1, value2, "setoutstorage");
            return (Criteria) this;
        }

        public Criteria andSetdealIsNull() {
            addCriterion("setDeal is null");
            return (Criteria) this;
        }

        public Criteria andSetdealIsNotNull() {
            addCriterion("setDeal is not null");
            return (Criteria) this;
        }

        public Criteria andSetdealEqualTo(Boolean value) {
            addCriterion("setDeal =", value, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealNotEqualTo(Boolean value) {
            addCriterion("setDeal <>", value, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealGreaterThan(Boolean value) {
            addCriterion("setDeal >", value, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setDeal >=", value, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealLessThan(Boolean value) {
            addCriterion("setDeal <", value, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealLessThanOrEqualTo(Boolean value) {
            addCriterion("setDeal <=", value, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealIn(List<Boolean> values) {
            addCriterion("setDeal in", values, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealNotIn(List<Boolean> values) {
            addCriterion("setDeal not in", values, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealBetween(Boolean value1, Boolean value2) {
            addCriterion("setDeal between", value1, value2, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetdealNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setDeal not between", value1, value2, "setdeal");
            return (Criteria) this;
        }

        public Criteria andSetqueryIsNull() {
            addCriterion("setQuery is null");
            return (Criteria) this;
        }

        public Criteria andSetqueryIsNotNull() {
            addCriterion("setQuery is not null");
            return (Criteria) this;
        }

        public Criteria andSetqueryEqualTo(Boolean value) {
            addCriterion("setQuery =", value, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryNotEqualTo(Boolean value) {
            addCriterion("setQuery <>", value, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryGreaterThan(Boolean value) {
            addCriterion("setQuery >", value, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setQuery >=", value, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryLessThan(Boolean value) {
            addCriterion("setQuery <", value, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryLessThanOrEqualTo(Boolean value) {
            addCriterion("setQuery <=", value, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryIn(List<Boolean> values) {
            addCriterion("setQuery in", values, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryNotIn(List<Boolean> values) {
            addCriterion("setQuery not in", values, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryBetween(Boolean value1, Boolean value2) {
            addCriterion("setQuery between", value1, value2, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetqueryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setQuery not between", value1, value2, "setquery");
            return (Criteria) this;
        }

        public Criteria andSetbasicIsNull() {
            addCriterion("setBasic is null");
            return (Criteria) this;
        }

        public Criteria andSetbasicIsNotNull() {
            addCriterion("setBasic is not null");
            return (Criteria) this;
        }

        public Criteria andSetbasicEqualTo(Boolean value) {
            addCriterion("setBasic =", value, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicNotEqualTo(Boolean value) {
            addCriterion("setBasic <>", value, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicGreaterThan(Boolean value) {
            addCriterion("setBasic >", value, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setBasic >=", value, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicLessThan(Boolean value) {
            addCriterion("setBasic <", value, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicLessThanOrEqualTo(Boolean value) {
            addCriterion("setBasic <=", value, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicIn(List<Boolean> values) {
            addCriterion("setBasic in", values, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicNotIn(List<Boolean> values) {
            addCriterion("setBasic not in", values, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicBetween(Boolean value1, Boolean value2) {
            addCriterion("setBasic between", value1, value2, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetbasicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setBasic not between", value1, value2, "setbasic");
            return (Criteria) this;
        }

        public Criteria andSetsysIsNull() {
            addCriterion("setSys is null");
            return (Criteria) this;
        }

        public Criteria andSetsysIsNotNull() {
            addCriterion("setSys is not null");
            return (Criteria) this;
        }

        public Criteria andSetsysEqualTo(Boolean value) {
            addCriterion("setSys =", value, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysNotEqualTo(Boolean value) {
            addCriterion("setSys <>", value, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysGreaterThan(Boolean value) {
            addCriterion("setSys >", value, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysGreaterThanOrEqualTo(Boolean value) {
            addCriterion("setSys >=", value, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysLessThan(Boolean value) {
            addCriterion("setSys <", value, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysLessThanOrEqualTo(Boolean value) {
            addCriterion("setSys <=", value, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysIn(List<Boolean> values) {
            addCriterion("setSys in", values, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysNotIn(List<Boolean> values) {
            addCriterion("setSys not in", values, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysBetween(Boolean value1, Boolean value2) {
            addCriterion("setSys between", value1, value2, "setsys");
            return (Criteria) this;
        }

        public Criteria andSetsysNotBetween(Boolean value1, Boolean value2) {
            addCriterion("setSys not between", value1, value2, "setsys");
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