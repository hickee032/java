package sec_verify05;

public class ExecuteThread extends Thread {

	private boolean stop;
	int i = 1;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(1000);
				System.out.println("������ >> i���� ��ȭ :" + (i++));
			} catch (InterruptedException e) {}
			
		}
		System.out.println("���� ����");

	}

}
