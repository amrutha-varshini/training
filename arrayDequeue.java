import java.util.*;
public class arrayDequeue
{
	public static void main(String[] args)
	{
		LinkedList<Integer> a=new LinkedList<>();
		System.out.println(a.addFirst(1));
		System.out.println(a.addLast(2));
		System.out.println(a.addFirst(3));
		System.out.println(a.addLast(4));		
		System.out.println(a.removeFirst());
		System.out.println(a.removeLast());
		//System.out.println(a.remove());
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		System.out.println(a.offerFirst(2));
		System.out.println(a.offerLast(3));
		System.out.println(a.pollFirst());
		System.out.println(a.pollLast());
		System.out.println(a.peekFirst());
		System.out.println(a.peekLast());
	}
}