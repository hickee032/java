package sec08_exam_thread_yield;

public class YieldExample {

	public static void main(String[] args) {

		ThreadA threadA = new ThreadA(); // 우선순위 Nomal = 5
		ThreadB threadB = new ThreadB(); // 우선순위 Nomal = 5

		threadA.start();
		threadB.start();

		// 3초동안은 번갈아 실행하다가 이후 ThreadA를 yield()호출함으로서 ThreadB만 실행
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		// 우선순위가 같거나 높을때만 yield()를 적용 하게끔 되어있으나 그렇지 않아 보인다.
		// threadB.setPriority(Thread.MIN_PRIORITY);
		threadA.work = false;

		// 3초동안은 번갈아 실행하다가 이후 ThreadB를 yield()호출함으로서 ThreadA만 실행
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		threadA.work = true;
		threadB.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		threadA.stop = true;
		threadB.stop = true;

	}

}
