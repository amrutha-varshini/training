class Counter 
{
    private int c = 0;
    public void increment() 
	{
        c++;
    }
    public void decrement() 
	{
        c--;
    }
    public int value() 
	{
        return c;
    }
}
public class Threads10
{
	public static void main(String[] args) throws InterruptedException
	{
		Counter c=new Counter();
		inc check1=new inc("inc",c);
		dec check2=new dec("dec",c);
		try
		{
			check1.t.join();
			check2.t.join();
		}
		catch(Exception e){}
		System.out.println(c.value());
	}
}
class inc implements Runnable
{
	Thread t;
	Counter c;
	inc(String str, Counter c1)
	{
		c=c1;
		t=new Thread(this,str);
		t.start();
	}
	public void run() 
	{
		int i=0;
		while(i<5)
		{
			c.increment();
			System.out.println(Thread.currentThread()+" "+c.value());
			i++;
		}
	}
}
class dec implements Runnable
{
	Thread t;
	Counter c;
	dec(String str, Counter c1)
	{
		c=c1;
		t=new Thread(this,str);
		t.start();
	}
	public void run() 
	{
		int i=0;
		while(i<5)
		{
			c.decrement();
			System.out.println(Thread.currentThread()+" "+c.value());
			i++;
		}
	}
}