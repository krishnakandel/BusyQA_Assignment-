package Assignment1;
import java.util.Scanner;

public class CLIFUQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
	
		number=scanner.nextFloat();
		
		if (number>0)
		{
			System.out.println("The number is positive:"+number);
		}
		else if(number<0)
		{
			System.out.println("The number is negative:"+number);
		}
		else
		{
			System.out.println("The number is Zero:"+number);
		}
		scanner.close();
	}
}
