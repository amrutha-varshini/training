//CTE
public class generics
{
	public static void main(String[] args)
	{
		A<String> a1=new A<>(5);
		a1.getT("");
	}
}
class A<T>
{
	<X>A(X x)
	{
	}
	void getT (T t)
	{
	}
}