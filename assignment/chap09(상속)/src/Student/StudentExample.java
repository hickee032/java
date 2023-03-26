package Student;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요 :");
		String num = scan.nextLine();
		System.out.println("이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		Student st = new Student(name, num);
		
	}

}
