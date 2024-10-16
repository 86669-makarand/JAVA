import java.util.Scanner;
public class NumberConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		String binary = Integer.toBinaryString(number);
		String octal = Integer.toOctalString(number);
		String hexadecimal = Integer.toHexString(number);
		
		System.out.println("Binary Equivalent : "+binary);
		System.out.println("octal Equivalent : "+octal);
		System.out.println("hexadecimal Equivalent : "+hexadecimal);
		
		sc.close();
	}

}
