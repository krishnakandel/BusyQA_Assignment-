//Write a Java program to find greatest and smallest element in an array.
package Assignment2;
import java.util.*;
public class GreatestAndSmallest {

	public static void main(String[] args) 
	{
		
		int[] array = {1,2,3,4,8,9,14};
		int i, greatest=array[0], smallest=array[0];
		// TODO Auto-generated method stub
		System.out.print("The even numbers are:");

		for(i=1;i<array.length;i++)
		{
			if(array[i]>greatest)
			{
				greatest=array[i];
			}
			
			if(array[i]<smallest)
			{
				smallest=array[i];
			}
		}
		System.out.print("The greatest number is: "+greatest);
		System.out.print("\nThe smallest number is :"+smallest);
	}
}