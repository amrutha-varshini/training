import java.util.Scanner;
//gives runtime error if value goes out of bound
public class byteToInt
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		byte b=input.nextByte();
		System.out.println(b);
	}
}