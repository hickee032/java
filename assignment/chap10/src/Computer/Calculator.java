package Computer;

public class Calculator {

	public double areaCircle(double r) {

		double result = (r * r) * Math.PI;

		System.out.println("Calculator ��ü�� areaCircle() ����");
		System.out.printf("�������� : " + (Math.round(result * 1000) / 1000.0));

		return result;
	}

	public Calculator() {

	}
}
