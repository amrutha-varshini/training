class A
{
	void display()
	{
		System.out.println("hi");
	}
	/*static void display(A a)
	{
		System.out.println("static hi");
	}*///CTE
}
class InterProb
{
	public static void main(String[] args)
	{
		I i=A::display;
		A a1=new A();
		i.show(a1);
	}
}
interface I
{
	void show(A a);
}
class A1 extends A
{
	void display()
	{
		System.out.println("hello");
	}
}