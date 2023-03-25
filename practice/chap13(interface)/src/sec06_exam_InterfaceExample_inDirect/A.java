package sec06_exam_InterfaceExample_inDirect;

//직접적 관계의 클래스 A와 B
//A는 B클래스를 사용하는 입장.
public class A {
	// 매개값이 클래스 B타입 B가 변경이 있으면 A에도 영향을 미친다.
	public void methodA(I i) {
/*		클래스 B가 완성 되지 않아도 선언부에 있는 추상 메서드의 선언부만 알고있으면 언제든지 호출이 가능하다.
		이것이 간접적 관계*/
		i.methodB();

	}

}
