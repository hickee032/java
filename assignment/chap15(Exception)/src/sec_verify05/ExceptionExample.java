package sec_verify05;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է��ϼ��� : ");
		int a = scan.nextInt();
		System.out.print("���� ���� �Է��ϼ��� : ");
		int b = scan.nextInt();
		try {
			if (b == 0) {
				throw new Exception("���� �߻�");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage()+" - 0���� ���� �� �����ϴ�.");

		}
	}

}
