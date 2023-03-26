package sec_verify05;

import java.util.Scanner;

public class StringTrimExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("원하는 문장을 입력해보세요 : ");
		String input = scan.nextLine();
		System.out.println("입력한 문자열 : [" + input + "]");
		String str = input.replaceAll(" ", "");
		System.out.println("공백제거를 한 문자열 : [" + str + "]");

		scan.close();
	}

}
