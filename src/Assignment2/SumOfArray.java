// Write a Java program to calculate sum values of an array.
package Assignment2;
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) 
	{
		
		int[] array = {1,2,3,4,8,9,14};
		int sum=0, i;
		// TODO Auto-generated method stub
		for(i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		System.out.print("The sum value of the arrya is "+sum+".");
		
	}

}
