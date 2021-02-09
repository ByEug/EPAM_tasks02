package com.bylkov.homework02.shop;

public abstract class Product {

	private int price;

	protected void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

}
