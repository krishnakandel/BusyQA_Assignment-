// Write a java program to remove white spaces in a string.
package Assignment2;
import java.util.Scanner;
public class RemoveWhiteSpaces {

	public static void main(String[] args)
	{
		String string = new String();
		String result = new String();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		string=scanner.nextLine();
		scanner.close();
		
		result=string.replace(" ","").trim();

		System.out.print("The string after removing white spaces:"+result);
	}
}
//Enter a string:     This is a test sting   .   . rest of the sting.       
//The string after removing white spaces:Thisisateststing..restofthesting.