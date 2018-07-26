public class Gen
{
	public static void main(String[] args)
	{
		//ObjectContainer<Integer> o=new ObjectContainer<Integer>();
	//	o=new ObjectContainer<Integer>();
		//o.setObj(5);
		//int me=o.getObj();
		//System.out.println(me);
	}
}
interface A
{
}
class ObjectContainer<T extends Number & A > 
{
	private T obj;
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
}