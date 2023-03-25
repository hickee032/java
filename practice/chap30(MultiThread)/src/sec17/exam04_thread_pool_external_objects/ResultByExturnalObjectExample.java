package sec17.exam04_thread_pool_external_objects;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByExturnalObjectExample {

	public static void main(String[] args) throws Exception {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업처리 요청]");

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
				// 스레드에서 계산된값을 외부객체 result에 addValue()를 호출 하여 accumValue에 누적하고 있다.
				this.result.addValue(sum);
				System.out
						.println("현재 실행 스레드 이름 : " + Thread.currentThread().getName() + "\n작업결과 : " + this.result.getValue());
			}
		}
	
		Result result = new Result(); // 공유객체 생성

		// 작업 객체 생성
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);

		// 작업 요청(작업큐에 넣는다.)
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

		System.out.println("[작업 처리 결과] " + result.accumValue);
		System.out.println("[작업 처리 완료]");

		System.out.println("현재 실행 스레드 이름 : " + Thread.currentThread().getName());
		
		executorService.shutdown();

	}
}
