package sec_verify01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1���� �迭�� ����� �Է� : ");
		int sec = sc.nextInt();

		int[] arr = new int[sec];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("�Է��Ͻ� �迭 ���� ����մϴ�.");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		System.out.print("� ���� ã���ʴϱ� >> ");
		int serch = sc.nextInt();
		int index = Arrays.binarySearch(arr, serch);
		System.out.println(serch + "�� arr�迭��" + index + "��° �濡 �ֽ��ϴ�.");

		sc.close();

	}

}
