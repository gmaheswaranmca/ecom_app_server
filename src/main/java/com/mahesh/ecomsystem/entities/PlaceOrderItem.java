package com.mahesh.ecomsystem.entities;

public class PlaceOrderItem {
	private String item_id;
	private int qty;
	// getter, setter, noarg constr, arg constr, toString 
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
	public PlaceOrderItem() {
		super();
	}
	public PlaceOrderItem(String item_id, int qty) {
		super();
		this.item_id = item_id;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "PlaceOrderItem [item_id=" + item_id + ", qty=" + qty + "]";
	}	
}
