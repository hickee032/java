package sec03_exam_Nested_Outter_Refer;

public class OutterExample {

	public static void main(String[] args) {
		//외부 클래스 인스턴스 생성
		Outter outter = new Outter();
		
		//내부 클래스 인스턴스 생성
		Outter.Nested nested = outter.new Nested();
		
		nested.print();

	}

}
