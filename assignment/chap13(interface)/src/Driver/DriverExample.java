package Driver;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		Vehicle b = new Bus();
		Vehicle t = new Taxi();
		d.drive(b);
		d.stop(b);
		d.drive(t);
		d.stop(t);
		
		

	}

}
