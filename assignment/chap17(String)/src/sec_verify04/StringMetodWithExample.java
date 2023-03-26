package sec_verify04;


import java.util.Scanner;

public class StringMetodWithExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("문자열 입력 ==>> ");
		String input = scan.nextLine();

		boolean a = input.startsWith("(");
		boolean b = input.endsWith(")");

		if ((a == false) && (b == false)) {
			System.out.println("출력 문자열 ==> " + "(" + input + ")");
		} else {
			System.out.println("()를 다시 확인해 주세요");
		}

		scan.close();
	}

}
