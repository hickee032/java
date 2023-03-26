package sec_verify00;

public class ThreadExample {

	public static void main(String[] args) {
		TestThread thread = new TestThread();
		thread.start();

		System.out.println("-------------------------");
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + "번째 Test스레드의 실행내용입니다.");
				}
				System.out.println("Test스레드가 종료됩니다.");
			}
		};
		threadA.start();
		
	}

}
