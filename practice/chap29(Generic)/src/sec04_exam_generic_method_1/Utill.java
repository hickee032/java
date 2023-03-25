package sec04_exam_generic_method_1;

public class Utill {

	// <T>는 제네릭 타입의 메서드를 지칭하며 리턴 타입과 매개변수 타입을 동일하게 T로 가져가야한다.
	// 외부로 T타입을 매개변수로 받아서 Box<T>객체를 생성해서 주소를 리턴 해주는 메서드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;

	}
}
