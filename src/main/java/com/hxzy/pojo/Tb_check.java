package com.hxzy.pojo;

import java.util.Date;

public class Tb_check {
    private Integer stockid;

    private Date checktime;

    private String checker;

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }
}