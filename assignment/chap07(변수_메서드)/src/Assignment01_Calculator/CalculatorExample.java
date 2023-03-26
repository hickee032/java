package Assignment01_Calculator;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.powerOn();
		int x = 10;
		int y = 5;

		int result = cal.plus(x, y);

		System.out.println(result);

		double D_result = cal.divide(x, y);

		System.out.println(D_result);

		cal.powerOff();

	}

}
