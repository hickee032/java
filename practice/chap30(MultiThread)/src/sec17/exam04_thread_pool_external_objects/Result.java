package sec17.exam04_thread_pool_external_objects;

//���� ��ü
//submit(runnable, V result) ����ϱ� ���� ���� ��ü
public class Result {

	int accumValue;

	// ������ü�̱� ������ ����ȭ�� �ʼ��̴�. synchronized --> �ŷڼ�
	public synchronized void addValue(int value) {
		this.accumValue += value;

	}

	public synchronized int getValue() {
		return this.accumValue;

	}

}
