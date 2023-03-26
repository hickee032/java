package Car1.copy;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {

		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(this.location + "KumhoTire ¼ö¸í" + (this.maxRotation - this.accumulatedRotation));
			return true;
		} else {
			System.out.println("*** " + this.location + "Tire ÆãÅ© ***");
			return false;
		}

	}

}
