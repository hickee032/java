package Animal;

public class Dog extends Animal{

	public Dog() {
		super.breathe();
	}
	
	@Override
	void sound() {		
		System.out.println("�տ�");
		System.out.println("--------------------------");
	}
}
