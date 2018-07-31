public class Int1
{
	public static void main(String[] args)
	{
		TryMe t=new TryMe();
		t.equals(t);
	}
}
class ExtendMe
{
	public boolean equals(Object o)
	{
		System.out.println(o.getClass().getName());
		return true;
	}
}
class TryMe extends ExtendMe
{
	public boolean equals(Object o)
	{
		super.equals(o);
		return true;
	}
}