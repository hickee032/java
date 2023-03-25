package sec04_exam_Default_StaticMethod_Example;

public class default_staticExample {

	public static void main(String[] args) {
		
		Child c= new Child();
		c.childmethod();
		c.parentmethod2();
		c.method1(); //오버라이딩 한 녀석을 호출 한다.
		
		c.method2();
		
		//MyInterface1에 있는 정적 메서드 호출 방법
		//인터페이스명.정적메서드 명
		MyInterface1.staticmethod2();
		
		

	}

}
