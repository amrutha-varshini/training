import Access1.*;

public class BooleanTest
{
	Boolean a,b;
	Byte c,d;
	Character e,f;
	Double g,h;
	Float i,j;
	Integer k,l;
	Long m,n;
	Short o,p;
	void test()
	{
		Integer b=a;
		//a=6;
		if(a==b)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	public static void main(String[] args)
	{
		new BooleanTest().test();
	}
}
