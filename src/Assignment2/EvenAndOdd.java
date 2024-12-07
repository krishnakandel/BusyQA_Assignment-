//Write a Java program to print even and odd numbers in an array.
package Assignment2;
import java.util.*;
public class EvenAndOdd {

	public static void main(String[] args) 
	{
		
		int[] array = {1,2,3,4,8,9,14};
		int i;
		// TODO Auto-generated method stub
		System.out.print("The even numbers are:");

		for(i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				System.out.print(array[i]+" ");
			}
		}
		
		System.out.print("\nThe odd numbers are:");
		for(i=0;i<array.length;i++)
		{
			if(array[i]%2!=0)
			{
				System.out.print(array[i]+" ");
			}
		}
		
	}

}
//The even numbers are:2 4 8 14 
//The odd numbers are:1 3 9 
