public class generics
{
	public static void main(String[] args)
	{
		B b=new B();
		C c=new C();
		A a1=new A(b);
		A a2=new A(c);
	}
}
class A<T>
{
	T t;
	A(T t)
	{
		this.t=t;
	}
	T getT ()
	{
		return this.t;
	}
}
class B
{
}
class C
{
}