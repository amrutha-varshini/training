class except
{
	private int a;
	public static void main(String[] args)
	{
		try
		{
			except1 e=new except1();
			e.test();
		}
		catch (Exception e)
		{
			System.out.println("inside main catch");
			System.out.println(e);
		}
	}
}
class except1
{
	void test()// throws NoSuchFieldException
	{
		try
		{
			
			System.out.println("inside try1");
			throw new SecurityException("its me");
		}
		catch (Exception e)
		{
			System.out.println("inside 1 catch");
			System.out.println(e);
			throw e;
		}
		finally
		{
			System.out.println("inside finally");
			SecurityException e=new SecurityException();
			System.out.println(e);
			throw e;
		}
		//System.out.println("outside");
	}
}