package sec01_constractor;

import java.util.Arrays;
import java.util.Scanner;

public class BytetoExample {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String str1 = scan.nextLine();
//		byte[] byte1 = str1.getBytes();
//		System.out.println(Arrays.toString(byte1));

		// 10개의 키코드(문자 코드)값이 저장된 배열 (아스키 코드 값)
		byte[] bytes = new byte[] { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		System.out.println(bytes.length);
		// byte 배열 str로 디코딩
		String str = new String(bytes);
		System.out.println(str);
//		scan.close();

	}

}
