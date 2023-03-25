package sec08_exam_thread_yield;

public class YieldExample {

	public static void main(String[] args) {

		ThreadA threadA = new ThreadA(); // �켱���� Nomal = 5
		ThreadB threadB = new ThreadB(); // �켱���� Nomal = 5

		threadA.start();
		threadB.start();

		// 3�ʵ����� ������ �����ϴٰ� ���� ThreadA�� yield()ȣ�������μ� ThreadB�� ����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		// �켱������ ���ų� �������� yield()�� ���� �ϰԲ� �Ǿ������� �׷��� �ʾ� ���δ�.
		// threadB.setPriority(Thread.MIN_PRIORITY);
		threadA.work = false;

		// 3�ʵ����� ������ �����ϴٰ� ���� ThreadB�� yield()ȣ�������μ� ThreadA�� ����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		threadA.work = true;
		threadB.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		threadA.stop = true;
		threadB.stop = true;

	}

}
