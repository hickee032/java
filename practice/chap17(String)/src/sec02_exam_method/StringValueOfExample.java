package sec02_exam_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		// String.valueof() �����޼���� UIȭ���̳� ������ ��
		// ��ġ�� ��Ÿ������ �Ҷ� ���� ���δ�.

		String str1 = String.valueOf(true);
		String str2 = String.valueOf(10);
		String str3 = String.valueOf(10.5);

		// str1 �� ���� �� ������ booleanŸ���� �ƴ϶� stringŸ���̶�� ���� �߿��ϴ�.
		System.out.println(str1);

		System.out.println(str2.equals(str3));
		System.out.println(str3);

	}

}
