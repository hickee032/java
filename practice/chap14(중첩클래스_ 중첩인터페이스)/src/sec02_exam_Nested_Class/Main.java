package sec02_exam_Nested_Class;

public class Main {

	public static void main(String[] args) {

		A a = new A(); // 외부 바깥 클래스 인스턴스 생성
		// A클래스의 멤버 변수격인 내부 중첩 클래스 인스턴스 생성
		// 반드시 외부 클래스의 인스턴스가 존재 하여야 한다.
		A.B b = a.new B();

		b.method1();// b 의 멤버 메서드 method1호출

		// 정적 static 멤버인 인스턴스 생성
		// (외부 클래스의 인스턴스 생성 없이 바로 가능하다.)
		A.C c = new A.C();

		System.out.println(c.b);
		A.C.method3();

		// 외부 클래스의 멤버 메서드인 method를 호출 함으로 써
		// 로컬 클래스의 인스턴스가 생성
		a.method();

	}

}
