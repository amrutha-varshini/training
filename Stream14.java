import java.util.*;
import java.util.stream.*;
public class Stream14
{
	public static void main(String[] args)
	{
		Integer c=1;
		List<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a.stream().max((t,u)->{if((int)t>(int)u)return 1;if((int)t==(int)u)return 0;return -1;}).get());
		System.out.println(a.stream().min((t,u)->{if((int)t>(int)u)return 1;if((int)t==(int)u)return 0;return -1;}).get());
	}
}