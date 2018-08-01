import java.util.*;
import java.util.stream.*;
public class Stream13
{
	public static void main(String[] args)
	{
		Integer c=1;
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Stream.iterate(c,((b)->{return 3+b;})).limit(4).forEach((t)->{System.out.println(t);});
	}
}