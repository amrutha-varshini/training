import java.util.Scanner;

public class Input
{
	public static void main(String[] args)
	{
		int a;
		String b,c,d;
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		a=input.nextInt();
		System.out.println("you entered "+a);
		System.out.println("enter 3 strings");
		b=input.next();
		c=input.next();
		d=input.next();
		System.out.println("you entered "+b+" "+c+" "+d);
	}
}