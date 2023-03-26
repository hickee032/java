package Assignment;

import java.util.Arrays;

public class ReferenceParamArrayExample {

	public static void main(String[] args) {

		int[] arr = new int[] { 3, 2, 1, 6, 5, 4 };

		printArr(arr);

		sortArr(arr);

		Arrsum(arr);

	}

	static void printArr(int[] arr) {
		System.out.println("정렬 전 배열값입니다.");
		System.out.println(Arrays.toString(arr));

	}

	static void sortArr(int[] arr) {
		System.out.println("\n정렬 후 배열값입니다.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			// System.out.println();
		}
		System.out.println(Arrays.toString(arr));
	}

	static void Arrsum(int[] arr) {
		System.out.println("\n배열의 합계입니다.");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
