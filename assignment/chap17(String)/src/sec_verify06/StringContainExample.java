package sec_verify06;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input1 = scan.nextLine();
		String input2 = scan.nextLine();

		System.out.print("ù ��° ������ �Է��غ����� : ");
		System.out.println("���ڿ�1 ==> [" + input1 + "]");
		System.out.print("�� ��° ������ �Է��غ����� : ");
		System.out.println("���ڿ�2 ==> [" + input2 + "]");

		if (input1.equals(input2)) {
			System.out.println("�Է��� �� ������ ���� �����̳׿�.");
		} else {
			System.out.println("�Է��� �� ������ �ٸ� �����̳׿�.");
		}

		if ((input1.indexOf("Java") != -1) && (input2.indexOf("Java") != -1)) {
			System.out.println("�Է��� �� ���忡�� Java�� ���ԵǾ��ֳ׿�.");
		} else {
			System.out.println("�Է��� �� ���忡�� Java�� ���ԵǾ����� �ʾƿ�.");
		}
		scan.close();
	}

}
