package sec05_exam_InterfaceExample_Direct;

//직접적 관계의 클래스 A와 B
//A는 B클래스를 사용하는 입장.
public class A {
	// 매개값이 클래스 B타입 B가 변경이 있으면 A에도 영향을 미친다.
	public void methodA(B b) {
		b.methodB();

	}

}
