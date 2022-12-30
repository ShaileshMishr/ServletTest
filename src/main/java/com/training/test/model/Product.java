package com.training.test.model;

public class Product {

	private int prodId;
	
	private String productName;
	private String productDesc;
	private double price;
	
	public Product() {
		
	}

	public Product(int prodId, String productName, String productDesc, double price) {
		super();
		this.prodId = prodId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.price = price;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
