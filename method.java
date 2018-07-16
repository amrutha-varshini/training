public class method
{
	public static void main(String[] args)
	{
		ExtendMe e=new ExtendMe();
		ImplementMe a=ExtendMe::StatDisplay;
		//ImplementMe b=ImplementMe::display;
		ImplementMe c=e::display;
		ImplementMe d=ExtendMe::new;
		a.display();
		//b.display();
		c.display();
		d.display();
	}
}
interface ImplementMe
{
	void display();
}
class ExtendMe
{
	void display()
	{
		System.out.println("Hello");
	}
	static void StatDisplay()
	{
		System.out.println("static Hello");
	}
	ExtendMe()
	{
		System.out.println("Constructor Hello");
	}
}