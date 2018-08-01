import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
public class Stream10
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(3);
		a.add(4);
		a.stream().flatMap((i)->{return Stream.of(i*i);}).forEach(t->{System.out.println(t);});
		a.stream().flatMapToInt((i)->{return IntStream.of(i*i);}).forEach(t->{System.out.println(t);});
		a.stream().flatMapToDouble((i)->{return DoubleStream.of(i*i);}).forEach(t->{System.out.println(t);});
		a.stream().flatMapToLong((i)->{return LongStream.of(i*i);}).forEach(t->{System.out.println(t);});
		a.stream().map((i)->{return Stream.of(i*i);}).forEach(t->{System.out.println(t);});
		a.stream().mapToInt((i)->{return (int)(i*i);}).forEach(t->{System.out.println(t);});
		a.stream().mapToDouble((i)->{return (double)(i*i);}).forEach(t->{System.out.println(t);});
		a.stream().mapToLong((i)->{return (long)(i*i);}).forEach(t->{System.out.println(t);});
	}
}