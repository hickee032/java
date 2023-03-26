package sec_verify02;

import java.util.Arrays;
import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		System.out.println("로또 번호 생성기 프로그램입니다.");
		System.out.println("자동으로 번호를 선택합니다.");

		Random lottoSe = new Random();

		Random lottoA = new Random(50);// 당첨 번호?

		int[] arr = new int[6];
		int[] arr1 = new int[6];

		String str = null;
		
		for (int i = 0; i < 6; i++) {

			arr[i] = Math.abs(lottoSe.nextInt() % 50) + 1;
			arr1[i] = Math.abs(lottoA.nextInt() % 50) + 1;
			if (arr[i] == arr1[i]) {

				str = "당첨 되었습니다.";
			} else {
				str = "당첨 되지 않았습니다.";
			}

		}
		System.out.println("선택 번호 : " + Arrays.toString(arr));
		System.out.println("당첨 번호 : " + Arrays.toString(arr1));
		System.out.println(str);
	}

}
