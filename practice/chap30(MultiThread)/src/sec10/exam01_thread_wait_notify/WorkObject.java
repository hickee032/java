package sec10.exam01_thread_wait_notify;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 실행");
		notify(); // wait(일시정시) 상태로 되어있는 스레드를 실행 대기 상태로 깨운다.
		try {
			wait(); // wait()를 호출한 스레드는 스스로 실행되기 상태로 돌아가지 못한다.
		} catch (InterruptedException e) {
		}
	}

	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 실행");
		notify(); // wait(일시정시) 상태로 되어있는 스레드를 실행 대기 상태로 깨운다.
		try {
			wait(); // wait()를 호출한 스레드는 스스로 실행되기 상태로 돌아가지 못한다.
		} catch (InterruptedException e) {
		}

	}
}
