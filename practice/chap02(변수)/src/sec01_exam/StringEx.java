package sec01_exam;

public class StringEx {

	public static void main(String[] args) {
		// StringŬ������ �������� name, str
		String name = new String("Ja" + "va");
		String str = new String(name + 8.0);

		// �ִ�Ÿ�� + ���ڿ� = ���ڿ�

		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " "); // +�� ������ ���ڿ�ȭ �Ͽ� �������ش�.
		System.out.println(" " + 7);

		// 1234567�� ������ Ÿ���� �����ΰ���?
		System.out.println(1234567);
	}
}
