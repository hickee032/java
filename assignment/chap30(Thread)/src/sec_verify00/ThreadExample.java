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
					System.out.println(i + "��° Test�������� ���೻���Դϴ�.");
				}
				System.out.println("Test�����尡 ����˴ϴ�.");
			}
		};
		threadA.start();
		
	}

}
