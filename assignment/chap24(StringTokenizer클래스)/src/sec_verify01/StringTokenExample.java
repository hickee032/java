package sec_verify01;

import java.util.StringTokenizer;

public class StringTokenExample {

	public static void main(String[] args) {

		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");

		System.out.println("st ���������� ��ü�� ���� /���� �и��� ���");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();

			System.out.println(token);

		}

	}

}
