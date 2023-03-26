package Calculator;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Calc add = new Add();
		
		System.out.println("두 정수와 연산자를 입력하시오.");
		System.out.print("(종료를 원하시면 -1을 입력해주세요)>>");

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

			System.out.println("프로그램 종료");
			break;

		default:
			break;
		}

	}

}
