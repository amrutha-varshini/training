class outer
{
	int a;
	class inner
	{
		int b;
		void test(int i)
		{
			a=i;
		}
		void show()
		{
			System.out.println(a+" "+b);
		}
	}
}
public class test1
{
	public static void main(String[] args)
	{
		outer o=new outer();
		outer.inner i1=o.new inner();
		outer.inner i2=o.new inner();
		i1.b=10;
		i1.test(11);
		i2.test(10);
		i1.show();
		o=null;
		i1.show();
		
	}
}