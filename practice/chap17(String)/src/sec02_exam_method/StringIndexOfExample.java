package sec02_exam_method;

public class StringIndexOfExample {

	public static void main(String[] args) {
		// IndexOf�� ã�� ����� �Ҷ� ���� ���δ�.(����,���� ��)

		String str = "������ �ڹ� ���� �ϱⰡ ���� ���̳�";

		// ���ڸ� ã���� ������ �ε����� �����Ѵ�.
		int index = str.indexOf("����");

		System.out.println("������ ���� ���ȣ : " + index);

		// ���ζ�� ���ڿ��� ���ԵǾ�������.
		if (str.indexOf("����") != -1) {
			System.out.println("���ο� ������ �ֱ���");
		} else {
			System.out.println("���ο� ������ ������");
		}
	}

}
