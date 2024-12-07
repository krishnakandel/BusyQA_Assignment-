//Write a Java program to calculate average of values of an array.
package Assignment2;
import java.util.*;
public class AverageOfArray {

	public static void main(String[] args) 
	{
		
		int[] array = {1,2,3,4,8,9,14};
		int sum=0, i;
		float average;
		// TODO Auto-generated method stub
		for(i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		average=(float)sum/array.length;
		
		System.out.print("The average value of the arrays is "+average+".");
		
	}

}
//The average value of the arrays is 5.857143.