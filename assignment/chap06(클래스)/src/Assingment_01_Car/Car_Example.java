package Assingment_01_Car;

public class Car_Example {

	public static void main(String[] args) {

		int i = 0;

		Car_Class Car = new Car_Class();

		System.out.println(Car);

		Car.speed = 60;

		System.out.println(" ������ �ӵ� : " + Car.speed);

		System.out.println();

		for (i = 0; i < Car.cArr.length; i++) {
			Car.cArr[i] = "�ν��Ͻ� ����";

			System.out.println("cArr[" + i + "] " + Car.cArr[i]);

		}
		for (i = 0; i < Car.cArr.length; i++) {

			Car.cArr[i] = Integer.toString(i);

			System.out.println("cArr[" + i + "] = " + Car.cArr[i]);

		}

	}

}
