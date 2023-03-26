package sec_verify01;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {

		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		hashMap.put(new Student("1번"), "95점");
		hashMap.put(new Student("2번"), "100점");
		hashMap.put(new Student("3번"), "12점");

		String stu1 = hashMap.get(new Student("1번"));
		System.out.println("1번 학생의 점수 : " + stu1);
		String stu2 = hashMap.get(new Student("2번"));
		System.out.println("2번 학생의 점수 : " + stu2);
		String stu3 = hashMap.get(new Student("3번"));
		System.out.println("3번 학생의 점수 : " + stu3);

	}

}
