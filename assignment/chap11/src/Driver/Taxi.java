package Driver;

public class Taxi extends Vehicle {

	@Override
	public void run() {
		System.out.println("조상클래스 타입에 적용되는 자손클래스들의 run메서드를 호출합니다");
		System.out.println("Vehicle의 자손클래스인 택시가 달립니다.");
	}

}
