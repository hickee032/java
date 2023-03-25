package sec02_exam_Instanceof;

//조상 클래스
class Car{
	
}

//자손 클래스
class FireEngine extends Car {
	
}

class Ambulance extends Car {
	
}

//ctrl+t는 상속계층도를 보여준다.
//상속계층도를 그려봐라.
public class InstanceofExample1 {

	public static void main(String[] args) {
	
		FireEngine fe  = new FireEngine();
		
		//instanceof 연산자가 참이 면 형변환이 가능하다.
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("this is a Car instance");
		}
		if(fe instanceof Object) {
			System.out.println("this is a Object instance");
		}
		//아래 예외가 발생하는 원인은 FireEngine과 Ambulance는 아무런 관계가 없다. (근본이 다르다.)
		if(fe instanceof Ambulance) {
			System.out.println("this is a Object instance");
		}
	}

}
