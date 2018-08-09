import java.util.*;
public class collector1
{
	public static void main(String[] args)
	{
		Map<Integer,Map<Integer,String>> j=new HashMap();
		Map<Integer,String> i=new HashMap();
		i.put(1,"one");
		i.put(2,"two");
		i.put(3,"three");
		j.put(1,i);
		j.values().stream().forEach(System.out::println);
	}
}