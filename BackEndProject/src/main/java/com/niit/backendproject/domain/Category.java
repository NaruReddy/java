package com.niit.backendproject.domain;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity   //Mapping with database
@Component    //Used to auto detect and auto configure beans using class path scanning.
public class Category {

	private String id;
	private String name;
	private String type;
	public Category()
	{
		System.out.println("inside conc of category");
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
