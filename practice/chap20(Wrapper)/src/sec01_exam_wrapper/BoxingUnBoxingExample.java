package sec01_exam_wrapper;

import java.util.Vector;

public class BoxingUnBoxingExample {
	// �÷��� ������ ��ũ�� ���ؼ� �����ϰ� �Ǿ���.
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		// Boxing - �⺻�� Ÿ���� ������ Ŭ������ �����ϴ� ��

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = 100; // auto Boxing �����Ͻ� new integer(100);

		v.add(obj1);
		System.out.println("Vector" + v.get(0));

		// ���⼭ ����ؾ��� ������ obj1~4������ **Ŭ����** �̴�.
		System.out.println("Boxing after");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);

		// UnBoxing - Ŭ���� Ÿ���� �⺻�� Ÿ������ �ٲٴ� ��

		int value1 = obj1.intValue();
		int value2 = obj2;// auto UnBoxing
		int value3 = obj3.intValue();
		int value4 = obj4;// auto UnBoxing

		v.add(obj1);
		v.add(100); // auto Boxing code
					// new integer(100)�� ���� �ϴ�.

		for (int value : v) {
			System.out.println("Vector�� ��� �ִ� �� : " + value);

		}

		System.out.println("UnBoxing after");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}

}
