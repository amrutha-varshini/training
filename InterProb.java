abstract class A
{
	abstract void show();
}
interface B
{
	default void show()
	{
		System.out.println("hi");
	}
}
interface B1 extends B
{
}
interface B2 extends B
{
	default void show()
	{
		System.out.println("hello");
	}
}
class C implements B1, B2
{
}
public class InterProb
{
	public static void main(String[] args)
	{
		C c=new C();
		c.show();
	}
}