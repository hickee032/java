package sec15_exam02_Thread_Group;

public class WorkThread extends Thread {
	// 생성자 (조상클래스 그룹, 자신의 스레드 이름)
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		// 현재 실행되고 있는 스레드 그룹

		// ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		// String str = mainGroup.getName();

		// 현재 실행중인 스레드 그룹의 이름을 얻는 다.
		String str = Thread.currentThread().getThreadGroup().getName();
		System.out.println("Thread명 : " + Thread.currentThread().getName() + " ThreadGroup명 : " + str);

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName() + " : interrupt 호출됨");
				break;
			}
		}
		System.out.println(this.getName() + " : 종료됨");
	}

}
