package Assignment05;

import java.util.Scanner;

public class PowerExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("���������� ���� ����մϴ�.");

		System.out.print("�����ϰ� ���� ���� �Է� : ");

		int x = scan.nextInt();

		System.out.print("����� �ұ��? : ");

		int y = scan.nextInt();

		long result = PowerExample.power(x, y);

		System.out.println(x + "�� " + y + "�� ������ �հ�� " + result);

		scan.close();
	}

	public static long power(int x, int n) {
		long result = 1;
		long sum = 0;

		for (int i = 0; i <= n - 1; i++) {
			result *= x;

			sum += result;
			// System.out.println(result);
		}
		// System.out.println(sum);
		return sum;
	}

}
//x*x