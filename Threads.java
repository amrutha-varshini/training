class Threads
{
	public static void main(String[] args) throws InterruptedException
	{
		Check check1=new Check("1");
		Check check2=new Check("2");
		Check check3=new Check("3");
		Check check4=new Check("4");
		Check check5=new Check("5");
		Check check6=new Check("6");
		Check check7=new Check("7");
		Check check8=new Check("8");
		Check check9=new Check("9");
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
		callme();
	}
	synchronized static void callme()
	{
		//try
		//{
			//synchronized(Check.class)
			{
				for(int i=0;i<5;i++)
				{
					System.out.println(Thread.currentThread()+" "+i);
					//Thread.currentThread().sleep(10);
				}
			}
		//}
		//catch(InterruptedException e)
		//{}
	}
}