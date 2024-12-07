//7. Write a Java Program to print factorial of a given number using any loop.
package Assignment1;
import java.util.*;
public class CLIFUQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, factorial=1,i;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		number=scanner.nextInt();
		scanner.close();
		
		for(i=2;i<=number;i++)
		{
			factorial=factorial*i;
		}
			System.out.print("The factorial of "+number+" is "+factorial+".");
	}
}