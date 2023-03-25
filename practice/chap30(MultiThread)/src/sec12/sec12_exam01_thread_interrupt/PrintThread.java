package sec12.sec12_exam01_thread_interrupt;

public class PrintThread extends Thread {

	@Override
	public void run() {
		// 아래는 일부러 일시정지 상태로 만든것이다. 실전에서는 이런 코딩은 없다. 일시정지로 만들지 않고 종료 하도록하자.
		try {
			while (true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}

		} catch (InterruptedException e) {

			System.out.println("예외 발생");
			System.out.println("interrupt()호출됨");
		}
		System.out.println("시스템 자원 정리 완료");
		System.out.println("스레드 종료");
	}
}

//결과론적으로 스레드의 무한루프를 종료하기 위해서는 가장 좋은 방법은 interrupt()를 이용하는 것이 이상적이다. 
//일시정지에 있건 없건 정상적으로 종료하는 방법중 가장 널리 이용된다.
