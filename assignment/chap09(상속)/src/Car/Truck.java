package Car;

public class Truck extends Car {

	int capacity; // ���緮

	public int capacity() {

		return capacity;
	}

	@Override
	public String toString() {
		String str = "Ʈ�� �ӵ��� " + super.getSpeed() + "km, ������ " + super.getColor() + "�� ���緮�� " + this.capacity()
				+ "�� �Դϴ�.";
		return str;
	}

}
