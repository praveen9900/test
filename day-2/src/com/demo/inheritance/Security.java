package com.demo.inheritance;

public class Security extends TraineeEmployee {
	private String gender;

	public Security(int id, String name, String location, double salary, String performance, String gender) {
		super(id, name, location, salary, performance);
		this.gender = gender;
	}
	public String getDetails() {
		return super.getDetails()+" "+gender;
	}

}
