public class Super
{
	public static void main(String[] args)
	{
		supertest a=new supertest();
		supertest b=new test();
		supertest c=new subtest();
		test d=new test();
		subtest e=new subtest();
		a.callme();
		b.callme();
		c.callme();
		//b.scallme();CTE
		//c.scallme();CTE
		d.scallme();
		e.scallme();
	}
}
class supertest
{
	int a;
	supertest()
	{
		System.out.println("in supertest");
		a=5;
	}
	void callme()
	{
		System.out.println("in supertest");
		System.out.println(a);
	}
}
class test extends supertest
{
	test()
	{
		super();
		System.out.println("in test");
	}
	void callme()
	{
		System.out.println("in test");
		System.out.println(a);
	}
	void scallme()
	{
		super.callme();
	}
}
class subtest extends test
{
	subtest()
	{
		super();
		System.out.println("in subtest");
	}
	void callme()
	{
		System.out.println("in subtest");
		System.out.println(a);
	}
	void scallme()
	{
		super.scallme();
	}
}