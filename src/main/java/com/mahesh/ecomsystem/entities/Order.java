package com.mahesh.ecomsystem.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
	@Id
	private String id;
	private String customer_id;
	private float amount;
	private String pay_mode;
	
	private List<OrderItem> items;
	//getter setter, constr - 2, toStr 

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getPay_mode() {
		return pay_mode;
	}

	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public Order() {
		super();
	}

	public Order(String id, String customer_id, float amount, String pay_mode, List<OrderItem> items) {
		super();
		this.id = id;
		this.customer_id = customer_id;
		this.amount = amount;
		this.pay_mode = pay_mode;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customer_id=" + customer_id + ", amount=" + amount + ", pay_mode=" + pay_mode
				+ ", items=" + items + "]";
	}
	
}
