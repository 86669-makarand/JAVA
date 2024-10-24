package com.sunbeam;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudentNameComparator implements Comparator<Student>
{	
		@Override
		public int compare(Student o1, Student o2) 
		{
			return o1.getName().compareTo(o2.getName());
		}		
}

class StudentMarksComapratorASC implements Comparator<Student>	
{
		@Override
		public int compare(Student o1, Student o2) 
		{			
			return Double.compare(o1.getMarks(), o2.getMarks());
		}
}

class StudentMarksComparatorDESC implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return Double.compare(o2.getMarks(), o1.getMarks());
	}
	
}
public class Program01 
{
	public static void displayAllStudent(Student[] studentarray)
	{
		System.out.println("*********************************************");
		for (Student st : studentarray)
			System.out.println(st);
		System.out.println("*********************************************");
	}
	public static int menu(Scanner sc)
		{
			System.out.println("0. Exit");
			System.out.println("1. Display All Students");
			System.out.println("2. Display Students sorted on rollno");
			System.out.println("3. Display Students sorted on name");
			System.out.println("4. Display Students sorted on marks");
			System.out.println("5. Display Students sorted on marks in DESC order");
			System.out.println();
			return sc.nextInt();
			
		}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Student []studentarray = new Student[5];
		Comparator<Student> comparator;
		studentarray[0] = new Student(5, "Mukesh", "Mumbai", 20);
		studentarray[1] = new Student(1, "Anil", "Mumbai", 50);
		studentarray[2] = new Student(4, "Gautam", "Gujrat", 10);
		studentarray[3] = new Student(3, "Ashnir", "Delhi", 30);
		studentarray[4] = new Student(2, "Puyush", "Delhi", 40);
		int choice;
		
		while((choice = menu(sc) )!= 0)
		{
			switch (choice) {
			case 0:
				System.out.println("Thank your using our app !!!!!");
				break;
			case 1:
			{
				displayAllStudent(studentarray);
				break;
			}
			case 2:
			{
				Arrays.sort(studentarray);
				displayAllStudent(studentarray);
				break;
			}
			case 3:
			{
				comparator = new StudentNameComparator();
				Arrays.sort(studentarray, comparator);
				displayAllStudent(studentarray);
				break;
			}
			
			case 4:
			{
				comparator = new StudentMarksComapratorASC();
				Arrays.sort(studentarray, comparator);
				displayAllStudent(studentarray);
				break;
			}
			
			case 5:
			{
				comparator = new StudentMarksComparatorDESC();
				Arrays.sort(studentarray,comparator);
				displayAllStudent(studentarray);
				break;
			}
			default:
				System.out.println("Invalid Input !!!!!");
				break;
			}
		}
		
		
	}
	
	
		

}
