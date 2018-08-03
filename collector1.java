import java.util.*;
public class collector1
{
	public static void main(String[] args)
	{
		Collection i=new ArrayList();
		i.add(1);
		i.add(2);
		i.add(3);
		i.stream().forEach((t)->{System.out.println(t);});
	}
}