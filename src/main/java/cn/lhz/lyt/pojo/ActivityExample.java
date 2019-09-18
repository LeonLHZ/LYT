package cn.lhz.lyt.pojo;

import java.util.ArrayList;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("activity_id like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("activity_id not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityUserIsNull() {
            addCriterion("activity_user is null");
            return (Criteria) this;
        }

        public Criteria andActivityUserIsNotNull() {
            addCriterion("activity_user is not null");
            return (Criteria) this;
        }

        public Criteria andActivityUserEqualTo(String value) {
            addCriterion("activity_user =", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotEqualTo(String value) {
            addCriterion("activity_user <>", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserGreaterThan(String value) {
            addCriterion("activity_user >", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserGreaterThanOrEqualTo(String value) {
            addCriterion("activity_user >=", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserLessThan(String value) {
            addCriterion("activity_user <", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserLessThanOrEqualTo(String value) {
            addCriterion("activity_user <=", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserLike(String value) {
            addCriterion("activity_user like", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotLike(String value) {
            addCriterion("activity_user not like", value, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserIn(List<String> values) {
            addCriterion("activity_user in", values, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotIn(List<String> values) {
            addCriterion("activity_user not in", values, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserBetween(String value1, String value2) {
            addCriterion("activity_user between", value1, value2, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityUserNotBetween(String value1, String value2) {
            addCriterion("activity_user not between", value1, value2, "activityUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserIsNull() {
            addCriterion("activity_to_user is null");
            return (Criteria) this;
        }

        public Criteria andActivityToUserIsNotNull() {
            addCriterion("activity_to_user is not null");
            return (Criteria) this;
        }

        public Criteria andActivityToUserEqualTo(String value) {
            addCriterion("activity_to_user =", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserNotEqualTo(String value) {
            addCriterion("activity_to_user <>", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserGreaterThan(String value) {
            addCriterion("activity_to_user >", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserGreaterThanOrEqualTo(String value) {
            addCriterion("activity_to_user >=", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserLessThan(String value) {
            addCriterion("activity_to_user <", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserLessThanOrEqualTo(String value) {
            addCriterion("activity_to_user <=", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserLike(String value) {
            addCriterion("activity_to_user like", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserNotLike(String value) {
            addCriterion("activity_to_user not like", value, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserIn(List<String> values) {
            addCriterion("activity_to_user in", values, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserNotIn(List<String> values) {
            addCriterion("activity_to_user not in", values, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserBetween(String value1, String value2) {
            addCriterion("activity_to_user between", value1, value2, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityToUserNotBetween(String value1, String value2) {
            addCriterion("activity_to_user not between", value1, value2, "activityToUser");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNull() {
            addCriterion("activity_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIsNotNull() {
            addCriterion("activity_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTimeEqualTo(String value) {
            addCriterion("activity_time =", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotEqualTo(String value) {
            addCriterion("activity_time <>", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThan(String value) {
            addCriterion("activity_time >", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_time >=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThan(String value) {
            addCriterion("activity_time <", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLessThanOrEqualTo(String value) {
            addCriterion("activity_time <=", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeLike(String value) {
            addCriterion("activity_time like", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotLike(String value) {
            addCriterion("activity_time not like", value, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeIn(List<String> values) {
            addCriterion("activity_time in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotIn(List<String> values) {
            addCriterion("activity_time not in", values, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeBetween(String value1, String value2) {
            addCriterion("activity_time between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityTimeNotBetween(String value1, String value2) {
            addCriterion("activity_time not between", value1, value2, "activityTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeIsNull() {
            addCriterion("activity_part_time is null");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeIsNotNull() {
            addCriterion("activity_part_time is not null");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeEqualTo(String value) {
            addCriterion("activity_part_time =", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeNotEqualTo(String value) {
            addCriterion("activity_part_time <>", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeGreaterThan(String value) {
            addCriterion("activity_part_time >", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("activity_part_time >=", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeLessThan(String value) {
            addCriterion("activity_part_time <", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeLessThanOrEqualTo(String value) {
            addCriterion("activity_part_time <=", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeLike(String value) {
            addCriterion("activity_part_time like", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeNotLike(String value) {
            addCriterion("activity_part_time not like", value, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeIn(List<String> values) {
            addCriterion("activity_part_time in", values, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeNotIn(List<String> values) {
            addCriterion("activity_part_time not in", values, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeBetween(String value1, String value2) {
            addCriterion("activity_part_time between", value1, value2, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityPartTimeNotBetween(String value1, String value2) {
            addCriterion("activity_part_time not between", value1, value2, "activityPartTime");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNull() {
            addCriterion("activity_state is null");
            return (Criteria) this;
        }

        public Criteria andActivityStateIsNotNull() {
            addCriterion("activity_state is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStateEqualTo(String value) {
            addCriterion("activity_state =", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotEqualTo(String value) {
            addCriterion("activity_state <>", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThan(String value) {
            addCriterion("activity_state >", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateGreaterThanOrEqualTo(String value) {
            addCriterion("activity_state >=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThan(String value) {
            addCriterion("activity_state <", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLessThanOrEqualTo(String value) {
            addCriterion("activity_state <=", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateLike(String value) {
            addCriterion("activity_state like", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotLike(String value) {
            addCriterion("activity_state not like", value, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateIn(List<String> values) {
            addCriterion("activity_state in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotIn(List<String> values) {
            addCriterion("activity_state not in", values, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateBetween(String value1, String value2) {
            addCriterion("activity_state between", value1, value2, "activityState");
            return (Criteria) this;
        }

        public Criteria andActivityStateNotBetween(String value1, String value2) {
            addCriterion("activity_state not between", value1, value2, "activityState");
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