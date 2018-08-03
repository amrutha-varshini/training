import java.util.*;
public class collector3
{
	public static void main(String[] args)
	{
		Collection<Integer> i=new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(3);
		for(Iterator i1=i.iterator();i1.hasNext();)
			System.out.println(i1.next());
	}
}