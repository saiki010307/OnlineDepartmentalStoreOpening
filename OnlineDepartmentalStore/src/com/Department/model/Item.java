package com.Department.model;

public class Item {
	
	private String itemName;
	private String category;
	private double buyingPrice;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getBuyingPrice() {
		return buyingPrice;
	}
	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}
	public Item(String itemName, String category, double buyingPrice) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.buyingPrice = buyingPrice;
	}
	

}
