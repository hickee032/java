package sec_verify06;

public class NumberExceptionExample {

	public static void main(String[] args) {

		String[] stringNumber = { "23", "12", "998", "java" };

		for (int i = 0; i < stringNumber.length; i++) {
			try {
				int result = Integer.parseInt(stringNumber[i]);

				System.out.println("���ڷ� ��ȯ�� ���� " + result);

			} catch (Exception e) {

				System.out.println(e.getMessage() + "������ ��ȯ�� �� �����ϴ�.");
			}
		}

	}

}
