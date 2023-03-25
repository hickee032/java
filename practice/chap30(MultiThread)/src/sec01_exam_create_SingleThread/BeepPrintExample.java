package sec01_exam_create_SingleThread;

import java.awt.Toolkit;

public class BeepPrintExample {

	// main ������� JVM�� ����
	public static void main(String[] args) {

		/*
		 * �Ʒ��ڵ�� �̱� �����忡�� ���ư��� �۾��̹Ƿ� �������� 5�� �˸��� ���� �� �̶�� ���ڸ� ����Ѵ�. ������ �츮�� ���ϴ� ���� ���
		 * ���ڿ��� ��µǸ鼭 ���� �������� ��µǴ� ���� ���Ѵ�. �̰��� �̱� �������� �����̴�. �������̶�� ���̴�.�̰��� ��Ƽ ������� �ٲ㰡��
		 * ���� �츮�� ������ �忡�� �����̴�. �������� 5�� �ݺ��ؼ� �Ҹ������� Toolkit�� AWT(abstract window toolkit
		 * )�� ��� ���� �߻�Ŭ���� ���� GUI���� �޼������ �ִ�. getDefaultToolkit()�⺻���� �޼��带 ������ ���� �޼���
		 */

		Toolkit toolkit = Toolkit.getDefaultToolkit(); // �̱��� �����̴�.

		for (int i = 0; i < 5; i++) {

			// .currentThread() ���� �������� �����带 �˾Ƴ���.
			System.out.println("for���� �����ϴ� ������ �̸� : " + Thread.currentThread().getName());

			toolkit.beep();

			// sleep�� ������� ��� ���ߴ� ����� �Ѵ�.
			// �Ʒ��� ���� sleep()�� ����ϴ� ������ main�����尡 �ʹ� ���� ����Ǵϱ�.
			try {
				Thread.sleep(500); // 0.5�ʸ� �����.
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

		for (int i = 0; i < 5; i++) {
			System.out.println("��");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
