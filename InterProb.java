//CTE
abstract class B2
{
	abstract void show();
}
public class InterProb
{
	public static void main(String[] args)
	{
		B2 c=()->{System.out.println("hi");};
		c.show();
	}
}