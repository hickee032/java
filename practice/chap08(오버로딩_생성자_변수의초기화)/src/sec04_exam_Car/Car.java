package sec04_exam_Car;

public class Car {
	//�Ű����� ���θ� �����ϴ� �޼��� �Ѱ��� getter���� �� �־����.
	
	String color;// ����
	String gearType;
	int door;

	// �⺻������
	// this : new ��� �����ڸ� ���ؼ� �ν��Ͻ��� ��������� Ȱ��ȭ �Ǵ� Ŭ���� �� ���������̴�.
	// this() :���� Ŭ���� ������ �Ǵٸ� �����ڸ� ȣ�� �Ҷ� ���Ǵ� this�޼���.
	public Car() {
		this("white", "auto", 8);
	}

	public Car(String color) {
		this(color, "auto", 8);

	}
	public Car(String color, String gearType) {
		this(color,gearType,4);
		
	}

	// �Ű������� �ִ� ������
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
