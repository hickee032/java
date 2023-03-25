package sec01_exam_CastingExample1_explain;

public class CastingExample2 {
//근본 부터 살펴 보는 게 중요하다. 어떤 인스턴스를 참조하고 있는 지 확인 하여야 한다.
	public static void main(String[] args) {

		Car car = new FireEngine(); //Car인스턴스 생성
		//조상 타입의 참조변수를 가지고 자손타입의 인스턴스를 다룰 수 있다.(리모컨의 기능이 多 -> 小  가능)
		//반대는 불가.
		//Car car = new FireEngine(); 이런식으로 가능
		//car = null;
		
		Car car2 = null;

		FireEngine fe = null;
		

		car.drive();
		
		//조상 타입의 참조변수를 가지고 자손타입의 인스턴스를 다룰 수 없다.(리모컨의 기능이 小 -> 多  가능)
		//반대는 허용.
		//컴파일은 허용 하지만 실행시 (ClassCastException) 발생
		//지금 현재 car참조변수는 Car클래스의 인스턴스를 가지고 있다.
		//이것을 다시 자손 클래스로 변경 불가.

		fe = (FireEngine) car; 		
		fe.water();
		car2 = fe;
		car2.drive();
		
	}

}
