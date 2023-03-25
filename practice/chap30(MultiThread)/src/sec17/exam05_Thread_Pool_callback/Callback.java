package sec17.exam05_Thread_Pool_callback;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Callback {

	private ExecutorService executorService;

	public Callback() {
		this.executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {

		// ���� callback()
		@Override
		public void failed(Throwable exc, Void attachment) {

			System.out.println("[failed()�����]" + " ���ܰ� : " + exc.toString());
		}

		// �Ϸ� callback()
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("[completed()�����]" + " ����� : " + result);
		}
	};

	// �۾���ü ����
	public void doWork(String x, String y) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;

					System.out.println("������ Thread��" + Thread.currentThread().getName());
					callback.completed(result, null);
				} catch (Exception e) {
					callback.failed(e, null);
				}
			}
		};
		// �۾� ť�� ����
		executorService.submit(runnable);
	}

	public void finish() {
		this.executorService.shutdown();
		System.out.println("Thread Pool ����");
	}
}
