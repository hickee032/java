package sec01_constractor;

import java.util.Arrays;

public class keybordToString {

	public static void main(String[] args) {

		byte[] bytes = new byte[100];
		System.out.print("�Է� :");
		// Ű���� �Է� �Է� ���� ����Ʈ �� ����

		int readByteNo;
		try {
			readByteNo = System.in.read(bytes);
			String str = new String(bytes, 0, readByteNo - 2);
			// readByteNo���� 2�� ���� ������ ���Ϳ� �����ǵ� �����̴�.
			// byte[] b = str.getBytes("UTF-8");
			byte[] b = str.getBytes("EUC-KR");
			System.out.println("String �� - " + str);
			System.out.println("byte[] �� - " + Arrays.toString(b));
			System.out.println("�Է� ���� ����Ʈ ��" + readByteNo);

			String str1 = new String("Į��");
			byte[] b1 = str1.getBytes();
			System.out.println(b1.length);

			byte[] b2 = "Į��".getBytes("UTF-8");
			System.out.println(b2.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
