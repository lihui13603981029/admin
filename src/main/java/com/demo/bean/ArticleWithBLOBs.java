package com.demo.bean;

import java.io.Serializable;

public class ArticleWithBLOBs extends Article implements Serializable {
    private String articleTitle;

    private String articleContent;

    private String articleText;

    private static final long serialVersionUID = 1L;

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText == null ? null : articleText.trim();
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
        ArticleWithBLOBs other = (ArticleWithBLOBs) that;
        return (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getArticleViews() == null ? other.getArticleViews() == null : this.getArticleViews().equals(other.getArticleViews()))
            && (this.getArticleCommentCount() == null ? other.getArticleCommentCount() == null : this.getArticleCommentCount().equals(other.getArticleCommentCount()))
            && (this.getArticleDate() == null ? other.getArticleDate() == null : this.getArticleDate().equals(other.getArticleDate()))
            && (this.getArticleLikeCount() == null ? other.getArticleLikeCount() == null : this.getArticleLikeCount().equals(other.getArticleLikeCount()))
            && (this.getSortId() == null ? other.getSortId() == null : this.getSortId().equals(other.getSortId()))
            && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
            && (this.getArticleContent() == null ? other.getArticleContent() == null : this.getArticleContent().equals(other.getArticleContent()))
            && (this.getArticleText() == null ? other.getArticleText() == null : this.getArticleText().equals(other.getArticleText()));
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
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getArticleContent() == null) ? 0 : getArticleContent().hashCode());
        result = prime * result + ((getArticleText() == null) ? 0 : getArticleText().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleContent=").append(articleContent);
        sb.append(", articleText=").append(articleText);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}