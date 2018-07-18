public class generics
{
	public static void main(String[] args)
	{
		A a1=new A();
		a1.<Integer>getT(5);
	}
}
class A
{
	<T>void getT (T t)
	{
	}
}