package Pet;

public class Dog extends Pet {

	String name;
	int weight;

	public int getWeight() {

		return 0;
	}

	public void move() {
		System.out.println("강아지의 이름은 " + this.name +
									"이고 몸무게는"+this.weight+"입니다.");
	}

}
