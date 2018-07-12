package com.hxzy.pojo;

public class Tb_branchDamage {
	private String branchname;
	private String goodsname;
	//物资单位
	private String goodsunit;
	private double goodsprice;
	private int lyamount;
	private int bsamount;
	private int zyamount;
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
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
	public int getLyamount() {
		return lyamount;
	}
	public void setLyamount(int lyamount) {
		this.lyamount = lyamount;
	}
	public int getBsamount() {
		return bsamount;
	}
	public void setBsamount(int bsamount) {
		this.bsamount = bsamount;
	}
	public int getZyamount() {
		return zyamount;
	}
	public void setZyamount(int zyamount) {
		this.zyamount = zyamount;
	}
	@Override
	public String toString() {
		return "Tb_branchDamage [branchname=" + branchname + ", goodsname=" + goodsname + ", goodsunit=" + goodsunit
				+ ", goodsprice=" + goodsprice + ", lyamount=" + lyamount
				+ ", bsamount=" + bsamount + ", zyamount=" + zyamount + "]";
	}
	
}
