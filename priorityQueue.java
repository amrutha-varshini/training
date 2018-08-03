import java.util.*;
public class priorityQueue
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> a=new PriorityQueue<>();
		System.out.println(a.add(1));
		System.out.println(a.add(2));
		System.out.println(a.add(3));
		System.out.println(a.add(4));		
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		//System.out.println(a.remove());
		System.out.println(a.add(1));
		System.out.println(a.add(2));
		System.out.println(a.add(3));
		System.out.println(a.add(4));
		System.out.println(a.element());
		for(int i:a)
			System.out.println(i);
		
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.offer(2));
		System.out.println(a.offer(3));
		System.out.println(a.offer(4));
		System.out.println(a.poll());
		System.out.println(a.poll());
		System.out.println(a.poll());
		System.out.println(a.peek());
	}
}