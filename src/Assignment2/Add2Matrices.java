
//Write a Java program to Add two matrices using 2-dimensional array.
package Assignment2;
import java.util.*;
public class Add2Matrices {

	public static void main(String[] args) 
	{
		
		int i, j;
		int[][] mat1 = {
							{90,70,80},
							{60,40,50},
							{10,20,30}
										};
		
		
		int[][] mat2 = {
							{9,7,8},
							{6,4,5},
							{1,2,3}
										};
		
		int[][] sum = new int[3][3];
		
		for(i=0;i<sum.length;i++)
		{
			for (j=0;j<sum[i].length;j++)
			{
				sum[i][j]= mat1[i][j] + mat2[i][j];
			}
		}
		
		for(i=0;i<sum.length;i++)
		{
			for (j=0;j<sum[i].length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}