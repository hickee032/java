package sec10_exam02_thread_interrupt;

public class CountThread extends Thread {

	@Override
	public void run() {
		int i = 10;
		while (true) {
			System.out.println("ī��Ʈ �ٿ� - " + i--);

			// ���ͷ�Ʈ�� ȣ�� �Ǿ��� �� Ȯ���ϴ� ���ǹ� �ʼ��̴�.
			if (Thread.interrupted()) { // ���ͷ�Ʈ�� ���� ���Ƴ�?
				System.out.println("���ͷ�Ʈ �޼��� ȣ���");
				break;
			}

			// �����尡 �ʹ� ���� ���ư��ϱ� �Ϻη� �ð��� ����
			for (long x = 0; x < 2100000000; x++) {
			}

		}
		System.out.println("ī��Ʈ�� ����Ǿ���~~~");
	}
}
