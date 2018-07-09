class Outer 
{
	static int outer_x = 100;
	void test() 
	{
		Inner.display();
	}
	// this is an inner class
	static class Inner 
	{
		static void display() 
		{
			System.out.println("display: outer_x = " + outer_x);
		}
	}
}
public class statinner 
{
	public static void main(String args[]) 
	{
		Outer outer = new Outer();
		outer.test();
	}
}