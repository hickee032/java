package sec04_exam_Default_StaticMethod_Example;

/*인터페이스에  디폴트 메서드와 스테틱 메서드만이 존재하기 때문에 재정의 할 필요가 없다.
추상메서드가 존재 할경우 반드시 재정의 해야한다.*/

public class Child extends Parent implements MyInterface1 {

	public void childmethod() {
		System.out.println("자손클래스에서 호출한 메서드");
	}
	
	@Override
	public void method1() {
		System.out.println("자손클래스 에서 MyInterface1 method1 호출(오버라이딩 )");
		
	}
}
