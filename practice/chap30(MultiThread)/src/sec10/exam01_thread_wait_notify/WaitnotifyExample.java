package sec10.exam01_thread_wait_notify;

public class WaitnotifyExample {

	public static void main(String[] args) {

		WorkObject sharedObjects = new WorkObject();
		
		//�����ڵ忡 ���� notify()�� wait()�� ȣ���ϰ� ����ȭ �޼���� �Ǿ��־� ������ ����� 
		ThreadA threadA = new ThreadA(sharedObjects);
		ThreadB threadB = new ThreadB(sharedObjects);
		
		threadA.start();
		threadB.start();
		//�ٽ��ѹ� ���������� wait() notify() notifyAll()�� objectŬ������ �޼����̸� ���� ����ȭ synchronized
		//�� ����ȭ �������� ��밡��
		//�׸��� synchronized �����ڰ� �پ��ִ� �޼��峪 ������ wait() notify() notifyAll()ȣ�� �ϸ� ��Ÿ�� ���ܰ� �߻��ϹǷ� 
		//���� �ϵ��� �Ѵ�.

	}

}
