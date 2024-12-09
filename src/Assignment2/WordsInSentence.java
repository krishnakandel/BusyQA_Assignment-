// Write a java program to count number of words in a sentence.
package Assignment2;
import java.lang.StringBuilder;
import java.util.Scanner;
public class WordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = new String();
		//char ch;
		int i, count=1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		string=scanner.nextLine();
		//System.out.print("Enter a character to count in the entered string:");
		//ch=scanner.next().charAt(0);
		scanner.close();
		char[] temp = string.trim().toCharArray();
		for(i=0;i<temp.length;i++)
		{
			if(temp[i]==' ')
			{
				count=count+1;
			}
		}
		System.out.print("The number of words in "+string+ " is "+count+".");
	}
}
//Enter a string:   This sentence has five words. 
//The number of words in    This sentence has five words.  is 5.