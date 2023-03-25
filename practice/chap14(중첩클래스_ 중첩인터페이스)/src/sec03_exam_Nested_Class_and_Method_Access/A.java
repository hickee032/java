package sec03_exam_Nested_Class_and_Method_Access;

public class A {

	class B {
	}

	static class C {
	}

	B field1 = new B();
	C field2 = new C();

	void method1() {
		// 지역변수
		B var1 = new B();
		C var2 = new C();
	}

	/*
	 * 정적 필드 B클래스는 인스턴스 멤버클래스 이므로 바깥 외부 클래스인A가 생성 되야만 사용할수있다.
	 * 
	 * 그러므로 static을 붙일수가 없다.
	 */

	static B field3 = new B(); //B는 인스턴스 멤버이기 때문에 사용불가.
	// C클래스는 static 이라 가능하다.
	static C field4 = new C();

	static void method2() {
		// static 안이니까 static속성을 지녀야 하고
		// B는 외부 클래스에 생성되야한다. 인스턴스 멤버 클래스이다.
		B var3 = new B(); 
		C var4 = new C();
	}
//	중첩 클래스나 인스턴스 필드나 메서드는 언제든지 생성가능하지만 정적필드나 메서드는 적정 클래스만 생성가능하다.
}
