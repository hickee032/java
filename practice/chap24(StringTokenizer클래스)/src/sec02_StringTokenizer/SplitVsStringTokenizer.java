package sec02_StringTokenizer;

import java.util.StringTokenizer;

public class SplitVsStringTokenizer {

	public static void main(String[] args) {
		String data = "100    200 300";

		// �Ʒ� �Ѵ� �����ڸ� �������� �־��� (" ")
		// split()�� ������� �ϳ��� ��ū���� �ν��� �Ѵ�.
		String[] result = data.split(" ");
		StringTokenizer st = new StringTokenizer(data, " ");

		for (String str : result) {
			System.out.println(str);
		}
		System.out.println("��ū���� - " + result.length);

		System.out.println("----------------------------");
		// StringTokenizerŬ������ hasMoreTokens()�� nextToken()�� ��ū�� �����ͼ� ����ϰ� �� ������ ������ �Ѵ�
		System.out.println("��ū ���� - " + st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println("��ū ���� - " + st.countTokens());
			String str = st.nextToken();
			System.out.println(str);
		}

		/*
		 * ����� StringŬ����, StringTokenizerŬ���� �Ѵ� ������ �����ڷ� �־������� �ұ��ϰ� ����� �ٸ��ٴ� ���� �˾Ҵ�. �Ͽ�
		 * �� Ŭ������ ������� �˾����� ���� ���α׷��ֽÿ� �� ȯ�濡 �°� �����ؼ� ���α׷��� �ϸ� �ȴ�.
		 */
	}

}
