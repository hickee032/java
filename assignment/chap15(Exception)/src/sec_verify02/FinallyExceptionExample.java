package sec_verify02;

public class FinallyExceptionExample {

	public static void main(String[] args) {
		try {
			int[] num = new int[3];
			int result = num[0] / 0;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0���� ������ ���� �������� ~~  ");
		} finally {
			System.out.println("�� �κ��� ������ ���Ϳ� ~~ ");
		}

	}

}
