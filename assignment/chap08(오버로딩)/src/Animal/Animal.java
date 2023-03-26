package Animal;

public class Animal {

	String name;
	int age;

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;

	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// this가 붙은 변수는 멤버변수 this가 빠진변수는 지역변수이다.
	@Override
	public String toString() {
		String str = "이 동물의 이름은 " + name + "이며, 나이는 " + age + " 입니다.";
		return str;
	}
}
