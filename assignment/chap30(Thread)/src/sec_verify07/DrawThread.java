package sec_verify07;

public class DrawThread extends Thread {

	@Override
	public void run() {
		
			try {
				while (true) {
				Thread.sleep(1);
				System.out.println("�׸� �׸��� ��");
				}
				} catch (InterruptedException e) {}

		
		System.out.println("interrupt()ȣ�� ��");
		System.out.println("������ �ڿ� ����");
		System.out.println("������ �ڿ� ����");
	}
}

