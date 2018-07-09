package com.hxzy.pojo;

import java.util.Date;

public class Tb_damage {
    private Integer id;

    private Integer branchid;

    private Integer goodsid;

    private Integer damagenum;

    private Date createtime;

    private String principal;

    private String username;

    private String cause;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBranchid() {
        return branchid;
    }

    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getDamagenum() {
        return damagenum;
    }

    public void setDamagenum(Integer damagenum) {
        this.damagenum = damagenum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }
}