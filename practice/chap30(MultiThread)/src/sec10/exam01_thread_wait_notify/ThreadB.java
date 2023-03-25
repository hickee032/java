package sec10.exam01_thread_wait_notify;

public class ThreadB extends Thread {
	//공유객체선언
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {

		this.workObject = workObject;

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			workObject.methodB();

		}
		System.exit(0);
	}

}
