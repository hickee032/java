package sec17.exam03_thread_pool_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultBycallable {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("�۾� ó�� ��û");
		Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum; //�ڵ� �ڽ�

			}
		};

		/*
		 * ���ϰ���<T> �Ͽ� Future<T> submit(callable task) ���� �۾��� �Ϸ� �ɶ����� ��ŷ �� ��ٸ� Future��
		 * ���� �Ϸ� ��ü Future ���� <T>Ÿ��
		 */
		Future<Integer> future = executorService.submit(callable);
		try {
			int value = future.get(); // ��ŷ�� �Ͼ�� �ڵ� ��ڽ�
			System.out.println("�۾� ó�� ���" + value);
			System.out.println("�۾� ó�� �Ϸ�");
		} catch (InterruptedException | ExecutionException e) {
			executorService.shutdown();
		}
	}

}
