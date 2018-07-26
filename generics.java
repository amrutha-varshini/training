//CTE
public class generics
{
	public static void main(String[] args)
	{
		A<String> a1=new A<>();
		A<Integer> a2=new A<>();
	}
}
class A<T>
{
	void getT (T t)
	{
	}
}
class A1<T extends Integer> extends A<T>
{
	void getT (T t)
	{
	}
}