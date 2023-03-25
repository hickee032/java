package sec06_exam_bounded_parameter_type;

public class Utill {

	// 매개변수에 T타입을 Number(추상 클래스)의 자손 클래스만 올수있도록 제한.
	public static <T extends Number> int compare(T t1, T t2) {
		// Number class 의 doubleValue()란 추상메서드 이지만 Number의 자손 클래스 (Docs 에 나옴)
		// 가 재정의 하였기 때문에 아래 클래스가 문제 되지 않는다.

		double value1 = t1.doubleValue();
		double value2 = t2.doubleValue();

		return Double.compare(value1, value2);
	}
}
