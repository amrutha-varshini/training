import java.util.*;
import java.util.function.Predicate;
public class Stream11
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.stream().forEach(t->{System.out.println(t);});
		a.stream().forEachOrdered(t->{System.out.println(t);});
	}
}