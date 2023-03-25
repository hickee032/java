package sec00_exam_InterfaceExam;
//A인터페이스를 구현한 클래스
public class Member implements A {


	
	public void method1() {
		System.out.println(" Member 클래스의 method()1 호출");
		
	}
	
	@Override
	public void method() {
		System.out.println("인터 페이스 A를 구현한 클래스 Member의 method() 호출");
		
	}
	
}
