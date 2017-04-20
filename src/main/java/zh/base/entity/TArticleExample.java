package zh.base.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TArticleExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNull() {
            addCriterion("articlename is null");
            return (Criteria) this;
        }

        public Criteria andArticlenameIsNotNull() {
            addCriterion("articlename is not null");
            return (Criteria) this;
        }

        public Criteria andArticlenameEqualTo(String value) {
            addCriterion("articlename =", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotEqualTo(String value) {
            addCriterion("articlename <>", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThan(String value) {
            addCriterion("articlename >", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameGreaterThanOrEqualTo(String value) {
            addCriterion("articlename >=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThan(String value) {
            addCriterion("articlename <", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLessThanOrEqualTo(String value) {
            addCriterion("articlename <=", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameLike(String value) {
            addCriterion("articlename like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotLike(String value) {
            addCriterion("articlename not like", value, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameIn(List<String> values) {
            addCriterion("articlename in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotIn(List<String> values) {
            addCriterion("articlename not in", values, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameBetween(String value1, String value2) {
            addCriterion("articlename between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticlenameNotBetween(String value1, String value2) {
            addCriterion("articlename not between", value1, value2, "articlename");
            return (Criteria) this;
        }

        public Criteria andArticletimeIsNull() {
            addCriterion("articletime is null");
            return (Criteria) this;
        }

        public Criteria andArticletimeIsNotNull() {
            addCriterion("articletime is not null");
            return (Criteria) this;
        }

        public Criteria andArticletimeEqualTo(Date value) {
            addCriterion("articletime =", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeNotEqualTo(Date value) {
            addCriterion("articletime <>", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeGreaterThan(Date value) {
            addCriterion("articletime >", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("articletime >=", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeLessThan(Date value) {
            addCriterion("articletime <", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeLessThanOrEqualTo(Date value) {
            addCriterion("articletime <=", value, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeIn(List<Date> values) {
            addCriterion("articletime in", values, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeNotIn(List<Date> values) {
            addCriterion("articletime not in", values, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeBetween(Date value1, Date value2) {
            addCriterion("articletime between", value1, value2, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticletimeNotBetween(Date value1, Date value2) {
            addCriterion("articletime not between", value1, value2, "articletime");
            return (Criteria) this;
        }

        public Criteria andArticleipIsNull() {
            addCriterion("articleip is null");
            return (Criteria) this;
        }

        public Criteria andArticleipIsNotNull() {
            addCriterion("articleip is not null");
            return (Criteria) this;
        }

        public Criteria andArticleipEqualTo(String value) {
            addCriterion("articleip =", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipNotEqualTo(String value) {
            addCriterion("articleip <>", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipGreaterThan(String value) {
            addCriterion("articleip >", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipGreaterThanOrEqualTo(String value) {
            addCriterion("articleip >=", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipLessThan(String value) {
            addCriterion("articleip <", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipLessThanOrEqualTo(String value) {
            addCriterion("articleip <=", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipLike(String value) {
            addCriterion("articleip like", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipNotLike(String value) {
            addCriterion("articleip not like", value, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipIn(List<String> values) {
            addCriterion("articleip in", values, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipNotIn(List<String> values) {
            addCriterion("articleip not in", values, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipBetween(String value1, String value2) {
            addCriterion("articleip between", value1, value2, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleipNotBetween(String value1, String value2) {
            addCriterion("articleip not between", value1, value2, "articleip");
            return (Criteria) this;
        }

        public Criteria andArticleclickIsNull() {
            addCriterion("articleclick is null");
            return (Criteria) this;
        }

        public Criteria andArticleclickIsNotNull() {
            addCriterion("articleclick is not null");
            return (Criteria) this;
        }

        public Criteria andArticleclickEqualTo(Integer value) {
            addCriterion("articleclick =", value, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickNotEqualTo(Integer value) {
            addCriterion("articleclick <>", value, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickGreaterThan(Integer value) {
            addCriterion("articleclick >", value, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleclick >=", value, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickLessThan(Integer value) {
            addCriterion("articleclick <", value, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickLessThanOrEqualTo(Integer value) {
            addCriterion("articleclick <=", value, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickIn(List<Integer> values) {
            addCriterion("articleclick in", values, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickNotIn(List<Integer> values) {
            addCriterion("articleclick not in", values, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickBetween(Integer value1, Integer value2) {
            addCriterion("articleclick between", value1, value2, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticleclickNotBetween(Integer value1, Integer value2) {
            addCriterion("articleclick not between", value1, value2, "articleclick");
            return (Criteria) this;
        }

        public Criteria andArticletypeIsNull() {
            addCriterion("articletype is null");
            return (Criteria) this;
        }

        public Criteria andArticletypeIsNotNull() {
            addCriterion("articletype is not null");
            return (Criteria) this;
        }

        public Criteria andArticletypeEqualTo(String value) {
            addCriterion("articletype =", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotEqualTo(String value) {
            addCriterion("articletype <>", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThan(String value) {
            addCriterion("articletype >", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThanOrEqualTo(String value) {
            addCriterion("articletype >=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThan(String value) {
            addCriterion("articletype <", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThanOrEqualTo(String value) {
            addCriterion("articletype <=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLike(String value) {
            addCriterion("articletype like", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotLike(String value) {
            addCriterion("articletype not like", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeIn(List<String> values) {
            addCriterion("articletype in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotIn(List<String> values) {
            addCriterion("articletype not in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeBetween(String value1, String value2) {
            addCriterion("articletype between", value1, value2, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotBetween(String value1, String value2) {
            addCriterion("articletype not between", value1, value2, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticlemodleIsNull() {
            addCriterion("articlemodle is null");
            return (Criteria) this;
        }

        public Criteria andArticlemodleIsNotNull() {
            addCriterion("articlemodle is not null");
            return (Criteria) this;
        }

        public Criteria andArticlemodleEqualTo(String value) {
            addCriterion("articlemodle =", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleNotEqualTo(String value) {
            addCriterion("articlemodle <>", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleGreaterThan(String value) {
            addCriterion("articlemodle >", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleGreaterThanOrEqualTo(String value) {
            addCriterion("articlemodle >=", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleLessThan(String value) {
            addCriterion("articlemodle <", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleLessThanOrEqualTo(String value) {
            addCriterion("articlemodle <=", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleLike(String value) {
            addCriterion("articlemodle like", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleNotLike(String value) {
            addCriterion("articlemodle not like", value, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleIn(List<String> values) {
            addCriterion("articlemodle in", values, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleNotIn(List<String> values) {
            addCriterion("articlemodle not in", values, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleBetween(String value1, String value2) {
            addCriterion("articlemodle between", value1, value2, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlemodleNotBetween(String value1, String value2) {
            addCriterion("articlemodle not between", value1, value2, "articlemodle");
            return (Criteria) this;
        }

        public Criteria andArticlesupportIsNull() {
            addCriterion("articlesupport is null");
            return (Criteria) this;
        }

        public Criteria andArticlesupportIsNotNull() {
            addCriterion("articlesupport is not null");
            return (Criteria) this;
        }

        public Criteria andArticlesupportEqualTo(String value) {
            addCriterion("articlesupport =", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportNotEqualTo(String value) {
            addCriterion("articlesupport <>", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportGreaterThan(String value) {
            addCriterion("articlesupport >", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportGreaterThanOrEqualTo(String value) {
            addCriterion("articlesupport >=", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportLessThan(String value) {
            addCriterion("articlesupport <", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportLessThanOrEqualTo(String value) {
            addCriterion("articlesupport <=", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportLike(String value) {
            addCriterion("articlesupport like", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportNotLike(String value) {
            addCriterion("articlesupport not like", value, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportIn(List<String> values) {
            addCriterion("articlesupport in", values, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportNotIn(List<String> values) {
            addCriterion("articlesupport not in", values, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportBetween(String value1, String value2) {
            addCriterion("articlesupport between", value1, value2, "articlesupport");
            return (Criteria) this;
        }

        public Criteria andArticlesupportNotBetween(String value1, String value2) {
            addCriterion("articlesupport not between", value1, value2, "articlesupport");
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