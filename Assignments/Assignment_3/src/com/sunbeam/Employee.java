package com.sunbeam;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Employee {
	
	// field initializer
	String firstName;
	String lastName;
	double salary;
	
	// object initializer
	{
		
	}
	public Employee() 
	{
	}

	public Employee(String firstName, String lastName, double salary) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
//		if(salary < 0)
//		{
//			this.salary = salary;	
//		}
//		else
//		{			
//				System.out.println("Salary must be positive !!!!!");			}
//		}
	}
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name : ");
		firstName = sc.next();
		System.out.println("Enter the last Name : ");
		lastName = sc.next();
		
		System.out.println("Enter the Salary : ");
		salary = sc.nextDouble();
		System.out.println("");
		if(salary <= 0)
		{
//			this.salary = salary;
			System.out.println("Salary must be positive !!!!!");
			salary = 0;

		}
		else
		{
			System.out.println("Record inserted Successfully !!!!");
		}
	}
	public void displayEmployee()
	{		
		double annualSal = getSalary() * 12;
		System.out.println("Employee Name : "+ firstName+" "+lastName+".");
		System.out.println("Annual Salary : " + annualSal );
	}
	public void yearlySalary()
	{
		double annualSal = getSalary() * 12;
		double absoluteSal = (annualSal * 0.10);
		double hike = annualSal + absoluteSal;
		
//		System.out.println("Yearly Salary : "+ annualSal);
		System.out.println("Bonus Amount  : "+ absoluteSal);
		System.out.println("Increament Amount  : "+ hike);
	}
	

}
