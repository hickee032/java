package Shuffle;

import java.util.Arrays;

public class ShuffleExample {

	public static void main(String[] args) {

		Shuffle c = new Shuffle();
		// Ŭ������ ����� �迭�� �ּҰ��� �ҷ��ü��ִ�.
		// int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("�迭���� ���� �� �����Դϴ�.");
		System.out.println(Arrays.toString(c.original));

		Shuffle.shuffle(c.original);

		System.out.println("�迭���� ���� �� �����Դϴ�.");
		System.out.println(Arrays.toString(c.original));

	}

}
