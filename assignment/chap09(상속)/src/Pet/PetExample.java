package Pet;

public class PetExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.name = "´©··ÀÌ";
		dog.weight = 10;
		dog.move();
		
		Bird bird = new Bird();
		bird.type = "¾Þ¹«»õ";
		bird.move();
		bird.flightYN = true;
		bird.getFlight();

	}

}
