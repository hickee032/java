package sec_verify01;

public class ThreadExample {

	public static void main(String[] args) {

		RecordingRunnable RR = new RecordingRunnable();
		Thread thread = new MovieThread();
		Thread thread2 = new Thread(RR);
		thread.start();
		thread2.start();

	}

}
