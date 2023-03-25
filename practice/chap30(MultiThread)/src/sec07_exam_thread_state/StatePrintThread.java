package sec07_exam_thread_state;

public class StatePrintThread extends Thread {

	// �������� ���¸� �˾ƺ��� ���� ����� TargetThread�� ����
	private TargetThread targetThread;

	public StatePrintThread(TargetThread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			//TargetThread�� ���� ������ ��´�.
			//Thread.State�� ThreadŬ������ ���� Ŭ���� �̸� Enum(����)Ÿ���̴�.
			Thread.State state = targetThread.getState();
			System.out.println("TargetThread ���� : " + state);

			// targetThread�� �����Ǿ��� ����� �����Ǿ����� run()�϶�
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			// targetThread�� ����Ǿ��� ����� ����Ǿ����� run()�϶�
			if (state == Thread.State.TERMINATED) {
				break;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}
