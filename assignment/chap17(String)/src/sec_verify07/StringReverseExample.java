package sec_verify07;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = scan.nextLine();

		StringBuilder re = new StringBuilder(input);

		System.out.println("������ �Ųٷ� ��� ==> " + re.reverse());

		scan.close();

	}

}
