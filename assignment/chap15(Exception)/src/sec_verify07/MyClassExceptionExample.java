package sec_verify07;

import java.util.Scanner;

public class MyClassExceptionExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		try {
			for (int i = 0; i < 4; i++) {

				System.out.println("0~100 ������ ������ �Է��ϼ���(���Ḧ ���ϸ� -1�� �Է�): ");
				int a = scan.nextInt();
				if ((0 < a) && (a < 100)) {
					System.out.println("�Է��� ������ " + a + "�Դϴ�.");
				}
				if (a == -1) {
					System.out.println("-1�� �Է��ϼ̱��� ���α׷��� �����մϴ�.");
				}
				if (a < 0) {
					throw new MyException("score���� ����(0 <= x <= 100)�� �ʰ��Ͽ����ϴ�.");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage() + "���ܰ� �߻�������, ���α׷� ���� ����");

		}
	}
}
