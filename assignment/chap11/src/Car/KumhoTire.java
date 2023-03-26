package Car;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {

		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(this.location + "KumhoTire ����" + (this.maxRotation - this.accumulatedRotation));
			return true;
		} else {
			System.out.println("*** " + this.location + "Tire ��ũ ***");
			return false;
		}

	}

}
