package sec17.exam04_thread_pool_external_objects;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExturnalObjectExample {

	public static void main(String[] args) throws Exception {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[�۾�ó�� ��û]");

		class Task implements Runnable {

			Result result;

			public Task(Result result) {
				this.result = result;

			}

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				// �����忡�� ���Ȱ��� �ܺΰ�ü result�� addValue()�� ȣ�� �Ͽ� accumValue�� �����ϰ� �ִ�.
				this.result.addValue(sum);
				System.out
						.println("���� ���� ������ �̸� : " + Thread.currentThread().getName() + "\n�۾���� : " + this.result.getValue());
			}
		}
	
		Result result = new Result(); // ������ü ����

		// �۾� ��ü ����
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);

		// �۾� ��û(�۾�ť�� �ִ´�.)
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		Future<Result> future3 = executorService.submit(task1, result);
		Future<Result> future4 = executorService.submit(task2, result);
		Future<Result> future5 = executorService.submit(task1, result);
		Future<Result> future6 = executorService.submit(task2, result);

		result = future1.get();
		Thread.sleep(1000);
		result = future2.get();
		Thread.sleep(1000);
		result = future3.get();
		Thread.sleep(1000);
		result = future4.get();
		Thread.sleep(1000);
		result = future5.get();
		Thread.sleep(1000);
		result = future6.get();
		Thread.sleep(1000);

		System.out.println("[�۾� ó�� ���] " + result.accumValue);
		System.out.println("[�۾� ó�� �Ϸ�]");

		System.out.println("���� ���� ������ �̸� : " + Thread.currentThread().getName());
		
		executorService.shutdown();

	}
}
