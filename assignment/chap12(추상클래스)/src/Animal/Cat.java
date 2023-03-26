package Animal;

public class Cat extends Animal{

	public Cat() {
		super.breathe();
	}
	
	@Override
	void sound() {		
		System.out.println("¾ß¿Ë");
		System.out.println("--------------------------");
	}
}
