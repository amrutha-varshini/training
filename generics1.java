//CTE
public class generics
{
	public static void main(String[] args)
	{
		A<T extends Integer> intList = new A<>();
		A1<T extends Number>  numList = intList; 
	}
}
class A1<A extends Number>
{
	<X>A(X x)
	{
	}
	void getT (A t)
	{
	}
}
class A<T extends Integer>
{
	<X>A(X x)
	{
	}
	void getT (T t)
	{
	}
}