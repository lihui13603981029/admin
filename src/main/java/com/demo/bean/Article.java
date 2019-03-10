package com.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Integer articleId;

    private Integer userId;

    private Integer articleViews;

    private Integer articleCommentCount;

    private Date articleDate;

    private Integer articleLikeCount;

    private Integer sortId;

    private static final long serialVersionUID = 1L;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Integer articleViews) {
        this.articleViews = articleViews;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Article other = (Article) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getArticleViews() == null ? other.getArticleViews() == null : this.getArticleViews().equals(other.getArticleViews()))
            && (this.getArticleCommentCount() == null ? other.getArticleCommentCount() == null : this.getArticleCommentCount().equals(other.getArticleCommentCount()))
            && (this.getArticleDate() == null ? other.getArticleDate() == null : this.getArticleDate().equals(other.getArticleDate()))
            && (this.getArticleLikeCount() == null ? other.getArticleLikeCount() == null : this.getArticleLikeCount().equals(other.getArticleLikeCount()))
            && (this.getSortId() == null ? other.getSortId() == null : this.getSortId().equals(other.getSortId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getArticleViews() == null) ? 0 : getArticleViews().hashCode());
        result = prime * result + ((getArticleCommentCount() == null) ? 0 : getArticleCommentCount().hashCode());
        result = prime * result + ((getArticleDate() == null) ? 0 : getArticleDate().hashCode());
        result = prime * result + ((getArticleLikeCount() == null) ? 0 : getArticleLikeCount().hashCode());
        result = prime * result + ((getSortId() == null) ? 0 : getSortId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", userId=").append(userId);
        sb.append(", articleViews=").append(articleViews);
        sb.append(", articleCommentCount=").append(articleCommentCount);
        sb.append(", articleDate=").append(articleDate);
        sb.append(", articleLikeCount=").append(articleLikeCount);
        sb.append(", sortId=").append(sortId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}