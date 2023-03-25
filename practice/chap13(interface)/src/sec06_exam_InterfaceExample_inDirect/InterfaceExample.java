package sec06_exam_InterfaceExample_inDirect;

public class InterfaceExample {

	public static void main(String[] args) {
		
		//클래스 B가 다 완성 되어야 비로소 클래스 A의 메서드A를 호출할수있다.

		//클래스를 직접생성하여 호출
		A a = new A();
		a.methodA(new B());
		
		//인터페이스 필드의 다형성
		I i = new B();
		i.methodB();
	}

}
