package Pet;

public class PetExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "������";
		dog.weight = 10;
		dog.move();
		
		Bird bird = new Bird();
		bird.type = "�޹���";
		bird.move();
		bird.flightYN = true;
		bird.getFlight();

	}

}
