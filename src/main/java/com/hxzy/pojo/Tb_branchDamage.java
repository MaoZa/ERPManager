package com.hxzy.pojo;

import java.util.Date;

public class Tb_branchDamage {

	private int id;
	private String branchid;
	private String goodsis;
	private int damagenum;
	private Date createtime;
	private String principal;
	private String username;
	private String cause;
	private String goodsname;
	private String goodsspec;
	private String goodsunit;
	private double goodsprice;
	private String branchname;
	private int getuseNum;
	@Override
	public String toString() {
		return "Tb_branchDamage [id=" + id + ", branchid=" + branchid + ", goodsis=" + goodsis + ", damagenum="
				+ damagenum + ", createtime=" + createtime + ", principal=" + principal + ", username=" + username
				+ ", cause=" + cause + ", goodsname=" + goodsname + ", goodsspec=" + goodsspec + ", goodsunit="
				+ goodsunit + ", goodsprice=" + goodsprice + ", branchname=" + branchname + ", getuserNum=" + getuseNum
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	public String getGoodsis() {
		return goodsis;
	}
	public void setGoodsis(String goodsis) {
		this.goodsis = goodsis;
	}
	public int getDamagenum() {
		return damagenum;
	}
	public void setDamagenum(int damagenum) {
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
		this.principal = principal;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsspec() {
		return goodsspec;
	}
	public void setGoodsspec(String goodsspec) {
		this.goodsspec = goodsspec;
	}
	public String getGoodsunit() {
		return goodsunit;
	}
	public void setGoodsunit(String goodsunit) {
		this.goodsunit = goodsunit;
	}
	public double getGoodsprice() {
		return goodsprice;
	}
	public void setGoodsprice(double goodsprice) {
		this.goodsprice = goodsprice;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public int getGetuseNum() {
		return getuseNum;
	}
	public void setGetuseNum(int getuseNum) {
		this.getuseNum = getuseNum;
	}
}