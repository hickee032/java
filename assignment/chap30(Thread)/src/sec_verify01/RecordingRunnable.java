package sec_verify01;

public class RecordingRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("��ȭ�� �����մϴ�.");
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				
			}
		}
		

	}

}
