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
interface B2
{
	default void show()
	{
		System.out.println("hello");
	}
}
class C implements B1, B2
{
	public void show()
	{
		B1.super.show();
	}
}
public class InterProb
{
	public static void main(String[] args)
	{
		C c=new C();
		c.show();
	}
}