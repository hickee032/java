package Korean;

public class Korean {

	String nation;

	String name;

	int height;

	int age;

	String character;

	public Korean(String nation, String name, int height, int age, String character) {

		this.nation = nation;

		this.name = name;

		this.height = height;

		this.age = age;

		this.character = character;

	}

	@Override

	public String toString() {

		String str = "����    : " + this.nation + "\n�̸�    : " + this.name + "\nŰ : " + this.height + "\n���� : " + this.age
				+

				"\nƯ¡ : " + this.character;

		return str;

	}

}
