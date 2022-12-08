package com.demo.practice;

public class absmain {
	public static void main(String[] args) {
		triangle t = new triangle(2,7);
		rect r = new rect(2,7);

		System.out.println("Area of triangle is : " + t.area());
		System.out.println("Area of rectangle is : " + r.area());
		
		absp hi = t;
		System.out.println(hi.area());
		hi = r;
		System.out.println(hi.area());
	}

}
