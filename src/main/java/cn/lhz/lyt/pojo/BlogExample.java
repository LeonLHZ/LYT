package cn.lhz.lyt.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesIsNull() {
            addCriterion("blog_browse_times is null");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesIsNotNull() {
            addCriterion("blog_browse_times is not null");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesEqualTo(String value) {
            addCriterion("blog_browse_times =", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesNotEqualTo(String value) {
            addCriterion("blog_browse_times <>", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesGreaterThan(String value) {
            addCriterion("blog_browse_times >", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesGreaterThanOrEqualTo(String value) {
            addCriterion("blog_browse_times >=", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesLessThan(String value) {
            addCriterion("blog_browse_times <", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesLessThanOrEqualTo(String value) {
            addCriterion("blog_browse_times <=", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesLike(String value) {
            addCriterion("blog_browse_times like", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesNotLike(String value) {
            addCriterion("blog_browse_times not like", value, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesIn(List<String> values) {
            addCriterion("blog_browse_times in", values, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesNotIn(List<String> values) {
            addCriterion("blog_browse_times not in", values, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesBetween(String value1, String value2) {
            addCriterion("blog_browse_times between", value1, value2, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogBrowseTimesNotBetween(String value1, String value2) {
            addCriterion("blog_browse_times not between", value1, value2, "blogBrowseTimes");
            return (Criteria) this;
        }

        public Criteria andBlogTimeIsNull() {
            addCriterion("blog_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogTimeIsNotNull() {
            addCriterion("blog_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTimeEqualTo(String value) {
            addCriterion("blog_time =", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotEqualTo(String value) {
            addCriterion("blog_time <>", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeGreaterThan(String value) {
            addCriterion("blog_time >", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeGreaterThanOrEqualTo(String value) {
            addCriterion("blog_time >=", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeLessThan(String value) {
            addCriterion("blog_time <", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeLessThanOrEqualTo(String value) {
            addCriterion("blog_time <=", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeLike(String value) {
            addCriterion("blog_time like", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotLike(String value) {
            addCriterion("blog_time not like", value, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeIn(List<String> values) {
            addCriterion("blog_time in", values, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotIn(List<String> values) {
            addCriterion("blog_time not in", values, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeBetween(String value1, String value2) {
            addCriterion("blog_time between", value1, value2, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogTimeNotBetween(String value1, String value2) {
            addCriterion("blog_time not between", value1, value2, "blogTime");
            return (Criteria) this;
        }

        public Criteria andBlogPointsIsNull() {
            addCriterion("blog_points is null");
            return (Criteria) this;
        }

        public Criteria andBlogPointsIsNotNull() {
            addCriterion("blog_points is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPointsEqualTo(String value) {
            addCriterion("blog_points =", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsNotEqualTo(String value) {
            addCriterion("blog_points <>", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsGreaterThan(String value) {
            addCriterion("blog_points >", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsGreaterThanOrEqualTo(String value) {
            addCriterion("blog_points >=", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsLessThan(String value) {
            addCriterion("blog_points <", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsLessThanOrEqualTo(String value) {
            addCriterion("blog_points <=", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsLike(String value) {
            addCriterion("blog_points like", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsNotLike(String value) {
            addCriterion("blog_points not like", value, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsIn(List<String> values) {
            addCriterion("blog_points in", values, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsNotIn(List<String> values) {
            addCriterion("blog_points not in", values, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsBetween(String value1, String value2) {
            addCriterion("blog_points between", value1, value2, "blogPoints");
            return (Criteria) this;
        }

        public Criteria andBlogPointsNotBetween(String value1, String value2) {
            addCriterion("blog_points not between", value1, value2, "blogPoints");
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