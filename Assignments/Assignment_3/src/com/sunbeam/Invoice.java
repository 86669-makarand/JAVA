package com.sunbeam;
import java.util.Scanner;
public class Invoice 
{

	private String partNo;
	private String partName;
	private int quantity;
	private double price;
	
	
	public Invoice() {
		this.partNo = "";
		this.partName = "";
		this.quantity = 0;
		this.price = 0.0;
	}
	
	public Invoice(String partNo, String partName, int quantity, double price) {
		this.partNo = partNo;
		this.partName = partName;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the partNo : ");
		partNo = sc.next();

		System.out.println("Enter the partName : ");
		partName = sc.next();

		System.out.println("Enter the quantity : ");
		if(quantity < 0)
		{
			System.out.println("quantity can't be negative !!!!");			
		}
		else 
		{
			quantity = sc.nextInt();			
		}
		System.out.println("Enter the Price : ");
		if(price < 0)
		{
			System.out.println("Price can't be negative !!!!");
		}
		else 
		{
			price = sc.nextDouble();
		}
	}
		
		double totalPrice()
		{
			double amt;
			amt = getPrice() * getQuantity();
			return amt;
		}
		
		public void menu()
		{
			System.out.println("1. partNO\t2. partName\3. quantity\t4. price");
		}
		
		public void display()
		{
			System.out.println(getPartNo()+"\t"+getPartName()+"\t"+getQuantity()+"\t"+getPrice());
			System.out.println("Bill : "+ totalPrice());
		}
		
		
	
	
	
	
	

}
