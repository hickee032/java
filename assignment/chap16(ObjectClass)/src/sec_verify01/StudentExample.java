package sec_verify01;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {

		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		hashMap.put(new Student("1��"), "95��");
		hashMap.put(new Student("2��"), "100��");
		hashMap.put(new Student("3��"), "12��");

		String stu1 = hashMap.get(new Student("1��"));
		System.out.println("1�� �л��� ���� : " + stu1);
		String stu2 = hashMap.get(new Student("2��"));
		System.out.println("2�� �л��� ���� : " + stu2);
		String stu3 = hashMap.get(new Student("3��"));
		System.out.println("3�� �л��� ���� : " + stu3);

	}

}
