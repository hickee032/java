package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean run = true;

		while (run) {
			
			System.out.println("두 정수와 연산자를 입력하시오.");
			System.out.print("(종료를 원하시면 -1을 입력해주세요)>>");

			double a = scan.nextDouble();
			double b = scan.nextDouble();
			String key = scan.nextLine();
			
			System.out.println(a+","+b+","+key);  //확인용
			
			if (key == "+") {
				System.out.println(1);
				
			}
			if (key == "-1") {
				System.out.println("프로그램 종료");
			}

			

		}
	}

}
