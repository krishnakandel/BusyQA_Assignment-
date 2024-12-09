// Write a java program to count number of time a character repeated in a string.
package Assignment2;
import java.lang.StringBuilder;
import java.util.Scanner;
public class CharacterRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = new String();
		char ch;
		int i, count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		string=scanner.nextLine();
		System.out.print("Enter a character to count in the entered string:");
		ch=scanner.next().charAt(0);
		scanner.close();
		char[] temp = string.toCharArray();
		
		for(i=0;i<temp.length;i++)
		{
			if(ch==temp[i])
				count=count+1;
		}
		
		System.out.print("The count of "+ch+" in "+string+ " is "+count+".");
	}
}
//Enter a string:This is a test test.
//Enter a character to count in the entered string:t
//The count of t in This is a test test. is 4.