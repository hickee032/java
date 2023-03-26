package Car;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {

		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(this.location + "HankookTire ¼ö¸í" + (this.maxRotation - this.accumulatedRotation));
			return true;
		} else {
			System.out.println("*** " + this.location + "Tire ÆãÅ© ***");
			return false;
		}

	}
}
