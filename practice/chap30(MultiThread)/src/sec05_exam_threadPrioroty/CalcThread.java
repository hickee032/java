package sec05_exam_threadPrioroty;

public class CalcThread extends Thread {

	long sum;

	// �ܺη� ���� �̸��� ���� �޾� ����
	public CalcThread(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 2000000000; i++) {
			sum += i;
		}
		System.out.println("�۾��� ��ģ ������ - " + this.getName());
		System.out.println("�հ� - " + this.sum);
	}
}
