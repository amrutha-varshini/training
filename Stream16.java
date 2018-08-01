import java.util.*;
import java.util.stream.*;
public class Stream16
{
	public static void main(String[] args)
	{
		Integer c=1;
		int[] a=new int[]{1,2,3,4,5};
		System.out.println(Stream.of(1,2,3,4,5).count());
	}
}