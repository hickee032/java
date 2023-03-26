package sec_verify06;

public class Anonymous {

	int bicycleSpeed;
	int carSpeed;

	Vehicle field = new Vehicle() {

		@Override
		public void speedup() {
			for (int i = 0; i < 10; i++) {
				bicycleSpeed += 10;
				System.out.println("자전거의 스피드 : " + bicycleSpeed + "Km입니다.");

				if (bicycleSpeed == 100) {
					System.out.println("자전거가 100 Km 라니 대단해요!");
					System.out.println("=======================");
				}
			}
		}

		@Override
		public void run() {
			System.out.println("=======================");
			if (bicycleSpeed == 0) {
				System.out.println("자전거가 달립니다.");
				System.out.println("자전거의 스피드가 음수일리가 있나요?");

			} else {
				
				System.out.println("자전거가 달립니다.");
			}

		}
	};

	void passengerCar() {

		Vehicle v = new Vehicle() {

			@Override
			public void speedup() {
				carSpeed += 1;

				if (carSpeed <= 0) {
					System.out.println("자동차의 스피드가 음수일리가 있나요?");
				} else {
					System.out.println("차의 현재 기어 :  " + carSpeed + " 단 입니다.");
				}

			}

			@Override
			public void run() {

				System.out.println("=======================");
				System.out.println("승용차가 달립니다.");

			}
		};
		v.run();
		carSpeed = -1;
		v.speedup();
		carSpeed = 0;
		for (int i = 0; i < 6; i++) {
			v.speedup();
		}
		System.out.println("=======================");
	}

	void airPlane(Vehicle v) {
		v = new Vehicle() {

			int airspeed;

			@Override
			public void speedup() {

				System.out.println("비행기의 현재 스피드 : " + this.airspeed + "입니다.");

				airspeed += 100;

			}

			@Override
			public void run() {
				System.out.println("=======================");
				System.out.println("비행기가 이륙합니다.");

			}
		};

		v.run();
		for (int i = 0; i <= 9; i++) {
			v.speedup();
		}
		System.out.println("=======================");

	}

}
