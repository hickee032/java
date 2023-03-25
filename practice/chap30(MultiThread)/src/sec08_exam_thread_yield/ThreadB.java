package sec08_exam_thread_yield;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	@Override
	public void run() {
		while (!stop) {
			if (work) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
				}
				System.out.println("ThreadB�� �۾�����");
			} else {
				// ���ǹ��� �ݺ��� �������� �ٸ� ������ ���� �纸�Ѵ�.
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}

}
