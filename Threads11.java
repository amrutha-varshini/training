class Threads11
{
	public static void main(String[] args) throws InterruptedException
	{
		TestSync ts=new TestSync();
		Check check1=new Check("1",ts);
		Check check2=new Check("2",ts);
		Check check3=new Check("3",ts);
		Check check4=new Check("4",ts);
		//ts.meth1();
	}
}
class Check implements Runnable
{
	Thread t;
	TestSync ts;
	Check(String str,TestSync ts)
	{
		this.ts=ts;
		t=new Thread(this,str);
		t.start();
	}
	public void run()
	{
		try
		{
			/*static synchronized void myblock()
			{
				ts.meth2();
			}
			synchronized(TestSync.class)
			{
				ts.meth2();
			}	
			synchronized void myblock()
			{
				ts.meth2();
			}*/
			synchronized(ts)
			{
				ts.meth2();
			}	
		}
		catch(Exception e)
		{
			
		}
	}
}
class TestSync	
{
	synchronized static void meth1() throws InterruptedException
	{
		System.out.println("sync static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("sync static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
	}
	static void meth2() throws InterruptedException
	{
		System.out.println("static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
	}
	synchronized void meth3() throws InterruptedException
	{
		System.out.println("sync non static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("sync non static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
	}
	void meth4() throws InterruptedException
	{
		System.out.println("non static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
		System.out.println("non static1 "+Thread.currentThread().getName());
		Thread.sleep(2000);
	}
}