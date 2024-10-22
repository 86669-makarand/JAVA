package com.app.fruits;

import java.util.Scanner;

public class FruitBasket 
{
	public static int  menu(Scanner sc)
	{
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display all the names of the fruits in the basket");
		System.out.println("5. Display details of all the fruits in the basket");
		System.out.println("6. Display taste of all the fruits");
		System.out.println("7. Mark the fruits as stale");
		System.out.println("8. Marke all sour fruits as stale");
		
		System.out.println("Enter the choice : ");
		int choice  = sc.nextInt();
		return choice;
	}
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Basket : ");
		int size = sc.nextInt();
		Fruit[] basket = new Fruit[size];
		int choice;
		int counter = 0;
		
		while((choice = menu(sc)) != 0)
		{
			switch(choice)
			{
				case 0:
				{
					System.out.println("Thank you Visit Again !!!! ");
					break;
				}
				
				case 1:
				{
					if(counter < size)
					{
						System.out.println("Enter the name : ");
						String name = sc.next();
						
						System.out.println("Enter the color : ");
						String color = sc.next();
						
						System.out.println("Enter the weight : ");
						double weight = sc.nextDouble();
						
						basket[counter] = new Mango(name, color, weight, true);
						counter++;
						break;
					}
				}
				
				case 2:
				{
					System.out.println("Enter the name : ");
					String name = sc.next();
					
					System.out.println("Enter the color : ");
					String color = sc.next();
					
					System.out.println("Enter the weight : ");
					double weight = sc.nextDouble();
					
					basket[counter] = new Orange(name, color, weight, true);
					counter++;
					break;
					
				}
				
				case 3:
				{
					System.out.println("Enter the name : ");
					String name = sc.next();
					
					System.out.println("Enter the color : ");
					String color = sc.next();
					
					System.out.println("Enter the weight : ");
					double weight = sc.nextDouble();
					
					basket[counter] = new Orange(name, color, weight, true);
					counter++;
					break;
				}
				
				case 4:
				{
					for (int i = 0; i < counter; i++)
					{
						if(basket[i] != null)
						{
							System.out.println(basket[i].getName());
						}
					}
					break;
				}
				
				case 5: 
				{
					for (int i = 0; i < counter; i++)
					{
						if (basket[i] != null)
						{
							System.out.println(basket[i].toString());
						}
					}
					break;
				}
				
				case 6:
				{
					System.out.println("Taste of all stale fruits : ");
					for (int i = 0; i < counter; i++)
					{
						if (basket[i] != null && basket[i].isFresh())
						{
							System.out.println(basket[i].isFresh()+" , "+ basket[i].taste());
						}
					}
					break;
				}
				
				case 7:
				{
					System.out.println("Enter Index : ");
					int index = sc.nextInt();
					
					if(index >= 0 && index < counter && basket[index] != null)
					{
						basket[index].setFresh(false);
						System.out.println("Mark fruit as stale");
					}
					break;
				}
				
				case 8:
				{
					for (int i = 0; i < counter;i++)
					{
						if(basket[i] != null && basket[i].taste().equals("sour"))
						{
							basket[i].setFresh(false);
						}
					}
					System.out.println("!!!!!!!");
					break;
				}
				
				default : 
					System.out.println("Invalid Input !!!!!!!! ");
					break;
			}
		}
	}
}
