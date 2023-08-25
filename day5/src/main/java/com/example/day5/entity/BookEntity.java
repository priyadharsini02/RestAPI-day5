package com.example.day5.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookEntity {
	@Id
private int id;
private String bookName;
private float price;
private int quantity;
private String authorName;

public BookEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public BookEntity(int id, String bookName, float price, int quantity, String authorName) {
	super();
	this.id = id;
	this.bookName = bookName;
	this.price = price;
	this.quantity = quantity;
	this.authorName = authorName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}


}