package sec01_pattern;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bouns", "cA", "ca", "co", "c0", "car", "combat", "count", "data", "disc" };

		Vector<String> vc = new Vector<String>();
		// �Ʒ� ������ ���� �Ͽ��� �� c�� ���� �ϴ� �ҹ��� ���� �ܾ ������ �������� ����
		Pattern p = Pattern.compile("c[a-z]*");

		System.out.println("c�� �����ϴ� �ҹ��� ����ܾ ����մϴ�.");
		for (String str : data) {
			Matcher m = p.matcher(str);

			// ����ǥ���İ� ������ �� ����� ������ vector�� ����.
			if (m.matches()) {
				System.out.print(str + ", ");
				vc.add(str);
			}
		}
		System.out.println();
		System.out.println("c�� �����ϴ� �ҹ��� ���ܾ�" + vc.toString());
	}

}
