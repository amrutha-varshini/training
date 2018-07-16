abstract class A
{
	abstract void show();
}
interface B1
{
	default void show()
	{
		System.out.println("hi");
	}
}
class B2
{
	public void show()
	{
		System.out.println("hello");
	}
}
class C extends B2 implements B1
{
	
}
public class InterProb
{
	public static void main(String[] args)
	{
		B1 c=new C();
		c.show();
	}
}