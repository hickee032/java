package sec_verify01;

import java.util.Objects;

public class CarComparatorExample {

	public static void main(String[] args) {

		Car c1 = new Car("SM5-����", 4);
		Car c2 = new Car("SM7-����", 4);
		Car c3 = new Car("SM5-����", 4);

		Objects.compare(c1, c3, new CarComparator());

//		if (x == 0) {
//			System.out.println("���� �����Դϴ�.");
//		} else {
//			System.out.println("�ٸ� �����Դϴ�.");
//		}
		// System.out.println(Objects.compare(c1, c3, new CarComparator()));

		Objects.compare(c1, c2, new CarComparator());

//		if (y == 0) {
//			System.out.println("���� �����Դϴ�.");
//		} else {
//			System.out.println("�ٸ� �����Դϴ�.");
//		}
		// System.out.println(Objects.compare(c1, c2, new CarComparator()));

	}
}
