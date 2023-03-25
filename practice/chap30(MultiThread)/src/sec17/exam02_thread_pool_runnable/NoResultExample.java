package sec17.exam02_thread_pool_runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class NoResultExample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		// Runnable익명 구현 객체 생성(작업 객체) -->리턴값이 없음
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("[작업 처리 결과]" + sum);

			}
		};
		//작업 큐에 작업을 넣는 행위 (submit Runnable는 리턴 값이 없기 때문에
		Future<?> future = executorService.submit(runnable);
		
		try {
			Object obj = future.get();
			
			System.out.println("작업 처리완료");
			System.out.println("future.get()이 리턴 한값"+obj);
		} catch (Exception e) {
			
		}
		executorService.shutdown();
		
	

	}

}
