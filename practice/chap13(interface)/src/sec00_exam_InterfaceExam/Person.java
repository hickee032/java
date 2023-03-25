package sec00_exam_InterfaceExam;

//인터페이스 A의 구현 .
public class Person implements A{

	//인터페이스 A에 있는 method()오버라이딩.
	@Override
	public void method() {
		System.out.println("인터페이스를 구현한 클래스 Person");
		
	}
	
	public void method2() {
		System.out.println("인터페이스를 구현한 클래스 Person에서 새로만든 메서드 ");
		
	}
	

}
