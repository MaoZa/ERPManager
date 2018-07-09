package com.hxzy.pojo;

import java.util.Date;

public class Tb_loan {
    private Integer id;

    private String lno;

    private Integer goodsid;

    private Integer number;

    private String username;

    private String principal;

    private String borrowperson;

    private String btel;

    private String bunit;

    private Date createtime;

    private Short state;

    private String taster;

    private Date approvetime;

    private String backperson;

    private Date backtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLno() {
        return lno;
    }

    public void setLno(String lno) {
        this.lno = lno == null ? null : lno.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getBorrowperson() {
        return borrowperson;
    }

    public void setBorrowperson(String borrowperson) {
        this.borrowperson = borrowperson == null ? null : borrowperson.trim();
    }

    public String getBtel() {
        return btel;
    }

    public void setBtel(String btel) {
        this.btel = btel == null ? null : btel.trim();
    }

    public String getBunit() {
        return bunit;
    }

    public void setBunit(String bunit) {
        this.bunit = bunit == null ? null : bunit.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getTaster() {
        return taster;
    }

    public void setTaster(String taster) {
        this.taster = taster == null ? null : taster.trim();
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public String getBackperson() {
        return backperson;
    }

    public void setBackperson(String backperson) {
        this.backperson = backperson == null ? null : backperson.trim();
    }

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }
}