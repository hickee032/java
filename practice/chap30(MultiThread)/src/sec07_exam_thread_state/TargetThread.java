package sec07_exam_thread_state;

//�������� ���¸� �˾ƺ��� ���� Ŭ����
public class TargetThread extends Thread {

	@Override
	public void run() {
		// 20��� ����, ������ (Runnable)�� ���� ���¸� �ݺ�
		for (long i = 0; i < 2000000000; i++) {
		}
		// �Ͻ�����(TIMED_WATING)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		for (long i = 0; i < 2000000000; i++) {
		}
	}// ���� (TERMINATED)
}
