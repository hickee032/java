package sec_verify12;

import java.util.Comparator;

public class BanNoAscending implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.ban > o2.ban) {
			return 1;
		} 
		else if (o1.ban == o2.ban) {
			if (o1.no > o2.no) {
				return 1;
			}
			return -1;
		}
		return -1;

	}

}