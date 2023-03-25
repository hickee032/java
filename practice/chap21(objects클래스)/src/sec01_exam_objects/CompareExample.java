package sec01_exam_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	// ��ø ���Ŭ����(���� ��� Ŭ����)
	static class Student {

		int sno;
		String name;

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}

	// Comparator<T>���� �������̽��� ���� �ϰ��ִ� StudentComparator Ŭ����

	static class StudentComparator implements Comparator<Student> {

		// name(�̸�)�� ������ �ΰ�ü�� ���� �ڵ�
		@Override
		public int compare(Student a, Student b) {
			if (a.name.compareTo(b.name) < 0) {
				return -1;
			} else if (a.name.compareTo(b.name) == 0) {
				return 0;
			} else {
				return 1;
			}
		}

		// sno(�й�)�� ������ �ΰ�ü�� ���� �ڵ�
//		@Override
//		public int compare(Student a, Student b) {
//			if (a.sno < b.sno) {
//				return -1;
//			} else if (a.sno == b.sno) {
//				return 0;
//			} else {
//				return 1;
//			}
//		}

	}

	public static void main(String[] args) {

		// ���� ��� Ŭ���� �ν��Ͻ� ������
		Student s1 = new Student(1, "������");
		Student s2 = new Student(2, "������");
		Student s3 = new Student(3, "�ӿ�ȯ");

		// ���� ��� Ŭ������ ���� �ν��Ͻ� ����
		StudentComparator sc = new StudentComparator();
		int result = Objects.compare(s1, s2, sc);

//		�͸� ���� ��ü���Ű������� �ѱ�� ����
//		int result = Objects.compare(s1, s2, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student a, Student b) {
//				if (a.sno < b.sno) {
//					return -1;
//				} else if (a.sno == b.sno) {
//					return 0;
//				} else {
//					return 1;
//				}
//			}
//			
//		});

		if (result == 1) {
			System.out.println("s1 > s2");
		} else if (result == 0) {
			System.out.println("s1 = s2");
		} else {
			System.out.println("s1 < s2");
		}
	}

}
