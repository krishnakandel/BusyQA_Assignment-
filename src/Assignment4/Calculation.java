package Assignment4;

public class Calculation implements InterfaceA, InterfaceB {
	   int sum,mul;
	
	   @Override
	   public void sum()
	   {
	   	sum=a+b;
	   	
	   	System.out.println("The sum of two number defined in InterfaceA is:"+sum);
	   }
	   
	   @Override
	   public void mul()
	   {
	   	mul=x*y;
	   	
	   	System.out.println("The multiplication of two number defined in InterfaceB is:"+mul);
	   }
	   
}
