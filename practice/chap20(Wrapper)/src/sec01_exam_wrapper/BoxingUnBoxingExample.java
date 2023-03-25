package sec01_exam_wrapper;

import java.util.Vector;

public class BoxingUnBoxingExample {
	// 컬렉션 프레인 워크로 인해서 등장하게 되었다.
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		// Boxing - 기본형 타입의 변수를 클래스로 포장하는 것

		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = 100; // auto Boxing 컴파일시 new integer(100);

		v.add(obj1);
		System.out.println("Vector" + v.get(0));

		// 여기서 기억해야할 사항은 obj1~4까지는 **클래스** 이다.
		System.out.println("Boxing after");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);

		// UnBoxing - 클래스 타입을 기본형 타입으로 바꾸는 것

		int value1 = obj1.intValue();
		int value2 = obj2;// auto UnBoxing
		int value3 = obj3.intValue();
		int value4 = obj4;// auto UnBoxing

		v.add(obj1);
		v.add(100); // auto Boxing code
					// new integer(100)과 동일 하다.

		for (int value : v) {
			System.out.println("Vector에 들어 있는 값 : " + value);

		}

		System.out.println("UnBoxing after");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

	}

}
