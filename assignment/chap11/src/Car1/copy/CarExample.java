package Car1.copy;

public class CarExample {

	public static void main(String[] args) {

		Tire[] tires = new Tire[4];

		tires[0] = new Tire("�� ����", 13);
		tires[1] = new Tire("�� ������", 13);
		tires[2] = new Tire("�� ����", 13);
		tires[3] = new Tire("�� ������", 13);

		Car car = new Car();

		for (int i = 1; i < 4; i++) {
			
			if (tires[0].accumulatedRotation == tires[0].maxRotation) {
			System.out.println(tires[i].location + "HankookTire ��ü");
			car.frontLeftTire = new HankookTire("�� ��", 15);}

		}
	}
}
