package sec01_exam_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	// 중첩 멤버클래스(정적 멤버 클래스)
	static class Student {

		int sno;
		String name;

		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}

	// Comparator<T>비교자 인터페이스를 구현 하고있는 StudentComparator 클래스

	static class StudentComparator implements Comparator<Student> {

		// name(이름)을 가지고 두개체를 비교한 코드
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

		// sno(학번)을 가지고 두개체를 비교한 코드
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

		// 정적 멤버 클래스 인스턴스 생성함
		Student s1 = new Student(1, "정성윤");
		Student s2 = new Student(2, "서지수");
		Student s3 = new Student(3, "임요환");

		// 정적 멤버 클래스인 비교자 인스턴스 생성
		StudentComparator sc = new StudentComparator();
		int result = Objects.compare(s1, s2, sc);

//		익명 구현 객체를매개값으로 넘기는 상태
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
