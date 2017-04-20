package zh.base.entity;

import java.util.Date;

public class TArticle extends TArticleKey {
    private String articlename;

    private Date articletime;

    private String articleip;

    private Integer articleclick;

    private String articletype;

    private String articlemodle;

    private String articlesupport;

    private String articlecontent;

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename == null ? null : articlename.trim();
    }

    public Date getArticletime() {
        return articletime;
    }

    public void setArticletime(Date articletime) {
        this.articletime = articletime;
    }

    public String getArticleip() {
        return articleip;
    }

    public void setArticleip(String articleip) {
        this.articleip = articleip == null ? null : articleip.trim();
    }

    public Integer getArticleclick() {
        return articleclick;
    }

    public void setArticleclick(Integer articleclick) {
        this.articleclick = articleclick;
    }

    public String getArticletype() {
        return articletype;
    }

    public void setArticletype(String articletype) {
        this.articletype = articletype == null ? null : articletype.trim();
    }

    public String getArticlemodle() {
        return articlemodle;
    }

    public void setArticlemodle(String articlemodle) {
        this.articlemodle = articlemodle == null ? null : articlemodle.trim();
    }

    public String getArticlesupport() {
        return articlesupport;
    }

    public void setArticlesupport(String articlesupport) {
        this.articlesupport = articlesupport == null ? null : articlesupport.trim();
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }
}