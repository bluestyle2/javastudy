package collection_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorMain {

	public static void main(String[] args) {
		int [] arr = {34,56,32,12,23,78,90,78,90,56,32};

		ArrayList list = new ArrayList();
		HashSet set = new HashSet();
		
		for (int i : arr) {
			list.add(i);
			set.add(i);
		}
		System.out.println("list:"+list);
		System.out.println("set:"+set);
		
		System.out.println("set------");
		for (Object oo : set) {
			
			if(oo.equals(12)) {
				
			}
			System.out.println(oo);
		}
		System.out.println("list------------");
		for (Object oo : list) {
			if(oo.equals(12)) {
				
			}
			System.out.println(oo);		
	}
		System.out.println("Iterator list-------");
		Iterator it = list.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		while(it.hasNext()) {
		Object oo = it.next();
		if(oo.equals(12)) {
			 it.remove();
		}
		System.out.println(oo);
	}
		System.out.println("Iterator set-------");
		it = set.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		while(it.hasNext()) {
			
			Object oo = it.next();
			if(oo.equals(12)) {
				 it.remove();
			}
			System.out.println(oo);
		}
		System.out.println("ListIterator list-------");
		ListIterator lit = list.listIterator();
		
		while(lit.hasNext()) {
		Object oo = lit.next();
		
		System.out.println(oo);
	}
		
	}
}

