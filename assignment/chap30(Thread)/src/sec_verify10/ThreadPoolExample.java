package sec_verify10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {

		createThreadPool();

	}

	static ExecutorService createThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		GugudanThread g = new GugudanThread();
		
		System.out.println("[������]" + "\n���ϴ� �������� �Է��ϼ���");
		
		for (int i = 0; i < 4; i++) {

			Runnable r = new Runnable() {

				@Override
				public void run() {

					g.run();
				}
			};
			executorService.submit(r);
		}
		executorService.shutdown();

		return null;

	}
}
