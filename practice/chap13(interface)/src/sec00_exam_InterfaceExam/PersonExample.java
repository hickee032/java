package sec00_exam_InterfaceExam;

public class PersonExample {

	public static void main(String[] args) {
		
		A a = new Person();				//인터페이스를 구현 했다 라는 것은 일종의 조상을 의미 한다. 즉 다형성이 적용된다.
		Person p = new Person();		//인터페이스를 구현 했다 라는 것은 일종의 조상을 의미 한다. 즉 다형성이 적용된다.
		a.method();						
		p.method();

		
		A a1 = new Member();   //멤버변수의 다형성
		a1.method();
	}

}
