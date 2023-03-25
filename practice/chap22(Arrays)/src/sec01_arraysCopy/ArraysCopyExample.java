package sec01_arraysCopy;

import java.util.Arrays;

public class ArraysCopyExample {

	public static void main(String[] args) {

		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// 배열 복사 1 - copyOf()사용
		long start = 0L;
		long end = 0L;

		start = System.nanoTime();
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		end = System.nanoTime();

		System.out.println("copyOf()의 속도" + (end - start));
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		// 배열 복사 2 - copyOfRange()사용
		start = System.nanoTime();
		char[] arr3 = Arrays.copyOfRange(arr1, 0, 4);
		end = System.nanoTime();

		System.out.println("copyOfRange()의 속도" + (end - start));
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr3 : " + Arrays.toString(arr3));

		// 배열복사 3 - system클래스의 arraycopy()사용
		char[] arr4 = new char[arr1.length];
		start = System.nanoTime();
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		end = System.nanoTime();

		System.out.println("system클래스의 arraycopy" + (end - start));
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr4 : " + Arrays.toString(arr3));

		// 반복문을 이용한 출력
		start = System.nanoTime();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		end = System.nanoTime();

		System.out.println("C타입 반복문 출력 속도" + (end - start));

		// 향상된 for 문을 이용한 출력
		start = System.nanoTime();
		// 향상된 for문은 (가져올 타입 : 가져올 장소 (주소)) -->향상된 for문의 원형
		for (char ch : arr1) {
			System.out.println(ch);
		}
		end = System.nanoTime();

		System.out.println("향상된 반복문 출력 속도" + (end - start));

	}

}
