public class methods
{
	public static void main(String[] args)
	{
		int a=5;
		String b="hello";
		int[] c={1,2,3};
		change(a);
		System.out.println(a);
		change(b);
		System.out.println(b);
		change(c);
		for(int x:c)
			System.out.println(x);
	}
	static void change(int a)
	{
		a=6;
	}
	static void change(int[] a)
	{
		a[2]=4;
	}
	static void change(String a)
	{
		a="hi";
	}
}