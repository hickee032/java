package sec_verify08;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("문자열을 대문자는 소문자로 소문자는 대문자로 변경합니다.");
		System.out.print("문자열을 입력하세요 : ");
		String input = scan.nextLine();

		char[] arr = new char[input.length()];

		System.out.print("변환된 문자열 ==> ");
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
