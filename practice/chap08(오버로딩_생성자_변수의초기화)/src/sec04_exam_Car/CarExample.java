package sec04_exam_Car;

public class CarExample {

	public static void main(String[] args) {
		
		Car c1 = new Car(); 
		
		//기본생성자를 호출했는데 왜 초기화가 되어서 출력이되나?
		//기본생성자가 this()로 인해 매개변수가 3개인 생성자를 호출 하고있다.
		//this("white", "auto", 8);
		//코드의 재사용성.
		
		Car c2 = new Car("blue");//매개변수가 1개인 생성자
		Car c3 = new Car("Green","수동");//매개변수가 2개인 생성자
		
		System.out.println(c1.toString()); //여기서 생략된 메서드는 무엇일까.tostring
		System.out.println(c2);
		System.out.println(c3);
	}
}
