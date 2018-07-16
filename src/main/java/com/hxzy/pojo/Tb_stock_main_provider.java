package com.hxzy.pojo;

import java.util.Date;

public class Tb_stock_main_provider {
	
	private int id;
	private String sno;
	private String principal;
	private int providerid;
	private String username;
	private Date createTime;
	private int state;
	private String providername;
	@Override
	public String toString() {
		return "Tb_stock_main_provider [id=" + id + ", sno=" + sno + ", principal=" + principal + ", providerid="
				+ providerid + ", username=" + username + ", createTime=" + createTime + ", state=" + state
				+ ", providername=" + providername + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public int getProviderid() {
		return providerid;
	}
	public void setProviderid(int providerid) {
		this.providerid = providerid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getProvidername() {
		return providername;
	}
	public void setProvidername(String providername) {
		this.providername = providername;
	}
}
