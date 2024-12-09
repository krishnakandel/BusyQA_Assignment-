// Write a java program to convert string to integer.
package Assignment2;
import java.lang.StringBuilder;
import java.util.Scanner;
public class StringToInteger {

	public static void main(String[] args)
	{
		String string = new String();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		string=scanner.nextLine();
		scanner.close();
		int number = Integer.parseInt(string);
		System.out.print("The converted number from the given string is "+number);
	}
}
//Enter a string:23456
//The converted number from the given string is 23456