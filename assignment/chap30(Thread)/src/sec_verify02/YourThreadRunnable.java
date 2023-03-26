package sec_verify02;

public class YourThreadRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("YourThread");
			try {
				Thread.sleep(300);
			} catch (Exception e) {

			}
		}

	}

}
