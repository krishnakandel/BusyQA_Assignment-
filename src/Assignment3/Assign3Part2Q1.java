package Assignment3;
import java.util.Scanner;
public class Assign3Part2Q1 {

	public static void main(String[] args) {

		int number1, number2, number3;
		double d1, d2, d3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first integer:");
		number1=scanner.nextInt();
		scanner.nextLine(); //to consume the new line character after reading integer.
		
		System.out.print("Enter the second integer:");
		number2=scanner.nextInt();
		scanner.nextLine(); //to consume the new line character after reading integer.
		
		System.out.print("Enter the third integer:");
		number3=scanner.nextInt();
		scanner.nextLine(); //to consume the new line character after reading integer.
		
		System.out.print("Enter the first double type number:");
		d1=scanner.nextDouble();
		
		System.out.print("Enter the second double type number:");
		d2=scanner.nextDouble();
		
		System.out.print("Enter the third double type number:");
		d3=scanner.nextDouble();
		
		scanner.close();
		
		Calculation2 cal = new Calculation2();
		
		System.out.println("The sum of two integers: "+cal.sum(number1, number2));
		System.out.println("The sum of three integers: "+cal.sum(number1, number2, number3));

		System.out.println("The sum of two doubles: "+cal.sum(d1, d2));
		System.out.println("The sum of three doubles: "+cal.sum(d1, d2, d3));
		
	}
}
/*
Enter the first integer:20
Enter the second integer:50
Enter the third integer:40
Enter the first double type number:2000.45
Enter the second double type number:3000.36
Enter the third double type number:1000.25
The sum of two integers: 70
The sum of three integers: 110
The sum of two doubles: 5000.81
The sum of three doubles: 6001.06 */