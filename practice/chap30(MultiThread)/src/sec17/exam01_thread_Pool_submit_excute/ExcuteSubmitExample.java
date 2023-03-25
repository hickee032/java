package sec17.exam01_thread_Pool_submit_excute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExcuteSubmitExample {

	public static void main(String[] args) {
		// 자신의 코어수 만큼 스레드생성
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("생성된 스레드 개수 : " + Runtime.getRuntime().availableProcessors());
		// 20개의 작업 개체 생성.
		for (int i = 0; i < 20; i++) {

			Runnable runnable = new Runnable() {

				@Override
				public void run() {

					// newFixedThreadPool과 newCachedThreadPool은 내부적으로
					// ThreadPoolExecutor로만들어 졌기 때문에 타입변환으로
					// ThreadPoolExecutor객체를 얻을수 있다.
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

					// 현재 스레드풀에 있는 스레드 개수를 리턴하여 얻을수 있다.
					int poolsize = threadPoolExecutor.getPoolSize();
					// 작업실행하는 스레드명을 얻는다.

					String threadName = Thread.currentThread().getName();
					// System.out.println("작업 처리-" + threadName);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}

					System.out.println("[총 스레드 개수 : " + poolsize + "] [작업스레드 이름 : " + threadName + "]");
					// 일부러 예외를 발생시켜서 execute()와 submit()의 차이를 보자.

					try {
						int value = 10 / 0;
						// System.out.println("try");
					} catch (Exception e) {
						System.out.println("catch");
					}

				}
			};

			// 작업큐에 runnable객체를 넣는 행위 excute()는 작업처리 도중에 에외가 발생하면
			// 해당 스레드를 제거한후 새로 생성 submit()는 제거 하지않고 재사용한다. 그러므로 submit을사용하는 게 더 좋다.
			// executorService.execute(runnable);

			executorService.submit(runnable);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
			}

		}
        // 스레드 풀을 종료시킴 (단 작업큐에 있는 모든 작업을 처리한후에 스레드풀을 종료시킨다.
		executorService.shutdown();

	}

}
