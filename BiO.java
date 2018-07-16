import java.util.function.*;
public class BiO
{
	public static void main(String args[]) 
	{
		UseMeToo a=new UseMeToo(5);
		UseMeToo b=new UseMeToo(5);
		BinaryOperator<UseMeToo> c=(p,q)->{int m= p.a+q.a;UseMeToo l=new UseMeToo(); l.a=m; return l;};
		UseMeToo d=c.apply(a,b);
		System.out.println(d.a);
	}
}
class UseMeToo
{
	int a;
	UseMeToo()
	{}
	UseMeToo(int i)
	{
		a=i;
	}
}