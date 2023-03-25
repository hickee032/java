package sec06_exam_thread_unsynchcronized;

public class MainThreadExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		// ������ �����ΰ� ? ��°���� ���� User2�� ������ ������ �� ���
		// ���� User1 ������� ���ϴ� ��� ���̴�.
		// �̹����� ��� �ذ��ϴ� �����? -->����ȭ�� �ؾ��Ѵ�.

		/*
		 * synchronized �����ڸ� �ٿ������ν� ��ü ���(�޼��� ���)�� �Ͼ �������� ��Ȯ���� �ŷڼ��� �����Ѵ�.
		 */

		User1 user1 = new User1();
		user1.setCal(cal);
		user1.start();

		User2 user2 = new User2();
		user2.setCal(cal);
		user2.start();

	}

}
