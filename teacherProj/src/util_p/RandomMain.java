package util_p;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println(rd.nextBoolean());
		System.out.println(rd.nextDouble());
		System.out.println(rd.nextFloat());
		System.out.println(rd.nextGaussian());
		System.out.println(rd.nextInt());
		
		System.out.println(rd.nextInt(4));
		
		System.out.println("");
		
		Random rd1 = new Random();
		Random rd2 = new Random(35);
		Random rd3 = new Random(35);
		Random rd4 = new Random(40);
		
		System.out.println("rd1");
		for (int i = 0; i < 5; i++) {
			System.out.println(rd1.nextInt());
		}
		System.out.println("rd2");
		for (int i = 0; i < 5; i++) {
			System.out.println(rd2.nextInt());
		}
		System.out.println("rd3");
		for (int i = 0; i < 5; i++) {
			System.out.println(rd3.nextInt());
		}
		System.out.println("rd4");
		for (int i = 0; i < 5; i++) {
			System.out.println(rd4.nextInt());
		}
	}

}
