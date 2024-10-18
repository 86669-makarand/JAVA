package com.app.geometry;

public class Point2D {
	double x;
	double y;
	public Point2D(double x, double y) {
		this.x = x; // 10
		this.y = y; // 20
	}
	public String getDetails() {
		return "("+x+","+y+")";
	}
	public boolean isEqual(Point2D p2) {
		return this.x == p2.x && this.y == p2.y;
		//		p1    == p2   &&   p1   ==   p2
		// p2 is entered Values
		// p1 is entered values 
		// which will compare at at this step
	}
	public double calculateDistance(Point2D p2) {
		return Math.sqrt(Math.pow(p2.x-this.x, 2)+ Math.pow(p2.y-this.y,2));
		 
	}
	

}
