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

		String str = "국적    : " + this.nation + "\n이름    : " + this.name + "\n키 : " + this.height + "\n나이 : " + this.age
				+

				"\n특징 : " + this.character;

		return str;

	}

}
