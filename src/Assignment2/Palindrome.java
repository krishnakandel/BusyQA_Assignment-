// Write a program to check a string is palindrome or not (eg reverse of level is level)
package Assignment2;
import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args)
	{
		int length, i,j, flag=0;
		String string = new String();
		String result = new String();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		string=scanner.nextLine();
		scanner.close();
		
		result=string.trim();
		length=result.length();
		
		char[] temp = result.toCharArray();

		for(i=0, j=length-1;i<length/2;i++,j--)
		{
			if(temp[i]!=temp[j])
				flag=1;
				
		}
		if(flag==1)
			System.out.print("The string is not a palindrome:"+result);
		else
			System.out.print("The string is a palindrome:"+result);
	}
}
//Enter a string:ertyuytre
//The string is a palindrome:ertyuytre
//=====
//Enter a string:ertyuhfhfhfhdf  
//The string is not a palindrome:ertyuhfhfhfhdf