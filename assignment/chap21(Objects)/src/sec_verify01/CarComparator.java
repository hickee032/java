package sec_verify01;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car a, Car b) {

		int x = a.model.compareTo(b.model);
		
		if (x == 0) {
			System.out.println("같은 차종입니다.");
		} else {
			System.out.println("다른 차종입니다.");
		}

		return a.model.compareTo(b.model);

	}
}
