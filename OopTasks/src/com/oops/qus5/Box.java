package com.oops.qus5;

public class Box {
	double lenght;
	double breadth;
	double height;
	public Box(double lenght, double breadth, double height) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
		this.height = height;
	}
	public void area() {
	double area;
	area = lenght*breadth*height;
	System.out.println(area);
	}

	public void volume() {
		double area;
		area = lenght+breadth+height;
		System.out.println(area);
		}

}
