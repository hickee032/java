package sec01_constractor;

import java.util.Arrays;

public class keybordToString {

	public static void main(String[] args) {

		byte[] bytes = new byte[100];
		System.out.print("입력 :");
		// 키보드 입력 입력 받은 바이트 수 리턴

		int readByteNo;
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes, 0, readByteNo - 2);
			// readByteNo에서 2를 뺴는 이유는 엔터와 라인피드 때문이다.
			// byte[] b = str.getBytes("UTF-8");
			byte[] b = str.getBytes("EUC-KR");
			System.out.println("String 값 - " + str);
			System.out.println("byte[] 값 - " + Arrays.toString(b));
			System.out.println("입력 받은 바이트 수" + readByteNo);

			String str1 = new String("칼라");
			byte[] b1 = str1.getBytes();
			System.out.println(b1.length);

			byte[] b2 = "칼라".getBytes("UTF-8");
			System.out.println(b2.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
