//6. Write a java program to reverse a number using while loop.
package Assignment1;
import java.util.*;
public class CLIFUQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, reverse=0, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		number=scanner.nextInt();
		scanner.close();
		temp=Math.abs(number);
		while(temp!=0)
		{
			reverse=reverse*10+(temp%10);
			temp=temp/10;
		}
		System.out.print("The reverse of "+number+" is "+reverse+".");
	}

}
