package sec10_exam01_thread_interrupt;

public class InterruptExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}

		printThread.interrupt();
	}

}
