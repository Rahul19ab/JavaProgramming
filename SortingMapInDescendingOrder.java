import java.util.Hashtable;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SortingMapInDescendingOrder {

	public static void main(String[] args) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		ht.put(1,35000);
		ht.put(7,55000);
		ht.put(2,30000);
		ht.put(4,45000);
		ht.put(6,40000);
		ht.put(3,32000);
		ht.put(5,50000);
		ht.put(8,44000);
		
//		Set<Integer> s = ht.keySet();
//		Iterator<Integer> itr = s.iterator();
//		while(itr.hasNext())
//		{
//			Integer key = itr.next();
//			System.out.println("key"+" "+key+" "+"values"+" "+ht.get(key));
//		}
//		
		Map<Integer,Integer> tm= new TreeMap<Integer,Integer>(Collections.reverseOrder());
		tm.putAll(ht);
		Set<Integer> key1 =tm.keySet();
		Iterator <Integer> itr = key1.iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			System.out.println("key"+" "+key+" "+"values"+" "+ht.get(key));
			
		}
		Collection<Integer>c = tm.values();
		for(Integer i :c)
		{
			System.out.println(i);
		}
		
		

	}

}
