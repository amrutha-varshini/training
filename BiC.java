import java.util.function.*;
public class BiC
{
	public static void main(String args[]) 
	{
		UseMeToo a=new UseMeToo(5);
		UseMeToo b=new UseMeToo(3);
		BiConsumer<UseMeToo,UseMeToo> c=(p,q)->{UseMe.a=p.a;UseMe.b=q.a;};
		c.accept(a,b);
		System.out.println(UseMe.a+" "+UseMe.b);
	}
}
class UseMe
{
	static int a,b;
}
class UseMeToo
{
	int a;
	UseMeToo(int i)
	{
		a=i;
	}
}