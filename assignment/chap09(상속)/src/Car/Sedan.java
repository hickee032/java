package Car;

public class Sedan extends Car {

	int seatNum;

	public int getSeatNum() {

		return seatNum;
	}

	@Override
	public String toString() {
		String str = "�¿��� �ӵ��� " + super.getSpeed() + "km, ������ " + super.getColor() + "�� �¼����� " + this.getSeatNum()
				+ "�� �Դϴ�.";
		return str;
	}

}
