package sec_verify01;

import java.util.Objects;

public class CarComparatorExample {

	public static void main(String[] args) {

		Car c1 = new Car("SM5-신형", 4);
		Car c2 = new Car("SM7-신형", 4);
		Car c3 = new Car("SM5-신형", 4);

		Objects.compare(c1, c3, new CarComparator());

//		if (x == 0) {
//			System.out.println("같은 차종입니다.");
//		} else {
//			System.out.println("다른 차종입니다.");
//		}
		// System.out.println(Objects.compare(c1, c3, new CarComparator()));

		Objects.compare(c1, c2, new CarComparator());

//		if (y == 0) {
//			System.out.println("같은 차종입니다.");
//		} else {
//			System.out.println("다른 차종입니다.");
//		}
		// System.out.println(Objects.compare(c1, c2, new CarComparator()));

	}
}
