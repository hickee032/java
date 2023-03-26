package sec_verify03;

public class BombThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				if (i == 5) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Æã");
			}
		}

	}

}
