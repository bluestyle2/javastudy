package collection_p;

import java.util.HashSet;

public class BaseBallListMe {

	public static void main(String[] args) {
		 HashSet a1 = new HashSet();
		 
		
		 a1.add("박재상");
		 a1.add("박정권");
		 a1.add("최정");
		 a1.add("김광현");
		 a1.add("엄정욱");
		 a1.add("박희수");
		 a1.add("이호준");
		 HashSet a2 = new HashSet();
		 a2.add("이호준");
		 a2.add("엄정욱");
		 a2.add("박재홍");
		 a2.add("이신협");
		 a2.add("장동건");
		 HashSet fa = new HashSet();
		 fa.add("이병규");
		 fa.add("이승엽");
		 fa.add("박정권");
		 fa.add("장동건");
		 fa.add("박용택");
		 fa.add("홍성흔");
		 

		 
		 System.out.println("변경후");
		 
		 HashSet afa1 = new HashSet(a1);
		 
		 afa1.removeAll(a2);
		 afa1.removeAll(fa);
		 
		 		System.out.println(afa1);
		 
		 HashSet afa2 = new HashSet(a2);
		 
		 	afa2.removeAll(fa);
		 
		 		System.out.println(afa2);
		 
		 HashSet affa = new HashSet(fa);
		 
		 	affa.removeAll(a2);
		 	affa.removeAll(a1);
		 		System.out.println(affa);
	}

}
//기존의 야구팀원리스트--------> 1군리스트
//2군리스트
//FA리스트----> FA 가능 리스트

//1군 리스트  박재상, 박정권, 최정, 김광현, 엄정욱, 박희수, 이호준
//2군 리스트  이호준 , 엄정욱, 박재홍, 이신협, 장동건
//FA리스트  이병규,이승엽, 박정권, 장동건, 박용택, 홍성흔

//---------------------------------------------------------------------------------------

//1군      박재상, 최정, 김광현, 박희수
//2군      이호준 , 엄정욱, 박재홍, 이신협, 

//FA 가능  이병규,이승엽, 박용택, 홍성흔
