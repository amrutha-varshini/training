class mytry
{
	public static void main(String[] args)
	{
		Box<?>[] b=new Box[5];
		Box<Integer> a1=new Box();
		Box<String> a2=new Box();
		b[0]=a1;
		b[1]=a2;
	}
}
class Box<T>
{
	T o;
}