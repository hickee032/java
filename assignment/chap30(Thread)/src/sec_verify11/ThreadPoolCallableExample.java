package sec_verify11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolCallableExample {

	public static void main(String[] args) {

		createThreadPool();

	}

	static ExecutorService createThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		SumThread sumT = new SumThread();
		executorService.submit(sumT);

		executorService.shutdown();

		return executorService;
	}

}
