package sec10_exam01_thread_interrupt;

public class PrintThread extends Thread {

	@Override
	public void run() {
		// �Ʒ��� �Ϻη� �Ͻ����� ���·� ������̴�. ���������� �̷� �ڵ��� ����. �Ͻ������� ������ �ʰ� ���� �ϵ�������.
		try {
			while (true) {
				System.out.println("������");
				Thread.sleep(1);
			}

		} catch (InterruptedException e) {

			System.out.println("���� �߻�");
			System.out.println("interrupt()ȣ���");
		}
		System.out.println("�ý��� �ڿ� ���� �Ϸ�");
		System.out.println("������ ����");
	}
}

//����������� �������� ���ѷ����� �����ϱ� ���ؼ��� ���� ���� ����� interrupt()�� �̿��ϴ� ���� �̻����̴�. 
//�Ͻ������� �ְ� ���� ���������� �����ϴ� ����� ���� �θ� �̿�ȴ�.
