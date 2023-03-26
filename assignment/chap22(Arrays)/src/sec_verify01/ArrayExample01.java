package sec_verify01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1차원 배열의 방수를 입력 : ");
		int sec = sc.nextInt();

		int[] arr = new int[sec];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("입력하신 배열 값을 출력합니다.");
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		System.out.print("어떤 값을 찾으십니까 >> ");
		int serch = sc.nextInt();
		int index = Arrays.binarySearch(arr, serch);
		System.out.println(serch + "은 arr배열의" + index + "번째 방에 있습니다.");

		sc.close();

	}

}
