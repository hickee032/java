package sec04_exam_generic_method_2;

public class Car {

	private int door;

	public Car(int door) {
		this.door = door;
	}

	public int getInch() {
		return door;
	}

	public void setInch(int inch) {
		this.door = inch;
	}

	@Override
	public String toString() {
		return this.door + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car car = (Car) obj;
			if (this.door == car.door) {
				return true;
			}
		}
		return false;
	}

}
