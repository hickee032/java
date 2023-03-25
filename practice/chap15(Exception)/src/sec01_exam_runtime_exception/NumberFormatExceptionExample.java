package sec01_exam_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "100a";

		int value1 = Integer.parseInt(data1);
		System.out.println(value1);

		// �õ��ض� �õ��ϴٰ� ���ܰ� ����� ���ܰ� ���� �κк��� ���� �������� catch�� ����~~ �׸��� ���α׷� ����
		try {
			int value2 = Integer.parseInt(data2);
			System.out.println(value2);
		} catch (NumberFormatException e) {
			System.out.println("���ܹ߻�" + e.toString());

			// �����ڿ� - ������� �ּ� ó��
			e.printStackTrace();
		}
		// ���ܰ� ������ �� ������ ������� ����ȴ�. - �׻� ����ȴ�.
		finally {
			System.out.println("���� ���α׷� ����");

		}
	}

}
