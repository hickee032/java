package sec_verify02;

public class StringMetodExample {

	public static void main(String[] args) {
		String a = new String("    java,");
		String b = new String("program,fighting      ");

		String ab = a.concat(b);
		System.out.println("���ڿ� a�� ���ڿ� b�� ������ ��� : " + ab);

		String newa = ab.trim();
		System.out.println("���ڿ� a�� ������ ������ ��� : " + newa);

		String rea = newa.replace("a", "1");
		System.out.println("���ڿ� a�� a�� 1�� ��ġ�� ��� : " + rea);

		String[] arr = rea.split(",");

		for (int i = 0; i < arr.length; i++) {
			System.out.println("�и��� " + i + "�� ���ڿ�: " + arr[i]);
		}

		String subs = rea.substring(3);
		System.out.println("���ڿ� a�� substring�� ���  : " + subs);
		char c = subs.charAt(2);
		System.out.println("���ڿ� a�� 2��° ���ڸ� char c�� ������ ��� : " + c);
	}

}
