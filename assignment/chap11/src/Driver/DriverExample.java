package Driver;

public class DriverExample {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);

	}

}
