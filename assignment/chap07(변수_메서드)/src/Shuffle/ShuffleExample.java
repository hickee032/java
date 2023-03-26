package Shuffle;

import java.util.Arrays;

public class ShuffleExample {

	public static void main(String[] args) {

		Shuffle c = new Shuffle();
		// 클래스에 저장된 배열의 주소값도 불러올수있다.
		// int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("배열값을 섞기 전 상태입니다.");
		System.out.println(Arrays.toString(c.original));

		Shuffle.shuffle(c.original);

		System.out.println("배열값을 섞은 후 상태입니다.");
		System.out.println(Arrays.toString(c.original));

	}

}
