package sec14_exam01_thread_group;

public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("�۾� ���� ����");
	}

	@Override
	public void run() {
		// 1�� ������ ���̺�
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			this.save();
		}
	}
}
