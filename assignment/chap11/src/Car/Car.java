package Car;

public class Car {

	Tire frontLeftTire = new Tire("�� ����", 6);
	Tire frontRightTire = new Tire("�� ������", 2);
	Tire backLeftTire = new Tire("�� ���� ", 3);
	Tire backRightTire = new Tire("�� ������", 4);
	

	public int run() {

		System.out.println("[�ڵ����� �޸��ϴ�.]");

		if (frontLeftTire.roll() == false) {
			this.stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			this.stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			this.stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			this.stop();
			return 4;
		}
		return 0;
	}
	
	
//		int result;
//
//		if (frontLeftTire.maxRotation == frontLeftTire.accumulatedRotation) {
//			this.stop();
//			System.out.println(frontLeftTire.location + "KumhoTire�� ��ü");
//			Tire frontLeftTire = new KumhoTire("�� ����", 13);
//			result = 1;
//
//		} else if (frontRightTire.maxRotation == frontRightTire.accumulatedRotation) {
//
//			this.stop();
//			System.out.println(frontRightTire.location + "KumhoTire�� ��ü");
//			Tire frontRightTire = new KumhoTire("�� ������", 13);
//			result = 2;
//
//		}
//		if (backLeftTire.maxRotation == backLeftTire.accumulatedRotation) {
//
//			this.stop();
//			System.out.println(backLeftTire.location + "HankookTire�� ��ü");
//			Tire backLeftTire = new HankookTire("�� ����", 13);
//			result = 3;
//
//		} else if (backRightTire.maxRotation == backRightTire.accumulatedRotation) {
//
//			this.stop();
//			System.out.println(backRightTire.location + "HankookTire�� ��ü");
//			Tire backRightTire = new HankookTire("�� ������", 13);
//			result = 4;
//
//		}
//		
//	}
// System.out.println("----------------------------------------");



	public void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}

}
