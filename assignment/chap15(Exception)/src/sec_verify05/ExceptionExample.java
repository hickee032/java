package sec_verify05;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("나뉠 수를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.print("나눌 수를 입력하세요 : ");
		int b = scan.nextInt();
		try {
			if (b == 0) {
				throw new Exception("예외 발생");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage()+" - 0으로 나눌 수 없습니다.");

		}
	}

}
