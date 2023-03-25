package sec01_arraysCopy;

import java.util.Arrays;

public class ArraysCopyExample {

	public static void main(String[] args) {

		char[] arr1 = { 'J', 'A', 'V', 'A' };

		// �迭 ���� 1 - copyOf()���
		long start = 0L;
		long end = 0L;

		start = System.nanoTime();
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		end = System.nanoTime();

		System.out.println("copyOf()�� �ӵ�" + (end - start));
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));

		// �迭 ���� 2 - copyOfRange()���
		start = System.nanoTime();
		char[] arr3 = Arrays.copyOfRange(arr1, 0, 4);
		end = System.nanoTime();

		System.out.println("copyOfRange()�� �ӵ�" + (end - start));
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr3 : " + Arrays.toString(arr3));

		// �迭���� 3 - systemŬ������ arraycopy()���
		char[] arr4 = new char[arr1.length];
		start = System.nanoTime();
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		end = System.nanoTime();

		System.out.println("systemŬ������ arraycopy" + (end - start));
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr4 : " + Arrays.toString(arr3));

		// �ݺ����� �̿��� ���
		start = System.nanoTime();
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		end = System.nanoTime();

		System.out.println("CŸ�� �ݺ��� ��� �ӵ�" + (end - start));

		// ���� for ���� �̿��� ���
		start = System.nanoTime();
		// ���� for���� (������ Ÿ�� : ������ ��� (�ּ�)) -->���� for���� ����
		for (char ch : arr1) {
			System.out.println(ch);
		}
		end = System.nanoTime();

		System.out.println("���� �ݺ��� ��� �ӵ�" + (end - start));

	}

}
