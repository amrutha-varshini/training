public class GenTry1
{
	public static void main(String[] args)
	{
		Container a=new Container();
		A a1=new A1();
		a.setObj(a1);
	}
}
class Container 
{
	public <T extends Number>void setObj(T obj) 
	{
		System.out.println(obj.getClass().getName());
	}
}
class A
{
}
class A1 extends A
{
}