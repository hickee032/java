package sec_verify08;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("���ڿ��� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� �����մϴ�.");
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String input = scan.nextLine();

		char[] arr = new char[input.length()];

		System.out.print("��ȯ�� ���ڿ� ==> ");
		for (int i = 0; i < input.length(); i++) {

			// System.out.println(input.charAt(i));
			arr[i] = input.charAt(i);
			// System.out.println(arr[i]);
			if (97 <= arr[i] && arr[i] <= 122) {
				arr[i] = (char) (arr[i] - 32);
			} else if (65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char) (arr[i] + 32);
			}

			System.out.print(arr[i]);

		}
		scan.close();
	}

}
