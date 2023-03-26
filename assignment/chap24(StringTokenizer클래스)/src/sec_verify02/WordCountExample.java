package sec_verify02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���. �Է��Ͻ� ������ �� �������� �и��Ǿ� ��µ˴ϴ�.");
		System.out.println("���Ḧ ���Ͻø� exit�� �Է��Ͻø� �˴ϴ�.");

		while (true) {
			System.out.print("�Է� : ");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				System.out.println("����");
				System.exit(0);

			} else {
				StringTokenizer st = new StringTokenizer(input, " ");

				int a = st.countTokens();
				while (st.hasMoreTokens()) {

					System.out.println("������ ������ : " + st.countTokens());
					for (int i = 0; i < a; i++) {
						String token = st.nextToken();
						System.out.println("�и��� [" + i + "]��° ���� : " + token);
					}
					System.out.println();
				}
			}	
		}
	}
	
}
