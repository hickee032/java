package sec02_exam_RandomExample;

import java.util.Random;

public class SeedExample {

	public static void main(String[] args) {
		
		/*
		 * Math.random()과 Random클래스의 가장 큰 차이점은 무엇인가? 
		 * Random클래스는 종자seed값을 설정 할수 있다.
		 * seed값이 같으면 항상 같은 랜덤수를 발생시킨다.
		 */

		Random rand1 = new Random();
		Random rand2 = new Random(1);
		Random rand3 = new Random(2);

		System.out.println("rand1의 값 (항상 다른값 현재시간을 기준으로 난수 발생)");

		for (int i = 0; i < 5; i++) {

			int num = Math.abs(rand1.nextInt() % 10) + 1; // 1~10까지
			System.out.println(num);

		}
		System.out.println();

		System.out.println("rand2의 값 (항상 같은 수 반환 - seed값이 존재하므로)");

		for (int i = 0; i < 5; i++) {

			int num = Math.abs(rand2.nextInt() % 10) + 1;
			System.out.println(num);

		}
		System.out.println();

		System.out.println("rand3의 값 (항상 같은 수 반환 - seed값이 존재하므로)");

		for (int i = 0; i < 5; i++) {

			int num = Math.abs(rand3.nextInt() % 10) + 1;
			System.out.println(num);

		}
	}

}
