import java.util.Scanner;
public class AverageCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0;
		System.out.println("Enter the Num1 : ");
		if(sc.hasNextDouble()) 
		{
			num1 = sc.nextDouble();	
		}
		else
		{
			System.out.println("Num1 is not Double !!!!");
			sc.close();
		}
		System.out.println("Enter the Num2 : ");
		
		if(sc.hasNextDouble()) 
		{
			num2 = sc.nextDouble();	
		}
		else
		{
			System.out.println("Num2 is not Double !!!!");
			sc.close();
		}
		
		System.out.println("Average is : "+(num1 + num2)/ 2);
		

	}

}
