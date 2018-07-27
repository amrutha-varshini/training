class Threads2
{
	public static void main(String[] args) throws InterruptedException
	{
		Check check1=new Check("one");
		Check check2=new Check("two");
		Check check3=new Check("three");
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
	void msg(String s)
	{
		System.out.println(s);
	}
}
class Check implements Runnable
{
	Thread t;
	Check(String str)
	{
		t=new Thread(this,str);
		t.start();
	}
	public void run() 
	{
		try
		{
			Resource r=new Resource();
			r.msg(t+"h");
			Thread.sleep(500);
			r.msg(t+"i");
		}
		catch(InterruptedException e)
		{}
	}
}