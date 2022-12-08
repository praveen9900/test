package com.demo.abstract1;

public class main {

	public static void main(String[] args) {
		// abstart a = new abstart();
		traiangle t = new traiangle(2, 4);
		rectangle r = new rectangle(2, 4);
		System.out.println("Area of Triangle is " + t.area());
		System.out.println("Area of rectangle is " + r.area());
		abstart_ ref = r;
		System.out.println(ref.area());
		ref = t;
		System.out.println(ref.area());

	}

}
