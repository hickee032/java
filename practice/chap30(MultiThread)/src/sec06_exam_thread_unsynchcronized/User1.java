package sec06_exam_thread_unsynchcronized;

public class User1 extends Thread {

	// ������ü ����
	private Calculator cal;

	public void setCal(Calculator cal) {
		this.cal = cal;

		this.setName("User-1"); // ������ �̸� ����
	}

	@Override
	public void run() {
		this.cal.print();
		//���� ��ü�� �ʵ��� memory���� 100���� ����
		this.cal.setMemory(100);
		
	}

}