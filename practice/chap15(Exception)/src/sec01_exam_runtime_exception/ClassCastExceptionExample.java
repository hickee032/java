package sec01_exam_runtime_exception;

class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class ClassCastExceptionExample {

	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("Dog�� ��ȯ ����");
		} else {
			System.out.println("Dog�� ��ȯ ����");
		}
	}

	public static void main(String[] args) {
		try {
			// �ʵ��� ������
			Animal animal = new Dog();
			// �ٿ�ĳ����
			Dog dog = (Dog) animal;
			Cat cat = (Cat) animal;

			// ������ ���� �߻��� �Ʒ��� ���� ���� ����
			changeDog(dog);
			changeDog(new Cat());
		} catch (ClassCastException e) {
			System.out.println("ClassCastException ���ܹ߻�");
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
		}
	}

}
