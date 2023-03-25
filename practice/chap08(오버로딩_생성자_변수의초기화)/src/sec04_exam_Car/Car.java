package sec04_exam_Car;

public class Car {
	//매개변수 전부를 포함하는 메서드 한개와 getter정도 는 넣어줘라.
	
	String color;// 색상
	String gearType;
	int door;

	// 기본생성자
	// this : new 라는 연산자를 통해서 인스턴스가 만들어지면 활성화 되는 클래스 내 지역변수이다.
	// this() :같은 클래스 내에서 또다른 생성자를 호출 할때 사용되는 this메서드.
	public Car() {
		this("white", "auto", 8);
	}

	public Car(String color) {
		this(color, "auto", 8);

	}
	public Car(String color, String gearType) {
		this(color,gearType,4);
		
	}

	// 매개변수가 있는 생성자
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
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
		String str = " color : " + this.getColor() + "" + " gearType : " + this.getGearType() + "" + " door : "
				+ this.getDoor();
		return str;
	}

}
