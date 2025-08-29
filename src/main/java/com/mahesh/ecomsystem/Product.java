package com.mahesh.ecomsystem;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
	@Id
    private String id;
    private String name;
    private String description;
    private String category;
    private String tags;
    private float price;
    private int stock;
    //
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
    //
	public Product() {
		super();
	}
	public Product(String id, String name, String description, String category, String tags, float price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.tags = tags;
		this.price = price;
		this.stock = stock;
	}
	//
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", tags=" + tags + ", price=" + price + ", stock=" + stock + "]";
	}
	//
	@Override
	public int hashCode() {
		return Objects.hash(category, description, id, name, price, stock, tags);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && stock == other.stock
				&& Objects.equals(tags, other.tags);
	}
	
}

