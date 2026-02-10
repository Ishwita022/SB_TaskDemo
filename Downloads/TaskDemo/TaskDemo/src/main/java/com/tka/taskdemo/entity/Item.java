package com.tka.taskdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "item")
public class Item {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	@NotBlank(message = "Item name is required")
    private String name;
	@NotBlank(message = "Category is required") 
    private String category;
	@Positive(message = "Price must be greater than zero")
    private double price;
	@Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Long id, String name, String category, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
