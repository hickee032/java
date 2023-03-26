package Car;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();
		int problem=0;

		for (int i = 1; i < 5; i++) {
			problem = car.run();

			
		
		switch (problem) {
		case 1:
			System.out.println("앞 왼쪽 HankookTire 교체");
			car.frontLeftTire = new HankookTire("앞 왼",15);
			break;
		case 2:
			System.out.println("앞 오른쪽 HankookTire 교체");
			car.frontRightTire = new HankookTire("앞 오른",15);
			break;
		case 3:
			System.out.println("뒤 왼쪽 HankookTire 교체");
			car.backLeftTire = new KumhoTire("뒤 왼",15);
			break;
		case 4:
			System.out.println("뒤 오른쪽 HankookTire 교체");
			car.backRightTire = new KumhoTire("뒤 오른",15);
			break;
		}
	}
	}
}


