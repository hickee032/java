package sec06_exam_thread_unsynchcronized;

//������ü
public class Calculator {
	private int memory;
	int value = 100;

	public int getMemory() {
		return memory;
	}

	// �񵿱�ȭ �޼��� -->����ȭ�� ����� ��� �������� �ŷڼ��� ����ȴ�. --> synchronized
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		// 2�ʰ� �Ͻ����� (TIMED_WAITING)
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		//// ���� �������� ������ �̸��� memory�� ���
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	//�񵿱�ȭ �޼��� 
	public void print() {
		System.out.println(Thread.currentThread().getName()+" value�� :" + this.value);
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
