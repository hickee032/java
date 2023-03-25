package sec10.exam01_thread_wait_notify;

public class WorkObject {

	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() ����");
		notify(); // wait(�Ͻ�����) ���·� �Ǿ��ִ� �����带 ���� ��� ���·� �����.
		try {
			wait(); // wait()�� ȣ���� ������� ������ ����Ǳ� ���·� ���ư��� ���Ѵ�.
		} catch (InterruptedException e) {
		}
	}

	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() ����");
		notify(); // wait(�Ͻ�����) ���·� �Ǿ��ִ� �����带 ���� ��� ���·� �����.
		try {
			wait(); // wait()�� ȣ���� ������� ������ ����Ǳ� ���·� ���ư��� ���Ѵ�.
		} catch (InterruptedException e) {
		}

	}
}
