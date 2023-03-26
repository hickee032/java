package sec_verify10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample2 {

	public static void main(String[] args) {

		createThreadPool();

	}

	static ExecutorService createThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		GugudanThread g = new GugudanThread();
		for
		Runnable r = new Runnable() {

			@Override
			public void run() {

				g.run();
			}
		};

		executorService.submit(r);

		executorService.shutdown();
		
		return null;

	}
}
