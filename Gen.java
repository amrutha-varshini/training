public class Gen
{
	public static void main(String[] args)
	{
		ObjectContainer<? super Integer> o=new ObjectContainer<Number>();
		o.setObj(new Integer(5));
	}
}
interface A
{
}
class ObjectContainer<T> 
{
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}