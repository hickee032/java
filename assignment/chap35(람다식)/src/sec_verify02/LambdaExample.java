package sec_verify02;

import java.util.Scanner;

public class LambdaExample {
	private static int[] array;
	private static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		maxNumber man = null;

		System.out.print("몇개의 수를 입력하실꺼? >> ");
		int arrSize = sc.nextInt();

		array = new int[arrSize];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "번째수 ");
			int num = sc.nextInt();
			array[i] = num;

		}
		man = (array) -> {
			for (int i = 0; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
				}
			}
			return max;
		};
		
		System.out.println("\n가장 큰 수는" + man.maxNum(array) + "입니다.");
		sc.close();
	}

}
