package Assignment3;
import java.util.Scanner;
public class Assign3Part1Q2 {

	public static void main(String[] args) {

		int number1, number2, number3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		number1=scanner.nextInt();
		scanner.nextLine(); //to consume the new line character after reading integer.
		
		System.out.print("Enter the second number:");
		number2=scanner.nextInt();
		scanner.nextLine(); //to consume the new line character after reading integer.
		
		System.out.print("Enter the third number:");
		number3=scanner.nextInt();
		scanner.nextLine(); //to consume the new line character after reading integer.
		scanner.close();
		
		Calculation cal = new Calculation(number1,number2,number3);
		
		cal.sum();
	}
}

/*Enter the first number:1
Enter the second number:2
Enter the third number:3
The sum of the numbers is:6 */
