package sec_verify02;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		System.out.println("�ζ� ��ȣ ������ ���α׷��Դϴ�.");
		System.out.println("�ڵ����� ��ȣ�� �����մϴ�.");

		Random lottoSe = new Random();

		Random lottoA = new Random(50);// ��÷ ��ȣ?

		int[] arr = new int[6];
		int[] arr1 = new int[6];

		String str = null;
		
		for (int i = 0; i < 6; i++) {

			arr[i] = Math.abs(lottoSe.nextInt() % 50) + 1;
			arr1[i] = Math.abs(lottoA.nextInt() % 50) + 1;
			if (arr[i] == arr1[i]) {

				str = "��÷ �Ǿ����ϴ�.";
			} else {
				str = "��÷ ���� �ʾҽ��ϴ�.";
			}

		}
		System.out.println("���� ��ȣ : " + Arrays.toString(arr));
		System.out.println("��÷ ��ȣ : " + Arrays.toString(arr1));
		System.out.println(str);
	}

}
