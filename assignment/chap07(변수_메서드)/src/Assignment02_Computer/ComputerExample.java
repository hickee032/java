package Assignment02_Computer;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {

		int input = 0;

		int arr_input = 0;

		Scanner scan = new Scanner(System.in);

		Computer Com = new Computer();

		System.out.print("1���� �迭�� ����ϴ�.�迭���� �Է�: ");

		input = scan.nextInt();

		int[] values = new int[input];

		System.out.println("�ش� �迭 �濡 ������ �Է��ϼ���.");

		for (int i = 0; i < values.length; i++) {

			System.out.print("value[" + i + "] = ");

			arr_input = scan.nextInt();

			values[i] = arr_input;

		}

		System.out.println("�Է��Ͻ� 1���� �迭�� ���� ����մϴ�.");

		for (int i = 0; i < values.length; i++) {

			System.out.println("value[" + i + "] = " + values[i]);

		}

		int result = Com.sum(values);

		System.out.println(result);

		scan.close();
	}

}