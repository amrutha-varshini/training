public class cons
{
	public static void main(String[] args)
	{
		B b=new B();
		b.display();
	}
}
class OP
{
	
}
interface OP1
{
	default void display()
	{}
}
class B extends OP
{
	void display()
	{
		class A
		{
			void display()
			{
				System.out.println("inside B");
			}
		}
	}
}