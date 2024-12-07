//Write a Java Program count the number of digits of the number using while loop.

package Assignment1;
import java.util.*;
public class CLIFUQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, temp, count=1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer:");
		number=scanner.nextInt();
		temp=Math.abs(number); //taking absolute value of a number.
		scanner.close();
		
		while(temp/10!=0)
		{
			count=count+1;
			temp=temp/10;
		}
		
		System.out.print("The number of digit(s) in "+number+" is "+count);
	}

}
