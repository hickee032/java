package sec_verify07;

import java.util.Scanner;

public class MyClassExceptionExample1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 반복문
		// for (int i = 0; i < 10; i++) {

		// 무한 루프
		while (true) {
			System.out.println("0~100 사이의 정수를 입력하세요(종료를 원하면 -1을 입력): ");
			int a = scan.nextInt();
			try {

				MyClassExceptionExample1.doSomething(a);

			} catch (MyException e) {
				System.out.println(e.getMessage() + "예외가 발생했지만, 프로그램 정상 종료");
				 break;
			}
			
		}
		scan.close();
	}

	static void doSomething(int a) throws MyException {

		if (a == -1) {
			System.out.println(a + "을 입력하셨군요 프로그램을 종료합니다.");
			System.exit(0);

		}
		if (((a < 0) || (a > 100)) && (a != -1)) {
			throw new MyException("score값이 범위(0 <= x <= 100)를 초과하였습니다.");
		}

		else {
			System.out.println("입력한 정수는 " + a + "입니다.");
		}

	}
}