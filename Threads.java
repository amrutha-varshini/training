class Threads
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("This is main thread");
		Check check=new Check();
		check.run();
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("Main thread is done");
	}
}
class Check implements Runnable
{
	Thread t;
	Check()
	{
		t=new Thread(this,"Another");
		//t.start();
	}
	public void run() 
	{
		System.out.println("This is another thread");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{}
		System.out.println("Another thread is done");
	}
}