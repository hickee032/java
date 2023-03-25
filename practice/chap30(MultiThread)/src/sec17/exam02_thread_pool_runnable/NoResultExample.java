package sec17.exam02_thread_pool_runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class NoResultExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		// Runnable�͸� ���� ��ü ����(�۾� ��ü) -->���ϰ��� ����
		System.out.println("[�۾� ó�� ��û]");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("[�۾� ó�� ���]" + sum);

			}
		};
		//�۾� ť�� �۾��� �ִ� ���� (submit Runnable�� ���� ���� ���� ������
		Future<?> future = executorService.submit(runnable);
		
		try {
			Object obj = future.get();
			
			System.out.println("�۾� ó���Ϸ�");
			System.out.println("future.get()�� ���� �Ѱ�"+obj);
		} catch (Exception e) {
			
		}
		executorService.shutdown();
		
	

	}

}
