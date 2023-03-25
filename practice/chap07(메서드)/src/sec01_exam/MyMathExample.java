package sec01_exam;

public class MyMathExample {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		
		//인스턴스메서드 호출이므로 참조변수로 접근이 무방하다
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		
		
		//정적메서드 static메서드는 클래스명.static메서드명으로 접근 반드시
		long result3 = MyMath.multhply(5L, 3L);
		double result4 = MyMath.divide(5L, 3L);
		
		System.out.println("add = " + result1);
		System.out.println("substract = " + result2);
		System.out.println("multhply = " + result3);
		System.out.println("divide = " + result4);
		System.out.println(mm.studyJava());
		
	}

}
