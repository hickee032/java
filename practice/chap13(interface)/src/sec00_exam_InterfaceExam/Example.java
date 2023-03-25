package sec00_exam_InterfaceExam;

public class Example {

	public static void main(String[] args) {

		//지꺼 지가 생성해서 지꺼 불러온거.
		Member m = new Member();
		m.method();
		
		//A인터 페이스를 통해 메서드 호출
		//구현 클래스의 일종의 조상이다.
		A a = new Member();
		a.method();
		
//		a의 근본은 A라는 인터페이스이다. 하지만 인터페이스A에는 method1() 존재하지 X
//		근본을 벗어나지 못한다.
		//a.method1(); -- 호출 할수 없다.
		

	}

}
