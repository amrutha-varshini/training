public class Check
{
	public static void main(String[] args)
	{
		B b=new B();
	}
}
class A
{
	static int a;
	void meth(float a)
	{}
}
class B extends A
{
	static int a,b;
	static{
		a=2;
		b=3;
	}
	B()
	{
		meth(a);
	}
}