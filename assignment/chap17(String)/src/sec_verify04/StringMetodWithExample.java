package sec_verify04;


import java.util.Scanner;

public class StringMetodWithExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���ڿ� �Է� ==>> ");
		String input = scan.nextLine();

		boolean a = input.startsWith("(");
		boolean b = input.endsWith(")");

		if ((a == false) && (b == false)) {
			System.out.println("��� ���ڿ� ==> " + "(" + input + ")");
		} else {
			System.out.println("()�� �ٽ� Ȯ���� �ּ���");
		}

		scan.close();
	}

}
