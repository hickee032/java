package Car1.copy;

public class Tire {

	int maxRotation; // 타이어 최대 회전수

	int accumulatedRotation; // 타이어 누적 회전수

	String location; // 타이어 위치
	
	

	public Tire(String location, int maxRotation) {

		this.location = location;

		this.maxRotation = maxRotation;

	}

	public boolean roll() {

		++accumulatedRotation;

		if (this.accumulatedRotation < this.maxRotation) {

			System.out.println(this.location + "수명" + (this.maxRotation - this.accumulatedRotation));

			return true;

		} else {

			System.out.println("*** " + this.location + "Tire 펑크 ***");

			return false;

		}

	}

}
