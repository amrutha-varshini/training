class UseStatic 
{
	int a ;
	final int b;
	static void meth(int x) 
	{
		System.out.println("x = " + x);
		//System.out.println("a = " + a);
	}
	void show()
	{
		System.out.println("b = " + b);
	}
	UseStatic(int a)
	{
		this.a = a;
		b = this.a * 4;
	}
	UseStatic()
	{
		a = 3;
		b = a * 4;
	}
	static 
	{
		System.out.println("Static block initialized.");
		
	}
	public static void main(String args[]) 
	{
		final UseStatic a=new UseStatic();
		UseStatic a1=new UseStatic(5);
		a1.show();
		a.show();
		meth(42);
	}
}