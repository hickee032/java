package sec01_String_Split;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ/������";

		// split�� �����ڸ� ������ (���� ǥ����)
		String[] names = text.split("&|,|-|/");

		// ���� for��
		for (String name : names)
			System.out.println(name);

	}

}
