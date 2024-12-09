// Write a java program to convert integer to string.
package Assignment2;
import java.util.Scanner;
public class IntegerToString {

	public static void main(String[] args) {
		
		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a integer number:");
		number=scanner.nextInt();
		scanner.close();
		String str2num = String.valueOf(number);
		System.out.print("The converted string is "+str2num);
	}
}
//Enter a integer number:23455
//The converted string is 23455