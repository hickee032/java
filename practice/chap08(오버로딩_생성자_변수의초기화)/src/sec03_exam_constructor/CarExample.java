package sec03_exam_constructor;

public class CarExample {

	public static void main(String[] args) {
		//생성자는 많으면 많을수록 좋다. void를 사용하지마라  리턴값이 없어.
		//this() 같은 클래스 내 - 디폴트값
		Car c = new Car(); //기본생성자
		
		c.color = "white";
		c.door = 5;
		c.gearType = "수동";
		System.out.println(c);
		
		Car c1 = new Car("black", "자동", 4);//매개변수가 있는 생성자
		System.out.println(c1);
	}

}
