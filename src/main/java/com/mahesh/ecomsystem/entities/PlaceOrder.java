package com.mahesh.ecomsystem.entities;

import java.util.List;

public class PlaceOrder {
	private String street;
	private String place;
	private String city;
	private String zip;
	private String pay_mode;
	private List<PlaceOrderItem> items;
	//setter, getter, constr arg/ noarg, toStr
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPay_mode() {
		return pay_mode;
	}
	public void setPay_mode(String pay_mode) {
		this.pay_mode = pay_mode;
	}
	public List<PlaceOrderItem> getItems() {
		return items;
	}
	public void setItems(List<PlaceOrderItem> items) {
		this.items = items;
	}
	public PlaceOrder() {
		super();
	}
	public PlaceOrder(String street, String place, String city, String zip, String pay_mode,
			List<PlaceOrderItem> items) {
		super();
		this.street = street;
		this.place = place;
		this.city = city;
		this.zip = zip;
		this.pay_mode = pay_mode;
		this.items = items;
	}
	@Override
	public String toString() {
		return "PlaceOrder [street=" + street + ", place=" + place + ", city=" + city + ", zip=" + zip + ", pay_mode="
				+ pay_mode + ", items=" + items + "]";
	}
	
}
