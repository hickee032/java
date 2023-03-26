package Pet;

public class Bird extends Pet {

	String type;

	boolean flightYN;

	public boolean getFlight() {

		if (flightYN == true) {

			System.out.println("날수 있습니다.");
			return flightYN;
		} else {
			System.out.println("날지 못합니다.");
			return flightYN;
		}

	}

	public void move() {
		System.out.print("새의 종류는 " + this.type + "고,");
	}

}
