package sec17.exam03_thread_pool_callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultBycallable {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("작업 처리 요청");
		Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum; //자동 박싱

			}
		};

		/*
		 * 리턴값이<T> 하여 Future<T> submit(callable task) 선택 작업이 완료 될때까지 블리킹 즉 기다림 Future는
		 * 지연 완료 객체 Future 역시 <T>타입
		 */
		Future<Integer> future = executorService.submit(callable);
		try {
			int value = future.get(); // 블러킹이 일어난후 자동 언박싱
			System.out.println("작업 처리 결과" + value);
			System.out.println("작업 처리 완료");
		} catch (InterruptedException | ExecutionException e) {
			executorService.shutdown();
		}
	}

}
