//10. write a program to print Fibonacci Series in the range of 1 to 50. Series: (1,1,2,3,5,8,13, ....)
package Assignment1;
import java.util.*;
public class CLIFUQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstnum=0,secondnum=1, term=firstnum+secondnum,i;
		System.out.print(firstnum+","+secondnum);
		
		for(i=2;term<50;i++)
		{
			System.out.print(","+term);
			firstnum=secondnum;
			secondnum=term;
			term=firstnum+secondnum;
		}
	}
}