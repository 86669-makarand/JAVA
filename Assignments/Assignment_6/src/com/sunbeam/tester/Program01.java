package com.sunbeam.tester;
import java.util.Scanner;

import com.sunbeam.entity.StringLength;

import com.sunbeam.exception.ExceptionLineTooLong;
public class Program01 
{

	public static void main(String[] args) 
	{
		// Q1
		Scanner sc = new Scanner(System.in);
		StringLength str = new StringLength();
		System.out.println("Enter the String : ");
		String text = sc.next();
		 try 
		 {
			 str.setText(text);
		 }
		 catch(ExceptionLineTooLong e)
		 {
			 e.printStackTrace();
			 
		 }
		 
		// Q2
		StringBuilder rev = new StringBuilder(text).reverse();
		System.out.println("Enter the string to Reverse : "+rev);
		
		// Q3
		StringBuilder peldrom = new StringBuilder(text).reverse();
		String s = peldrom.toString();
		if(s.equals(text))
		{
		 System.out.println("String is pelindrom !!! ");
		}
		else 
		{
		 System.out.println("String is not Pelindrom !!!! ");
		}
		System.out.println("program completed successfully !!!!!");
		sc.close();
	}

}
