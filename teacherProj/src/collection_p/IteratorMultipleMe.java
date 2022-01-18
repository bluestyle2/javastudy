package collection_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorMultipleMe {

	public static void main(String[] args) {
			int [] nums = {34,56,12,43,90,89,654,43,21234,675,45};
			
			ArrayList list =new ArrayList();
			
			for (int i : nums) {
			list.add(i);	
			}
			System.out.println(list);
			Iterator it = list.iterator();
	}

}
