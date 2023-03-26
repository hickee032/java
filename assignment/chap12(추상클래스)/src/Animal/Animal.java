package Animal;

//조상클래스-추상클래스
public abstract class Animal {

	String kind; // 종류

	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}

	abstract void sound();

}
