package sec_verify01;

public class MovieThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("�������� ����մϴ�.");
			try {
				Thread.sleep(400);
			} catch (Exception e) {

			}

		}
	}
}
