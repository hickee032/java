package sec12.sec12_exam02_thread_interrupt;

public class CountThread extends Thread {

	@Override
	public void run() {
		int i = 10;
		while (true) {
			System.out.println("카운트 다운 - " + i--);

			// 인터럽트가 호출 되었는 지 확인하는 조건문 필수이다.
			if (Thread.interrupted()) { // 인터럽트를 누가 외쳤나?
				System.out.println("인터럽트 메서드 호출됨");
				break;
			}

			// 스레드가 너무 빨리 돌아가니까 일부러 시간을 지연
			for (long x = 0; x < 2100000000; x++) {
			}

		}
		System.out.println("카운트가 종료되었어~~~");
	}
}
