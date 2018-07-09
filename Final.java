public class Final
{
	public static void main(String[] args)
	{
		test a=new test();
		/*a.a=6; //CTE*/
		a.callme();
	}
}
class supertest
{
	final int a=5;
	final void callme()
	{
		System.out.println(a);
	}
}
final class test extends supertest
{
	/*void callme()
	{
		System.out.println(a);
	}*/
}
/*class subtest extends test
{
	void callme()
	{
		System.out.println(a);
	}
}
*/