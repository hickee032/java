package Pet;

public class Bird extends Pet {

	String type;

	boolean flightYN;

	public boolean getFlight() {

		if (flightYN == true) {

			System.out.println("���� �ֽ��ϴ�.");
			return flightYN;
		} else {
			System.out.println("���� ���մϴ�.");
			return flightYN;
		}

	}

	public void move() {
		System.out.print("���� ������ " + this.type + "��,");
	}

}
