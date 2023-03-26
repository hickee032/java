package sec_verify01;

public class RecordingRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("녹화를 진행합니다.");
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				
			}
		}
		

	}

}
