package sec04_exam_ThreadName;

public class ThreadB extends Thread {

	public ThreadB() {
		this.setName("ThreadB"); //������ �� ����
	}
	
	@Override
	public void run() {
	System.out.println("[���� ������ ������ ��] - "+this.getName());
	for (int i = 0; i < 2; i++) {
		//�������� �̸��� ��� ���
			/*
			 * 1.�����޼��� Thread.currentThread().getName();
			 *  2.�ν��Ͻ� �޼��� this.getName();
			 */
		System.out.println(this.getName()+"�� ����� ���� - "+ i);
	}
	}
	
}

