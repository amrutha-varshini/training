public class tern
{
	public static void main(String[] args)
	{
		int a=10;
		int b=5;
		//byte d=(a>b)?a:b; CTE
		int c=(a>b)?add(a,b):sub(a,b);
		System.out.println(c);
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int sub(int a, int b)
	{
		return a-b;
	}
}