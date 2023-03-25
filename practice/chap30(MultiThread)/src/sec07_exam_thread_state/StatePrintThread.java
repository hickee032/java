package sec07_exam_thread_state;

public class StatePrintThread extends Thread {

	// 스레드의 상태를 알아보기 위해 멤버로 TargetThread를 선언
	private TargetThread targetThread;

	public StatePrintThread(TargetThread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			//TargetThread의 상태 정보를 얻는다.
			//Thread.State는 Thread클래스의 내부 클래스 이며 Enum(열거)타입이다.
			Thread.State state = targetThread.getState();
			System.out.println("TargetThread 상태 : " + state);

			// targetThread가 생성되었나 물어보고 생성되었으면 run()하라
			if (state == Thread.State.NEW) {
				targetThread.start();
			}
			// targetThread가 종료되었나 물어보고 종료되었으면 run()하라
			if (state == Thread.State.TERMINATED) {
				break;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}
}
