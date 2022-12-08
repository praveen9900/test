package com.demo.inheritance;

public class TraineeEmployee extends Employee {
	private String performance;

	public TraineeEmployee(int id, String name, String location, double salary, String performance) {
		super(id, name, location, salary);
		this.performance = performance;
	}

	public String getDetails() {
		return super.getDetails() + " " + performance;
	}

}
