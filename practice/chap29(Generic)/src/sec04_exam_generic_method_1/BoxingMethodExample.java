package sec04_exam_generic_method_1;

public class BoxingMethodExample {

	public static void main(String[] args) {

		// Utill 클래스의 boxing 메서드 정적 메서드이면서 제네릭 메서드이다.
		// 아래와 같이 타입을 지정(integer)지정 해줘야한다.
		// 정해진 타입에 의해 <T>가 결정 되어진다.
		// Box<Integer> box = Utill.<Integer>boxing(new Integer(100)); <--정석 코드이다.
		// Box<Integer> box = Utill.<Integer>boxing(100);
		Box<Integer> box = Utill.boxing(100);
		int value = box.getT();
		System.out.println(value);

		Box<String> box1 = Utill.boxing("홍길동");
		String str = box1.getT();
		System.out.println(str);

	}

}
