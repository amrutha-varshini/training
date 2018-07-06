package Access;

/*import Access1.arithmetic3; //generates CTE. arithmetic3 is not public in access1*/
import Access1.arithmetic2;

public class classes
{
	private int a;
	public int b;
	int c;
	protected int d;
	private int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	protected int mul(int a,int b)
	{
		return a*b;
	}
	int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args)
	{
		arithmetic2 c2=new arithmetic2();
		/*c2.a=10;//can't access private instance variable of another class from another package*/
		c2.b=10;
		/*c2.c=10;//can't access default instance variable of another class from another package*/
		/*c2.d=10;//can't access protected instance variables of another class from another package*/
		/*System.out.println(c2.add(5,10));//can't access private method of another class from another package*/
		System.out.println(c2.sub(5,10));
		/*System.out.println(c2.mul(5,10));//can't access default method of another class from another package*/
		/*System.out.println(c2.div(5,10));//can't access protected methods of another class from another package*/
		classes c=new classes();
		c.a=10;
		c.b=10;
		c.c=10;
		c.d=10;
		System.out.println(c.add(5,10));
		System.out.println(c.sub(5,10));
		System.out.println(c.mul(5,10));
		System.out.println(c.div(5,10));
		arithmetic1 a=new arithmetic1();
		/*a.a=10; //can't access private instance variable of another class*/
		a.b=10;
		a.c=10;
		a.d=10;
		/*System.out.println(a.add(5,10)); // can't access private method of another class*/ 
		System.out.println(a.sub(5,10));
		System.out.println(a.mul(5,10));
		System.out.println(a.div(5,10));
		arithmetic4 a1=new arithmetic4();
		/*a1.a=10; //can't access private instance variable of another class*/
		a1.b=10;
		a1.c=10;
		a1.d=10;
		/*System.out.println(a1.add(5,10)); // can't access private method of another class*/ 
		System.out.println(a1.sub(5,10));
		System.out.println(a1.mul(5,10));
		System.out.println(a1.div(5,10));
		test t=new test();
		t.callme();
		test1 t1=new test1();
		t1.callme();
	}
}
class test extends arithmetic2
{
	void callme()
	{
		arithmetic2 c2=new arithmetic2();
		/*c2.a=10;//can't access private instance variable of another class from another package*/
		c2.b=10;
		/*c2.c=10;//can't access default instance variable of another class from another package*/
		/*c2.d=10;//can't access protected instance variables of another class from another package*/
		/*System.out.println(c2.add(5,10));//can't access private method of another class from another package*/
		System.out.println(c2.sub(5,10));
		/*System.out.println(c2.mul(5,10));//can't access default method of another class from another package*/
		/*System.out.println(c2.div(5,10));//can't access protected methods of another class from another package*/
		test c1=new test();
			/*c1.a=10;//can't access private instance variable of another class from another package*/
			c1.b=10;
			//c1.c=10;//can't access default instance variable of another class from another package*/
			c1.d=10;//can't access protected instance variables of another class from another package*/
			/*System.out.println(c1.add(5,10));//can't access private method of another class from another package*/
			System.out.println(c1.sub(5,10));
			System.out.println(c1.mul(5,10));//can't access default method of another class from another package*/
			//System.out.println(c1.div(5,10));//can't access protected methods of another class from another package*/
	}
}
class test1 extends arithmetic1
{	
		void callme()
		{
			System.out.println(b);
			arithmetic1 c2=new arithmetic1();
			/*c2.a=10;//can't access private instance variable of another class from another package*/
			c2.b=10;
			c2.c=10;//can't access default instance variable of another class from another package*/
			c2.d=10;//can't access protected instance variables of another class from another package*/
			/*System.out.println(c2.add(5,10));//can't access private method of another class from another package*/
			System.out.println(c2.sub(5,10));
			System.out.println(c2.mul(5,10));//can't access default method of another class from another package*/
			System.out.println(c2.div(5,10));//can't access protected methods of another class from another package*/
			test1 c1=new test1();
			/*c1.a=10;//can't access private instance variable of another class from another package*/
			c1.b=10;
			c1.c=10;//can't access default instance variable of another class from another package*/
			c1.d=10;//can't access protected instance variables of another class from another package*/
			/*System.out.println(c1.add(5,10));//can't access private method of another class from another package*/
			System.out.println(c1.sub(5,10));
			System.out.println(c1.mul(5,10));//can't access default method of another class from another package*/
			System.out.println(c1.div(5,10));//can't access protected methods of another class from another package*/
		}
}