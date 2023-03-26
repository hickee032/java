package sec_verify09;

public class UnitThread extends Thread {

	public UnitThread(ThreadGroup threadGroup, String name) {
		super(threadGroup, name);
	}

	@Override
	public void run() {
		String str = Thread.currentThread().getThreadGroup().getName();
		System.out.println("���� �������� Thread�� : " + Thread.currentThread().getName() + "\t\t�׷� Thread�� : " + str + "\t\t���� Thread�� : "
				+ getThreadGroup().getParent().getName());

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(this.getName() + "interrupted!!");
				System.out.println(this.getName() + "�����");
				break;
			}
		}
	}
}
