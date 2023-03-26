package sec_verify03;

import java.util.Scanner;

public class StringMetodExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("문자열 입력 ==>> ");
		String input = scan.nextLine();

		String str = input.toUpperCase();

		System.out.println(str);
		String str1 = str.replace("S", "$");

		System.out.println("출력 문자열 ==>>" + str1);

		scan.close();
	}

}
