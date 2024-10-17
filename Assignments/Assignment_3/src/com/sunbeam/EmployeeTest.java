package com.sunbeam;

import java.util.Scanner;

public class EmployeeTest {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		int choice = 0;
		while (choice != 4)
		{
			System.out.println("__________________Menu__________________");
			System.out.println("1. Accept Employee");
			System.out.println("2. Display Employee");
			System.out.println("3. Increament Salary");
			System.out.println("4. Exit");
			
			System.out.println("Enter your Choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				e1.accept();
				break;
			case 2: 
				e1.displayEmployee();
				break;
			case 3:
				e1.yearlySalary();

			default:
				break;
			}
		}
	}

}
