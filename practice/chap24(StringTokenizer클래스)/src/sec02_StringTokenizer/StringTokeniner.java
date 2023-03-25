package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class StringTokeniner {

	public static void main(String[] args) {
		
		String souece = "1,��õ��,100,100,100|2,�ڼ�ä,95,80,90|3,���ڹ�,80,90,90";
		// �� ����� ������ �����ϱ� ���ؼ��� |�� ���
		StringTokenizer st = new StringTokenizer(souece, "|");
		// ��������� ���� ������ �����ڰ� ũ�� 2������ ���������� �����̴�
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println("������ ��ū : " + token);
			// ������ ��ū�� �ٽ� �� �����ڸ� ��
			StringTokenizer st1 = new StringTokenizer(token, ",");
			while (st1.hasMoreTokens()) {
				System.out.println(st1.nextToken());

			}
		}
	}

}