import java.util.*;
public class hashMap
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> a=new HashMap<>();
		HashMap<Integer,Map<Integer,String>> b=new HashMap<>();
		System.out.println(a.put(1,"one"));
		System.out.println(a.put(2,"two"));
		System.out.println(a.put(3,"four"));
		System.out.println(a.put(3,"three"));
		a.forEach((k,v)->{if(k==3) a.put(k,"hello");});
		a.forEach((k,v)->{System.out.println(k+"->"+v);});
		System.out.println(a.compute(3, (k,v)->{return "three";}));
		a.forEach((k,v)->{System.out.println(k+"->"+v);});
		b.put(1,a);
		System.out.println(b.get(1));
		a.entrySet();
		System.out.println(a);
		a.replace(4,"four");
		HashMap<Integer,String> a1=(HashMap)a.clone();
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
	}
}
/*clear()
containsKey(Object key)
containsValue(Object value)
entrySet()
forEach(BiConsumer<? super K,? super V> action)
get(Object key)
getOrDefault(Object key, V defaultValue)
hashCode()
isEmpty()
keySet()
merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
put(K key, V value)
putAll(Map<? extends K,? extends V> m)
putIfAbsent(K key, V value)
remove(Object key)
remove(Object key, Object value)
replace(K key, V value)
replace(K key, V oldValue, V newValue)
replaceAll(BiFunction<? super K,? super V,? extends V> function)
size()
values()*/