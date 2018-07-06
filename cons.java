public class cons
{
	public static void main(String[] args)
	{
		mathematics m1=new mathematics();
		mathematics m2=new mathematics(2);
		mathematics m3=new mathematics(2,3);
		mathematics m4=new mathematics(2,3,4);//CTE
	}
}
class mathematics
{
	int op1,op2;
	mathematics ()
	{
		System.out.println("Inside default constructor");
	}
	mathematics (int a, int...b)
	{
		for(int x:b)
			System.out.println(x);
		System.out.println("Inside varag parameterized constructor");
	}
}