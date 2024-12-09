package Assignment3;

public class Student {
	int SID;
	String Sname = new String();
	float Sub1, Sub2, Sub3, totalMarks;
	
	void getStuData(int SID, String Sname)
	{
		this.SID=SID;
		this.Sname=Sname;
	}
	 
	void getStuMarks(float Sub1, float Sub2, float Sub3)
	{
		this.Sub1=Sub1;
		this.Sub2=Sub2;
		this.Sub3=Sub3;
	}
	void totalMarks()
	{
		totalMarks=Sub1+Sub2+Sub3;
		System.out.println("SID:"+SID+"\nName:"+Sname+"\nTotal marks:"+totalMarks);
	}
}
