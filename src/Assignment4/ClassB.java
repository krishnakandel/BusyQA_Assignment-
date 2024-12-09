package Assignment4;

public class ClassB implements InterfaceA {
   int sum;
@Override
public void sum()
{
	sum=a+b;
	
	System.out.println("The sum of two number defined in the interface is:"+sum);
}

}
