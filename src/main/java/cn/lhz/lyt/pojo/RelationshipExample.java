package cn.lhz.lyt.pojo;

import java.util.ArrayList;
import java.util.List;

public class RelationshipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RelationshipExample() {
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

        public Criteria andRelationshipAidIsNull() {
            addCriterion("relationship_aid is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidIsNotNull() {
            addCriterion("relationship_aid is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidEqualTo(String value) {
            addCriterion("relationship_aid =", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidNotEqualTo(String value) {
            addCriterion("relationship_aid <>", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidGreaterThan(String value) {
            addCriterion("relationship_aid >", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_aid >=", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidLessThan(String value) {
            addCriterion("relationship_aid <", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidLessThanOrEqualTo(String value) {
            addCriterion("relationship_aid <=", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidLike(String value) {
            addCriterion("relationship_aid like", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidNotLike(String value) {
            addCriterion("relationship_aid not like", value, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidIn(List<String> values) {
            addCriterion("relationship_aid in", values, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidNotIn(List<String> values) {
            addCriterion("relationship_aid not in", values, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidBetween(String value1, String value2) {
            addCriterion("relationship_aid between", value1, value2, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipAidNotBetween(String value1, String value2) {
            addCriterion("relationship_aid not between", value1, value2, "relationshipAid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidIsNull() {
            addCriterion("relationship_bid is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidIsNotNull() {
            addCriterion("relationship_bid is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidEqualTo(String value) {
            addCriterion("relationship_bid =", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidNotEqualTo(String value) {
            addCriterion("relationship_bid <>", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidGreaterThan(String value) {
            addCriterion("relationship_bid >", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_bid >=", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidLessThan(String value) {
            addCriterion("relationship_bid <", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidLessThanOrEqualTo(String value) {
            addCriterion("relationship_bid <=", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidLike(String value) {
            addCriterion("relationship_bid like", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidNotLike(String value) {
            addCriterion("relationship_bid not like", value, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidIn(List<String> values) {
            addCriterion("relationship_bid in", values, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidNotIn(List<String> values) {
            addCriterion("relationship_bid not in", values, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidBetween(String value1, String value2) {
            addCriterion("relationship_bid between", value1, value2, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipBidNotBetween(String value1, String value2) {
            addCriterion("relationship_bid not between", value1, value2, "relationshipBid");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeIsNull() {
            addCriterion("relationship_type is null");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeIsNotNull() {
            addCriterion("relationship_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeEqualTo(String value) {
            addCriterion("relationship_type =", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeNotEqualTo(String value) {
            addCriterion("relationship_type <>", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeGreaterThan(String value) {
            addCriterion("relationship_type >", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("relationship_type >=", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeLessThan(String value) {
            addCriterion("relationship_type <", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeLessThanOrEqualTo(String value) {
            addCriterion("relationship_type <=", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeLike(String value) {
            addCriterion("relationship_type like", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeNotLike(String value) {
            addCriterion("relationship_type not like", value, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeIn(List<String> values) {
            addCriterion("relationship_type in", values, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeNotIn(List<String> values) {
            addCriterion("relationship_type not in", values, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeBetween(String value1, String value2) {
            addCriterion("relationship_type between", value1, value2, "relationshipType");
            return (Criteria) this;
        }

        public Criteria andRelationshipTypeNotBetween(String value1, String value2) {
            addCriterion("relationship_type not between", value1, value2, "relationshipType");
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