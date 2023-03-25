package sec11_exam_thread_StopFlag;

public class PrintThread extends Thread {

	private boolean stop; // stop플래그 변수 선언

	public void setStop(boolean stop) {
		this.stop = stop;

	}

	@Override
	public void run() {
		// 외부에서 stop을 setter를 호출 하면 true로 설정하면 무한 루프에서 나온다.
		while (!stop) {
			System.out.println(Thread.currentThread().getName() + " : 실행중");
		}
		System.out.println("시스템 자원 정리 완료");
		System.out.println(Thread.currentThread().getName() + " : 스레드 종료");
	}
}
