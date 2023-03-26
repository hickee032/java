package sec_verify07;

import java.util.Scanner;

public class MyClassExceptionExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		try {
			for (int i = 0; i < 4; i++) {

				System.out.println("0~100 사이의 정수를 입력하세요(종료를 원하면 -1을 입력): ");
				int a = scan.nextInt();
				if ((0 < a) && (a < 100)) {
					System.out.println("입력한 정수는 " + a + "입니다.");
				}
				if (a == -1) {
					System.out.println("-1을 입력하셨군요 프로그램을 종료합니다.");
				}
				if (a < 0) {
					throw new MyException("score값이 범위(0 <= x <= 100)를 초과하였습니다.");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage() + "예외가 발생했지만, 프로그램 정상 종료");

		}
	}
}
