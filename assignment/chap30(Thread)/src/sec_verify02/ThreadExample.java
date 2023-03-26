package sec_verify02;

public class ThreadExample {

	public static void main(String[] args) {

		Thread thread = new MyThread();

		Runnable RThread = new YourThreadRunnable();
		Thread thread2 = new Thread(RThread);
		thread.start();
		thread2.start();

	}

}
