package SportsCar;

public class SportsCar extends Car {

	public int getSpeed() {

		System.out.println("������ ������ī �ӵ��� " + super.speed + "�Դϴ�.");

		return this.speed;
	}

	public void stop() {
		super.stop();
		this.speed = 0;
		System.out.println("������ī�� ����");
	}

}
