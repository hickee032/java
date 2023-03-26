package sec_verify07;

import java.util.Scanner;

public class StringReverseExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String input = scan.nextLine();

		StringBuilder re = new StringBuilder(input);

		System.out.println("내용을 거꾸로 출력 ==> " + re.reverse());

		scan.close();

	}

}
