package Car;

public class Truck extends Car {

	int capacity; // 적재량

	public int capacity() {

		return capacity;
	}

	@Override
	public String toString() {
		String str = "트럭 속도는 " + super.getSpeed() + "km, 색깔은 " + super.getColor() + "색 적재량은 " + this.capacity()
				+ "톤 입니다.";
		return str;
	}

}
