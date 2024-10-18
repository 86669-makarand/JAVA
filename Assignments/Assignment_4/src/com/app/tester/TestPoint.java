package com.app.tester;
import com.app.geometry.Point2D;
import java.util.Scanner;
public class TestPoint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Point 1 x value: ");
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		System.out.println("Enter Point 1 y value: ");
		double y1 = sc.nextDouble();
		
		
		System.out.println("Enter pPoint 1 x value: ");
//		Scanner sc = new Scanner(System.in);
		double x2 = sc.nextDouble();
		System.out.println("Enter Point 1 y value: ");
		double y2 = sc.nextDouble();
		

		Point2D p1 = new Point2D(x1, y1);
		Point2D p2 = new Point2D(x2, y2);
		if(p1.isEqual(p2)) {
			System.out.println("Both point are in same position: "+ x1+","+y1);
			
		}else {
			System.out.println(p1.calculateDistance(p2));;
		}
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
		
	}
	

}
