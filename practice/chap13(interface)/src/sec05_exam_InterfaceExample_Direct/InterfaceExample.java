package sec05_exam_InterfaceExample_Direct;

public class InterfaceExample {

	public static void main(String[] args) {
		
		//클래스 B가 다 완성 되어야 비로소 클래스 A의 메서드A를 호출할수있다.

		A a = new A();
		B b = new B();
		
		a.methodA(new B());
		a.methodA(b);
	}

}
