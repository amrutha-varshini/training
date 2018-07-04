public class op
{
	public static void main(String[] args)
	{
		int a=10,b=5;
		boolean c=true,d=false;
		
		//arithmetic operator
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(b++);
		System.out.println(++b);
		
		//relational operator
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>b);
		System.out.println(a>=b);
		
		//logical operator
		
		System.out.println(c&&d);
		System.out.println(c||d);
		System.out.println(!c);
		
		//bitwise operator
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		System.out.println(a^b);
		System.out.println(a>>2);
		System.out.println(a<<2);
		System.out.println(a>>>2);
		
		//ternary operator
		int e=(a>b)?a:b;
		System.out.println(e);
	}
}