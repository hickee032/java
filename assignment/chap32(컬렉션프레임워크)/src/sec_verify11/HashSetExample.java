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
		set.add(new Student(1, "������"));
		set.add(new Student(2, "�迬��"));
		set.add(new Student(1, "�տ���"));
		set.add(new Student(2, "�迬��"));
		set.add(new Student(5, "�赿��"));
		set.add(new Student(4, "Ȳ����"));
		set.add(new Student(1, "������"));
		set.add(new Student(3, "�ڱٿ�"));

		set.remove(new Student(1, "�տ���"));

//      System.out.println("�� ��ü�� : " + set.size());
//
//      Iterator<Student> iterator = set.iterator();
//      while (iterator.hasNext()) {
//
//         Student student = iterator.next();
//
//         System.out.println(student.getStudentNum() + "��, " + student.getName());
//
//      }

		ArrayList<Student> list = new ArrayList<>(set);

		System.out.println("�� ��ü�� : " + list.size());

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