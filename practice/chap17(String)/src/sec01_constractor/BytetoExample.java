package sec01_constractor;

import java.util.Arrays;
import java.util.Scanner;

public class BytetoExample {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String str1 = scan.nextLine();
//		byte[] byte1 = str1.getBytes();
//		System.out.println(Arrays.toString(byte1));

		// 10���� Ű�ڵ�(���� �ڵ�)���� ����� �迭 (�ƽ�Ű �ڵ� ��)
		byte[] bytes = new byte[] { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		System.out.println(bytes.length);
		// byte �迭 str�� ���ڵ�
		String str = new String(bytes);
		System.out.println(str);
//		scan.close();

	}

}
