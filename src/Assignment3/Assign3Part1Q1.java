package Assignment3;
import java.util.Scanner;
public class Assign3Part1Q1 {

	public static void main(String[] args) {

		int sID;
		String studentName;
		float subject1, subject2, subject3;
		
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
				
		System.out.print("Enter Student ID:");
		sID=scanner.nextInt();
		scanner.nextLine(); //to consume the new line character after reading integer.
		
		System.out.print("Enter Student Name:");
		
		studentName=scanner.nextLine();
		System.out.print("Enter Marks in Subject1:");
		subject1=scanner.nextFloat();
		System.out.print("Enter Marks in Subject2:");
		subject2=scanner.nextFloat();
		System.out.print("Enter Marks in Subject1:");
		subject3=scanner.nextFloat();
		scanner.close();
		
		student.getStuData(sID,studentName);
		student.getStuMarks(subject1,subject2,subject3);
		student.totalMarks();
	}
}

/* Enter Student ID:2345
Enter Student Name:Test Name
Enter Marks in Subject1:20
Enter Marks in Subject2:30
Enter Marks in Subject1:10
SID:2345
Name:Test Name
Total marks:60.0 */
