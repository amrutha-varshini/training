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
	void test() throws NoSuchFieldException
	{
		throw new NoSuchFieldException("its me");
	}
}