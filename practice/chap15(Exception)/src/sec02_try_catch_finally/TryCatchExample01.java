package sec02_try_catch_finally;

public class TryCatchExample01 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(1 / 0); // ���� �߻�
			System.out.println(-10); // ���� �߻� �� �������� �ʴ� ��.

		} catch (Exception e) {
			System.out.println(4);
			e.printStackTrace();
		}
		// try������ ������ �ʾұ� ������ �߰Եȴ�.
		System.out.println(5);

	}

}
