//doesn't generate CTE.

public class diffSwitch
{
	public static void main(String[] args)
	{
		byte a=10;
		int b=0;
		char c='a';
		switch(b)
		{
			case 256:System.out.println("works!!");
				break;
			case 'a':System.out.println("works again!!");
				break;
			default: System.out.println("doesn't work");
		}
	}
}