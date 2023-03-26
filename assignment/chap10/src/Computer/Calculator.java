package Computer;

public class Calculator {

	public double areaCircle(double r) {

		double result = (r * r) * Math.PI;

		System.out.println("Calculator 객체의 areaCircle() 실행");
		System.out.printf("원면적은 : " + (Math.round(result * 1000) / 1000.0));

		return result;
	}

	public Calculator() {

	}
}
