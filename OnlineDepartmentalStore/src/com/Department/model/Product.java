package com.Department.model;

public class Product {
	
	private int productId;
	public Product(int productId, String productName, double sellingPrice, int avaliableQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.sellingPrice = sellingPrice;
		this.avaliableQuantity = avaliableQuantity;
	}
	private String productName;
	private double sellingPrice;
	private int avaliableQuantity;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getAvaliableQuantity() {
		return avaliableQuantity;
	}
	public void setAvaliableQuantity(int avaliableQuantity) {
		this.avaliableQuantity = avaliableQuantity;
	}
	
	

}
