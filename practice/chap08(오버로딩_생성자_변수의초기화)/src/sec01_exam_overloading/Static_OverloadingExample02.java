package sec01_exam_overloading;

public class Static_OverloadingExample02 {

	public static void main(String[] args) {

		// ����ƽ�� ����ƽ�� ȣ��
		int result = add(3, 5);
		System.out.println(result);

		int[] result2 = { 0 }; // �迭 ���� result2 0���� �ʱ�ȭ
		add(3, 5, result2); // add �޼��忡 (3,5,result2) �� �Ű������� ������.
		System.out.println(result2[0]);

	}

	// ����ƽ �޼��� �����ε�
	public static int add(int a, int b) {
		return a + b;

	}

	// �迭���� �ּҰ�
	public static void add(int a, int b, int[] result) {
		result[0] = a + b;
	}// �Ű� ������ ���� ���� a+b�� ���� result�迭�� ��� ���� ����.

}
