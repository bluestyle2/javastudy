package collection_p;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		
		
		Map mm1 = new HashMap();
		//create, update
		mm1.put("red", 100);
		mm1.put("green", 300);
		mm1.put("blue", 500);
		mm1.put("pink", 200);
		mm1.put("red", 700);
		mm1.put("black", 500);
		mm1.put("red", 600);
		mm1.put("green", 200);
		//read
		System.out.println(mm1);
		
		System.out.println(mm1.get(600));
		System.out.println(mm1.get("red"));
		System.out.println(mm1.get("green"));
		System.out.println(mm1.get("blue"));
		System.out.println(mm1.get("pink"));
		System.out.println(mm1.get("black"));
		
		//delete
		mm1.remove("blue"); //key로 삭제
		
		System.out.println(mm1);
		//있는지 없는지 확인
		System.out.println(mm1.containsKey("red"));
		System.out.println(mm1.containsKey("yellow"));
		System.out.println(mm1.containsValue(600));
		System.out.println(mm1.containsValue(777));
		System.out.println(mm1.size());
		/*
		for (Object oo : mm1) {
			
		}*/
		
		//Iterator it = mm1.iterator();
		System.out.println("---------------------------------------");
		Set kk = mm1.keySet();
		System.out.println(kk);
		System.out.println("---------------------------------------");
		Collection vv = mm1.values();
		System.out.println(vv);
		
		Set ee = mm1.entrySet();
		System.out.println(ee);
	
		for (Object obj : ee) {
			Map.Entry me = (Map.Entry)obj;
			//System.out.println(obj);
			System.out.println(me.getKey()+";"+me.getValue());
		}
	}

}
