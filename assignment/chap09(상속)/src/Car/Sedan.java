package Car;

public class Sedan extends Car {

	int seatNum;

	public int getSeatNum() {

		return seatNum;
	}

	@Override
	public String toString() {
		String str = "승용차 속도는 " + super.getSpeed() + "km, 색깔은 " + super.getColor() + "색 좌석수는 " + this.getSeatNum()
				+ "개 입니다.";
		return str;
	}

}
