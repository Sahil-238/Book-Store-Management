package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MyBooks")
public class MyBookList {
	
	@Id
	private int id;
	private String author;
	private String name;
	private String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public MyBookList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyBookList(int id, String author, String name, String price) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
		this.price = price;
	}
}
