//CTE
public class generics
{
	public static void main(String[] args)
	{
		A<String> a1=new A<>();
		a1.getT(5);
	}
}
class A<T extends Number>
{
	void getT (T t)
	{
	}
}