package Car;

public class Car {

	Tire frontLeftTire = new Tire("앞 왼쪽", 6);
	Tire frontRightTire = new Tire("앞 오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽 ", 3);
	Tire backRightTire = new Tire("뒤 오른쪽", 4);
	

	public int run() {

		System.out.println("[자동차가 달립니다.]");

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
//			System.out.println(frontLeftTire.location + "KumhoTire로 교체");
//			Tire frontLeftTire = new KumhoTire("앞 왼쪽", 13);
//			result = 1;
//
//		} else if (frontRightTire.maxRotation == frontRightTire.accumulatedRotation) {
//
//			this.stop();
//			System.out.println(frontRightTire.location + "KumhoTire로 교체");
//			Tire frontRightTire = new KumhoTire("앞 오른쪽", 13);
//			result = 2;
//
//		}
//		if (backLeftTire.maxRotation == backLeftTire.accumulatedRotation) {
//
//			this.stop();
//			System.out.println(backLeftTire.location + "HankookTire로 교체");
//			Tire backLeftTire = new HankookTire("뒤 왼쪽", 13);
//			result = 3;
//
//		} else if (backRightTire.maxRotation == backRightTire.accumulatedRotation) {
//
//			this.stop();
//			System.out.println(backRightTire.location + "HankookTire로 교체");
//			Tire backRightTire = new HankookTire("뒤 오른쪽", 13);
//			result = 4;
//
//		}
//		
//	}
// System.out.println("----------------------------------------");



	public void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
