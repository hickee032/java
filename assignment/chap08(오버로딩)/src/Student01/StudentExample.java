package Student01;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		String num = null;

		String name = null;

		Scanner scan = new Scanner(System.in);

		System.out.print("�й��� �Է��ϼ��� : ");

		num = scan.nextLine();

		System.out.print("�̸��� �Է��ϼ��� : ");

		name = scan.nextLine();

		Student st = new Student(name, num);

		st.setP_name(name);

		System.out.println(st);

		scan.close();
	}

}
