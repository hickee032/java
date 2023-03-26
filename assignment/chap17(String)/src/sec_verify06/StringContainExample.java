package sec_verify06;

import java.util.Scanner;

public class StringContainExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input1 = scan.nextLine();
		String input2 = scan.nextLine();

		System.out.print("첫 번째 문장을 입력해보세요 : ");
		System.out.println("문자열1 ==> [" + input1 + "]");
		System.out.print("두 번째 문장을 입력해보세요 : ");
		System.out.println("문자열2 ==> [" + input2 + "]");

		if (input1.equals(input2)) {
			System.out.println("입력한 두 문장은 같은 문장이네요.");
		} else {
			System.out.println("입력한 두 문장은 다른 문장이네요.");
		}

		if ((input1.indexOf("Java") != -1) && (input2.indexOf("Java") != -1)) {
			System.out.println("입력한 두 문장에는 Java가 포함되어있네요.");
		} else {
			System.out.println("입력한 두 문장에는 Java가 포함되어있지 않아요.");
		}
		scan.close();
	}

}
