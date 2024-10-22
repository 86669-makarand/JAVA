package com.sunbeam;
import java.util.Scanner;

public class TestInvoice
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Part number: ");
		String partNo = sc.next();
		System.out.println("Enter Part Name: ");
		String partName = sc.next();
		System.out.println("Enter the Quantity : ");
	
		int quantity = sc.nextInt();
		if(quantity < 0) {
			System.out.println("Quantity should'nt be negative !!!!");
			quantity = 0;
		}
		else 
		{
			// no need to wirte else in this case
		}
		System.out.println("Enter the Price : ");
		double price = sc.nextDouble();
		
		Invoice i = new Invoice(partNo, partName, quantity, price);
		i.display();
		
		
		sc.close();
		
		
			
	}

}