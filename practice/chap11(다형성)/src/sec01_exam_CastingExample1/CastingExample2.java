package sec01_exam_CastingExample1;

public class CastingExample2 {
//�ٺ� ���� ���� ���� �� �߿��ϴ�. � �ν��Ͻ��� �����ϰ� �ִ� �� Ȯ�� �Ͽ��� �Ѵ�.
	public static void main(String[] args) {

		Car car = new Car();

		Car car2 = null;

		FireEngine fe = new FireEngine();

		car.drive();
		car = fe; // upcasting ����ȯ ���� �����ϴ�.

		fe = (FireEngine) car; // downcasting ����ȯ ���� �Ұ����ϴ�.
		fe.drive();				
		fe.water();

		car2 = fe;
		car2.drive();
		// car2.water();
	}

}
