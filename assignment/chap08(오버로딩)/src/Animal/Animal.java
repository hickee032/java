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

	// this�� ���� ������ ������� this�� ���������� ���������̴�.
	@Override
	public String toString() {
		String str = "�� ������ �̸��� " + name + "�̸�, ���̴� " + age + " �Դϴ�.";
		return str;
	}
}
