package sec_verify06;

public class Anonymous {

	int bicycleSpeed;
	int carSpeed;

	Vehicle field = new Vehicle() {

		@Override
		public void speedup() {
			for (int i = 0; i < 10; i++) {
				bicycleSpeed += 10;
				System.out.println("�������� ���ǵ� : " + bicycleSpeed + "Km�Դϴ�.");

				if (bicycleSpeed == 100) {
					System.out.println("�����Ű� 100 Km ��� ����ؿ�!");
					System.out.println("=======================");
				}
			}
		}

		@Override
		public void run() {
			System.out.println("=======================");
			if (bicycleSpeed == 0) {
				System.out.println("�����Ű� �޸��ϴ�.");
				System.out.println("�������� ���ǵ尡 �����ϸ��� �ֳ���?");

			} else {
				
				System.out.println("�����Ű� �޸��ϴ�.");
			}

		}
	};

	void passengerCar() {

		Vehicle v = new Vehicle() {

			@Override
			public void speedup() {
				carSpeed += 1;

				if (carSpeed <= 0) {
					System.out.println("�ڵ����� ���ǵ尡 �����ϸ��� �ֳ���?");
				} else {
					System.out.println("���� ���� ��� :  " + carSpeed + " �� �Դϴ�.");
				}

			}

			@Override
			public void run() {

				System.out.println("=======================");
				System.out.println("�¿����� �޸��ϴ�.");

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

				System.out.println("������� ���� ���ǵ� : " + this.airspeed + "�Դϴ�.");

				airspeed += 100;

			}

			@Override
			public void run() {
				System.out.println("=======================");
				System.out.println("����Ⱑ �̷��մϴ�.");

			}
		};

		v.run();
		for (int i = 0; i <= 9; i++) {
			v.speedup();
		}
		System.out.println("=======================");

	}

}
