import java.util.*;
public class collector2
{
	public static void main(String[] args)
	{
		Collection<Integer> i=new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(3);
		for(Integer i1:i)
			System.out.println(i1);
	}
}