package com.demo.practice;

public abstract class absp{
	protected int dim1;
	protected int dim2;
	
	public absp(int dim1 , int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	public abstract double area();
	
}