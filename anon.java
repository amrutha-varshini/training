abstract class Outer 
{
	int outer_x = 100;
	abstract void display();
}
public class anon 
{
	public static void main(String args[]) 
	{
		Outer outer = new Outer()
		{
			void display() 
			{
				System.out.println("display: outer_x = " + outer_x);
			}
		};
		outer.display();
	}
}