public class method
{
	public static void main(String[] args)
	{
		ExtendMe e=new ExtendMe();
		ImplementMe b=ExtendMe::display;
		b.display(e,3);
	}
}
interface ImplementMe
{
	void display(ExtendMe a,int b);
}
class ExtendMe
{
	void display(int a)
	{
		System.out.println("Hello");
	}
}