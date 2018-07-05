package arith;

public class pack
{
	public static void main(String[] args)
	{
		arithmetic a=new arithmetic();
		int c=a.add(5,6);
		System.out.println(c);
	}
}
class arithmetic
{
	int add(int a, int b)
	{
		return a+b;
	}
	int sub(int a, int b)
	{
		return a-b;
	}
	int mul(int a, int b)
	{
		return a*b;
	}
	int div(int a,int b)
	{
		if(b!=0)
			return a/b;
		System.out.println("divide by 0 error");
		return -1;
	}
}