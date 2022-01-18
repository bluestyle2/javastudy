package homework_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;
/*
 * 국어 영어 수학 시험을 구현해야한다. 시험문제가 들어가고 그 시험문제를 풀때 타이머 작동한다.
	
 * 국어문제를 풀면 영어문제를 풀고 그다음 수학문제를 풀어야 하는데 그걸 어떻게 해야할까...
 * 5명이니까 호출해서 써야하나?....
 * 한 쓰레드안에 국어 영어 수학 시험을 구현해보자
 * 그 후 시험문제 풀때 입력한 값을 문제의답안지와 일치한지 확인하고 점수를 매긴다.
 * true면 몇점이런식으로... 아니면 다른방법이 없을까..?
 * 점수를 매긴후 점수값을 더한값이 총점 나눈값이 평균
 * 
 * 과목의 틀린문제는 이퀄즈로 비교 true면 정답 false 오답
 * 어레이리스트에 문제당 점수넣고 그걸 합쳐서 하려고했는데 까먹었습니다..ㅜㅜ
 */



class TestLaData{
	
	boolean res = false;
	boolean pchk = false;
	String qq , ans, correct;
	int score;
	

	public TestLaData(String qq, String correct, int score) {
		
		super();		
		this.correct = correct;
		this.qq = qq;
		this.score = score;
	}
	
	void play(TestTimer timer) {
		
		ans = JOptionPane.showInputDialog(qq);
		
		if(timer.chk) {
			ans = null;
			return;
		}
		
		res = correct.equals(ans);
		
	}
	
	public String toString( ) {
		return qq + ": " + ans + "(" + correct + ") =>" + res+ "점수"+score;
	}
}
class TestEngData{
	
	boolean res2 = false;
	
	String qq2 , ans2, correct2;
	int score2;
	

	public TestEngData(String qq2, String correct2, int score2) {
		
		super();
		this.correct2 = correct2;
		this.qq2 = qq2;
		this.score2 = score2;
	}
	
	void play(TestTimer timer) {
		
		ans2 = JOptionPane.showInputDialog(qq2);
		
		if(timer.chk) {
			ans2 = null;
			return;
		}
		
		res2 = correct2.equals(ans2);
		
	}
	
	public String toString( ) {
		return qq2 + ": " + ans2 + "(" + correct2 + ") =>" + res2+"점수"+score2;
	}
}

class TestMathData{
	
	boolean res3 = false;
	
	String qq3 , ans3, correct3;
	int score3;
	

	public TestMathData(String qq3, String correct3,int score3) {
		
		super();		
		this.correct3 = correct3;
		this.qq3 = qq3;
		this.score3 = score3;
	}
	
	void play(TestTimer timer) {
		
		ans3 = JOptionPane.showInputDialog(qq3);
		
		if(timer.chk) {
			
			ans3 = null;
			
			return;
		}
		
		res3 = correct3.equals(ans3);
	}
	
	public String toString( ) {
		
		return qq3 + ": " + ans3 + "(" + correct3 + ") =>" + res3 + "점수"+score3;
	}
}
class TestLa extends Thread{
	

	ArrayList<TestLaData> arr;
	ArrayList<TestEngData> arr2;
	ArrayList<TestMathData> arr3;
	
	TestTimer timer;
		
	public TestLa(TestTimer timer) {
		super();
		this.timer = timer;
	
		arr = new ArrayList();
		arr2 = new ArrayList();
		arr3 = new ArrayList();
		
		arr.add(new TestLaData("닭도리탕은 잘못된언어이다. 올바른 말은?","닭볶음탕",20));
		arr.add(new TestLaData("생활 능력이 없는 사람을 돌보다의 뜻","부양",20));
		arr.add(new TestLaData("오뎅의 올바른 말은?","어묵",20));
		arr.add(new TestLaData("나아갈 수도 물러설 수도 없는 궁지(窮地)에 빠짐을 뜻하는 사자성어","진퇴양난",20));
		arr.add(new TestLaData("'도끼를 갈아 바늘을 만든다'는 뜻으로, 끊임없는 노력과 끈기 있는 인내로 성공하고야 만다는 뜻","마부위침",20));
		
		arr2.add(new TestEngData("apple의 뜻은?","사과",20));
		arr2.add(new TestEngData("strawberry의 뜻은?","딸기",20));
		arr2.add(new TestEngData("12 O'clock의 뜻은?","12시",20));
		arr2.add(new TestEngData("have의 제3인칭은?","has",20));
		arr2.add(new TestEngData("is not의 축약형","isn't",20));
		
		arr3.add(new TestMathData("1+1은?","2",20));
		arr3.add(new TestMathData("1+2은?","3",20));
		arr3.add(new TestMathData("1+3은?","4",20));
		arr3.add(new TestMathData("1+4은?","5",20));
		arr3.add(new TestMathData("123곱하기 0은?","0",20));
		
		
	}
	public void run() {
		
		for (TestLaData lan : arr) {
			
			
			lan.play(timer);
			if(timer.chk)
				break;
	}
		
		System.out.println("국어시험 종료");
		
		for (TestLaData lan : arr) {
			System.out.println(lan);
		}
		
		for (TestEngData lan2 : arr2) {
			
			
			lan2.play(timer);
			if(timer.chk)
				break;
	}
		
		System.out.println("영어시험 종료");
		
		for (TestEngData lan2 : arr2) {
			System.out.println(lan2);
		}
		for (TestMathData lan3 : arr3) {
			
			
			lan3.play(timer);
			if(timer.chk)
				break;
	}
		timer.chk = true;
		System.out.println("수학시험 종료");
		
		for (TestMathData lan3 : arr3) {
			System.out.println(lan3);
		}
	}
}

class TestTimer extends Thread{
	
	boolean chk = false;
	
	public void run() {
		
		for (int i = 20; i >= 0; i--) {
			
			try {
				
				
				
				sleep(1000);
				
				if(chk)
					break;
				
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		chk = true;
		System.out.println("시험이 끝났습니다.");
	}
}

class chkpoint{
	
}
	
public class Study16 {
	 public static void main(String[] args) {
	TestTimer tt = new TestTimer();
	TestLa stu1 = new TestLa(tt);
	
	tt.start();
	stu1.start();
	
}
}
/*국어,영어, 수학 시험을 구현하세요

각 과목은 타이머를 각각 가지고 있을 것
총점, 평균을 계산할 것

과목의 틀린 문제와 맞힌 문제를 알려줄것


학생 수 5명 처리할 것
*/