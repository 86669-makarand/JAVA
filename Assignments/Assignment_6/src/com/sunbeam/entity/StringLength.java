package com.sunbeam.entity;

import com.sunbeam.exception.ExceptionLineTooLong;

public class StringLength 
{
	
	String text;
	String reverse;
	


//	public void setReverse(String reverse) 
//	{
//		StringBuilder rev = new StringBuilder();
//		rev.reverse();
//	}



	public void setText(String text)throws ExceptionLineTooLong 
	{
		if(text.length() > 10)
		{
			throw new  ExceptionLineTooLong("The String is too long !!!");
			
		}
	}
	


	
	
}
