package sec04_exam_Default_StaticMethod_Example;

public interface MyInterface1 {
	//디폴트메서드는 퍼블릭이 생략 되어있다.
	//블럭 구현부가 존재한다.
	default void method1() {
		System.out.println("인터페이스1 디폴트 메서드 1 호출");
	}
	
	default void method2() {
		System.out.println("인터페이스1 디폴트 메서드 2 호출");
	}
	
	//정적메서드
	static void  staticmethod2() {
		System.out.println("인터페이스1 정적(static) 메서드  호출");
	}

}
