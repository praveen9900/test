package com.demo.practice;

public class Personp {
	private int id;
	private String name;
	private String location;
	
	

	public Personp(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public String getDetails() {
		return id+ " "+name+" "+location;
	}

}
