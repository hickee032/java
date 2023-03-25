package sec02_exam_Instanceof;

//조상 클래스
class Parent {

}

//자손 클래스
class Child extends Parent {

}

//하나의 자바파일 에는 public이 하나만 있어야 한다.
public class InstanceofExample2 {

	public static void method1(Parent parent) {

		if (parent instanceof Child) {
			// 서로 상속 관계에 있어서 instanceof의 결과가 true
			// 강제 캐스팅 가능
			Child child = (Child) parent;
			System.out.println("method1 - Child 변환 성공");
		} else {
			System.out.println("method1 - Child 변환 실패");
		}

	}

	public static void method2(Parent parent) {
		//형변환이 가능하냐라고 물어볼때 사용하는 연산자가  instanceof 이다.
		if (parent instanceof Child) {
			parent = new Child();
			// Child child = (Child)Parent;
			System.out.println("method1 - Child 변환 성공");
		} else {
			System.out.println("method1 - Child 변환 실패");
		}

	}

	public static void main(String[] args) {
		// 필드의 다형성이 적용

		Parent parentA = new Child(); // 변환성공

		// Parent parentA = new Parent(); //변환실패
		method1(parentA);
		method1(new Child());
		method2(parentA);
		
		
		Parent parentB = new Parent();
		method1(parentB);
		method1(new Child());
		method2(parentB);
	}
	

}
