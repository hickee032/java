package sec06_exam_bounded_parameter_type;

public class BoundedTypeParameterEx {

	public static void main(String[] args) {

		// int result1 = Utill.compare("홍길동", "김동길");
		int result2 = Utill.<Integer>compare(100, 100);
		System.out.println(result2);

		// Object()는 Number 유일한 조상 클래스이다. 조상 클래스는 못들어 간다 -- 익상수하
		// int result3 = Utill.compare(new Object(),new Object());

		int result3 = Utill.compare(new Integer(100), new Double(15.78));
		System.out.println(result3);
	}

}
