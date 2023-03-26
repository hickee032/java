package SportsCar;

public class SportsCarExample {

	public static void main(String[] args) {

		SportsCar sc = new SportsCar();

		sc.getSpeed();
		sc.speedUp();
		sc.getSpeed();
		sc.speedUp();
		sc.getSpeed();
		sc.speedUp();
		sc.getSpeed();

		sc.speedDown();
		sc.getSpeed();
		sc.speedDown();
		sc.getSpeed();

		sc.stop();

		sc.getSpeed();

	}

}
