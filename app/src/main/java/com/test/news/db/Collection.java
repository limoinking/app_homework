package com.test.news.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Index;

import java.io.Serializable;

// TODO:收藏 
@Entity
public class Collection implements Serializable {

    private static final long serialVersionUID = -3206065828593806735L;
    @Id(autoincrement = true)//设置自增长
    private Long id;
    @Index(unique = true)//设置唯一性
    private String title;
    private String pic;
    private String url;
    private String date;

    @Generated(hash = 865571322)
    public Collection(Long id, String title, String pic, String url, String date) {
        this.id = id;
        this.title = title;
        this.pic = pic;
        this.url = url;
        this.date = date;
    }
    @Generated(hash = 1149123052)
    public Collection() {
    }

    public Collection(String title, String pic, String url, String date) {
        this.title = title;
        this.pic = pic;
        this.url = url;
        this.date = date;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPic() {
        return this.pic;
    }
    public void setPic(String pic) {
        this.pic = pic;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
}
