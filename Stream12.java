import java.util.*;
import java.util.stream.*;
public class Stream12
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(Stream.generate(()->{return 1;}).limit(4).count());
	}
}