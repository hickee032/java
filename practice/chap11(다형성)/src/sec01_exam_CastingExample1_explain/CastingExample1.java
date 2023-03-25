package sec01_exam_CastingExample1_explain;

public class CastingExample1 {

	public static void main(String[] args) {
		
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); //FireEngine 클래스 에 있는 멤버
		fe.drive(); //Car 클래스 에 있는 멤버
		
		
		//필드의 다형성.
		//Car car = new FireEngine();
		car = fe;//car = (car)fe; upcasting 형변환이 생략 가능 하다.
		
		car.drive();
		//car.water(); //컴파일 예외 발생 
						/* car의 근본이 Car이기때문에 FireEngine에 있는 water()를 사용할수 없다. 
						 * 그래서 예외가 발생
						 */
		
		fe2 = (FireEngine)car; //downcasting 이라 강제 형변환 코드를 반드시 넣어야 한다.
		fe2.water(); //fe2에서는 water()가 호출 된다. 그 이유는 
					//fe2는 근본이 FireEngine클래스 이다. 그래서 water()를 사용 할수 있으며
					//에러가 발생하지 않는 다.
	}

}
