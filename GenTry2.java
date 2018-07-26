public class GenTry2
{
	public static void main(String[] args)
	{
		Container<Integer> a=new Container<>();
		a.setObj(5);
		int a1=a.getObj();
	}
}
class Container <T extends Number>
{
	T obj;
	 void setObj(T o) 
	{
		obj=o;
	}
	T getObj()
	{ 
		return obj;
	}
}
