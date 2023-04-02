package java220914;

import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {
		/* for문 */

//		for (int i = 0; /*제어변수*/ i < args.length; /*조건문*/ i++/*제어변수 제어*/) {
//			
//		}

		/* 1단부터 N단 까지 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int n = sc.nextInt();
		 * 
		 * System.out.println(n);
		 * 
		 * for (int i = 1; i < n + 1; i++) {
		 * 
		 * for (int j = 1; j <= 9; j++) {
		 * 
		 * System.out.println(i + " * " + j + " = " + (i * j));
		 * 
		 * }
		 * 
		 * } sc.close();
		 */

		Scanner sc = new Scanner(System.in);

		double total = 0;
		System.out.print("학생 수를 입력하세요 : ");
		int num = sc.nextInt(); // 학생수

		/*
		 * for (int i = 1; i < num + 1; i++) {
		 * 
		 * // 입력 받기 System.out.print(i + "번 학생의 점수 입력 : "); int score = sc.nextInt();
		 * total += score;
		 * 
		 * }
		 */
		int i = 1;

		while (i <= num) {
			System.out.print(i + "번 학생의 점수 입력 : ");
			double score = sc.nextDouble();
			total += score;
			i++;
		}

		System.out.println("점수의 총합 : " + total);
		System.out.println("학생들의 평균 점수 : " + (total / num));

		sc.close();
	}

}
