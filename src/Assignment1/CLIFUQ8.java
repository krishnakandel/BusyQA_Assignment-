//6. Write a java program to check a Number is a Palindrome or not using while loop.
//(Reverse of 121 is 121, so it is palindrome)
package Assignment1;
import java.util.*;
public class CLIFUQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, reverse=0, temp;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		number=scanner.nextInt();
		scanner.close();
		temp=number;
		while(temp!=0)
		{
			reverse=reverse*10+(temp%10);
			temp=temp/10;
		}		
		if (number==reverse)
		{
			System.out.print(number+" is a palindorme.");
		}
		else
		{
			System.out.print(number+" is not a palindorme.");
		}
	}

}
