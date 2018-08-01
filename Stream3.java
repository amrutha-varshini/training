import java.util.*;
import java.util.function.Predicate;
public class Stream3
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a.stream().count());
	}
}