public class Wrap1 implements Cloneable
{
	private int a;
	Wrap1(int o)
	{
		a=o;
	}
	Wrap1 Clone()
	{
		Wrap1 obj;
		try
		{
			obj=(Wrap1)super.clone();
			return obj;
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("caught");
		}
		return null;
		
	}
	void test()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		Wrap1 a=new Wrap1(1);
		try
		{
			Wrap1 b;
			b=(Wrap1)a.clone();
			b.test();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("caught");
		}
	}
}