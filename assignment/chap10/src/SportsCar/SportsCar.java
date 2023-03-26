package SportsCar;

public class SportsCar extends Car {

	public int getSpeed() {

		System.out.println("현재의 스포츠카 속도는 " + super.speed + "입니다.");

		return this.speed;
	}

	public void stop() {
		super.stop();
		this.speed = 0;
		System.out.println("스포츠카를 정지");
	}

}
