import java.util.*;
import java.util.stream.*;
public class Stream17
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.stream().peek((t)->{t=1;}).forEach((t)->{System.out.println(t);});
	}
}