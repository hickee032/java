package sec07_exam_thread_state;

public class TreadStateExample {

	public static void main(String[] args) {
		Thread thread = new StatePrintThread(new TargetThread());
		thread.start();

	}

}
