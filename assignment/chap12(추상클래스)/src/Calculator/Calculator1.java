package Calculator;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Calc add = new Add();
		
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�.");
		System.out.print("(���Ḧ ���Ͻø� -1�� �Է����ּ���)>>");

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		String key = scan.nextLine();

		switch (key) {

		case "+":
			
			add.a = a;
			add.b = b;
			add.calculate();

			break;
		case "-":

			break;
		case "*":

			break;
		case "/":

			break;

		case "-1":

			System.out.println("���α׷� ����");
			break;

		default:
			break;
		}

	}

}
