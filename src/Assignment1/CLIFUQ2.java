package Assignment1;

import java.util.Scanner;

public class CLIFUQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		num1=scanner.nextInt();
		
		System.out.println("Enter the first number:");
		num2=scanner.nextInt();
		
		System.out.println("Enter the first number:");
		num3=scanner.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("The greatest number is:"+num1);			
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("The greatest number is:"+num2);			
		}
		else
		{
			System.out.println("The greatest number is:"+num3);			
		}
		scanner.close();
	}

}
