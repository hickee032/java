package sec_verify03;

public class getMessageExample {

	public static void main(String[] args) {

		try {
			int a = 100, b = 0;

			System.out.println(a / b);
		} catch (Exception e) {
			System.out.printf("�߻� ������ �޽����� ����մϴ�. ==>"+ e.getMessage());
		}

	}

}
