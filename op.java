public class op
{
	public static void main(String[] args)
	{
		op c=new op();
		op d=new op();
		//char e='6';
		//int c=10,d=5;
		//boolean c=true,d=false;
		
		//arithmetic operator
		System.out.println(c+d);
		System.out.println(c-d);
		System.out.println(c*d);
		System.out.println(c/d);
		System.out.println(c%d);
		System.out.println(c++);
		System.out.println(++c);
		System.out.println(d++);
		System.out.println(++d);
		
		//relational operator
		
		System.out.println(c==d);
		System.out.println(c!=d);
		System.out.println(c<d);
		System.out.println(c<=d);
		System.out.println(c>d);
		System.out.println(c>=d);
		
		//logical operator
		
		System.out.println(c&&d);
		System.out.println(c||d);
		System.out.println(!c);
		
		//bitwise operator
		System.out.println(c&d);
		System.out.println(c|d);
		System.out.println(~c);
		System.out.println(c^d);
		System.out.println(c>>2);
		System.out.println(c<<2);
		System.out.println(c>>>2);
		
		//ternary operator
		int f=(c>d)?c:d;
		System.out.println(e);
	}
}