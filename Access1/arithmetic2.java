public class arithmetic2
{
	public static void main(String[] args)
	{
		B a  =B.createB();
		System.out.println(a.a);
	}
	static 
	{
		System.out.println("arith2 stat block");
	}
	
}
class A
{
	
	static 
	{
		System.out.println("A stat block");
	}
}
class B extends A
{
	
	int a;
	static B createB()
	{
		B b  =new B();
		return b;
	}
	abstract B()
	{
		a=1;
	}
	static 
	{
		System.out.println("B stat block");
	}
}