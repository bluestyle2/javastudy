package collection_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set ss1 = new HashSet();
		ArrayList arr = new ArrayList();
		
		Object [] ooArr = {11,43,22,11,34,22,43,1,'1',"1",49,1,43,22};	
		
		for (Object obj : ooArr) {
			ss1.add(obj);
			arr.add(obj);
		}
		
		System.out.println("ss1:"+ss1);
		System.out.println("arr:"+arr);
	}

}
