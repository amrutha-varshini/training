class Threads6
{
	public static void main(String[] args) throws InterruptedException
	{
		Resource r=new Resource();
		Producer p=new Producer(r);
		Consumer c=new Consumer(r);
		/*try
		{
			c.t.join();
			p.t.join();
		}
		catch(Exception e){}*/
	}
}
class Resource
{
	int n;
	boolean valueset;
	synchronized int get()
	{
		if(!valueset)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{}
		}
		System.out.println("get "+n);
		valueset=false;
		notify();
		return n;
	}
	synchronized void put(int i)
	{
		if(valueset)
		{
			try
			{
			wait();
			}
			catch(Exception e)
			{}
		}
		n=i;
		valueset=true;
		notify();
		System.out.println("put "+n);
	}
}
class Producer implements Runnable
{
	Thread t;
	Resource r;
	Producer(Resource r)
	{
		this.r=r;
		t=new Thread(this,"Producer");
		t.start();
	}
	public void run() 
	{
		int i=0;
		while(i<7)
			r.put(i++);
	}
}
class Consumer implements Runnable
{
	Thread t;
	Resource r;
	Consumer(Resource r)
	{
		this.r=r;
		t=new Thread(this,"Consumer");
		t.start();
	}
	public void run() 
	{
		int i;
		do
		{
			i=r.get();
		}
		while(i<6);
			
	}
}