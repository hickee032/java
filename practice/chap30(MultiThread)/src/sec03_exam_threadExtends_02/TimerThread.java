package sec03_exam_threadExtends_02;

public class TimerThread extends Thread {

	@Override
	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("남은 시간" + i);
			
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {

			}
		}
	}
}
