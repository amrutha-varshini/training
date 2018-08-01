class test1
{
	public static void main(String[] args)
	{
		A a=()->System.out.println("hi");
	}
}
@FunctionalInterface
interface A
{
	public boolean equals(Object obj);
	public final Class getClass();
}