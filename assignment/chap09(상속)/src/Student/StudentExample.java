package Student;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�й��� �Է��ϼ��� :");
		String num = scan.nextLine();
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = scan.nextLine();
		
		Student st = new Student(name, num);
		
	}

}
