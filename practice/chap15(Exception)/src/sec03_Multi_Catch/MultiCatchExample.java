package sec03_Multi_Catch;

public class MultiCatchExample {

	public static void main(String[] args) {
		try {
			// ���� ���ܰ� �߻��Ҽ��ֳ�.?
			String data1 = args[0];
			String data2 = args[1];

			// ���� ���ܰ� �߻��Ҽ��ֳ�.?
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;

			System.out.println("result :" + result);
			// ��Ƽ ĳġ
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("���� �Ű����� ���ų� ���ڷ� ��ȯ�� �Ұ� �մϴ�.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("�˼����� ���ܰ� �߻���");
			e.printStackTrace();
		} finally {
			System.out.println("���α׷� ���� ����");
		}

	}

}
