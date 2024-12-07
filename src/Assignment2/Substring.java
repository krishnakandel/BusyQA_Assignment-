// Write a program to get a substring of a given string between two specified positions
package Assignment2;
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String string1= "SarrebADEDdfwfg";
		//String string2="sARREBadedDFWFG";
		
		String string1="1SarrebADEDdfwfg";
		String string2="2sARREBadedDFWFG...1";
		
		System.out.println("Length of string1: "+string1.substring(7, 11));
		System.out.println("Length of string2: "+string2.substring(7, 11));
	}
}
//Length of string1: ADED
//Length of string2: aded
