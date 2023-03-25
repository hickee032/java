package sec05_exam_instance_copy;

public class Car {

	private String color;
	private String gearType;
	private int door;

	public Car() {
		this("white", "auto", 4);

	}

	public Car(String color, String gearType, int door) {

		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	//1.Car타입의 참조변수(주소)
	//2.new Car()
	public Car(Car c) {
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;

	}

	public String getColor() {
		return color;
	}

	public String getGearType() {
		return gearType;
	}

	public int getDoor() {
		return door;
	}
	
	@Override
	public String toString() {
		String str = "color"+this.getColor()+"gearType"+this.getGearType()+"door"+this.getDoor();
		return str;
	}

}
