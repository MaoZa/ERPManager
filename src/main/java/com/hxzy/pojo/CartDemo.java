package com.hxzy.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CartDemo {
	private Tb_goods tb_goods;
	private int id;
	private int number;
	@Override
	public String toString() {
		return "CartDemo [tb_goods=" + tb_goods + ", id=" + id + ", number=" + number + "]";
	}
	public Tb_goods getTb_goods() {
		return tb_goods;
	}
	public void setTb_goods(Tb_goods tb_goods) {
		this.tb_goods = tb_goods;
	}
	public CartDemo() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddss");
		String date = simpleDateFormat.format(new Date());
		String strid = new Random().nextInt(99999) + date;
		id = Integer.parseInt(strid);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
