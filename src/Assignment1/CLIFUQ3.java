
package Assignment1;
import java.util.*;
public class CLIFUQ3 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int month;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("Please enter a number between 1 to 12:");
			month=scanner.nextInt();
		}while (month<1 || month>12);
		scanner.close();
		
		switch(month)
		{
			case 1:
				System.out.println("January:"+31);
				break;
			
			case 2:
				System.out.println("February:"+29);
				break;
			case 3:
				System.out.println("March:"+30);
				break;
			case 4:
				System.out.println("April:"+30);
				break;
			case 5:
				System.out.println("May:"+31);
				break;
			case 6:
				System.out.println("June:"+30);
				break;
			case 7:
				System.out.println("July:"+31);
				break;
			case 8:
				System.out.println("August:"+31);
				break;
			case 9:
				System.out.println("September:"+30);
				break;
			case 10:
				System.out.println("October:"+31);
				break;
			case 11:
				System.out.println("November:"+30);
				break;
			case 12:
				System.out.println("December:"+31);
				break;
			default:
				System.out.println("Enter a number between 1 and 12 inclusive.");
				break;

		}		
	}	
}
