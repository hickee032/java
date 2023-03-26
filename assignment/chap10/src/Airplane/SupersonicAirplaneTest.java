package Airplane;

public class SupersonicAirplaneTest {

	public static void main(String[] args) {

		SupersonicAirplane SA = new SupersonicAirplane();

		SA.takeOff();
		SA.flyMode = 1;
		SA.fly();
		SA.flyMode = 2;
		SA.fly();
		SA.flyMode = 1;
		SA.fly();
		SA.land();

	}

}
