package com.hxzy.pojo;

import java.util.Date;

public class Tb_instorage {
    private Integer id;

    private String ino;

    private Integer stockid;

    private Date createtime;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIno() {
        return ino;
    }

    public void setIno(String ino) {
        this.ino = ino == null ? null : ino.trim();
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}