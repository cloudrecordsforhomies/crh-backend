package com.example.demo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
	
	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String location;
	
	User(String firstName, String lastName, String location) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.location = location;
	}
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	public String getLocation() {
		return location;
	}
	public Long getId() {
		return id;
	} 
	public void setName(String name) {
		String[] parts = name.split(" ");
		this.firstName = parts[0];
		this.lastName = parts[1];
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
	
