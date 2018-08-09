import java.util.*;
public class hashSet
{
	public static void main(String[] args)
	{
		LinkedList<Integer> a=new LinkedList<>();
		Integer[] d=new Integer[2];
		a.addFirst(1);
		a.addLast(2);
		a.addFirst(4);
		a.addLast(4);
		HashSet<Integer> b=new HashSet<>();
		b.addAll(a);
		b.removeIf((t)->{if(t==1)return true;return false;});
		b.forEach(System.out::println);
		System.out.println(b.toString());
		System.out.println(b.add(5));
		System.out.println(b.add(3));
		System.out.println(b.add(4));
		Integer[] c=b.toArray(d);
		for(Integer i:c)
			System.out.println(i);
	}
}
/*
clear()
clone()
contains(Object o)
isEmpty()
iterator()
removeAll()
containsAll()
retainAll()
*/