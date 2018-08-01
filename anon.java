abstract class Outer 
{
	int outer_x = 100;
	abstract void display();
}
public class anon 
{
	public static void main(String args[]) 
	{
		int i=5;
		i=6;
		Outer outer = new Outer()
		{
			void display() 
			{
				System.out.println(i);
			}
		};
		outer.display();
	}
}