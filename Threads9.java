public class Threads9
{
	public static void main(String[] args)
	{
		new Thread1(5); 
		new Thread1(6);
	}
}
class ABCD
{
	ThreadLocal tl=new ThreadLocal();
	void callme(int my)
	{
		tl.set(my);
		System.out.println((int)tl.get());
	}
}	
class Thread1 implements Runnable
{
	Thread t;
	int my;
	static ABCD a=new ABCD();
	Thread1(int i)
	{
		t=new Thread(this,"Thread1");
		my=i;
		t.start();
	}
	public void run() 
	{
		a.callme(my);
	}
}