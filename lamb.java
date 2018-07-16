class lamb
{
	public static void main(String[] args)
	{
		ImplementMe a=()->System.out.println("Hello");
		ImplementMe b=()->System.out.println("Hi");
		a.display();
		b.display();
	}
}
interface ImplementMe
{
	void display();
}