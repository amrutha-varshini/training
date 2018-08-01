import java.util.*;
import java.util.stream.Stream;
import java.util.function.Consumer;
public class Stream9
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(3);
		a.add(4);
		System.out.println(a.stream().findFirst().get());
	}
}