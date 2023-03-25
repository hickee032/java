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

		// 실패 callback()
		@Override
		public void failed(Throwable exc, Void attachment) {

			System.out.println("[failed()실행됨]" + " 예외값 : " + exc.toString());
		}

		// 완료 callback()
		@Override
		public void completed(Integer result, Void attachment) {
			System.out.println("[completed()실행됨]" + " 결과값 : " + result);
		}
	};

	// 작업객체 생성
	public void doWork(String x, String y) {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;

					System.out.println("실행중 Thread명" + Thread.currentThread().getName());
					callback.completed(result, null);
				} catch (Exception e) {
					callback.failed(e, null);
				}
			}
		};
		// 작업 큐에 저장
		executorService.submit(runnable);
	}

	public void finish() {
		this.executorService.shutdown();
		System.out.println("Thread Pool 종료");
	}
}
