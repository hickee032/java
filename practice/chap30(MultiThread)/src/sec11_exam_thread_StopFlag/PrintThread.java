package sec11_exam_thread_StopFlag;

public class PrintThread extends Thread {

	private boolean stop; // stop�÷��� ���� ����

	public void setStop(boolean stop) {
		this.stop = stop;

	}

	@Override
	public void run() {
		// �ܺο��� stop�� setter�� ȣ�� �ϸ� true�� �����ϸ� ���� �������� ���´�.
		while (!stop) {
			System.out.println(Thread.currentThread().getName() + " : ������");
		}
		System.out.println("�ý��� �ڿ� ���� �Ϸ�");
		System.out.println(Thread.currentThread().getName() + " : ������ ����");
	}
}
