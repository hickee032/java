package sec04_exam_ThreadName;

public class ThreadNameExample {

	public static void main(String[] args) {
		//���� �������� �����带 ��� ���
		Thread thread = Thread.currentThread();
		
		//�������� �̸��� ��� ���
		String curThreadName = thread.getName();
		System.out.println("[���� ������]- "+curThreadName);
		
		Thread threadA = new ThreadA();
		System.out.println("[ThreadA�� ������ ������ �̸�]- "+Thread.currentThread().getName());
		System.out.println("[main�����尡 ThreadA�� �̸��� �����°�]- "+threadA.getName());
		threadA.start();
		
		Thread threadB = new ThreadB();
		System.out.println("[ThreadA�� ������ ������ �̸�]- "+Thread.currentThread().getName());
		System.out.println("[main�����尡 ThreadB�� �̸��� �����°�]- "+threadB.getName());
		threadB.start();
		System.out.println("[main()�� ������ ������ �̸�]- "+Thread.currentThread().getName());
		/*
		 * ����Ұ��� ���� �ڵ�� ���ν����尡 �����ϴ� ���̴�. �ƿ﷯ ThreadA�� ThreadB�� �����Ѱ� ���õ� ���ν������̴�. 
		 * ���� ThreadA�� ThreadB�� �ϴ� �۾��� run�޼��忡 �ڵ��Ǿ� �ִ� ���븸 �����ϴ� �ͻ��̴�. 
		 * �� �κ��� ���� ���� �ʵ��� �ؾ��Ѵ�.
		 */

	}

}
