package Airplane;

public class SupersonicAirplane extends Airplane {

	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	int flyMode;

	public void fly() {

		if (flyMode == 2) {
			System.out.println("�����Ӻ����մϴ� ");
		} else {
			System.out.println("�Ϲݺ����մϴ�.");
		}

	}

}
