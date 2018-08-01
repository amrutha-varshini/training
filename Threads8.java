public class Threads8
{
	public static void main(String[] args)
	{
		new Thread1(); 
	}
}
class Thread1 implements Runnable
{
	Thread t;
	Thread1()
	{
		Thread.UncaughtExceptionHandler a=new Thread.UncaughtExceptionHandler()
		{
			public void uncaughtException(Thread t, Throwable th)
			{
				System.out.println("caught in main thread");
			}
		};
		t=new Thread(this,"Thread1");
		t.setUncaughtExceptionHandler(a);
		t.start();
	}
	public void run() 
	{
		try
		{
			throw new NullPointerException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught in thread");
		}
	}
}