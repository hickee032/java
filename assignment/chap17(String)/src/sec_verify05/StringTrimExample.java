package sec_verify05;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���ϴ� ������ �Է��غ����� : ");
		String input = scan.nextLine();
		System.out.println("�Է��� ���ڿ� : [" + input + "]");
		String str = input.replaceAll(" ", "");
		System.out.println("�������Ÿ� �� ���ڿ� : [" + str + "]");

		scan.close();
	}

}
