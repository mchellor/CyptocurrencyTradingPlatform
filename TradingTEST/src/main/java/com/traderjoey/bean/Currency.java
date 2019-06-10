package com.traderjoey.bean;


public class Currency {
	private int id;
	private String name;
	private CurrencyPrice price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CurrencyPrice getPrice() {
		return price;
	}

	public void setPrice(CurrencyPrice price) {
		this.price = price;
	}

}
