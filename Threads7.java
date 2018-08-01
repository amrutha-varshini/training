class Threads7
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread1 p=new Thread1();
	}
}
class Resource
{
	synchronized void get(Resource r) throws InterruptedException
	{
		Thread.sleep(1000);
		r.callme(); 
	}
	synchronized void callme()
	{
		System.out.println("hi");
	}
}
class Thread1 implements Runnable
{
	Thread t;
	Resource r1=new Resource();
	Resource r2=new Resource();
	Thread1()
	{
		t=new Thread(this,"Thread1");
		t.start();
		try
		{
			r2.get(r1);
		}
		catch(Exception e){}
	}
	public void run() 
	{
		try
		{
			r1.get(r2);
		}
		catch(Exception e){}
	}
}