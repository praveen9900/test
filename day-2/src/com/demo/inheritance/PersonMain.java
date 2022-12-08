package com.demo.inheritance;

public class PersonMain {

	public static void main(String[] args) {
		
		Person john = new Person(101,"Jim","Goa");
		//Student st = new Student(100,"John","Bengalauru","Good");
		Employee peter = new Employee(102,"Ram","Mumbai",50000);
		TraineeEmployee raja = new TraineeEmployee(103,"manoj","Assam",45000,"Excellent");
		Security veer = new Security(104,"veeresh","delhi",47000,"good","male");
		
	
		System.out.println(john.getDetails());
		System.out.println(peter.getDetails());
		System.out.println(raja.getDetails());
		System.out.println(veer.getDetails());

	}

}
