package Pet;

public class Dog extends Pet {

	String name;
	int weight;

	public int getWeight() {

		return 0;
	}

	public void move() {
		System.out.println("�������� �̸��� " + this.name +
									"�̰� �����Դ�"+this.weight+"�Դϴ�.");
	}

}
