package sec_verify04;

public class ThrowExample {

	public static void main(String[] args) {
		int a = 100, b = 0;

		try {

			throw new Exception(" 0���� ���������? �ȵ˴ϴ�");

		} catch (Exception e) {
			System.out.printf("�߻� ���� ==>" + e.getMessage());
		}

	}

}
