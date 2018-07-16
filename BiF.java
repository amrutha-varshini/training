import java.util.function.*;
public class BiF
{
	public static void main(String args[]) 
	{
		UseMeToo a=new UseMeToo(5);
		UseMe3 b=new UseMe3(3);
		BiFunction<UseMeToo,UseMe3,UseMe> c=(p,q)->{int m= p.a+q.a;UseMe l=new UseMe(); l.a=m; return l;};
		UseMe d=c.apply(a,b);
		System.out.println(d.a);
	}
}
class UseMe
{
	int a;
}
class UseMeToo
{
	int a;
	UseMeToo(int i)
	{
		a=i;
	}
}
class UseMe3
{
	int a;
	UseMe3(int i)
	{
		a=i;
	}
}