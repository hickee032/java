package sec11_exam_thread_StopFlag;

public class StopFlagExample {

	public static void main(String[] args) throws Exception {
		PrintThread printThread = new PrintThread();
		printThread.start();

		// ���ν����� 1�� ������ PrintThread�� stop�÷��׷� ���� ���� ����
		// ������ ���������� �����带 �����Ҷ� �����带 �Ͻ������� ���� �����ϴ� ����� ������� �ʴ� ��.
		Thread.sleep(1000);

		printThread.setStop(true);

	}

}
