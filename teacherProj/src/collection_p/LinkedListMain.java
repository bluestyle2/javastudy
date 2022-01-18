package collection_p;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	static void add_1(String name, List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 800000; i++) {
			list.add(1234);
		}
		
		System.out.println(name+" 순차추가:"+(System.currentTimeMillis()-start));
	}
	
	static void add_2(String name, List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 4000; i++) {
			list.add(100, 1234);
		}
		
		System.out.println(name+" 비순차추가:"+(System.currentTimeMillis()-start));
	}
	
	static void remove_2(String name, List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 4000; i++) {
			list.remove(100);
		}
		
		System.out.println(name+" 순차삭제:"+(System.currentTimeMillis()-start));
	}
	
	
	public static void main(String[] args) {
	
		ArrayList arr = new ArrayList();
		LinkedList link = new LinkedList();
		
		add_1("ArrayList",arr);
		add_1("LinkedList",link);
		
		add_2("ArrayList",arr);
		add_2("LinkedList",link);
		
		remove_2("ArrayList",arr);
		remove_2("LinkedList",link);
	}

}
