//Write a program to display the multiplication table of a given integer using for loop.

package Assignment1;

import java.util.Scanner;

public class CLIFUQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number,i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 15");
		number=scanner.nextInt();
		scanner.close();
		for(i=1;i<=20;i++)
		{
			System.out.print(number*i+" ");
		}
		
	}
}
