package Computer;

public class Computer extends Calculator {

	public Computer() {

	}

	public double areaCircle(double r) {

		super.areaCircle(r);

		double result = (r * r) * Math.PI; // java docs Math.PI�˻��� ���

		System.out.println();
		System.out.println("Computer ��ü�� areaCircle() ����");
		System.out.println("�������� : " + result);

		return result;
	}

}
