package Car;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		int problem=0;

		for (int i = 1; i < 5; i++) {
			problem = car.run();

			
		
		switch (problem) {
		case 1:
			System.out.println("�� ���� HankookTire ��ü");
			car.frontLeftTire = new HankookTire("�� ��",15);
			break;
		case 2:
			System.out.println("�� ������ HankookTire ��ü");
			car.frontRightTire = new HankookTire("�� ����",15);
			break;
		case 3:
			System.out.println("�� ���� HankookTire ��ü");
			car.backLeftTire = new KumhoTire("�� ��",15);
			break;
		case 4:
			System.out.println("�� ������ HankookTire ��ü");
			car.backRightTire = new KumhoTire("�� ����",15);
			break;
		}
	}
	}
}


