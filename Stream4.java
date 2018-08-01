import java.util.*;
import java.util.stream.Stream;
import java.util.function.Consumer;
public class Stream4
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		List<Integer> b=new ArrayList<>();
		b.add(3);
		b.add(4);
		System.out.println(Stream.concat(a.stream(),b.stream()).count());
	}
}