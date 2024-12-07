
//Write a Java program to find duplicate elements in an array.
package Assignment2;
import java.util.*;
public class DuplicateArrayElements {

	public static void main(String[] args) 
	{
		
		//int[] array = {1,2,3,3,8,9,9};
		int[] array = {1,1,3,3,8,9,9};
		//int[] array = {1,1,3,3,3,9,9};
		int i,j;
		
		for(i=0;i<array.length;i++)
		{
			//duplicate=array[i];
			
			for (j=i;j<array.length;j++)
			{
				if(i!=j)
				{
					if(array[i]==array[j])
					{
						System.out.println("array["+i+"]="+array[i]+" and"+" array["+j+"]="+array[j]+" are duplicate.");
					}
					
				}
			}
		}
		
	}
}

//array[2]=3 and array[3]=3 are duplicate.
//array[5]=9 and array[6]=9 are duplicate.

//array[0]=1 and array[1]=1 are duplicate.
//array[2]=3 and array[3]=3 are duplicate.
//array[5]=9 and array[6]=9 are duplicate.

//array[0]=1 and array[1]=1 are duplicate.
//array[2]=3 and array[3]=3 are duplicate.
//array[2]=3 and array[4]=3 are duplicate.
//array[3]=3 and array[4]=3 are duplicate.
//array[5]=9 and array[6]=9 are duplicate.
