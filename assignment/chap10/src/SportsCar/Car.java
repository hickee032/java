package SportsCar;

public class Car {

	int speed;

	public final void speedUp() {
		this.speed = this.speed + 10;
		return;
	}

	public void speedDown() {
		this.speed = this.speed - 10;
		return;
	}

	public void stop() {

		this.speed = 0;
		System.out.println("차를 정지");
	}

}
