package homework_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29  
2의 배수, 3의 배수, 5의 배수로 나누어 ArrayList 로 정리하세요
*/

public class Study14 {

	public static void main(String[] args) {
		int [] arrmain = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29};
		List arr2 = new ArrayList();
		List arr3 = new ArrayList();
		List arr5 = new ArrayList();
		
		/*
		arrmain.add(23);
		arrmain.add(45);
		arrmain.add(46);
		arrmain.add(50);
		arrmain.add(10);
		arrmain.add(25);
		arrmain.add(32);
		arrmain.add(8);
		arrmain.add(120);
		arrmain.add(11);
		arrmain.add(67); int a = 12;
		String  = a; 
		divide = a;
		arrmain.add(89);
		arrmain.add(22);
		arrmain.add(43);
		arrmain.add(61);
		arrmain.add(29);*/
		
		for (int i = 0; i < arrmain.length; i++) {
			
			if (arrmain[i] % 2 == 0)
				arr2.add(arrmain[i]);
			
			if (arrmain[i] % 3 == 0)
				arr3.add(arrmain[i]);
			
			if (arrmain[i] % 5 == 0)
				arr5.add(arrmain[i]);
		}
		Collections.sort(arr2);
		System.out.println("2의 배수 : "+arr2);
		Collections.sort(arr3);
		System.out.println("3의 배수 : "+arr3);
		Collections.sort(arr5);
		System.out.println("4의 배수 : "+arr5);

	}

}
