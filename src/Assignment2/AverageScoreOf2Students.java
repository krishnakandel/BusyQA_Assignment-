
//Write a Java program to find the average score of two students in three papers using 2-dimensional array.
package Assignment2;
import java.util.*;
public class AverageScoreOf2Students {

	public static void main(String[] args) 
	{
		
		int i, j;
		int[][] score = {
							{90,70,80},
							{60,40,50}
										};
		int[] total = new int[2];
		for(i=0;i<score.length;i++)
		{
			total[i]=0;
			for (j=0;j<score[i].length;j++)
			{
				total[i]=total[i]+score[i][j];
			}
		}
		
		for (i=0;i<total.length;i++)
		{
			System.out.print("Student "+(i+1)+" Average score:"+(float)total[i]/3+"\n");
		}
	}
}