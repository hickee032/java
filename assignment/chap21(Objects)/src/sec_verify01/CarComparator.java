package sec_verify01;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car a, Car b) {

		int x = a.model.compareTo(b.model);
		
		if (x == 0) {
			System.out.println("���� �����Դϴ�.");
		} else {
			System.out.println("�ٸ� �����Դϴ�.");
		}

		return a.model.compareTo(b.model);

	}
}
