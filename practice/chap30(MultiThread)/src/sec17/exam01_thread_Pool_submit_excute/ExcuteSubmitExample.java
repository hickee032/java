package sec17.exam01_thread_Pool_submit_excute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteSubmitExample {

	public static void main(String[] args) {
		// �ڽ��� �ھ�� ��ŭ ���������
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("������ ������ ���� : " + Runtime.getRuntime().availableProcessors());
		// 20���� �۾� ��ü ����.
		for (int i = 0; i < 20; i++) {

			Runnable runnable = new Runnable() {

				@Override
				public void run() {

					// newFixedThreadPool�� newCachedThreadPool�� ����������
					// ThreadPoolExecutor�θ���� ���� ������ Ÿ�Ժ�ȯ����
					// ThreadPoolExecutor��ü�� ������ �ִ�.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

					// ���� ������Ǯ�� �ִ� ������ ������ �����Ͽ� ������ �ִ�.
					int poolsize = threadPoolExecutor.getPoolSize();
					// �۾������ϴ� ��������� ��´�.

					String threadName = Thread.currentThread().getName();
					// System.out.println("�۾� ó��-" + threadName);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}

					System.out.println("[�� ������ ���� : " + poolsize + "] [�۾������� �̸� : " + threadName + "]");
					// �Ϻη� ���ܸ� �߻����Ѽ� execute()�� submit()�� ���̸� ����.

					try {
						int value = 10 / 0;
						// System.out.println("try");
					} catch (Exception e) {
						System.out.println("catch");
					}

				}
			};

			// �۾�ť�� runnable��ü�� �ִ� ���� excute()�� �۾�ó�� ���߿� ���ܰ� �߻��ϸ�
			// �ش� �����带 �������� ���� ���� submit()�� ���� �����ʰ� �����Ѵ�. �׷��Ƿ� submit������ϴ� �� �� ����.
			// executorService.execute(runnable);

			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}

		}
        // ������ Ǯ�� �����Ŵ (�� �۾�ť�� �ִ� ��� �۾��� ó�����Ŀ� ������Ǯ�� �����Ų��.
		executorService.shutdown();

	}

}
