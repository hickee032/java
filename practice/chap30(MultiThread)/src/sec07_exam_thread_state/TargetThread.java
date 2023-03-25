package sec07_exam_thread_state;

//스레드의 상태를 알아보기 위한 클래스
public class TargetThread extends Thread {

	@Override
	public void run() {
		// 20억번 루핑, 실행대기 (Runnable)와 실행 상태를 반복
		for (long i = 0; i < 2000000000; i++) {
		}
		// 일시정지(TIMED_WATING)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		for (long i = 0; i < 2000000000; i++) {
		}
	}// 종료 (TERMINATED)
}
