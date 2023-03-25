package sec01_exam_CastingExample1;

public class CastingExample2 {
//근본 부터 살펴 보는 게 중요하다. 어떤 인스턴스를 참조하고 있는 지 확인 하여야 한다.
	public static void main(String[] args) {

		Car car = new Car();

		Car car2 = null;

		FireEngine fe = new FireEngine();

		car.drive();
		car = fe; // upcasting 형변환 생략 가능하다.

		fe = (FireEngine) car; // downcasting 형변환 생략 불가능하다.
		fe.drive();				
		fe.water();

		car2 = fe;
		car2.drive();
		// car2.water();
	}

}
