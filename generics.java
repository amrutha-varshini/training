public class generics
{
	public static void main(String[] args)
	{
		B b=new B();
		C c=new C();
		A<B> a1=new A<>();
		A<C> a2=new A<>();
		A a3=a1;
	}
}
class A<T>
{
	T t;
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