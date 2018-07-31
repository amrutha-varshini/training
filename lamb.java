class lamb
{
	public static void main(String[] args)
	{
		Another a=new Another();
		a.implement(()->System.out.println("Hello"));
		a.implement(()->System.out.println("Hi"));
	}
}
interface ImplementMe
{
	void display();
}
class Another
{
	void implement(ImplementMe a)
	{
		a.display();
	}
}