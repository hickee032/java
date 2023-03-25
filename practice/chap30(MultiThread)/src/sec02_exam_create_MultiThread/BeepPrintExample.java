package sec02_exam_create_MultiThread;

public class BeepPrintExample {

	public static void main(String[] args) {
		// ���� �����ϴ� ��Ƽ������� �ϴ� 3���� ���

		// ���1 --> ���� ����

		Runnable beeptask = new BeepTask();
		Thread thread1 = new Thread(beeptask);

		// ���2 --> �͸�����ü

		/*
		 * Thread thread = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { Toolkit toolkit = Toolkit.getDefaultToolkit();
		 * // �̱��� �����̴�.
		 * 
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * // .currentThread() ���� �������� �����带 �˾Ƴ���.
		 * System.out.println("for���� �����ϴ� ������ �̸� : " +
		 * Thread.currentThread().getName()); // Thread-0���� ���´�.
		 * 
		 * toolkit.beep(); // ������
		 * 
		 * // sleep�� ������� ��� ���ߴ� ����� �Ѵ�. // �Ʒ��� ���� sleep()�� ����ϴ� ������ main�����尡 �ʹ� ����
		 * ����Ǵϱ�. try { Thread.sleep(500); // 0.5�ʸ� �����. } catch (InterruptedException
		 * e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * }
		 * 
		 * } });
		 */

		// ���3 --> ���ٽ� �Լ��� �������̽� ���� ����� �����ϴ�.

		/*
		 * Thread thread2 = new Thread(() -> { Toolkit toolkit =
		 * Toolkit.getDefaultToolkit(); // �̱��� �����̴�.
		 * 
		 * for (int i = 0; i < 5; i++) {
		 * 
		 * // .currentThread() ���� �������� �����带 �˾Ƴ���.
		 * System.out.println("for���� �����ϴ� ������ �̸� : " +
		 * Thread.currentThread().getName()); // Thread-0���� ���´�.
		 * 
		 * toolkit.beep(); // ������
		 * 
		 * // sleep�� ������� ��� ���ߴ� ����� �Ѵ�. // �Ʒ��� ���� sleep()�� ����ϴ� ������ main�����尡 �ʹ� ����
		 * ����Ǵϱ�. try { Thread.sleep(500); // 0.5�ʸ� �����. } catch (InterruptedException
		 * e) {
		 * 
		 * e.printStackTrace(); }
		 * 
		 * } });
		 */

		thread1.start();
		// thread2.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main()�� for���� �����ϴ� ������ �̸� :" + Thread.currentThread().getName());
			System.out.println("��");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

			thread1.start(); // thread1.start()�� ����� ������ �Ұ����ϴ�!!
			// ������ �ϰ�ʹٸ� �Ʒ��� ���� ���ο� �ν��Ͻ��� ���� start()�� ȣ���ؾ��Ѵ�.
			beeptask = new BeepTask();
			thread1 = new Thread(beeptask);
			thread1.start();
		}
	}

}
