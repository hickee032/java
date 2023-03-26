package sec_verify09;

public class UnitThread extends Thread {

	public UnitThread(ThreadGroup threadGroup, String name) {
		super(threadGroup, name);
	}

	@Override
	public void run() {
		String str = Thread.currentThread().getThreadGroup().getName();
		System.out.println("현재 실행중인 Thread명 : " + Thread.currentThread().getName() + "\t\t그룹 Thread명 : " + str + "\t\t조상 Thread명 : "
				+ getThreadGroup().getParent().getName());

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(this.getName() + "interrupted!!");
				System.out.println(this.getName() + "종료됨");
				break;
			}
		}
	}
}
