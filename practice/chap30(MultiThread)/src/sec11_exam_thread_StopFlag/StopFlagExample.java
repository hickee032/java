package sec11_exam_thread_StopFlag;

public class StopFlagExample {

	public static void main(String[] args) throws Exception {
		PrintThread printThread = new PrintThread();
		printThread.start();

		// 메인스레드 1초 정지후 PrintThread를 stop플래그로 정상 종료 유도
		// 실제로 현업에서는 스레드를 중지할때 스레드를 일시정지로 만들어서 종료하는 방법은 사용하지 않는 다.
		Thread.sleep(1000);

		printThread.setStop(true);

	}

}
