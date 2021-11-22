package com.oops.qus5;

public class Box3d extends Box {
	

	

	public Box3d(double lentht, double breadth, double height) {
		super(lentht, breadth, height);
	
	}

	public static void main(String[] args) {
		Box3d box = new Box3d(10.5,10.5,10.5);
		box.area();
		box.volume();

	}

}
