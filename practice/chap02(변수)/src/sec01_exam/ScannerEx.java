package sec01_exam;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
	
		//입력스트림을 사용하겠다고 Scanner클래스를 생성함.
		Scanner scanner = new Scanner(System.in);
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		//num에다가 4바이트 메모리 공간에 정수 (int형)를 받겠다.
		int num = scanner.nextInt();
		System.out.println("num = " + num);
		
		//dnum에다가 8비트 메모리 공간에 실수 (double)형을 받겠다
		System.out.print("두자리 실수를 하나 입력해주세요.>");
		double dnum = scanner.nextDouble();
		System.out.println("dnum = " + dnum);
		scanner.nextLine();
		System.out.print("원하는 숫자를 입력하세요>");
		//엔터키를 입력할때까지의 문자열을 리턴해주는 메서드
		String input = scanner.nextLine();
		//입력받은 문자열을 숫자로 변환
		int num1 = Integer.parseInt(input);
		System.out.println("String으로 입력한 내용 : " +input);
		System.out.println(num1);
		//scanner.nextLine();
		
		System.out.print("Line() :");
		//next는 입력한 내용중 공백을 만나면 공백이전까지만 입력을 영향 받는 다.
		String input1 = scanner.next();
		System.out.println("input1의 내용 : " + input1);
		//리소스 해제 
		scanner.close();
	}
}
