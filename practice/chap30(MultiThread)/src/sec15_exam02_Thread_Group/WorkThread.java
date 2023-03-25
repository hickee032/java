package sec15_exam02_Thread_Group;

public class WorkThread extends Thread {
	// ������ (����Ŭ���� �׷�, �ڽ��� ������ �̸�)
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		// ���� ����ǰ� �ִ� ������ �׷�

		// ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		// String str = mainGroup.getName();

		// ���� �������� ������ �׷��� �̸��� ��� ��.
		String str = Thread.currentThread().getThreadGroup().getName();
		System.out.println("Thread�� : " + Thread.currentThread().getName() + " ThreadGroup�� : " + str);

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName() + " : interrupt ȣ���");
				break;
			}
		}
		System.out.println(this.getName() + " : �����");
	}

}
