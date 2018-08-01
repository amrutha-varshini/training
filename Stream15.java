import java.util.*;
import java.util.stream.*;
public class Stream15
{
	public static void main(String[] args)
	{
		Integer c=1;
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a.stream().noneMatch((t)->{if(t==5) return true;return false;}));
	}
}