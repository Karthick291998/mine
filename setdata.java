package dataStruct;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class setdata {
	public static void main(String[] args)
	{
		Map<Integer,Integer> num=new TreeMap<Integer,Integer>();
		num.put(15, 100);
		num.put(11, 101);
		num.put(20,77);
		Map<Integer,Integer> num1=new TreeMap<Integer,Integer>();
		num1.put(13, 400);
		num1.put(8, 21);
		num1.put(14,775);
		Set<Integer> key=num.keySet();
		System.out.println(key);
		Collection<Integer> values=num.values();
		System.out.println(values);
		Set<Entry<Integer,Integer>> bn=num1.entrySet();
		for(Entry<Integer,Integer> i:bn)
		{
			System.out.println(i);
		}
		/*boolean bool4=num.removeAll(num1);
		System.out.println(num);
		boolean bool=num.equals(num1);
		System.out.println(bool);
		boolean bool2=num.isEmpty();
		System.out.println(bool2);
		boolean bool1=num.retainAll(num1);
		System.out.println(num);
		
		*/
	/*	for(Integer ite:num)
		{
			System.out.println(ite);
		}
		Collections.sort(num);
		ListIterator<Integer> x=num.listIterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		while(x.hasPrevious())
		{
			System.out.println(x.previous());
		}
	*/	
	}

}
