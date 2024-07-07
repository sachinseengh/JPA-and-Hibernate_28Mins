package com.example.spring_boot.Learn.jpa.and.hibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="course")
public class Courses {
	
	@Id
	private int id;
	private String name;
	private String author;
	
	public Courses(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public Courses() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
