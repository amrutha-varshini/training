public class GenTry
{
	public static void main(String[] args)
	{
		Container<String> a=new Container<>();
		a.getObj();
	}
}
class Container<T> 
{
	private T obj;
	public T getObj() 
	{
		System.out.println("in generic");
		return obj;
	}
	public String getObj() 
	{
		System.out.println("in normal");
		return "hi";
	}
	public void setObj(T obj) 
	{
		this.obj = obj;
	}
}