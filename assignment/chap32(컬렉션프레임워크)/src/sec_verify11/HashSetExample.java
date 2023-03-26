package sec_verify11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student(1, "½ÅÀºÇõ"));
		set.add(new Student(2, "±è¿¬¾Æ"));
		set.add(new Student(1, "¼Õ¿¬Àç"));
		set.add(new Student(2, "±è¿¬¾Æ"));
		set.add(new Student(5, "±èµ¿¿ì"));
		set.add(new Student(4, "È²ÈñÁ¤"));
		set.add(new Student(1, "½ÅÀºÇõ"));
		set.add(new Student(3, "¹Ú±Ù¿¹"));

		set.remove(new Student(1, "¼Õ¿¬Àç"));

//      System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
//
//      Iterator<Student> iterator = set.iterator();
//      while (iterator.hasNext()) {
//
//         Student student = iterator.next();
//
//         System.out.println(student.getStudentNum() + "¹ø, " + student.getName());
//
//      }

		ArrayList<Student> list = new ArrayList<>(set);

		System.out.println("ÃÑ °´Ã¼¼ö : " + list.size());

		Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getStudentNum() > o2.getStudentNum()) {
					return 1;
				}
				return -1;
			}
		});

		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}