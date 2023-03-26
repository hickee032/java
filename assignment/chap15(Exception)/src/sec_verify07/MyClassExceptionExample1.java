package sec_verify07;

import java.util.Scanner;

public class MyClassExceptionExample1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// �ݺ���
		// for (int i = 0; i < 10; i++) {

		// ���� ����
		while (true) {
			System.out.println("0~100 ������ ������ �Է��ϼ���(���Ḧ ���ϸ� -1�� �Է�): ");
			int a = scan.nextInt();
			try {

				MyClassExceptionExample1.doSomething(a);

			} catch (MyException e) {
				System.out.println(e.getMessage() + "���ܰ� �߻�������, ���α׷� ���� ����");
				 break;
			}
			
		}
		scan.close();
	}

	static void doSomething(int a) throws MyException {

		if (a == -1) {
			System.out.println(a + "�� �Է��ϼ̱��� ���α׷��� �����մϴ�.");
			System.exit(0);

		}
		if (((a < 0) || (a > 100)) && (a != -1)) {
			throw new MyException("score���� ����(0 <= x <= 100)�� �ʰ��Ͽ����ϴ�.");
		}

		else {
			System.out.println("�Է��� ������ " + a + "�Դϴ�.");
		}

	}
}