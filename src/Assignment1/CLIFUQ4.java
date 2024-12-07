
//Writer a Java program that takes a year from user and print whether that year is a leap year or not.
package Assignment1;
import java.util.*;

public class CLIFUQ4 {

	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		//Tested based on rules:
		//Rules to Determine a Leap Year:
		//A year is a leap year if it is divisible by 4.
		//Example: 2004, 2008, 2012.
		//However, if the year is divisible by 100, it is not a leap year, unless:
		//The year is also divisible by 400.
		//Example: 1600 and 2000 are leap years, but 1700, 1800, and 1900 are not.
		
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year:");
		
		year=scanner.nextInt();
		if (year%4==0 && year%100!=0)
		{
			System.out.println("The "+"year "+year+" is a leap year.");
		}
		else if (year%4==0 && year%100==0 && year%400==0)
		{
			System.out.println("The "+"year "+year+" is a leap year.");
		}
		else 
		{
			System.out.println("The "+"year "+year+" is not a leap year.");
		}
		scanner.close();
		
	}

}
