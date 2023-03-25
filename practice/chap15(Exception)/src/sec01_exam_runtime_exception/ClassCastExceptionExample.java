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
			System.out.println("Dog로 변환 성공");
		} else {
			System.out.println("Dog로 변환 실패");
		}
	}

	public static void main(String[] args) {
		try {
			// 필드의 다형성
			Animal animal = new Dog();
			// 다운캐스팅
			Dog dog = (Dog) animal;
			Cat cat = (Cat) animal;

			// 위에서 예외 발생시 아래는 실행 하지 않음
			changeDog(dog);
			changeDog(new Cat());
		} catch (ClassCastException e) {
			System.out.println("ClassCastException 예외발생");
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}

}
