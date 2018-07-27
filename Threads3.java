class Threads3
{
	public static void main(String[] args) throws InterruptedException
	{
		Check check1=new Check("one","hi");
		Check check2=new Check("two","hello");
		Check check3=new Check("three","welcome");
		try
		{
			check1.t.join();
			check2.t.join();
			check3.t.join();
		}
		catch(Exception e){}
	}
}
class Resource
{
	synchronized void msg(String s)
	{
		System.out.println(s);
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{}
		System.out.println("[");
	}
}
class Check implements Runnable
{
	Thread t;
	String m;
	static Resource r=new Resource();
	Check(String str,String msg)
	{
		m=msg;
		t=new Thread(this,str);
		t.start();
	}
	public void run() 
	{
		r.msg(m);
	}
}