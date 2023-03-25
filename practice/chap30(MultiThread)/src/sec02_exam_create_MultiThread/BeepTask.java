package sec02_exam_create_MultiThread;

import java.awt.Toolkit;

//Runnable �������̽���  �������� -- FunctionalInterface �Լ��� �������̽�
public class BeepTask implements Runnable {

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // �̱��� �����̴�.

		for (int i = 0; i < 5; i++) {

			// .currentThread() ���� �������� �����带 �˾Ƴ���.
			System.out.println("for���� �����ϴ� ������ �̸� : " + Thread.currentThread().getName()); //Thread-0���� ���´�.

			toolkit.beep(); // ������

			// sleep�� ������� ��� ���ߴ� ����� �Ѵ�.
			// �Ʒ��� ���� sleep()�� ����ϴ� ������ main�����尡 �ʹ� ���� ����Ǵϱ�.
			try {
				Thread.sleep(500); // 0.5�ʸ� �����.
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
}
