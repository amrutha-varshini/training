public class cond
{
	public static void main(String[] args)
	{
		int a=10,b=5,c[]={1,2,3};
		if(a>b)
			System.out.println("a is greater");
		else if(a==b)
			System.out.println("both are equal");
		else 
			System.out.println("b is greater");
		switch(b)
		{
			case 1:System.out.println("b is 1");
					break;
			case 2:System.out.println("b is 2");
					break;
			case 3:System.out.println("b is 3");
					break;
			case 4:System.out.println("b is 4");
					break;
			case 5:System.out.println("b is 5");
					break;
			default:System.out.println("b is out of bound");
		}
		while(b>3)
			b--;
		System.out.println(b);
		do
		{
			a--;
		}while(a>6);
		System.out.println(a);
		for(int i=0;i<5;i++)
			System.out.println(i);
		for(int x:c)
			System.out.println(x);
	}
}