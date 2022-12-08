package com.demo.practice;

public class personpmain {

	public static void main(String[] args) {
		Personp a = new Personp(1,"sai","bengaluru");
		studentp b = new studentp(2,"ram","pune","good");
		System.out.println(a.getDetails());
		System.out.println(b.getDetails());
		
		Personp l = a;
		System.out.println(l.getDetails());
		l = b;
		System.out.println(l.getDetails());

	}

}
