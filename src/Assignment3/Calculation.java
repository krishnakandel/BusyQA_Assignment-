package Assignment3;

public class Calculation {
	int var1, var2, var3, total;
	
	Calculation(int first, int second, int third)
	{
		var1=first;
		var2=second;
		var3=third;
	}
	void sum()
	{
		total=var1+var2+var3;
		System.out.println("The sum of the numbers is:"+total);
	}
}
