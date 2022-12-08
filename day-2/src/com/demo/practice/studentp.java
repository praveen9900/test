package com.demo.practice;

public class studentp extends Personp{
	private String grade;
	public studentp(int id,String name, String location , String grade) {
		super(id,name,location);
		this.grade = grade;
	}
	
	public String getDetails() {
		return super.getDetails()+" "+ grade;
	}

}
