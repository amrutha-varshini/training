import java.io.*;
class except
{
	public static void main(String[] args)
	{
			except e=new except();
			e.test();
	}
	void test() 
	{
		try(FileInputStream fin = new FileInputStream("AA.class"))
		{
			except1 a=new except1();
			a.initCause(new ArithmeticException());
			System.out.println("inside try1");
			try
			{
				throw new ArithmeticException();
			}
			catch(ArithmeticException e)
			{
				throw a;
			}
		}
		catch (Exception | except1 e)
		{
			System.out.println("inside 1 catch");
			System.out.println(e.getCause());
		}
	}
}
class something extends except
{
	@Override
	void test(){}
}
class except1 extends Throwable
{
}