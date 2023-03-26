package sec_verify03;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new NumberThread();
		Thread thread1 = new BombThread();
		thread.start();
		thread1.start();

	}

}
