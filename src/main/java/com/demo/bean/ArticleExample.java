package com.demo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleViewsIsNull() {
            addCriterion("article_views is null");
            return (Criteria) this;
        }

        public Criteria andArticleViewsIsNotNull() {
            addCriterion("article_views is not null");
            return (Criteria) this;
        }

        public Criteria andArticleViewsEqualTo(Integer value) {
            addCriterion("article_views =", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsNotEqualTo(Integer value) {
            addCriterion("article_views <>", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsGreaterThan(Integer value) {
            addCriterion("article_views >", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_views >=", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsLessThan(Integer value) {
            addCriterion("article_views <", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsLessThanOrEqualTo(Integer value) {
            addCriterion("article_views <=", value, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsIn(List<Integer> values) {
            addCriterion("article_views in", values, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsNotIn(List<Integer> values) {
            addCriterion("article_views not in", values, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsBetween(Integer value1, Integer value2) {
            addCriterion("article_views between", value1, value2, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("article_views not between", value1, value2, "articleViews");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIsNull() {
            addCriterion("article_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIsNotNull() {
            addCriterion("article_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountEqualTo(Integer value) {
            addCriterion("article_comment_count =", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotEqualTo(Integer value) {
            addCriterion("article_comment_count <>", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountGreaterThan(Integer value) {
            addCriterion("article_comment_count >", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment_count >=", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountLessThan(Integer value) {
            addCriterion("article_comment_count <", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment_count <=", value, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountIn(List<Integer> values) {
            addCriterion("article_comment_count in", values, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotIn(List<Integer> values) {
            addCriterion("article_comment_count not in", values, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_count between", value1, value2, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment_count not between", value1, value2, "articleCommentCount");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNull() {
            addCriterion("article_date is null");
            return (Criteria) this;
        }

        public Criteria andArticleDateIsNotNull() {
            addCriterion("article_date is not null");
            return (Criteria) this;
        }

        public Criteria andArticleDateEqualTo(Date value) {
            addCriterion("article_date =", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotEqualTo(Date value) {
            addCriterion("article_date <>", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThan(Date value) {
            addCriterion("article_date >", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("article_date >=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThan(Date value) {
            addCriterion("article_date <", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateLessThanOrEqualTo(Date value) {
            addCriterion("article_date <=", value, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateIn(List<Date> values) {
            addCriterion("article_date in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotIn(List<Date> values) {
            addCriterion("article_date not in", values, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateBetween(Date value1, Date value2) {
            addCriterion("article_date between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleDateNotBetween(Date value1, Date value2) {
            addCriterion("article_date not between", value1, value2, "articleDate");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountIsNull() {
            addCriterion("article_like_count is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountIsNotNull() {
            addCriterion("article_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountEqualTo(Integer value) {
            addCriterion("article_like_count =", value, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountNotEqualTo(Integer value) {
            addCriterion("article_like_count <>", value, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountGreaterThan(Integer value) {
            addCriterion("article_like_count >", value, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_like_count >=", value, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountLessThan(Integer value) {
            addCriterion("article_like_count <", value, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("article_like_count <=", value, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountIn(List<Integer> values) {
            addCriterion("article_like_count in", values, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountNotIn(List<Integer> values) {
            addCriterion("article_like_count not in", values, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("article_like_count between", value1, value2, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andArticleLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("article_like_count not between", value1, value2, "articleLikeCount");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("sort_id is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("sort_id =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("sort_id <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("sort_id >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_id >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("sort_id <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("sort_id <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("sort_id in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("sort_id not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("sort_id between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_id not between", value1, value2, "sortId");
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