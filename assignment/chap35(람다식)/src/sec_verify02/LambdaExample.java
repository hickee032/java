package sec_verify02;

import java.util.Scanner;

public class LambdaExample {
	private static int[] array;
	private static int max = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		maxNumber man = null;

		System.out.print("��� ���� �Է��Ͻǲ�? >> ");
		int arrSize = sc.nextInt();

		array = new int[arrSize];
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "��°�� ");
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
		
		System.out.println("\n���� ū ����" + man.maxNum(array) + "�Դϴ�.");
		sc.close();
	}

}
