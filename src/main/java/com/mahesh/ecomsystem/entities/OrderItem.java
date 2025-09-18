package com.mahesh.ecomsystem.entities;

public class OrderItem {
	private String item_id;
	private int qty;
	private float price;
	//getter, setter, arg constr, no-arg constr, toStr 
	public String getItem_id() {
		return item_id;
	}
	public void setItem_id(String item_id) {
		this.item_id = item_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public OrderItem() {
		super();
	}
	public OrderItem(String item_id, int qty, float price) {
		super();
		this.item_id = item_id;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderItem [item_id=" + item_id + ", qty=" + qty + ", price=" + price + "]";
	}
	
}
