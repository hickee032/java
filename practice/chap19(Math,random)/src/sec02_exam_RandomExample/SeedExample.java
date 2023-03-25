package sec02_exam_RandomExample;

import java.util.Random;

public class SeedExample {

	public static void main(String[] args) {
		
		/*
		 * Math.random()�� RandomŬ������ ���� ū �������� �����ΰ�? 
		 * RandomŬ������ ����seed���� ���� �Ҽ� �ִ�.
		 * seed���� ������ �׻� ���� �������� �߻���Ų��.
		 */

		Random rand1 = new Random();
		Random rand2 = new Random(1);
		Random rand3 = new Random(2);

		System.out.println("rand1�� �� (�׻� �ٸ��� ����ð��� �������� ���� �߻�)");

		for (int i = 0; i < 5; i++) {

			int num = Math.abs(rand1.nextInt() % 10) + 1; // 1~10����
			System.out.println(num);

		}
		System.out.println();

		System.out.println("rand2�� �� (�׻� ���� �� ��ȯ - seed���� �����ϹǷ�)");

		for (int i = 0; i < 5; i++) {

			int num = Math.abs(rand2.nextInt() % 10) + 1;
			System.out.println(num);

		}
		System.out.println();

		System.out.println("rand3�� �� (�׻� ���� �� ��ȯ - seed���� �����ϹǷ�)");

		for (int i = 0; i < 5; i++) {

			int num = Math.abs(rand3.nextInt() % 10) + 1;
			System.out.println(num);

		}
	}

}
