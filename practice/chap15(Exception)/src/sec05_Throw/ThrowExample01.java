package sec05_Throw;

public class ThrowExample01 {

	public static void main(String[] args) {
		try {
			// ������ ���ܸ� �߻���Ű�� �ڵ�
			throw new Exception("���Ƿ� �߻���Ŵ");
			// System.out.println("~~~~~~~~"); //���� �����Ҽ� ���� �ڵ� - ���ܹ߻�

		} catch (Exception e) {
			System.out.println("���� �޼��� ���" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���� ����");
	}

}
